package X;

/* loaded from: classes11.dex */
public final class Wk6 implements C5H9 {
    public final String A00;
    public final C5H9 A01;

    public Wk6(C5H9 c5h9, String str) {
        this.A00 = str;
        this.A01 = c5h9;
    }

    @Override // X.C5H9
    public final void A8X(C82713mZ c82713mZ, InterfaceC60442pS interfaceC60442pS, String str) {
        AbstractC167017dG.A1O(str, c82713mZ);
        C5H9 c5h9 = this.A01;
        if (c5h9 != null) {
            c5h9.A8X(c82713mZ, interfaceC60442pS, str);
        }
        c82713mZ.A4i = this.A00;
    }
}
