package X;

/* renamed from: X.IyC, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42898IyC implements InterfaceC43413JGd {
    public final /* synthetic */ HCE A00;

    public C42898IyC(HCE hce) {
        this.A00 = hce;
    }

    @Override // X.InterfaceC43413JGd
    public final void DbQ() {
        C1XJ c1xj = C1XJ.A00;
        HCE hce = this.A00;
        IMY A0A = c1xj.A0A(hce.requireActivity(), AbstractC166987dD.A0r(hce.A0G), "shop_manager_add_products");
        String str = hce.A0D;
        if (str == null) {
            C14360o3.A0F("waterfallId");
            throw C00O.createAndThrow();
        }
        A0A.A05 = str;
        A0A.A06 = false;
        A0A.A08 = false;
        A0A.A07 = true;
        A0A.A03 = 1001;
        A0A.A00 = hce;
        A0A.A00();
    }
}
