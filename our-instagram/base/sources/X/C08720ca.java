package X;

import android.os.Process;
import android.os.SystemClock;
import com.google.common.util.concurrent.ListenableFuture;

/* renamed from: X.0ca, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C08720ca extends C0k0 {
    @Override // X.InterfaceC06630Wx
    public final String Bix() {
        return "ig_cpu_perf_stats";
    }

    @Override // X.InterfaceC06630Wx
    public final int Biy() {
        return 9;
    }

    @Override // X.C0k0
    public final /* bridge */ /* synthetic */ Object A03() {
        C11150iW c11150iW = new C11150iW();
        int myTid = Process.myTid();
        c11150iW.A02 = myTid;
        c11150iW.A00 = Process.getThreadPriority(myTid);
        c11150iW.A0B = Process.getElapsedCpuTime();
        c11150iW.A0E = SystemClock.currentThreadTimeMillis();
        c11150iW.A0V = true;
        c11150iW.A0U = false;
        C09170dP.A06.size();
        return c11150iW;
    }

    @Override // X.InterfaceC06630Wx
    public final /* bridge */ /* synthetic */ ListenableFuture AON(RunnableC16080r6 runnableC16080r6, Object obj, Object obj2) {
        C11150iW c11150iW = (C11150iW) obj;
        C14360o3.A0B(runnableC16080r6, 0);
        if (c11150iW != null && c11150iW.A0U) {
            C0XF BTP = runnableC16080r6.BTP();
            C0XF.A00(BTP);
            BTP.A01.add("cpu_stats");
            runnableC16080r6.BTP().A03("start_pri", Integer.valueOf(c11150iW.A00));
            runnableC16080r6.BTP().A03("stop_pri", Integer.valueOf(c11150iW.A01));
            runnableC16080r6.BTP().A02("ps_cpu_ms", c11150iW.A0B);
            long j = c11150iW.A0E;
            if (j != -1) {
                runnableC16080r6.BTP().A02("th_cpu_ms", j);
            }
            runnableC16080r6.BTP().A03("low_power_state", c11150iW.A0R);
        }
        return C25191Kx.A01;
    }

    @Override // X.InterfaceC06630Wx
    public final Class ByC() {
        return C11150iW.class;
    }

    @Override // X.InterfaceC06630Wx
    public final boolean CTn(AbstractC208210e abstractC208210e) {
        return true;
    }

    @Override // X.C0k0, X.InterfaceC06630Wx
    public final /* bridge */ /* synthetic */ void EoT(Object obj) {
        C11150iW c11150iW = (C11150iW) obj;
        if (c11150iW != null) {
            c11150iW.A03(1);
        }
    }
}
