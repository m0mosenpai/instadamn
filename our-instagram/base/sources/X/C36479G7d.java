package X;

/* renamed from: X.G7d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36479G7d implements InterfaceC60442pS {
    public static final String __redex_internal_original_name = "CommentComposerModalFragmentInsightsHost";
    public final String A00;
    public final boolean A01;
    public final boolean A02;

    public C36479G7d(String str, boolean z, boolean z2) {
        C14360o3.A0B(str, 1);
        this.A00 = str;
        this.A02 = z;
        this.A01 = z2;
    }

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
}
