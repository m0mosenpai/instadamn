package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.facebook.R;

/* renamed from: X.8hb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C193568hb extends Drawable {
    public int A00;
    public Bitmap A01;
    public final float A02;
    public final float A03;
    public final Paint A04;
    public final Paint A05;
    public final Paint A06;
    public final Paint A07;
    public final RectF A08;
    public final boolean A09;

    public C193568hb(Context context, Bitmap bitmap, float f, float f2, int i, int i2, boolean z) {
        C14360o3.A0B(bitmap, 7);
        this.A09 = z;
        this.A08 = new RectF();
        this.A02 = f2;
        this.A03 = i - f;
        Paint paint = new Paint(1);
        this.A07 = paint;
        this.A00 = 255;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint.setStrokeWidth(f);
        Paint paint2 = new Paint(3);
        this.A04 = paint2;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        boolean z2 = C1NC.A02;
        Matrix matrix = new Matrix();
        C1NC.A0J(matrix, width, height, i, i, i2, false);
        bitmapShader.setLocalMatrix(matrix);
        paint2.setShader(bitmapShader);
        Paint paint3 = new Paint(1);
        this.A05 = paint3;
        Paint.Style style = Paint.Style.FILL;
        paint3.setStyle(style);
        paint3.setColor(-1);
        paint3.setShadowLayer(AbstractC13880nE.A04(context, 10), 0.0f, 0.0f, context.getColor(R.color.black_15_transparent));
        Paint paint4 = new Paint(1);
        this.A06 = paint4;
        paint4.setStyle(style);
        paint4.setColor(-1);
        paint4.setShadowLayer(AbstractC13880nE.A04(context, 1), 0.0f, 0.0f, context.getColor(R.color.black_20_transparent));
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0054, code lost:
    
        if (r0.getHeight() != r13.getHeight()) goto L8;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r13) {
        /*
            r12 = this;
            r0 = 0
            X.C14360o3.A0B(r13, r0)
            android.graphics.Paint r7 = r12.A04
            int r0 = r12.A00
            r7.setAlpha(r0)
            android.graphics.Paint r6 = r12.A07
            int r0 = r12.A00
            r6.setAlpha(r0)
            android.graphics.Paint r10 = r12.A05
            int r0 = r12.A00
            r10.setAlpha(r0)
            android.graphics.Paint r9 = r12.A06
            int r0 = r12.A00
            r9.setAlpha(r0)
            android.graphics.RectF r5 = r12.A08
            float r8 = r12.A03
            r4 = 0
            r5.set(r4, r4, r8, r8)
            int r2 = r13.getWidth()
            int r1 = r13.getHeight()
            r0 = 1073741824(0x40000000, float:2.0)
            float r8 = r8 / r0
            float r3 = (float) r2
            float r3 = r3 / r0
            float r3 = r3 - r8
            float r2 = (float) r1
            float r2 = r2 / r0
            float r2 = r2 - r8
            android.graphics.Bitmap r0 = r12.A01
            if (r0 == 0) goto L56
            int r1 = r0.getWidth()
            int r0 = r13.getWidth()
            if (r1 != r0) goto L56
            android.graphics.Bitmap r0 = r12.A01
            X.C14360o3.A0A(r0)
            int r1 = r0.getHeight()
            int r0 = r13.getHeight()
            if (r1 == r0) goto L88
        L56:
            android.graphics.Bitmap r0 = r12.A01
            if (r0 == 0) goto L5d
            r0.recycle()
        L5d:
            int r11 = r13.getWidth()
            int r1 = r13.getHeight()
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r11, r1, r0)
            r12.A01 = r0
            X.C14360o3.A0A(r0)
            android.graphics.Canvas r1 = new android.graphics.Canvas
            r1.<init>(r0)
            r1.save()
            r1.translate(r3, r2)
            boolean r0 = r12.A09
            if (r0 == 0) goto Lad
            r1.drawCircle(r8, r8, r8, r10)
            r1.drawCircle(r8, r8, r8, r9)
        L85:
            r1.restore()
        L88:
            android.graphics.Bitmap r0 = r12.A01
            X.C14360o3.A0A(r0)
            r13.drawBitmap(r0, r4, r4, r7)
            r13.save()
            r13.translate(r3, r2)
            boolean r0 = r12.A09
            if (r0 == 0) goto La4
            r13.drawCircle(r8, r8, r8, r7)
            r13.drawCircle(r8, r8, r8, r6)
        La0:
            r13.restore()
            return
        La4:
            float r0 = r12.A02
            r13.drawRoundRect(r5, r0, r0, r7)
            r13.drawRoundRect(r5, r0, r0, r6)
            goto La0
        Lad:
            float r0 = r12.A02
            r1.drawRoundRect(r5, r0, r0, r10)
            r1.drawRoundRect(r5, r0, r0, r9)
            goto L85
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C193568hb.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A00 = i;
        invalidateSelf();
    }
}
