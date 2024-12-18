package com.facebook.rp.omnigrid.marlogrid;

import X.C09170dP;
import X.C53727NpG;
import com.facebook.rp.omnigrid.builder.GridLayoutOutputBuilder;
import com.facebook.rtc.views.omnigrid.GridLayoutInput;

/* loaded from: classes9.dex */
public final class MarloGridNative {
    public static final C53727NpG Companion = new Object();

    public static final native void jni_computeMarloGridLayout(GridLayoutInput gridLayoutInput, GridLayoutOutputBuilder gridLayoutOutputBuilder);

    /* JADX WARN: Type inference failed for: r0v0, types: [X.NpG, java.lang.Object] */
    static {
        C09170dP.A0C("omnigridjni");
    }
}
