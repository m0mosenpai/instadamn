package X;

import X.AbstractC58327PtK;
import X.InterfaceC16820sZ;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.ConditionVariable;
import com.facebook.proxygen.LigerSamplePolicy;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.PtK, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC58327PtK {
    public static boolean A00;
    public static boolean A01;
    public static final ConditionVariable A02 = new ConditionVariable(false);
    public static final List A03 = AbstractC166987dD.A1E();
    public static final List A04 = AbstractC166987dD.A1E();
    public static volatile InterfaceC16820sZ A05;

    public static final Bundle A00(Bundle bundle) {
        if (bundle != null && bundle.getBoolean("async_app_init_recreate")) {
            return null;
        }
        return bundle;
    }

    public static final void A01() {
        A00 = true;
        C11P.A00 = true;
        C11Q.A06 = true;
        C11T.A00 = C11S.A00;
    }

    public static final void A02() {
        A01 = true;
    }

    public static final void A04(final Context context) {
        C14360o3.A0B(context, 0);
        ConditionVariable conditionVariable = A02;
        synchronized (conditionVariable) {
            InterfaceC16820sZ interfaceC16820sZ = A05;
            A05 = null;
            if (interfaceC16820sZ != null && (context instanceof Application)) {
                interfaceC16820sZ.invoke();
                ((Application) context).registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.instagram.process.asyncinit.AsyncColdStart$onApplicationInited$1$callback$1
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

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityCreated(Activity activity, Bundle bundle) {
                        List list = AbstractC58327PtK.A04;
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((InterfaceC16820sZ) it.next()).invoke();
                        }
                        list.clear();
                        ((Application) context).unregisterActivityLifecycleCallbacks(this);
                    }
                });
            } else {
                List list = A04;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((InterfaceC16820sZ) it.next()).invoke();
                }
                list.clear();
            }
            C11T.A00 = null;
            conditionVariable.open();
            AbstractC167007dF.A0J().post(new C2ZR(context));
        }
    }

    public static final void A03() {
        ConditionVariable conditionVariable = A02;
        long j = LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT;
        if (!conditionVariable.block(LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT)) {
            if (!conditionVariable.block(15000L)) {
                j = 20000;
                conditionVariable.block();
            }
            C0YB.A00.markerGenerateWithAnnotations(25107982, (short) 113, j, TimeUnit.MILLISECONDS, null);
        }
    }

    public static final void A05(InterfaceC16820sZ interfaceC16820sZ) {
        ConditionVariable conditionVariable = A02;
        synchronized (conditionVariable) {
            if (conditionVariable.block(-1L)) {
                interfaceC16820sZ.invoke();
            } else {
                A04.add(interfaceC16820sZ);
            }
        }
    }

    public static final void A06(InterfaceC16660sJ interfaceC16660sJ) {
        List list = A03;
        synchronized (list) {
            list.add(interfaceC16660sJ);
        }
    }

    public static final boolean A07() {
        return A01;
    }

    public static final boolean A08() {
        return A02.block(-1L);
    }

    public static final boolean A09() {
        return A00;
    }
}
