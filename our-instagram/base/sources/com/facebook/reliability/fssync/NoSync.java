package com.facebook.reliability.fssync;

import android.os.Build;

/* loaded from: classes.dex */
public final class NoSync {
    public static final NoSync INSTANCE = new Object();
    public static final String TAG = "NoSync";
    public static boolean syncDisabled;

    public static final native boolean disableFSSync(int i, boolean z);

    public static final void disableFSSync(boolean z) {
        if (!syncDisabled) {
            syncDisabled = disableFSSync(Build.VERSION.SDK_INT, z);
        }
    }
}
