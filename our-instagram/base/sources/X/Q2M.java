package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes10.dex */
public final class Q2M extends Drawable {
    public static final /* synthetic */ C0YR[] A0B = {new AnonymousClass013(Q2M.class, "borderRadius", "getBorderRadius()Lcom/facebook/react/uimanager/style/BorderRadiusStyle;", 0), new AnonymousClass013(Q2M.class, "outlineOffset", "getOutlineOffset()F", 0)};
    public RectF A02;
    public C63013Sad A03;
    public Integer A04;
    public final Paint A06;
    public final Path A07;
    public final InterfaceC16530ry A08;
    public final Context A0A;
    public final float A05 = 0.8f;
    public final InterfaceC16530ry A09 = new X6J(0, this, Float.valueOf(0.0f));
    public int A01 = -16777216;
    public float A00 = 0.0f;

    public static final float A00(float f, float f2) {
        if (f != 0.0f) {
            return f + (f2 * 0.5f);
        }
        return 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C63013Sad c63013Sad;
        C63199Sf2 c63199Sf2;
        C63199Sf2 c63199Sf22;
        C63199Sf2 c63199Sf23;
        C14360o3.A0B(canvas, 0);
        if (this.A00 != 0.0f) {
            Path path = this.A07;
            path.reset();
            InterfaceC16530ry interfaceC16530ry = this.A08;
            C0YR[] c0yrArr = A0B;
            C63025Sav c63025Sav = (C63025Sav) interfaceC16530ry.CES(this, c0yrArr[0]);
            if (c63025Sav != null) {
                c63013Sad = c63025Sav.A00(this.A0A, WF1.A01(AbstractC166997dE.A0H(this)), WF1.A01(AbstractC166997dE.A0G(this)), getLayoutDirection());
            } else {
                c63013Sad = null;
            }
            this.A03 = c63013Sad;
            RectF rectF = this.A02;
            rectF.set(getBounds());
            float f = rectF.top;
            float f2 = this.A00 * 0.5f;
            InterfaceC16530ry interfaceC16530ry2 = this.A09;
            float A09 = f2 + AbstractC166987dD.A09(interfaceC16530ry2.CES(this, c0yrArr[1]));
            float f3 = this.A05;
            rectF.top = f - (A09 - f3);
            rectF.bottom += ((this.A00 * 0.5f) + AbstractC166987dD.A09(interfaceC16530ry2.CES(this, c0yrArr[1]))) - f3;
            rectF.left -= ((this.A00 * 0.5f) + AbstractC166987dD.A09(interfaceC16530ry2.CES(this, c0yrArr[1]))) - f3;
            rectF.right += ((this.A00 * 0.5f) + AbstractC166987dD.A09(interfaceC16530ry2.CES(this, c0yrArr[1]))) - f3;
            C63013Sad c63013Sad2 = this.A03;
            if (c63013Sad2 != null && c63013Sad2.A00()) {
                C63199Sf2 A00 = C63199Sf2.A00(c63013Sad2.A02);
                C63013Sad c63013Sad3 = this.A03;
                if (c63013Sad3 != null) {
                    c63199Sf2 = C63199Sf2.A00(c63013Sad3.A03);
                } else {
                    c63199Sf2 = new C63199Sf2(0.0f, 0.0f);
                }
                C63013Sad c63013Sad4 = this.A03;
                if (c63013Sad4 != null) {
                    c63199Sf22 = C63199Sf2.A00(c63013Sad4.A00);
                } else {
                    c63199Sf22 = new C63199Sf2(0.0f, 0.0f);
                }
                C63013Sad c63013Sad5 = this.A03;
                if (c63013Sad5 != null) {
                    c63199Sf23 = C63199Sf2.A00(c63013Sad5.A01);
                } else {
                    c63199Sf23 = new C63199Sf2(0.0f, 0.0f);
                }
                float f4 = A00.A00;
                float f5 = this.A00;
                path.addRoundRect(rectF, new float[]{A00(f4, f5), A00(A00.A01, f5), A00(c63199Sf2.A00, f5), A00(c63199Sf2.A01, f5), A00(c63199Sf23.A00, f5), A00(c63199Sf23.A01, f5), A00(c63199Sf22.A00, f5), A00(c63199Sf22.A01, f5)}, Path.Direction.CW);
            } else {
                path.addRect(rectF, Path.Direction.CW);
            }
            canvas.drawPath(path, this.A06);
        }
    }

    public Q2M(Context context, C63025Sav c63025Sav, Integer num) {
        this.A0A = context;
        this.A08 = new X6J(0, this, c63025Sav);
        this.A04 = num;
        Paint A0R = AbstractC166987dD.A0R();
        AbstractC43592JPx.A1E(A0R);
        A0R.setColor(-16777216);
        A0R.setStrokeWidth(0.0f);
        A0R.setPathEffect(null);
        this.A06 = A0R;
        this.A02 = AbstractC166987dD.A0X();
        this.A07 = AbstractC166987dD.A0T();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return C1H4.A01(((this.A06.getAlpha() / 255.0f) / (Color.alpha(this.A01) / 255.0f)) * 255.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        AbstractC58323PtF.A14(this.A06, this, i / 255.0f, this.A01);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A06.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public static final DashPathEffect A01(Integer num, float f) {
        float[] fArr;
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue == 2) {
                    fArr = new float[4];
                } else {
                    throw B4Z.A00();
                }
            } else {
                fArr = new float[4];
                f *= 3.0f;
            }
            fArr[0] = f;
            fArr[1] = f;
            fArr[2] = f;
            fArr[3] = f;
            return new DashPathEffect(fArr, 0.0f);
        }
        return null;
    }
}
