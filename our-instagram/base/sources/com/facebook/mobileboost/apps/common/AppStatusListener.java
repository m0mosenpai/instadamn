package com.facebook.mobileboost.apps.common;

import X.C0Ct;
import X.C1J6;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.facebook.mobileboost.apps.common.AppStatusListener;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public final class AppStatusListener implements Application.ActivityLifecycleCallbacks {
    public static AppStatusListener A06;
    public WeakReference A00;
    public final Handler A01;
    public final AtomicBoolean A04;
    public final C1J6[] A05;
    public final Runnable A03 = new Runnable() { // from class: X.96V
        @Override // java.lang.Runnable
        public final void run() {
            for (C1J6 c1j6 : AppStatusListener.this.A05) {
                c1j6.ABf();
            }
        }
    };
    public final Runnable A02 = new Runnable() { // from class: X.96W
        @Override // java.lang.Runnable
        public final void run() {
            AppStatusListener appStatusListener = AppStatusListener.this;
            appStatusListener.A04.set(true);
            for (C1J6 c1j6 : appStatusListener.A05) {
                c1j6.ABe();
            }
        }
    };

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Object obj = this.A00.get();
        this.A00 = new WeakReference(activity);
        if (obj == null) {
            Handler handler = this.A01;
            handler.removeCallbacks(this.A02);
            if (this.A04.getAndSet(false)) {
                handler.post(this.A03);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Object obj = this.A00.get();
        if (obj == null || obj == activity) {
            this.A01.postDelayed(this.A02, 3000L);
            this.A00 = new WeakReference(null);
        }
    }

    public AppStatusListener(Context context, Handler handler, List list) {
        Application application;
        this.A00 = new WeakReference(null);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.A04 = atomicBoolean;
        Context applicationContext = context.getApplicationContext();
        this.A05 = (C1J6[]) list.toArray(new C1J6[list.size()]);
        this.A01 = handler;
        if (((applicationContext instanceof Application) || ((applicationContext = applicationContext.getApplicationContext()) != null && (applicationContext instanceof Application))) && (application = (Application) applicationContext) != null) {
            Activity A00 = C0Ct.A00();
            atomicBoolean.set(A00 == null);
            this.A00 = new WeakReference(A00);
            application.registerActivityLifecycleCallbacks(this);
        }
    }
}
