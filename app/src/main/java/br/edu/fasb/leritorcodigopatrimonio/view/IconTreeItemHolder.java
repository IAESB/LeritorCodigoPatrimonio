package br.edu.fasb.leritorcodigopatrimonio.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.unnamed.b.atv.model.TreeNode;

import br.edu.fasb.leritorcodigopatrimonio.MainActivity;
import br.edu.fasb.leritorcodigopatrimonio.R;
import br.edu.fasb.leritorcodigopatrimonio.bean.Localizacao;

public class IconTreeItemHolder extends TreeNode.BaseNodeViewHolder<IconTreeItemHolder.IconTreeItem> {
    public IconTreeItemHolder(Context context) {
        super(context);
    }

    @Override
    public View createNodeView(TreeNode node, IconTreeItem value) {
        final LayoutInflater inflater = LayoutInflater.from(context);
        final View view = inflater.inflate(R.layout.localizacao, null, false);
        view.setPadding(value.padinLeft, 0, 0, 0);
        TextView tvValue = (TextView) view.findViewById(R.id.texto);
        tvValue.setText(value.localizacao.getNome());

        return view;
    }
    public static class IconTreeItem {
        public int padinLeft;
        public Localizacao localizacao;
    }
}