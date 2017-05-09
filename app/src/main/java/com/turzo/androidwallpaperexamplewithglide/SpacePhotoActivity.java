package com.turzo.androidwallpaperexamplewithglide;

import android.app.WallpaperManager;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.GlideDrawable;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SpacePhotoActivity extends AppCompatActivity {

    public static final String EXTRA_SPACE_PHOTO = "Need Speed on Asphalt Wallpaper";
    private ImageView mImageView;
    private String Gurl;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo_detail);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);



        mImageView = (ImageView) findViewById(R.id.image);
        progressBar = (ProgressBar)findViewById(R.id.progressBar);
        MenPhoto spacePhoto = getIntent().getParcelableExtra(EXTRA_SPACE_PHOTO);

        Gurl = spacePhoto.getUrl();
        progressBar.setVisibility(View.GONE);

        Glide.with(this)
                .load(spacePhoto.getUrl())
                .override(1080, 1920)
                .placeholder(R.drawable.loadbig)
                .error(R.drawable.loadbig)
                .skipMemoryCache(true)
                .listener(new RequestListener<String, GlideDrawable>() {
                    @Override
                    public boolean onException(Exception e, String model, Target<GlideDrawable> target, boolean isFirstResource) {
                        return false;
                    }

                    @Override
                    public boolean onResourceReady(GlideDrawable resource, String model, Target<GlideDrawable> target, boolean isFromMemoryCache, boolean isFirstResource) {
                       // progressBar.setVisibility(View.INVISIBLE);
                        return false;
                    }
                })
                .into(mImageView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_set_bar, menu);
        return true;
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == android.R.id.home) {
            finish();
            return true;
        }

        if (id == R.id.setas) {

            //progressBar.setVisibility(View.VISIBLE);


            mImageView.buildDrawingCache();
            Bitmap bmap = mImageView.getDrawingCache();

            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HH_mm_ss");
            String  currentTimeStamp = dateFormat.format(new Date());

            createDirectoryAndSaveFile(bmap,"Nwallpaper"+currentTimeStamp+".jpg");
            //---------
            return true;
        }

        if (id == R.id.download) {

            //progressBar.setVisibility(View.VISIBLE);
            //Visibility(View.INVISIBLE);

            mImageView.buildDrawingCache();
            Bitmap bmap = mImageView.getDrawingCache();

            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HH_mm_ss");
            String  currentTimeStamp = dateFormat.format(new Date());

            createDirectoryAndSaveFile(bmap,"Nwallpaper"+currentTimeStamp+".jpg");
            //OnRateButtonClick();
            //Toast.makeText(SpacePhotoActivity.this,"Home Screen",Toast.LENGTH_LONG).show();
            //--
            /*
            mImageView.buildDrawingCache();
            Bitmap bmap = mImageView.getDrawingCache();
            WallpaperManager wallpaperManager =
                    WallpaperManager.getInstance(getApplicationContext());

            try {
                wallpaperManager.setBitmap(bmap);
                Toast.makeText(SpacePhotoActivity.this,"Successfully changed Home Screen!",Toast.LENGTH_LONG).show();
            } catch (IOException e) {
                e.printStackTrace();
                Toast.makeText(SpacePhotoActivity.this,"Error!",Toast.LENGTH_LONG).show();
            }
            */

            //---------
            return true;
        }

        if (id == R.id.setwallpaper) {

            //progressBar.setVisibility(View.VISIBLE);
            //mImageView.setVisibility(View.INVISIBLE);

            mImageView.buildDrawingCache();
            Bitmap bmap = mImageView.getDrawingCache();

            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HH_mm_ss");
            String  currentTimeStamp = dateFormat.format(new Date());

            SaveFileAndSetWallpaper(bmap,"Nwallpaper"+currentTimeStamp+".jpg",1);
            //OnRateButtonClick();
            //Toast.makeText(SpacePhotoActivity.this,"Home Screen",Toast.LENGTH_LONG).show();
            //--
            /*
            mImageView.buildDrawingCache();
            Bitmap bmap = mImageView.getDrawingCache();
            WallpaperManager wallpaperManager =
                    WallpaperManager.getInstance(getApplicationContext());

            try {
                wallpaperManager.setBitmap(bmap);
                Toast.makeText(SpacePhotoActivity.this,"Successfully changed Home Screen!",Toast.LENGTH_LONG).show();
            } catch (IOException e) {
                e.printStackTrace();
                Toast.makeText(SpacePhotoActivity.this,"Error!",Toast.LENGTH_LONG).show();
            }
            */

            //---------
            return true;
        }

        if (id == R.id.setlockscreen) {
            if (Build.VERSION.SDK_INT >= 24) {
                //progressBar.setVisibility(View.VISIBLE);
               // mImageView.setVisibility(View.INVISIBLE);

                mImageView.buildDrawingCache();
                Bitmap bmap = mImageView.getDrawingCache();

                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HH_mm_ss");
                String  currentTimeStamp = dateFormat.format(new Date());

                SaveFileAndSetWallpaper(bmap,"Nwallpaper"+currentTimeStamp+".jpg",2);
            }else{
                Toast.makeText(SpacePhotoActivity.this,"Device doesn't support Lock Screen functionality",Toast.LENGTH_LONG).show();
            }
            return true;
        }


        if (id == R.id.ratethisapp) {
            OnRateButtonClick();
            //Toast.makeText(SpacePhotoActivity.this,"Home Screen",Toast.LENGTH_LONG).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    //----------
    //Rating_purpose
    private boolean MyStartActivity(Intent aIntent) {
        try
        {
            startActivity(aIntent);
            return true;
        }
        catch (ActivityNotFoundException e)
        {
            return false;
        }
    }

    public  void OnRateButtonClick() {

        Intent intent = new Intent(Intent.ACTION_VIEW);
        //Try Google play
        intent.setData(Uri.parse("market://details?id=com.turzo.carwallpapers"));
        if (!MyStartActivity(intent)) {
            //Market (Google play) app seems not installed, let's try to open a webbrowser
            intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.turzo.carwallpapers"));
            if (!MyStartActivity(intent)) {
                //Well if this also fails, we have run out of options, inform the user.
                Toast.makeText(this, "Could not open Play Store, please install the Google play app.", Toast.LENGTH_LONG).show();
            }
        }

    }

    //-- Saving to memory card
    private void createDirectoryAndSaveFile(Bitmap imageToSave, String fileName) {

        File direct = new File(Environment.getExternalStorageDirectory() + "/CarWallpaper");

        if (!direct.exists()) {
            File wallpaperDirectory = new File("/sdcard/CarWallpaper/");
            wallpaperDirectory.mkdirs();
        }

        File file = new File(new File("/sdcard/CarWallpaper/"), fileName);
        if (file.exists()) {
            file.delete();
        }
        try {
            FileOutputStream out = new FileOutputStream(file);
            imageToSave.compress(Bitmap.CompressFormat.JPEG, 100, out);
            out.flush();
            out.close();
            Toast.makeText(SpacePhotoActivity.this,"File downloaded to CarWallpaper folder!",Toast.LENGTH_LONG).show();
            //progressBar.setVisibility(View.INVISIBLE);
            //mImageView.setVisibility(View.VISIBLE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    //-- Saving to memory card + set wallpaper
    private void SaveFileAndSetWallpaper(Bitmap imageToSave, String fileName, int code) {

        File direct = new File(Environment.getExternalStorageDirectory() + "/CarWallpaper");

        if (!direct.exists()) {
            File wallpaperDirectory = new File("/sdcard/CarWallpaper/");
            wallpaperDirectory.mkdirs();
        }

        File file = new File(new File("/sdcard/CarWallpaper/"), fileName);
        if (file.exists()) {
            file.delete();
        }
        try {
            FileOutputStream out = new FileOutputStream(file);
            imageToSave.compress(Bitmap.CompressFormat.JPEG, 100, out);
            out.flush();
            out.close();
            if(code == 1){
                SetWallpaper(file.getAbsolutePath());
            }else if(code == 2){
                SetLockScreen(file.getAbsolutePath());
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void SetWallpaper(String path)
    {
        WallpaperManager wallpaperManager =
                WallpaperManager.getInstance(getApplicationContext());

        try {
            wallpaperManager.setBitmap(BitmapFactory.decodeFile(path));
            Toast.makeText(SpacePhotoActivity.this,"Successfully changed Wallpaper!",Toast.LENGTH_LONG).show();
            //progressBar.setVisibility(View.INVISIBLE);
            //mImageView.setVisibility(View.VISIBLE);
        } catch (IOException e) {
            e.printStackTrace();
            Toast.makeText(SpacePhotoActivity.this,"Error!",Toast.LENGTH_LONG).show();
        }
    }

    private void SetLockScreen(String path)
    {
        WallpaperManager wallpaperManager =
                WallpaperManager.getInstance(getApplicationContext());

        try {
            //wallpaperManager.setBitmap(BitmapFactory.decodeFile(path));
            if (Build.VERSION.SDK_INT >= 24) {
                wallpaperManager.getInstance(this).setBitmap(BitmapFactory.decodeFile(path), null, true, WallpaperManager.FLAG_LOCK);
                Toast.makeText(SpacePhotoActivity.this,"Successfully changed Lock Screen!",Toast.LENGTH_LONG).show();
                //progressBar.setVisibilityprogressBar.setVisibility(View.INVISIBLE);
               // mImageView.setVisibility(View.VISIBLE);
            }

        } catch (IOException e) {
            e.printStackTrace();
            Toast.makeText(SpacePhotoActivity.this,"Error!",Toast.LENGTH_LONG).show();
        }
    }



    //-----------
}