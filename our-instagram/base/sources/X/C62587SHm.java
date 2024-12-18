package X;

/* renamed from: X.SHm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62587SHm {
    public final int A00;
    public final AbstractC58532Px0 A01;
    public final String A02;
    public final Object[] A03;

    public C62587SHm(AbstractC58532Px0 defaultInstance, String info, Object[] objects) {
        char charAt;
        this.A01 = defaultInstance;
        this.A02 = info;
        this.A03 = objects;
        int A00 = AbstractC58318PtA.A00(info);
        if (A00 >= 55296) {
            int i = A00 & 8191;
            int i2 = 13;
            int i3 = 1;
            while (true) {
                int i4 = i3 + 1;
                charAt = info.charAt(i3);
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
