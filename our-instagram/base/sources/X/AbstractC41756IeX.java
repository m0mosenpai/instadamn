package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.save.model.SavedCollection;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.IeX, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41756IeX {
    public static final void A01(Activity activity, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, C1M1 c1m1, Integer num, String str, int i, int i2) {
        String str2;
        AbstractC25233BEq.A0w(2, userSession, num, str);
        if (!c38321qM.CdW()) {
            if (num == C05F.A00) {
                str2 = "add_to_collection";
            } else {
                str2 = "remove_from_collection";
            }
            C82713mZ A04 = AbstractC82703mY.A04(c38321qM, interfaceC60442pS, str2);
            A06(A04, num, str);
            A04.A0G(userSession, c38321qM);
            A04.A09(i);
            A04.A4t = "private";
            A04.A6C = AbstractC25225BEi.A14();
            if (!AbstractC75423a9.A02(c38321qM, interfaceC60442pS)) {
                A04.A0C(activity, userSession);
                if (c1m1 != null) {
                    A04.A70 = c1m1.getSessionId();
                }
            }
            C32U.A0E(userSession, A04, c38321qM, interfaceC60442pS, i2);
        }
    }

    public static final void A04(UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, String str, int i) {
        AbstractC167017dG.A1P(userSession, c38321qM);
        C19280xC A00 = A00(userSession, c38321qM, interfaceC60442pS, "instagram_save_collections_init", null, str);
        A00.A08(Integer.valueOf(i), "position");
        AbstractC31173DnH.A1S(A00, userSession);
    }

    public static final void A05(UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, String str, String str2, int i) {
        AbstractC167017dG.A1N(interfaceC60442pS, userSession);
        C19280xC A00 = A00(userSession, c38321qM, interfaceC60442pS, "instagram_save_collections_view_init", str, str2);
        A00.A08(Integer.valueOf(i), "num_collections");
        AbstractC31173DnH.A1S(A00, userSession);
    }

    public static final C19280xC A00(UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, String str, String str2, String str3) {
        C19280xC A00 = C19280xC.A00(interfaceC60442pS, str);
        A00.A0C("navigation_type", str3);
        if (c38321qM != null) {
            User A2E = c38321qM.A2E(userSession);
            A00.A08(Integer.valueOf(c38321qM.BRp().A00), "m_t");
            A00.A0C("m_pk", c38321qM.getId());
            if (A2E != null) {
                A00.A0C("a_pk", A2E.getId());
            }
            if (c38321qM.A3S(true) != null) {
                ArrayList A3S = c38321qM.A3S(true);
                C14360o3.A0A(A3S);
                if (!A3S.isEmpty()) {
                    ArrayList A1E = AbstractC166987dD.A1E();
                    ArrayList A3S2 = c38321qM.A3S(true);
                    C14360o3.A0A(A3S2);
                    Iterator A13 = AbstractC166997dE.A13(A3S2);
                    while (A13.hasNext()) {
                        A1E.add(((Product) AbstractC166997dE.A0l(A13)).A0H);
                    }
                    A00.A0D("product_ids", A1E);
                }
            }
        }
        if (str2 != null) {
            A00.A07(AbstractC37486Gf4.A00, str2);
        }
        return A00;
    }

    public static final void A02(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM, SavedCollection savedCollection, String str, int i, int i2) {
        String A01 = AbstractC154266wb.A01(i, i2);
        User A2E = c38321qM.A2E(userSession);
        C19280xC A012 = C19280xC.A01(str, interfaceC11380iw.getModuleName());
        A012.A08(Integer.valueOf(c38321qM.BRp().A00), "m_t");
        A012.A0C("m_pk", c38321qM.getId());
        A012.A0C("algorithm", c38321qM.A0C.getAlgorithm());
        A012.A0C("position", A01);
        if (A2E != null) {
            A012.A0C("a_pk", A2E.getId());
        }
        A012.A07(AbstractC37486Gf4.A00, savedCollection.A0F);
        A012.A07(AbstractC37486Gf4.A01, savedCollection.A0G);
        AbstractC31173DnH.A1S(A012, userSession);
    }

    public static final void A03(InterfaceC11380iw interfaceC11380iw, UserSession userSession, SavedCollection savedCollection, String str, int i) {
        AbstractC167027dH.A12(interfaceC11380iw, userSession, savedCollection);
        C19280xC A00 = C19280xC.A00(interfaceC11380iw, "instagram_save_collection_created");
        A00.A07(AbstractC37486Gf4.A00, savedCollection.A0F);
        A00.A07(AbstractC37486Gf4.A01, savedCollection.A0G);
        A00.A08(Integer.valueOf(i), "prev_num_collections");
        if (str != null) {
            A00.A0C("navigation_type", str);
        }
        AbstractC31173DnH.A1S(A00, userSession);
    }

    public static final void A06(C82713mZ c82713mZ, Integer num, String str) {
        if (num.intValue() != 0) {
            c82713mZ.A85 = AbstractC166987dD.A1J(str);
        } else {
            c82713mZ.A7q = AbstractC166987dD.A1J(str);
        }
    }
}
