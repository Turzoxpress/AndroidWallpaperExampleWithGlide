package com.turzo.androidwallpaperexamplewithglide;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Turzo on 4/26/2017.
 */

public class MenPhoto implements Parcelable {

    private String mUrl;
    private String mTitle;
    //-----------
    /*
    public static String link1, link2, link3, link4, link5, link6, link7, link8, link9, link10,
            link11, link12, link13, link14, link15, link16, link17, link18, link19, link20,
            link21, link22, link23, link24, link25, link26, link27, link28, link29, link30,
            link31, link32, link33, link34, link35, link36, link37, link38, link39, link40,
            link41, link42, link43, link44, link45, link46, link47, link48, link49, link50;
            */

    //--------------

    public MenPhoto(String url, String title) {
        mUrl = url;
        mTitle = title;
    }

    protected MenPhoto(Parcel in) {
        mUrl = in.readString();
        mTitle = in.readString();
    }

    public static final Creator<MenPhoto> CREATOR = new Creator<MenPhoto>() {
        @Override
        public MenPhoto createFromParcel(Parcel in) {
            return new MenPhoto(in);
        }

        @Override
        public MenPhoto[] newArray(int size) {
            return new MenPhoto[size];
        }
    };

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public static MenPhoto[] getMenPhotos() {

/*
        if (MainActivity.hairType == 1) {
            link1 = "http://www.menshairstylestoday.com/wp-content/uploads/2015/12/Long-Fringe-Low-Fade.jpg";
            link2 = "http://www.menshairstylestoday.com/wp-content/uploads/2015/12/High-Fade.jpg";
            link3 = "http://www.menshairstylestoday.com/wp-content/uploads/2015/12/High-Fade-Loose-Pompadour.jpg";
            link4 = "";
            link5 = "";
            link6 = "";
            link7 = "";
            link8 = "";
            link9 = "";
            link10 = "";

            link11 = "";
            link12 = "";
            link13 = "";
            link14 = "";
            link15 = "";
            link16 = "";
            link17 = "";
            link18 = "";
            link19 = "";
            link20 = "";

            link21 = "";
            link22 = "";
            link23 = "";
            link24 = "";
            link25 = "";
            link26 = "";
            link27 = "";
            link28 = "";
            link29 = "";
            link30 = "";

            link31 = "";
            link32 = "";
            link33 = "";
            link34 = "";
            link35 = "";
            link36 = "";
            link37 = "";
            link38 = "";
            link39 = "";
            link40 = "";

            link41 = "";
            link42 = "";
            link43 = "";
            link44 = "";
            link45 = "";
            link46 = "";
            link47 = "";
            link48 = "";
            link49 = "";
            link50 = "";

        } else {

            link1 = "http://www.menshairstylestoday.com/wp-content/uploads/2015/12/Long-Messy-Hair-with-Low-Fade.jpg";
            link2 = "http://www.menshairstylestoday.com/wp-content/uploads/2015/12/Long-Fringe-Low-Fade.jpg";
            link3 = "";
            link4 = "";
            link5 = "";
            link6 = "";
            link7 = "";
            link8 = "";
            link9 = "";
            link10 = "";

            link11 = "";
            link12 = "";
            link13 = "";
            link14 = "";
            link15 = "";
            link16 = "";
            link17 = "";
            link18 = "";
            link19 = "";
            link20 = "";

            link21 = "";
            link22 = "";
            link23 = "";
            link24 = "";
            link25 = "";
            link26 = "";
            link27 = "";
            link28 = "";
            link29 = "";
            link30 = "";

            link31 = "";
            link32 = "";
            link33 = "";
            link34 = "";
            link35 = "";
            link36 = "";
            link37 = "";
            link38 = "";
            link39 = "";
            link40 = "";

            link41 = "";
            link42 = "";
            link43 = "";
            link44 = "";
            link45 = "";
            link46 = "";
            link47 = "";
            link48 = "";
            link49 = "";
            link50 = "";
        }

        return new MenPhoto[]{
                new MenPhoto(link1, "Hair Style 2017"),
                new MenPhoto(link2, "Hair Style 2017"),
                new MenPhoto(link3, "Hair Style 2017"),
                new MenPhoto(link4, "Hair Style 2017"),
                new MenPhoto(link5, "Hair Style 2017"),
                new MenPhoto(link6, "Hair Style 2017"),
                new MenPhoto(link7, "Hair Style 2017"),
                new MenPhoto(link8, "Hair Style 2017"),
                new MenPhoto(link9, "Hair Style 2017"),
                new MenPhoto(link10, "Hair Style 2017"),

                new MenPhoto(link11, "Hair Style 2017"),
                new MenPhoto(link12, "Hair Style 2017"),
                new MenPhoto(link13, "Hair Style 2017"),
                new MenPhoto(link14, "Hair Style 2017"),
                new MenPhoto(link15, "Hair Style 2017"),
                new MenPhoto(link16, "Hair Style 2017"),
                new MenPhoto(link17, "Hair Style 2017"),
                new MenPhoto(link18, "Hair Style 2017"),
                new MenPhoto(link19, "Hair Style 2017"),
                new MenPhoto(link20, "Hair Style 2017"),

                new MenPhoto(link21, "Hair Style 2017"),
                new MenPhoto(link22, "Hair Style 2017"),
                new MenPhoto(link23, "Hair Style 2017"),
                new MenPhoto(link24, "Hair Style 2017"),
                new MenPhoto(link25, "Hair Style 2017"),
                new MenPhoto(link26, "Hair Style 2017"),
                new MenPhoto(link27, "Hair Style 2017"),
                new MenPhoto(link28, "Hair Style 2017"),
                new MenPhoto(link29, "Hair Style 2017"),
                new MenPhoto(link30, "Hair Style 2017"),

                new MenPhoto(link31, "Hair Style 2017"),
                new MenPhoto(link32, "Hair Style 2017"),
                new MenPhoto(link33, "Hair Style 2017"),
                new MenPhoto(link34, "Hair Style 2017"),
                new MenPhoto(link35, "Hair Style 2017"),
                new MenPhoto(link36, "Hair Style 2017"),
                new MenPhoto(link37, "Hair Style 2017"),
                new MenPhoto(link38, "Hair Style 2017"),
                new MenPhoto(link39, "Hair Style 2017"),
                new MenPhoto(link40, "Hair Style 2017"),

                new MenPhoto(link41, "Hair Style 2017"),
                new MenPhoto(link42, "Hair Style 2017"),
                new MenPhoto(link43, "Hair Style 2017"),
                new MenPhoto(link44, "Hair Style 2017"),
                new MenPhoto(link45, "Hair Style 2017"),
                new MenPhoto(link46, "Hair Style 2017"),
                new MenPhoto(link47, "Hair Style 2017"),
                new MenPhoto(link48, "Hair Style 2017"),
                new MenPhoto(link49, "Hair Style 2017"),
                new MenPhoto(link50, "Hair Style 2017"),


        };

 */

        return new MenPhoto[]{





        new MenPhoto("http://i.imgur.com/Mz5fTXE.jpg", "Car Wallpaper HD"),
                new MenPhoto("http://i.imgur.com/2yG0hM7.jpg", "Car Wallpaper HD"),
                new MenPhoto("http://i.imgur.com/9X3OSTp.jpg", "Car Wallpaper HD"),
                new MenPhoto("http://i.imgur.com/Z61dzT6.jpg", "Car Wallpaper HD"),
                new MenPhoto("http://i.imgur.com/8UxHfb6.jpg", "Car Wallpaper HD"),
                new MenPhoto("http://i.imgur.com/Xi1DTU3.jpg", "Car Wallpaper HD"),
                new MenPhoto("http://i.imgur.com/YZfOGHA.jpg", "Car Wallpaper HD"),
                new MenPhoto("http://i.imgur.com/X86WZSI.jpg", "Car Wallpaper HD"),
                new MenPhoto("http://i.imgur.com/xNTpOyy.jpg", "Car Wallpaper HD"),
                new MenPhoto("http://i.imgur.com/bcW2IeE.jpg", "Car Wallpaper HD"),
                new MenPhoto("http://i.imgur.com/2Jsd8P6.jpg", "Car Wallpaper HD"),
                new MenPhoto("http://i.imgur.com/Es8yRAs.jpg", "Car Wallpaper HD"),
                new MenPhoto("http://i.imgur.com/oYpAfHL.jpg", "Car Wallpaper HD"),
                new MenPhoto("http://i.imgur.com/JTlCGrv.jpg", "Car Wallpaper HD"),
                new MenPhoto("http://i.imgur.com/6wPqUez.jpg", "Car Wallpaper HD"),
                new MenPhoto("http://i.imgur.com/XzikrDE.jpg", "Car Wallpaper HD"),
                new MenPhoto("http://i.imgur.com/QiN3qgI.jpg", "Car Wallpaper HD"),
                new MenPhoto("http://i.imgur.com/kCGreBD.jpg", "Car Wallpaper HD"),
                new MenPhoto("http://i.imgur.com/uZuPeFf.jpg", "Car Wallpaper HD"),
                new MenPhoto("http://i.imgur.com/8gc7l9q.jpg", "Car Wallpaper HD"),
                new MenPhoto("http://i.imgur.com/3M6VQTT.jpg", "Car Wallpaper HD"),
                new MenPhoto("http://i.imgur.com/jMicYvF.jpg", "Car Wallpaper HD"),
                new MenPhoto("http://i.imgur.com/YJf2Uc0.jpg", "Car Wallpaper HD"),
                new MenPhoto("http://i.imgur.com/ukAdI3Y.jpg", "Car Wallpaper HD"),
                new MenPhoto("http://i.imgur.com/tu8wDL1.jpg", "Car Wallpaper HD"),
                new MenPhoto("http://i.imgur.com/pkqVVdw.jpg", "Car Wallpaper HD"),
                new MenPhoto("http://i.imgur.com/jslAey7.jpg", "Car Wallpaper HD"),
                new MenPhoto("http://i.imgur.com/xqlttRM.jpg", "Car Wallpaper HD"),
                new MenPhoto("http://i.imgur.com/Xy2q88h.jpg", "Car Wallpaper HD"),
                new MenPhoto("http://i.imgur.com/e0G7fr3.jpg", "Car Wallpaper HD"),
                new MenPhoto("http://i.imgur.com/pB3XR8M.jpg", "Car Wallpaper HD"),
                new MenPhoto("http://i.imgur.com/m8E0GiJ.jpg", "Car Wallpaper HD"),
                new MenPhoto("http://i.imgur.com/47Ud7aU.jpg", "Car Wallpaper HD"),
                new MenPhoto("http://i.imgur.com/Tyu1eHb.jpg", "Car Wallpaper HD"),
                new MenPhoto("http://i.imgur.com/CHsm7Es.jpg", "Car Wallpaper HD"),
                new MenPhoto("http://i.imgur.com/j28MIc9.jpg", "Car Wallpaper HD"),
                new MenPhoto("http://i.imgur.com/YL5wIxf.jpg", "Car Wallpaper HD"),
                new MenPhoto("http://i.imgur.com/rH33sUr.jpg", "Car Wallpaper HD"),
                new MenPhoto("http://i.imgur.com/D8L1DB6.jpg", "Car Wallpaper HD"),
                new MenPhoto("http://i.imgur.com/U1tkYNi.jpg", "Car Wallpaper HD"),
                new MenPhoto("http://i.imgur.com/9b6aepk.jpg", "Car Wallpaper HD"),
                new MenPhoto("http://i.imgur.com/j7JMLvU.jpg", "Car Wallpaper HD"),
                new MenPhoto("http://i.imgur.com/81tnkaM.jpg", "Car Wallpaper HD"),
                new MenPhoto("http://i.imgur.com/BUywLFa.jpg", "Car Wallpaper HD"),
                new MenPhoto("http://i.imgur.com/zPP3lJd.jpg", "Car Wallpaper HD"),
                new MenPhoto("http://i.imgur.com/2Wz8reS.jpg", "Car Wallpaper HD"),
                new MenPhoto("http://i.imgur.com/n6C4vCB.jpg", "Car Wallpaper HD"),
                new MenPhoto("http://i.imgur.com/ZDrW78O.jpg", "Car Wallpaper HD"),
                new MenPhoto("http://i.imgur.com/pr5z6Dh.jpg", "Car Wallpaper HD"),
                new MenPhoto("http://i.imgur.com/4JrKQ5D.jpg", "Car Wallpaper HD"),
                new MenPhoto("http://i.imgur.com/w1phbWb.jpg", "Car Wallpaper HD"),
                new MenPhoto("http://i.imgur.com/7kzTWLP.jpg", "Car Wallpaper HD"),
                new MenPhoto("http://i.imgur.com/KYZRh3m.jpg", "Car Wallpaper HD"),
                new MenPhoto("http://i.imgur.com/xCAxqix.jpg", "Car Wallpaper HD"),
                new MenPhoto("http://i.imgur.com/y5TsqRL.jpg", "Car Wallpaper HD"),
                new MenPhoto("http://i.imgur.com/fSIHyp1.jpg", "Car Wallpaper HD"),
                new MenPhoto("http://i.imgur.com/K91qtQY.jpg", "Car Wallpaper HD"),
                new MenPhoto("http://i.imgur.com/56wqO4w.jpg", "Car Wallpaper HD"),
                new MenPhoto("http://i.imgur.com/O5892FE.jpg", "Car Wallpaper HD"),
                new MenPhoto("http://i.imgur.com/wS2VrRV.jpg", "Car Wallpaper HD"),
                new MenPhoto("http://i.imgur.com/GcUWrJY.jpg", "Car Wallpaper HD"),
                new MenPhoto("http://i.imgur.com/ycMVWOC.jpg", "Car Wallpaper HD"),
                new MenPhoto("http://i.imgur.com/QrEMxGM.jpg", "Car Wallpaper HD"),
                new MenPhoto("http://i.imgur.com/q1gKnZB.jpg", "Car Wallpaper HD"),
                new MenPhoto("http://i.imgur.com/9RWi7ZZ.jpg", "Car Wallpaper HD"),
                new MenPhoto("http://i.imgur.com/UWyYe9g.jpg", "Car Wallpaper HD"),
                new MenPhoto("http://i.imgur.com/giJGXzv.jpg", "Car Wallpaper HD"),
                new MenPhoto("http://i.imgur.com/BcsH3fu.jpg", "Car Wallpaper HD"),
                new MenPhoto("http://i.imgur.com/5JM9w8V.jpg", "Car Wallpaper HD"),
                new MenPhoto("http://i.imgur.com/Go4O0Tk.jpg", "Car Wallpaper HD"),






        };



    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(mUrl);
        parcel.writeString(mTitle);
    }
}
