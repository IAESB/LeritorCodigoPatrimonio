package br.edu.fasb.leritorcodigopatrimonio;

import android.app.Activity;
import android.content.Intent;
import android.os.Environment;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.unnamed.b.atv.model.TreeNode;
import com.unnamed.b.atv.view.AndroidTreeView;

import java.io.File;
import java.util.ArrayList;

import br.edu.fasb.leritorcodigopatrimonio.bean.Localizacao;
import br.edu.fasb.leritorcodigopatrimonio.model.LocalizacaoModel;
import br.edu.fasb.leritorcodigopatrimonio.view.IconTreeItemHolder;


public class MainActivity extends ActionBarActivity {
    TreeNode root;
    TreeNode treeNodeSelecionada;
    ArrayList<View> viewArrayList = new ArrayList<>();
    LocalizacaoModel model;
    private String dirStorageFiles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dirStorageFiles =  Environment.getExternalStoragePublicDirectory("Pictures/LeitorCodigoPatrimonio").getAbsolutePath();

        model = new LocalizacaoModel();
        root = TreeNode.root();
        preencheArvore();

        AndroidTreeView tView = new AndroidTreeView(this, root);
        FrameLayout layout = (FrameLayout) findViewById(R.id.layout_lista);
        layout.addView(tView.getView());
        //tView.expandAll();

        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(treeNodeSelecionada == null)
                    return;
                Intent it = new Intent(MainActivity.this, LeitorCodigoActivity.class);
                it.putExtra("loc", ((IconTreeItemHolder.IconTreeItem)treeNodeSelecionada.getValue()).localizacao);
                it.putExtra("dirStorageFiles", dirStorageFiles);
                startActivityForResult(it, 2);
                ((CheckBox)treeNodeSelecionada.getViewHolder().getView().findViewById(R.id.checkbox)).setChecked(true);
            }
        });
    }

    private void insertFilhos(TreeNode parent, Localizacao localizacao, int padinLeft){
        padinLeft+=15;
        for(Localizacao filho: localizacao.getFilhos()){
            IconTreeItemHolder.IconTreeItem nodeItem = new IconTreeItemHolder.IconTreeItem();
            nodeItem.localizacao = filho;
            nodeItem.padinLeft = padinLeft;
            TreeNode node = new TreeNode(nodeItem).setViewHolder(new IconTreeItemHolder(this));
            parent.addChild(node);
            insertFilhos(node, filho, padinLeft);
            setaCheckBox(node.getViewHolder().getView(), filho);

            viewArrayList.add(node.getViewHolder().getView());
            node.setClickListener(new TreeNode.TreeNodeClickListener() {
                @Override
                public void onClick(TreeNode treeNode, Object o) {
                    selecionaLocalizaco(treeNode.getViewHolder().getView());
                    treeNodeSelecionada = treeNode;
                }
            });
        }
    }

    private void setaCheckBox(View view, Localizacao loc) {
        File file = new File(dirStorageFiles+"/"+loc.getId()+".csv");
        if(file.exists())
            ((CheckBox)view.findViewById(R.id.checkbox)).setChecked(true);
    }

    private void preencheArvore()
    {
        Localizacao localizacao = new Localizacao(0,0,"",model.getLocalizacoesVec());
        insertFilhos(root, localizacao, 18);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        /*if (id == R.id.action_settings) {
            Intent intent = new Intent(Intent.ACTION_CREATE_SHORTCUT);
            intent.addCategory(Intent.CATEGORY_OPENABLE);
            intent.setType("/*");
            startActivityForResult(intent, 1);
        }*/

        return true;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1 && resultCode == Activity.RESULT_OK) {
            Log.d("NewGalleryActivity", String.format("Open Directory result Uri : %s", data.getData()));
            dirStorageFiles = data.getDataString();
        }

    }

    private void deselecionaTodosLocais(){
        if(treeNodeSelecionada!=null)
            ((ImageView)treeNodeSelecionada.getViewHolder().getView().findViewById(R.id.imagem)).setImageResource(R.drawable.abc_btn_radio_to_on_mtrl_000);
        /*for(View v: viewArrayList){
            ImageView image = (ImageView) v.findViewById(R.id.imagem);
            image.setImageResource(R.drawable.abc_btn_radio_to_on_mtrl_000);
        }*/
    }

    public void selecionaLocalizaco(View view) {
        deselecionaTodosLocais();
        ImageView image = (ImageView) view.findViewById(R.id.imagem);
        image.setImageResource(R.drawable.abc_btn_radio_to_on_mtrl_015);
    }
}
