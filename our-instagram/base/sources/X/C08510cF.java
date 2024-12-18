package X;

import com.facebook.common.perfcounter.PerfCounter;
import com.facebook.endtoend.EndToEnd;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;

/* renamed from: X.0cF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C08510cF extends C0k0 {
    @Override // X.InterfaceC06630Wx
    public final String Bix() {
        return "ig_perf_event_info_stats";
    }

    @Override // X.InterfaceC06630Wx
    public final int Biy() {
        return 33;
    }

    @Override // X.C0k0
    public final /* bridge */ /* synthetic */ Object A03() {
        int i;
        C11150iW c11150iW = new C11150iW();
        if (C09270dc.A02() && !c11150iW.A0T) {
            if (PerfCounter.A00 == -1) {
                if (new File("/proc/sys/kernel/perf_event_paranoid").exists() && (EndToEnd.A04() || new File("/data/local/tmp/ctscan_perfcounter_collect").exists())) {
                    i = 1;
                } else {
                    i = 0;
                }
                PerfCounter.A00 = i;
            }
            if (PerfCounter.A00 == 1) {
                synchronized (PerfCounter.A02) {
                    int i2 = PerfCounter.A01;
                    if (i2 > 0) {
                        PerfCounter.A01 = i2 + 1;
                    } else {
                        if (!PerfCounter.A03) {
                            try {
                                try {
                                    try {
                                        C09270dc.A03("perfcounter");
                                        PerfCounter.A03 = true;
                                    } catch (Exception e) {
                                        android.util.Log.e("PerfCounter", "Cannot Initialize PerfCounter due to unknown error", e);
                                    }
                                } catch (Error e2) {
                                    android.util.Log.e("PerfCounter", "Cannot Initialize PerfCounter due to unknown error", e2);
                                }
                            } catch (UnsatisfiedLinkError e3) {
                                android.util.Log.e("PerfCounter", "Cannot find native library for PerfCounter", e3);
                            }
                        }
                        try {
                            if (PerfCounter.nativeBegin()) {
                                PerfCounter.A01 = 1;
                            }
                        } catch (UnsatisfiedLinkError e4) {
                            android.util.Log.e("PerfCounter", "Cannot find PerfCounter.nativeBegin()", e4);
                        }
                    }
                }
            }
            C11150iW.A02(c11150iW, false);
            c11150iW.A0T = true;
            c11150iW.A0S = C11150iW.A01(null);
        }
        C09170dP.A06.size();
        return c11150iW;
    }

    @Override // X.InterfaceC06630Wx
    public final /* bridge */ /* synthetic */ ListenableFuture AON(RunnableC16080r6 runnableC16080r6, Object obj, Object obj2) {
        C11150iW c11150iW = (C11150iW) obj;
        C14360o3.A0B(runnableC16080r6, 0);
        if (c11150iW != null && c11150iW.A0U) {
            long j = c11150iW.A0G;
            long j2 = c11150iW.A0J;
            long j3 = c11150iW.A0I;
            long j4 = c11150iW.A0L;
            long j5 = c11150iW.A0H;
            long j6 = c11150iW.A0K;
            long j7 = c11150iW.A08;
            long j8 = c11150iW.A09;
            if (j != -1 || j3 != -1 || j5 != -1 || j7 != -1 || j8 != -1) {
                C0XF BTP = runnableC16080r6.BTP();
                C0XF.A00(BTP);
                BTP.A01.add("perf_event_info");
                if (j != -1) {
                    runnableC16080r6.BTP().A02("user_instruction_count", j);
                }
                if (j2 != -1) {
                    runnableC16080r6.BTP().A02("user_kernel_instruction_count", j2);
                }
                if (j3 != -1) {
                    runnableC16080r6.BTP().A02("user_instruction_count_ps", j3);
                }
                if (j4 != -1) {
                    runnableC16080r6.BTP().A02("user_kernel_instruction_count_ps", j4);
                }
                if (j5 != -1) {
                    runnableC16080r6.BTP().A02("user_instruction_count_main_th", j5);
                }
                if (j6 != -1) {
                    runnableC16080r6.BTP().A02("user_kernel_instruction_count_main_th", j6);
                }
                if (j7 != -1) {
                    runnableC16080r6.BTP().A02("perf_cpu_clock", j7);
                }
                if (j8 != -1) {
                    runnableC16080r6.BTP().A02("perf_task_clock", j8);
                }
            }
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
            c11150iW.A03(8);
        }
    }
}
