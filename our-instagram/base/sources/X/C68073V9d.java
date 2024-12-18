package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import com.instagram.music.common.model.MusicOverlayStickerModel;

/* renamed from: X.V9d, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C68073V9d extends AbstractC210529Sr implements InterfaceC133125ze {
    public final Interpolator A00;
    public final W5A A01;
    public final C66303U8b A02;

    @Override // X.InterfaceC133125ze
    public final String C5K() {
        return AbstractC111324zv.A00(2733);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C14360o3.A0B(rect, 0);
        super.onBoundsChange(rect);
        this.A02.setBounds(rect);
    }

    public C68073V9d(Context context, MusicOverlayStickerModel musicOverlayStickerModel, C70993Wm9 c70993Wm9, int i, int i2, boolean z) {
        super(context, musicOverlayStickerModel, c70993Wm9, EnumC138556Pl.A0A, 0.8f);
        this.A00 = new DecelerateInterpolator(2.0f);
        this.A01 = new W5A(c70993Wm9, 0, 0, 750);
        float A0A = ((i2 * AbstractC13880nE.A0A(context)) / 1080.0f) * 1.2f;
        C66303U8b c66303U8b = new C66303U8b(c70993Wm9, A0A, (int) (0.25f * A0A), z);
        this.A02 = c66303U8b;
        if (c66303U8b.A08 != 4) {
            c66303U8b.A08 = 4;
            C66303U8b.A01(c66303U8b);
        }
        Typeface A02 = AbstractC15960qq.A00(context).A02(EnumC15950qp.A0z);
        TextPaint textPaint = c66303U8b.A0I;
        textPaint.setTypeface(A02);
        textPaint.setFakeBoldText(false);
        c66303U8b.A06 = VW9.A00(textPaint);
        c66303U8b.invalidateSelf();
        textPaint.setTextSize(A0A);
        c66303U8b.A06 = VW9.A00(textPaint);
        c66303U8b.invalidateSelf();
        c66303U8b.A05(i);
        c66303U8b.A02 = 0.5f;
        c66303U8b.invalidateSelf();
        c66303U8b.A03 = 0.85f;
        c66303U8b.invalidateSelf();
    }

    @Override // X.AbstractC210529Sr
    public final void A01(Canvas canvas, int i) {
        float f;
        W5A w5a = this.A01;
        w5a.A02(i);
        int i2 = w5a.A01;
        Integer num = w5a.A02;
        if (num != null) {
            if (num == C05F.A01) {
                f = 0.0f;
            } else {
                f = w5a.A00;
                if (0.0f > f || f > 1.0f) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("KaraokeLyricsStickerDrawable: invalid progress ");
                    sb.append(f);
                    sb.append(" for frame time ");
                    sb.append(i);
                    throw AbstractC58320PtC.A0o(" in drawFrame()", sb);
                }
            }
            float interpolation = this.A00.getInterpolation(f);
            C66303U8b c66303U8b = this.A02;
            c66303U8b.A04((int) AbstractC13600mm.A02(interpolation, 0.0f, 1.0f, c66303U8b.A03(i2), c66303U8b.A03(i2 + 1)));
            c66303U8b.draw(canvas);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.BEc
    public final int ApI() {
        C66303U8b c66303U8b = this.A02;
        return ((c66303U8b.A07 & 255) << 24) | (c66303U8b.A0I.getColor() & 16777215);
    }

    @Override // X.C5RR
    public final /* bridge */ /* synthetic */ C5NL C0T() {
        EnumC138556Pl enumC138556Pl = this.A09;
        return new C24025AlH(this.A08.A00, super.A01, null, enumC138556Pl, ApI());
    }

    @Override // X.BEc
    public final void ERe(int i) {
        this.A02.A05(i);
        invalidateSelf();
    }

    @Override // X.AbstractC210529Sr, android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        C66303U8b c66303U8b = this.A02;
        return (c66303U8b.A06 * 12) + (c66303U8b.A0G * 2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A02.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A02.setColorFilter(colorFilter);
    }
}
