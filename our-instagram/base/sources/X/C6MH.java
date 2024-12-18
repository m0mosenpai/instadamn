package X;

/* renamed from: X.6MH, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6MH {
    public C138126Nq A00;
    public final C6MI A01;
    public final InterfaceC16660sJ A02;

    public final InterfaceC30985Djh A00(int i, long j) {
        C138126Nq c138126Nq = this.A00;
        if (c138126Nq != null) {
            C25277BGr c25277BGr = new C25277BGr(c138126Nq, this.A01, i, j);
            c138126Nq.A01.EM6(c25277BGr);
            return c25277BGr;
        }
        return C28764Cmw.A00;
    }

    public C6MH(InterfaceC16660sJ interfaceC16660sJ) {
        this.A02 = interfaceC16660sJ;
        this.A01 = new C6MI();
    }

    public C6MH() {
        this(null);
    }
}
