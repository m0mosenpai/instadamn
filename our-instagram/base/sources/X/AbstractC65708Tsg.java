package X;

import X.AbstractC210011b;
import X.C07R;
import X.C14360o3;
import X.C65705Tsd;
import X.FragmentC210411g;
import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.EmptyActivityLifecycleCallbacks;

/* renamed from: X.Tsg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC65708Tsg {
    public static final C65705Tsd A00() {
        return C65705Tsd.A08;
    }

    public static final void A01(Context context) {
        final C65705Tsd c65705Tsd = C65705Tsd.A08;
        c65705Tsd.A02 = new Handler();
        c65705Tsd.A05.A0B(C07R.ON_CREATE);
        Context applicationContext = context.getApplicationContext();
        C14360o3.A0C(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new EmptyActivityLifecycleCallbacks() { // from class: androidx.lifecycle.ProcessLifecycleOwner$attach$1
            @Override // androidx.lifecycle.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity, Bundle bundle) {
                C14360o3.A0B(activity, 0);
                if (Build.VERSION.SDK_INT < 29) {
                    Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
                    C14360o3.A0C(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
                    C65705Tsd c65705Tsd2 = C65705Tsd.this;
                    C65705Tsd c65705Tsd3 = C65705Tsd.A08;
                    ((FragmentC210411g) findFragmentByTag).A00 = c65705Tsd2.A06;
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPreCreated(Activity activity, Bundle bundle) {
                C14360o3.A0B(activity, 0);
                final C65705Tsd c65705Tsd2 = C65705Tsd.this;
                AbstractC210011b.A00(activity, new EmptyActivityLifecycleCallbacks() { // from class: androidx.lifecycle.ProcessLifecycleOwner$attach$1$onActivityPreCreated$1
                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityPostResumed(Activity activity2) {
                        C65705Tsd.this.A01();
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityPostStarted(Activity activity2) {
                        C65705Tsd.this.A02();
                    }
                });
            }

            @Override // androidx.lifecycle.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(Activity activity) {
                C65705Tsd c65705Tsd2 = C65705Tsd.this;
                int i = c65705Tsd2.A00 - 1;
                c65705Tsd2.A00 = i;
                if (i == 0) {
                    Handler handler = c65705Tsd2.A02;
                    C14360o3.A0A(handler);
                    handler.postDelayed(c65705Tsd2.A07, 700L);
                }
            }

            @Override // androidx.lifecycle.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(Activity activity) {
                C65705Tsd c65705Tsd2 = C65705Tsd.this;
                int i = c65705Tsd2.A01 - 1;
                c65705Tsd2.A01 = i;
                if (i == 0 && c65705Tsd2.A03) {
                    c65705Tsd2.A05.A0B(C07R.ON_STOP);
                    c65705Tsd2.A04 = true;
                }
            }
        });
    }
}
