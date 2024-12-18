package com.facebook.rp.omnigrid.arlogrid;

import X.C09170dP;
import X.C53726NpF;
import com.facebook.rp.omnigrid.builder.GridLayoutOutputBuilder;
import com.facebook.rtc.views.omnigrid.GridLayoutInput;

/* loaded from: classes9.dex */
public final class ArloGridNative {
    public static final C53726NpF Companion = new Object();

    public static final native void jni_computeArloGridLayout(GridLayoutInput gridLayoutInput, GridLayoutOutputBuilder gridLayoutOutputBuilder);

    /* JADX WARN: Type inference failed for: r0v0, types: [X.NpF, java.lang.Object] */
    static {
        C09170dP.A0C("omnigridjni");
    }
}
