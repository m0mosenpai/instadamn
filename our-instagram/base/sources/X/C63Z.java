package X;

/* renamed from: X.63Z, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C63Z {
    public C6Er A00;
    public final C63I A01;
    public final C63U A02;
    public final C63U A03;
    public final Object A04 = new Object();

    public final C63U A00(String str) {
        C63I c63i;
        C63U c63u = this.A03;
        if (c63u != null && (c63i = this.A01) != null) {
            C63E c63e = c63i.A00;
            if (c63e.A00(str) != null || c63e.A00.get(str) != null) {
                return c63u;
            }
        }
        return this.A02;
    }

    public C63Z(C63I c63i, C63U c63u, C63U c63u2) {
        this.A02 = c63u;
        this.A03 = c63u2;
        this.A01 = c63i;
    }
}
