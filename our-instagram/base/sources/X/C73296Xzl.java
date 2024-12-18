package X;

/* renamed from: X.Xzl, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73296Xzl {
    public YDP A00;
    public YDP A01;

    public static YDP A00(C73296Xzl c73296Xzl) {
        YDP ydp = c73296Xzl.A00;
        YDP ydp2 = c73296Xzl.A01;
        if (ydp == ydp2) {
            YDP ydp3 = new YDP(ydp);
            c73296Xzl.A01 = ydp3;
            return ydp3;
        }
        return ydp2;
    }

    public C73296Xzl() {
        YDP ydp = new YDP();
        this.A01 = ydp;
        this.A00 = ydp;
    }
}
