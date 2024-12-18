package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.instagram.user.model.Product;

/* renamed from: X.9pV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C221079pV extends AbstractC202348xE implements Drawable.Callback, C1NJ {
    public int A00;
    public int A01;
    public C9Rz A02;
    public C6RB A03;
    public C6RB A04;
    public Product A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final Context A0B;
    public final Resources A0C;
    public final Paint A0D;
    public final RectF A0E;
    public final String A0F;

    @Override // X.C1NJ
    public final void DLP(InterfaceC59502nt interfaceC59502nt, C82183lf c82183lf) {
    }

    @Override // X.C1NJ
    public final void DLW(InterfaceC59502nt interfaceC59502nt, int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public C221079pV(Context context) {
        C14360o3.A0B(context, 1);
        this.A0B = context;
        this.A0F = "product_item_tile_sticker_black_white";
        Resources resources = context.getResources();
        this.A0C = resources;
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.album_music_sticker_album_art_size);
        this.A07 = dimensionPixelSize;
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.album_music_sticker_album_art_size);
        int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.album_music_sticker_text_vertical_padding);
        this.A09 = dimensionPixelSize3;
        int A0D = AbstractC166997dE.A0D(resources);
        this.A08 = A0D;
        this.A0E = AbstractC166987dD.A0X();
        this.A01 = -1;
        this.A0D = AbstractC166987dD.A0S(1);
        this.A06 = resources.getDimensionPixelSize(R.dimen.accent_edge_thickness);
        C6RB A0z = AbstractC166987dD.A0z(context, dimensionPixelSize2);
        A0z.A0F(-1);
        AbstractC166997dE.A1B(resources, A0z, R.dimen.action_bar_item_spacing_right);
        A0z.A0J(Typeface.SANS_SERIF, 1);
        A0z.A0G(1, "…");
        this.A04 = A0z;
        C6RB A0z2 = AbstractC166987dD.A0z(context, dimensionPixelSize2);
        A0z2.A0F(-1);
        AbstractC166997dE.A1B(resources, A0z2, R.dimen.action_bar_item_spacing_right);
        A0z2.A0J(Typeface.SANS_SERIF, 0);
        A0z2.A0G(1, "…");
        this.A03 = A0z2;
        this.A0A = Math.max(dimensionPixelSize, dimensionPixelSize2);
        this.A00 = dimensionPixelSize + dimensionPixelSize3 + this.A04.A06 + A0D + A0z2.A06 + dimensionPixelSize3;
    }

    public static final void A00(Bitmap bitmap, C221079pV c221079pV) {
        if (bitmap != null) {
            Context context = c221079pV.A0B;
            c221079pV.A01 = context.getColor(AbstractC53242c7.A04(context));
            float f = c221079pV.A06;
            int i = c221079pV.A07;
            C9Rz A00 = AbstractC23114AHd.A00(bitmap, f, i, i);
            A00.setCallback(c221079pV);
            c221079pV.A02 = A00;
            c221079pV.invalidateSelf();
        }
    }

    @Override // X.InterfaceC133125ze
    public final String C5K() {
        return this.A0F;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A00;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A0A;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A0D.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // X.C1NJ
    public final void Cza(InterfaceC59502nt interfaceC59502nt, C73033Pe c73033Pe) {
        A00(AbstractC166997dE.A0O(c73033Pe), this);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        AbstractC167007dF.A0r(canvas);
        canvas.translate(AbstractC166987dD.A0W(this).left + AbstractC166987dD.A02(this.A0A - this.A07), r2.top);
        C9Rz c9Rz = this.A02;
        if (c9Rz != null) {
            int i = this.A01;
            if (i != -1) {
                Paint paint = this.A0D;
                paint.setColor(i);
                RectF rectF = this.A0E;
                rectF.set(c9Rz.getBounds());
                float f = this.A06;
                canvas.drawRoundRect(rectF, f, f, paint);
            }
            c9Rz.draw(canvas);
            canvas.restore();
            invalidateSelf();
        }
        canvas.save();
        AbstractC167007dF.A0s(canvas, AbstractC166987dD.A0W(this));
        canvas.save();
        canvas.translate(0.0f, r4 + this.A09);
        this.A04.draw(canvas);
        canvas.save();
        AbstractC167007dF.A0u(canvas, this.A03, 0.0f, r2.A06 + this.A08);
        canvas.restore();
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        AbstractC167027dH.A0j(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        AbstractC167027dH.A0i(this, runnable);
    }
}
