package com.instagram.ui.widget.badgeicon;

import X.AbstractC13880nE;
import X.AbstractC53242c7;
import X.C0f9;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.R;

/* loaded from: classes3.dex */
public class BadgeIconView extends View {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public Drawable A05;
    public int[] A06;
    public final int A07;
    public final Paint A08;
    public final Paint A09;

    public BadgeIconView(Context context) {
        this(context, null);
    }

    public final void A01(float f, float f2) {
        LinearGradient linearGradient = new LinearGradient(0.0f, f2, f, 0.0f, this.A06, (float[]) null, Shader.TileMode.CLAMP);
        Paint paint = this.A08;
        paint.setColor(-1);
        paint.setShader(linearGradient);
    }

    public void setBackgroundBorderColor(int i) {
        this.A09.setColor(i);
    }

    public void setBackgroundColorGradient(int[] iArr) {
        if (this.A06 != iArr) {
            this.A06 = iArr;
            A01(getMeasuredWidth(), getMeasuredHeight());
            invalidate();
        }
    }

    public void setIconDrawable(Drawable drawable) {
        Drawable drawable2 = this.A05;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            this.A05 = drawable;
            if (drawable != null) {
                drawable.setCallback(this);
            }
            invalidate();
        }
    }

    public void setIconSizeFactor(float f) {
        if (f != this.A01) {
            this.A01 = f;
            invalidate();
        }
    }

    public void setIconTintColor(int i) {
        Drawable drawable = this.A05;
        if (drawable != null) {
            drawable.mutate().setTint(i);
        }
    }

    public void setRadius(float f) {
        if (this.A02 != f) {
            this.A02 = f;
            invalidate();
        }
    }

    public void setTranslationXFactor(float f) {
        if (f != this.A03) {
            this.A03 = f;
            invalidate();
        }
    }

    public void setTranslationYFactor(float f) {
        if (f != this.A04) {
            this.A04 = f;
            invalidate();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.A05 != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(369715252);
        super.onAttachedToWindow();
        Drawable drawable = this.A05;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        C0f9.A0D(1087062903, A06);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(-253210578);
        super.onDetachedFromWindow();
        Drawable drawable = this.A05;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        C0f9.A0D(-125706811, A06);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float f = this.A02;
        if (f == 0.0f) {
            f = width;
        }
        canvas.drawCircle(this.A03 + width, height, f, this.A09);
        float f2 = f - this.A00;
        canvas.drawCircle(width + this.A03, height, f2, this.A08);
        Drawable drawable = this.A05;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            float f3 = f2 * 2.0f * this.A01;
            float f4 = intrinsicWidth;
            float f5 = intrinsicHeight;
            float min = Math.min(1.0f, Math.min(f3 / f4, f3 / f5));
            int round = Math.round(f4 * min);
            int round2 = Math.round(f5 * min);
            int round3 = Math.round((getWidth() - round) / 2.0f);
            int round4 = Math.round((getHeight() - round2) / 2.0f);
            drawable.setBounds(round3, round4, round + round3, round2 + round4);
            drawable.draw(canvas);
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        float measuredWidth = getMeasuredWidth() - (this.A00 * 2.0f);
        A01(measuredWidth, measuredWidth);
        setTranslationY(getMeasuredHeight() * this.A04);
    }

    public void setBorderWidth(float f) {
        float A00 = AbstractC13880nE.A00(getContext(), f);
        if (this.A00 != A00) {
            this.A00 = A00;
            invalidate();
        }
    }

    public void setIconTintColorResource(int i) {
        setIconTintColor(getContext().getColor(i));
    }

    public BadgeIconView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A04 = 0.25f;
        this.A03 = 0.0f;
        this.A01 = 0.55f;
        Paint paint = new Paint();
        this.A09 = paint;
        Paint paint2 = new Paint();
        this.A08 = paint2;
        Context context2 = getContext();
        this.A00 = AbstractC13880nE.A04(context2, 2);
        int color = context2.getColor(AbstractC53242c7.A0H(context2, R.attr.igds_color_primary_background));
        this.A07 = color;
        paint.setAntiAlias(true);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(color);
        paint2.setAntiAlias(true);
        paint2.setStyle(style);
        this.A06 = new int[]{color, color};
        A01(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setIconDrawable(int i) {
        setIconDrawable(getContext().getDrawable(i));
    }

    public BadgeIconView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
