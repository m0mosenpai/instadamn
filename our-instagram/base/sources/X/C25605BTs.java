package X;

/* renamed from: X.BTs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25605BTs implements InterfaceC60442pS {
    public static final String __redex_internal_original_name = "MediaCommentListInsightsHost";
    public final boolean A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;

    public C25605BTs(String str, boolean z, boolean z2, boolean z3) {
        String A00;
        C14360o3.A0B(str, 3);
        this.A03 = z;
        this.A02 = z2;
        this.A00 = z3;
        if (z3) {
            A00 = "self_comments_v2";
        } else {
            A00 = AbstractC111324zv.A00(834);
        }
        if (str.length() != 0 && !AbstractC002300n.A0h(str, A00, false)) {
            A00 = AnonymousClass001.A0T(A00, str, '_');
        }
        this.A01 = A00;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A01;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return this.A02;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return this.A03;
    }
}
