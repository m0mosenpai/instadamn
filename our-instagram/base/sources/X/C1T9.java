package X;

import X.C1T9;
import X.C27171Tr;
import android.app.Activity;
import android.app.ActivityThread;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.endtoend.EndToEnd;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;

/* renamed from: X.1T9, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1T9 extends C0R8 {
    public final long A00;
    public final Handler A01;
    public final C06K A02;
    public final C211511r A03;
    public final boolean A04;
    public final boolean A05;

    @Override // X.InterfaceC05710Rv
    public final String getName() {
        return "ObjectCountDebugger";
    }

    @Override // X.InterfaceC05710Rv
    public final void CNZ() {
        if (this.A05) {
            ActivityThread.currentActivityThread().getApplication().registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.facebook.fixie.fixes.memory.leak.ObjectCountDebugger$2
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
                    C27171Tr.A04.A00(activity.getClass());
                    if (activity instanceof FragmentActivity) {
                        ((FragmentActivity) activity).mFragments.A00.A03.A0q(C1T9.this.A02, true);
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityDestroyed(Activity activity) {
                    if (activity instanceof FragmentActivity) {
                        ((FragmentActivity) activity).mFragments.A00.A03.A0p(C1T9.this.A02);
                    }
                }
            });
            Activity A00 = C0Ct.A00();
            if (A00 != null) {
                C27171Tr.A04.A00(A00.getClass());
                if (A00 instanceof FragmentActivity) {
                    ((FragmentActivity) A00).mFragments.A00.A03.A0q(this.A02, true);
                }
            }
            if (this.A04 && this.A03 != null) {
                this.A01.postDelayed(new Runnable() { // from class: X.1UD
                    @Override // java.lang.Runnable
                    public final void run() {
                        C211511r c211511r = C1T9.this.A03;
                        if (c211511r != null) {
                            C27171Tr c27171Tr = C27171Tr.A04;
                            Class[] A002 = c211511r.A00();
                            synchronized (c27171Tr) {
                                for (Class cls : A002) {
                                    if (cls != null && c27171Tr.A00 < 133 && c27171Tr.A01.add(cls)) {
                                        Class[] clsArr = c27171Tr.A02;
                                        int i = c27171Tr.A00;
                                        c27171Tr.A00 = i + 1;
                                        clsArr[i] = cls;
                                    }
                                }
                            }
                        }
                    }
                }, this.A00);
            }
            A08();
        }
    }

    public C1T9(C211511r c211511r, C0Rw c0Rw) {
        super(c0Rw);
        boolean z;
        long j;
        this.A02 = new C06K() { // from class: X.1TA
            @Override // X.C06K
            public final void A02(Bundle bundle, Fragment fragment, AbstractC10360h2 abstractC10360h2) {
                C27171Tr.A04.A00(fragment.getClass());
            }
        };
        this.A03 = c211511r;
        C0Rw A05 = A05(C10420hA.class);
        boolean z2 = true;
        if (C1TB.A00 && A05 != null && (EndToEnd.A05() || C20150ym.A07(AbstractC20100yh.A00(36314103112206798L)))) {
            z = true;
        } else {
            z = false;
        }
        this.A05 = z;
        if (A05 == null || (!EndToEnd.A05() && !C20150ym.A07(AbstractC20100yh.A00(36314103112272335L)))) {
            z2 = false;
        }
        this.A04 = z2;
        if (A05 != null) {
            j = C20150ym.A01(AbstractC20100yh.A00(36595578089048261L));
        } else {
            j = StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS;
        }
        this.A00 = j;
        this.A01 = c0Rw.Aex();
    }
}
