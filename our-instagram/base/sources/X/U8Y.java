package X;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* loaded from: classes11.dex */
public final class U8Y extends Drawable {
    public final Bitmap A00;
    public final Bitmap A01;
    public final Paint A02 = new Paint();

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int save;
        C14360o3.A0B(canvas, 0);
        float A0F = AbstractC166997dE.A0F(this);
        float A00 = AbstractC167007dF.A00(this);
        Bitmap bitmap = this.A01;
        if (bitmap != null) {
            Matrix matrix = new Matrix();
            matrix.setRotate(3.0f, (bitmap.getWidth() / 2) + A0F, (bitmap.getHeight() / 2) + A00);
            matrix.postTranslate(12.0f, 0.0f);
            save = canvas.save();
            canvas.concat(matrix);
            try {
                A00(bitmap, canvas);
            } finally {
                canvas.restoreToCount(save);
            }
        }
        Bitmap bitmap2 = this.A00;
        if (bitmap2 != null) {
            save = canvas.save();
            canvas.rotate(-7.0f, A0F - (bitmap2.getWidth() / 2), A00 + (bitmap2.getHeight() / 2));
            A00(bitmap2, canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        if (this.A00 != null) {
            return (int) (r0.getHeight() * 1.1d);
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        if (this.A00 != null) {
            return (int) (r0.getHeight() * 1.1d);
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A02.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        this.A02.setColorFilter(AbstractC46530KiV.A00(C05F.A1I, i));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (colorStateList == null) {
            this.A02.setColorFilter(null);
        } else {
            setTint(colorStateList.getDefaultColor());
        }
    }

    public U8Y(Bitmap bitmap, Bitmap bitmap2) {
        this.A01 = bitmap;
        this.A00 = bitmap2;
    }

    private final void A00(Bitmap bitmap, Canvas canvas) {
        canvas.drawBitmap(bitmap, AbstractC166997dE.A0F(this) - (bitmap.getWidth() / 2.0f), AbstractC167007dF.A00(this) - (bitmap.getHeight() / 2.0f), this.A02);
    }
}
