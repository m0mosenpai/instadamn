package com.facebook.common.util.lifecycle;

import X.AbstractC10360h2;
import X.C06K;
import X.C14360o3;
import X.C4RP;
import X.WYB;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* loaded from: classes11.dex */
public final class ViewOwnerTracker extends C06K implements Application.ActivityLifecycleCallbacks {
    public final Activity A00;
    public final Fragment A01;
    public final WYB A02;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        C14360o3.A0B(activity, 0);
        if (activity.equals(this.A00)) {
            A0A();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        C14360o3.A0B(activity, 0);
        if (activity.equals(this.A00)) {
            this.A02.A01();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        C4RP c4rp;
        C14360o3.A0B(activity, 0);
        if (activity.equals(this.A00)) {
            WYB wyb = this.A02;
            if (wyb.A08 && (c4rp = wyb.A03) != null) {
                c4rp.A07();
            }
        }
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

    @Override // X.C06K
    public final void A04(Fragment fragment, AbstractC10360h2 abstractC10360h2) {
        if (fragment.equals(this.A01)) {
            A0A();
        }
    }

    @Override // X.C06K
    public final void A06(Fragment fragment, AbstractC10360h2 abstractC10360h2) {
        if (fragment.equals(this.A01)) {
            this.A02.A01();
        }
    }

    @Override // X.C06K
    public final void A07(Fragment fragment, AbstractC10360h2 abstractC10360h2) {
        C4RP c4rp;
        if (fragment.equals(this.A01)) {
            WYB wyb = this.A02;
            if (wyb.A08 && (c4rp = wyb.A03) != null) {
                c4rp.A07();
            }
        }
    }

    public final void A0A() {
        Application application;
        Fragment fragment = this.A01;
        if (fragment != null) {
            fragment.getParentFragmentManager().A0p(this);
        }
        Activity activity = this.A00;
        if (activity != null && (application = activity.getApplication()) != null) {
            application.unregisterActivityLifecycleCallbacks(this);
        }
    }

    public ViewOwnerTracker(Activity activity, Fragment fragment, WYB wyb) {
        Application application;
        this.A01 = fragment;
        this.A00 = activity;
        this.A02 = wyb;
        if (fragment != null) {
            fragment.getParentFragmentManager().A0q(this, false);
        }
        if (activity != null && (application = activity.getApplication()) != null) {
            application.registerActivityLifecycleCallbacks(this);
        }
    }
}
