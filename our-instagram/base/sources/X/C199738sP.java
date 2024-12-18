package X;

import android.opengl.Matrix;

/* renamed from: X.8sP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C199738sP {
    public final C179417xr A00 = new C179417xr();
    public final float[] A02 = new float[16];
    public final float[] A01 = new float[16];

    public final void A00(AbstractC179397xp abstractC179397xp, C179407xq c179407xq, int i, int i2) {
        abstractC179397xp.A09(c179407xq.A01, c179407xq.A00, i, i2, 0, false, false);
        C179407xq A08 = abstractC179397xp.A08();
        float[] fArr = this.A02;
        Matrix.multiplyMM(fArr, 0, c179407xq.A03, 0, A08.A03, 0);
        Matrix.multiplyMM(this.A01, 0, c179407xq.A02, 0, A08.A02, 0);
        fArr[12] = 0.0f;
        fArr[13] = 0.0f;
    }

    public final void A01(C179407xq c179407xq, C179407xq c179407xq2) {
        float[] fArr = this.A02;
        Matrix.multiplyMM(fArr, 0, c179407xq.A03, 0, c179407xq2.A03, 0);
        Matrix.multiplyMM(this.A01, 0, c179407xq.A02, 0, this.A00.A08().A02, 0);
        fArr[12] = 0.0f;
        fArr[13] = 0.0f;
    }
}
