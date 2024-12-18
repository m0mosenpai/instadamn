package X;

import java.nio.FloatBuffer;

/* renamed from: X.W2n, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70091W2n {
    public static final FloatBuffer A05;
    public static final float[] A06;
    public WER A00;
    public final int A01;
    public final int A02;
    public final FloatBuffer A03;
    public final float[] A04;

    static {
        float[] fArr = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
        A06 = fArr;
        FloatBuffer A0k = AbstractC65702TsY.A0k(fArr, 32);
        A0k.position(0);
        A05 = A0k;
    }

    public C70091W2n(WER wer, int i, int i2) {
        float[] fArr = new float[8];
        this.A04 = fArr;
        FloatBuffer A0k = AbstractC65702TsY.A0k(fArr, 32);
        A0k.position(0);
        this.A03 = A0k;
        this.A00 = wer;
        this.A02 = i;
        this.A01 = i2;
    }
}
