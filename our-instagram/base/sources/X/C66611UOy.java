package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;

/* renamed from: X.UOy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66611UOy extends AbstractC56722j5 implements InterfaceC56762j9 {
    public int A00;
    public final WWQ A01;
    public final float A02;
    public final float A03;
    public final Matrix A04;
    public final Paint A05;

    public C66611UOy(AbstractC56612iu abstractC56612iu, C56682j1 c56682j1) {
        super(abstractC56612iu, c56682j1);
        C56682j1 c56682j12;
        int[] iArr;
        WWQ wwq = abstractC56612iu.A0Q;
        if (wwq != null) {
            this.A01 = wwq;
            this.A05 = new Paint(1);
            Matrix matrix = new Matrix();
            this.A04 = matrix;
            try {
                c56682j12 = this.A0B;
                iArr = this.A01.A01;
            } catch (C40U unused) {
            }
            if (iArr != null) {
                C1349268q A02 = c56682j12.A02(iArr[this.A00]);
                if (A02 != null) {
                    C14360o3.A07(A02.A00);
                    float width = A02.A01.A01 / r3.getWidth();
                    this.A02 = width;
                    float height = A02.A01.A00 / r3.getHeight();
                    this.A03 = height;
                    matrix.preScale(width, height);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            C14360o3.A0F("bitmapIndices");
            throw C00O.createAndThrow();
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.AbstractC56722j5
    public final void A0A(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        Bitmap A00 = A00();
        if (A00 != null) {
            canvas.drawBitmap(A00, this.A04, this.A05);
        }
    }

    @Override // X.AbstractC56722j5
    public final void A0E(RectF rectF) {
        C14360o3.A0B(rectF, 0);
        Bitmap A00 = A00();
        if (A00 != null) {
            float width = A00.getWidth();
            C56682j1 c56682j1 = this.A0B;
            rectF.set(0.0f, 0.0f, width * c56682j1.A00 * this.A02, A00.getHeight() * c56682j1.A00 * this.A03);
        }
    }

    private final Bitmap A00() {
        C1349268q c1349268q;
        C56682j1 c56682j1;
        int[] iArr;
        try {
            c56682j1 = this.A0B;
            iArr = this.A01.A01;
        } catch (C40U unused) {
            c1349268q = null;
        }
        if (iArr != null) {
            c1349268q = c56682j1.A02(iArr[this.A00]);
            if (c1349268q != null) {
                Bitmap bitmap = c1349268q.A00;
                C14360o3.A07(bitmap);
                if (!bitmap.isRecycled()) {
                    return bitmap;
                }
            }
            return null;
        }
        C14360o3.A0F("bitmapIndices");
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC56722j5
    public final void A08(float f) {
        this.A05.setAlpha(super.A01);
        float f2 = this.A0B.A0E.A00 * (f - super.A04.A07);
        WWQ wwq = this.A01;
        int i = (int) (wwq.A00 * f2);
        this.A00 = i;
        int[] iArr = wwq.A01;
        if (iArr != null) {
            int length = iArr.length - 1;
            if (i > length) {
                i = length;
            }
            this.A00 = i;
            if (i < 0) {
                i = 0;
            }
            this.A00 = i;
            return;
        }
        C14360o3.A0F("bitmapIndices");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC56762j9
    public final void ERi(ColorFilter colorFilter) {
        this.A05.setColorFilter(colorFilter);
    }

    @Override // X.AbstractC56722j5
    public final void A07() {
        super.A07();
        Matrix matrix = this.A04;
        matrix.reset();
        float f = this.A02;
        float f2 = this.A0B.A00;
        matrix.preScale(f * f2, this.A03 * f2);
    }
}
