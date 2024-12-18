package X;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: X.60X, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C60X implements C60Y {
    public Matrix A00;
    public RectF A01;
    public float[] A02;
    public final Path A03;

    @Override // X.C60Y
    public final boolean E2G(C60Y c60y, C60Y c60y2, int i) {
        Path.Op op;
        if (i == 0) {
            op = Path.Op.DIFFERENCE;
        } else {
            op = Path.Op.INTERSECT;
        }
        Path path = this.A03;
        if (c60y instanceof C60X) {
            Path path2 = ((C60X) c60y).A03;
            if (c60y2 instanceof C60X) {
                return path.op(path2, ((C60X) c60y2).A03, op);
            }
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public final void A00(long j) {
        Matrix matrix = this.A00;
        if (matrix == null) {
            this.A00 = new Matrix();
        } else {
            matrix.reset();
        }
        Matrix matrix2 = this.A00;
        C14360o3.A0A(matrix2);
        matrix2.setTranslate(C119365at.A01(j), C119365at.A02(j));
        Path path = this.A03;
        Matrix matrix3 = this.A00;
        C14360o3.A0A(matrix3);
        path.transform(matrix3);
    }

    public final void A01(C114205Dh c114205Dh, float f) {
        float f2 = c114205Dh.A01;
        float f3 = c114205Dh.A03;
        float f4 = c114205Dh.A02;
        float f5 = c114205Dh.A00;
        RectF rectF = this.A01;
        if (rectF == null) {
            rectF = new RectF();
            this.A01 = rectF;
        }
        rectF.set(f2, f3, f4, f5);
        Path path = this.A03;
        RectF rectF2 = this.A01;
        C14360o3.A0A(rectF2);
        path.arcTo(rectF2, f, 45.0f, false);
    }

    @Override // X.C60Y
    public final void AA7(C114205Dh c114205Dh, Integer num) {
        float f = c114205Dh.A01;
        if (!Float.isNaN(f)) {
            float f2 = c114205Dh.A03;
            if (!Float.isNaN(f2)) {
                float f3 = c114205Dh.A02;
                if (!Float.isNaN(f3)) {
                    float f4 = c114205Dh.A00;
                    if (!Float.isNaN(f4)) {
                        RectF rectF = this.A01;
                        if (rectF == null) {
                            rectF = new RectF();
                            this.A01 = rectF;
                        }
                        rectF.set(f, f2, f3, f4);
                        Path path = this.A03;
                        RectF rectF2 = this.A01;
                        C14360o3.A0A(rectF2);
                        path.addRect(rectF2, Path.Direction.CCW);
                        return;
                    }
                }
            }
        }
        throw new IllegalStateException("Invalid rectangle, make sure no value is NaN");
    }

    @Override // X.C60Y
    public final void AAG(C137656Ll c137656Ll, Integer num) {
        RectF rectF = this.A01;
        if (rectF == null) {
            rectF = new RectF();
            this.A01 = rectF;
        }
        rectF.set(c137656Ll.A01, c137656Ll.A03, c137656Ll.A02, c137656Ll.A00);
        float[] fArr = this.A02;
        if (fArr == null) {
            fArr = new float[8];
            this.A02 = fArr;
        }
        long j = c137656Ll.A06;
        long j2 = AbstractC137646Lk.A00;
        fArr[0] = Float.intBitsToFloat((int) (j >> 32));
        fArr[1] = AbstractC137646Lk.A00(j);
        long j3 = c137656Ll.A07;
        fArr[2] = Float.intBitsToFloat((int) (j3 >> 32));
        fArr[3] = AbstractC137646Lk.A00(j3);
        long j4 = c137656Ll.A05;
        fArr[4] = Float.intBitsToFloat((int) (j4 >> 32));
        fArr[5] = AbstractC137646Lk.A00(j4);
        long j5 = c137656Ll.A04;
        fArr[6] = Float.intBitsToFloat((int) (j5 >> 32));
        fArr[7] = AbstractC137646Lk.A00(j5);
        Path path = this.A03;
        RectF rectF2 = this.A01;
        C14360o3.A0A(rectF2);
        float[] fArr2 = this.A02;
        C14360o3.A0A(fArr2);
        path.addRoundRect(rectF2, fArr2, Path.Direction.CCW);
    }

    @Override // X.C60Y
    public final C114205Dh Ahn() {
        RectF rectF = this.A01;
        if (rectF == null) {
            rectF = new RectF();
            this.A01 = rectF;
        }
        this.A03.computeBounds(rectF, true);
        return new C114205Dh(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public C60X(Path path) {
        this.A03 = path;
    }

    public C60X() {
        this(new Path());
    }
}
