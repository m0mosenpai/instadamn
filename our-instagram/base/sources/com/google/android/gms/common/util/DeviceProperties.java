package com.google.android.gms.common.util;

import X.C64I;
import android.content.Context;
import android.content.pm.PackageManager;

/* loaded from: classes2.dex */
public abstract class DeviceProperties {
    public static Boolean A00;
    public static Boolean A01;
    public static Boolean A02;
    public static Boolean A03;

    public static boolean A00(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (A00 == null) {
            boolean z = false;
            if (packageManager.hasSystemFeature("android.hardware.type.watch")) {
                z = true;
            }
            A00 = Boolean.valueOf(z);
        }
        Boolean bool = A01;
        if (bool == null) {
            boolean z2 = false;
            if (context.getPackageManager().hasSystemFeature("cn.google")) {
                z2 = true;
            }
            bool = Boolean.valueOf(z2);
            A01 = bool;
        }
        if (bool.booleanValue() && C64I.A00()) {
            return true;
        }
        return false;
    }
}
