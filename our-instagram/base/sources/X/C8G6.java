package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.animation.PathInterpolator;
import com.facebook.R;

/* renamed from: X.8G6, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8G6 extends Drawable {
    public static final C8G7 A0V = new Object();
    public C8G5 A00;
    public float A01;
    public ValueAnimator A02;
    public Shader A03;
    public Shader A04;
    public Shader A05;
    public final int A06;
    public final int A07;
    public final C8G8 A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final Context A0E;
    public final Paint A0G;
    public final Paint A0H;
    public final Paint A0I;
    public final Paint A0J;
    public final Paint A0K;
    public final Paint A0L;
    public final Drawable A0N;
    public final Drawable A0O;
    public final float[] A0R;
    public final int[] A0S;
    public final int[] A0T;
    public final int[] A0U;
    public final RectF A0M = new RectF();
    public final Matrix A0F = new Matrix();
    public final float[] A0Q = {0.0f, 0.9f};
    public final float[] A0P = {0.0f, 0.2f, 0.6f};

    public final void A00(float f) {
        this.A01 = AbstractC13600mm.A00(f, 0.0f, 1.0f);
        invalidateSelf();
    }

    public final void A01(C8G5 c8g5) {
        C14360o3.A0B(c8g5, 0);
        if (this.A00 != c8g5) {
            this.A00 = c8g5;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable;
        Matrix matrix;
        Object obj;
        Shader shader;
        C14360o3.A0B(canvas, 0);
        RectF rectF = this.A0M;
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        int ordinal = this.A00.ordinal();
        if (ordinal != 0) {
            if (ordinal != 3) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        Matrix matrix2 = this.A0F;
                        float f = this.A01 * 4.0f;
                        float f2 = 1.0f - 0.0f;
                        float f3 = 360.0f - 0.0f;
                        float f4 = 0.0f;
                        if (f2 != 0.0f) {
                            f4 = (f - 0.0f) / f2;
                        }
                        matrix2.setRotate((f4 * f3) + 0.0f, centerX, centerY);
                        Shader shader2 = this.A05;
                        if (shader2 != null) {
                            shader2.setLocalMatrix(matrix2);
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    } else {
                        throw new RuntimeException();
                    }
                } else {
                    matrix = this.A0F;
                    float currentTimeMillis = (float) (System.currentTimeMillis() % 1000);
                    float f5 = 1000.0f - 0.0f;
                    float f6 = 360.0f - 0.0f;
                    float f7 = 0.0f;
                    if (f5 != 0.0f) {
                        f7 = (currentTimeMillis - 0.0f) / f5;
                    }
                    matrix.setRotate((f7 * f6) + 0.0f, centerX, centerY);
                    shader = this.A04;
                    if (shader == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
            } else {
                ValueAnimator valueAnimator = this.A02;
                if (valueAnimator == null) {
                    valueAnimator = ValueAnimator.ofFloat(0.0f, 1080.0f);
                    valueAnimator.setDuration(2500L);
                    valueAnimator.setInterpolator(new PathInterpolator(0.0f, 0.9f, 1.0f, 0.25f));
                    valueAnimator.addListener(new AnimatorListenerAdapter() { // from class: X.9RR
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationEnd(Animator animator) {
                            BDK bdk;
                            C8G6 c8g6 = C8G6.this;
                            c8g6.A00 = C8G5.A05;
                            C8G8 c8g8 = c8g6.A08;
                            if (c8g8 != null && (bdk = c8g8.A00.A08) != null) {
                                bdk.DYs();
                            }
                        }
                    });
                    valueAnimator.start();
                    this.A02 = valueAnimator;
                }
                matrix = this.A0F;
                if (valueAnimator != null) {
                    obj = valueAnimator.getAnimatedValue();
                } else {
                    obj = null;
                }
                C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.Float");
                matrix.setRotate(((Number) obj).floatValue() % 360.0f, centerX, centerY);
                shader = this.A03;
                if (shader == null) {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            shader.setLocalMatrix(matrix);
        }
        float f8 = (this.A06 / 2.0f) - (this.A07 / 2.0f);
        canvas.drawCircle(centerX, centerY, f8, this.A0H);
        int ordinal2 = this.A00.ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 != 3) {
                if (ordinal2 != 1) {
                    if (ordinal2 == 2) {
                        canvas.drawCircle(centerX, centerY, f8, this.A0L);
                        canvas.drawArc(rectF, -90.0f, 360.0f * this.A01, false, this.A0K);
                        drawable = this.A0O;
                        if (drawable == null) {
                            return;
                        }
                    } else {
                        throw new RuntimeException();
                    }
                } else {
                    canvas.drawCircle(centerX, centerY, f8, this.A0I);
                    Drawable drawable2 = this.A0O;
                    if (drawable2 != null) {
                        drawable2.draw(canvas);
                    }
                }
            } else {
                canvas.drawCircle(centerX, centerY, f8, this.A0G);
            }
            invalidateSelf();
            return;
        }
        canvas.drawCircle(centerX, centerY, f8, this.A0J);
        drawable = this.A0N;
        drawable.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C14360o3.A0B(rect, 0);
        super.onBoundsChange(rect);
        float f = (this.A06 / 2.0f) - (this.A07 / 2.0f);
        RectF rectF = this.A0M;
        rectF.set(rect.exactCenterX() - f, rect.exactCenterY() - f, rect.exactCenterX() + f, rect.exactCenterY() + f);
        C8G7.A00(rect, this.A0N, this.A0C);
        Drawable drawable = this.A0O;
        if (drawable != null) {
            C8G7.A00(rect, drawable, this.A0D);
        }
        float centerX = rectF.centerX();
        float f2 = rectF.bottom;
        float centerX2 = rectF.centerX();
        float f3 = rectF.top;
        int[] iArr = this.A0T;
        float[] fArr = this.A0Q;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(centerX, f2, centerX2, f3, iArr, fArr, tileMode);
        this.A04 = linearGradient;
        this.A0I.setShader(linearGradient);
        LinearGradient linearGradient2 = new LinearGradient(rectF.centerX(), rectF.bottom, rectF.centerX(), rectF.top, this.A0S, this.A0P, tileMode);
        this.A03 = linearGradient2;
        this.A0G.setShader(linearGradient2);
        LinearGradient linearGradient3 = new LinearGradient(rectF.centerX(), rectF.bottom, rectF.centerX(), rectF.top, this.A0U, this.A0R, tileMode);
        this.A05 = linearGradient3;
        linearGradient3.getLocalMatrix(this.A0F);
        this.A0K.setShader(this.A05);
    }

    public final void A02(boolean z) {
        int i;
        Drawable mutate;
        if (z) {
            i = this.A0B;
        } else {
            i = this.A0A;
        }
        Drawable mutate2 = this.A0N.mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        mutate2.setColorFilter(i, mode);
        Drawable drawable = this.A0O;
        if (drawable != null && (mutate = drawable.mutate()) != null) {
            mutate.setColorFilter(i, mode);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A09;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A09;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable mutate;
        this.A0J.setAlpha(i);
        this.A0L.setAlpha(i);
        this.A0I.setAlpha(i);
        this.A0G.setAlpha(i);
        this.A0K.setAlpha(i);
        this.A0N.mutate().setAlpha(i);
        Drawable drawable = this.A0O;
        if (drawable != null && (mutate = drawable.mutate()) != null) {
            mutate.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable mutate;
        if (colorFilter != null) {
            this.A0J.setColorFilter(colorFilter);
            this.A0L.setColorFilter(colorFilter);
            this.A0I.setColorFilter(colorFilter);
            this.A0G.setColorFilter(colorFilter);
            this.A0K.setColorFilter(colorFilter);
            this.A0N.mutate().setColorFilter(colorFilter);
            Drawable drawable = this.A0O;
            if (drawable != null && (mutate = drawable.mutate()) != null) {
                mutate.setColorFilter(colorFilter);
            }
        }
    }

    public C8G6(Context context, Paint paint, Drawable drawable, Drawable drawable2, C8G8 c8g8, C8G5 c8g5, Integer num, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        this.A0E = context;
        this.A0H = paint;
        this.A09 = i;
        this.A06 = i2;
        this.A07 = i3;
        this.A0N = drawable;
        this.A0O = drawable2;
        this.A0C = i7;
        this.A0D = i8;
        this.A0B = i9;
        this.A0A = i10;
        this.A00 = c8g5;
        this.A08 = c8g8;
        drawable.setBounds(0, 0, i7, i7);
        Drawable mutate = drawable.mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        mutate.setColorFilter(i9, mode);
        if (drawable2 != null) {
            drawable2.setBounds(0, 0, i8, i8);
            Drawable mutate2 = drawable2.mutate();
            if (mutate2 != null) {
                mutate2.setColorFilter(i9, mode);
            }
        }
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(i3);
        if (i4 > 0) {
            paint2.setShadowLayer(i4, 0.0f, 0.0f, context.getColor(AbstractC53242c7.A0H(context, R.attr.musicCreationIconShadowColor)));
        }
        this.A0I = paint2;
        this.A0G = new Paint(paint2);
        Paint paint3 = new Paint(paint2);
        paint3.setColor(i5);
        this.A0J = paint3;
        Paint paint4 = new Paint(paint2);
        paint4.setColor(i6);
        this.A0L = paint4;
        Paint paint5 = new Paint(paint2);
        paint5.setStrokeCap(Paint.Cap.ROUND);
        this.A0K = paint5;
        this.A0T = new int[]{i9, 0};
        if (num != null) {
            int intValue = num.intValue();
            this.A0U = new int[]{intValue, intValue};
            this.A0R = new float[]{1.0f, 1.0f};
        } else {
            int[] iArr = new int[5];
            this.A0U = iArr;
            this.A0R = new float[]{0.0f, 0.27f, 0.51f, 0.75f, 1.0f};
            C50L.A03(context, null, iArr, R.style.GradientPatternStyle);
        }
        this.A0S = new int[]{context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_gradient_pink)), context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_gradient_purple)), 0};
    }
}
