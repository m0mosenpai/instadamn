package X;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import java.util.Iterator;

/* renamed from: X.65X, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C65X {
    public static final Matrix A00 = new Matrix();

    public final void A00(Canvas canvas, Matrix matrix, C65Y c65y, int i) {
        int[] iArr;
        int i2;
        if (this instanceof C72O) {
            C72O c72o = (C72O) this;
            C72N c72n = c72o.A02;
            float f = c72n.A01;
            float f2 = c72o.A01;
            float f3 = c72n.A00;
            float f4 = c72o.A00;
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f - f2, f3 - f4), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(f4, f2);
            matrix2.preRotate((float) Math.toDegrees(Math.atan((c72n.A01 - f2) / (c72n.A00 - f4))));
            rectF.bottom += i;
            rectF.offset(0.0f, -i);
            int[] iArr2 = C65Y.A0B;
            iArr2[0] = c65y.A00;
            iArr2[1] = c65y.A01;
            iArr2[2] = c65y.A02;
            Paint paint = c65y.A05;
            float f5 = rectF.left;
            paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr2, C65Y.A09, Shader.TileMode.CLAMP));
            canvas.save();
            canvas.concat(matrix2);
            canvas.drawRect(rectF, paint);
        } else if (this instanceof C72L) {
            C72J c72j = ((C72L) this).A00;
            RectF rectF2 = C72J.A06;
            float f6 = c72j.A03;
            float f7 = c72j.A04;
            RectF rectF3 = new RectF(c72j.A01, c72j.A05, c72j.A02, c72j.A00);
            boolean z = false;
            if (f7 < 0.0f) {
                z = true;
            }
            Path path = c65y.A07;
            if (z) {
                iArr = C65Y.A0A;
                iArr[0] = 0;
                iArr[1] = c65y.A00;
                iArr[2] = c65y.A01;
                i2 = c65y.A02;
            } else {
                path.rewind();
                path.moveTo(rectF3.centerX(), rectF3.centerY());
                path.arcTo(rectF3, f6, f7);
                path.close();
                float f8 = -i;
                rectF3.inset(f8, f8);
                iArr = C65Y.A0A;
                iArr[0] = 0;
                iArr[1] = c65y.A02;
                iArr[2] = c65y.A01;
                i2 = c65y.A00;
            }
            iArr[3] = i2;
            float width = rectF3.width() / 2.0f;
            if (width <= 0.0f) {
                return;
            }
            float f9 = 1.0f - (i / width);
            float[] fArr = C65Y.A08;
            fArr[1] = f9;
            fArr[2] = ((1.0f - f9) / 2.0f) + f9;
            RadialGradient radialGradient = new RadialGradient(rectF3.centerX(), rectF3.centerY(), width, iArr, fArr, Shader.TileMode.CLAMP);
            Paint paint2 = c65y.A04;
            paint2.setShader(radialGradient);
            canvas.save();
            canvas.concat(matrix);
            canvas.scale(1.0f, rectF3.height() / rectF3.width());
            if (!z) {
                canvas.clipPath(path, Region.Op.DIFFERENCE);
                canvas.drawPath(path, c65y.A03);
            }
            canvas.drawArc(rectF3, f6, f7, true, paint2);
        } else {
            C72P c72p = (C72P) this;
            Iterator it = c72p.A02.iterator();
            while (it.hasNext()) {
                ((C65X) it.next()).A00(canvas, c72p.A00, c65y, i);
            }
            return;
        }
        canvas.restore();
    }
}
