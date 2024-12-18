package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.facebook.R;

/* renamed from: X.9Su, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C210559Su extends Drawable implements BD2 {
    public Drawable A00;
    public Integer A01;
    public float A02;
    public final Context A03;
    public final Paint A04;

    @Override // X.BD2
    public final float Arr() {
        return 0.0f;
    }

    @Override // X.BD2
    public final void ESD(float f) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        if (this.A01 != C05F.A0C) {
            canvas.drawCircle(getBounds().exactCenterX(), getBounds().exactCenterY(), this.A02, this.A04);
            Drawable drawable = this.A00;
            if (drawable != null) {
                drawable.draw(canvas);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C14360o3.A0B(rect, 0);
        this.A02 = Math.min(AbstractC166997dE.A0G(this), AbstractC166997dE.A0H(this)) / 5.0f;
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setBounds(A00(rect));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public C210559Su(Context context) {
        this.A03 = context;
        Paint A0R = AbstractC166987dD.A0R();
        AbstractC166987dD.A1N(context, A0R, AbstractC53242c7.A0H(context, R.attr.igds_color_secondary_button_on_media));
        this.A04 = A0R;
        this.A01 = C05F.A0C;
        this.A01 = C05F.A00;
        Rect A00 = A00(AbstractC166987dD.A0W(this));
        Context context2 = this.A03;
        Drawable drawable = context2.getDrawable(R.drawable.instagram_pause_pano_filled_24);
        if (drawable != null) {
            AbstractC166997dE.A1F(drawable, AbstractC166997dE.A01(context2));
            drawable.setBounds(A00);
            this.A00 = drawable;
            invalidateSelf();
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public static final Rect A00(Rect rect) {
        int min = Math.min(rect.height(), rect.width()) / 5;
        int height = rect.top + ((rect.height() - min) / 2);
        int width = rect.left + ((rect.width() - min) / 2);
        return AbstractC166987dD.A0V(width, height, width + min, min + height);
    }
}
