package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public abstract class ISE {
    public static final void A00(UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str, String str2, String str3) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC31176DnK.A0L(interfaceC60442pS, userSession), "instagram_shopping_shop_manager_add_products_entry_tap");
        if (A0f.isSampled()) {
            A0f.AAP("waterfall_id", str);
            AbstractC37300Gc1.A0m(A0f, str3);
            AbstractC37300Gc1.A0n(A0f, str2);
            A0f.Cht();
        }
    }

    public static final void A01(UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str, String str2, String str3) {
        AbstractC167017dG.A1O(userSession, str);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC31173DnH.A0Q(interfaceC60442pS, userSession, str3, 4), "instagram_shopping_shop_manager_edit_products_entry_tap");
        if (A0f.isSampled()) {
            A0f.AAP("waterfall_id", str);
            AbstractC37300Gc1.A0m(A0f, str3);
            AbstractC37300Gc1.A0n(A0f, str2);
            A0f.Cht();
        }
    }
}
