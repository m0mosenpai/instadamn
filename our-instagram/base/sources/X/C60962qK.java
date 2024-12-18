package X;

/* renamed from: X.2qK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C60962qK implements InterfaceC60442pS {
    public static final String __redex_internal_original_name = "InsightsHostImpl";
    public final String A00;
    public final boolean A01;
    public final boolean A02;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A00;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return this.A01;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return this.A02;
    }

    public C60962qK(String str, boolean z, boolean z2) {
        this.A00 = str;
        this.A01 = z;
        this.A02 = z2;
    }
}
