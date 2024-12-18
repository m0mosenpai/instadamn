package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.9S4, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9S4 extends Drawable {
    public boolean A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final Paint A0B;
    public final Paint A0C;
    public final Paint A0D;
    public final Drawable A0G;
    public final C6RB A0H;
    public final RectF A0F = AbstractC166987dD.A0X();
    public final RectF A0E = AbstractC166987dD.A0X();

    public C9S4(Context context, UserSession userSession) {
        Resources resources = context.getResources();
        this.A08 = resources.getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material);
        this.A02 = resources.getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material);
        this.A0A = resources.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material);
        this.A09 = resources.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material);
        this.A03 = resources.getDimensionPixelSize(R.dimen.abc_edit_text_inset_bottom_material);
        this.A04 = resources.getDimensionPixelSize(R.dimen.album_music_sticker_text_vertical_padding);
        this.A01 = resources.getDimensionPixelSize(R.dimen.audition_flow_footer_text_button_min_width);
        this.A07 = resources.getDimensionPixelSize(R.dimen.accent_edge_thickness);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.afi_indicator_arrow_margin_top);
        this.A06 = AbstractC166997dE.A08(resources);
        this.A05 = resources.getDimensionPixelSize(R.dimen.afi_indicator_arrow_margin_top);
        Paint A0S = AbstractC166987dD.A0S(1);
        this.A0D = A0S;
        AbstractC166987dD.A1N(context, A0S, R.color.audio_bar_action_color_enabled);
        Paint A0S2 = AbstractC166987dD.A0S(1);
        this.A0C = A0S2;
        AbstractC166987dD.A1N(context, A0S2, R.color.chat_sticker_button_divider_color);
        float f = dimensionPixelSize;
        A0S2.setStrokeWidth(f);
        A0S2.setStyle(Paint.Style.STROKE);
        Paint A0S3 = AbstractC166987dD.A0S(1);
        this.A0B = A0S3;
        AbstractC166987dD.A1N(context, A0S3, AbstractC53242c7.A0H(context, R.attr.igds_color_creation_tools_green));
        A0S3.setStrokeWidth(f);
        A0S3.setStyle(Paint.Style.FILL_AND_STROKE);
        int A0C = AbstractC166997dE.A0C(resources);
        C6RB A0z = AbstractC166987dD.A0z(context, (this.A02 * 2) + this.A01);
        this.A0H = A0z;
        AbstractC166997dE.A1C(resources, A0z, 2131971442);
        AbstractC167017dG.A10(context, A0z, R.attr.igds_color_creation_tools_green);
        A0z.A0K(Layout.Alignment.ALIGN_CENTER);
        A0z.A0b.setLetterSpacing(0.0625f);
        A0z.A0R();
        AbstractC167017dG.A1N(userSession, context);
        AbstractC167017dG.A0z(context, A0z);
        AbstractC167007dF.A1A(A0z, A0C, 0.0f, 0.0f);
        Drawable drawable = context.getDrawable(R.drawable.circle_check_filled_8);
        if (drawable != null) {
            this.A0G = drawable;
            AbstractC166997dE.A1F(drawable.mutate(), AbstractC166997dE.A01(context));
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        Paint paint;
        C14360o3.A0B(canvas, 0);
        if (this.A00) {
            i = (int) (AbstractC166987dD.A0L(System.currentTimeMillis()) % 4);
        } else {
            i = 0;
        }
        RectF rectF = this.A0F;
        float f = this.A08;
        canvas.drawRoundRect(rectF, f, f, this.A0D);
        this.A0H.draw(canvas);
        canvas.save();
        for (int i2 = 0; i2 < 3; i2++) {
            RectF rectF2 = this.A0E;
            float f2 = this.A03;
            if (i2 == i || (i == 3 && i2 == 1)) {
                paint = this.A0B;
            } else {
                paint = this.A0C;
            }
            canvas.drawRoundRect(rectF2, f2, f2, paint);
            this.A0G.draw(canvas);
            canvas.translate(0.0f, this.A04 + this.A07);
        }
        canvas.restore();
        if (this.A00) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A0A + this.A0H.A06 + this.A09 + ((this.A07 + this.A04) * 3) + this.A02;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return (this.A02 * 2) + this.A01;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A0D.setAlpha(i);
        this.A0C.setAlpha(i);
        this.A0B.setAlpha(i);
        this.A0H.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        float f = (i + i3) / 2.0f;
        float A03 = AbstractC166987dD.A03(i2, i4, 2.0f);
        int i5 = this.A02;
        int i6 = this.A01;
        float f2 = (i5 * 2) + i6;
        float A06 = AbstractC166987dD.A06(this);
        float f3 = f - (f2 / 2.0f);
        float f4 = A03 - (A06 / 2.0f);
        C6RB c6rb = this.A0H;
        float f5 = c6rb.A0A;
        int i7 = this.A0A;
        float f6 = i7 + c6rb.A06 + this.A09;
        float descent = c6rb.A0b.descent();
        this.A0F.set(f3, f4, f2 + f3, A06 + f4);
        float f7 = i5 + f3;
        float f8 = this.A07 + f6 + f4;
        this.A0E.set(f7, f8, f7 + i6, this.A04 + f8);
        Drawable drawable = this.A0G;
        float f9 = this.A05;
        float f10 = f7 + f9;
        float f11 = f9 + f8;
        float f12 = this.A06;
        drawable.setBounds((int) f10, (int) f11, (int) (f10 + f12), (int) (f11 + f12));
        float f13 = f5 / 2.0f;
        float f14 = descent / 2.0f;
        c6rb.setBounds((int) (f - f13), (int) (i7 + f4 + f14), (int) (f + f13), (int) ((f4 + f6) - f14));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A0D.setColorFilter(colorFilter);
        this.A0C.setColorFilter(colorFilter);
        this.A0B.setColorFilter(colorFilter);
        this.A0H.setColorFilter(colorFilter);
    }
}
