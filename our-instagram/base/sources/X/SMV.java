package X;

/* loaded from: classes10.dex */
public final class SMV {
    public final int A00;
    public final int A01;
    public final String A02;
    public final int A03;
    public final int A04;

    public SMV(int i, int i2, int i3, int i4, String str) {
        this.A03 = i;
        this.A04 = i2;
        this.A01 = i3;
        this.A00 = i4;
        this.A02 = str;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ShowreelNativeRenderingComponentInfoData{x=");
        A1C.append(this.A03);
        A1C.append(", y=");
        A1C.append(this.A04);
        A1C.append(", width=");
        A1C.append(this.A01);
        A1C.append(", height=");
        A1C.append(this.A00);
        A1C.append(", mediaUrl='");
        A1C.append(this.A02);
        return AbstractC166997dE.A0x("'}", A1C);
    }
}
