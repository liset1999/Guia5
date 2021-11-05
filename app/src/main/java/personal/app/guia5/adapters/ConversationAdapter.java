package personal.app.guia5.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import personal.app.guia5.R;
import personal.app.guia5.model.ConversationModel;
import personal.app.guia5.viewHolders.ConversationListViewHolder;

public class ConversationAdapter extends RecyclerView.Adapter<ConversationListViewHolder> {

    List<ConversationModel> lstConversations;

    public ConversationAdapter(List<ConversationModel> lstConversations) {
        this.lstConversations = lstConversations;
    }

    @NonNull
    @Override
    public ConversationListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_conversations, parent, false);
        return new ConversationListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ConversationListViewHolder holder, int position) {
        holder.getImgContact().setImageResource(lstConversations.get(position).getImgContact());
        holder.getTvName().setText(lstConversations.get(position).getName());
        holder.getTvMessage().setText(lstConversations.get(position).getMessage());
        holder.getTvTime().setText(lstConversations.get(position).getTime());
    }

    @Override
    public int getItemCount() {
        return this.lstConversations.size();
    }
}
