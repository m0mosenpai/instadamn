package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class OE8 {
    public final View A00;
    public final UserSession A01;
    public final EnumC142806cg A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final AbstractC59962oe A05;

    public OE8(View view, AbstractC59962oe abstractC59962oe, UserSession userSession, EnumC142806cg enumC142806cg) {
        C14360o3.A0B(userSession, 2);
        this.A05 = abstractC59962oe;
        this.A01 = userSession;
        this.A00 = view;
        this.A02 = enumC142806cg;
        C57547PgL c57547PgL = new C57547PgL(this, 39);
        InterfaceC09390do A01 = C57547PgL.A01(new C57547PgL(abstractC59962oe, 36), EnumC09460dv.A02, 37);
        this.A04 = AbstractC25225BEi.A0a(new C57547PgL(A01, 38), c57547PgL, C57532Pg6.A00(null, A01, 34), AbstractC25225BEi.A1D(C50884MeF.class));
        this.A03 = C57547PgL.A00(this, 35);
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = abstractC59962oe.getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new C57166PZk(c07s, this, viewLifecycleOwner, null, 49), C07Y.A00(viewLifecycleOwner));
    }
}
