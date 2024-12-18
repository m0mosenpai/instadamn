package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* renamed from: X.Jit, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44354Jit extends Drawable {
    public static final int[] A0J;
    public static final int[] A0K;
    public float A00;
    public LinearGradient A01;
    public LinearGradient A02;
    public RadialGradient A03;
    public final Context A04;
    public final Drawable A07;
    public final float A08;
    public final float A09;
    public final boolean A0C;
    public static final PorterDuffXfermode A0G = new PorterDuffXfermode(PorterDuff.Mode.SRC_IN);
    public static final PorterDuffXfermode A0F = new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP);
    public static final PorterDuffXfermode A0E = new PorterDuffXfermode(PorterDuff.Mode.DST_OVER);
    public static final PorterDuffXfermode A0D = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
    public static final int A0I = Color.argb(255, C8S8.DEFAULT_SWIPE_ANIMATION_DURATION, C8S8.DEFAULT_SWIPE_ANIMATION_DURATION, C8S8.DEFAULT_SWIPE_ANIMATION_DURATION);
    public static final int A0H = Color.argb(255, 180, 180, 180);
    public final Paint A05 = AbstractC166987dD.A0S(3);
    public final Path A06 = AbstractC166987dD.A0T();
    public final Path A0A = AbstractC166987dD.A0T();
    public final RectF A0B = AbstractC166987dD.A0X();

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float A02;
        float A00;
        float A022;
        float A023;
        C14360o3.A0B(canvas, 0);
        int A0H2 = AbstractC166997dE.A0H(this);
        int A0G2 = AbstractC166997dE.A0G(this);
        Drawable drawable = this.A07;
        int A0C = AbstractC166987dD.A0C(this.A04, 12);
        float f = A0C;
        int intrinsicWidth = (int) (f / (drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight()));
        float f2 = intrinsicWidth;
        float f3 = 0.33333334f * f2;
        float f4 = f2 / (-2.0f);
        canvas.save();
        int i = 0;
        while (f4 < A0G2) {
            canvas.save();
            canvas.translate(0.0f, f4);
            float f5 = f / (-2.0f);
            int i2 = 0;
            while (f5 < A0H2) {
                canvas.save();
                canvas.translate(f5, 0.0f);
                float f6 = -1.0f;
                if (i2 % 2 == 1) {
                    f6 = 1.0f;
                }
                float f7 = -1.0f;
                if (i % 2 == 1) {
                    f7 = 1.0f;
                }
                canvas.scale(f6, f7, f / 2.0f, f2 / 2.0f);
                drawable.setBounds(0, 0, A0C, intrinsicWidth);
                drawable.draw(canvas);
                canvas.restore();
                f5 += f + f3;
                i2++;
            }
            i++;
            f4 += f2 + f3;
            canvas.restore();
        }
        canvas.restore();
        float A0H3 = AbstractC166997dE.A0H(this);
        float A0G3 = AbstractC166997dE.A0G(this);
        Paint paint = this.A05;
        paint.reset();
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(-1);
        paint.setXfermode(A0G);
        canvas.drawRect(getBounds(), paint);
        LinearGradient linearGradient = this.A01;
        if (linearGradient != null) {
            Matrix A0Q = AbstractC166987dD.A0Q();
            linearGradient.getLocalMatrix(A0Q);
            A0Q.reset();
            float f8 = 1.0f - 0.0f;
            A0Q.setTranslate((AbstractC43592JPx.A00((f8 > 0.0f ? 1 : (f8 == 0.0f ? 0 : -1)), this.A00, 0.0f, f8) * ((4.0f * A0H3) - 0.0f)) + 0.0f, 0.0f);
            linearGradient.setLocalMatrix(A0Q);
        }
        paint.setShader(this.A01);
        float f9 = this.A00;
        if (f9 <= 0.5f) {
            A02 = AbstractC13600mm.A02(f9, 0.1f, 0.5f, 190.0f, 0.0f);
        } else {
            A02 = AbstractC13600mm.A02(f9, 0.5f, 0.9f, 0.0f, 190.0f);
        }
        paint.setAlpha((int) A02);
        paint.setXfermode(A0F);
        canvas.drawRect(getBounds(), paint);
        paint.setXfermode(null);
        RadialGradient radialGradient = this.A03;
        if (radialGradient != null) {
            Matrix A0Q2 = AbstractC166987dD.A0Q();
            radialGradient.getLocalMatrix(A0Q2);
            A0Q2.reset();
            float f10 = this.A00;
            if (f10 < 0.5f) {
                A022 = AbstractC13600mm.A02(f10, 0.0f, 0.5f, 2.0f, 1.0f);
            } else {
                A022 = AbstractC13600mm.A02(f10, 0.5f, 1.0f, 1.0f, 2.0f);
            }
            float f11 = A0H3 / 2.0f;
            A0Q2.postScale(A022, A022, f11, A0G3 / 2.0f);
            float f12 = this.A00;
            if (f12 < 0.5f) {
                A023 = AbstractC13600mm.A02(f12, 0.0f, 0.5f, A0H3 / (-2.0f), 0.0f);
            } else {
                A023 = AbstractC13600mm.A02(f12, 0.5f, 1.0f, 0.0f, f11);
            }
            A0Q2.postTranslate(A023, 0.0f);
            radialGradient.setLocalMatrix(A0Q2);
        }
        paint.setShader(this.A03);
        paint.setAlpha(255);
        canvas.drawRect(getBounds(), paint);
        float A0H4 = AbstractC166997dE.A0H(this);
        float A0G4 = AbstractC166997dE.A0G(this);
        paint.reset();
        paint.setAlpha(255);
        paint.setStyle(style);
        Path path = this.A06;
        path.toggleInverseFillType();
        paint.setColor(-16777216);
        paint.setXfermode(A0D);
        canvas.drawPath(path, paint);
        path.toggleInverseFillType();
        LinearGradient linearGradient2 = this.A02;
        if (linearGradient2 != null) {
            Matrix A0Q3 = AbstractC166987dD.A0Q();
            linearGradient2.getLocalMatrix(A0Q3);
            A0Q3.reset();
            float f13 = this.A00;
            if (f13 <= 0.5f) {
                float f14 = 0.0f - 0.5f;
                A00 = (AbstractC43592JPx.A00((f14 > 0.0f ? 1 : (f14 == 0.0f ? 0 : -1)), f13, 0.5f, f14) * ((-A0H4) - A0H4)) + A0H4;
            } else {
                A0Q3.setScale(-1.0f, 1.0f, A0H4 / 2.0f, A0G4 / 2.0f);
                float f15 = -A0H4;
                float f16 = 1.0f - 0.5f;
                A00 = (AbstractC43592JPx.A00((f16 > 0.0f ? 1 : (f16 == 0.0f ? 0 : -1)), this.A00, 0.5f, f16) * (A0H4 - f15)) + f15;
            }
            A0Q3.postTranslate(A00, 0.0f);
            linearGradient2.setLocalMatrix(A0Q3);
        }
        paint.setShader(this.A02);
        paint.setXfermode(A0E);
        canvas.drawPath(path, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        int[] iArr;
        C14360o3.A0B(rect, 0);
        float f = rect.left;
        float f2 = rect.top;
        float f3 = rect.right;
        float f4 = rect.bottom;
        float width = rect.width();
        float height = rect.height();
        float f5 = height / 2.0f;
        int[] A0x = AbstractC001800i.A0x(AbstractC43594JPz.A11(Integer.valueOf(A0I), A0H));
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.A02 = new LinearGradient(0.0f, f5, width, f5, A0x, (float[]) null, tileMode);
        float f6 = width * 2.0f;
        if (this.A0C) {
            iArr = A0J;
        } else {
            iArr = A0K;
        }
        this.A01 = new LinearGradient(0.0f, 0.0f, f6, height, iArr, (float[]) null, Shader.TileMode.REPEAT);
        float f7 = width / 2.0f;
        this.A03 = new RadialGradient(f7, f5, f7, AbstractC001800i.A0x(AbstractC43594JPz.A11(AbstractC25227BEk.A0o(), 0)), (float[]) null, tileMode);
        RectF rectF = this.A0B;
        rectF.set(f, f2, f3, f4);
        Path path = this.A06;
        float f8 = this.A08;
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, f8, f8, direction);
        Path path2 = this.A0A;
        float f9 = f + f7;
        float f10 = this.A09;
        path2.addCircle(f9, f2, f10, direction);
        path2.addCircle(f9, f4, f10, direction);
        path.op(path2, Path.Op.DIFFERENCE);
        path.close();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    static {
        int argb = Color.argb(255, 255, 223, 53);
        int argb2 = Color.argb(255, 255, 160, 73);
        int argb3 = Color.argb(255, 255, 122, 177);
        int argb4 = Color.argb(255, 245, 133, 255);
        int argb5 = Color.argb(255, 184, 151, 255);
        Integer valueOf = Integer.valueOf(argb);
        Integer valueOf2 = Integer.valueOf(argb2);
        Integer valueOf3 = Integer.valueOf(argb3);
        Integer valueOf4 = Integer.valueOf(argb4);
        Integer valueOf5 = Integer.valueOf(argb5);
        A0K = AbstractC001800i.A0x(AbstractC16960so.A1Q(valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf4, valueOf3, valueOf2, valueOf, valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf4, valueOf3, valueOf2, valueOf));
        int argb6 = Color.argb(255, 116, 159, 255);
        int argb7 = Color.argb(255, 75, 236, 255);
        int argb8 = Color.argb(255, 255, 156, 61);
        int argb9 = Color.argb(255, 246, 255, 110);
        Integer valueOf6 = Integer.valueOf(argb6);
        Integer valueOf7 = Integer.valueOf(argb8);
        Integer valueOf8 = Integer.valueOf(argb9);
        Integer valueOf9 = Integer.valueOf(argb7);
        A0J = AbstractC001800i.A0x(AbstractC16960so.A1Q(valueOf6, valueOf7, valueOf8, valueOf7, valueOf6, valueOf9, valueOf6, valueOf7, valueOf8, valueOf7, valueOf6, valueOf9, valueOf6, valueOf7, valueOf8, valueOf7, valueOf6, valueOf9, valueOf6));
    }

    public C44354Jit(Context context, Drawable drawable, boolean z) {
        this.A04 = context;
        this.A07 = drawable;
        this.A0C = z;
        this.A08 = AbstractC13880nE.A04(context, 12);
        this.A09 = AbstractC13880nE.A04(context, 25);
    }
}
