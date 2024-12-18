package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;

/* renamed from: X.OwR, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56159OwR implements C3PE {
    public final InterfaceC09390do A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0C;

    public C56159OwR(View view, AbstractC59962oe abstractC59962oe, UserSession userSession, C54495O5x c54495O5x) {
        C14360o3.A0B(userSession, 2);
        C57532Pg6 A00 = C57532Pg6.A00(abstractC59962oe, userSession, 45);
        InterfaceC09390do A01 = C57540PgE.A01(new C57540PgE(abstractC59962oe, 40), EnumC09460dv.A02, 41);
        this.A0C = AbstractC25225BEi.A0a(new C57540PgE(A01, 42), A00, C57532Pg6.A00(null, A01, 44), AbstractC25225BEi.A1D(C50981Mfo.class));
        this.A02 = C57540PgE.A00(view, 31);
        this.A00 = C57540PgE.A00(view, 29);
        this.A0B = C57540PgE.A00(view, 39);
        this.A0A = C57540PgE.A00(view, 38);
        this.A04 = AbstractC09440dt.A01(new C43210J8h(41, userSession, view, abstractC59962oe));
        this.A03 = C57540PgE.A00(view, 32);
        this.A01 = C57540PgE.A00(view, 30);
        this.A05 = C57540PgE.A00(view, 33);
        this.A07 = C57540PgE.A00(view, 35);
        this.A06 = C57540PgE.A00(this, 34);
        this.A09 = C57540PgE.A00(this, 37);
        this.A08 = C57540PgE.A00(this, 36);
        C3P9 A0s = AbstractC166987dD.A0s(AbstractC167007dF.A0L(this.A01));
        A0s.A04 = this;
        Integer num = C05F.A01;
        A0s.A05 = num;
        A0s.A00();
        C3P9 A0s2 = AbstractC166987dD.A0s(AbstractC167007dF.A0L(this.A05));
        A0s2.A04 = this;
        A0s2.A05 = num;
        A0s2.A00();
        ((GradientSpinner) AbstractC166987dD.A17(this.A03)).A06();
        AbstractC37301Gc2.A0w(abstractC59962oe.getViewLifecycleOwner(), ((C50981Mfo) this.A0C.getValue()).A01, new C57751Pje(25, abstractC59962oe, this), 25);
        JQ0.A11(abstractC59962oe, new PZN(c54495O5x, this, null, 11), ((C50981Mfo) this.A0C.getValue()).A06);
    }

    @Override // X.C3PE
    public final void DQY(View view) {
    }

    @Override // X.C3PE
    public final boolean DsE(View view) {
        C14360o3.A0B(view, 0);
        if (view.equals(AbstractC166987dD.A17(this.A01)) || view.equals(AbstractC166987dD.A17(this.A05))) {
            AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(this.A0C);
            C57164PZi.A03(A0Z, AbstractC141776au.A00(A0Z), 15);
            return true;
        }
        return true;
    }
}
