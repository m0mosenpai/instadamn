package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class U8X extends Drawable {
    public static final C66380UEo A0I = new C66380UEo(0);
    public float A00;
    public float A01;
    public float A02;
    public C65726Tt0 A03;
    public boolean A04;
    public boolean A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final Paint A0A;
    public final Paint A0B;
    public final RectF A0C;
    public final RectF A0D;
    public final Drawable A0E;
    public final Drawable A0F;
    public final Drawable A0G;
    public final Drawable A0H;

    public U8X(Context context) {
        Drawable drawable = context.getDrawable(R.drawable.ig_msgr_power_ups_giftbox_bow_knot);
        C14360o3.A0A(drawable);
        this.A0E = drawable;
        Drawable drawable2 = context.getDrawable(R.drawable.ig_msgr_power_ups_giftbox_bow_left);
        C14360o3.A0A(drawable2);
        this.A0F = drawable2;
        Drawable drawable3 = context.getDrawable(R.drawable.ig_msgr_power_ups_giftbox_ribbon_horiz);
        C14360o3.A0A(drawable3);
        this.A0G = drawable3;
        Drawable drawable4 = context.getDrawable(R.drawable.ig_msgr_power_ups_giftbox_ribbon_horiz);
        C14360o3.A0A(drawable4);
        this.A0H = drawable4;
        this.A09 = context.getResources().getDimensionPixelOffset(R.dimen.abc_button_inset_vertical_material);
        this.A06 = context.getResources().getDimensionPixelOffset(R.dimen.abc_action_bar_subtitle_top_margin_material);
        this.A07 = context.getResources().getDimensionPixelOffset(R.dimen.clips_viewer_media_info_ufi_button_side_margin);
        this.A08 = context.getResources().getDimensionPixelOffset(R.dimen.abc_control_corner_material);
        Paint paint = new Paint(1);
        AbstractC166987dD.A1N(context, paint, R.color.msg_powerups_giftbox_lid);
        this.A0B = paint;
        Paint paint2 = new Paint(1);
        AbstractC166987dD.A1N(context, paint2, R.color.msg_powerups_giftbox_lid_depth);
        this.A0A = paint2;
        this.A0C = new RectF();
        this.A0D = new RectF();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        if (this.A04) {
            this.A04 = false;
            int A0F = AbstractC166997dE.A0F(this);
            int centerY = getBounds().centerY();
            AbstractC65702TsY.A0x(this.A0C, this);
            this.A05 = true;
            Drawable drawable = this.A0E;
            int i = this.A06 + centerY;
            int intrinsicWidth = A0F - (drawable.getIntrinsicWidth() / 2);
            int intrinsicHeight = i - (drawable.getIntrinsicHeight() / 2);
            drawable.setBounds(intrinsicWidth, intrinsicHeight, drawable.getIntrinsicWidth() + intrinsicWidth, drawable.getIntrinsicHeight() + intrinsicHeight);
            Drawable drawable2 = this.A0F;
            int i2 = this.A07 + A0F;
            int i3 = this.A08 + centerY;
            int intrinsicWidth2 = i2 - (drawable2.getIntrinsicWidth() / 2);
            int intrinsicHeight2 = i3 - (drawable2.getIntrinsicHeight() / 2);
            drawable2.setBounds(intrinsicWidth2, intrinsicHeight2, drawable2.getIntrinsicWidth() + intrinsicWidth2, drawable2.getIntrinsicHeight() + intrinsicHeight2);
            int i4 = this.A09;
            int i5 = centerY - (i4 / 2);
            int i6 = i4 + i5;
            this.A0G.setBounds(getBounds().left, i5, getBounds().right, i6);
            int A0G = A0F - (AbstractC166997dE.A0G(this) / 2);
            this.A0H.setBounds(A0G, i5, AbstractC166997dE.A0G(this) + A0G, i6);
        }
        float f = this.A02;
        if (f > 0.0f) {
            if (this.A05) {
                RectF rectF = this.A0D;
                RectF rectF2 = this.A0C;
                float f2 = rectF2.left;
                float f3 = rectF2.bottom;
                rectF.set(f2, f3 - (this.A01 * 2.0f), rectF2.right, f3 + f);
                this.A05 = false;
            }
            RectF rectF3 = this.A0D;
            float f4 = this.A01;
            canvas.drawRoundRect(rectF3, f4, f4, this.A0A);
        }
        RectF rectF4 = this.A0C;
        float f5 = this.A01;
        canvas.drawRoundRect(rectF4, f5, f5, this.A0B);
        this.A0G.draw(canvas);
        float A0F2 = AbstractC166997dE.A0F(this);
        float A00 = AbstractC167007dF.A00(this);
        int save = canvas.save();
        canvas.rotate(90.0f, A0F2, A00);
        try {
            this.A0H.draw(canvas);
            canvas.restoreToCount(save);
            float A02 = C17s.A02(this.A00, -1.0f, 1.0f) * 15.0f;
            Drawable drawable3 = this.A0F;
            C14360o3.A07(drawable3.getBounds());
            float width = r2.left + (r2.width() * 0.714f);
            float height = r2.top + (r2.height() * 0.31f);
            int save2 = canvas.save();
            try {
                canvas.rotate(A02, width, height);
                drawable3.draw(canvas);
                canvas.restoreToCount(save2);
                save2 = canvas.save();
                canvas.scale(-1.0f, 1.0f, AbstractC166997dE.A0F(this), AbstractC167007dF.A00(this));
                canvas.rotate(A02, width, height);
                drawable3.draw(canvas);
                canvas.restoreToCount(save2);
                this.A0E.draw(canvas);
            } catch (Throwable th) {
                canvas.restoreToCount(save2);
                throw th;
            }
        } catch (Throwable th2) {
            canvas.restoreToCount(save);
            throw th2;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C14360o3.A0B(rect, 0);
        super.onBoundsChange(rect);
        this.A04 = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
