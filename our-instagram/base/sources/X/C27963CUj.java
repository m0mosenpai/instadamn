package X;

/* renamed from: X.CUj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27963CUj {
    public final int A00;
    public final int A01;
    public final int A02;
    public final C127055oj A03;

    public final C27982CVe A00(int i) {
        return new C27982CVe(CB4.A00(this.A03, i), i, 1L);
    }

    public C27963CUj(C127055oj c127055oj, int i, int i2, int i3) {
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
        this.A03 = c127055oj;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("SelectionInfo(id=");
        A1C.append(1L);
        A1C.append(", range=(");
        int i = this.A02;
        A1C.append(i);
        A1C.append('-');
        C127055oj c127055oj = this.A03;
        A1C.append(CB4.A00(c127055oj, i));
        A1C.append(',');
        int i2 = this.A00;
        A1C.append(i2);
        A1C.append('-');
        A1C.append(CB4.A00(c127055oj, i2));
        A1C.append("), prevOffset=");
        return AbstractC25236BEt.A0Z(A1C, this.A01);
    }
}
