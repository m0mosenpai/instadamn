package X;

/* renamed from: X.G7a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36476G7a implements InterfaceC60442pS {
    public static final String __redex_internal_original_name = "IgFeedVideoBinderUtils$1";
    public final /* synthetic */ InterfaceC11380iw A00;
    public final /* synthetic */ C102884kP A01;

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return false;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    public C36476G7a(InterfaceC11380iw interfaceC11380iw, C102884kP c102884kP) {
        this.A01 = c102884kP;
        this.A00 = interfaceC11380iw;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        C102884kP c102884kP = this.A01;
        String moduleName = this.A00.getModuleName();
        String A0E = c102884kP.A0E();
        if (A0E != null) {
            return A0E;
        }
        return moduleName;
    }
}
