package tk.ngezz.navigationdrawerlayoutexample;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        onNavigationItemSelected(navigationView.getMenu().getItem(0).setChecked(true));
        drawer.openDrawer(GravityCompat.START);
    }


    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            Fragment_Home frag_home = new Fragment_Home();
            getSupportActionBar().setTitle("   Home");
            getSupportActionBar().setLogo(R.drawable.ic_home);
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit)
                    .replace(R.id.content_frame,frag_home)
                    .addToBackStack(null)
                    .commit();
        } else if (id == R.id.nav_menu_a) {
            Fragment_Menu_A frag_A = new Fragment_Menu_A();
            getSupportActionBar().setTitle("   Menu A");
            getSupportActionBar().setLogo(R.drawable.ic_filter_1);
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit)
                    .replace(R.id.content_frame,frag_A)
                    .addToBackStack(null)
                    .commit();
        } else if (id == R.id.nav_menu_b) {
            Fragment_Menu_B frag_B = new Fragment_Menu_B();
            getSupportActionBar().setTitle("   Menu B");
            getSupportActionBar().setLogo(R.drawable.ic_filter_2);
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit)
                    .replace(R.id.content_frame,frag_B)
                    .addToBackStack(null)
                    .commit();
        } else if (id == R.id.nav_menu_c) {
            Fragment_Menu_C frag_C = new Fragment_Menu_C();
            getSupportActionBar().setTitle("   Menu C");
            getSupportActionBar().setLogo(R.drawable.ic_filter_3);
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit)
                    .replace(R.id.content_frame,frag_C)
                    .addToBackStack(null)
                    .commit();
        }  else if (id == R.id.nav_menu_1) {
            Fragment_Menu_1 frag_1 = new Fragment_Menu_1();
            getSupportActionBar().setTitle("   Menu 1");
            getSupportActionBar().setLogo(R.drawable.ic_arrow_upward);
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit)
                    .replace(R.id.content_frame,frag_1)
                    .addToBackStack(null)
                    .commit();
        }   else if (id == R.id.nav_menu_2) {
            Fragment_Menu_2 frag_2 = new Fragment_Menu_2();
            getSupportActionBar().setTitle("   Menu 2");
            getSupportActionBar().setLogo(R.drawable.ic_arrow_downward);
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit)
                    .replace(R.id.content_frame,frag_2)
                    .addToBackStack(null)
                    .commit();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

}
