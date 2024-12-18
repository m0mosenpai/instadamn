package X;

import com.instagram.api.schemas.ProductDiscountInformationDict;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.HJt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39121HJt extends AbstractC64162vb {
    public boolean A00;
    public final C41731Ie2 A01;
    public final String A02;
    public final String A03;

    public C39121HJt(UserSession userSession, C41731Ie2 c41731Ie2, String str, String str2) {
        super(AbstractC37302Gc3.A0J(userSession));
        this.A03 = str;
        this.A02 = str2;
        this.A01 = c41731Ie2;
        this.A00 = false;
    }

    @Override // X.AbstractC64162vb
    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
        java.util.Set set = (java.util.Set) obj;
        C14360o3.A0B(set, 0);
        C41731Ie2 c41731Ie2 = this.A01;
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Long A0j = AbstractC25231BEo.A0j(0, ((ProductDiscountInformationDict) it.next()).getId());
            if (A0j != null) {
                A1E.add(A0j);
            }
        }
        String str = this.A03;
        String str2 = this.A02;
        boolean z = this.A00;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c41731Ie2.A02, "shops_promotions_banner_impression");
        AbstractC37301Gc2.A15(A0f, c41731Ie2.A01);
        C0Zx c0Zx = new C0Zx();
        AbstractC37300Gc1.A0v(c0Zx, c41731Ie2.A07);
        AbstractC37300Gc1.A0w(c0Zx, c41731Ie2.A05);
        AbstractC37302Gc3.A0u(A0f, c0Zx, c41731Ie2.A08);
        A0f.AAk("discount_ids", A1E);
        AbstractC37301Gc2.A18(A0f, str);
        AbstractC37300Gc1.A0s(A0f, str2);
        A0f.AAQ(C41731Ie2.A00(c41731Ie2, str2, null), "bag_logging_info");
        A0f.A7v("is_megaphone_banner", Boolean.valueOf(z));
        A0f.Cht();
    }

    @Override // X.AbstractC64162vb
    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
    }
}
