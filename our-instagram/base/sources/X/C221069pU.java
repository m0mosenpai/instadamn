package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.instagram.user.model.Product;

/* renamed from: X.9pU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C221069pU extends AbstractC202348xE implements Drawable.Callback, C1NJ {
    public int A00;
    public C9Rz A01;
    public Product A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final Context A08;
    public final Paint A09;
    public final RectF A0A;
    public final C9S7 A0B;
    public final String A0C;
    public final Resources A0D;

    public C221069pU(Context context, String str) {
        C14360o3.A0B(context, 1);
        this.A08 = context;
        this.A0C = str;
        Resources resources = context.getResources();
        this.A0D = resources;
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.music_sticker_max_width);
        this.A00 = -1;
        this.A06 = -3355444;
        this.A0A = AbstractC166987dD.A0X();
        this.A09 = AbstractC166987dD.A0S(1);
        this.A03 = resources.getDimensionPixelSize(R.dimen.accent_edge_thickness);
        this.A04 = AbstractC166997dE.A07(resources);
        this.A05 = resources.getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
        this.A07 = resources.getDimensionPixelSize(R.dimen.product_list_cell_sticker_stroke_width);
        this.A0B = new C9S7(context, this.A0C, dimensionPixelSize);
    }

    @Override // X.C1NJ
    public final void DLP(InterfaceC59502nt interfaceC59502nt, C82183lf c82183lf) {
    }

    @Override // X.C1NJ
    public final void DLW(InterfaceC59502nt interfaceC59502nt, int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        this.A0B.draw(canvas);
        C9Rz c9Rz = this.A01;
        if (c9Rz != null) {
            canvas.save();
            float f = this.A04;
            canvas.translate(f, f);
            int i = this.A00;
            if (i != -1) {
                Paint paint = this.A09;
                paint.setColor(i);
                RectF rectF = this.A0A;
                rectF.set(c9Rz.getBounds());
                float f2 = this.A03;
                canvas.drawRoundRect(rectF, f2, f2, paint);
            }
            int i2 = this.A07;
            int i3 = this.A06;
            if (c9Rz.A02 == null) {
                Paint A0P = AbstractC166997dE.A0P();
                c9Rz.A02 = A0P;
                A0P.setStyle(Paint.Style.STROKE);
            }
            Paint paint2 = c9Rz.A02;
            if (paint2 != null) {
                paint2.setColor(i3);
            }
            Paint paint3 = c9Rz.A02;
            if (paint3 != null) {
                paint3.setStrokeWidth(i2);
            }
            c9Rz.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C14360o3.A0B(rect, 0);
        super.onBoundsChange(rect);
        this.A0B.onBoundsChange(rect);
    }

    @Override // X.InterfaceC133125ze
    public final String C5K() {
        return this.A0C;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A0B.A05;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A0B.A00;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A0B.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A0B.setColorFilter(colorFilter);
    }

    @Override // X.C1NJ
    public final void Cza(InterfaceC59502nt interfaceC59502nt, C73033Pe c73033Pe) {
        Bitmap A0O = AbstractC166997dE.A0O(c73033Pe);
        if (A0O != null) {
            float f = this.A03;
            int i = this.A05;
            C9Rz A00 = AbstractC23114AHd.A00(A0O, f, i, i);
            A00.setCallback(this);
            this.A01 = A00;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.A0B.setBounds(i, i2, i3, i4);
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
