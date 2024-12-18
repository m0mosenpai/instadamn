package X;

/* renamed from: X.S9s, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62393S9s {
    public static final C60799RTk A00;
    public static final C60800RTl A01;
    public static final C60800RTl A02;
    public static final C60800RTl A03;
    public static final C60800RTl A04;

    static {
        try {
            SY9 sy9 = SY9.A04;
            SYC syc = SYC.A03;
            A01 = S3Q.A00(syc, sy9, 32, 16);
            try {
                A02 = S3Q.A00(syc, sy9, 32, 32);
                try {
                    SYC syc2 = SYC.A05;
                    A03 = S3Q.A00(syc2, sy9, 64, 32);
                    try {
                        A04 = S3Q.A00(syc2, sy9, 64, 64);
                        try {
                            A00 = S3O.A00(SY8.A04, 32, 16);
                        } catch (Exception e) {
                            throw new RuntimeException(e);
                        }
                    } catch (Exception e2) {
                        throw new RuntimeException(e2);
                    }
                } catch (Exception e3) {
                    throw new RuntimeException(e3);
                }
            } catch (Exception e4) {
                throw new RuntimeException(e4);
            }
        } catch (Exception e5) {
            throw new RuntimeException(e5);
        }
    }
}
