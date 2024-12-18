package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.shopping.model.analytics.ShoppingGuideLoggingInfo;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;

/* loaded from: classes7.dex */
public final class IND {
    public final AbstractC59962oe A00;
    public final UserSession A01;
    public final InterfaceC60442pS A02;
    public final C41702IdW A03;
    public final C41727Idy A04;
    public final C41729Ie0 A05;
    public final ShoppingGuideLoggingInfo A06;
    public final JI6 A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;

    public IND(AbstractC59962oe abstractC59962oe, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C41702IdW c41702IdW, C41727Idy c41727Idy, C41729Ie0 c41729Ie0, ShoppingGuideLoggingInfo shoppingGuideLoggingInfo, JI6 ji6, String str, String str2, String str3, String str4, String str5, String str6) {
        AbstractC167007dF.A1G(userSession, 3, c41727Idy);
        AbstractC25233BEq.A0y(7, c41729Ie0, str, str2);
        this.A00 = abstractC59962oe;
        this.A02 = interfaceC60442pS;
        this.A01 = userSession;
        this.A07 = ji6;
        this.A04 = c41727Idy;
        this.A03 = c41702IdW;
        this.A05 = c41729Ie0;
        this.A08 = str;
        this.A0C = str2;
        this.A0A = str3;
        this.A0B = str4;
        this.A06 = shoppingGuideLoggingInfo;
        this.A09 = str5;
        this.A0D = str6;
    }

    public final void A00(Product product, String str, String str2, String str3) {
        String A00;
        User user = product.A0B;
        JI6 ji6 = this.A07;
        C41726Idx C02 = ji6.C02();
        C41753IeT c41753IeT = new C41753IeT(C02);
        C41595Iai c41595Iai = C02.A02;
        EnumC39591He1 enumC39591He1 = c41595Iai.A03;
        boolean z = c41595Iai.A06;
        c41753IeT.A02 = new C41595Iai(EnumC39591He1.A06, c41595Iai.A01, c41595Iai.A02, enumC39591He1, c41595Iai.A04, c41595Iai.A05, z);
        C41726Idx.A02(ji6, c41753IeT);
        InterfaceC60442pS interfaceC60442pS = this.A02;
        UserSession userSession = this.A01;
        String str4 = null;
        if (user != null) {
            str4 = AbstractC76433bn.A00(user);
        }
        AbstractC41757IeY.A06(interfaceC60442pS, userSession, ji6.Byj(), this.A06, product, str2, str3, str, str4, this.A08, this.A0C, this.A09);
        C1563470e A0G = AbstractC37300Gc1.A0G(userSession);
        if (user != null && (A00 = AbstractC76433bn.A00(user)) != null) {
            A0G.A0D(new C42854IxU(this, product, str, str2, str3), product, A00, this.A0D);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public final void A01(String str) {
        String A00;
        JI6 ji6 = this.A07;
        C41726Idx C02 = ji6.C02();
        Product product = C02.A09;
        if (product != null) {
            Product product2 = C02.A08;
            if (product2 != null) {
                C41723Idu c41723Idu = C02.A04;
                UserSession userSession = this.A01;
                if (c41723Idu.A05.containsKey(C41723Idu.A00(userSession, product)) && !C14360o3.A0K(product2.A0H, product.A0H)) {
                    return;
                }
                System.currentTimeMillis();
                C41753IeT A002 = C41753IeT.A00(ji6);
                C41595Iai c41595Iai = ji6.C02().A02;
                EnumC39591He1 enumC39591He1 = c41595Iai.A03;
                boolean z = c41595Iai.A06;
                A002.A02 = new C41595Iai(c41595Iai.A00, EnumC39591He1.A06, c41595Iai.A02, enumC39591He1, c41595Iai.A04, c41595Iai.A05, z);
                C41726Idx.A02(ji6, A002);
                AbstractC59962oe abstractC59962oe = this.A00;
                Context requireContext = abstractC59962oe.requireContext();
                C08790ch A003 = AbstractC018607g.A00(abstractC59962oe);
                String str2 = product2.A0H;
                User user = product.A0B;
                if (user != null && (A00 = AbstractC76433bn.A00(user)) != null) {
                    AbstractC40799I6b.A00(requireContext, A003, userSession, new C42861Ixb(this, product), product, str2, A00, str, C02.A03.A03, true);
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }
}
