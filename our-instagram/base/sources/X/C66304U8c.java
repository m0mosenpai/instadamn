package X;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.PathMotion;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;

/* renamed from: X.U8c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66304U8c extends Drawable {
    public float A00;
    public float A01;
    public float A02;
    public RectF A03;
    public C69085Vhb A04;
    public C69337Vlj A05;
    public final Paint A06;
    public final Paint A07;
    public final View A08;
    public final View A09;
    public final C65O A0A;
    public final C69279Vkn A0B;
    public final float A0C;
    public final float A0D;
    public final float A0E;
    public final float A0F;
    public final float A0G;
    public final Paint A0H;
    public final Paint A0I;
    public final Paint A0J;
    public final Paint A0K;
    public final Path A0L;
    public final PathMeasure A0M;
    public final RectF A0N;
    public final RectF A0O;
    public final RectF A0P;
    public final RectF A0Q;
    public final RectF A0R;
    public final RectF A0S;
    public final C65Q A0T;
    public final C65Q A0U;
    public final X89 A0V;
    public final XDD A0W;
    public final C69210Vjd A0X;
    public final boolean A0Y;
    public final boolean A0Z;
    public final boolean A0a;
    public final float[] A0b;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    private void A00(Canvas canvas) {
        A02(canvas, this.A0I);
        Rect bounds = getBounds();
        RectF rectF = this.A0N;
        float f = rectF.left;
        float f2 = rectF.top;
        float f3 = this.A05.A04;
        int i = this.A04.A00;
        RectF rectF2 = WGK.A00;
        if (i > 0) {
            int save = canvas.save();
            canvas.translate(f, f2);
            canvas.scale(f3, f3);
            if (i < 255) {
                RectF rectF3 = WGK.A00;
                rectF3.set(bounds);
                canvas.saveLayerAlpha(rectF3, i);
            }
            this.A08.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    private void A01(Canvas canvas) {
        A02(canvas, this.A0K);
        Rect bounds = getBounds();
        RectF rectF = this.A0P;
        float f = rectF.left;
        float f2 = rectF.top;
        float f3 = this.A05.A05;
        int i = this.A04.A01;
        RectF rectF2 = WGK.A00;
        if (i > 0) {
            int save = canvas.save();
            canvas.translate(f, f2);
            canvas.scale(f3, f3);
            if (i < 255) {
                RectF rectF3 = WGK.A00;
                rectF3.set(bounds);
                canvas.saveLayerAlpha(rectF3, i);
            }
            this.A09.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x01fc, code lost:
    
        if (r1.A00.Art(r13) != 0.0f) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A03(X.C66304U8c r25, float r26) {
        /*
            Method dump skipped, instructions count: 644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66304U8c.A03(X.U8c, float):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        Paint paint = this.A0J;
        if (paint.getAlpha() > 0) {
            canvas.drawRect(getBounds(), paint);
        }
        boolean z = this.A0Y;
        if (z) {
            i = canvas.save();
        } else {
            i = -1;
        }
        if (this.A0Z && this.A00 > 0.0f) {
            canvas.save();
            C69279Vkn c69279Vkn = this.A0B;
            Path path = c69279Vkn.A02;
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            if (Build.VERSION.SDK_INT > 28) {
                C65Q c65q = c69279Vkn.A00;
                if (c65q.A03(this.A03)) {
                    float Art = c65q.A02.Art(this.A03);
                    canvas.drawRoundRect(this.A03, Art, Art, this.A07);
                } else {
                    canvas.drawPath(path, this.A07);
                }
            } else {
                C65O c65o = this.A0A;
                RectF rectF = this.A03;
                c65o.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                c65o.A0A(this.A00);
                c65o.A0D((int) this.A01);
                c65o.setShapeAppearanceModel(c69279Vkn.A00);
                c65o.draw(canvas);
            }
            canvas.restore();
        }
        canvas.clipPath(this.A0B.A02);
        A02(canvas, this.A0H);
        if (this.A04.A02) {
            A01(canvas);
            A00(canvas);
        } else {
            A00(canvas);
            A01(canvas);
        }
        if (z) {
            canvas.restoreToCount(i);
            RectF rectF2 = this.A0P;
            Path path2 = this.A0L;
            PointF pointF = new PointF(rectF2.centerX(), rectF2.top);
            if (this.A02 == 0.0f) {
                path2.reset();
                path2.moveTo(pointF.x, pointF.y);
            } else {
                path2.lineTo(pointF.x, pointF.y);
                Paint paint2 = this.A06;
                paint2.setColor(-65281);
                canvas.drawPath(path2, paint2);
            }
            RectF rectF3 = this.A0Q;
            Paint paint3 = this.A06;
            paint3.setColor(-256);
            canvas.drawRect(rectF3, paint3);
            paint3.setColor(-16711936);
            canvas.drawRect(rectF2, paint3);
            RectF rectF4 = this.A0O;
            paint3.setColor(-16711681);
            canvas.drawRect(rectF4, paint3);
            RectF rectF5 = this.A0N;
            paint3.setColor(-16776961);
            canvas.drawRect(rectF5, paint3);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        throw new UnsupportedOperationException("Setting alpha on is not supported");
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        throw new UnsupportedOperationException("Setting a color filter is not supported");
    }

    public C66304U8c(RectF rectF, RectF rectF2, PathMotion pathMotion, View view, View view2, C65Q c65q, C65Q c65q2, X89 x89, XDD xdd, C69210Vjd c69210Vjd, float f, float f2, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3) {
        Paint paint = new Paint();
        this.A0H = paint;
        Paint paint2 = new Paint();
        this.A0K = paint2;
        Paint paint3 = new Paint();
        this.A0I = paint3;
        this.A07 = new Paint();
        Paint paint4 = new Paint();
        this.A0J = paint4;
        this.A0B = new C69279Vkn();
        this.A0b = r5;
        C65O c65o = new C65O();
        this.A0A = c65o;
        Paint paint5 = new Paint();
        this.A06 = paint5;
        this.A0L = new Path();
        this.A09 = view;
        this.A0S = rectF;
        this.A0U = c65q;
        this.A0G = f;
        this.A08 = view2;
        this.A0R = rectF2;
        this.A0T = c65q2;
        this.A0E = f2;
        this.A0a = z;
        this.A0Z = z2;
        this.A0V = x89;
        this.A0W = xdd;
        this.A0X = c69210Vjd;
        this.A0Y = z3;
        WindowManager windowManager = (WindowManager) view.getContext().getSystemService("window");
        windowManager.getDefaultDisplay().getMetrics(new DisplayMetrics());
        this.A0D = r8.widthPixels;
        this.A0C = r8.heightPixels;
        paint.setColor(i);
        paint2.setColor(i2);
        paint3.setColor(i3);
        c65o.A0F(ColorStateList.valueOf(0));
        c65o.A09();
        c65o.A03 = false;
        c65o.A0C(-7829368);
        RectF rectF3 = new RectF(rectF);
        this.A0P = rectF3;
        this.A0Q = new RectF(rectF3);
        RectF rectF4 = new RectF(rectF3);
        this.A0N = rectF4;
        this.A0O = new RectF(rectF4);
        PointF pointF = new PointF(rectF.centerX(), rectF.top);
        PointF pointF2 = new PointF(rectF2.centerX(), rectF2.top);
        PathMeasure pathMeasure = new PathMeasure(pathMotion.getPath(pointF.x, pointF.y, pointF2.x, pointF2.y), false);
        this.A0M = pathMeasure;
        this.A0F = pathMeasure.getLength();
        float[] fArr = {rectF.centerX(), rectF.top};
        paint4.setStyle(Paint.Style.FILL);
        RectF rectF5 = WGK.A00;
        paint4.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, 0.0f, i4, i4, Shader.TileMode.CLAMP));
        paint5.setStyle(Paint.Style.STROKE);
        paint5.setStrokeWidth(10.0f);
        A03(this, 0.0f);
    }

    private void A02(Canvas canvas, Paint paint) {
        if (paint.getColor() != 0 && paint.getAlpha() > 0) {
            canvas.drawRect(getBounds(), paint);
        }
    }
}
