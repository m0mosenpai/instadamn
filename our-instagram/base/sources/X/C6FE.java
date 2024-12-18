package X;

import X.C6FE;
import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.6FE, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6FE {
    public WeakReference A00;
    public final WeakReference A01;
    public final List A02 = new ArrayList();
    public final Application.ActivityLifecycleCallbacks A03;
    public volatile boolean A04;

    public final void A00() {
        int i;
        Runnable[] runnableArr;
        List list = this.A02;
        synchronized (list) {
            this.A04 = true;
        }
        Context context = (Context) this.A01.get();
        if (context != null) {
            ((Application) context.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.A03);
        }
        synchronized (list) {
            runnableArr = (Runnable[]) list.toArray(new Runnable[0]);
        }
        for (Runnable runnable : runnableArr) {
            runnable.run();
        }
        synchronized (list) {
            list.removeAll(Arrays.asList(runnableArr));
        }
    }

    public final void A01(Runnable runnable) {
        if (runnable != null) {
            List list = this.A02;
            synchronized (list) {
                if (!this.A04) {
                    list.add(runnable);
                    runnable = null;
                }
            }
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public C6FE(Context context) {
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = new Application.ActivityLifecycleCallbacks() { // from class: com.instagram.common.bloks.BloksContextBindManager$1
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityCreated(Activity activity, Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityResumed(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStopped(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityDestroyed(Activity activity) {
                C6FE c6fe = C6FE.this;
                if (activity == c6fe.A01.get()) {
                    c6fe.A00();
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPaused(Activity activity) {
                C6FE.this.A00 = null;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStarted(Activity activity) {
                C6FE.this.A00 = new WeakReference(activity);
            }
        };
        this.A03 = activityLifecycleCallbacks;
        Context context2 = context;
        while ((context2 instanceof ContextWrapper) && !(context2 instanceof Activity) && !(context2 instanceof Application) && !(context2 instanceof Service)) {
            context2 = ((ContextWrapper) context2).getBaseContext();
        }
        this.A01 = new WeakReference(context2);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
    }
}
