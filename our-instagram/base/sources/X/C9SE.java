package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import com.facebook.R;

/* renamed from: X.9SE, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9SE extends Drawable implements Drawable.Callback {
    public final C6RB A00;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A00.A06;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A00.A0A;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.A00.setBounds((int) (rect.exactCenterX() - (r6.A0A / 2.0f)), (int) (rect.exactCenterY() - (r6.A06 / 2.0f)), (int) (rect.exactCenterX() + (r6.A0A / 2.0f)), (int) (rect.exactCenterY() + (r6.A06 / 2.0f)));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A00.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A00.setColorFilter(colorFilter);
    }

    public C9SE(Context context) {
        Resources resources = context.getResources();
        int color = context.getColor(R.color.clips_remix_camera_outer_container_default_background);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.backup_codes_text_size);
        C6RB A0Y = AbstractC167007dF.A0Y(context, resources, R.dimen.browser_error_screen_description_width);
        this.A00 = A0Y;
        A0Y.A0K(Layout.Alignment.ALIGN_CENTER);
        A0Y.setCallback(this);
        A0Y.A0F(color);
        A0Y.A0A(dimensionPixelSize);
        AEZ.A00(context, A0Y);
        A0Y.A0b.setLetterSpacing(-0.03f);
        A0Y.A0R();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float A0G = AbstractC166997dE.A0G(this);
        C6RB c6rb = this.A00;
        float min = Math.min(1.0f, A0G / c6rb.A06);
        canvas.save();
        canvas.scale(min, min, getBounds().exactCenterX(), getBounds().exactCenterY());
        c6rb.draw(canvas);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }
}
