package X;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.material.chip.Chip;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* renamed from: X.Uxm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67771Uxm extends C65O implements Drawable.Callback, XDC {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;
    public float A09;
    public float A0A;
    public float A0B;
    public float A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public ColorStateList A0I;
    public ColorStateList A0J;
    public ColorStateList A0K;
    public ColorStateList A0L;
    public ColorStateList A0M;
    public ColorStateList A0N;
    public ColorStateList A0O;
    public ColorFilter A0P;
    public PorterDuffColorFilter A0Q;
    public Drawable A0R;
    public Drawable A0S;
    public Drawable A0T;
    public Drawable A0U;
    public TextUtils.TruncateAt A0V;
    public WDK A0W;
    public WDK A0X;
    public CharSequence A0Y;
    public CharSequence A0Z;
    public WeakReference A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public int[] A0h;
    public int A0i;
    public int A0j;
    public int A0k;
    public ColorStateList A0l;
    public PorterDuff.Mode A0m;
    public boolean A0n;
    public boolean A0o;
    public final Context A0p;
    public final Paint.FontMetrics A0q;
    public final Paint A0r;
    public final Path A0s;
    public final PointF A0t;
    public final RectF A0u;
    public final C69710Vu5 A0v;
    public static final int[] A0x = {R.attr.state_enabled};
    public static final ShapeDrawable A0w = new ShapeDrawable(new OvalShape());

    public final void A0V(ColorStateList colorStateList) {
        this.A0o = true;
        if (this.A0K != colorStateList) {
            this.A0K = colorStateList;
            if (A04()) {
                this.A0S.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    private void A01(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            drawable.setLayoutDirection(getLayoutDirection());
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            Drawable drawable2 = this.A0T;
            boolean isStateful = drawable.isStateful();
            if (drawable == drawable2) {
                if (isStateful) {
                    drawable.setState(this.A0h);
                }
                drawable.setTintList(this.A0N);
                return;
            }
            if (isStateful) {
                drawable.setState(getState());
            }
            Drawable drawable3 = this.A0S;
            if (drawable != drawable3 || !this.A0o) {
                return;
            }
            drawable3.setTintList(this.A0K);
        }
    }

    private boolean A02() {
        if (this.A0c && this.A0R != null && this.A0e) {
            return true;
        }
        return false;
    }

    private boolean A04() {
        if (this.A0n && this.A0S != null) {
            return true;
        }
        return false;
    }

    public static boolean A05(C67771Uxm c67771Uxm) {
        if (c67771Uxm.A0d && c67771Uxm.A0T != null) {
            return true;
        }
        return false;
    }

    public final void A0L() {
        X81 x81 = (X81) this.A0a.get();
        if (x81 != null) {
            Chip chip = (Chip) x81;
            chip.A06(chip.A00);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    @Deprecated
    public final void A0M(float f) {
        if (this.A00 != f) {
            this.A00 = f;
            C72G c72g = new C72G(super.A00.A0K);
            c72g.A00(f);
            setShapeAppearanceModel(new C65Q(c72g));
        }
    }

    public final void A0N(float f) {
        if (this.A02 != f) {
            float A0J = A0J();
            this.A02 = f;
            float A0J2 = A0J();
            invalidateSelf();
            if (A0J != A0J2) {
                A0L();
            }
        }
    }

    public final void A0O(float f) {
        if (this.A05 != f) {
            this.A05 = f;
            this.A0r.setStrokeWidth(f);
            if (this.A0f) {
                super.A00.A04 = f;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    public final void A0P(float f) {
        if (this.A06 != f) {
            this.A06 = f;
            invalidateSelf();
            if (A05(this)) {
                A0L();
            }
        }
    }

    public final void A0Q(float f) {
        if (this.A07 != f) {
            this.A07 = f;
            invalidateSelf();
            if (A05(this)) {
                A0L();
            }
        }
    }

    public final void A0R(float f) {
        if (this.A08 != f) {
            this.A08 = f;
            invalidateSelf();
            if (A05(this)) {
                A0L();
            }
        }
    }

    public final void A0S(float f) {
        if (this.A09 != f) {
            float A0J = A0J();
            this.A09 = f;
            float A0J2 = A0J();
            invalidateSelf();
            if (A0J != A0J2) {
                A0L();
            }
        }
    }

    public final void A0T(float f) {
        if (this.A0A != f) {
            float A0J = A0J();
            this.A0A = f;
            float A0J2 = A0J();
            invalidateSelf();
            if (A0J != A0J2) {
                A0L();
            }
        }
    }

    public final void A0U(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.A0I != colorStateList) {
            this.A0I = colorStateList;
            if (this.A0c && (drawable = this.A0R) != null && this.A0b) {
                drawable.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void A0W(ColorStateList colorStateList) {
        if (this.A0L != colorStateList) {
            this.A0L = colorStateList;
            if (this.A0f) {
                A0G(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void A0X(ColorStateList colorStateList) {
        if (this.A0N != colorStateList) {
            this.A0N = colorStateList;
            if (A05(this)) {
                this.A0T.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void A0Y(Drawable drawable) {
        if (this.A0R != drawable) {
            float A0J = A0J();
            this.A0R = drawable;
            float A0J2 = A0J();
            Drawable drawable2 = this.A0R;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            A01(this.A0R);
            invalidateSelf();
            if (A0J != A0J2) {
                A0L();
            }
        }
    }

    public final void A0Z(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.A0S;
        if (drawable3 == null) {
            drawable3 = null;
        }
        if (drawable3 != drawable) {
            float A0J = A0J();
            if (drawable != null) {
                drawable2 = drawable.mutate();
            } else {
                drawable2 = null;
            }
            this.A0S = drawable2;
            float A0J2 = A0J();
            if (drawable3 != null) {
                drawable3.setCallback(null);
            }
            if (A04()) {
                A01(this.A0S);
            }
            invalidateSelf();
            if (A0J != A0J2) {
                A0L();
            }
        }
    }

    public final void A0a(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.A0T;
        if (drawable3 == null) {
            drawable3 = null;
        }
        if (drawable3 != drawable) {
            float A0K = A0K();
            if (drawable != null) {
                drawable2 = drawable.mutate();
            } else {
                drawable2 = null;
            }
            this.A0T = drawable2;
            ColorStateList colorStateList = this.A0O;
            if (colorStateList == null) {
                colorStateList = ColorStateList.valueOf(0);
            }
            this.A0U = new RippleDrawable(colorStateList, this.A0T, A0w);
            float A0K2 = A0K();
            if (drawable3 != null) {
                drawable3.setCallback(null);
            }
            if (A05(this)) {
                A01(this.A0T);
            }
            invalidateSelf();
            if (A0K != A0K2) {
                A0L();
            }
        }
    }

    public final void A0b(boolean z) {
        if (this.A0b != z) {
            this.A0b = z;
            float A0J = A0J();
            if (!z && this.A0e) {
                this.A0e = false;
            }
            float A0J2 = A0J();
            invalidateSelf();
            if (A0J != A0J2) {
                A0L();
            }
        }
    }

    public final void A0c(boolean z) {
        if (this.A0c != z) {
            boolean A02 = A02();
            this.A0c = z;
            boolean A022 = A02();
            if (A02 != A022) {
                Drawable drawable = this.A0R;
                if (A022) {
                    A01(drawable);
                } else if (drawable != null) {
                    drawable.setCallback(null);
                }
                invalidateSelf();
                A0L();
            }
        }
    }

    public final void A0d(boolean z) {
        if (this.A0n != z) {
            boolean A04 = A04();
            this.A0n = z;
            boolean A042 = A04();
            if (A04 != A042) {
                Drawable drawable = this.A0S;
                if (A042) {
                    A01(drawable);
                } else if (drawable != null) {
                    drawable.setCallback(null);
                }
                invalidateSelf();
                A0L();
            }
        }
    }

    public final void A0e(boolean z) {
        if (this.A0d != z) {
            boolean A05 = A05(this);
            this.A0d = z;
            boolean A052 = A05(this);
            if (A05 != A052) {
                Drawable drawable = this.A0T;
                if (A052) {
                    A01(drawable);
                } else if (drawable != null) {
                    drawable.setCallback(null);
                }
                invalidateSelf();
                A0L();
            }
        }
    }

    @Override // X.C65O, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && (i = this.A0D) != 0) {
            int i2 = 0;
            if (i < 255) {
                i2 = canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i);
            }
            if (!this.A0f) {
                Paint paint = this.A0r;
                paint.setColor(this.A0G);
                paint.setStyle(Paint.Style.FILL);
                RectF rectF = this.A0u;
                rectF.set(bounds);
                if (this.A0f) {
                    f4 = A07();
                } else {
                    f4 = this.A00;
                }
                if (this.A0f) {
                    f5 = A07();
                } else {
                    f5 = this.A00;
                }
                canvas.drawRoundRect(rectF, f4, f5, paint);
            }
            if (!this.A0f) {
                Paint paint2 = this.A0r;
                paint2.setColor(this.A0E);
                paint2.setStyle(Paint.Style.FILL);
                ColorFilter colorFilter = this.A0P;
                if (colorFilter == null) {
                    colorFilter = this.A0Q;
                }
                paint2.setColorFilter(colorFilter);
                RectF rectF2 = this.A0u;
                rectF2.set(bounds);
                if (this.A0f) {
                    f2 = A07();
                } else {
                    f2 = this.A00;
                }
                if (this.A0f) {
                    f3 = A07();
                } else {
                    f3 = this.A00;
                }
                canvas.drawRoundRect(rectF2, f2, f3, paint2);
            }
            if (this.A0f) {
                super.draw(canvas);
            }
            if (this.A05 > 0.0f && !this.A0f) {
                Paint paint3 = this.A0r;
                paint3.setColor(this.A0F);
                paint3.setStyle(Paint.Style.STROKE);
                if (!this.A0f) {
                    ColorFilter colorFilter2 = this.A0P;
                    if (colorFilter2 == null) {
                        colorFilter2 = this.A0Q;
                    }
                    paint3.setColorFilter(colorFilter2);
                }
                RectF rectF3 = this.A0u;
                float f6 = bounds.left;
                float f7 = this.A05 / 2.0f;
                rectF3.set(f6 + f7, bounds.top + f7, bounds.right - f7, bounds.bottom - f7);
                float f8 = this.A00 - (this.A05 / 2.0f);
                canvas.drawRoundRect(rectF3, f8, f8, paint3);
            }
            Paint paint4 = this.A0r;
            paint4.setColor(0);
            paint4.setStyle(Paint.Style.FILL);
            RectF rectF4 = this.A0u;
            rectF4.set(bounds);
            if (!this.A0f) {
                float f9 = this.A00;
                canvas.drawRoundRect(rectF4, f9, f9, paint4);
            } else {
                RectF rectF5 = new RectF(bounds);
                Path path = this.A0s;
                C65Z c65z = super.A0E;
                C65W c65w = super.A00;
                c65z.A01(path, rectF5, c65w.A0K, super.A0D, c65w.A01);
                RectF rectF6 = super.A0C;
                AbstractC65702TsY.A0x(rectF6, this);
                C65Q c65q = super.A00.A0K;
                if (c65q.A03(rectF6)) {
                    float Art = c65q.A03.Art(rectF6) * super.A00.A01;
                    canvas.drawRoundRect(rectF6, Art, Art, paint4);
                } else {
                    canvas.drawPath(path, paint4);
                }
            }
            if (A04()) {
                A00(bounds, rectF4);
                float f10 = rectF4.left;
                float f11 = rectF4.top;
                canvas.translate(f10, f11);
                this.A0S.setBounds(0, 0, (int) rectF4.width(), (int) rectF4.height());
                this.A0S.draw(canvas);
                canvas.translate(-f10, -f11);
            }
            if (A02()) {
                A00(bounds, rectF4);
                float f12 = rectF4.left;
                float f13 = rectF4.top;
                canvas.translate(f12, f13);
                this.A0R.setBounds(0, 0, (int) rectF4.width(), (int) rectF4.height());
                this.A0R.draw(canvas);
                canvas.translate(-f12, -f13);
            }
            if (this.A0g && this.A0Z != null) {
                PointF pointF = this.A0t;
                pointF.set(0.0f, 0.0f);
                Paint.Align align = Paint.Align.LEFT;
                if (this.A0Z != null) {
                    float A0J = this.A04 + A0J() + this.A0C;
                    if (getLayoutDirection() == 0) {
                        pointF.x = bounds.left + A0J;
                    } else {
                        pointF.x = bounds.right - A0J;
                        align = Paint.Align.RIGHT;
                    }
                    float centerY = bounds.centerY();
                    TextPaint textPaint = this.A0v.A04;
                    Paint.FontMetrics fontMetrics = this.A0q;
                    textPaint.getFontMetrics(fontMetrics);
                    pointF.y = centerY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
                }
                rectF4.setEmpty();
                if (this.A0Z != null) {
                    float A0J2 = this.A04 + A0J() + this.A0C;
                    float A0K = this.A01 + A0K() + this.A0B;
                    int layoutDirection = getLayoutDirection();
                    float f14 = bounds.left;
                    if (layoutDirection == 0) {
                        rectF4.left = f14 + A0J2;
                        f = bounds.right - A0K;
                    } else {
                        rectF4.left = f14 + A0K;
                        f = bounds.right - A0J2;
                    }
                    rectF4.right = f;
                    rectF4.top = bounds.top;
                    rectF4.bottom = bounds.bottom;
                }
                C69710Vu5 c69710Vu5 = this.A0v;
                if (c69710Vu5.A00 != null) {
                    TextPaint textPaint2 = c69710Vu5.A04;
                    textPaint2.drawableState = getState();
                    c69710Vu5.A00.A03(this.A0p, textPaint2, c69710Vu5.A05);
                }
                TextPaint textPaint3 = c69710Vu5.A04;
                textPaint3.setTextAlign(align);
                int round = Math.round(c69710Vu5.A00(this.A0Z.toString()));
                int i3 = 0;
                boolean z = false;
                if (round > Math.round(rectF4.width())) {
                    z = true;
                    i3 = canvas.save();
                    canvas.clipRect(rectF4);
                }
                CharSequence charSequence = this.A0Z;
                if (z && this.A0V != null) {
                    charSequence = TextUtils.ellipsize(charSequence, textPaint3, rectF4.width(), this.A0V);
                }
                canvas.drawText(charSequence, 0, charSequence.length(), pointF.x, pointF.y, textPaint3);
                if (z) {
                    canvas.restoreToCount(i3);
                }
            }
            if (A05(this)) {
                rectF4.setEmpty();
                if (A05(this)) {
                    float f15 = this.A01 + this.A06;
                    if (getLayoutDirection() == 0) {
                        float f16 = bounds.right - f15;
                        rectF4.right = f16;
                        rectF4.left = f16 - this.A07;
                    } else {
                        float f17 = bounds.left + f15;
                        rectF4.left = f17;
                        rectF4.right = f17 + this.A07;
                    }
                    float exactCenterY = bounds.exactCenterY();
                    float f18 = this.A07;
                    float f19 = exactCenterY - (f18 / 2.0f);
                    rectF4.top = f19;
                    rectF4.bottom = f19 + f18;
                }
                float f20 = rectF4.left;
                float f21 = rectF4.top;
                canvas.translate(f20, f21);
                this.A0T.setBounds(0, 0, (int) rectF4.width(), (int) rectF4.height());
                this.A0U.setBounds(this.A0T.getBounds());
                this.A0U.jumpToCurrentState();
                this.A0U.draw(canvas);
                canvas.translate(-f20, -f21);
            }
            if (this.A0D < 255) {
                canvas.restoreToCount(i2);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.A0D;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.A0P;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.A03;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(this.A04 + A0J() + this.A0C + this.A0v.A00(this.A0Z.toString()) + this.A0B + A0K() + this.A01), this.A0H);
    }

    @Override // X.C65O, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        if (this.A0f) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.A00);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.A03, this.A00);
        }
        outline.setAlpha(this.A0D / 255.0f);
    }

    @Override // X.C65O, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.A0M;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.A0J;
        if (colorStateList3 != null && colorStateList3.isStateful()) {
            return true;
        }
        ColorStateList colorStateList4 = this.A0L;
        if (colorStateList4 != null && colorStateList4.isStateful()) {
            return true;
        }
        C70154WDd c70154WDd = this.A0v.A00;
        if (c70154WDd != null && (colorStateList = c70154WDd.A0A) != null && colorStateList.isStateful()) {
            return true;
        }
        if (this.A0c && this.A0R != null && this.A0b) {
            return true;
        }
        Drawable drawable = this.A0S;
        if (drawable != null && drawable.isStateful()) {
            return true;
        }
        Drawable drawable2 = this.A0R;
        if (drawable2 != null && drawable2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList5 = this.A0l;
        if (colorStateList5 != null && colorStateList5.isStateful()) {
            return true;
        }
        return false;
    }

    @Override // X.C65O, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.A0f) {
            super.onStateChange(iArr);
        }
        return A06(this, iArr, this.A0h);
    }

    @Override // X.C65O, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.A0D != i) {
            this.A0D = i;
            invalidateSelf();
        }
    }

    @Override // X.C65O, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.A0P != colorFilter) {
            this.A0P = colorFilter;
            invalidateSelf();
        }
    }

    @Override // X.C65O, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.A0l != colorStateList) {
            this.A0l = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // X.C65O, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (this.A0m != mode) {
            this.A0m = mode;
            ColorStateList colorStateList = this.A0l;
            if (colorStateList != null && mode != null) {
                porterDuffColorFilter = new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            } else {
                porterDuffColorFilter = null;
            }
            this.A0Q = porterDuffColorFilter;
            invalidateSelf();
        }
    }

    public C67771Uxm(Context context, AttributeSet attributeSet, int i) {
        super(new C65Q(C65Q.A01(context, attributeSet, i, com.facebook.R.style.Widget_MaterialComponents_Chip_Action)));
        this.A00 = -1.0f;
        this.A0r = new Paint(1);
        this.A0q = new Paint.FontMetrics();
        this.A0u = new RectF();
        this.A0t = new PointF();
        this.A0s = new Path();
        this.A0D = 255;
        this.A0m = PorterDuff.Mode.SRC_IN;
        this.A0a = new WeakReference(null);
        A0E(context);
        this.A0p = context;
        C69710Vu5 c69710Vu5 = new C69710Vu5(this);
        this.A0v = c69710Vu5;
        this.A0Z = "";
        c69710Vu5.A04.density = AbstractC65702TsY.A00(context);
        int[] iArr = A0x;
        setState(iArr);
        if (!Arrays.equals(this.A0h, iArr)) {
            this.A0h = iArr;
            if (A05(this)) {
                A06(this, getState(), iArr);
            }
        }
        this.A0g = true;
        A0w.setTint(-1);
    }

    private void A00(Rect rect, RectF rectF) {
        Drawable drawable;
        Drawable drawable2;
        rectF.setEmpty();
        if (A04() || A02()) {
            float f = this.A04 + this.A0A;
            if (this.A0e) {
                drawable = this.A0R;
            } else {
                drawable = this.A0S;
            }
            float f2 = this.A02;
            if (f2 <= 0.0f && drawable != null) {
                f2 = drawable.getIntrinsicWidth();
            }
            if (getLayoutDirection() == 0) {
                float f3 = rect.left + f;
                rectF.left = f3;
                rectF.right = f3 + f2;
            } else {
                float f4 = rect.right - f;
                rectF.right = f4;
                rectF.left = f4 - f2;
            }
            if (this.A0e) {
                drawable2 = this.A0R;
            } else {
                drawable2 = this.A0S;
            }
            float f5 = this.A02;
            if (f5 <= 0.0f && drawable2 != null) {
                f5 = (float) Math.ceil(AbstractC126235nK.A00(this.A0p, 24));
                if (drawable2.getIntrinsicHeight() <= f5) {
                    f5 = drawable2.getIntrinsicHeight();
                }
            }
            float exactCenterY = rect.exactCenterY() - (f5 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + f5;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x008b, code lost:
    
        if (r8.A0b == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a4, code lost:
    
        if (r1 == r8.A0J()) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A06(X.C67771Uxm r8, int[] r9, int[] r10) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67771Uxm.A06(X.Uxm, int[], int[]):boolean");
    }

    public final float A0J() {
        Drawable drawable;
        if (!A04() && !A02()) {
            return 0.0f;
        }
        float f = this.A0A;
        if (this.A0e) {
            drawable = this.A0R;
        } else {
            drawable = this.A0S;
        }
        float f2 = this.A02;
        if (f2 <= 0.0f && drawable != null) {
            f2 = drawable.getIntrinsicWidth();
        }
        return f + f2 + this.A09;
    }

    public final float A0K() {
        if (A05(this)) {
            return this.A08 + this.A07 + this.A06;
        }
        return 0.0f;
    }

    @Override // X.XDC
    public final void Dsi() {
        A0L();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (A04()) {
            onLayoutDirectionChanged |= this.A0S.setLayoutDirection(i);
        }
        if (A02()) {
            onLayoutDirectionChanged |= this.A0R.setLayoutDirection(i);
        }
        if (A05(this)) {
            onLayoutDirectionChanged |= this.A0T.setLayoutDirection(i);
        }
        if (onLayoutDirectionChanged) {
            invalidateSelf();
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (A04()) {
            onLevelChange |= this.A0S.setLevel(i);
        }
        if (A02()) {
            onLevelChange |= this.A0R.setLevel(i);
        }
        if (A05(this)) {
            onLevelChange |= this.A0T.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (A04()) {
            visible |= this.A0S.setVisible(z, z2);
        }
        if (A02()) {
            visible |= this.A0R.setVisible(z, z2);
        }
        if (A05(this)) {
            visible |= this.A0T.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }
}
