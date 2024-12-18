package X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ILP {
    public final C18920wW A00;
    public final String A01;

    public final void A00(Boolean bool, String str, List list, boolean z, boolean z2) {
        String str2;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, "instagram_shopping_collection_search");
        if (A0f.isSampled()) {
            A0f.AAP("product_search_context", "product_collection_picker");
            if (z) {
                str2 = "success";
            } else {
                str2 = OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_FAILURE;
            }
            A0f.AAP("network_result", str2);
            A0f.AAP("search_text", str);
            AbstractC37300Gc1.A0n(A0f, this.A01);
            if (list == null) {
                list = C16930sl.A00;
            }
            int i = 0;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (I7Q.A00(((C41643IbZ) it.next()).A03()) == EnumC39566Hdc.A03 && (i = i + 1) < 0) {
                        AbstractC16960so.A1T();
                        throw C00O.createAndThrow();
                    }
                }
            }
            A0f.A7v("is_initial_load", AbstractC37300Gc1.A0P(A0f, AbstractC31171DnF.A0V(i), "result_count", z2));
            A0f.A7v("has_more_results", bool);
            A0f.Cht();
        }
    }

    public ILP(UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str) {
        AbstractC167017dG.A1Q(userSession, str);
        this.A01 = str;
        this.A00 = AbstractC12220kQ.A01(interfaceC60442pS, userSession);
    }
}
