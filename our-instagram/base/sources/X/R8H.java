package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.util.DisplayMetrics;
import android.util.TypedValue;

/* loaded from: classes10.dex */
public abstract class R8H extends AbstractC63487So1 {
    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        Spanned spanned;
        float f;
        float f2;
        float f3;
        float f4;
        String A01;
        float f5;
        float f6;
        float f7;
        float f8;
        R8K r8k;
        if (this instanceof R8K) {
            R8K r8k2 = (R8K) this;
            if (r8k2 instanceof R8M) {
                R8M r8m = (R8M) r8k2;
                AbstractC167017dG.A1N(canvas, paint);
                C14360o3.A0B(charSequence, 7);
                if (((Spanned) charSequence).getSpanStart(r8m) == i6) {
                    r8m.A00(paint);
                    A01 = r8m.A01;
                    f5 = i;
                    f6 = i2;
                    f7 = ((AbstractC63487So1) r8m).A00;
                    f8 = r8m.A00;
                    r8k = r8m;
                } else {
                    return;
                }
            } else {
                if (((Spanned) charSequence).getSpanStart(r8k2) != i6) {
                    return;
                }
                r8k2.A00(paint);
                if (r8k2.A01 < 10) {
                    A01 = AnonymousClass001.A0R(" ", r8k2.A01());
                } else {
                    A01 = r8k2.A01();
                }
                f5 = i;
                f6 = i2;
                f7 = ((AbstractC63487So1) r8k2).A00;
                f8 = r8k2.A00;
                r8k = r8k2;
            }
            canvas.drawText(A01, f5 + (f6 * (f7 - f8)), i4, ((AbstractC63487So1) r8k).A02);
            return;
        }
        R8J r8j = (R8J) this;
        C14360o3.A0B(canvas, 0);
        AbstractC167007dF.A1H(paint, 1, charSequence);
        if (!(charSequence instanceof Spanned) || (spanned = (Spanned) charSequence) == null || spanned.getSpanStart(r8j) != i6) {
            return;
        }
        r8j.A00(paint);
        if (r8j.A00 == null) {
            Paint paint2 = new Paint(paint);
            r8j.A00 = paint2;
            paint2.setColor(((AbstractC63487So1) r8j).A01);
            Paint paint3 = r8j.A00;
            if (paint3 != null) {
                AbstractC43592JPx.A1E(paint3);
            }
        }
        float f9 = r8j.A01;
        float f10 = i + (i2 * (((AbstractC63487So1) r8j).A00 - r8j.A02));
        float f11 = f9;
        if (f9 < f10) {
            f11 = f10;
        }
        int intValue = r8j.A03.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue == 3) {
                        float f12 = (i3 + i5) / 2.0f;
                        f = f11 - f9;
                        f2 = f12 - f9;
                        f3 = f11 + f9;
                        f4 = f12 + f9;
                    } else {
                        throw B4Z.A00();
                    }
                } else {
                    Paint paint4 = r8j.A00;
                    if (paint4 == null) {
                        return;
                    }
                    canvas.drawCircle(f11, (i3 + i5) / 2.0f, f9, paint4);
                    return;
                }
            } else {
                float f13 = (i3 + i5) / 2.0f;
                f = f11 - f9;
                float f14 = f9 / 3.0f;
                f2 = f13 - f14;
                f3 = f11 + f9;
                f4 = f13 + f14;
            }
            canvas.drawRect(f, f2, f3, f4, ((AbstractC63487So1) r8j).A02);
            return;
        }
        canvas.drawCircle(f11, (i3 + i5) / 2.0f, f9, ((AbstractC63487So1) r8j).A02);
    }

    public R8H(DisplayMetrics displayMetrics, int i) {
        float applyDimension;
        this.A01 = -16777216;
        this.A00 = TypedValue.applyDimension(2, 20.0f, displayMetrics);
        if (i == 0) {
            applyDimension = 0.0f;
        } else {
            applyDimension = TypedValue.applyDimension(2, 22.0f, displayMetrics) + (i * TypedValue.applyDimension(2, 19.0f, displayMetrics));
        }
        this.A00 = applyDimension;
    }
}
