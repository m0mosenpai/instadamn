package X;

import android.os.Debug;
import com.google.common.util.concurrent.ListenableFuture;

/* renamed from: X.0cw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C08920cw extends C0k0 {
    @Override // X.InterfaceC06630Wx
    public final String Bix() {
        return "runtime_stats";
    }

    @Override // X.InterfaceC06630Wx
    public final int Biy() {
        return 38;
    }

    @Override // X.C0k0
    public final /* bridge */ /* synthetic */ Object A03() {
        C0YH c0yh = new C0YH();
        String runtimeStat = Debug.getRuntimeStat("art.gc.gc-count");
        if (runtimeStat != null) {
            c0yh.A01 = Integer.parseInt(runtimeStat);
        }
        if (Debug.getRuntimeStat("art.gc.gc-time") != null) {
            c0yh.A03 = Integer.parseInt(r0);
        }
        String runtimeStat2 = Debug.getRuntimeStat("art.gc.blocking-gc-count");
        if (runtimeStat2 != null) {
            c0yh.A00 = Integer.parseInt(runtimeStat2);
        }
        if (Debug.getRuntimeStat("art.gc.blocking-gc-time") != null) {
            c0yh.A02 = Integer.parseInt(r0);
        }
        return c0yh;
    }

    @Override // X.InterfaceC06630Wx
    public final /* bridge */ /* synthetic */ ListenableFuture AON(RunnableC16080r6 runnableC16080r6, Object obj, Object obj2) {
        C0YH c0yh = (C0YH) obj;
        C0YH c0yh2 = (C0YH) obj2;
        if (c0yh != null && c0yh2 != null) {
            runnableC16080r6.BTP().A03("gc_count", Integer.valueOf(c0yh2.A01 - c0yh.A01));
            runnableC16080r6.BTP().A02("gc_time_ms", c0yh2.A03 - c0yh.A03);
            runnableC16080r6.BTP().A03("blocking_gc_count", Integer.valueOf(c0yh2.A00 - c0yh.A00));
            runnableC16080r6.BTP().A02("blocking_gc_time_ms", c0yh2.A02 - c0yh.A02);
        }
        return C25191Kx.A01;
    }

    @Override // X.InterfaceC06630Wx
    public final Class ByC() {
        return C0YH.class;
    }

    @Override // X.InterfaceC06630Wx
    public final boolean CTn(AbstractC208210e abstractC208210e) {
        return C20150ym.A07(AbstractC20100yh.A00(36315030819441620L));
    }
}
