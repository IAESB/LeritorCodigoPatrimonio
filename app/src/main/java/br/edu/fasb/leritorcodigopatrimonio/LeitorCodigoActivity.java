package br.edu.fasb.leritorcodigopatrimonio;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Environment;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.google.zxing.integration.android.IntentIntegrator;

import java.util.ArrayList;

import br.edu.fasb.leritorcodigopatrimonio.bean.Estado;
import br.edu.fasb.leritorcodigopatrimonio.bean.Localizacao;
import br.edu.fasb.leritorcodigopatrimonio.bean.Objeto;
import br.edu.fasb.leritorcodigopatrimonio.model.LocalizacaoModel;


public class LeitorCodigoActivity extends ActionBarActivity {
    String dirStorageFiles;
    Localizacao localizacao;
    LocalizacaoModel model;
    private ArrayAdapter<String> adapter;
    private ArrayList<String> arrayList;
    private Configuration config;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leitor_codigo);
        localizacao = (Localizacao) getIntent().getSerializableExtra("loc");
        dirStorageFiles = getIntent().getStringExtra("dirStorageFiles");
        model = new LocalizacaoModel();

        arrayList = new ArrayList<>();
        TextView txtview = (TextView)findViewById(R.id.textView);
        txtview.setText(localizacao.getNome());
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,arrayList);
        ListView list = (ListView) findViewById(R.id.listView);
        list.setAdapter(adapter);
        list.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, final int position, long id) {
                DialogInterface.OnClickListener dialogClickListener = new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        switch (which){
                            case DialogInterface.BUTTON_POSITIVE:
                                localizacao.getObjetos().remove(position);
                                arrayList.remove(position);
                                adapter.notifyDataSetChanged();
                                break;

                            case DialogInterface.BUTTON_NEGATIVE:
                                break;
                        }
                    }
                };
                AlertDialog.Builder builder = new AlertDialog.Builder(LeitorCodigoActivity.this);
                builder.setMessage(R.string.confirma_remocao_item_msg).setPositiveButton(R.string.sim, dialogClickListener)
                        .setNegativeButton(R.string.nao, dialogClickListener).show();
                return false;
            }
        });


        Button maisUm = (Button)findViewById(R.id.mais_um);
        maisUm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IntentIntegrator intent = new IntentIntegrator(LeitorCodigoActivity.this);
                intent.setOrientationLocked(true);
                intent.initiateScan();
            }
        });

        ((Button)findViewById(R.id.salvar)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                salvarArquivoCsv();
            }
        });

        lerArquivoCsv();
    }

    public void lerArquivoCsv()
    {
        try {
            model.inportCsv(localizacao, dirStorageFiles);
            for(Objeto objeto: localizacao.getObjetos()){
                addObjetoListView(objeto);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void salvarArquivoCsv(){
        try {
            model.exportCsv(localizacao, dirStorageFiles);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void onConfigurationChanged(Configuration newConfig) {

    }

    @Override
    protected void onDestroy(){
        salvarArquivoCsv();
        Intent resultIntent = new Intent();
        resultIntent.putExtra("numObj", localizacao.getObjetos().size());
        setResult(Activity.RESULT_OK, resultIntent);
        finish();
        Log.w("LeitorCodigoActivity", "Active destoryed");
        super.onDestroy();
    }

    @Override
    protected void onStop() {
        Log.w("LeitorCodigoActivity", "Active stopped");
        super.onStop();
    }



    public void onActivityResult(int requestCode, int resultCode, Intent intent) {
        if(intent == null)
            return;

        final String contents = intent.getStringExtra("SCAN_RESULT");
        String format = intent.getStringExtra("SCAN_RESULT_FORMAT");

        CharSequence colors[] = new CharSequence[] {"Novo",
                "Ótimo",
                "Bom",
                "Regular",
                "Ruim",
                "Péssimo",
                "Inútilizado"};
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Pick a color");
        builder.setItems(colors, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Estado estado = Estado.values()[which];
                Objeto objeto = new Objeto(contents, localizacao, estado);
                localizacao.getObjetos().add(objeto);
                addObjetoListView(objeto);
            }
        });
        builder.show();
    }

    private void addObjetoListView(Objeto objeto){
        ListView listView = (ListView)findViewById(R.id.listView);
        adapter.add(objeto.getEtiqueta() + " - " + objeto.getEstado());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_leitor_codigo, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement


        return super.onOptionsItemSelected(item);
    }
}
