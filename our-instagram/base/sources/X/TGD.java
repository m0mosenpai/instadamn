package X;

/* loaded from: classes10.dex */
public final class TGD implements InterfaceC60442pS, C0j7 {
    public static final String __redex_internal_original_name = "BrowserInsightsHost";
    public final String A00;
    public final String A01;

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return true;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A00;
    }

    @Override // X.C0j7
    public final String getUrl() {
        return this.A01;
    }

    public TGD(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
