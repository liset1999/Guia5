package personal.app.guia5.viewHolders;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import personal.app.guia5.R;

public class ConversationListViewHolder extends RecyclerView.ViewHolder {

    ImageView imgContact;
    TextView tvName, tvMessage, tvTime;

    public ConversationListViewHolder(@NonNull View itemView) {
        super(itemView);

        imgContact   = (ImageView) itemView.findViewById(R.id.ivContact);
        tvName      = (TextView) itemView.findViewById(R.id.tvName);
        tvMessage  = (TextView) itemView.findViewById(R.id.tvMessage);
        tvTime  = (TextView) itemView.findViewById(R.id.tvTime);
    }
    public ImageView getImgContact() {
        return imgContact;
    }

    public TextView getTvName() {
        return tvName;
    }

    public TextView getTvMessage() {
        return tvMessage;
    }

    public TextView getTvTime() {
        return tvTime;
    }
}
