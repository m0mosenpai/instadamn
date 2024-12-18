package X;

/* loaded from: classes9.dex */
public final class OIq {
    public Integer A02;
    public final String A03;
    public long A01 = 0;
    public long A00 = 0;

    public OIq(Integer num, String str) {
        this.A03 = str;
        this.A02 = num;
    }

    public final String toString() {
        String str;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("\n        AfiState(\n            totalDwellTimeInMs=");
        A1C.append(this.A01);
        A1C.append(",\n            lastDwellCheckTime=");
        A1C.append(this.A00);
        A1C.append(",\n            afiIniRenderingStatus=");
        if (this.A02.intValue() != 0) {
            str = "SHOWING";
        } else {
            str = "NOT_SHOWING";
        }
        A1C.append(str);
        A1C.append("),\n            adId=");
        A1C.append(this.A03);
        return AbstractC166997dE.A0x(",\n    ", A1C);
    }
}
