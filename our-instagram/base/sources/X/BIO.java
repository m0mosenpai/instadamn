package X;

import android.graphics.Matrix;

/* loaded from: classes5.dex */
public final class BIO {
    public Matrix A02;
    public Matrix A03;
    public float[] A05;
    public float[] A06;
    public final InterfaceC16620sF A07;
    public boolean A00 = true;
    public boolean A01 = true;
    public boolean A04 = true;

    public final float[] A00(Object obj) {
        float[] fArr = this.A05;
        if (fArr == null) {
            fArr = C5AJ.A06();
            this.A05 = fArr;
        }
        if (this.A01) {
            this.A04 = AbstractC130985vm.A00(A01(obj), fArr);
            this.A01 = false;
        }
        if (!this.A04) {
            return null;
        }
        return fArr;
    }

    public final float[] A01(Object obj) {
        float[] fArr = this.A06;
        if (fArr == null) {
            fArr = C5AJ.A06();
            this.A06 = fArr;
        }
        if (this.A00) {
            Matrix matrix = this.A02;
            if (matrix == null) {
                matrix = new Matrix();
                this.A02 = matrix;
            }
            this.A07.invoke(obj, matrix);
            Matrix matrix2 = this.A03;
            if (matrix2 == null || !matrix.equals(matrix2)) {
                AbstractC130975vl.A01(matrix, fArr);
                this.A02 = matrix2;
                this.A03 = matrix;
            }
            this.A00 = false;
        }
        return fArr;
    }

    public BIO(InterfaceC16620sF interfaceC16620sF) {
        this.A07 = interfaceC16620sF;
    }
}
