package X;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes10.dex */
public final class Q2I extends Drawable {
    public C63025Sav A00;
    public final Paint A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final int A05;
    public final Context A06;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C63013Sad c63013Sad;
        C14360o3.A0B(canvas, 0);
        float A00 = WF1.A00(AbstractC166997dE.A0H(this));
        float A002 = WF1.A00(AbstractC166997dE.A0G(this));
        C63025Sav c63025Sav = this.A00;
        if (c63025Sav != null) {
            C63013Sad A003 = c63025Sav.A00(this.A06, A00, A002, getLayoutDirection());
            c63013Sad = new C63013Sad(C63199Sf2.A00(A003.A02), C63199Sf2.A00(A003.A03), C63199Sf2.A00(A003.A00), C63199Sf2.A00(A003.A01));
        } else {
            c63013Sad = null;
        }
        float A01 = WF1.A01(this.A04);
        RectF rectF = new RectF(getBounds());
        float f = -A01;
        rectF.inset(f, f);
        rectF.offset(WF1.A01(this.A02), WF1.A01(this.A03));
        int save = canvas.save();
        if (c63013Sad != null && c63013Sad.A00()) {
            RectF rectF2 = new RectF(getBounds());
            rectF2.inset(0.4f, 0.4f);
            Path A0T = AbstractC166987dD.A0T();
            C63199Sf2 c63199Sf2 = c63013Sad.A02;
            float f2 = c63199Sf2.A00;
            float f3 = c63199Sf2.A01;
            C63199Sf2 c63199Sf22 = c63013Sad.A03;
            float f4 = c63199Sf22.A00;
            float f5 = c63199Sf22.A01;
            C63199Sf2 c63199Sf23 = c63013Sad.A01;
            float f6 = c63199Sf23.A00;
            float f7 = c63199Sf23.A01;
            C63199Sf2 c63199Sf24 = c63013Sad.A00;
            float f8 = c63199Sf24.A00;
            float f9 = c63199Sf24.A01;
            Path.Direction direction = Path.Direction.CW;
            A0T.addRoundRect(rectF2, new float[]{f2, f3, f4, f5, f6, f7, f8, f9}, direction);
            canvas.clipOutPath(A0T);
            Path A0T2 = AbstractC166987dD.A0T();
            A0T2.addRoundRect(rectF, new float[]{AbstractC62169S0q.A00(f2, A01), AbstractC62169S0q.A00(f3, A01), AbstractC62169S0q.A00(f4, A01), AbstractC62169S0q.A00(f5, A01), AbstractC62169S0q.A00(f6, A01), AbstractC62169S0q.A00(f7, A01), AbstractC62169S0q.A00(f8, A01), AbstractC62169S0q.A00(f9, A01)}, direction);
            canvas.drawPath(A0T2, this.A01);
        } else {
            canvas.clipOutRect(getBounds());
            canvas.drawRect(rectF, this.A01);
        }
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        int alpha = Color.alpha(this.A05);
        if (alpha == 0) {
            return -2;
        }
        return C1H4.A01(((this.A01.getAlpha() / 255.0f) / (alpha / 255.0f)) * 255.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        AbstractC58323PtF.A14(this.A01, this, i / 255.0f, this.A05);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A01.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public Q2I(Context context, C63025Sav c63025Sav, float f, float f2, float f3, float f4, int i) {
        this.A06 = context;
        this.A05 = i;
        this.A02 = f;
        this.A03 = f2;
        this.A04 = f4;
        this.A00 = c63025Sav;
        Paint A0R = AbstractC166987dD.A0R();
        A0R.setColor(i);
        if (f3 > 0.0f) {
            A0R.setMaskFilter(new BlurMaskFilter(C63395SjN.A00(f3 * 0.5f), BlurMaskFilter.Blur.NORMAL));
        }
        this.A01 = A0R;
    }
}
