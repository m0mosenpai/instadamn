package X;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* loaded from: classes10.dex */
public final class Q2L extends Drawable {
    public SBS A00;
    public C63025Sav A01;
    public final Context A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final float A06;
    public final int A07;
    public final Paint A08;

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00fb, code lost:
    
        if (r0 == null) goto L54;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r19) {
        /*
            Method dump skipped, instructions count: 943
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q2L.draw(android.graphics.Canvas):void");
    }

    public static final float A00(Float f, float f2) {
        float f3;
        if (f != null) {
            f3 = f.floatValue();
        } else {
            f3 = 0.0f;
        }
        float f4 = f2 - f3;
        if (f4 < 0.0f) {
            return 0.0f;
        }
        return f4;
    }

    public final C63025Sav A02() {
        return this.A01;
    }

    public final void A03(SBS sbs) {
        if (!C14360o3.A0K(sbs, this.A00)) {
            this.A00 = sbs;
            invalidateSelf();
        }
    }

    public final void A04(C63025Sav c63025Sav) {
        if (!c63025Sav.equals(this.A01)) {
            this.A01 = c63025Sav;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        int alpha = Color.alpha(this.A07);
        if (alpha == 0) {
            return -2;
        }
        return C1H4.A01(((this.A08.getAlpha() / 255.0f) / (alpha / 255.0f)) * 255.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        AbstractC58323PtF.A14(this.A08, this, i / 255.0f, this.A07);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A08.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public Q2L(Context context, SBS sbs, C63025Sav c63025Sav, float f, float f2, float f3, float f4, int i) {
        this.A02 = context;
        this.A07 = i;
        this.A04 = f;
        this.A05 = f2;
        this.A03 = f3;
        this.A06 = f4;
        this.A01 = c63025Sav;
        this.A00 = sbs;
        Paint A0R = AbstractC166987dD.A0R();
        A0R.setColor(i);
        if (f3 > 0.0f) {
            A0R.setMaskFilter(new BlurMaskFilter(C63395SjN.A00(f3 * 0.5f), BlurMaskFilter.Blur.NORMAL));
        }
        this.A08 = A0R;
    }

    public static Float A01(Enum r0, Float[] fArr) {
        return fArr[r0.ordinal()];
    }
}
