package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.Product;

/* renamed from: X.HJj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39111HJj extends AbstractC64162vb {
    public final HCB A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39111HJj(UserSession userSession, HCB hcb) {
        super(AbstractC37302Gc3.A0J(userSession));
        if (userSession != null) {
            this.A00 = hcb;
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.AbstractC64162vb
    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
        IN1 in1 = (IN1) obj;
        C14360o3.A0B(in1, 0);
        HCB hcb = this.A00;
        C41728Idz A0L = AbstractC37304Gc5.A0L(hcb);
        String A01 = in1.A01();
        String str = in1.A03;
        int indexOf = hcb.A04.indexOf(in1);
        int size = hcb.A04.size();
        boolean A05 = HCB.A05(hcb, in1);
        boolean z = hcb.A05;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A0L.A02, "instagram_shopping_lightbox_item_impression");
        if (A0f.isSampled()) {
            Product product = A0L.A05;
            AbstractC37303Gc4.A0j(A0f, product);
            String A0o = AbstractC37301Gc2.A0o(product.A0B);
            if (A0o == null) {
                A0o = "";
            }
            A0f.AAP("merchant_id", A0o);
            AbstractC37302Gc3.A10(A0f, product);
            AbstractC37304Gc5.A17(A0f, A01, str, indexOf);
            C41728Idz.A02(A0f, A0L, size, A05, z);
            C38321qM c38321qM = A0L.A04;
            if (c38321qM != null) {
                UserSession userSession = A0L.A03;
                if (c38321qM.A2E(userSession) != null) {
                    A0f.AAP("media_owner_id", AbstractC37304Gc5.A0e(A0f, userSession, c38321qM));
                }
            }
            A0f.Cht();
        }
    }

    @Override // X.AbstractC64162vb
    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
        IN1 in1 = (IN1) obj;
        C14360o3.A0B(in1, 0);
        HCB hcb = this.A00;
        C41728Idz A0L = AbstractC37304Gc5.A0L(hcb);
        String A01 = in1.A01();
        String str = in1.A03;
        int indexOf = hcb.A04.indexOf(in1);
        int size = hcb.A04.size();
        boolean A05 = HCB.A05(hcb, in1);
        boolean z = hcb.A05;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A0L.A02, "instagram_shopping_lightbox_item_subimpression");
        if (A0f.isSampled()) {
            Product product = A0L.A05;
            AbstractC37303Gc4.A0j(A0f, product);
            String A0o = AbstractC37301Gc2.A0o(product.A0B);
            if (A0o == null) {
                A0o = "";
            }
            A0f.AAP("merchant_id", A0o);
            AbstractC37302Gc3.A10(A0f, product);
            AbstractC37304Gc5.A17(A0f, A01, str, indexOf);
            C41728Idz.A02(A0f, A0L, size, A05, z);
            C38321qM c38321qM = A0L.A04;
            if (c38321qM != null) {
                UserSession userSession = A0L.A03;
                if (c38321qM.A2E(userSession) != null) {
                    A0f.AAP("media_owner_id", AbstractC37304Gc5.A0e(A0f, userSession, c38321qM));
                }
            }
            A0f.Cht();
        }
    }
}
