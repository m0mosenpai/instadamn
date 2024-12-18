package com.instagram.util.startup.tracking;

import X.AbstractC12960li;
import X.AnonymousClass001;
import X.C14360o3;
import X.C226218q;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class StartupTrackerActivityMonitor implements Application.ActivityLifecycleCallbacks {
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
    public final void onActivityPreCreated(Activity activity, Bundle bundle) {
        C14360o3.A0B(activity, 0);
        A00(activity, "onCreate");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreDestroyed(Activity activity) {
        C14360o3.A0B(activity, 0);
        A00(activity, "onDestroy");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPrePaused(Activity activity) {
        C14360o3.A0B(activity, 0);
        A00(activity, "onPause");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreResumed(Activity activity) {
        C14360o3.A0B(activity, 0);
        A00(activity, "onResume");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreSaveInstanceState(Activity activity, Bundle bundle) {
        C14360o3.A0B(activity, 0);
        A00(activity, "onSaveInstanceState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreStarted(Activity activity) {
        C14360o3.A0B(activity, 0);
        A00(activity, "onStart");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreStopped(Activity activity) {
        C14360o3.A0B(activity, 0);
        A00(activity, "onStop");
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

    public static final void A00(Activity activity, String str) {
        C14360o3.A0B(AnonymousClass001.A0g(str, ": ", activity.getComponentName().getShortClassName()), 0);
        C226218q.A01(AbstractC12960li.A00);
    }
}
