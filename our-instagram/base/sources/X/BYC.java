package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* loaded from: classes5.dex */
public final class BYC extends Drawable {
    public final int A00;
    public final Context A01;
    public final Paint A02;

    public BYC(Context context, int i, int i2, boolean z) {
        this.A01 = context;
        this.A00 = i;
        Paint A0R = AbstractC166987dD.A0R();
        AbstractC166987dD.A1R(A0R);
        A0R.setAntiAlias(true);
        if (z) {
            A0R.setShadowLayer(15.0f, 2.0f, 2.0f, i2);
        }
        this.A02 = A0R;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        Rect bounds = getBounds();
        C14360o3.A07(bounds);
        float A02 = AbstractC166987dD.A02(bounds.width());
        float width = bounds.width();
        float height = bounds.height();
        int i = this.A00;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, width, height, new int[]{AbstractC56842jH.A06(i, 216), i}, (float[]) null, Shader.TileMode.CLAMP);
        Paint paint = this.A02;
        paint.setShader(linearGradient);
        canvas.drawCircle(bounds.centerX(), bounds.centerY(), A02, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
