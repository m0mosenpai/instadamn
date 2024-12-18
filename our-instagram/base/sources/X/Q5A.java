package X;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* loaded from: classes10.dex */
public final class Q5A extends ImageView {
    public static final float A01 = AbstractC61775RtV.A00(2);
    public float A00;

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        Bitmap createBitmap;
        int i2;
        int A03 = C0f9.A03(902654691);
        if (isInEditMode()) {
            super.draw(canvas);
            i = 300945811;
        } else {
            Drawable drawable = getDrawable();
            if (drawable != null) {
                if (drawable instanceof BitmapDrawable) {
                    createBitmap = ((BitmapDrawable) drawable).getBitmap();
                } else {
                    try {
                        createBitmap = Bitmap.createBitmap(Math.max(drawable.getIntrinsicWidth(), 2), Math.max(drawable.getIntrinsicHeight(), 2), Bitmap.Config.ARGB_8888);
                        Canvas canvas2 = new Canvas(createBitmap);
                        drawable.setBounds(0, 0, canvas2.getWidth(), canvas2.getHeight());
                        drawable.draw(canvas2);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                if (createBitmap != null && createBitmap.getWidth() > 0 && createBitmap.getHeight() > 0) {
                    int width = createBitmap.getWidth();
                    int height = createBitmap.getHeight();
                    if (width != height) {
                        int min = Math.min(width, height);
                        int i3 = 0;
                        if (width > height) {
                            i3 = (width - height) / 2;
                        } else if (width < height) {
                            i2 = (height - width) / 2;
                            C0fK.A03(createBitmap);
                            createBitmap = Bitmap.createBitmap(createBitmap, i3, i2, min, min);
                        }
                        i2 = 0;
                        C0fK.A03(createBitmap);
                        createBitmap = Bitmap.createBitmap(createBitmap, i3, i2, min, min);
                    }
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(createBitmap, tileMode, tileMode);
                    float f = this.A00;
                    float max = Math.max(f / width, f / height);
                    Matrix A0Q = AbstractC166987dD.A0Q();
                    A0Q.setScale(max, max);
                    bitmapShader.setLocalMatrix(A0Q);
                    Paint A0R = AbstractC166987dD.A0R();
                    Paint A0R2 = AbstractC166987dD.A0R();
                    A0R2.setAntiAlias(true);
                    A0R2.setFilterBitmap(true);
                    A0R2.setDither(true);
                    A0R2.setColor(-1);
                    AbstractC43592JPx.A1E(A0R2);
                    A0R2.setStrokeWidth(A01);
                    A0R.setAntiAlias(true);
                    A0R.setFilterBitmap(true);
                    A0R.setDither(true);
                    A0R.setShader(bitmapShader);
                    float measuredWidth = getMeasuredWidth() / 2.0f;
                    float measuredHeight = getMeasuredHeight() / 2.0f;
                    float f2 = f / 2.0f;
                    canvas.drawCircle(measuredWidth, measuredHeight, f2, A0R);
                    canvas.drawCircle(measuredWidth, measuredHeight, f2, A0R2);
                    i = -98417357;
                }
            }
            super.draw(canvas);
            i = -98417357;
        }
        C0f9.A0A(i, A03);
    }
}
