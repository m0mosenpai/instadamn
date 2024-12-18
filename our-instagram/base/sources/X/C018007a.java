package X;

/* renamed from: X.07a, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C018007a {
    public C07S A00;
    public InterfaceC09670ek A01;

    public C018007a(C07S c07s, C07W c07w) {
        this.A01 = C58343Pte.A01(c07w);
        this.A00 = c07s;
    }

    public final void A00(C07R c07r, C07X c07x) {
        C07S A00 = c07r.A00();
        C07S c07s = this.A00;
        C14360o3.A0B(c07s, 0);
        if (A00.compareTo(c07s) < 0) {
            c07s = A00;
        }
        this.A00 = c07s;
        this.A01.DoQ(c07r, c07x);
        this.A00 = A00;
    }
}
