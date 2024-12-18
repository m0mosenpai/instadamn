package X;

import com.google.common.util.concurrent.ListenableFuture;

/* renamed from: X.0im, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11300im implements InterfaceC06630Wx {
    @Override // X.InterfaceC06630Wx
    public final String Bix() {
        return "navigation_data";
    }

    @Override // X.InterfaceC06630Wx
    public final int Biy() {
        return 50;
    }

    @Override // X.InterfaceC06630Wx
    public final /* bridge */ /* synthetic */ ListenableFuture AON(RunnableC16080r6 runnableC16080r6, Object obj, Object obj2) {
        if (obj != null) {
            runnableC16080r6.BTP().A03("attribution_id_v2_at_start", obj);
        }
        if (obj2 != null) {
            if (obj == null) {
                runnableC16080r6.BTP().A03("attribution_id_v2_at_start", obj2);
            }
            runnableC16080r6.BTP().A03("attribution_id_v2_at_stop", obj2);
        }
        return C25191Kx.A01;
    }

    @Override // X.InterfaceC06630Wx
    public final Class ByC() {
        return String.class;
    }

    @Override // X.InterfaceC06630Wx
    public final Class Bzs() {
        return String.class;
    }

    @Override // X.InterfaceC06630Wx
    public final boolean CTn(AbstractC208210e abstractC208210e) {
        return true;
    }

    @Override // X.InterfaceC06630Wx
    public final /* bridge */ /* synthetic */ void EoT(Object obj) {
    }

    @Override // X.InterfaceC06630Wx
    public final /* bridge */ /* synthetic */ Object EmJ(int i, int i2) {
        return AbstractC25041Ki.A00;
    }

    @Override // X.InterfaceC06630Wx
    public final /* bridge */ /* synthetic */ Object Emc(int i, int i2) {
        return AbstractC25041Ki.A00;
    }
}
