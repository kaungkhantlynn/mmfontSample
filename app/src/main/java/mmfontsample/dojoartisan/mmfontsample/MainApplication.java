package mmfontsample.dojoartisan.mmfontsample;

import android.app.Application;

import me.myatminsoe.mdetect.MDetect;
import mmfontsample.dojoartisan.mmfontsample.utils.TypefaceManager;


public class MainApplication extends Application {
    public static TypefaceManager typefaceManager;
    @Override
    public void onCreate() {
        super.onCreate();

        MDetect.INSTANCE.init(this);
        typefaceManager = new TypefaceManager(getAssets());

    }
}
