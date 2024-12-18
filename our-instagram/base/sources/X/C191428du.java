package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.facebook.R;

/* renamed from: X.8du, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C191428du extends Drawable {
    public int A00;
    public final int A01;
    public final int A02;
    public final Paint A03 = new Paint(1);
    public final RectF A04 = new RectF();

    public C191428du(Context context, int i, int i2) {
        this.A01 = i;
        this.A02 = i2;
        this.A00 = context.getResources().getDimensionPixelSize(R.dimen.action_bar_item_spacing_left);
    }

    public final void A00(int i, int i2) {
        this.A03.setShader(new LinearGradient(0.0f, i2, i, 0.0f, this.A01, this.A02, Shader.TileMode.CLAMP));
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        RectF rectF = this.A04;
        float f = this.A00;
        canvas.drawRoundRect(rectF, f, f, this.A03);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C14360o3.A0B(rect, 0);
        super.onBoundsChange(rect);
        this.A04.set(getBounds());
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A03.setAlpha(i);
    }
}
