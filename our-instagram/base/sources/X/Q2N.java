package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ComposeShader;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.facebook.react.modules.i18nmanager.I18nUtil;
import java.util.List;

/* loaded from: classes10.dex */
public final class Q2N extends Drawable {
    public Path A02;
    public Path A03;
    public Path A04;
    public Path A05;
    public PointF A06;
    public PointF A07;
    public PointF A08;
    public PointF A09;
    public RectF A0A;
    public C63191Set A0B;
    public C63191Set A0C;
    public C63191Set A0D;
    public Integer A0F;
    public Path A0I;
    public Path A0J;
    public RectF A0K;
    public RectF A0L;
    public RectF A0M;
    public final Context A0O;
    public final Path A0Q = AbstractC166987dD.A0T();
    public boolean A0H = false;
    public final Paint A0P = new Paint(1);
    public int A01 = 0;
    public List A0G = null;
    public int A00 = 255;
    public C63025Sav A0E = new C63025Sav();
    public C63013Sad A0N = new C63013Sad();

    public final RectF A09() {
        float A07 = A07(0.0f, 8);
        boolean z = true;
        float A072 = A07(A07, 1);
        float A073 = A07(A07, 3);
        float A074 = A07(A07, 0);
        float A075 = A07(A07, 2);
        if (this.A0D != null) {
            if (getLayoutDirection() != 1) {
                z = false;
            }
            float[] fArr = this.A0D.A03;
            float f = fArr[4];
            float f2 = fArr[5];
            if (I18nUtil.A00.A00(this.A0O)) {
                if (!Float.isNaN(f)) {
                    A074 = f;
                }
                if (!Float.isNaN(f2)) {
                    A075 = f2;
                }
                float f3 = A074;
                if (z) {
                    f3 = A075;
                    A075 = A074;
                }
                A074 = f3;
            } else {
                float f4 = f2;
                if (!z) {
                    f4 = f;
                    f = f2;
                }
                if (!Float.isNaN(f4)) {
                    A074 = f4;
                }
                if (!Float.isNaN(f)) {
                    A075 = f;
                }
            }
        }
        return new RectF(A074, A072, A075, A073);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    private Shader A01() {
        List<SBR> list = this.A0G;
        Shader shader = null;
        if (list != null) {
            for (SBR sbr : list) {
                C14360o3.A0B(getBounds(), 0);
                C62617SIz c62617SIz = sbr.A00;
                if (c62617SIz != null) {
                    if (c62617SIz.A04.intValue() == 0) {
                        LinearGradient linearGradient = new LinearGradient(c62617SIz.A02 * r3.width(), c62617SIz.A03 * r3.height(), c62617SIz.A00 * r3.width(), c62617SIz.A01 * r3.height(), c62617SIz.A06, c62617SIz.A05, Shader.TileMode.CLAMP);
                        if (shader == null) {
                            shader = linearGradient;
                        } else {
                            shader = new ComposeShader(linearGradient, shader, PorterDuff.Mode.SRC_OVER);
                        }
                    } else {
                        throw B4Z.A00();
                    }
                }
            }
        }
        return shader;
    }

    private void A02(int i) {
        DashPathEffect dashPathEffect;
        Integer num = this.A0F;
        if (num != null) {
            dashPathEffect = A00(num, i);
        } else {
            dashPathEffect = null;
        }
        this.A0P.setPathEffect(dashPathEffect);
    }

    private void A03(Canvas canvas, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, int i) {
        if (i != 0) {
            if (this.A0I == null) {
                this.A0I = AbstractC166987dD.A0T();
            }
            Paint paint = this.A0P;
            paint.setColor(i);
            this.A0I.reset();
            this.A0I.moveTo(f, f2);
            this.A0I.lineTo(f3, f4);
            this.A0I.lineTo(f5, f6);
            this.A0I.lineTo(f7, f8);
            this.A0I.lineTo(f, f2);
            canvas.drawPath(this.A0I, paint);
        }
    }

    public static void A04(PointF pointF, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8) {
        double d9 = (d + d3) / 2.0d;
        double d10 = (d2 + d4) / 2.0d;
        double d11 = d5 - d9;
        double d12 = d6 - d10;
        double abs = Math.abs(d3 - d) / 2.0d;
        double abs2 = Math.abs(d4 - d2) / 2.0d;
        double d13 = ((d8 - d10) - d12) / ((d7 - d9) - d11);
        double d14 = d12 - (d11 * d13);
        double d15 = abs2 * abs2;
        double d16 = abs * abs;
        double d17 = d15 + (d16 * d13 * d13);
        double d18 = abs * 2.0d * abs * d14 * d13;
        double d19 = (-(d16 * ((d14 * d14) - d15))) / d17;
        double d20 = d17 * 2.0d;
        double sqrt = ((-d18) / d20) - Math.sqrt(d19 + Math.pow(d18 / d20, 2.0d));
        double d21 = (d13 * sqrt) + d14;
        double d22 = sqrt + d9;
        double d23 = d21 + d10;
        if (!Double.isNaN(d22) && !Double.isNaN(d23)) {
            pointF.x = (float) d22;
            pointF.y = (float) d23;
        }
    }

    public static void A05(Q2N q2n) {
        float f;
        float f2;
        if (q2n.A0H) {
            q2n.A0H = false;
            if (q2n.A04 == null) {
                q2n.A04 = AbstractC166987dD.A0T();
            }
            if (q2n.A02 == null) {
                q2n.A02 = AbstractC166987dD.A0T();
            }
            if (q2n.A05 == null) {
                q2n.A05 = AbstractC166987dD.A0T();
            }
            if (q2n.A0J == null) {
                q2n.A0J = AbstractC166987dD.A0T();
            }
            if (q2n.A03 == null) {
                q2n.A03 = AbstractC166987dD.A0T();
            }
            if (q2n.A0K == null) {
                q2n.A0K = AbstractC166987dD.A0X();
            }
            if (q2n.A0A == null) {
                q2n.A0A = AbstractC166987dD.A0X();
            }
            if (q2n.A0L == null) {
                q2n.A0L = AbstractC166987dD.A0X();
            }
            if (q2n.A0M == null) {
                q2n.A0M = AbstractC166987dD.A0X();
            }
            q2n.A04.reset();
            q2n.A02.reset();
            q2n.A05.reset();
            q2n.A0J.reset();
            q2n.A03.reset();
            q2n.A0K.set(q2n.getBounds());
            q2n.A0A.set(q2n.getBounds());
            q2n.A0L.set(q2n.getBounds());
            q2n.A0M.set(q2n.getBounds());
            RectF A09 = q2n.A09();
            int A08 = q2n.A08(0);
            int A082 = q2n.A08(1);
            int A083 = q2n.A08(2);
            int A084 = q2n.A08(3);
            int A085 = q2n.A08(8);
            int A086 = q2n.A08(9);
            int A087 = q2n.A08(11);
            int A088 = q2n.A08(10);
            if (q2n.A06(9)) {
                A082 = A086;
                A084 = A086;
            }
            if (!q2n.A06(10)) {
                A088 = A084;
            }
            if (!q2n.A06(11)) {
                A087 = A082;
            }
            if (Color.alpha(A08) != 0 && Color.alpha(A087) != 0 && Color.alpha(A083) != 0 && Color.alpha(A088) != 0 && Color.alpha(A085) != 0) {
                RectF rectF = q2n.A0K;
                rectF.top += A09.top;
                rectF.bottom -= A09.bottom;
                rectF.left += A09.left;
                rectF.right -= A09.right;
                f = 0.8f;
            } else {
                f = 0.0f;
            }
            RectF rectF2 = q2n.A0M;
            rectF2.top += A09.top * 0.5f;
            rectF2.bottom -= A09.bottom * 0.5f;
            rectF2.left += A09.left * 0.5f;
            rectF2.right -= A09.right * 0.5f;
            C63013Sad A00 = q2n.A0E.A00(q2n.A0O, WF1.A00(q2n.A0A.width()), WF1.A00(q2n.A0A.height()), q2n.getLayoutDirection());
            q2n.A0N = A00;
            C63199Sf2 c63199Sf2 = A00.A02;
            float A01 = WF1.A01(c63199Sf2.A00);
            float A012 = WF1.A01(c63199Sf2.A01);
            C63199Sf2 c63199Sf22 = q2n.A0N.A03;
            float A013 = WF1.A01(c63199Sf22.A00);
            float A014 = WF1.A01(c63199Sf22.A01);
            C63199Sf2 c63199Sf23 = q2n.A0N.A00;
            float A015 = WF1.A01(c63199Sf23.A00);
            float A016 = WF1.A01(c63199Sf23.A01);
            C63199Sf2 c63199Sf24 = q2n.A0N.A01;
            float A017 = WF1.A01(c63199Sf24.A00);
            float A018 = WF1.A01(c63199Sf24.A01);
            float f3 = A09.left;
            float max = Math.max(A01 - f3, 0.0f);
            float f4 = A09.top;
            float max2 = Math.max(A012 - f4, 0.0f);
            float f5 = A09.right;
            float max3 = Math.max(A013 - f5, 0.0f);
            float max4 = Math.max(A014 - f4, 0.0f);
            float max5 = Math.max(A017 - f5, 0.0f);
            float f6 = A09.bottom;
            float max6 = Math.max(A018 - f6, 0.0f);
            float max7 = Math.max(A015 - f3, 0.0f);
            float max8 = Math.max(A016 - f6, 0.0f);
            Path.Direction direction = Path.Direction.CW;
            q2n.A04.addRoundRect(q2n.A0K, new float[]{max, max2, max3, max4, max5, max6, max7, max8}, direction);
            Path path = q2n.A02;
            RectF rectF3 = q2n.A0K;
            path.addRoundRect(rectF3.left - f, rectF3.top - f, rectF3.right + f, rectF3.bottom + f, new float[]{max, max2, max3, max4, max5, max6, max7, max8}, direction);
            q2n.A05.addRoundRect(q2n.A0A, new float[]{A01, A012, A013, A014, A017, A018, A015, A016}, direction);
            C63191Set c63191Set = q2n.A0D;
            if (c63191Set != null) {
                f2 = c63191Set.A00(8) / 2.0f;
            } else {
                f2 = 0.0f;
            }
            q2n.A0J.addRoundRect(q2n.A0L, new float[]{A01 + f2, A012 + f2, A013 + f2, A014 + f2, A017 + f2, A018 + f2, A015 + f2, A016 + f2}, direction);
            Path path2 = q2n.A03;
            RectF rectF4 = q2n.A0M;
            float f7 = A09.left * 0.5f;
            float f8 = A09.top * 0.5f;
            float f9 = A09.right * 0.5f;
            float f10 = A09.bottom * 0.5f;
            path2.addRoundRect(rectF4, new float[]{A01 - f7, A012 - f8, A013 - f9, A014 - f8, A017 - f9, A018 - f10, A015 - f7, A016 - f10}, direction);
            PointF pointF = q2n.A08;
            if (pointF == null) {
                pointF = new PointF();
                q2n.A08 = pointF;
            }
            RectF rectF5 = q2n.A0K;
            float f11 = rectF5.left;
            pointF.x = f11;
            float f12 = rectF5.top;
            pointF.y = f12;
            double d = f11;
            double d2 = f12;
            RectF rectF6 = q2n.A0A;
            A04(pointF, d, d2, f11 + (max * 2.0f), f12 + (max2 * 2.0f), rectF6.left, rectF6.top, d, d2);
            PointF pointF2 = q2n.A06;
            if (pointF2 == null) {
                pointF2 = new PointF();
                q2n.A06 = pointF2;
            }
            RectF rectF7 = q2n.A0K;
            float f13 = rectF7.left;
            pointF2.x = f13;
            float f14 = rectF7.bottom;
            pointF2.y = f14;
            double d3 = f13;
            double d4 = f14;
            RectF rectF8 = q2n.A0A;
            A04(pointF2, d3, f14 - (max8 * 2.0f), f13 + (max7 * 2.0f), d4, rectF8.left, rectF8.bottom, d3, d4);
            PointF pointF3 = q2n.A09;
            if (pointF3 == null) {
                pointF3 = new PointF();
                q2n.A09 = pointF3;
            }
            RectF rectF9 = q2n.A0K;
            float f15 = rectF9.right;
            pointF3.x = f15;
            float f16 = rectF9.top;
            pointF3.y = f16;
            double d5 = f16;
            double d6 = f15;
            double d7 = f16 + (max4 * 2.0f);
            RectF rectF10 = q2n.A0A;
            A04(pointF3, f15 - (max3 * 2.0f), d5, d6, d7, rectF10.right, rectF10.top, d6, d5);
            PointF pointF4 = q2n.A07;
            if (pointF4 == null) {
                pointF4 = new PointF();
                q2n.A07 = pointF4;
            }
            RectF rectF11 = q2n.A0K;
            float f17 = rectF11.right;
            pointF4.x = f17;
            float f18 = rectF11.bottom;
            pointF4.y = f18;
            double d8 = f18 - (2.0f * max6);
            double d9 = f17;
            double d10 = f18;
            RectF rectF12 = q2n.A0A;
            A04(pointF4, f17 - (max5 * 2.0f), d8, d9, d10, rectF12.right, rectF12.bottom, d9, d10);
        }
    }

    private boolean A06(int i) {
        float f;
        C63191Set c63191Set = this.A0C;
        float f2 = Float.NaN;
        if (c63191Set != null) {
            f = c63191Set.A00(i);
        } else {
            f = Float.NaN;
        }
        C63191Set c63191Set2 = this.A0B;
        if (c63191Set2 != null) {
            f2 = c63191Set2.A00(i);
        }
        if (!Float.isNaN(f) && !Float.isNaN(f2)) {
            return true;
        }
        return false;
    }

    public final float A07(float f, int i) {
        C63191Set c63191Set = this.A0D;
        if (c63191Set != null) {
            float f2 = c63191Set.A03[i];
            if (!Float.isNaN(f2) && Float.valueOf(f2) != null) {
                return f2;
            }
        }
        return f;
    }

    public final int A08(int i) {
        float f;
        float f2;
        C63191Set c63191Set = this.A0C;
        if (c63191Set != null) {
            f = c63191Set.A00(i);
        } else {
            f = 0.0f;
        }
        C63191Set c63191Set2 = this.A0B;
        if (c63191Set2 != null) {
            f2 = c63191Set2.A00(i);
        } else {
            f2 = 255.0f;
        }
        return ((((int) f2) << 24) & (-16777216)) | (((int) f) & 16777215);
    }

    /* JADX WARN: Code restructure failed: missing block: B:142:0x0363, code lost:
    
        if (java.lang.Float.isNaN(r2) != false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
    
        if (java.lang.Float.isNaN(r1) != false) goto L8;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r34) {
        /*
            Method dump skipped, instructions count: 1259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q2N.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.A00;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return (Color.alpha(this.A01) * this.A00) >> 8;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        if (this.A0E.A02()) {
            A05(this);
            Path path = this.A0J;
            path.getClass();
            outline.setConvexPath(path);
            return;
        }
        outline.setRect(getBounds());
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (i != this.A00) {
            this.A00 = i;
            invalidateSelf();
        }
    }

    public Q2N(Context context) {
        this.A0O = context;
    }

    public static DashPathEffect A00(Integer num, float f) {
        float[] fArr;
        int intValue = num.intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                return null;
            }
            fArr = new float[4];
        } else {
            fArr = new float[4];
            f *= 3.0f;
        }
        fArr[0] = f;
        fArr[1] = f;
        fArr[2] = f;
        fArr[3] = f;
        return new DashPathEffect(fArr, 0.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.A0H = true;
    }
}
