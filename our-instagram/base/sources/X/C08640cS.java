package X;

import android.os.Process;
import com.facebook.common.dextricks.stats.ClassLoadingStats;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.0cS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C08640cS extends C0k0 {
    @Override // X.InterfaceC06630Wx
    public final String Bix() {
        return "ig_io_perf_stats";
    }

    @Override // X.InterfaceC06630Wx
    public final int Biy() {
        return 10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C0k0
    public final /* bridge */ /* synthetic */ Object A03() {
        ClassLoadingStats classLoadingStats;
        C11150iW c11150iW = new C11150iW();
        long[] A00 = C0BE.A00("/proc/self/stat");
        c11150iW.A0D = A00[0];
        c11150iW.A0C = A00[2];
        c11150iW.A0A = A00[5];
        c11150iW.A0F = C0BE.A00(AnonymousClass001.A0c("/proc/self/task/", "/stat", Process.myTid()))[2];
        C0BF A002 = C0BG.A00();
        c11150iW.A03 = A002.A00;
        c11150iW.A06 = A002.A02;
        c11150iW.A07 = A002.A04;
        c11150iW.A0N = C0B9.A00();
        java.util.Set set = C09170dP.A06;
        c11150iW.A0Q = new C0GQ(set.size());
        c11150iW.A0V = true;
        c11150iW.A0U = false;
        c11150iW.A01 = -1;
        AtomicReference atomicReference = ClassLoadingStats.A00;
        if (atomicReference.get() == null) {
            classLoadingStats = new Object();
        } else {
            classLoadingStats = (ClassLoadingStats) atomicReference.get();
        }
        c11150iW.A0P = new ClassLoadingStats.SnapshotStats(classLoadingStats.getClassLoadsAttempted(), classLoadingStats.getClassLoadsFailed(), classLoadingStats.getDexFileQueries(), classLoadingStats.getLocatorAssistedClassLoads(), classLoadingStats.getIncorrectDfaGuesses());
        set.size();
        return c11150iW;
    }

    @Override // X.InterfaceC06630Wx
    public final /* bridge */ /* synthetic */ ListenableFuture AON(RunnableC16080r6 runnableC16080r6, Object obj, Object obj2) {
        int i;
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        C11150iW c11150iW = (C11150iW) obj;
        C14360o3.A0B(runnableC16080r6, 0);
        if (c11150iW != null && c11150iW.A0U) {
            C0XF BTP = runnableC16080r6.BTP();
            C0XF.A00(BTP);
            BTP.A01.add("io_stats");
            runnableC16080r6.BTP().A02("ps_flt", c11150iW.A0C);
            runnableC16080r6.BTP().A02("proc_delayacct_blkio_ticks", c11150iW.A0A);
            C0XF BTP2 = runnableC16080r6.BTP();
            C0GQ c0gq = c11150iW.A0Q;
            if (c0gq != null) {
                i = c0gq.A00;
            } else {
                i = -1;
            }
            BTP2.A03("loaded_libs", Integer.valueOf(i));
            long j8 = c11150iW.A0F;
            if (j8 != -1) {
                runnableC16080r6.BTP().A02("th_flt", j8);
            }
            runnableC16080r6.BTP().A03("class_load_attempts", Integer.valueOf(c11150iW.A0P.A00));
            runnableC16080r6.BTP().A03("dex_queries", Integer.valueOf(c11150iW.A0P.A02));
            runnableC16080r6.BTP().A03("class_loads_failed", Integer.valueOf(c11150iW.A0P.A01));
            runnableC16080r6.BTP().A03("locator_assists", Integer.valueOf(c11150iW.A0P.A04));
            runnableC16080r6.BTP().A03("wrong_dfa_guesses", Integer.valueOf(c11150iW.A0P.A03));
            long j9 = c11150iW.A03;
            if (j9 != -1) {
                runnableC16080r6.BTP().A02("allocstall", j9);
            }
            long j10 = c11150iW.A06;
            if (j10 != -1) {
                runnableC16080r6.BTP().A02("pages_in", j10);
            }
            long j11 = c11150iW.A07;
            if (j11 != -1) {
                runnableC16080r6.BTP().A02("pages_out", j11);
            }
            runnableC16080r6.BTP().A02("ps_min_flt", c11150iW.A0D);
            C0XF BTP3 = runnableC16080r6.BTP();
            if (c11150iW.A0O == null) {
                j = -1;
            } else {
                C0BC c0bc = C0BB.A00;
                c0bc.A00.block();
                j = c0bc.A03.get();
            }
            BTP3.A02("avail_disk_spc_kb", j);
            C0B9 c0b9 = c11150iW.A0N;
            if (c0b9 != null) {
                long j12 = c0b9.A01;
                if (j12 != -1) {
                    runnableC16080r6.BTP().A02("io_readbytes", j12);
                    C0XF BTP4 = runnableC16080r6.BTP();
                    C0B9 c0b92 = c11150iW.A0N;
                    if (c0b92 != null) {
                        j2 = c0b92.A02;
                    } else {
                        j2 = -1;
                    }
                    BTP4.A02("io_readchars", j2);
                    C0XF BTP5 = runnableC16080r6.BTP();
                    C0B9 c0b93 = c11150iW.A0N;
                    if (c0b93 != null) {
                        j3 = c0b93.A03;
                    } else {
                        j3 = -1;
                    }
                    BTP5.A02("io_readsyscalls", j3);
                    C0XF BTP6 = runnableC16080r6.BTP();
                    C0B9 c0b94 = c11150iW.A0N;
                    if (c0b94 != null) {
                        j4 = c0b94.A04;
                    } else {
                        j4 = -1;
                    }
                    BTP6.A02("io_writebytes", j4);
                    C0XF BTP7 = runnableC16080r6.BTP();
                    C0B9 c0b95 = c11150iW.A0N;
                    if (c0b95 != null) {
                        j5 = c0b95.A05;
                    } else {
                        j5 = -1;
                    }
                    BTP7.A02("io_writechars", j5);
                    C0XF BTP8 = runnableC16080r6.BTP();
                    C0B9 c0b96 = c11150iW.A0N;
                    if (c0b96 != null) {
                        j6 = c0b96.A06;
                    } else {
                        j6 = -1;
                    }
                    BTP8.A02("io_writesyscalls", j6);
                    C0XF BTP9 = runnableC16080r6.BTP();
                    C0B9 c0b97 = c11150iW.A0N;
                    if (c0b97 != null) {
                        j7 = c0b97.A00;
                    } else {
                        j7 = -1;
                    }
                    BTP9.A02("io_cancelledwb", j7);
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
            c11150iW.A03(2);
        }
    }
}
