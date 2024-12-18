package com.instagram.ui.widget.gradientspinner;

import X.AbstractC001800i;
import X.AbstractC55922hc;
import X.AbstractC63123SdR;
import X.AbstractC72903Oq;
import X.AbstractC72913Or;
import X.AbstractC72923Os;
import X.C0f9;
import X.C14360o3;
import X.C3OY;
import X.C3Oa;
import X.C3Oc;
import X.C50L;
import X.C72793Ob;
import X.C73743Sc;
import X.InterfaceC50406MNi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.facebook.R;
import com.instagram.api.schemas.RingSpec;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class GradientSpinner extends View {
    public static final C3OY A0c = new C3OY() { // from class: X.3OX
        @Override // X.C3OY
        public final void AR5(Canvas canvas, Paint paint, Paint paint2, RectF rectF, float f, float f2, float f3, float f4, int i, int i2, boolean z) {
            float f5 = 360.0f / i2;
            float f6 = (1.0f - f4) * f5;
            if (!z) {
                f6 = Math.max(f6, 0.1f);
            }
            float f7 = f3 + (((270.0f + (i * f5)) - (f5 / 2.0f)) - (f6 / 2.0f));
            if (z) {
                float width = ((float) ((rectF.width() / 2.0f) * 6.283185307179586d)) * (f6 / 360.0f);
                if (width < f) {
                    paint.setStrokeWidth(width);
                } else {
                    paint.setStrokeWidth(f);
                }
            }
            canvas.drawArc(rectF, f7, f6, false, paint);
            if (paint2.getAlpha() > 0) {
                canvas.drawArc(rectF, f7, f6, false, paint2);
            }
        }
    };
    public static final C3OY A0d = new C3OY() { // from class: X.3OZ
        @Override // X.C3OY
        public final void AR5(Canvas canvas, Paint paint, Paint paint2, RectF rectF, float f, float f2, float f3, float f4, int i, int i2, boolean z) {
            float A03 = (float) AbstractC70163Da.A03(1.0f - f4, 60.0d, 180.0d);
            float f5 = f3 + (((270.0f + (i * 180.0f)) - (180.0f / 2.0f)) - A03);
            canvas.drawArc(rectF, f5, A03, false, paint);
            if (paint2.getAlpha() > 0) {
                canvas.drawArc(rectF, f5, A03, false, paint2);
            }
        }
    };
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public LinearGradient A09;
    public C3Oa A0A;
    public float[] A0B;
    public float[] A0C;
    public float[] A0D;
    public int[] A0E;
    public C72793Ob[] A0F;
    public float A0G;
    public C3OY A0H;
    public Integer A0I;
    public WeakReference A0J;
    public float[] A0K;
    public float[] A0L;
    public float[] A0M;
    public int[] A0N;
    public final int A0O;
    public final int A0P;
    public final int A0Q;
    public final int A0R;
    public final Matrix A0S;
    public final Paint A0T;
    public final Paint A0U;
    public final Paint A0V;
    public final RectF A0W;
    public final int A0X;
    public final int A0Y;
    public final Paint A0Z;
    public final Picture A0a;
    public final AccelerateDecelerateInterpolator A0b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GradientSpinner(Context context) {
        this(context, null, R.attr.gradientSpinnerStyle);
        C14360o3.A0B(context, 1);
    }

    public static final LinearGradient A00(GradientSpinner gradientSpinner, float[] fArr, float[] fArr2, float[] fArr3, int[] iArr, int i, int i2) {
        if (fArr != null && fArr2 != null && fArr3 != null) {
            int measuredWidth = gradientSpinner.getMeasuredWidth();
            int measuredHeight = gradientSpinner.getMeasuredHeight();
            C14360o3.A0B(iArr, 2);
            float f = measuredWidth;
            float f2 = measuredHeight;
            return new LinearGradient(fArr2[0] * f, fArr2[1] * f2, f * fArr3[0], f2 * fArr3[1], iArr, fArr, Shader.TileMode.CLAMP);
        }
        return C50L.A02(iArr, i, i2);
    }

    public final void A02() {
        setState(0);
    }

    public final void A05() {
        A01(1, 1.0f / this.A0A.A02);
        this.A07 = SystemClock.elapsedRealtime();
        setAnimMode(this.A0P);
    }

    public final void A06() {
        A01(-1, 1.0f / this.A0A.A02);
        this.A07 = SystemClock.elapsedRealtime();
        setAnimMode(this.A0P);
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x0307  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDraw(android.graphics.Canvas r34) {
        /*
            Method dump skipped, instructions count: 827
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.gradientspinner.GradientSpinner.onDraw(android.graphics.Canvas):void");
    }

    public final void setGradientColors(RingSpec ringSpec) {
        C14360o3.A0B(ringSpec, 0);
        if (GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT.equals(ringSpec.getName())) {
            ringSpec = (RingSpec) C3Oc.A0B.getValue();
        }
        this.A0N = AbstractC72903Oq.A00(ringSpec);
        C14360o3.A0B(ringSpec, 0);
        this.A0L = AbstractC001800i.A0w(ringSpec.BOR());
        this.A0M = AbstractC72913Or.A00(ringSpec.Bzg());
        this.A0K = AbstractC72913Or.A00(ringSpec.B1y());
        this.A0I = null;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        LinearGradient A00 = A00(this, this.A0L, this.A0M, this.A0K, this.A0N, measuredWidth, measuredHeight);
        this.A09 = A00;
        this.A0T.setShader(A00);
        invalidate();
    }

    public final void setProgressState(C73743Sc c73743Sc) {
        C14360o3.A0B(c73743Sc, 0);
        this.A0F = c73743Sc.A03;
        this.A07 = SystemClock.elapsedRealtime() - c73743Sc.A02;
        this.A04 = c73743Sc.A00;
        this.A06 = c73743Sc.A01;
        invalidate();
    }

    public final void setSpinnerType(int i) {
        C3OY c3oy;
        if (i != 1) {
            if (i == 2) {
                this.A0A = C3Oa.A06;
                c3oy = A0d;
            }
            this.A0F = new C72793Ob[this.A0A.A02];
            invalidate();
        }
        this.A0A = C3Oa.A05;
        c3oy = A0c;
        this.A0H = c3oy;
        this.A0F = new C72793Ob[this.A0A.A02];
        invalidate();
    }

    private final void A01(int i, float f) {
        int i2 = this.A0A.A02;
        while (true) {
            i2--;
            if (i2 >= 0) {
                float interpolation = this.A0A.A04.getInterpolation(i2 * f);
                C72793Ob[] c72793ObArr = this.A0F;
                float f2 = -interpolation;
                C3Oa c3Oa = this.A0A;
                c72793ObArr[i2] = new C72793Ob(c3Oa.A04, this.A0H, f2, i2, i, c3Oa.A02);
            } else {
                return;
            }
        }
    }

    private final Paint getCurrentPaint() {
        boolean z;
        Paint paint;
        float f;
        int i = this.A06;
        if (i == this.A0R) {
            z = true;
            paint = this.A0U;
        } else {
            z = false;
            if (i == this.A0Q) {
                paint = this.A0Z;
            } else {
                paint = this.A0T;
            }
        }
        if (this.A04 == 0 && z) {
            f = this.A02;
        } else {
            f = this.A00;
        }
        paint.setStrokeWidth(f);
        return paint;
    }

    private final int getCurrentPaintAlpha() {
        int i = this.A05;
        if (i == -1) {
            if (this.A08 != -1) {
                return Math.round((1.0f - getGradientTransitionProgress()) * 255.0f);
            }
            return 255;
        }
        return i;
    }

    private final int getGradientColorRes() {
        Integer num = this.A0I;
        if (num != null) {
            return num.intValue();
        }
        return R.style.GradientPatternStyle;
    }

    private final float getGradientTransitionProgress() {
        long j = this.A08;
        boolean z = false;
        if (j != -1) {
            z = true;
        }
        if (!z) {
            return 0.0f;
        }
        return this.A0b.getInterpolation(Math.max(Math.min(((float) (SystemClock.elapsedRealtime() - j)) / 500.0f, 1.0f), 0.0f));
    }

    private final int getNextPaintAlpha() {
        if (this.A08 != -1) {
            return Math.round(getGradientTransitionProgress() * 255.0f);
        }
        return 0;
    }

    private final void setAnimMode(int i) {
        if (this.A04 != i) {
            this.A04 = i;
            invalidate();
        }
    }

    private final void setState(int i) {
        if (this.A06 != i) {
            this.A06 = i;
            invalidate();
        }
    }

    public final void A03() {
        setState(this.A0Q);
    }

    public final void A04() {
        setState(this.A0R);
    }

    public final void A07() {
        A01(-1, 0.5f / this.A0A.A02);
        this.A07 = SystemClock.elapsedRealtime();
        setAnimMode(this.A0O);
    }

    public final void A08() {
        int i;
        int i2 = this.A04;
        if (i2 != 0 && i2 != (i = this.A0Y)) {
            this.A07 = SystemClock.elapsedRealtime();
            setAnimMode(i);
        }
    }

    public final float getActiveStrokeWidth() {
        return this.A00;
    }

    public final float getInactiveStrokeWidth() {
        return this.A02;
    }

    public final C73743Sc getProgressState() {
        return new C73743Sc(this.A0F, this.A04, this.A06, this.A07);
    }

    public final void setActiveStrokeWidth(float f) {
        this.A00 = f;
        invalidate();
    }

    public final void setErrorColour(int i) {
        this.A0Z.setShader(AbstractC72923Os.A00(i));
        if (this.A06 == this.A0Q) {
            invalidate();
        }
    }

    public final void setInactiveColour(int i) {
        this.A0U.setShader(AbstractC72923Os.A00(i));
        if (this.A06 == this.A0R) {
            invalidate();
        }
    }

    public final void setInactiveStrokeWidth(float f) {
        this.A02 = f;
        invalidate();
    }

    public final void setInvalidateListener(InterfaceC50406MNi interfaceC50406MNi) {
        WeakReference weakReference;
        if (interfaceC50406MNi == null) {
            weakReference = null;
        } else {
            weakReference = new WeakReference(interfaceC50406MNi);
        }
        this.A0J = weakReference;
    }

    public final void setProgress(float f) {
        this.A0G = f;
        invalidate();
    }

    public final void A09(float f) {
        setProgress(f);
        A01(-1, 0.5f / this.A0A.A02);
        this.A07 = SystemClock.elapsedRealtime();
        setAnimMode(this.A0X);
        this.A0G = f;
    }

    @Override // android.view.View
    public final void invalidate() {
        Object obj;
        int A03 = C0f9.A03(-1684837458);
        super.invalidate();
        WeakReference weakReference = this.A0J;
        if (weakReference != null && (obj = (InterfaceC50406MNi) weakReference.get()) != null) {
            ((Drawable) obj).invalidateSelf();
        }
        C0f9.A0A(82444027, A03);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i);
        if ((mode != Integer.MIN_VALUE && mode != 1073741824) || size >= size2) {
            size = size2;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
        LinearGradient A00 = A00(this, this.A0L, this.A0M, this.A0K, this.A0N, getMeasuredWidth(), getMeasuredHeight());
        this.A09 = A00;
        this.A0T.setShader(A00);
        float max = Math.max(this.A00, this.A02) / 2.0f;
        this.A0W.set(getPaddingLeft() + max, getPaddingTop() + max, (r11 - getPaddingRight()) - max, (r12 - getPaddingBottom()) - max);
    }

    @Override // android.view.View
    public final void postInvalidateOnAnimation() {
        Object obj;
        super.postInvalidateOnAnimation();
        WeakReference weakReference = this.A0J;
        if (weakReference != null && (obj = (InterfaceC50406MNi) weakReference.get()) != null) {
            ((Drawable) obj).invalidateSelf();
        }
    }

    public final void setOverrideDrawingAlpha(int i) {
        this.A05 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GradientSpinner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A0P = 1;
        this.A0Y = 2;
        this.A0O = 3;
        this.A0X = 4;
        this.A0R = 1;
        this.A0Q = 2;
        this.A0a = new Picture();
        this.A0S = new Matrix();
        this.A0E = new int[5];
        this.A0b = new AccelerateDecelerateInterpolator();
        this.A0A = C3Oa.A05;
        this.A0H = A0c;
        this.A0F = new C72793Ob[30];
        this.A04 = 0;
        this.A06 = 0;
        this.A08 = -1L;
        this.A05 = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC55922hc.A0v, i, R.style.GradientSpinnerStyle_Default);
        C14360o3.A07(obtainStyledAttributes);
        try {
            this.A00 = obtainStyledAttributes.getDimension(0, 4.0f);
            this.A02 = obtainStyledAttributes.getDimension(4, 4.0f);
            this.A0I = Integer.valueOf(obtainStyledAttributes.getResourceId(2, R.style.GradientPatternStyle));
            int color = obtainStyledAttributes.getColor(3, -16777216);
            int color2 = obtainStyledAttributes.getColor(1, -65536);
            obtainStyledAttributes.recycle();
            Integer num = this.A0I;
            if (num != null) {
                if (num.intValue() == R.style.GradientPatternStyle) {
                    RingSpec ringSpec = (RingSpec) C3Oc.A0B.getValue();
                    this.A0N = AbstractC72903Oq.A00(ringSpec);
                    C14360o3.A0B(ringSpec, 0);
                    this.A0L = AbstractC001800i.A0w(ringSpec.BOR());
                    this.A0M = AbstractC72913Or.A00(ringSpec.Bzg());
                    this.A0K = AbstractC72913Or.A00(ringSpec.B1y());
                    this.A0I = null;
                } else {
                    this.A0N = new int[5];
                    Context context2 = getContext();
                    C14360o3.A07(context2);
                    C50L.A03(context2, attributeSet, this.A0N, getGradientColorRes());
                }
                Paint paint = new Paint(1);
                this.A0T = paint;
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(this.A00);
                paint.setStrokeCap(Paint.Cap.ROUND);
                Paint paint2 = new Paint(paint);
                this.A0U = paint2;
                setInactiveColour(color);
                paint2.setStrokeWidth(this.A02);
                Paint paint3 = new Paint(paint2);
                this.A0Z = paint3;
                paint3.setShader(AbstractC72923Os.A00(color2));
                this.A0V = new Paint(paint);
                this.A0W = new RectF();
                return;
            }
            throw new IllegalStateException("Required value was null.");
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void setGradientColors(int i) {
        if (i == R.style.GradientPatternStyle) {
            setGradientColors((RingSpec) C3Oc.A0B.getValue());
            return;
        }
        Integer num = this.A0I;
        if (num != null && num.intValue() == i) {
            return;
        }
        this.A0I = Integer.valueOf(i);
        this.A0N = new int[5];
        Context context = getContext();
        C14360o3.A07(context);
        C50L.A03(context, null, this.A0N, getGradientColorRes());
        this.A0L = null;
        this.A0M = null;
        this.A0K = null;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        LinearGradient A00 = A00(this, this.A0L, this.A0M, this.A0K, this.A0N, measuredWidth, measuredHeight);
        this.A09 = A00;
        this.A0T.setShader(A00);
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GradientSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.gradientSpinnerStyle);
        C14360o3.A0B(context, 1);
    }

    public /* synthetic */ GradientSpinner(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R.attr.gradientSpinnerStyle : i);
    }
}
