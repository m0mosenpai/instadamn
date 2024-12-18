package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.facebook.R;
import com.instagram.common.clips.model.LayoutTransform;
import java.util.ArrayList;

/* renamed from: X.OwW, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56164OwW implements BDJ {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public LayoutTransform A05;
    public C51683MsE A06;
    public Float A07;
    public Runnable A08;
    public ArrayList A09;
    public InterfaceC16620sF A0A;
    public InterfaceC16610sE A0B;
    public boolean A0C;
    public boolean A0D;
    public final Paint A0G;
    public final Paint A0H;
    public final C54388O1u A0J;
    public final Rect A0L = AbstractC166987dD.A0U();
    public final RectF A0I = AbstractC166987dD.A0X();
    public final RectF A0M = AbstractC166987dD.A0X();
    public final Matrix A0E = new Matrix();
    public final Matrix A0F = new Matrix();
    public final float[] A0K = new float[2];

    public static final void A02(Bitmap bitmap, Canvas canvas, LayoutTransform layoutTransform, C56164OwW c56164OwW, float f, int i) {
        Rect A0D = AbstractC50522MSa.A0D(bitmap);
        A0D.left += (int) (bitmap.getWidth() * (i / f));
        RectF rectF = c56164OwW.A0I;
        int i2 = A0D.right;
        int i3 = A0D.bottom;
        float f2 = i2;
        float f3 = layoutTransform.A00 * f2;
        float f4 = i3;
        float f5 = layoutTransform.A03 * f4;
        Matrix matrix = c56164OwW.A0F;
        float f6 = layoutTransform.A01;
        matrix.setRotate(f6);
        float[] fArr = c56164OwW.A0K;
        fArr[0] = f3;
        fArr[1] = f5;
        matrix.mapPoints(fArr);
        float f7 = fArr[0];
        float f8 = fArr[1];
        Matrix matrix2 = c56164OwW.A0E;
        matrix2.reset();
        matrix2.preTranslate((-i2) * 0.5f, (-i3) * 0.5f);
        if (layoutTransform.A07) {
            matrix2.postScale(-1.0f, 1.0f);
        }
        matrix2.postRotate(f6);
        float f9 = layoutTransform.A02;
        matrix2.postScale(f9, f9);
        matrix2.postTranslate(f2 * 0.5f, f4 * 0.5f);
        matrix2.postTranslate(f7, f8);
        matrix2.postTranslate(-A0D.left, -A0D.top);
        float max = Math.max(rectF.width() / A0D.width(), rectF.height() / A0D.height());
        matrix2.postScale(max, max);
        canvas.save();
        canvas.clipRect(rectF);
        canvas.drawBitmap(bitmap, matrix2, c56164OwW.A0H);
        canvas.restore();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0050 A[ADDED_TO_REGION, LOOP:0: B:19:0x0050->B:31:0x007a, LOOP_START, PHI: r4
      0x0050: PHI (r4v3 int) = (r4v0 int), (r4v4 int) binds: [B:18:0x004e, B:31:0x007a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A04(android.graphics.Canvas r12, int r13, int r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56164OwW.A04(android.graphics.Canvas, int, int, boolean):void");
    }

    @Override // X.BDJ
    public final void DCI(Canvas canvas, int i, int i2) {
        A04(canvas, i, i2, true);
    }

    @Override // X.BDJ
    public final void FCa(int i, int i2, int i3) {
    }

    @Override // X.BDJ
    public final void reset() {
        this.A06 = null;
    }

    public final int A03(int i) {
        float f;
        C51683MsE c51683MsE = this.A06;
        if (c51683MsE != null) {
            return (c51683MsE.A01 * i) / c51683MsE.A00;
        }
        Float f2 = this.A07;
        if (f2 != null) {
            f = f2.floatValue();
        } else {
            f = 0.0f;
        }
        return (int) (f * i);
    }

    public C56164OwW(Context context, C54388O1u c54388O1u) {
        this.A0J = c54388O1u;
        Paint paint = new Paint(3);
        this.A0H = paint;
        Paint paint2 = new Paint(3);
        this.A0G = paint2;
        this.A04 = 500;
        this.A03 = 500;
        this.A00 = 1.0f;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        AbstractC166987dD.A1N(context, paint, R.color.black);
        paint2.setStyle(style);
        AbstractC166987dD.A1N(context, paint2, R.color.grey_6);
        this.A09 = AbstractC166987dD.A1E();
    }

    private final ArrayList A00(int i, int i2) {
        Bitmap bitmap;
        ArrayList A1E = AbstractC166987dD.A1E();
        C51683MsE c51683MsE = this.A06;
        if (c51683MsE != null) {
            Bitmap[] A01 = c51683MsE.A01();
            while (i < i2) {
                i++;
                int A00 = AbstractC53879NsB.A00(((this.A04 * i) / this.A03) - 1, 0, A01.length - 1);
                while (true) {
                    if (-1 < A00) {
                        bitmap = A01[A00];
                        if (bitmap == null) {
                            A00--;
                        }
                    } else {
                        bitmap = null;
                        break;
                    }
                }
                A1E.add(bitmap);
            }
            return A1E;
        }
        throw AbstractC166997dE.A0g();
    }

    public static final ArrayList A01(C56164OwW c56164OwW, int i, int i2) {
        C17v A0C;
        Object invoke;
        ArrayList A1E = AbstractC166987dD.A1E();
        if (c56164OwW.A00 < 0.0f) {
            A0C = new C17v(i2, i, -1);
        } else {
            A0C = C17s.A0C(i, i2);
        }
        int i3 = A0C.A00;
        int i4 = A0C.A01;
        int i5 = A0C.A02;
        if (i5 <= 0 ? !(i5 >= 0 || i4 > i3) : i3 <= i4) {
            boolean z = true;
            while (true) {
                int abs = (i3 + 1) * ((int) (c56164OwW.A04 * Math.abs(c56164OwW.A00)));
                int i6 = c56164OwW.A03;
                int i7 = (abs / i6) * i6;
                if (i7 == 0) {
                    i7 += i6;
                }
                boolean z2 = c56164OwW.A0D;
                if (z2 && AbstractC25226BEj.A1b(A1E)) {
                    invoke = A1E.get(0);
                } else {
                    if (z2) {
                        i7 = 0;
                    }
                    InterfaceC16610sE interfaceC16610sE = c56164OwW.A0B;
                    if (interfaceC16610sE != null) {
                        invoke = interfaceC16610sE.invoke(Integer.valueOf(i7), Boolean.valueOf(z), new C30192DRx(c56164OwW, 6));
                    } else {
                        InterfaceC16620sF interfaceC16620sF = c56164OwW.A0A;
                        if (interfaceC16620sF != null) {
                            invoke = interfaceC16620sF.invoke(Integer.valueOf(i7), new C30192DRx(c56164OwW, 7));
                        } else {
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                    }
                }
                if (invoke == null && AbstractC25226BEj.A1b(A1E)) {
                    invoke = A1E.get(A1E.size() - 1);
                }
                A1E.add(invoke);
                if (i3 == i4) {
                    break;
                }
                i3 += i5;
                z = false;
            }
        }
        return A1E;
    }
}
