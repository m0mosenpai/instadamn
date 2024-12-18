package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Jj1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44362Jj1 extends Drawable implements Drawable.Callback {
    public Drawable A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final C23597Acr A04;
    public final C3PR A05;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        Drawable drawable = this.A00;
        if (drawable != null) {
            int i = this.A03;
            int i2 = this.A01;
            int i3 = (i - i2) / 2;
            int i4 = this.A02;
            int i5 = (int) (i4 * 0.4d);
            drawable.setBounds(i3, i5, i2 + i3, i2 + i5);
            drawable.draw(canvas);
            C3PR c3pr = this.A05;
            if (c3pr != null) {
                c3pr.setBounds(0, 0, i, i4);
                c3pr.draw(canvas);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return ((int) (this.A02 * 0.4d)) + this.A01;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A03;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }

    public C44362Jj1(Context context, ImageUrl imageUrl) {
        C3PR c3pr;
        this.A01 = context.getResources().getDimensionPixelSize(R.dimen.appreciation_reels_grid_item_width);
        this.A03 = context.getResources().getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_width);
        this.A02 = context.getResources().getDimensionPixelSize(R.dimen.abc_list_item_height_large_material);
        Drawable A00 = AbstractC56412ia.A00(context.getResources(), R.drawable.wave_hands_nux_asset_hands_multiple_nux);
        if (A00 instanceof C3PR) {
            c3pr = (C3PR) A00;
        } else {
            c3pr = null;
        }
        this.A05 = c3pr;
        C23597Acr c23597Acr = new C23597Acr(1, context, this);
        this.A04 = c23597Acr;
        AbstractC167017dG.A1K(c23597Acr, C25821No.A00(), imageUrl, "profile_poke_nux");
        if (c3pr != null) {
            c3pr.A01(new C48542Ldf(this, 0));
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
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
