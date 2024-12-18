package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import com.facebook.R;
import java.util.List;

/* renamed from: X.9hk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C216279hk extends C5RN implements InterfaceC180487zc {
    public float A00;
    public float A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final Drawable A09;
    public final ShapeDrawable A0A;
    public final ShapeDrawable A0B;
    public final ShapeDrawable A0C;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        float f = this.A00;
        if (f > 1.0f) {
            f = (f + 1.0f) / 2.0f;
        }
        canvas.save();
        canvas.scale(f, f, AbstractC166997dE.A0F(this), AbstractC167007dF.A00(this));
        Drawable drawable = this.A09;
        drawable.setAlpha((int) AbstractC13600mm.A02(this.A00, 0.0f, 1.0f, 0.0f, 255.0f));
        drawable.draw(canvas);
        canvas.restore();
        float A0E = (this.A01 - AbstractC166987dD.A0E(drawable)) - this.A02;
        ShapeDrawable shapeDrawable = this.A0A;
        float A0E2 = AbstractC166987dD.A0E(drawable);
        float f2 = drawable.getBounds().top;
        float A0E3 = AbstractC166987dD.A0E(drawable) + this.A03;
        float A0E4 = AbstractC166987dD.A0E(drawable) + (A0E / 1.2f);
        if (A0E3 > A0E4) {
            A0E3 = A0E4;
        }
        A01(canvas, shapeDrawable, A0E2, f2, A0E3, drawable.getBounds().top + this.A04);
        float f3 = drawable.getBounds().top;
        ShapeDrawable shapeDrawable2 = this.A0B;
        float A0E5 = AbstractC166987dD.A0E(drawable);
        float f4 = drawable.getBounds().top;
        float A0E6 = AbstractC166987dD.A0E(drawable) + this.A05;
        float f5 = drawable.getBounds().top + this.A06;
        float f6 = drawable.getBounds().top - (f3 / 1.2f);
        if (f5 < f6) {
            f5 = f6;
        }
        A01(canvas, shapeDrawable2, A0E5, f4, A0E6, f5);
        float A0E7 = AbstractC166987dD.A0E(drawable);
        ShapeDrawable shapeDrawable3 = this.A0C;
        float A0E8 = AbstractC166987dD.A0E(drawable);
        float f7 = drawable.getBounds().top;
        float A0E9 = AbstractC166987dD.A0E(drawable) + this.A07;
        float A0E10 = AbstractC166987dD.A0E(drawable) - (A0E7 / 1.2f);
        if (A0E9 < A0E10) {
            A0E9 = A0E10;
        }
        A01(canvas, shapeDrawable3, A0E8, f7, A0E9, drawable.getBounds().top + this.A08);
    }

    public static final ShapeDrawable A00(Context context, int i, int i2) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.setIntrinsicWidth(i);
        shapeDrawable.setIntrinsicHeight(i);
        Paint paint = shapeDrawable.getPaint();
        AbstractC166987dD.A1N(context, paint, i2);
        AbstractC166987dD.A1R(paint);
        paint.setAntiAlias(true);
        shapeDrawable.setBounds(new Rect(0, 0, i, i));
        return shapeDrawable;
    }

    private final void A01(Canvas canvas, Drawable drawable, float f, float f2, float f3, float f4) {
        float f5 = this.A00;
        float f6 = 1.0f - 0.0f;
        float f7 = f3 - f;
        float f8 = 0.0f;
        if (f6 != 0.0f) {
            f8 = (f5 - 0.0f) / f6;
        }
        float f9 = (f8 * f7) + f;
        float f10 = f4 - f2;
        float f11 = 0.0f;
        if (f6 != 0.0f) {
            f11 = (f5 - 0.0f) / f6;
        }
        drawable.setAlpha((int) AbstractC13600mm.A02(f5, 0.0f, 1.0f, 0.0f, 255.0f));
        canvas.save();
        AbstractC167007dF.A0u(canvas, drawable, f9, (f11 * f10) + f2);
    }

    @Override // X.C5RN
    public final List A07() {
        return AbstractC16960so.A1N(this.A09, this.A0A, this.A0B, this.A0C);
    }

    @Override // X.InterfaceC180487zc
    public final void EPj(float f) {
        this.A00 = f;
        invalidateSelf();
    }

    public C216279hk(Context context) {
        Drawable drawable = context.getDrawable(R.drawable.nux_sticker_nux_sticker);
        if (drawable != null) {
            AbstractC166997dE.A1F(drawable, -1);
            this.A09 = drawable;
            int A0D = AbstractC167017dG.A0D(context);
            this.A02 = A0D;
            this.A03 = context.getResources().getDimensionPixelSize(R.dimen.audition_flow_footer_text_button_min_width);
            this.A04 = AbstractC166997dE.A0B(context.getResources());
            this.A05 = AbstractC167017dG.A0F(context);
            this.A06 = context.getResources().getDimensionPixelSize(R.dimen.album_rounded_corner_overlay_padding);
            this.A07 = context.getResources().getDimensionPixelSize(R.dimen.challenge_winner_v2_3_winner2_mention_margin_top);
            this.A08 = context.getResources().getDimensionPixelSize(R.dimen.album_music_sticker_text_vertical_padding);
            this.A0A = A00(context, A0D, R.color.activator_card_progress_bad);
            this.A0B = A00(context, A0D, R.color.igds_creation_tools_pink);
            this.A0C = A00(context, A0D, R.color.igds_creation_tools_purple);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        Drawable drawable = this.A09;
        float A06 = AbstractC166987dD.A06(drawable) / drawable.getIntrinsicWidth();
        float f = i3 - i;
        this.A01 = f;
        float f2 = 0.5f * f;
        float f3 = (f - f2) / 2.0f;
        float f4 = ((i4 - i2) - (f2 * A06)) / 2.0f;
        drawable.setBounds((int) (i + f3), (int) (i2 + f4), (int) (i3 - f3), (int) (i4 - f4));
    }
}
