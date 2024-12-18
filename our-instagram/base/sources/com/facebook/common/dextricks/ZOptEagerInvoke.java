package com.facebook.common.dextricks;

import android.content.Context;

/* loaded from: classes.dex */
public class ZOptEagerInvoke {
    public static void run(Context context) {
        try {
            Class.forName("com.facebook.common.zopt.ZOpt").getMethod("notePostColdStart", Context.class, Boolean.class).invoke(null, context, null);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
