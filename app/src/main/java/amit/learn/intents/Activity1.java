package amit.learn.intents;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.acadgild.intents.R;

public class Activity1 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_activity1);
	}
	
	
	public void openActivity(View v)
	{
		//Create Intent object
		Intent openNewActivity = new Intent(Activity1.this, Activity2.class);
		
		//Directly set data in intent object
		openNewActivity.putExtra("UserName", "Amit");
		openNewActivity.putExtra("isRegistered", false);
		
		//Set data in bundle and then set bundle in intent object
		Bundle dataBundle = new Bundle();

		dataBundle.putString("BundleUserName", "Amit-Saxena");

		openNewActivity.putExtras(dataBundle);
		
		startActivity(openNewActivity);
	}
	
	public void openWebPage(View v)
	{
		Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
        startActivity(webIntent);
	}
	
	public void shareData(View v)
	{
		Intent sendIntent = new Intent();
		sendIntent.setAction(Intent.ACTION_SEND);
		sendIntent.putExtra(Intent.EXTRA_TEXT, "Hello ,How are you");
		sendIntent.setType("text/plain");
		startActivity(sendIntent);
	}

	

}
