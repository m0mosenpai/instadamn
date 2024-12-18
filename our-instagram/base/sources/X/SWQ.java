package X;

/* loaded from: classes10.dex */
public final class SWQ {
    public final int A00;
    public final int A01;
    public final SWQ[] A02;

    public SWQ(int i, int i2) {
        this.A02 = null;
        this.A00 = i;
        int i3 = i2 & 7;
        this.A01 = i3 == 0 ? 8 : i3;
    }

    public SWQ() {
        this.A02 = new SWQ[256];
        this.A00 = 0;
        this.A01 = 0;
    }
}
