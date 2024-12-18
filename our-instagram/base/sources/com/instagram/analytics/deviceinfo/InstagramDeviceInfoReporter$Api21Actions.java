package com.instagram.analytics.deviceinfo;

import X.C14360o3;
import X.C19260xA;
import android.system.ErrnoException;
import android.system.Os;

/* loaded from: classes10.dex */
public final class InstagramDeviceInfoReporter$Api21Actions {
    public static final InstagramDeviceInfoReporter$Api21Actions INSTANCE = new Object();

    public static final void addFileLastAccessTime(C19260xA c19260xA, String str) {
        C14360o3.A0B(c19260xA, 0);
        try {
            C19260xA.A00(c19260xA, Long.valueOf(Os.lstat(str).st_atime * 1000), "access_date");
        } catch (ErrnoException unused) {
        }
    }
}
