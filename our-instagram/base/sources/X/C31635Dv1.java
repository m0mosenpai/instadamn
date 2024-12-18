package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;

/* renamed from: X.Dv1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31635Dv1 extends AbstractC66422zJ {
    public final C31622Duo A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C31461Ds5 c31461Ds5 = (C31461Ds5) interfaceC66482zP;
        E1P e1p = (E1P) c3oo;
        AbstractC167017dG.A1N(c31461Ds5, e1p);
        C38311Gsx c38311Gsx = e1p.A00;
        c38311Gsx.A00();
        c38311Gsx.A01(c31461Ds5.A02);
        c38311Gsx.A03(c31461Ds5.A00, new FpQ(29, this, c31461Ds5));
    }

    public C31635Dv1(C31622Duo c31622Duo) {
        this.A00 = c31622Duo;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new E1P(new C38311Gsx(AbstractC31176DnK.A04(viewGroup)));
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C31461Ds5.class;
    }
}
