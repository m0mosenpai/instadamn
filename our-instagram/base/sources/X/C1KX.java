package X;

import X.C17320tT;
import X.C1CC;
import X.C1KX;
import X.C226218q;
import X.InterfaceC19610xo;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.instagram.common.app.AbstractActivityLifecycleCallbacks;
import com.instagram.util.startup.tracking.StartupTrackerActivityMonitor;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1KX, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1KX {
    public int A00;
    public C9BW A01;
    public InterfaceC61452r8 A02;
    public Boolean A03;
    public Boolean A04;
    public Integer A05;
    public Integer A06;
    public Integer A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public ArrayList A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public final long A0K;
    public final Application.ActivityLifecycleCallbacks A0L;
    public final Context A0M;
    public final StartupTrackerActivityMonitor A0N;
    public final C1CA A0O;
    public final List A0P;
    public final /* synthetic */ C226418s A0Q;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.app.Application$ActivityLifecycleCallbacks, com.instagram.util.startup.tracking.StartupTrackerActivityMonitor, java.lang.Object] */
    public C1KX(Context context, C9BW c9bw, final C226418s c226418s, C1CA c1ca, long j) {
        C14360o3.A0B(c9bw, 3);
        this.A0Q = c226418s;
        this.A0O = c1ca;
        this.A01 = c9bw;
        this.A0M = context;
        this.A0K = j;
        this.A0P = new ArrayList();
        this.A0D = new ArrayList();
        ?? obj = new Object();
        this.A0N = obj;
        AbstractActivityLifecycleCallbacks abstractActivityLifecycleCallbacks = null;
        if (c1ca == C1CA.A03) {
            if (context instanceof Application) {
                abstractActivityLifecycleCallbacks = new AbstractActivityLifecycleCallbacks() { // from class: com.instagram.util.startup.tracking.AppStartupTracker$State$1
                    @Override // com.instagram.common.app.AbstractActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityCreated(Activity activity, Bundle bundle) {
                        C1KX c1kx = C1KX.this;
                        if (!c1kx.A0E) {
                            C17320tT A00 = C226218q.A00(c1kx.A0M);
                            int i = A00.getInt("foreground_cold_start_count_since_upgrade", 0) + 1;
                            InterfaceC19610xo ARD = A00.ARD();
                            ARD.E7D("foreground_cold_start_count_since_upgrade", i);
                            ARD.apply();
                            C1CC.A05 = i;
                        }
                        c1kx.A0E = true;
                    }
                };
                ((Application) context).registerActivityLifecycleCallbacks(abstractActivityLifecycleCallbacks);
            } else {
                C0w9.A03("AppStartupTracker", "appContext is not Application");
            }
        }
        Context applicationContext = context.getApplicationContext();
        C14360o3.A0C(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(obj);
        this.A0L = abstractActivityLifecycleCallbacks;
        if (c226418s.A0F.A04) {
            C2ZD c2zd = C2ZD.A09;
            C50137MCl c50137MCl = new C50137MCl(C49679LxA.A02);
            synchronized (c2zd) {
                if (C2ZD.A08 && C1KM.A08 && C2ZD.A0B == null) {
                    C2ZD.A0B = new C22905A8a(c226418s, c50137MCl);
                    if (!this.A0J) {
                        this.A0J = true;
                        this.A00++;
                    }
                }
            }
        }
    }
}
