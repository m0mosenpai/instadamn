package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.facebook.R;
import com.instagram.user.model.User;

/* renamed from: X.8xf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C202618xf extends Drawable implements C5RQ, InterfaceC133125ze {
    public int A00;
    public C210419Sg A01;
    public StaticLayout A02;
    public final float A03;
    public final float A04;
    public final C1815983m A05;
    public final User A06;
    public final String A07;
    public final float A08;
    public final float A09;
    public final float A0A;
    public final float A0B;
    public final int A0C;
    public final Drawable A0D;
    public final TextPaint A0E;
    public final C6RB A0F;
    public final C6RB A0G;

    @Override // X.C5RQ
    public final /* synthetic */ void Egu() {
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        C14360o3.A07(getBounds());
        int save = canvas.save();
        float f = this.A08;
        float f2 = 1.0f / f;
        canvas.translate(r6.left, r6.top);
        canvas.scale(f2, f2);
        float f3 = this.A03 * f;
        canvas.save();
        float f4 = this.A09;
        Drawable drawable = this.A0D;
        C14360o3.A0A(drawable);
        canvas.translate(f4 - (drawable.getIntrinsicWidth() / 4.0f), f4 - (drawable.getIntrinsicHeight() / 4.0f));
        drawable.draw(canvas);
        canvas.restore();
        canvas.save();
        C6RB c6rb = this.A0G;
        float f5 = (f3 - f4) - c6rb.A06;
        canvas.translate(f4, f5);
        c6rb.draw(canvas);
        StaticLayout staticLayout = this.A02;
        if (staticLayout != null) {
            canvas.translate(0.0f, (-staticLayout.getHeight()) - this.A0B);
            staticLayout.draw(canvas);
        }
        canvas.restore();
        canvas.save();
        C6RB c6rb2 = this.A0F;
        c6rb2.A0M(C23831Eq.A02(this.A0C - this.A00));
        canvas.translate((this.A0A - c6rb2.A0A) - f4, f4);
        c6rb2.draw(canvas);
        canvas.restore();
        canvas.restoreToCount(save);
        C210419Sg c210419Sg = this.A01;
        if (c210419Sg != null) {
            c210419Sg.A00(canvas, (f * r6.left) + f4 + c6rb.A0A, (f * r6.top) + f5, f2);
        }
    }

    @Override // X.C5RQ
    public final int getDurationInMs() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C14360o3.A0B(rect, 0);
        super.onBoundsChange(rect);
    }

    public C202618xf(Context context, C1815983m c1815983m, boolean z) {
        float f;
        int i;
        C14360o3.A0B(c1815983m, 3);
        this.A05 = c1815983m;
        User user = c1815983m.A04;
        if (user != null) {
            this.A06 = user;
            String str = c1815983m.A06;
            if (str != null) {
                this.A07 = str;
                String username = user.getUsername();
                this.A0C = c1815983m.A03;
                TextPaint textPaint = new TextPaint(1);
                this.A0E = textPaint;
                boolean z2 = c1815983m.A08;
                float f2 = z2 ? 1.0f : 0.67f;
                this.A08 = f2;
                float f3 = c1815983m.A02;
                if (!z2 && !z) {
                    f = 0.5625f;
                } else {
                    f = c1815983m.A00;
                }
                this.A03 = f3 / f;
                this.A04 = f3;
                float f4 = f2 * f3;
                this.A0A = f4;
                Resources resources = context.getResources();
                float dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.action_bar_item_spacing_right);
                this.A09 = dimensionPixelSize;
                this.A0B = resources.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material);
                int color = context.getColor(R.color.audio_bar_action_color_enabled);
                int color2 = context.getColor(R.color.black_50_transparent);
                Typeface A02 = AbstractC15960qq.A00(context).A02(EnumC15950qp.A13);
                textPaint.setTextSize(resources.getDimension(R.dimen.action_bar_item_spacing_right));
                textPaint.setTypeface(A02);
                textPaint.setColor(color);
                textPaint.setShadowLayer(5.0f, 0.0f, 0.0f, color2);
                int i2 = (int) f3;
                C6RB c6rb = new C6RB(context, i2);
                this.A0G = c6rb;
                c6rb.A0M(username);
                c6rb.A0A(resources.getDimension(R.dimen.action_bar_item_spacing_right));
                c6rb.A0F(color);
                c6rb.A0D(5.0f, 0.0f, 0.0f, color2);
                c6rb.A0N("…", 1, true);
                if (c1815983m.A09 && !c1815983m.A07 && user.A1g()) {
                    String string = context.getString(2131976886);
                    C14360o3.A07(string);
                    C210419Sg c210419Sg = new C210419Sg(context, string, i2);
                    this.A01 = c210419Sg;
                    float dimension = resources.getDimension(R.dimen.action_bar_item_spacing_right);
                    c210419Sg.A01.A0A(dimension);
                    c210419Sg.A02.A0A(dimension);
                    C210419Sg c210419Sg2 = this.A01;
                    C14360o3.A0A(c210419Sg2);
                    int color3 = context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_secondary_text_on_media));
                    c210419Sg2.A01.A0F(color3);
                    c210419Sg2.A02.A0F(color3);
                }
                float f5 = f4 - (2.0f * dimensionPixelSize);
                int i3 = (int) f5;
                C210419Sg c210419Sg3 = this.A01;
                if (c210419Sg3 != null) {
                    i = c210419Sg3.getIntrinsicWidth();
                } else {
                    i = 0;
                }
                c6rb.A0E(i3 - i);
                C6RB c6rb2 = new C6RB(context, i2);
                this.A0F = c6rb2;
                c6rb2.A0A(resources.getDimension(R.dimen.action_bar_item_spacing_right));
                c6rb2.A0F(color);
                c6rb2.A0I(A02);
                c6rb2.A0D(5.0f, 0.0f, 0.0f, color2);
                Drawable drawable = context.getDrawable(R.drawable.instagram_play_filled_32);
                this.A0D = drawable;
                C14360o3.A0A(drawable);
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                String str2 = c1815983m.A05;
                C14360o3.A07(str2);
                if (str2.length() != 0) {
                    Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                    C57482kN c57482kN = new C57482kN(alignment, textPaint, null, 0.0f, 1.0f, Math.round(f5), true);
                    String A022 = AbstractC85253rG.A02(c57482kN, str2, "…", 2);
                    C14360o3.A07(A022);
                    this.A02 = new StaticLayout(A022, textPaint, c57482kN.A00, alignment, 1.0f, 0.0f, true);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.C5RR
    public final C5NL C0T() {
        return this.A05;
    }

    @Override // X.InterfaceC133125ze
    public final String C5K() {
        return AnonymousClass001.A0R("story-igtv-metadata-sticker-", this.A07);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return Math.round(this.A03);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.round(this.A04);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A0E.setAlpha(i);
        this.A0G.setAlpha(i);
        C210419Sg c210419Sg = this.A01;
        if (c210419Sg != null) {
            c210419Sg.setAlpha(i);
        }
        Drawable drawable = this.A0D;
        C14360o3.A0A(drawable);
        drawable.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A0E.setColorFilter(colorFilter);
        this.A0G.setColorFilter(colorFilter);
        C210419Sg c210419Sg = this.A01;
        if (c210419Sg != null) {
            c210419Sg.setColorFilter(colorFilter);
        }
        Drawable drawable = this.A0D;
        C14360o3.A0A(drawable);
        drawable.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // X.C5RQ
    public final void EUp(int i, int i2) {
        this.A00 = i;
    }
}
