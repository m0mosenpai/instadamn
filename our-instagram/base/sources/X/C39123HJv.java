package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.Product;

/* renamed from: X.HJv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39123HJv extends AbstractC64162vb {
    public final UserSession A00;
    public final C41702IdW A01;
    public final C41727Idy A02;
    public final boolean A03;

    @Override // X.AbstractC64162vb
    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
        InterfaceC02590Ai A0f;
        String str;
        IN1 in1 = (IN1) obj;
        IKK ikk = (IKK) obj2;
        AbstractC167017dG.A1a(in1, ikk);
        if (this.A03) {
            C41702IdW c41702IdW = this.A01;
            if (c41702IdW != null) {
                Product product = ikk.A04;
                int i = ikk.A02;
                int i2 = ikk.A01;
                C38683GzO A03 = C128205qp.A03(c41702IdW.A03, product);
                A0f = AbstractC166987dD.A0f(c41702IdW.A02, "instagram_ads_app_hero_carousel_impression");
                if (A0f.isSampled()) {
                    C38642Gyj c38642Gyj = c41702IdW.A01;
                    if (c38642Gyj == null || (str = c38642Gyj.A05) == null) {
                        str = "";
                    }
                    AbstractC37300Gc1.A0o(A0f, C41702IdW.A00(A0f, c41702IdW, str));
                    C41702IdW.A01(A0f, c41702IdW, C38683GzO.A01(A0f, A03));
                    AbstractC37304Gc5.A11(A0f, i2);
                    A0f.AAP("position_in_carousel", String.valueOf(i));
                } else {
                    return;
                }
            } else {
                return;
            }
        } else {
            C41727Idy c41727Idy = this.A02;
            Product product2 = ikk.A04;
            String A01 = in1.A01();
            String str2 = in1.A03;
            int i3 = ikk.A02;
            int i4 = ikk.A01;
            String A00 = I9A.A00(this.A00, in1);
            A0f = AbstractC166987dD.A0f(c41727Idy.A04, "instagram_shopping_pdp_hero_carousel_item_impression");
            if (!A0f.isSampled()) {
                return;
            }
            AbstractC37303Gc4.A0j(A0f, product2);
            AbstractC37301Gc2.A17(A0f, AbstractC37302Gc3.A0d(product2));
            A0f.AAP("item_id", A01);
            A0f.AAP("item_type", str2);
            AbstractC37304Gc5.A11(A0f, i4);
            AbstractC37302Gc3.A10(A0f, product2);
            A0f.AAP("position", String.valueOf(i3));
            C41727Idy.A02(A0f, c41727Idy);
            AbstractC37300Gc1.A0t(A0f, c41727Idy.A0H);
            AbstractC25233BEq.A17(A0f, "checkout_session_id", c41727Idy.A0E);
            C38321qM c38321qM = c41727Idy.A00;
            if (c38321qM != null) {
                AbstractC37302Gc3.A0x(A0f, c38321qM);
            }
            if (A00 != null) {
                A0f.AAK(C4SX.A00(A00), "item_media_author_id");
            }
            AbstractC37304Gc5.A13(A0f, c41727Idy.A03);
            AbstractC37303Gc4.A0b(A0f);
        }
        A0f.Cht();
    }

    @Override // X.AbstractC64162vb
    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
        InterfaceC02590Ai A0f;
        String str;
        IN1 in1 = (IN1) obj;
        IKK ikk = (IKK) obj2;
        AbstractC167017dG.A1a(in1, ikk);
        if (this.A03) {
            C41702IdW c41702IdW = this.A01;
            if (c41702IdW != null) {
                Product product = ikk.A04;
                int i = ikk.A02;
                int i2 = ikk.A01;
                C38683GzO A03 = C128205qp.A03(c41702IdW.A03, product);
                A0f = AbstractC166987dD.A0f(c41702IdW.A02, "instagram_ads_app_hero_carousel_subimpression");
                if (A0f.isSampled()) {
                    C38642Gyj c38642Gyj = c41702IdW.A01;
                    if (c38642Gyj == null || (str = c38642Gyj.A05) == null) {
                        str = "";
                    }
                    AbstractC37300Gc1.A0o(A0f, C41702IdW.A00(A0f, c41702IdW, str));
                    C41702IdW.A01(A0f, c41702IdW, C38683GzO.A01(A0f, A03));
                    AbstractC37304Gc5.A11(A0f, i2);
                    A0f.AAP("position_in_carousel", String.valueOf(i));
                } else {
                    return;
                }
            } else {
                return;
            }
        } else {
            C41727Idy c41727Idy = this.A02;
            Product product2 = ikk.A04;
            String A01 = in1.A01();
            String str2 = in1.A03;
            int i3 = ikk.A02;
            int i4 = ikk.A01;
            String A00 = I9A.A00(this.A00, in1);
            A0f = AbstractC166987dD.A0f(c41727Idy.A04, "instagram_shopping_pdp_hero_carousel_item_subimpression");
            AbstractC37303Gc4.A0j(A0f, product2);
            String str3 = null;
            AbstractC37301Gc2.A17(A0f, AbstractC37301Gc2.A0o(product2.A0B));
            A0f.AAP("item_id", A01);
            A0f.AAP("item_type", str2);
            AbstractC37304Gc5.A11(A0f, i4);
            AbstractC37302Gc3.A10(A0f, product2);
            A0f.AAP("position", String.valueOf(i3));
            C41727Idy.A02(A0f, c41727Idy);
            AbstractC37300Gc1.A0t(A0f, c41727Idy.A0H);
            AbstractC25233BEq.A17(A0f, "checkout_session_id", c41727Idy.A0E);
            C38642Gyj c38642Gyj2 = c41727Idy.A01;
            if (c38642Gyj2 != null) {
                str3 = c38642Gyj2.A06;
            }
            AbstractC37300Gc1.A0o(A0f, str3);
            C38321qM c38321qM = c41727Idy.A00;
            if (c38321qM != null) {
                AbstractC37302Gc3.A0x(A0f, c38321qM);
            }
            if (A00 != null) {
                A0f.AAK(C4SX.A00(A00), "item_media_author_id");
            }
            AbstractC37304Gc5.A13(A0f, c41727Idy.A03);
            AbstractC37303Gc4.A0b(A0f);
        }
        A0f.Cht();
    }

    public C39123HJv(UserSession userSession, C41702IdW c41702IdW, C41727Idy c41727Idy, boolean z) {
        super(AbstractC37302Gc3.A0J(userSession));
        this.A00 = userSession;
        this.A02 = c41727Idy;
        this.A01 = c41702IdW;
        this.A03 = z;
    }
}
