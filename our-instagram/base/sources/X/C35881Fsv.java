package X;

import android.R;

/* renamed from: X.Fsv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35881Fsv implements InterfaceC28041Xi {
    public final /* synthetic */ AbstractC59962oe A00;
    public final /* synthetic */ C07270a1 A01;
    public final /* synthetic */ InterfaceC37227Gac A02;
    public final /* synthetic */ InterfaceC37104GWp A03;
    public final /* synthetic */ EgX A04;

    public C35881Fsv(AbstractC59962oe abstractC59962oe, C07270a1 c07270a1, InterfaceC37227Gac interfaceC37227Gac, InterfaceC37104GWp interfaceC37104GWp, EgX egX) {
        this.A04 = egX;
        this.A01 = c07270a1;
        this.A00 = abstractC59962oe;
        this.A02 = interfaceC37227Gac;
        this.A03 = interfaceC37104GWp;
    }

    @Override // X.InterfaceC28041Xi
    public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
        EgQ egQ = (EgQ) obj;
        EgX egX = this.A04;
        FP3 fp3 = FP3.A00;
        C33629Etf c33629Etf = egX.A00;
        if (c33629Etf != null) {
            c33629Etf.A00();
        }
        egQ.getClass();
        Object obj2 = egQ.A02.get();
        obj2.getClass();
        if (obj2 == EnumC33323EoI.SUCCESSFUL) {
            Object obj3 = null;
            obj3.getClass();
            throw C00O.createAndThrow();
        }
        C193328hC A0c = AbstractC31176DnK.A0c(this.A00);
        A0c.A09(2131961882);
        AbstractC31176DnK.A17(null, A0c, R.string.ok);
        return false;
    }
}
