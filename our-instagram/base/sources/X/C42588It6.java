package X;

/* renamed from: X.It6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42588It6 implements InterfaceC60442pS {
    public static final String __redex_internal_original_name = "MiniBloksProductSaveButtonBinderUtils$1$1";
    public final /* synthetic */ C39040HGq A00;
    public final /* synthetic */ C6FG A01;
    public final /* synthetic */ C102884kP A02;

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    public C42588It6(C39040HGq c39040HGq, C6FG c6fg, C102884kP c102884kP) {
        this.A00 = c39040HGq;
        this.A02 = c102884kP;
        this.A01 = c6fg;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        C102884kP c102884kP = this.A02;
        String moduleName = C6BQ.A07(this.A01).getModuleName();
        String A0F = c102884kP.A0F();
        if (A0F != null) {
            return A0F;
        }
        return moduleName;
    }
}
