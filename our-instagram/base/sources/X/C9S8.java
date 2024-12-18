package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.9S8, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9S8 extends Drawable {
    public float A00;
    public float A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final Context A05;
    public final Paint A06;
    public final RectF A07;
    public final List A08;
    public final float A09;
    public final float A0A;
    public final float A0B;
    public final float A0C;
    public final Resources A0D;
    public final Paint A0E;
    public final Paint A0F;
    public final RectF A0G;
    public final Drawable A0H;
    public final AbstractC59962oe A0I;
    public final UserSession A0J;

    public C9S8(Context context, AbstractC59962oe abstractC59962oe, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A0J = userSession;
        this.A05 = context;
        this.A0I = abstractC59962oe;
        Resources A0M = AbstractC166997dE.A0M(context);
        this.A0D = A0M;
        this.A04 = A0M.getDimensionPixelSize(R.dimen.bottom_button_layout_height_with_secondary);
        this.A03 = A0M.getDimensionPixelSize(R.dimen.bottom_button_layout_height_with_secondary);
        int dimensionPixelSize = A0M.getDimensionPixelSize(R.dimen.abc_star_medium);
        this.A02 = dimensionPixelSize;
        this.A09 = AbstractC166987dD.A04(A0M, R.dimen.container_height);
        this.A0A = AbstractC166987dD.A04(A0M, R.dimen.abc_dropdownitem_icon_width);
        this.A0B = AbstractC166997dE.A0C(A0M);
        this.A0C = AbstractC166987dD.A04(A0M, R.dimen.abc_dialog_padding_material);
        RectF A0X = AbstractC166987dD.A0X();
        this.A0G = A0X;
        RectF A0X2 = AbstractC166987dD.A0X();
        this.A07 = A0X2;
        this.A0E = AbstractC166987dD.A0S(1);
        this.A06 = AbstractC166987dD.A0S(1);
        this.A0F = AbstractC166987dD.A0S(1);
        this.A08 = AbstractC166987dD.A1E();
        Drawable drawable = context.getDrawable(R.drawable.polaroid_sticker_tray_image_shadow);
        this.A0H = drawable;
        float A06 = AbstractC166997dE.A06(A0M);
        float f = dimensionPixelSize;
        float f2 = f + A06;
        A0X.set(A06, A06, f2, f2);
        A0X2.set(0.0f, 0.0f, f + (2.0f * A06), f2 + (3.5f * A06));
        if (drawable != null) {
            Rect A0U = AbstractC166987dD.A0U();
            A0X.roundOut(A0U);
            drawable.setBounds(A0U);
        }
        if (abstractC59962oe != null) {
            C189088Yy c189088Yy = new C189088Yy(abstractC59962oe.requireActivity(), AbstractC018607g.A00(abstractC59962oe), null, EnumC188968Ym.A04, userSession, new C215939h9(1, new C8SF(context, userSession, C05F.A00, dimensionPixelSize, C1H4.A01(f / 0.5625f), false), this, new C23623AdI(this, A06)), Integer.MAX_VALUE, 0, -1L, -1L, true, false, false);
            c189088Yy.A01 = 2;
            c189088Yy.A01(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        canvas.save();
        canvas.translate(this.A00 + this.A0B, this.A01 + this.A0C);
        canvas.rotate(-8.0f);
        A00(canvas);
        Paint paint = this.A06;
        Context context = this.A05;
        AbstractC166987dD.A1N(context, paint, R.color.design_dark_default_color_on_background);
        paint.setAlpha(255);
        RectF rectF = this.A07;
        canvas.drawRoundRect(rectF, 0.0f, 0.0f, paint);
        A01(canvas, 0);
        canvas.restore();
        canvas.save();
        canvas.translate(this.A00 + this.A09, this.A01 + this.A0A);
        canvas.rotate(12.0f);
        A00(canvas);
        AbstractC166987dD.A1N(context, paint, R.color.design_dark_default_color_on_background);
        paint.setAlpha(255);
        canvas.drawRoundRect(rectF, 0.0f, 0.0f, paint);
        A01(canvas, 1);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        float A03 = AbstractC166987dD.A03(i2, i4, 2.0f);
        this.A00 = ((i + i3) / 2.0f) - (this.A04 / 2.0f);
        this.A01 = A03 - (this.A03 / 2.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    private final void A00(Canvas canvas) {
        Paint paint = this.A0F;
        AbstractC166987dD.A1N(this.A05, paint, R.color.design_dark_default_color_on_background);
        paint.setAlpha(255);
        paint.setShadowLayer(30.0f, 0.0f, 0.0f, 1493172224);
        canvas.drawRoundRect(this.A07, 0.0f, 0.0f, paint);
    }

    private final void A01(Canvas canvas, int i) {
        List list = this.A08;
        if (list.size() >= 2 && i < list.size()) {
            ((Drawable) list.get(i)).setAlpha(255);
            ((Drawable) list.get(i)).draw(canvas);
            Drawable drawable = this.A0H;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Paint paint = this.A0E;
        AbstractC166987dD.A1N(this.A05, paint, R.color.black);
        paint.setAlpha(255);
        canvas.drawRoundRect(this.A0G, 0.0f, 0.0f, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A03;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A04;
    }
}
