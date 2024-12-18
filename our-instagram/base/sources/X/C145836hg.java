package X;

import com.instagram.model.reels.Reel;

/* renamed from: X.6hg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C145836hg implements InterfaceC60442pS {
    public static final String __redex_internal_original_name = "ReelInsightsHost";
    public Reel A00;
    public final InterfaceC60442pS A01;
    public final C3G2 A02;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return AnonymousClass001.A0R(C75653aW.A04(this.A00), this.A02.A00);
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return this.A01.isOrganicEligible();
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return this.A01.isSponsoredEligible();
    }

    public C145836hg(InterfaceC60442pS interfaceC60442pS, C3G2 c3g2) {
        this.A01 = interfaceC60442pS;
        this.A02 = c3g2;
    }
}
