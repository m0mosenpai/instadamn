package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.facebook.R;

/* renamed from: X.7vP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C177907vP extends Drawable implements Drawable.Callback {
    public int A00;
    public int A01;
    public int A02;
    public String A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final Paint A07 = new Paint(1);
    public final Drawable A08;
    public final C177917vQ A09;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        C14360o3.A0B(canvas, 0);
        C14360o3.A07(getBounds());
        canvas.save();
        canvas.translate(r2.left, r2.top);
        this.A09.draw(canvas);
        float width = r2.width() / 2.0f;
        Paint paint = this.A07;
        paint.setStyle(Paint.Style.FILL);
        if (this.A03 != null) {
            i = this.A05;
        } else {
            i = this.A04;
        }
        paint.setColor(i);
        canvas.drawCircle(width, width, width, paint);
        paint.setColor(-1);
        int i2 = this.A02;
        String str = this.A03;
        if (str != null && Integer.parseInt(str) >= 10) {
            i2 = this.A01;
        }
        float f = i2;
        paint.setTextSize(f);
        String str2 = this.A03;
        if (str2 != null) {
            if (this.A00 == 0) {
                canvas.drawText(str2, width, (f / 3.0f) + width, paint);
            } else {
                int i3 = i2 / 2;
                int i4 = (int) width;
                Drawable drawable = this.A08;
                if (drawable != null) {
                    int i5 = i4 - i3;
                    int i6 = i4 + i3;
                    drawable.setBounds(i5, i5, i6, i6);
                    drawable.draw(canvas);
                }
            }
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.A06);
        canvas.drawCircle(width, width, width, paint);
        paint.setStyle(Paint.Style.FILL);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C14360o3.A0B(rect, 0);
        this.A09.setBounds(0, 0, rect.width(), rect.height());
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        C14360o3.A0B(runnable, 1);
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        C14360o3.A0B(runnable, 1);
        unscheduleSelf(runnable);
    }

    public C177907vP(Context context) {
        int A04;
        int A042;
        int A043;
        int A044;
        Resources resources = context.getResources();
        try {
            A04 = resources.getDimensionPixelSize(R.dimen.account_recs_header_image_margin);
        } catch (Resources.NotFoundException unused) {
            C0w9.A01(EnumC12410kj.A09, "GalleryItemSelectionDrawable", "Cannot find gallery item selection circle stroke width");
            A04 = (int) AbstractC13880nE.A04(context, 1);
        }
        this.A06 = A04;
        try {
            A042 = resources.getDimensionPixelSize(R.dimen.achievements_only_you_bottom_margin);
        } catch (Resources.NotFoundException unused2) {
            C0w9.A01(EnumC12410kj.A09, "GalleryItemSelectionDrawable", "Cannot find gallery item selection text size single digit");
            A042 = (int) AbstractC13880nE.A04(context, 17);
        }
        this.A02 = A042;
        try {
            A043 = resources.getDimensionPixelSize(R.dimen.action_bar_item_spacing_right);
        } catch (Resources.NotFoundException unused3) {
            C0w9.A01(EnumC12410kj.A09, "GalleryItemSelectionDrawable", "Cannot find gallery item selection text size double digit");
            A043 = (int) AbstractC13880nE.A04(context, 14);
        }
        this.A01 = A043;
        this.A05 = context.getColor(C1QI.A0E() == C1QL.A04 ? R.color.igds_prism_indigo_05 : R.color.default_cta_dominant_color);
        this.A04 = context.getColor(R.color.gallery_item_selection_circle_default_color);
        int color = context.getColor(R.color.gallery_item_selection_circle_shadow_color);
        try {
            A044 = resources.getDimensionPixelSize(R.dimen.abc_edit_text_inset_bottom_material);
        } catch (Resources.NotFoundException unused4) {
            C0w9.A01(EnumC12410kj.A09, "GalleryItemSelectionDrawable", "Cannot find gallery item selection text size double digit");
            A044 = (int) AbstractC13880nE.A04(context, 7);
        }
        C177917vQ c177917vQ = new C177917vQ(color, A044);
        this.A09 = c177917vQ;
        c177917vQ.setCallback(this);
        Drawable drawable = context.getDrawable(R.drawable.checkmark);
        this.A08 = drawable;
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
        }
        this.A07.setTextAlign(Paint.Align.CENTER);
    }

    public final void A00(int i) {
        String str;
        if (i >= 0) {
            str = String.valueOf(i + 1);
        } else {
            str = null;
        }
        this.A03 = str;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A09.setAlpha(i);
        this.A07.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A09.setColorFilter(colorFilter);
        this.A07.setColorFilter(colorFilter);
        Drawable drawable = this.A08;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }
}
