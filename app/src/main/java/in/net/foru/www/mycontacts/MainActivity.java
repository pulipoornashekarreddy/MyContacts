package in.net.foru.www.mycontacts;

import android.app.ListActivity;
import android.database.Cursor;
import android.provider.ContactsContract;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

public class MainActivity extends ListActivity {
    ListView lv;
    Cursor courser1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        courser1=getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI,null,null,null,null);
        startManagingCursor(courser1);
        String[] from = {ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME,ContactsContract.CommonDataKinds.Phone.NUMBER, ContactsContract.CommonDataKinds.Phone._ID};
        int[] to = {android.R.id.text1,android.R.id.text2};
        SimpleCursorAdapter listAdapter = new SimpleCursorAdapter(this,android.R.layout.simple_list_item_2,courser1,from,to);
        setListAdapter(listAdapter);
        lv=getListView();
        lv.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);

    }

    @Override
    public long getSelectedItemId()
    {
        return super.getSelectedItemId();
    }
    @Override
    public int getSelectedItemPosition()
    {
        return super.getSelectedItemPosition();
    }



}
