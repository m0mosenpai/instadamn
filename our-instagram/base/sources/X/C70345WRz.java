package X;

/* renamed from: X.WRz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70345WRz implements InterfaceC71878X8l {
    public final long A00;
    public final C69736VuW A01;

    public static void A00(InterfaceC72026XFo interfaceC72026XFo, long j) {
        interfaceC72026XFo.EMe(new C70345WRz(j, 0L));
    }

    public C70345WRz(long j, long j2) {
        W5N w5n;
        this.A00 = j;
        if (j2 == 0) {
            w5n = W5N.A02;
        } else {
            w5n = new W5N(0L, j2);
        }
        this.A01 = new C69736VuW(w5n, w5n);
    }

    @Override // X.InterfaceC71878X8l
    public final C69736VuW Bs4(long j) {
        return this.A01;
    }
}
