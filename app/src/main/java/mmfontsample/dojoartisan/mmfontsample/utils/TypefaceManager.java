package mmfontsample.dojoartisan.mmfontsample.utils;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.util.LruCache;

public class TypefaceManager {
    public static final String PYIDAUNGSU = "pyidaungsu.ttf";
    public static final String ZAWGYIONE = "zawgyi_one.ttf";
    private final AssetManager manager;

    private final LruCache<String, Typeface> mCache ;

    public TypefaceManager(AssetManager manager) {
        this.manager = manager;
        int cacheSize = 4 * 1024 * 1024;
        mCache = new LruCache<>(cacheSize);

    }

    public Typeface getUni() {
        return getTypeface(PYIDAUNGSU);
    }
    public Typeface getZgyi() {
        return getTypeface(ZAWGYIONE);
    }

    public Typeface getTypeface(final String filename) {
        Typeface typeface = mCache.get(filename);
        if(typeface == null) {
            typeface = Typeface.createFromAsset(manager, filename);
        }
        return typeface;
    }
}
