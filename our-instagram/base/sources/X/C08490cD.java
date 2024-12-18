package X;

import com.google.common.util.concurrent.ListenableFuture;

/* renamed from: X.0cD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C08490cD extends C0k0 {
    @Override // X.InterfaceC06630Wx
    public final String Bix() {
        return "startup_stats";
    }

    @Override // X.InterfaceC06630Wx
    public final int Biy() {
        return 12;
    }

    @Override // X.C0k0
    public final /* bridge */ /* synthetic */ Object A03() {
        C0YQ c0yq = new C0YQ();
        c0yq.A00 = C1CC.A08;
        c0yq.A01 = C1CC.A09.toString();
        return c0yq;
    }

    @Override // X.InterfaceC06630Wx
    public final /* bridge */ /* synthetic */ ListenableFuture AON(RunnableC16080r6 runnableC16080r6, Object obj, Object obj2) {
        C0YQ c0yq = (C0YQ) obj2;
        if (obj != null && c0yq != null) {
            runnableC16080r6.BTP().A02("app_init_ms", c0yq.A00);
            runnableC16080r6.BTP().A02("time_since_app_init_ms", runnableC16080r6.BUq() - c0yq.A00);
            runnableC16080r6.BTP().A03("startup_status", c0yq.A01);
        }
        return C25191Kx.A01;
    }

    @Override // X.InterfaceC06630Wx
    public final Class ByC() {
        return C0YQ.class;
    }

    @Override // X.InterfaceC06630Wx
    public final boolean CTn(AbstractC208210e abstractC208210e) {
        return C20150ym.A07(AbstractC20100yh.A00(36315533330681198L));
    }
}
