package X;

import android.graphics.Bitmap;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class OFH {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public Bitmap A04;
    public final C70474WYf A05;
    public final OyQ A06;
    public final OyP A07;
    public final InterfaceC09390do A08;

    public OFH(AbstractC59962oe abstractC59962oe, UserSession userSession, C22985ABk c22985ABk, OyQ oyQ, OyP oyP) {
        boolean A1V = AbstractC167007dF.A1V(userSession);
        this.A06 = oyQ;
        this.A07 = oyP;
        C57556PgU c57556PgU = new C57556PgU(userSession, A1V ? 1 : 0);
        InterfaceC09390do A00 = C57550PgO.A00(C57550PgO.A01(abstractC59962oe, 48), EnumC09460dv.A02, 49);
        this.A08 = AbstractC25225BEi.A0a(new C57556PgU(A00, 0), c57556PgU, C57530Pg4.A00(null, A00, 39), AbstractC25225BEi.A1D(C50951MfK.class));
        Bitmap createBitmap = Bitmap.createBitmap(A1V ? 1 : 0, A1V ? 1 : 0, Bitmap.Config.ARGB_8888);
        C14360o3.A07(createBitmap);
        this.A04 = createBitmap;
        this.A05 = new C70474WYf(null, new C55763OpX(this));
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = abstractC59962oe.getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new C57169PZn(viewLifecycleOwner, c07s, c22985ABk, this, null, 38), C07Y.A00(viewLifecycleOwner));
        JQ0.A11(abstractC59962oe, C57167PZl.A01(this, null, 31), ((C50951MfK) this.A08.getValue()).A04);
    }
}
