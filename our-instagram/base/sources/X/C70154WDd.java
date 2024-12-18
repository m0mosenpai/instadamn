package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.TypedValue;

/* renamed from: X.WDd, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70154WDd {
    public float A00;
    public Typeface A01;
    public boolean A02 = false;
    public final float A03;
    public final float A04;
    public final float A05;
    public final float A06;
    public final int A07;
    public final int A08;
    public final ColorStateList A09;
    public final ColorStateList A0A;
    public final ColorStateList A0B;
    public final ColorStateList A0C;
    public final String A0D;
    public final boolean A0E;
    public final int A0F;

    private boolean A01(Context context) {
        int i = this.A0F;
        return (i == 0 || context.isRestricted() || C3WY.A03(context, new TypedValue(), null, i, 0, false, true) == null) ? false : true;
    }

    public final void A05(Context context, VK5 vk5) {
        if (A01(context)) {
            A02(context);
        } else {
            A00(this);
        }
        int i = this.A0F;
        if (i == 0) {
            this.A02 = true;
        }
        if (this.A02) {
            vk5.A01(this.A01, true);
            return;
        }
        try {
            C65796TuE c65796TuE = new C65796TuE(this, vk5);
            if (context.isRestricted()) {
                c65796TuE.A00(-4);
            } else {
                C3WY.A03(context, new TypedValue(), c65796TuE, i, 0, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.A02 = true;
            vk5.A00(1);
        } catch (Exception unused2) {
            this.A02 = true;
            vk5.A00(-3);
        }
    }

    public static void A00(C70154WDd c70154WDd) {
        Typeface typeface;
        String str;
        Typeface typeface2 = c70154WDd.A01;
        if (typeface2 == null && (str = c70154WDd.A0D) != null) {
            typeface2 = Typeface.create(str, c70154WDd.A07);
            c70154WDd.A01 = typeface2;
        }
        if (typeface2 == null) {
            int i = c70154WDd.A08;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        typeface = Typeface.DEFAULT;
                    } else {
                        typeface = Typeface.MONOSPACE;
                    }
                } else {
                    typeface = Typeface.SERIF;
                }
            } else {
                typeface = Typeface.SANS_SERIF;
            }
            c70154WDd.A01 = typeface;
            c70154WDd.A01 = Typeface.create(typeface, c70154WDd.A07);
        }
    }

    public final Typeface A02(Context context) {
        if (this.A02) {
            return this.A01;
        }
        if (!context.isRestricted()) {
            try {
                Typeface A02 = C3WY.A02(context, this.A0F);
                this.A01 = A02;
                if (A02 != null) {
                    this.A01 = Typeface.create(A02, this.A07);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException | Exception unused) {
            }
        }
        A00(this);
        this.A02 = true;
        return this.A01;
    }

    public C70154WDd(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C65N.A0b);
        this.A00 = obtainStyledAttributes.getDimension(0, 0.0f);
        this.A0A = AbstractC1567371w.A01(context, obtainStyledAttributes, 3);
        this.A0B = AbstractC1567371w.A01(context, obtainStyledAttributes, 4);
        this.A0C = AbstractC1567371w.A01(context, obtainStyledAttributes, 5);
        this.A07 = obtainStyledAttributes.getInt(2, 0);
        this.A08 = obtainStyledAttributes.getInt(1, 1);
        int i2 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.A0F = obtainStyledAttributes.getResourceId(i2, 0);
        this.A0D = obtainStyledAttributes.getString(i2);
        obtainStyledAttributes.getBoolean(14, false);
        this.A09 = AbstractC1567371w.A01(context, obtainStyledAttributes, 6);
        this.A04 = obtainStyledAttributes.getFloat(7, 0.0f);
        this.A05 = obtainStyledAttributes.getFloat(8, 0.0f);
        this.A06 = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, C65N.A0R);
        this.A0E = obtainStyledAttributes2.hasValue(0);
        this.A03 = obtainStyledAttributes2.getFloat(0, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    public final void A03(Context context, TextPaint textPaint, VK5 vk5) {
        int i;
        int i2;
        A04(context, textPaint, vk5);
        ColorStateList colorStateList = this.A0A;
        if (colorStateList != null) {
            i = colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor());
        } else {
            i = -16777216;
        }
        textPaint.setColor(i);
        float f = this.A06;
        float f2 = this.A04;
        float f3 = this.A05;
        ColorStateList colorStateList2 = this.A09;
        if (colorStateList2 != null) {
            i2 = colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor());
        } else {
            i2 = 0;
        }
        textPaint.setShadowLayer(f, f2, f3, i2);
    }

    public final void A04(Context context, TextPaint textPaint, VK5 vk5) {
        if (A01(context)) {
            A06(A02(context), textPaint);
            return;
        }
        A00(this);
        A06(this.A01, textPaint);
        A05(context, new C67768Uxj(textPaint, this, vk5));
    }

    public final void A06(Typeface typeface, TextPaint textPaint) {
        textPaint.setTypeface(typeface);
        int style = (typeface.getStyle() ^ (-1)) & this.A07;
        textPaint.setFakeBoldText(AbstractC167007dF.A1M(style & 1));
        float f = 0.0f;
        if ((style & 2) != 0) {
            f = -0.25f;
        }
        textPaint.setTextSkewX(f);
        textPaint.setTextSize(this.A00);
        if (this.A0E) {
            textPaint.setLetterSpacing(this.A03);
        }
    }
}
