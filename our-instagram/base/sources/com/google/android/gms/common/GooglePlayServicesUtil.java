package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class GooglePlayServicesUtil {
    public static boolean A00;
    public static boolean A01;

    @Deprecated
    public static final AtomicBoolean A02 = new AtomicBoolean();
    public static final AtomicBoolean A03 = new AtomicBoolean();

    @Deprecated
    public static boolean A00(Context context, int i) {
        if (i == 18) {
            return true;
        }
        if (i == 1) {
            try {
                Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
                while (it.hasNext()) {
                    if ("com.google.android.gms".equals(it.next().getAppPackageName())) {
                        return true;
                    }
                }
                return context.getPackageManager().getApplicationInfo("com.google.android.gms", 8192).enabled;
            } catch (PackageManager.NameNotFoundException | Exception unused) {
                return false;
            }
        }
        return false;
    }
}
