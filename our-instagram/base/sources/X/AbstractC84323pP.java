package X;

/* renamed from: X.3pP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC84323pP {
    public static final long A00(C36G c36g, long j, long j2) {
        long j3;
        long j4 = j - j2;
        if (((j4 ^ j) & ((j4 ^ j2) ^ (-1))) < 0) {
            C36G c36g2 = C36G.A06;
            if (c36g.compareTo(c36g2) < 0) {
                C14360o3.A0B(c36g2, 1);
                long convert = c36g.A00.convert(1L, c36g2.A00);
                return C36J.A05(C36H.A04(c36g2, (j / convert) - (j2 / convert)), C36H.A04(c36g, (j % convert) - (j2 % convert)));
            }
            if (j4 < 0) {
                j3 = C36J.A02;
            } else {
                j3 = C36J.A01;
            }
            return ((-(j3 >> 1)) << 1) + (((int) j3) & 1);
        }
        return C36H.A04(c36g, j4);
    }
}
