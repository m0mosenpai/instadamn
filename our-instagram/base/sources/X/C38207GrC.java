package X;

/* renamed from: X.GrC, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38207GrC implements InterfaceC62612t0 {
    public final /* synthetic */ C38P A00;

    public C38207GrC(C38P c38p) {
        this.A00 = c38p;
    }

    @Override // X.InterfaceC62612t0
    public final void AD4() {
        String str;
        C38135Gq2 c38135Gq2 = this.A00.A0J;
        if (c38135Gq2 == null) {
            str = "viewController";
        } else {
            C38139Gq6 c38139Gq6 = c38135Gq2.A09.A00;
            if (c38139Gq6 == null) {
                str = "feedNetworkSource";
            } else {
                if (c38139Gq6.A00.A06()) {
                    C38135Gq2.A00(c38135Gq2, C05F.A0N, false, false, c38135Gq2.A0I, false, false);
                    return;
                }
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
