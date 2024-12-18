package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import java.io.File;
import java.util.Random;

/* renamed from: X.Maz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50745Maz extends Drawable {
    public static File A09;
    public static final C1GL A0A;
    public Bitmap A00;
    public Shader A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final Context A05;
    public final Paint A06;
    public final Matrix A07;
    public final RectF A08;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A06.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A06.setColorFilter(colorFilter);
    }

    static {
        C0o0 A00 = AbstractC14350nz.A00();
        A00.A01 = "StaticAnimationDrawable";
        A0A = new C1GK(new C18240vB(A00));
    }

    public C50745Maz(Context context) {
        this.A05 = context;
        Paint paint = new Paint(2);
        this.A06 = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-65536);
        this.A08 = AbstractC166987dD.A0X();
        this.A07 = new Matrix();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Bitmap bitmap;
        System.currentTimeMillis();
        canvas.drawColor(-16777216);
        if (!this.A04) {
            Rect bounds = getBounds();
            int i = bounds.left;
            int i2 = bounds.top;
            int i3 = bounds.right;
            int i4 = bounds.bottom;
            int width = bounds.width();
            int height = bounds.height();
            if (!this.A03 && !this.A02 && this.A00 == null) {
                long currentTimeMillis = System.currentTimeMillis();
                this.A03 = true;
                Context context = this.A05;
                if (A09 == null) {
                    File A0w = MSW.A0w(context.getExternalFilesDir(null), "StaticAnimationDrawable");
                    A09 = A0w;
                    A0w.mkdirs();
                }
                File A0w2 = MSW.A0w(A09, "static_tile_1");
                if (A0w2.exists()) {
                    C1OG A0J = C25821No.A00().A0J(AbstractC81033jX.A01(A0w2), null);
                    A0J.A02(new C55945Osd(this, currentTimeMillis));
                    A0J.A01();
                } else {
                    C121275eQ c121275eQ = new C121275eQ(new PUN(context, currentTimeMillis), 454);
                    c121275eQ.A00 = new NFQ(this, 1);
                    A0A.schedule(c121275eQ);
                }
            }
            if (this.A01 != null && (bitmap = this.A00) != null) {
                int round = Math.round(bitmap.getWidth() / 1.5f);
                Random random = new Random();
                float f = -random.nextInt(round);
                float f2 = -random.nextInt(round);
                int i5 = -round;
                int i6 = width + round;
                int i7 = height + round;
                int width2 = this.A00.getWidth();
                int height2 = this.A00.getHeight();
                while (i5 < i7) {
                    int i8 = i5;
                    while (i8 < i6) {
                        float A02 = AbstractC13600mm.A02(random.nextFloat(), 0.0f, 1.0f, 0.0f, 360.0f);
                        Matrix matrix = this.A07;
                        RectF rectF = this.A08;
                        matrix.setRotate(A02, rectF.centerX(), rectF.centerY());
                        this.A01.setLocalMatrix(matrix);
                        float f3 = i8 + f;
                        float f4 = i5 + f2;
                        rectF.set(Math.max(f3, i), Math.max(f4, i2), Math.min(width2 + f3, i3), Math.min(height2 + f4, i4));
                        canvas.save();
                        if (random.nextBoolean()) {
                            canvas.scale(-1.0f, -1.0f, rectF.centerX(), rectF.centerY());
                        }
                        canvas.restore();
                        canvas.drawRect(rectF, this.A06);
                        i8 += this.A00.getWidth();
                    }
                    i5 += this.A00.getHeight();
                }
                System.currentTimeMillis();
                if (this.A04) {
                    return;
                }
            }
            invalidateSelf();
        }
    }
}
