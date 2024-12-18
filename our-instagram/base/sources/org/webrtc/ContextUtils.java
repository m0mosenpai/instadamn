package org.webrtc;

import X.AbstractC166987dD;
import android.content.Context;

/* loaded from: classes12.dex */
public class ContextUtils {
    public static final String TAG = "ContextUtils";
    public static Context applicationContext;

    public static void initialize(Context context) {
        if (context != null) {
            applicationContext = context;
            return;
        }
        throw AbstractC166987dD.A12("Application context cannot be null for ContextUtils.initialize.");
    }

    @Deprecated
    public static Context getApplicationContext() {
        return applicationContext;
    }
}
