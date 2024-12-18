package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public abstract class FBV {
    public static final void A00(UserSession userSession, String str, String str2) {
        AbstractC167027dH.A12(userSession, str, str2);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(FEJ.A00, userSession), "instagram_shopping_catalog_add_product_button_impression");
        if (A0f.isSampled()) {
            A0f.AAP("waterfall_id", str);
            AbstractC31175DnJ.A17(A0f, str2);
        }
    }
}
