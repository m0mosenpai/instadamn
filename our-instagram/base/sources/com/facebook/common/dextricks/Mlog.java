package com.facebook.common.dextricks;

import X.AnonymousClass001;
import android.util.Log;

/* loaded from: classes.dex */
public final class Mlog {
    public static final String TAG = "DexLibLoader";
    public static final boolean VERBOSE = true;

    public static void assertThat(boolean z, String str, Object... objArr) {
        if (z) {
            return;
        }
        String safeFmt = safeFmt(str, objArr);
        Log.e(TAG, safeFmt);
        throw new AssertionError(AnonymousClass001.A0R("DexLibLoader: ", safeFmt));
    }

    public static void e(String str, Object... objArr) {
        Log.e(TAG, safeFmt(str, objArr));
    }

    public static String safeFmt(String str, Object... objArr) {
        try {
            return String.format(str, objArr);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("[bad fmt: \"");
            sb.append(str);
            sb.append("\" (");
            sb.append(e);
            sb.append(")]");
            return sb.toString();
        }
    }

    public static void w(String str, Object... objArr) {
        Log.w(TAG, safeFmt(str, objArr));
    }

    public static void d(String str, Object... objArr) {
        safeFmt(str, objArr);
    }

    public static void i(String str, Object... objArr) {
        safeFmt(str, objArr);
    }

    public static void v(String str, Object... objArr) {
        safeFmt(str, objArr);
    }

    public static void d(Throwable th, String str, Object... objArr) {
        safeFmt(str, objArr);
    }

    public static void e(Throwable th, String str, Object... objArr) {
        Log.e(TAG, safeFmt(str, objArr), th);
    }

    public static void i(Throwable th, String str, Object... objArr) {
        safeFmt(str, objArr);
    }

    public static void v(Throwable th, String str, Object... objArr) {
        safeFmt(str, objArr);
    }

    public static void w(Throwable th, String str, Object... objArr) {
        Log.w(TAG, safeFmt(str, objArr), th);
    }
}
