package com.bloks.foa.screen.tracker;

import X.C14360o3;
import X.EnumC68126VCk;
import X.InterfaceC16660sJ;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes11.dex */
public final class ActivityLifecycleTracker implements Application.ActivityLifecycleCallbacks {
    public boolean A00;
    public final Activity A01;
    public final InterfaceC16660sJ A02;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        C14360o3.A0B(activity, 0);
        if (C14360o3.A0K(this.A01, activity)) {
            this.A02.invoke(EnumC68126VCk.A03);
        }
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.A02.invoke(EnumC68126VCk.A04);
    }

    public ActivityLifecycleTracker(Activity activity, InterfaceC16660sJ interfaceC16660sJ) {
        this.A01 = activity;
        this.A02 = interfaceC16660sJ;
    }
}
