package X;

/* renamed from: X.Pwa, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58506Pwa {
    public static final C58506Pwa A02 = new C58506Pwa(0);
    public final ThreadLocal A00;
    public volatile int A01;

    public final C46h A00(C0SJ c0sj) {
        C46h c46h = (C46h) this.A00.get();
        if ((c46h instanceof C4JL) || (c0sj != null && this.A01 >= 0 && (c46h = (C46h) c0sj.BYU(this.A01, 1)) != null && (c46h instanceof C4JL))) {
            return c46h;
        }
        C4JK c4jk = C4JK.A00;
        C14360o3.A07(c4jk);
        return c4jk;
    }

    public C58506Pwa(int i) {
        this.A01 = -1;
        this.A00 = new C58599PyS();
    }

    public final Object A01() {
        C46h A00 = A00(C06600Wq.A00());
        if (A00 instanceof C4JL) {
            return A00.A03();
        }
        return C58914QIs.A02;
    }

    public C58506Pwa() {
        this(0);
    }
}
