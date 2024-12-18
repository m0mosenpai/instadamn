package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus;
import com.instagram.shopping.intf.featuredproducts.FeaturedProductMediaFeedGridConfiguration;
import com.instagram.shopping.model.analytics.ProductDetailsPageLoggingInfo;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HZ2 extends AbstractC40977ICy {
    public final C41729Ie0 A00;
    public final JI6 A01;
    public final C41622IbC A02;

    public final void A00(C74293Vk c74293Vk, C38883HAf c38883HAf, Integer num, String str, String str2) {
        String A00;
        String str3;
        String A002;
        Product product = this.A01.C02().A08;
        C14360o3.A0A(product);
        String A003 = I8L.A00(product, num);
        if (num == C05F.A0C) {
            C41729Ie0 c41729Ie0 = this.A00;
            Product product2 = c41729Ie0.A0B.C02().A08;
            if (product2 != null) {
                ArrayList A1E = AbstractC166987dD.A1E();
                String str4 = "";
                if (c74293Vk != null) {
                    Iterator it = c74293Vk.A06.iterator();
                    while (it.hasNext()) {
                        String A0g = AbstractC37302Gc3.A0g(it);
                        if (A0g != null) {
                            A1E.add(A0g);
                        } else {
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                    }
                    C1XJ c1xj = C1XJ.A00;
                    FragmentActivity fragmentActivity = c41729Ie0.A05;
                    UserSession userSession = c41729Ie0.A08;
                    InterfaceC60442pS interfaceC60442pS = c41729Ie0.A09;
                    ProductDetailsPageLoggingInfo A004 = C41729Ie0.A00(c41729Ie0);
                    String str5 = c41729Ie0.A0J;
                    User user = product2.A0B;
                    if (user != null && (A002 = AbstractC76433bn.A00(user)) != null) {
                        str4 = A002;
                    }
                    c1xj.A0v(fragmentActivity, userSession, interfaceC60442pS, new FeaturedProductMediaFeedGridConfiguration(str2, A003, str4, c74293Vk.A04, null, null, null, AbstractC16960so.A1Q(FeaturedProductPermissionStatus.A04, FeaturedProductPermissionStatus.A0E), A1E, true), A004, str, str5);
                    return;
                }
                if (c38883HAf != null) {
                    HashSet A1H = AbstractC166987dD.A1H();
                    List list = c38883HAf.A01;
                    if (list != null) {
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            C3XG A0D = AbstractC37300Gc1.A0D(it2);
                            C1XV c1xv = A0D.A06;
                            if (c1xv == C1XV.A0Y) {
                                InterfaceC38381qS interfaceC38381qS = A0D.A05;
                                if (C3XH.A02(interfaceC38381qS) != null) {
                                    C38321qM A02 = C3XH.A02(interfaceC38381qS);
                                    if (A02 == null || (str3 = A02.getId()) == null) {
                                        str3 = "";
                                    }
                                    A1E.add(str3);
                                }
                            }
                            if (c1xv == C1XV.A0d) {
                                InterfaceC38381qS interfaceC38381qS2 = A0D.A05;
                                String A005 = AbstractC111324zv.A00(37);
                                C14360o3.A0C(interfaceC38381qS2, A005);
                                if (interfaceC38381qS2 != null) {
                                    C14360o3.A0C(interfaceC38381qS2, A005);
                                    A1H.add(interfaceC38381qS2);
                                }
                            }
                        }
                        UserSession userSession2 = c41729Ie0.A08;
                        AbstractC99104cX.A00(userSession2).A00(A1H);
                        C1XJ c1xj2 = C1XJ.A00;
                        FragmentActivity fragmentActivity2 = c41729Ie0.A05;
                        InterfaceC60442pS interfaceC60442pS2 = c41729Ie0.A09;
                        ProductDetailsPageLoggingInfo A006 = C41729Ie0.A00(c41729Ie0);
                        String str6 = c41729Ie0.A0J;
                        User user2 = product2.A0B;
                        if (user2 != null && (A00 = AbstractC76433bn.A00(user2)) != null) {
                            str4 = A00;
                        }
                        c1xj2.A0w(fragmentActivity2, userSession2, interfaceC60442pS2, new FeaturedProductMediaFeedGridConfiguration(str2, A003, str4, c38883HAf.A00, null, null, null, AbstractC16960so.A1Q(FeaturedProductPermissionStatus.A04, FeaturedProductPermissionStatus.A0E), A1E, true), A006, str, str6);
                        return;
                    }
                    C14360o3.A0F("mediaFeed");
                    throw C00O.createAndThrow();
                }
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HZ2(C41729Ie0 c41729Ie0, JI6 ji6, C41622IbC c41622IbC) {
        super(c41622IbC);
        AbstractC167017dG.A1R(c41729Ie0, c41622IbC);
        this.A02 = c41622IbC;
        this.A01 = ji6;
        this.A00 = c41729Ie0;
    }
}
