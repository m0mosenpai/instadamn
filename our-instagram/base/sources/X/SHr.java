package X;

/* loaded from: classes10.dex */
public final class SHr {
    public final int A00;
    public final TEY A01;
    public final String A02;
    public final Object[] A03;

    public SHr(TEY tey, String str, Object[] objArr) {
        char charAt;
        this.A01 = tey;
        this.A02 = str;
        this.A03 = objArr;
        int A00 = AbstractC58318PtA.A00(str);
        if (A00 >= 55296) {
            int i = A00 & 8191;
            int i2 = 13;
            int i3 = 1;
            while (true) {
                int i4 = i3 + 1;
                charAt = str.charAt(i3);
                if (charAt < 55296) {
                    break;
                }
                i = AbstractC58318PtA.A03(charAt, i2, i);
                i2 += 13;
                i3 = i4;
            }
            A00 = i | (charAt << i2);
        }
        this.A00 = A00;
    }
}
