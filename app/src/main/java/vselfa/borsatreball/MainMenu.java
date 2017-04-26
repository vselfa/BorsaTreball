package vselfa.borsatreball;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.PopupMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainMenu extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the vselfa.jocsambpilota.MainMenu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void showPopup(View v) { // Menú lligat a la imatge
        PopupMenu popup = new PopupMenu(this, v);
        // This activity implements OnMenuItemClickListener
        popup.setOnMenuItemClickListener((PopupMenu.OnMenuItemClickListener) this);
        popup.inflate(R.menu.menu_main);         popup.show();
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();         selectOption (id);        return true;
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        int id = item.getItemId();
        selectOption (id);        return true;
    }

    public void selectOption (int id) {
        Intent intent=null;         Bundle b;
        switch (id){
            case R.id.alta:
/*                // Parem els threads al canviar d'opció de menú
                if (BouncingBallWithPaletteActivity.bbwpView!=null) BouncingBallWithPaletteActivity.bbwpView.stopThread();
                if (BouncingBallWithPaletteAndHolesActivity.bbwpahView!=null) BouncingBallWithPaletteActivity.bbwpView.stopThread();
                intent=new Intent(this,BouncingBallActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);*/
                break;
            case R.id.ofertes:
                /*// Parem els threads al canviar d'opció de menú
                if (BouncingBallActivity.bbView!=null) BouncingBallActivity.bbView.stopThread();
                if (BouncingBallWithPaletteAndHolesActivity.bbwpahView!=null) BouncingBallWithPaletteActivity.bbwpView.stopThread();
                intent=new Intent(this,BouncingBallWithPaletteActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);*/
                break;
            case R.id.inici:
/*                // Parem els threads al canviar d'opció de menú
                if (BouncingBallWithPaletteActivity.bbwpView!=null) BouncingBallWithPaletteActivity.bbwpView.stopThread();
                if (BouncingBallActivity.bbView!=null) BouncingBallActivity.bbView.stopThread();
                if (BouncingBallWithPaletteAndHolesActivity.bbwpahView!=null) BouncingBallWithPaletteActivity.bbwpView.stopThread();
                intent=new Intent(this,MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);*/
                break;
        }
        // startActivity(intent); //Starting the new activity
    }
}