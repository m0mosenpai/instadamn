package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.Owl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56178Owl implements InterfaceC60152ox {
    public final AbstractC59962oe A00;
    public final C3I9 A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;

    public C56178Owl(View view, AbstractC59962oe abstractC59962oe, UserSession userSession, EnumC142806cg enumC142806cg) {
        boolean A1V = AbstractC167007dF.A1V(userSession);
        this.A00 = abstractC59962oe;
        C43210J8h c43210J8h = new C43210J8h(40, this, enumC142806cg, userSession);
        InterfaceC09390do A01 = C57547PgL.A01(new C57547PgL(abstractC59962oe, 44), EnumC09460dv.A02, 45);
        this.A07 = AbstractC25225BEi.A0a(new C57547PgL(A01, 46), c43210J8h, C57532Pg6.A00(null, A01, 35), AbstractC25225BEi.A1D(C50958MfR.class));
        this.A05 = C57547PgL.A00(view, 43);
        this.A06 = C57547PgL.A00(this, 47);
        this.A03 = C57547PgL.A00(this, 41);
        this.A02 = C57547PgL.A00(this, 40);
        this.A04 = C57547PgL.A00(this, 42);
        C3I8 A012 = C3I7.A01(this, false, false);
        this.A01 = A012;
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = abstractC59962oe.getViewLifecycleOwner();
        C57312k6 A00 = C07Y.A00(viewLifecycleOwner);
        C57169PZn c57169PZn = new C57169PZn(userSession, viewLifecycleOwner, c07s, this, null, 35);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        C07X A0K = AbstractC31173DnH.A0K(abstractC59962oe, anonymousClass191, c57169PZn, A00);
        AbstractC23641Du.A05(anonymousClass191, new C57168PZm(A0K, c07s, this, (InterfaceC23621Ds) null, A1V ? 1 : 0), C07Y.A00(A0K));
        Ok4.A00(AbstractC167007dF.A0L(this.A02), 31, this);
        A012.A9e(this);
        MSX.A16(this.A00, this.A01);
    }

    @Override // X.InterfaceC60152ox
    public final void DOK(int i, boolean z) {
        AbstractC166997dE.A1Y(((C50958MfR) this.A07.getValue()).A09, AbstractC167007dF.A1O(i));
    }
}
