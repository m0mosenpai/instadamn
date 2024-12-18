package X;

/* renamed from: X.YCc, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73411YCc implements YRK {
    public final YRK A00;
    public final YNr A01;

    @Override // X.YRK, X.YNq
    public final void APm(Object obj) {
        this.A01.accept(obj);
    }

    @Override // X.YRK
    public final Object getState() {
        return this.A00.getState();
    }

    public C73411YCc(YRK yrk, YOv... yOvArr) {
        YNr yct;
        this.A00 = yrk;
        YNr ycs = new YCS(this);
        int i = 2;
        do {
            yct = new YCT(ycs, this, yOvArr[i]);
            i--;
            ycs = yct;
        } while (i >= 0);
        this.A01 = yct;
        int i2 = 0;
        do {
            yOvArr[i2].D78(this);
            i2++;
        } while (i2 < 3);
    }
}
