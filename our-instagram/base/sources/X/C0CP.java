package X;

/* renamed from: X.0CP, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0CP {
    public final C0CC A00;
    public final C0CD A01;

    public final C0CC A00(AbstractC02960Bu abstractC02960Bu, String str) {
        if (abstractC02960Bu == null) {
            return null;
        }
        C0CC c0cc = this.A00;
        c0cc.A7L(null, "mobile_power_stats");
        if (!c0cc.isSampled()) {
            return null;
        }
        this.A01.EIU(abstractC02960Bu, c0cc);
        c0cc.A7n("dimension", str);
        return c0cc;
    }

    public C0CP(C0CC c0cc, C0CD c0cd) {
        this.A01 = c0cd;
        this.A00 = c0cc;
    }
}
