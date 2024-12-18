package X;

/* renamed from: X.Isu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42576Isu implements InterfaceC60442pS {
    public static final String __redex_internal_original_name = "NavbarExtensionController$createInsightHost$1";
    public final /* synthetic */ C42277Io1 A00;

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    public C42576Isu(C42277Io1 c42277Io1) {
        this.A00 = c42277Io1;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        String A0L = this.A00.A08.A0L(45);
        if (A0L == null) {
            return "";
        }
        return A0L;
    }
}
