package X;

/* renamed from: X.5A8, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5A8 {
    public static final C5A8 A01;
    public static final C5A8 A02;
    public static final C5A8 A03;
    public final float[] A00;

    static {
        final float[] fArr = {0.8951f, -0.7502f, 0.0389f, 0.2664f, 1.7135f, -0.0685f, -0.1614f, 0.0367f, 1.0296f};
        A01 = new C5A8(fArr) { // from class: X.5A9
            public final String toString() {
                return "Bradford";
            }
        };
        final float[] fArr2 = {0.40024f, -0.2263f, 0.0f, 0.7076f, 1.16532f, 0.0f, -0.08081f, 0.0457f, 0.91822f};
        A03 = new C5A8(fArr2) { // from class: X.5AA
            public final String toString() {
                return "VonKries";
            }
        };
        final float[] fArr3 = {0.7328f, -0.7036f, 0.003f, 0.4296f, 1.6975f, 0.0136f, -0.1624f, 0.0061f, 0.9834f};
        A02 = new C5A8(fArr3) { // from class: X.5AB
            public final String toString() {
                return "Ciecat02";
            }
        };
    }

    public C5A8(float[] fArr) {
        this.A00 = fArr;
    }
}
