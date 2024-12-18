package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.R;

/* renamed from: X.7zh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C180537zh extends Drawable {
    public final boolean A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final Resources A04;
    public final Paint A05;
    public final Paint A06;
    public final Path A07;
    public final RectF A08;
    public final boolean A09;
    public final boolean A0A;

    public C180537zh(Context context, int i, int i2, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(context, 1);
        this.A0A = z;
        this.A09 = z2;
        this.A00 = z3;
        this.A02 = i2;
        Resources resources = context.getResources();
        this.A04 = resources;
        Paint paint = new Paint(3);
        paint.setColor(i);
        paint.setStyle(Paint.Style.FILL);
        this.A05 = paint;
        float dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material);
        this.A01 = dimensionPixelSize;
        int color = context.getColor(R.color.black_10_transparent);
        this.A03 = color;
        Paint paint2 = new Paint(3);
        paint2.setColor(i);
        paint2.setShadowLayer(dimensionPixelSize, 0.0f, 0.0f, color);
        this.A06 = paint2;
        this.A07 = new Path();
        this.A08 = new RectF();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        canvas.save();
        canvas.translate(getBounds().left, getBounds().top);
        if (this.A0A) {
            canvas.drawPath(this.A07, this.A06);
        }
        canvas.drawPath(this.A07, this.A05);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        float f;
        float f2;
        float f3;
        float f4;
        C14360o3.A0B(rect, 0);
        super.onBoundsChange(rect);
        RectF rectF = this.A08;
        rectF.set(0.0f, 0.0f, rect.width(), rect.height());
        Path path = this.A07;
        path.reset();
        float[] fArr = new float[8];
        boolean z = this.A00;
        if (z) {
            f = A00();
        } else {
            f = 0.0f;
        }
        fArr[0] = f;
        if (z) {
            f2 = A00();
        } else {
            f2 = 0.0f;
        }
        fArr[1] = f2;
        if (z) {
            f3 = A00();
        } else {
            f3 = 0.0f;
        }
        fArr[2] = f3;
        if (z) {
            f4 = A00();
        } else {
            f4 = 0.0f;
        }
        fArr[3] = f4;
        fArr[4] = A00();
        fArr[5] = A00();
        fArr[6] = A00();
        fArr[7] = A00();
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final float A00() {
        if (this.A09) {
            return this.A08.height() / 2.0f;
        }
        return this.A04.getDimensionPixelSize(this.A02);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A05.setAlpha(i);
        Paint paint = this.A06;
        paint.setAlpha(i);
        if (i == 0) {
            paint.clearShadowLayer();
        } else {
            paint.setShadowLayer(this.A01, 0.0f, 0.0f, this.A03);
        }
    }
}
