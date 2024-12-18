package X;

/* renamed from: X.It5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42587It5 implements InterfaceC60442pS {
    public static final String __redex_internal_original_name = "ReelNetegoController$onInFeedTraySeen$feedUnitInsightsHost$1";
    public final /* synthetic */ C1121854m A00;
    public final /* synthetic */ C63972vI A01;

    public C42587It5(C1121854m c1121854m, C63972vI c63972vI) {
        this.A01 = c63972vI;
        this.A00 = c1121854m;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        C101274gj c101274gj = this.A00.A00;
        if (c101274gj.A01 == C1XV.A0Q) {
            return "feed_timeline_highlights_blending";
        }
        Boolean bool = c101274gj.A00.A03;
        if (bool != null && bool.booleanValue()) {
            return "feed_timeline_stories_netego";
        }
        return "feed_timeline_stories_blending";
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return this.A01.A06.isOrganicEligible();
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return this.A01.A06.isSponsoredEligible();
    }
}
