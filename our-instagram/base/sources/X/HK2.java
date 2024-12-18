package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;

/* loaded from: classes7.dex */
public final class HK2 extends AbstractC64162vb {
    public final UserSession A00;
    public final C41727Idy A01;

    public static String A00(InterfaceC02590Ai interfaceC02590Ai, C41727Idy c41727Idy, long j) {
        interfaceC02590Ai.AAk("ig_funded_discount_ids", AbstractC16960so.A1M(Long.valueOf(j)));
        interfaceC02590Ai.AAQ(C41727Idy.A00(c41727Idy, null), "navigation_info");
        JI6 ji6 = c41727Idy.A0A;
        C41726Idx C02 = ji6.C02();
        C14360o3.A07(C02);
        interfaceC02590Ai.AAQ(C41727Idy.A01(c41727Idy, C02), "pdp_logging_info");
        Product product = ji6.C02().A09;
        C14360o3.A0A(product);
        User user = product.A0B;
        if (user != null) {
            return AbstractC76433bn.A00(user);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        if (r0 == null) goto L5;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A01(long r6) {
        /*
            r5 = this;
            com.instagram.common.session.UserSession r4 = r5.A00
            X.IDI r3 = X.C41768Iek.A04(r4)
            if (r3 != 0) goto L22
            X.IDI r3 = new X.IDI
            r3.<init>()
        Ld:
            java.util.HashMap r0 = X.AbstractC166987dD.A1G()
        L11:
            java.lang.String r2 = java.lang.String.valueOf(r6)
            java.lang.Long r1 = X.AbstractC31173DnH.A0g()
            r0.put(r2, r1)
            r3.A00 = r0
            X.C41768Iek.A07(r4, r3)
            return
        L22:
            java.util.HashMap r0 = r3.A00
            if (r0 != 0) goto L11
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HK2.A01(long):void");
    }

    public HK2(C1BX c1bx, UserSession userSession, C41727Idy c41727Idy) {
        super(c1bx);
        this.A00 = userSession;
        this.A01 = c41727Idy;
    }

    @Override // X.AbstractC64162vb
    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
        long A0N = AbstractC166987dD.A0N(obj);
        C41768Iek.A05(this.A00, System.currentTimeMillis());
        A01(A0N);
        C41727Idy c41727Idy = this.A01;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c41727Idy.A04, "instagram_shopping_ig_funded_incentive_impression");
        AbstractC37301Gc2.A17(A0f, A00(A0f, c41727Idy, A0N));
        A0f.Cht();
    }

    @Override // X.AbstractC64162vb
    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
        long A0N = AbstractC166987dD.A0N(obj);
        C41768Iek.A05(this.A00, System.currentTimeMillis());
        A01(A0N);
        C41727Idy c41727Idy = this.A01;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c41727Idy.A04, "instagram_shopping_ig_funded_incentive_sub_impression");
        AbstractC37301Gc2.A17(A0f, A00(A0f, c41727Idy, A0N));
        A0f.Cht();
    }
}
