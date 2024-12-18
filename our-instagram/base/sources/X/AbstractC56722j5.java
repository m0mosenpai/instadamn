package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.media.MediaPlayer;
import android.util.Base64;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.2j5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC56722j5 {
    public Path A02;
    public RectF A03;
    public AbstractC56612iu A04;
    public AbstractC56722j5 A05;
    public AbstractC56722j5 A06;
    public List A07;
    public AbstractC56722j5[] A08;
    public final C56682j1 A0B;
    public final C56742j7 A0C;
    public final Matrix A09 = new Matrix();
    public final RectF A0A = new RectF();
    public int A01 = 255;
    public float A00 = 0.0f;

    public final void A09(float f) {
        float f2;
        A04(0.0f, f);
        AbstractC56722j5 abstractC56722j5 = this.A06;
        if (abstractC56722j5 != null) {
            if (this instanceof C56772jA) {
                f = this.A01;
            }
            abstractC56722j5.A09(f);
            return;
        }
        AbstractC56722j5[] abstractC56722j5Arr = this.A08;
        if (abstractC56722j5Arr == null) {
            return;
        }
        for (AbstractC56722j5 abstractC56722j52 : abstractC56722j5Arr) {
            if (this instanceof C56772jA) {
                f2 = this.A01;
            } else {
                f2 = f;
            }
            abstractC56722j52.A09(f2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.2j5, X.Txl] */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.2j5] */
    /* JADX WARN: Type inference failed for: r4v2, types: [X.2j8, X.2j5] */
    /* JADX WARN: Type inference failed for: r4v3, types: [X.2j5] */
    /* JADX WARN: Type inference failed for: r4v5, types: [X.UOx, X.2j5, java.lang.Object] */
    public static AbstractC56722j5 A03(AbstractC56612iu abstractC56612iu, C56682j1 c56682j1) {
        ?? abstractC56722j5;
        Shader[] shaderArr;
        AbstractC68230VIq[] abstractC68230VIqArr;
        C56562ip c56562ip = abstractC56612iu.A0f;
        if ((c56562ip != null || abstractC56612iu.A0a != null) && (abstractC56612iu.A0H > 0.0f || abstractC56612iu.A0F > 0.0f || abstractC56612iu.A0G > 0.0f || abstractC56612iu.A0o != null || abstractC56612iu.A0m != null || abstractC56612iu.A0n != null)) {
            abstractC56722j5 = new AbstractC56722j5(abstractC56612iu, c56682j1);
            boolean z = false;
            abstractC56722j5.A05 = false;
            abstractC56722j5.A00 = 0.0f;
            AbstractC56612iu abstractC56612iu2 = abstractC56722j5.A04;
            if (abstractC56612iu2.A0o == null && abstractC56612iu2.A0m == null && abstractC56612iu2.A0n == null && abstractC56612iu2.A0a == null) {
                z = true;
            }
            abstractC56722j5.A06 = z;
        } else if (c56562ip == null && abstractC56612iu.A0a == null) {
            if (abstractC56612iu.A0L >= 0) {
                return new C106114qR(abstractC56612iu, c56682j1);
            }
            String str = abstractC56612iu.A0s;
            if (str != null && str.length() != 0) {
                return new C66612UOz(abstractC56612iu, c56682j1);
            }
            if (abstractC56612iu.A0K >= 0) {
                ?? abstractC56722j52 = new AbstractC56722j5(abstractC56612iu, c56682j1);
                int i = abstractC56612iu.A0K;
                C141566aZ c141566aZ = c56682j1.A0D.A01;
                if (c141566aZ != null && (abstractC68230VIqArr = c141566aZ.A01) != null) {
                    if (i >= 0 && i < abstractC68230VIqArr.length) {
                        AbstractC68230VIq abstractC68230VIq = abstractC68230VIqArr[i];
                        java.util.Set set = c56682j1.A05;
                        if (set == null) {
                            set = new HashSet();
                            c56682j1.A05 = set;
                        }
                        set.add(abstractC56722j52);
                        abstractC56722j52.A00 = new MediaPlayer();
                        try {
                            abstractC56722j52.A00.setDataSource(AnonymousClass001.A0R("data:audio;base64,", Base64.encodeToString(abstractC68230VIq.A00, 0)));
                            abstractC56722j52.A00.setOnCompletionListener(new WIU(abstractC56722j52));
                            abstractC56722j52.A00.setOnErrorListener(new WIV(abstractC56722j52));
                            abstractC56722j52.A00.prepare();
                            return abstractC56722j52;
                        } catch (IOException unused) {
                            abstractC56722j52.A00 = null;
                            return abstractC56722j52;
                        }
                    }
                    throw new Exception("index out of range");
                }
                throw new Exception("no assets/audio in the document");
            }
            if (abstractC56612iu.A0Q != null) {
                return new C66611UOy(abstractC56612iu, c56682j1);
            }
            abstractC56722j5 = new AbstractC56722j5(abstractC56612iu, c56682j1);
            abstractC56722j5.A07 = new ArrayList();
            AbstractC56612iu abstractC56612iu3 = abstractC56722j5.A04;
            int i2 = abstractC56612iu3.A0N;
            if (i2 >= 0) {
                AbstractC56652iy[] abstractC56652iyArr = abstractC56722j5.A0B.A0D.A04;
                if (i2 < abstractC56652iyArr.length) {
                    C56712j4 A00 = C56712j4.A00(abstractC56652iyArr[i2], c56682j1);
                    ((AbstractC56722j5) A00).A00 = abstractC56612iu3.A07;
                    AbstractC56722j5[] abstractC56722j5Arr = abstractC56722j5.A08;
                    if (abstractC56722j5Arr != null) {
                        abstractC56722j5Arr[abstractC56722j5Arr.length - 1] = A00;
                        return abstractC56722j5;
                    }
                    abstractC56722j5.A06 = A00;
                    return abstractC56722j5;
                }
                throw new Exception("index out of range");
            }
        } else {
            abstractC56722j5 = new AbstractC56722j5(abstractC56612iu, c56682j1);
            abstractC56722j5.A00 = 0.0f;
            abstractC56722j5.A08 = false;
            AbstractC56612iu abstractC56612iu4 = abstractC56722j5.A04;
            AbstractC1348968m abstractC1348968m = abstractC56612iu4.A0V;
            if (abstractC1348968m != null && (abstractC1348968m.A05 != null || abstractC1348968m.A04 != null || abstractC1348968m.A02 != null || abstractC1348968m.A03 != null)) {
                AbstractC56652iy abstractC56652iy = c56682j1.A0E;
                int abs = ((int) (abstractC56652iy.A00 * abstractC56652iy.A01 * Math.abs(abstractC56612iu4.A0E - abstractC56612iu4.A04))) + 1;
                if (abstractC1348968m.A00 == 0) {
                    shaderArr = new LinearGradient[abs];
                } else {
                    shaderArr = new RadialGradient[abs];
                }
                abstractC56722j5.A09 = shaderArr;
            }
            int i3 = abstractC56612iu4.A0L;
            if (i3 >= 0) {
                try {
                    C1349268q A02 = abstractC56722j5.A0B.A02(i3);
                    abstractC56722j5.A07 = A02;
                    int width = A02.A00.getWidth();
                    int height = abstractC56722j5.A07.A00.getHeight();
                    if (width != 0 && height != 0) {
                        Matrix matrix = new Matrix();
                        abstractC56722j5.A02 = matrix;
                        AbstractC56602it abstractC56602it = abstractC56722j5.A07.A01;
                        matrix.preScale(abstractC56602it.A01 / width, abstractC56602it.A00 / height);
                        abstractC56722j5.A03 = new Paint(1);
                        return abstractC56722j5;
                    }
                    throw new Exception(String.format("Bitmap width is %d px and height is %d px. Neither width nor height should be 0.", Integer.valueOf(width), Integer.valueOf(height)));
                } catch (C40U unused2) {
                }
            }
        }
        return abstractC56722j5;
    }

    private void A04(float f, float f2) {
        AbstractC56612iu abstractC56612iu = this.A04;
        this.A01 = (int) (((int) (C3LR.A00(abstractC56612iu.A0j, abstractC56612iu.A06, f, this.A0B.A0E.A00) * 255.0f)) * (f2 / 255.0f));
    }

    private void A05(Canvas canvas, RectF rectF) {
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.A0B.A01(PorterDuff.Mode.CLEAR));
    }

    public final RectF A06() {
        if (this.A07 != null) {
            for (int i = 0; i < this.A07.size(); i++) {
                this.A0A.union(((AbstractC56722j5) this.A07.get(i)).A06());
            }
        }
        if (this.A02 != null) {
            RectF rectF = this.A0A;
            if (!rectF.isEmpty()) {
                Path path = this.A02;
                RectF[] rectFArr = this.A0B.A0G;
                path.computeBounds(rectFArr[0], false);
                this.A09.mapRect(rectFArr[0]);
                if (!rectF.intersect(rectFArr[0]) || rectF.width() < 1.0f || rectF.height() < 1.0f) {
                    rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
                }
            }
        }
        AbstractC56722j5 abstractC56722j5 = this.A05;
        if (abstractC56722j5 != null) {
            RectF A06 = abstractC56722j5.A06();
            if (this.A04.A02 != 2) {
                RectF rectF2 = this.A0A;
                if (!rectF2.intersect(A06) || rectF2.width() < 1.0f || rectF2.height() < 1.0f) {
                    rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
                }
            }
        }
        return this.A0A;
    }

    public void A07() {
        Path path = this.A0C.A00;
        if (path != null) {
            path.rewind();
        }
        AbstractC56722j5 abstractC56722j5 = this.A06;
        if (abstractC56722j5 != null) {
            abstractC56722j5.A07();
        } else {
            AbstractC56722j5[] abstractC56722j5Arr = this.A08;
            if (abstractC56722j5Arr != null) {
                for (AbstractC56722j5 abstractC56722j52 : abstractC56722j5Arr) {
                    abstractC56722j52.A07();
                }
            }
        }
        Path path2 = this.A02;
        if (path2 != null) {
            path2.rewind();
        }
        AbstractC56722j5 abstractC56722j53 = this.A05;
        if (abstractC56722j53 != null) {
            abstractC56722j53.A07();
        }
    }

    public void A08(float f) {
        if (!(this instanceof C56772jA)) {
            C106114qR c106114qR = (C106114qR) this;
            c106114qR.A03.setAlpha(((AbstractC56722j5) c106114qR).A01);
        }
    }

    public void A0A(Canvas canvas) {
        if (this instanceof C106114qR) {
            C106114qR c106114qR = (C106114qR) this;
            try {
                Bitmap bitmap = c106114qR.A0B.A02(c106114qR.A04.A0L).A00;
                if (bitmap != null && !bitmap.isRecycled()) {
                    canvas.drawBitmap(bitmap, c106114qR.A02, c106114qR.A03);
                }
            } catch (C40U unused) {
            }
        }
    }

    public final void A0B(Canvas canvas, float f) {
        Paint paint;
        PorterDuff.Mode mode;
        float f2 = this.A00;
        if (f2 != 0.0f) {
            f = Math.max(0.0f, Math.min(f - f2, 1.0f));
        }
        AbstractC56612iu abstractC56612iu = this.A04;
        if (f >= abstractC56612iu.A04 && f <= abstractC56612iu.A0E) {
            RectF rectF = this.A0A;
            if (!rectF.isEmpty()) {
                C56682j1 c56682j1 = this.A0B;
                if (!c56682j1.A06) {
                    if (rectF.right >= 0.0f && rectF.bottom >= 0.0f) {
                        float f3 = rectF.left;
                        RectF rectF2 = c56682j1.A0C;
                        if (f3 > rectF2.width() || rectF.top > rectF2.height()) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                int save = canvas.save();
                if (this.A02 == null && this.A05 == null) {
                    Matrix matrix = this.A09;
                    canvas.concat(matrix);
                    A0A(canvas);
                    Matrix matrix2 = c56682j1.A0B;
                    matrix.invert(matrix2);
                    canvas.concat(matrix2);
                    if (this.A07 != null) {
                        for (int i = 0; i < this.A07.size(); i++) {
                            ((AbstractC56722j5) this.A07.get(i)).A0B(canvas, f);
                        }
                    }
                } else {
                    RectF rectF3 = this.A03;
                    if (rectF3 == null) {
                        rectF3 = new RectF();
                        this.A03 = rectF3;
                    }
                    rectF3.set(0.0f, 0.0f, rectF.width(), rectF.height());
                    canvas.translate(rectF.left, rectF.top);
                    int saveLayer = canvas.saveLayer(this.A03, null);
                    A05(canvas, this.A03);
                    canvas.translate(-rectF.left, -rectF.top);
                    Matrix matrix3 = this.A09;
                    canvas.concat(matrix3);
                    A0A(canvas);
                    Matrix matrix4 = c56682j1.A0B;
                    matrix3.invert(matrix4);
                    canvas.concat(matrix4);
                    if (this.A07 != null) {
                        for (int i2 = 0; i2 < this.A07.size(); i2++) {
                            ((AbstractC56722j5) this.A07.get(i2)).A0B(canvas, f);
                        }
                    }
                    Path path = this.A02;
                    if (path != null) {
                        RectF rectF4 = this.A03;
                        float f4 = rectF.left;
                        float f5 = rectF.top;
                        canvas.translate(f4, f5);
                        canvas.saveLayer(rectF4, c56682j1.A01(PorterDuff.Mode.DST_IN));
                        A05(canvas, rectF4);
                        float f6 = -f4;
                        float f7 = -f5;
                        canvas.translate(f6, f7);
                        canvas.concat(matrix3);
                        canvas.drawPath(path, c56682j1.A01(null));
                        canvas.restore();
                        canvas.translate(f6, f7);
                    }
                    AbstractC56722j5 abstractC56722j5 = this.A05;
                    if (abstractC56722j5 != null) {
                        RectF rectF5 = this.A03;
                        float f8 = rectF.left;
                        float f9 = rectF.top;
                        byte b = abstractC56612iu.A02;
                        if (b == 1) {
                            mode = PorterDuff.Mode.DST_IN;
                        } else if (b == 2) {
                            mode = PorterDuff.Mode.DST_OUT;
                        } else {
                            paint = null;
                            canvas.translate(f8, f9);
                            canvas.saveLayer(rectF5, paint);
                            A05(canvas, rectF5);
                            canvas.translate(-f8, -f9);
                            abstractC56722j5.A0B(canvas, f);
                            canvas.restore();
                        }
                        paint = c56682j1.A01(mode);
                        canvas.translate(f8, f9);
                        canvas.saveLayer(rectF5, paint);
                        A05(canvas, rectF5);
                        canvas.translate(-f8, -f9);
                        abstractC56722j5.A0B(canvas, f);
                        canvas.restore();
                    }
                    canvas.restoreToCount(saveLayer);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A0C(ColorFilter colorFilter) {
        if (this instanceof InterfaceC56762j9) {
            ((InterfaceC56762j9) this).ERi(colorFilter);
        }
        AbstractC56722j5 abstractC56722j5 = this.A06;
        if (abstractC56722j5 != null) {
            abstractC56722j5.A0C(colorFilter);
            return;
        }
        AbstractC56722j5[] abstractC56722j5Arr = this.A08;
        if (abstractC56722j5Arr == null) {
            return;
        }
        for (AbstractC56722j5 abstractC56722j52 : abstractC56722j5Arr) {
            abstractC56722j52.A0C(colorFilter);
        }
    }

    /* JADX WARN: Type inference failed for: r0v46, types: [X.3LS, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v48, types: [X.3LS, java.lang.Object] */
    public final void A0D(Matrix matrix, float f, float f2) {
        float f3;
        float f4 = f2;
        float f5 = f;
        RectF rectF = this.A0A;
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        float f6 = this.A00;
        if (f6 != 0.0f) {
            f5 = Math.max(0.0f, Math.min(f - f6, 1.0f));
        }
        C56742j7 c56742j7 = this.A0C;
        Matrix matrix2 = this.A09;
        matrix2.reset();
        if (matrix != null) {
            matrix2.preConcat(matrix);
        }
        AbstractC56612iu abstractC56612iu = c56742j7.A03;
        float f7 = abstractC56612iu.A0I;
        C68i c68i = abstractC56612iu.A0p;
        C56682j1 c56682j1 = c56742j7.A04;
        AbstractC56652iy abstractC56652iy = c56682j1.A0E;
        matrix2.preTranslate(C3LR.A00(c68i, f7, f5, abstractC56652iy.A00) * c56682j1.A00, 0.0f);
        matrix2.preTranslate(0.0f, C3LR.A00(abstractC56612iu.A0q, abstractC56612iu.A0J, f5, abstractC56652iy.A00) * c56682j1.A00);
        AbstractC1348868e abstractC1348868e = abstractC56612iu.A0b;
        if (abstractC1348868e != null) {
            Path path = c56742j7.A00;
            PathMeasure pathMeasure = c56742j7.A01;
            float[] fArr = c56742j7.A02;
            C56562ip c56562ip = ((C56562ip[]) abstractC1348868e.A00)[0];
            if (path.isEmpty()) {
                float f8 = c56682j1.A00;
                int i = 0;
                for (int i2 = 0; i2 < c56562ip.A02.length; i2++) {
                    i = C3LU.A01(path, c56562ip, f8, f8, i2, i);
                    pathMeasure.setPath(path, false);
                    fArr[i2] = pathMeasure.getLength();
                }
            }
            float f9 = abstractC56652iy.A00;
            float f10 = c56682j1.A00;
            C56692j2 c56692j2 = c56682j1.A03;
            float[] fArr2 = c56692j2.A08;
            if (fArr2 == null) {
                fArr2 = new float[2];
                c56692j2.A08 = fArr2;
            }
            float[] fArr3 = ((C68f) abstractC1348868e).A00;
            int length = fArr3.length;
            int A02 = C3LU.A02(fArr3, f5, length);
            C56562ip c56562ip2 = ((C56562ip[]) abstractC1348868e.A00)[0];
            if (A02 < 0 && (A02 = -(A02 + 1)) != 0 && A02 != length) {
                float f11 = fArr[A02];
                if (f11 == 0.0f) {
                    A02--;
                } else {
                    int i3 = A02 - 1;
                    float A00 = C3LU.A00(abstractC1348868e.A01[i3], fArr3[i3], fArr3[A02], f5, f9);
                    if (A00 == 0.0f) {
                        AbstractC141576aa.A00(c56562ip2, fArr2, f10, f10, i3);
                    } else {
                        float f12 = fArr[i3];
                        pathMeasure.getPosTan(f12 + ((f11 - f12) * A00), fArr2, null);
                    }
                    matrix2.preTranslate(fArr2[0], fArr2[1]);
                }
            }
            AbstractC141576aa.A00(c56562ip2, fArr2, f10, f10, A02);
            matrix2.preTranslate(fArr2[0], fArr2[1]);
        }
        matrix2.preRotate((float) Math.toDegrees(C3LR.A00(abstractC56612iu.A0k, abstractC56612iu.A08, f5, abstractC56652iy.A00)));
        C3LS c3ls = abstractC56612iu.A0h;
        AbstractC1348868e abstractC1348868e2 = abstractC56612iu.A0c;
        float f13 = abstractC56652iy.A00;
        C56692j2 c56692j22 = c56682j1.A03;
        C3LS c3ls2 = c56692j22.A06;
        C3LS c3ls3 = c3ls2;
        if (c3ls2 == null) {
            ?? obj = new Object();
            c56692j22.A06 = obj;
            c3ls3 = obj;
        }
        C3LS c3ls4 = (C3LS) C3LT.A00(c3ls, c3ls3, abstractC1348868e2, f5, f13);
        if (c3ls4 != null) {
            matrix2.preScale(c3ls4.A00, c3ls4.A01);
        }
        C3LS c3ls5 = abstractC56612iu.A0g;
        AbstractC1348868e abstractC1348868e3 = abstractC56612iu.A0X;
        float f14 = abstractC56652iy.A00;
        C3LS c3ls6 = c56692j22.A06;
        C3LS c3ls7 = c3ls6;
        if (c3ls6 == null) {
            ?? obj2 = new Object();
            c56692j22.A06 = obj2;
            c3ls7 = obj2;
        }
        C3LS c3ls8 = (C3LS) C3LT.A00(c3ls5, c3ls7, abstractC1348868e3, f5, f14);
        if (c3ls8 != null) {
            float f15 = -c3ls8.A00;
            float f16 = c56682j1.A00;
            matrix2.preTranslate(f15 * f16, (-c3ls8.A01) * f16);
        }
        A04(f5, f4);
        AbstractC56612iu abstractC56612iu2 = this.A04;
        if (f5 >= abstractC56612iu2.A04 && f5 <= abstractC56612iu2.A0E) {
            A08(f5);
        }
        A0E(rectF);
        if (!rectF.isEmpty()) {
            matrix2.mapRect(rectF);
        }
        C56682j1 c56682j12 = this.A0B;
        C56702j3 c56702j3 = c56682j12.A04;
        if (c56702j3.A08) {
            c56702j3.A09.add(Integer.valueOf(abstractC56612iu2.A0M));
        }
        AbstractC56722j5 abstractC56722j5 = this.A06;
        if (abstractC56722j5 != null) {
            if (this instanceof C56772jA) {
                f4 = this.A01;
            }
            abstractC56722j5.A0D(matrix2, f5, f4);
        } else {
            AbstractC56722j5[] abstractC56722j5Arr = this.A08;
            if (abstractC56722j5Arr != null) {
                for (AbstractC56722j5 abstractC56722j52 : abstractC56722j5Arr) {
                    if (this instanceof C56772jA) {
                        f3 = this.A01;
                    } else {
                        f3 = f4;
                    }
                    abstractC56722j52.A0D(matrix2, f5, f3);
                }
            }
        }
        C56562ip c56562ip3 = abstractC56612iu2.A0e;
        AbstractC1348868e abstractC1348868e4 = abstractC56612iu2.A0Y;
        C56562ip A002 = c56682j12.A03.A00();
        Path path2 = this.A02;
        float f17 = c56682j12.A0E.A00;
        float f18 = c56682j12.A00;
        this.A02 = C3LU.A03(path2, abstractC1348868e4, c56562ip3, A002, f5, f17, f18, f18);
    }

    public void A0E(RectF rectF) {
        if (this instanceof C56772jA) {
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            return;
        }
        C106114qR c106114qR = (C106114qR) this;
        try {
            C56682j1 c56682j1 = c106114qR.A0B;
            Bitmap bitmap = c56682j1.A02(c106114qR.A04.A0L).A00;
            if (bitmap != null && !bitmap.isRecycled()) {
                rectF.set(0.0f, 0.0f, bitmap.getWidth() * c56682j1.A00 * c106114qR.A00, bitmap.getHeight() * c56682j1.A00 * c106114qR.A01);
            }
        } catch (C40U unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x005d, code lost:
    
        if (r5.A0x != null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AbstractC56722j5(X.AbstractC56612iu r7, X.C56682j1 r8) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC56722j5.<init>(X.2iu, X.2j1):void");
    }
}
