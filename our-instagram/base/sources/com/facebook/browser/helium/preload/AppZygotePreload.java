package com.facebook.browser.helium.preload;

import android.app.ZygotePreload;
import android.content.pm.ApplicationInfo;
import android.os.SystemClock;
import android.util.Log;
import com.facebook.browser.helium.content.SandboxedProcessService;

/* loaded from: classes.dex */
public final class AppZygotePreload implements ZygotePreload {
    @Override // android.app.ZygotePreload
    public void doPreload(ApplicationInfo applicationInfo) {
        try {
            SandboxedProcessService.A01 = SystemClock.currentThreadTimeMillis();
        } catch (Throwable th) {
            Log.w("AppZygotePreloader", "AppZygotePreload measurement failed", th);
        }
    }
}
