package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.model.shopping.ProductTag;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ibx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41665Ibx {
    public static void A00(UserSession userSession, C82713mZ c82713mZ, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS) {
        C38321qM A1g = c38321qM.A1g(userSession);
        if (A1g.A5M()) {
            c82713mZ.A7Q = A1g.CAR();
            c82713mZ.A61 = A1g.getId();
        }
        C32U.A0F(userSession, c82713mZ, A1g, interfaceC60442pS, C05F.A01, c38321qM.A16(userSession), false);
    }

    public static void A01(UserSession userSession, C38321qM c38321qM, C38321qM c38321qM2, InterfaceC60442pS interfaceC60442pS, Product product) {
        String str;
        C82713mZ A0M = AbstractC37302Gc3.A0M(interfaceC60442pS, "instagram_ad_", "product_tap");
        A0M.A0G(userSession, c38321qM);
        C14360o3.A0B(product, 1);
        String str2 = product.A0H;
        Boolean valueOf = Boolean.valueOf(product.A04());
        ProductDetailsProductItemDict productDetailsProductItemDict = product.A01;
        A0M.A0H(userSession, c38321qM, productDetailsProductItemDict.A0C, productDetailsProductItemDict.A0F, valueOf, str2, AbstractC37302Gc3.A0d(product));
        A0M.A0i = product.A05;
        A0M.A4P = "shopping_pdp";
        A0M.A5R = "shopping_product_tags";
        C3KL A00 = C3KL.A00(userSession);
        C114845Gu c114845Gu = A00.A00;
        if (c114845Gu != null && C3KL.A03(A00, c114845Gu.A00) && (str = c114845Gu.A03) != null) {
            A0M.A5K = str;
        }
        String A07 = AbstractC41071vF.A07(userSession, c38321qM2);
        if (A07 != null) {
            A0M.A4T = A07;
        }
        AbstractC37302Gc3.A1R(A0M);
        A00(userSession, A0M, c38321qM, interfaceC60442pS);
    }

    public static void A02(UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, List list, long j) {
        Object obj;
        Product product;
        String CAR;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC60442pS, userSession), "instagram_ad_tags_list_end");
        if (c38321qM.A3I() != null && !c38321qM.A3I().isEmpty()) {
            product = AbstractC38048Gob.A00((ProductTag) c38321qM.A3I().get(0));
        } else {
            if (c38321qM.A3I() != null && !c38321qM.A3I().isEmpty()) {
                obj = c38321qM.A3S(true).get(0);
            } else {
                obj = list.get(0);
            }
            product = (Product) obj;
        }
        User user = product.A0B;
        AbstractC37302Gc3.A0x(A0f, c38321qM);
        A0f.A8I("timespent", Double.valueOf(j));
        if (c38321qM.A5N()) {
            CAR = c38321qM.A1g(userSession).CAR();
        } else {
            CAR = c38321qM.CAR();
        }
        AbstractC37300Gc1.A0o(A0f, CAR);
        AbstractC37301Gc2.A17(A0f, AbstractC76433bn.A00(user));
        ArrayList A3S = c38321qM.A3S(true);
        ArrayList A1E = AbstractC166987dD.A1E();
        if (A3S != null) {
            Iterator it = A3S.iterator();
            while (it.hasNext()) {
                AbstractC31177DnL.A1R(AbstractC37300Gc1.A0L(it).A0H, A1E);
            }
        }
        A0f.AAk("product_ids", A1E);
        ArrayList A3S2 = c38321qM.A3S(true);
        HashMap A1G = AbstractC166987dD.A1G();
        if (A3S2 != null) {
            Iterator it2 = A3S2.iterator();
            while (it2.hasNext()) {
                Product A0L = AbstractC37300Gc1.A0L(it2);
                Long A13 = AbstractC25228BEl.A13(AbstractC37300Gc1.A0T(A0L));
                List list2 = (List) A1G.get(A13);
                if (list2 != null) {
                    list2.add(AbstractC25228BEl.A13(A0L.A0H));
                } else {
                    ArrayList A1E2 = AbstractC166987dD.A1E();
                    AbstractC31177DnL.A1R(A0L.A0H, A1E2);
                    A1G.put(A13, A1E2);
                }
            }
        }
        A0f.A9M("product_merchant_ids", A1G);
        A0f.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, null);
        AbstractC37300Gc1.A0n(A0f, null);
        AbstractC37300Gc1.A0q(A0f, null);
        A0f.Cht();
    }
}
