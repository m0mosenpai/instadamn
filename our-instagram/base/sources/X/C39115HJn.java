package X;

import com.instagram.api.schemas.ProductDiscountInformationDict;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.Product;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.HJn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39115HJn extends AbstractC64162vb {
    public final C41727Idy A00;
    public final String A01;

    @Override // X.AbstractC64162vb
    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
        List list = (List) obj;
        C41726Idx c41726Idx = (C41726Idx) obj2;
        AbstractC167017dG.A1N(list, c41726Idx);
        C41727Idy c41727Idy = this.A00;
        String str = this.A01;
        Product product = c41726Idx.A09;
        C14360o3.A0A(product);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c41727Idy.A04, "shops_promotions_promo_label_impression");
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC31177DnL.A1R(((ProductDiscountInformationDict) it.next()).getId(), A0q);
        }
        A0f.AAk("discount_ids", A0q);
        AbstractC37302Gc3.A10(A0f, product);
        AbstractC37301Gc2.A15(A0f, c41727Idy.A07);
        AbstractC37300Gc1.A0f(A0f, C41727Idy.A00(c41727Idy, str));
        A0f.AAQ(C41727Idy.A01(c41727Idy, c41726Idx), "pdp_logging_info");
        AbstractC37301Gc2.A18(A0f, AbstractC37302Gc3.A0d(product));
        AbstractC37300Gc1.A0s(A0f, c41727Idy.A0E);
        A0f.Cht();
    }

    public C39115HJn(UserSession userSession, C41727Idy c41727Idy, String str) {
        super(AbstractC37302Gc3.A0J(userSession));
        this.A01 = str;
        this.A00 = c41727Idy;
    }

    @Override // X.AbstractC64162vb
    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
    }
}
