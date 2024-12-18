package X;

/* loaded from: classes7.dex */
public final class HL5 extends AbstractC37439GeJ implements InterfaceC60442pS {
    public static final String __redex_internal_original_name = "AdsInterestsFeedController";
    public final C42949Iz1 A00;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "feed_ads_interests";
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return false;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return true;
    }

    public HL5(InterfaceC669530m interfaceC669530m) {
        C42949Iz1 c42949Iz1;
        if (interfaceC669530m instanceof C42949Iz1) {
            c42949Iz1 = (C42949Iz1) interfaceC669530m;
        } else {
            c42949Iz1 = null;
        }
        this.A00 = c42949Iz1;
    }
}
