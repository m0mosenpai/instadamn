package com.google.android.material.imageview;

import X.AbstractC1567171t;
import X.AbstractC1567371w;
import X.AbstractC166997dE;
import X.C02G;
import X.C0f9;
import X.C128955sF;
import X.C65K;
import X.C65N;
import X.C65O;
import X.C65P;
import X.C65Q;
import X.C65Z;
import X.UAu;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.facebook.R;

/* loaded from: classes11.dex */
public class ShapeableImageView extends C128955sF implements C65P {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public ColorStateList A05;
    public C65O A06;
    public C65Q A07;
    public int A08;
    public int A09;
    public Path A0A;
    public boolean A0B;
    public final Paint A0C;
    public final Path A0D;
    public final RectF A0E;
    public final Paint A0F;
    public final RectF A0G;
    public final C65Z A0H;

    private void A00(int i, int i2) {
        RectF rectF = this.A0E;
        rectF.set(getPaddingLeft(), getPaddingTop(), i - getPaddingRight(), i2 - getPaddingBottom());
        C65Z c65z = this.A0H;
        C65Q c65q = this.A07;
        Path path = this.A0D;
        c65z.A01(path, rectF, c65q, null, 1.0f);
        Path path2 = this.A0A;
        path2.rewind();
        path2.addPath(path);
        RectF rectF2 = this.A0G;
        rectF2.set(0.0f, 0.0f, i, i2);
        path2.addRect(rectF2, Path.Direction.CCW);
    }

    public int getContentPaddingBottom() {
        return this.A01;
    }

    public final int getContentPaddingEnd() {
        int i = this.A02;
        if (i == Integer.MIN_VALUE) {
            if (getLayoutDirection() == 1) {
                return this.A08;
            }
            return this.A09;
        }
        return i;
    }

    public int getContentPaddingLeft() {
        int i;
        int i2 = this.A03;
        if (i2 != Integer.MIN_VALUE || this.A02 != Integer.MIN_VALUE) {
            if (getLayoutDirection() == 1 && (i = this.A02) != Integer.MIN_VALUE) {
                return i;
            }
            if (getLayoutDirection() != 1 && i2 != Integer.MIN_VALUE) {
                return i2;
            }
        }
        return this.A08;
    }

