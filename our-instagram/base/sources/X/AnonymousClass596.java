package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import java.util.List;

/* renamed from: X.596, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass596 implements AnonymousClass585 {
    public Canvas A00 = AnonymousClass597.A00;
    public Rect A01;
    public Rect A02;

    @Override // X.AnonymousClass585
    public final /* synthetic */ void AI8(C114205Dh c114205Dh, int i) {
        AI7(1, c114205Dh.A01, c114205Dh.A03, c114205Dh.A02, c114205Dh.A00);
    }

    @Override // X.AnonymousClass585
    public final void AJ3(float[] fArr) {
        for (int i = 0; i < 4; i++) {
            int i2 = 0;
            do {
                float f = 0.0f;
                if (i == i2) {
                    f = 1.0f;
                }
                if (fArr[(i * 4) + i2] == f) {
                    i2++;
                } else {
                    Matrix matrix = new Matrix();
                    AbstractC130975vl.A00(matrix, fArr);
                    this.A00.concat(matrix);
                    return;
                }
            } while (i2 < 4);
        }
    }

    @Override // X.AnonymousClass585
    public final void AQy(C5AO c5ao, List list, int i) {
        if (i == 1) {
            if (list.size() >= 2) {
                Paint paint = ((C5AN) c5ao).A01;
                for (int i2 = 0; i2 < list.size() - 1; i2 += 2) {
                    long j = ((C119365at) list.get(i2)).A00;
                    long j2 = ((C119365at) list.get(i2 + 1)).A00;
                    this.A00.drawLine(C119365at.A01(j), C119365at.A02(j), C119365at.A01(j2), C119365at.A02(j2), paint);
                }
                return;
            }
            return;
        }
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            long j3 = ((C119365at) list.get(i3)).A00;
            this.A00.drawPoint(C119365at.A01(j3), C119365at.A02(j3), ((C5AN) c5ao).A01);
        }
    }

    @Override // X.AnonymousClass585
    public final void AI6(C60Y c60y, int i) {
        Canvas canvas = this.A00;
        if (c60y instanceof C60X) {
            canvas.clipPath(((C60X) c60y).A03, Region.Op.INTERSECT);
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // X.AnonymousClass585
    public final void AI7(int i, float f, float f2, float f3, float f4) {
        Region.Op op;
        Canvas canvas = this.A00;
        if (i == 0) {
            op = Region.Op.DIFFERENCE;
        } else {
            op = Region.Op.INTERSECT;
        }
        canvas.clipRect(f, f2, f3, f4, op);
    }

    @Override // X.AnonymousClass585
    public final void APZ() {
        S9H.A00(this.A00, false);
    }

    @Override // X.AnonymousClass585
    public final void AQY(C5AO c5ao, float f, float f2, float f3, float f4, float f5, float f6, boolean z) {
        this.A00.drawArc(f, f2, f3, f4, f5, f6, z, ((C5AN) c5ao).A01);
    }

    @Override // X.AnonymousClass585
    public final void AQc(C5AO c5ao, float f, long j) {
        this.A00.drawCircle(C119365at.A01(j), C119365at.A02(j), f, ((C5AN) c5ao).A01);
    }

    @Override // X.AnonymousClass585
    public final void AQl(InterfaceC137546La interfaceC137546La, C5AO c5ao, long j) {
        this.A00.drawBitmap(C62Z.A00(interfaceC137546La), C119365at.A01(0L), Float.intBitsToFloat(0), ((C5AN) c5ao).A01);
    }

    @Override // X.AnonymousClass585
    public final void AQn(InterfaceC137546La interfaceC137546La, C5AO c5ao, long j, long j2, long j3, long j4) {
        if (this.A02 == null) {
            this.A02 = new Rect();
            this.A01 = new Rect();
        }
        Canvas canvas = this.A00;
        Bitmap A00 = C62Z.A00(interfaceC137546La);
        Rect rect = this.A02;
        C14360o3.A0A(rect);
        int i = (int) (0 >> 32);
        rect.left = i;
        rect.top = 0;
        rect.right = i + ((int) (j2 >> 32));
        rect.bottom = C119055aN.A00(j2);
        Rect rect2 = this.A01;
        C14360o3.A0A(rect2);
        int i2 = (int) (j3 >> 32);
        rect2.left = i2;
        int i3 = (int) (j3 & 4294967295L);
        rect2.top = i3;
        rect2.right = i2 + ((int) (j4 >> 32));
        rect2.bottom = i3 + C119055aN.A00(j4);
        canvas.drawBitmap(A00, rect, rect2, ((C5AN) c5ao).A01);
    }

    @Override // X.AnonymousClass585
    public final void AQt(C5AO c5ao, long j, long j2) {
        this.A00.drawLine(C119365at.A01(j), C119365at.A02(j), C119365at.A01(j2), C119365at.A02(j2), ((C5AN) c5ao).A01);
    }

    @Override // X.AnonymousClass585
    public final void AQu(C5AO c5ao, C60Y c60y) {
        Canvas canvas = this.A00;
        if (c60y instanceof C60X) {
            canvas.drawPath(((C60X) c60y).A03, ((C5AN) c5ao).A01);
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // X.AnonymousClass585
    public final void AQz(C5AO c5ao, float f, float f2, float f3, float f4) {
        this.A00.drawRect(f, f2, f3, f4, ((C5AN) c5ao).A01);
    }

    @Override // X.AnonymousClass585
    public final void AR2(C5AO c5ao, float f, float f2, float f3, float f4, float f5, float f6) {
        this.A00.drawRoundRect(f, f2, f3, f4, f5, f6, ((C5AN) c5ao).A01);
    }

    @Override // X.AnonymousClass585
    public final void ARv() {
        S9H.A00(this.A00, true);
    }

    @Override // X.AnonymousClass585
    public final void EKS() {
        this.A00.restore();
    }

    @Override // X.AnonymousClass585
    public final void EL6(float f) {
        this.A00.rotate(f);
    }

    @Override // X.AnonymousClass585
    public final void ELZ() {
        this.A00.save();
    }

    @Override // X.AnonymousClass585
    public final void ELk(C114205Dh c114205Dh, C5AO c5ao) {
        this.A00.saveLayer(c114205Dh.A01, c114205Dh.A03, c114205Dh.A02, c114205Dh.A00, ((C5AN) c5ao).A01, 31);
    }

    @Override // X.AnonymousClass585
    public final void ELy(float f, float f2) {
        this.A00.scale(f, f2);
    }

    @Override // X.AnonymousClass585
    public final void F8X(float f, float f2) {
        this.A00.translate(f, f2);
    }
}
