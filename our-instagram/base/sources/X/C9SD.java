package X;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.facebook.proxygen.LigerSamplePolicy;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9SD, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9SD extends Drawable implements Drawable.Callback {
    public long A00;
    public AKT A01;
    public AKT A02;
    public boolean A04;
    public long A06;
    public Paint A07;
    public boolean A08;
    public final float A09;
    public final float A0A;
    public final long A0B;
    public final Paint A0C;
    public final RectF A0D;
    public final C9V7 A0E;
    public final List A0F;
    public int A05 = -1;
    public boolean A03 = true;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public C9SD(C9V7 c9v7, List list, float f, int i) {
        this.A0A = f;
        Paint A0S = AbstractC166987dD.A0S(1);
        this.A0C = A0S;
        AbstractC166987dD.A1R(A0S);
        A0S.setColor(i);
        this.A01 = new AKT(f);
        this.A02 = new AKT(f);
        this.A0D = AbstractC166987dD.A0X();
        ArrayList A1E = AbstractC166987dD.A1E();
        this.A0F = A1E;
        A1E.addAll(list);
        this.A0B = A1E.size() * LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT;
        this.A09 = 0.5f;
        this.A0E = c9v7;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        RectF rectF = this.A0D;
        float f = this.A0A;
        Paint paint = this.A0C;
        canvas.drawRoundRect(rectF, f, f, paint);
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - this.A00;
        this.A00 = currentTimeMillis;
        if (this.A04) {
            this.A06 += j;
        }
        long j2 = this.A06;
        long j3 = this.A0B;
        int max = Math.max(0, (int) Math.floor(((float) (j2 % j3)) / 5000.0f));
        float f2 = (float) j2;
        float max2 = (Math.max(0.0f, ((float) Math.floor(f2 / r6)) * ((float) j3)) + ((float) (max * LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT))) - 750.0f;
        float f3 = max2 + 5750.0f;
        float f4 = f3 - 750.0f;
        float A01 = AbstractC13600mm.A01(f2, max2, f3, 0.0f, 1.0f);
        float A012 = AbstractC13600mm.A01(f2, f4, 5750.0f + f4, 0.0f, 1.0f);
        List list = this.A0F;
        int max3 = Math.max(0, (max + 1) % list.size());
        if (A01 >= 0.65f) {
            AKT akt = this.A02;
            if (akt.A03 == null && this.A03) {
                akt.A03((AC4) list.get(max3), width, height);
            }
        } else {
            AKT akt2 = this.A02;
            if (akt2.A03 != null) {
                AKT akt3 = this.A01;
                this.A01 = akt2;
                akt3.A01();
                this.A02 = akt3;
            }
            max3 = max;
        }
        AKT akt4 = this.A01;
        if (akt4.A03 == null) {
            akt4.A03((AC4) list.get(max), width, height);
        }
        if (max3 != this.A05) {
            list.get(max3);
            this.A05 = max3;
        }
        AKT akt5 = this.A01;
        if (akt5.A03 != null) {
            if (!this.A03) {
                A01 = 1.0f;
            }
            akt5.A02(canvas, A01, width, height, 255);
            this.A08 = true;
        }
        int round = Math.round(AbstractC13600mm.A02((float) this.A06, f4, f4 + 750.0f, 0.0f, 255.0f));
        AKT akt6 = this.A02;
        if (akt6.A03 != null && this.A03 && round > 0) {
            akt6.A02(canvas, A012, width, height, round);
        }
        if (paint != null) {
            Paint paint2 = this.A07;
            paint2.getClass();
            canvas.drawRoundRect(rectF, f, f, paint2);
        }
        if ((this.A04 && this.A03) || !this.A08) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.A0D.set(rect);
        float f = this.A09;
        if (f > 0.0f) {
            float f2 = rect.bottom;
            LinearGradient linearGradient = new LinearGradient(0.0f, f2, 0.0f, f2 - (rect.height() * f), Color.argb(Math.round(127.5f), 0, 0, 0), 0, Shader.TileMode.CLAMP);
            Paint A0P = AbstractC166997dE.A0P();
            this.A07 = A0P;
            A0P.setShader(linearGradient);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
