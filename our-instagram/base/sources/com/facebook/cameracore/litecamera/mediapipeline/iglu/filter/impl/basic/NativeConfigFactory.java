package com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.impl.basic;

import X.C09170dP;
import android.content.res.AssetManager;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.IgluConfigHolder;

/* loaded from: classes4.dex */
public class NativeConfigFactory {
    public static native IgluConfigHolder create(AssetManager assetManager, boolean z);

    public static native IgluConfigHolder createFbAssetConfig(AssetManager assetManager, boolean z);

    public static native IgluConfigHolder createIgAssetConfig(AssetManager assetManager, boolean z);

    static {
        C09170dP.A0C("mediapipeline-iglufilter-impl-basic");
    }
}
