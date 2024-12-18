package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.9SG, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9SG extends Drawable implements Drawable.Callback, C1NJ {
    public float A00;
    public float A01;
    public Drawable A02;
    public C73053Pg A03;
    public final Paint A06;
    public final Paint A05 = AbstractC166987dD.A0S(1);
    public final Paint A04 = AbstractC166987dD.A0S(1);

    public final void A00(ImageUrl imageUrl) {
        this.A03 = null;
        this.A02 = null;
        invalidateSelf();
        AbstractC167017dG.A1K(this, C25821No.A00(), imageUrl, null);
    }

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

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // X.C1NJ
    public final void Cza(InterfaceC59502nt interfaceC59502nt, C73033Pe c73033Pe) {
        Bitmap bitmap = c73033Pe.A01;
        C18C.A0E(AbstractC167007dF.A1W(bitmap));
        C14360o3.A0B(bitmap, 1);
        C73053Pg c73053Pg = new C73053Pg(bitmap, false);
        this.A03 = c73053Pg;
        c73053Pg.setCallback(this);
        this.A03.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        C73053Pg c73053Pg = this.A03;
        if (c73053Pg != null) {
            c73053Pg.setAlpha(i);
        }
        Drawable drawable = this.A02;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
        this.A06.setAlpha(i);
        this.A05.setAlpha(i);
        this.A04.setAlpha(i);
    }

    public C9SG(Context context) {
        Paint A0S = AbstractC166987dD.A0S(1);
        this.A06 = A0S;
        AbstractC166987dD.A1R(A0S);
        AbstractC166987dD.A1N(context, A0S, R.color.grey_1);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int min = Math.min(bounds.width(), bounds.height());
        if (this.A01 > 0.0f) {
            canvas.drawCircle(bounds.exactCenterX(), bounds.exactCenterY(), min / 2.0f, this.A05);
        }
        if (this.A00 > 0.0f) {
            canvas.drawCircle(bounds.exactCenterX(), bounds.exactCenterY(), ((min / 2.0f) - this.A01) + this.A00, this.A04);
        }
        Drawable drawable = this.A03;
        if (drawable == null && (drawable = this.A02) == null) {
            canvas.drawCircle(bounds.exactCenterX(), bounds.exactCenterY(), ((min / 2.0f) - this.A01) + this.A00, this.A06);
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        float f = min - (this.A01 * 2.0f);
        float max = Math.max(f / intrinsicWidth, f / intrinsicHeight);
        canvas.save();
        float f2 = bounds.left;
        float f3 = this.A01;
        canvas.translate(f2 + f3, bounds.top + f3);
        canvas.scale(max, max);
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
