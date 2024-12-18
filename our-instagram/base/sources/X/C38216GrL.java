package X;

/* renamed from: X.GrL, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38216GrL implements InterfaceC71925XAj {
    public final /* synthetic */ C38P A00;

    public C38216GrL(C38P c38p) {
        this.A00 = c38p;
    }

    @Override // X.InterfaceC71925XAj
    public final void DcU() {
        String str;
        C38P c38p = this.A00;
        C38P.A02(c38p);
        C77433dT c77433dT = c38p.A0A;
        if (c77433dT == null) {
            str = "exploreQuickPromotionHelper";
        } else {
            c77433dT.A00(null);
            C38135Gq2 c38135Gq2 = c38p.A0J;
            if (c38135Gq2 == null) {
                str = "viewController";
            } else {
                c38135Gq2.A02(false);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
