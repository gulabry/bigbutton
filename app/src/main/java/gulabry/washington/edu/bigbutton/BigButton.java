package gulabry.washington.edu.bigbutton;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class BigButton extends ActionBarActivity {
    private int num;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_big_button);
        num = 0;
        Button button = (Button)findViewById(R.id.button);
        button.setTextSize(40);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num++;
                System.out.println(num);
                Button innerButton = (Button) findViewById(R.id.button);
                String numString = String.valueOf(num);
                innerButton.setText("You have pushed me " + numString + " times");
            }

        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_big_button, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
