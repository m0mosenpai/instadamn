package com.facebook.fixie.fixes.common;

import X.C114425Ej;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.facebook.fixie.fixes.common.MediaSessionANRFixer$1;

/* loaded from: classes3.dex */
public final class MediaSessionANRFixer$1 implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ C114425Ej A00;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    public MediaSessionANRFixer$1(C114425Ej c114425Ej) {
        this.A00 = c114425Ej;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(final Activity activity, Bundle bundle) {
        this.A00.A02.post(new Runnable() { // from class: X.Pvk
            @Override // java.lang.Runnable
            public final void run() {
                MediaSessionANRFixer$1 mediaSessionANRFixer$1 = this;
                Activity activity2 = activity;
                C0HY c0hy = mediaSessionANRFixer$1.A00.A03;
                if (c0hy != null) {
                    c0hy.A01(activity2, C0HC.A00(), false);
                }
            }
        });
    }
}
