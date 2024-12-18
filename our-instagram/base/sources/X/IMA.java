package X;

/* loaded from: classes7.dex */
public final class IMA {
    public long A00;
    public long A01;
    public boolean A02;
    public final EnumC26291Pk A03;
    public final String A04;

    public IMA(EnumC26291Pk enumC26291Pk, String str) {
        boolean A1Y = AbstractC25229BEm.A1Y(str);
        this.A04 = str;
        this.A03 = enumC26291Pk;
        this.A01 = 0L;
        this.A00 = 0L;
        this.A02 = A1Y;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("PositionState(id='");
        A1C.append(this.A04);
        A1C.append("', \nobjectType=");
        A1C.append(this.A03);
        A1C.append(", \ntotalVpvdTimeSpent=");
        A1C.append(this.A01);
        A1C.append(", \nrecentAbove50PctVisibleTime=");
        A1C.append(this.A00);
        A1C.append(", \nis50PctVisible=");
        return AbstractC25236BEt.A0a(A1C, this.A02);
    }
}
