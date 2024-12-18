package com.facebook.common.zopt;

import X.C09170dP;
import android.content.Context;

/* loaded from: classes10.dex */
public final class ZOpt {
    public static final ZOpt $redex_init_class = null;

    public static void notePostColdStart(Context context, Boolean bool) {
    }

    public static native void truncate_zip_at_path(String str);

    public static native int zopt(String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, int i3, int i4, boolean z, boolean z2);

    static {
        C09170dP.A0C("zopt-jni");
    }
}
