package X;

/* renamed from: X.IsN, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42544IsN implements C5H9 {
    public final int A00;
    public final Object A01;
    public final String A02;

    public C42544IsN(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    @Override // X.C5H9
    public final void A8X(C82713mZ c82713mZ, InterfaceC60442pS interfaceC60442pS, String str) {
        int i = this.A00;
        C14360o3.A0B(c82713mZ, 2);
        if (i != 0) {
            c82713mZ.A74 = AbstractC37300Gc1.A0W(this.A01);
            c82713mZ.A6Z = this.A02;
            return;
        }
        C41729Ie0 c41729Ie0 = (C41729Ie0) this.A01;
        C38321qM c38321qM = c41729Ie0.A01;
        if (c38321qM != null) {
            c82713mZ.A0G(c41729Ie0.A08, c38321qM);
        }
        c82713mZ.A74 = c41729Ie0.A09.getModuleName();
        c82713mZ.A5J = this.A02;
    }
}
