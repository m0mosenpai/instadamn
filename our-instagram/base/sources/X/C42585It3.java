package X;

import java.util.HashMap;

/* renamed from: X.It3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42585It3 implements InterfaceC60442pS {
    public static final String __redex_internal_original_name = "CommerceMerchantCartPrefetcher$buildBkMerchantCartBundle$insightsHost$1";
    public final /* synthetic */ HashMap A00;

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    public C42585It3(HashMap hashMap) {
        this.A00 = hashMap;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        String str = (String) this.A00.get("prior_module_name");
        if (str == null) {
            return "";
        }
        return str;
    }
}
