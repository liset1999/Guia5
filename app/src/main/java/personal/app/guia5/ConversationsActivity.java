package personal.app.guia5;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import personal.app.guia5.adapters.ConversationAdapter;
import personal.app.guia5.model.ConversationModel;

public class ConversationsActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ConversationAdapter conversationsAdapter;
    public static List<ConversationModel> lstConversations;
    LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversations);

        if(getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        lstConversations = new ArrayList<ConversationModel>();

        lstConversations.add(
                new ConversationModel(
                        R.drawable.android_kotlin,
                        "David Garcia, Rich...",
                        "See you guys soon!",
                        "6:20 AM"
                ));
        lstConversations.add(
                new ConversationModel(
                        R.drawable.android_kotlin,
                        "Jennifer Gonzalez",
                        "I am really excited for that new video game!",
                        "6:09 AM"
                ));
        lstConversations.add(
                new ConversationModel(R.drawable.android_kotlin,
                        "maria-smith@mail.com",
                        "When will you be there?",
                        "5:16 AM"
                ));
        lstConversations.add(
                new ConversationModel(
                        R.drawable.android_kotlin,
                        "The Family",
                        "When's out next vacation?",
                        "1:51 AM"
                ));
        lstConversations.add(
                new ConversationModel(
                        R.drawable.android_kotlin,
                        "+1 123-456-7890",
                        "Can't wait to see you when you get back from college!",
                        "Yesterday"
                ));
        lstConversations.add(
                new ConversationModel(
                        R.drawable.android_kotlin,
                        "Robert Jones",
                        "I am coming in one minute",
                        "Yesterday"
                ));


        setRecyclerView(lstConversations);

    }

    private void setRecyclerView(List<ConversationModel> lstConversations) {
        recyclerView = findViewById(R.id.rvConversations);
        linearLayoutManager = new LinearLayoutManager(ConversationsActivity.this,
                RecyclerView.VERTICAL,
                false
        );
        recyclerView.setLayoutManager(linearLayoutManager);
        conversationsAdapter = new ConversationAdapter(lstConversations);
        recyclerView.setAdapter(conversationsAdapter);
        conversationsAdapter.notifyDataSetChanged();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
        Toast.makeText(ConversationsActivity.this, "Se destruyó", Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                finish();
                break;
        }
        return true;
    }
}