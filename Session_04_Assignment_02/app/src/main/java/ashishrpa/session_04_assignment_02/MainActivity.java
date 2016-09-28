package ashishrpa.session_04_assignment_02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private ArrayList<String> al_contactName,al_contactNumber;
    private TextView contactName, contactNumber;
    private MyAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contactName = (TextView)findViewById(R.id.contact_name);
        contactNumber = (TextView)findViewById(R.id.contact_number);
        listView = (ListView)findViewById(R.id.lv_contacts);

        al_contactName = new ArrayList<>();
        al_contactNumber = new ArrayList<>();

        al_contactName.add("Name1");
        al_contactName.add("Name2");
        al_contactName.add("Name3");
        al_contactName.add("Name4");
        al_contactName.add("Name5");
        al_contactName.add("Name6");
        al_contactName.add("Name7");
        al_contactName.add("Name8");
        al_contactName.add("Name9");
        al_contactName.add("Name10");
        al_contactName.add("Name11");
        al_contactName.add("Name12");
        al_contactName.add("Name13");
        al_contactName.add("Name14");
        al_contactName.add("Name15");

        al_contactNumber.add("PhoneNumber1");
        al_contactNumber.add("PhoneNumber2");
        al_contactNumber.add("PhoneNumber3");
        al_contactNumber.add("PhoneNumber4");
        al_contactNumber.add("PhoneNumber5");
        al_contactNumber.add("PhoneNumber6");
        al_contactNumber.add("PhoneNumber7");
        al_contactNumber.add("PhoneNumber8");
        al_contactNumber.add("PhoneNumber9");
        al_contactNumber.add("PhoneNumber10");
        al_contactNumber.add("PhoneNumber11");
        al_contactNumber.add("PhoneNumber12");
        al_contactNumber.add("PhoneNumber13");
        al_contactNumber.add("PhoneNumber14");
        al_contactNumber.add("PhoneNumber15");

        adapter = new MyAdapter();
        listView.setAdapter(adapter);

    }

    public class MyAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return al_contactName.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ViewHolder holder;
            if(convertView == null){
                convertView = getLayoutInflater().inflate(R.layout.name_and_contacts,parent,false);
                holder = new ViewHolder();
                holder.bindView(convertView);
                convertView.setTag(holder);
                Log.e("Main_ACTIVITY","convertView is NULL");
            }
            else {
                holder = (ViewHolder)convertView.getTag();
            }
            holder.contactName.setText(al_contactName.get(position));
            holder.contactNumber.setText(al_contactNumber.get(position));
            return convertView;
        }
    }
    public class ViewHolder{
        TextView contactName, contactNumber;
        void bindView(View convertView){
            Log.e("ViewHolder => bindView","Wow! its called...");
            contactName = (TextView)convertView.findViewById(R.id.contact_name);
            contactNumber = (TextView)convertView.findViewById(R.id.contact_number);
        }
    }
}
