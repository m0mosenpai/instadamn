package X;

/* renamed from: X.SHq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62590SHq {
    public final int A00;
    public final TEQ A01;
    public final String A02;
    public final Object[] A03;

    public C62590SHq(TEQ teq, String str, Object[] objArr) {
        char charAt;
        this.A01 = teq;
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
