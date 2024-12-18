package X;

/* renamed from: X.G7c, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36478G7c implements InterfaceC60442pS {
    public static final String __redex_internal_original_name = "ShoppingExternalUrlHandler$3";
    public final /* synthetic */ GIE A00;
    public final /* synthetic */ String A01;

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    public C36478G7c(GIE gie, String str) {
        this.A00 = gie;
        this.A01 = str;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A01;
    }
}