    public int getContentPaddingRight() {
        int i;
        int i2 = this.A03;
        if (i2 != Integer.MIN_VALUE || this.A02 != Integer.MIN_VALUE) {
            if (getLayoutDirection() == 1 && i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (getLayoutDirection() != 1 && (i = this.A02) != Integer.MIN_VALUE) {
                return i;
            }
        }
        return this.A09;
    }

    public final int getContentPaddingStart() {
        int i = this.A03;
        if (i == Integer.MIN_VALUE) {
            if (getLayoutDirection() == 1) {
                return this.A09;
            }
            return this.A08;
        }
        return i;
    }

    public int getContentPaddingTop() {
        return this.A04;
    }

    @Override // X.C65P
    public C65Q getShapeAppearanceModel() {
        return this.A07;
    }

    public ColorStateList getStrokeColor() {
        return this.A05;
    }

    public float getStrokeWidth() {
        return this.A00;
    }

    @Override // X.C65P
    public void setShapeAppearanceModel(C65Q c65q) {
        this.A07 = c65q;
        C65O c65o = this.A06;
        if (c65o != null) {
            c65o.setShapeAppearanceModel(c65q);
        }
        A00(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.A05 = colorStateList;
        invalidate();
    }

    public void setStrokeWidth(float f) {
        if (this.A00 != f) {
            this.A00 = f;
            invalidate();
        }
    }

    public ShapeableImageView(Context context, AttributeSet attributeSet, int i) {
        super(C65K.A00(context, attributeSet, i, R.style.Widget_MaterialComponents_ShapeableImageView), attributeSet, i);
        this.A0H = AbstractC1567171t.A00;
        this.A0D = new Path();
        this.A0B = false;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.A0F = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        AbstractC166997dE.A1D(paint, PorterDuff.Mode.DST_OUT);
        this.A0E = new RectF();
        this.A0G = new RectF();
        this.A0A = new Path();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C65N.A0X, i, R.style.Widget_MaterialComponents_ShapeableImageView);
        this.A05 = AbstractC1567371w.A01(context2, obtainStyledAttributes, 9);
        this.A00 = obtainStyledAttributes.getDimensionPixelSize(10, 0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.A08 = dimensionPixelSize;
        this.A04 = dimensionPixelSize;
        this.A09 = dimensionPixelSize;
        this.A01 = dimensionPixelSize;
        this.A08 = obtainStyledAttributes.getDimensionPixelSize(3, dimensionPixelSize);
        this.A04 = obtainStyledAttributes.getDimensionPixelSize(6, dimensionPixelSize);
        this.A09 = obtainStyledAttributes.getDimensionPixelSize(4, dimensionPixelSize);
        this.A01 = obtainStyledAttributes.getDimensionPixelSize(1, dimensionPixelSize);
        this.A03 = obtainStyledAttributes.getDimensionPixelSize(5, Integer.MIN_VALUE);
        this.A02 = obtainStyledAttributes.getDimensionPixelSize(2, Integer.MIN_VALUE);
        obtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.A0C = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.A07 = new C65Q(C65Q.A01(context2, attributeSet, i, R.style.Widget_MaterialComponents_ShapeableImageView));
        setOutlineProvider(new UAu(this));
    }

    @Override // android.view.View
    public int getPaddingBottom() {
        return super.getPaddingBottom() - this.A01;
    }

    @Override // android.view.View
    public int getPaddingEnd() {
        return super.getPaddingEnd() - getContentPaddingEnd();
    }

    @Override // android.view.View
    public int getPaddingLeft() {
        return super.getPaddingLeft() - getContentPaddingLeft();
    }

    @Override // android.view.View
    public int getPaddingRight() {
        return super.getPaddingRight() - getContentPaddingRight();
    }

    @Override // android.view.View
    public int getPaddingStart() {
        return super.getPaddingStart() - getContentPaddingStart();
    }

    @Override // android.view.View
    public int getPaddingTop() {
        return super.getPaddingTop() - this.A04;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(-1905031501);
        super.onAttachedToWindow();
        setLayerType(2, null);
        C0f9.A0D(351787479, A06);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(1470768796);
        setLayerType(0, null);
        super.onDetachedFromWindow();
        C0f9.A0D(-516473186, A06);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.A0A, this.A0F);
        if (this.A05 != null) {
            Paint paint = this.A0C;
            paint.setStrokeWidth(this.A00);
            int colorForState = this.A05.getColorForState(getDrawableState(), this.A05.getDefaultColor());
            if (this.A00 > 0.0f && colorForState != 0) {
                paint.setColor(colorForState);
                canvas.drawPath(this.A0D, paint);
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!this.A0B && isLayoutDirectionResolved()) {
            this.A0B = true;
            if (!isPaddingRelative() && this.A03 == Integer.MIN_VALUE && this.A02 == Integer.MIN_VALUE) {
                setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
            } else {
                setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = C0f9.A06(1974459717);
        super.onSizeChanged(i, i2, i3, i4);
        A00(i, i2);
        C0f9.A0D(-1142943637, A06);
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i + getContentPaddingLeft(), i2 + this.A04, i3 + getContentPaddingRight(), i4 + this.A01);
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i + getContentPaddingStart(), i2 + this.A04, i3 + getContentPaddingEnd(), i4 + this.A01);
    }

    public void setStrokeColorResource(int i) {
        setStrokeColor(C02G.A02(getContext(), i));
    }

    public void setStrokeWidthResource(int i) {
        setStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public ShapeableImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ShapeableImageView(Context context) {
        this(context, null, 0);
    }
}
