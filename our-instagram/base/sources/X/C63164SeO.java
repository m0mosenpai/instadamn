package X;

/* renamed from: X.SeO, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63164SeO {
    public static C63164SeO A01;
    public static final Object A02 = AbstractC58318PtA.A0b();
    public RVP A00;

    public static C63164SeO A00() {
        C63164SeO c63164SeO;
        synchronized (A02) {
            C3U5.A09(AbstractC167007dF.A1W(A01), "MlKitContext has not been initialized");
            c63164SeO = A01;
            C3U5.A02(c63164SeO);
        }
        return c63164SeO;
    }

    public final Object A01(Class cls) {
        C3U5.A09(AbstractC167007dF.A1X(A01, this), "MlKitContext has been deleted");
        RVP rvp = this.A00;
        C3U5.A02(rvp);
        return rvp.A03(cls);
    }
}
