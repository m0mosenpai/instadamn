package X;

import X.AbstractC210211d;
import X.C14360o3;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.EmptyActivityLifecycleCallbacks;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.07V, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C07V {
    public static final AtomicBoolean A00 = new AtomicBoolean(false);

    public static final void A00(Context context) {
        if (!A00.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            C14360o3.A0C(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new EmptyActivityLifecycleCallbacks() { // from class: androidx.lifecycle.LifecycleDispatcher$DispatcherActivityCallback
                @Override // androidx.lifecycle.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
                public void onActivityCreated(Activity activity, Bundle bundle) {
                    C14360o3.A0B(activity, 0);
                    AbstractC210211d.A00(activity);
                }
            });
        }
    }
}
