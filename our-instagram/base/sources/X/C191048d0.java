package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Interpolator;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.8d0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C191048d0 extends AbstractC130945vi implements C5RP, C74Q, C5RR, InterfaceC191058d1 {
    public long A00;
    public Path A01;
    public C202728xq A02;
    public boolean A03;
    public boolean A04;
    public RectF A05;
    public final int A06;
    public final Matrix A07;
    public final Paint A08;
    public final Paint A09;
    public final Paint A0A;
    public final Paint A0B;
    public final Path A0C;
    public final RectF A0D;
    public final Drawable A0E;
    public final Interpolator A0F;
    public final C6RL A0G;
    public final BEZ A0H;
    public final Integer A0I;
    public final float A0J;
    public final float A0K;
    public final int A0L;
    public final Resources A0M;

    public C191048d0(Context context, BEZ bez, Integer num, float f, float f2) {
        Drawable mutate;
        int i;
        C14360o3.A0B(context, 1);
        C14360o3.A0B(bez, 5);
        this.A0K = f;
        this.A0J = f2;
        this.A0I = num;
        this.A0H = bez;
        Resources resources = context.getResources();
        C14360o3.A07(resources);
        this.A0M = resources;
        this.A05 = new RectF(0.0f, 0.0f, f, f2);
        this.A0L = resources.getDimensionPixelSize(R.dimen.ad4ad_button_bottom_margin);
        this.A01 = new Path();
        RectF rectF = new RectF();
        this.A0D = rectF;
        Paint paint = new Paint(1);
        paint.setColor(context.getColor(R.color.black_50_transparent));
        paint.setStyle(Paint.Style.FILL);
        this.A0A = paint;
        this.A08 = A2B.A00();
        Drawable drawable = null;
        if (num.intValue() != 0) {
            Drawable drawable2 = context.getDrawable(R.drawable.instagram_music_add_pano_filled_24);
            if (drawable2 != null && (mutate = drawable2.mutate()) != null) {
                i = R.attr.igds_color_icon_on_media;
                mutate.setTint(context.getColor(AbstractC53242c7.A0H(context, i)));
                drawable = mutate;
            }
        } else {
            Drawable drawable3 = context.getDrawable(R.drawable.instagram_photo_add_pano_filled_24);
            if (drawable3 != null && (mutate = drawable3.mutate()) != null) {
                i = R.attr.igds_color_icon_on_color;
                mutate.setTint(context.getColor(AbstractC53242c7.A0H(context, i)));
                drawable = mutate;
            }
        }
        this.A0E = drawable;
        this.A06 = resources.getDimensionPixelSize(R.dimen.abc_dialog_padding_material);
        this.A0G = AbstractC1572274c.A01(context, this, C05F.A0C, C05F.A00);
        int color = context.getColor(R.color.cds_white_a20);
        Paint paint2 = new Paint(1);
        paint2.setColor(color);
        this.A0B = paint2;
        this.A0C = new Path();
        this.A09 = new Paint();
        this.A0F = new AccelerateInterpolator();
        this.A07 = new Matrix();
        this.A03 = true;
        C8OK C0e = bez.C0e();
        if (C0e != null) {
            Path A02 = AMF.A02(C0e, C1H4.A01(f), C1H4.A01(f2));
            if (A02 != null) {
                this.A01.set(A02);
            } else {
                Path path = this.A01;
                RectF rectF2 = this.A05;
                float f3 = this.A0L;
                path.addRoundRect(rectF2, f3, f3, Path.Direction.CW);
            }
        }
        this.A01.computeBounds(rectF, false);
        this.A0G.A01();
    }

    @Override // X.C5RP
    public final void A9I(InterfaceC25177BCa interfaceC25177BCa) {
        C14360o3.A0B(interfaceC25177BCa, 0);
        C202728xq c202728xq = this.A02;
        if (c202728xq != null) {
            c202728xq.A9I(interfaceC25177BCa);
        }
    }

    @Override // X.C74Q
    public final /* synthetic */ void CN0() {
        AbstractC1572274c.A02(this);
    }

    @Override // X.C74Q
    public final boolean Cf3() {
        return true;
    }

    @Override // X.C5RP
    public final void EFh(InterfaceC25177BCa interfaceC25177BCa) {
        C14360o3.A0B(interfaceC25177BCa, 0);
        C202728xq c202728xq = this.A02;
        if (c202728xq != null) {
            c202728xq.EFh(interfaceC25177BCa);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        canvas.save();
        if (this.A04) {
            canvas.save();
            float centerX = getBounds().centerX();
            RectF rectF = this.A0D;
            canvas.translate(centerX - rectF.centerX(), getBounds().centerY() - rectF.centerY());
            canvas.drawPath(this.A01, this.A0B);
            canvas.restore();
        }
        long currentTimeMillis = System.currentTimeMillis();
        canvas.save();
        float centerX2 = getBounds().centerX();
        RectF rectF2 = this.A0D;
        canvas.translate(centerX2 - rectF2.centerX(), getBounds().centerY() - rectF2.centerY());
        Path path = this.A0C;
        path.set(this.A01);
        Paint paint = this.A09;
        Paint paint2 = this.A08;
        paint.set(paint2);
        if (!this.A03 || currentTimeMillis < this.A00 + 2000 + 500) {
            float f = (float) (currentTimeMillis - this.A00);
            float f2 = 2500.0f - 2000.0f;
            float f3 = 0.0f - 1.0f;
            float f4 = 0.0f;
            if (f2 != 0.0f) {
                f4 = (f - 2000.0f) / f2;
            }
            paint.setAlpha(C1H4.A01(this.A0F.getInterpolation((f4 * f3) + 1.0f) * 255.0f));
            float width = (rectF2.width() + 32.0f) / rectF2.width();
            float height = (rectF2.height() + 32.0f) / rectF2.height();
            Matrix matrix = this.A07;
            matrix.reset();
            matrix.setScale(width, height, rectF2.centerX(), rectF2.centerY());
            path.transform(matrix);
            canvas.drawPath(path, paint);
        }
        canvas.restore();
        if (!this.A04 && this.A02 != null) {
            canvas.translate(getBounds().centerX() - (getIntrinsicWidth() / 2), getBounds().centerY() - (getIntrinsicHeight() / 2));
            C202728xq c202728xq = this.A02;
            if (c202728xq != null) {
                c202728xq.draw(canvas);
            }
        } else {
            canvas.translate(getBounds().centerX() - rectF2.centerX(), getBounds().centerY() - rectF2.centerY());
            canvas.save();
            canvas.drawPath(this.A01, this.A0A);
            canvas.drawPath(this.A01, paint2);
            float f5 = this.A06 / 2.0f;
            canvas.translate(rectF2.centerX() - f5, rectF2.centerY() - f5);
            Drawable drawable = this.A0E;
            if (drawable != null) {
                drawable.draw(canvas);
            }
            canvas.restore();
        }
        canvas.restore();
        this.A0G.draw(canvas);
    }

    @Override // X.C5RN
    public final List A07() {
        return AbstractC16960so.A1M(this.A02);
    }

    @Override // X.AbstractC130945vi
    public final String A09() {
        String A00 = this.A0H.BlQ().A00();
        C14360o3.A07(A00);
        return A00;
    }

    public final void A0B() {
        if (this.A0I == C05F.A00 && this.A02 != null && this.A0H.CZv()) {
            this.A00 = System.currentTimeMillis();
            invalidateSelf();
        }
    }

    @Override // X.C5RP
    public final void AHq() {
        C202728xq c202728xq = this.A02;
        if (c202728xq != null) {
            c202728xq.AHq();
        }
    }

    @Override // X.C5RR
    public final C5NL C0T() {
        return this.A0H;
    }

    @Override // X.C74Q
    public final C6RL C5E() {
        return this.A0G;
    }

    @Override // X.C74Q
    public final void FBl(boolean z, boolean z2) {
        this.A04 = z;
        if (z) {
            this.A00 = 0L;
            this.A03 = true;
            invalidateSelf();
        } else {
            A0B();
        }
        this.A0G.A01();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        C202728xq c202728xq;
        if (this.A0I.intValue() == 0 && (c202728xq = this.A02) != null) {
            return c202728xq.getIntrinsicHeight();
        }
        return C1H4.A01(this.A0J);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        C202728xq c202728xq;
        if (this.A0I.intValue() == 0 && (c202728xq = this.A02) != null) {
            return c202728xq.getIntrinsicWidth();
        }
        return C1H4.A01(this.A0K);
    }

    @Override // X.C5RP
    public final boolean isLoading() {
        C202728xq c202728xq = this.A02;
        if (c202728xq == null || c202728xq.A01 != null) {
            return false;
        }
        return true;
    }

    @Override // X.C74Q
    public final /* synthetic */ boolean CaH(UserSession userSession) {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        Drawable drawable = this.A0E;
        if (drawable != null) {
            int i5 = this.A06;
            drawable.setBounds(0, 0, i5, i5);
        }
    }
}
