package X;

/* renamed from: X.It4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42586It4 implements InterfaceC60442pS {
    public static final String __redex_internal_original_name = "MINIBloksActionOpenProductDetailsImpl$1";
    public final /* synthetic */ InterfaceC11380iw A00;
    public final /* synthetic */ String A01;

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    public C42586It4(String str, InterfaceC11380iw interfaceC11380iw) {
        this.A01 = str;
        this.A00 = interfaceC11380iw;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        String str = this.A01;
        if (str == null) {
            return this.A00.getModuleName();
        }
        return str;
    }
}
