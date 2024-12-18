package X;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Shader;
import android.media.ThumbnailUtils;
import android.os.Build;
import android.util.Size;
import com.instagram.common.gallery.FaceCenter;
import com.instagram.common.gallery.Medium;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/* loaded from: classes4.dex */
public final class AKT {
    public static final Random A0E = new Random();
    public float A00;
    public int A01;
    public int A02;
    public BitmapShader A03;
    public C1NJ A04;
    public AC4 A05;
    public boolean A06;
    public final float A0C;
    public final Paint A0D = AbstractC166997dE.A0Q();
    public final RectF A0B = AbstractC166987dD.A0X();
    public final PointF A0A = new PointF();
    public final PointF A09 = new PointF();
    public final Matrix A07 = AbstractC166987dD.A0Q();
    public final Matrix A08 = AbstractC166987dD.A0Q();

    public static void A00(Bitmap bitmap, AKT akt) {
        akt.A04 = null;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        akt.A03 = new BitmapShader(bitmap, tileMode, tileMode);
        akt.A02 = bitmap.getWidth();
        akt.A01 = bitmap.getHeight();
        akt.A0D.setShader(akt.A03);
    }

    public final void A01() {
        this.A05 = null;
        this.A03 = null;
        this.A04 = null;
        this.A02 = 0;
        this.A01 = 0;
        this.A0B.set(0.0f, 0.0f, 0.0f, 0.0f);
        this.A00 = 0.0f;
        this.A0A.set(0.0f, 0.0f);
        this.A09.set(0.0f, 0.0f);
        this.A07.reset();
        this.A08.reset();
        this.A06 = false;
    }

    public final void A02(Canvas canvas, float f, int i, int i2, int i3) {
        if (this.A03 != null) {
            if (!this.A06 && this.A05 != null) {
                this.A06 = true;
                PointF pointF = new PointF(0.5f, 0.5f);
                Medium medium = this.A05.A01;
                ArrayList A1E = AbstractC166987dD.A1E();
                List<FaceCenter> list = medium.A0c;
                if (list == null) {
                    list = C16930sl.A00;
                }
                for (FaceCenter faceCenter : list) {
                    A1E.add(new PointF(faceCenter.A01, faceCenter.A02));
                }
                if (!A1E.isEmpty()) {
                    PointF A04 = AbstractC13600mm.A04(A1E);
                    pointF.x = A04.x;
                    pointF.y = A04.y;
                }
                int i4 = this.A02;
                int i5 = this.A01;
                AC4 ac4 = this.A05;
                int i6 = ac4.A00;
                if (i6 == -1) {
                    i6 = C197098ne.A01(ac4.A01.A0X);
                    ac4.A00 = i6;
                }
                float f2 = pointF.x;
                float f3 = pointF.y;
                Matrix matrix = this.A07;
                C1NC.A0I(matrix, f2, f3, 1.5f, i4, i5, i, i2, i6);
                Matrix matrix2 = this.A08;
                matrix2.set(matrix);
                RectF rectF = this.A0B;
                rectF.set(0.0f, 0.0f, this.A02, this.A01);
                matrix2.mapRect(rectF);
                float abs = Math.abs(rectF.left);
                float f4 = rectF.right - i;
                float abs2 = Math.abs(rectF.top);
                float f5 = rectF.bottom - i2;
                float width = rectF.width() * 0.05f;
                float height = rectF.height() * 0.05f;
                if (abs > width && f4 > width) {
                    if (!A0E.nextBoolean()) {
                        width = -width;
                    }
                } else if (abs > f4) {
                    width = Math.min(abs, width);
                } else {
                    width = Math.max(-f4, -width);
                }
                if (abs2 > height && f5 > height) {
                    if (!A0E.nextBoolean()) {
                        height = -height;
                    }
                } else if (abs2 > f5) {
                    height = Math.min(abs2, height);
                } else {
                    height = Math.max(-f5, -height);
                }
                Random random = A0E;
                float nextFloat = (random.nextFloat() * 0.5f) + 0.5f;
                this.A0A.set(width * nextFloat, height * nextFloat);
                this.A09.set(0.0f, 0.0f);
                this.A00 = (random.nextFloat() * 0.2f) + 1.0f;
            }
            Matrix matrix3 = this.A08;
            matrix3.set(this.A07);
            PointF pointF2 = this.A0A;
            float f6 = pointF2.x;
            PointF pointF3 = this.A09;
            matrix3.postTranslate(AbstractC13600mm.A01(f, 0.0f, 1.0f, f6, pointF3.x), AbstractC13600mm.A01(f, 0.0f, 1.0f, pointF2.y, pointF3.y));
            RectF rectF2 = this.A0B;
            rectF2.set(0.0f, 0.0f, this.A02, this.A01);
            matrix3.mapRect(rectF2);
            float A01 = AbstractC13600mm.A01(f, 0.0f, 1.0f, this.A00, 1.0f);
            matrix3.postScale(A01, A01, rectF2.centerX(), rectF2.centerY());
            BitmapShader bitmapShader = this.A03;
            bitmapShader.getClass();
            bitmapShader.setLocalMatrix(matrix3);
            Paint paint = this.A0D;
            paint.setAlpha(i3);
            rectF2.set(0.0f, 0.0f, i, i2);
            float f7 = this.A0C;
            canvas.drawRoundRect(rectF2, f7, f7, paint);
        }
    }

    public final void A03(AC4 ac4, int i, int i2) {
        Bitmap createVideoThumbnail;
        if (!AbstractC50102Ry.A00(this.A05, ac4)) {
            A01();
            this.A05 = ac4;
            Medium medium = ac4.A01;
            if (medium.A05()) {
                this.A04 = new C23596Acq(this, 0);
                C1OG A0J = C25821No.A00().A0J(AbstractC81033jX.A01(AbstractC166987dD.A11(medium.A0X)), null);
                A0J.A01 = C1NC.A01(medium.A0X, i, i2);
                A0J.A02(this.A04);
                A0J.A01();
                return;
            }
            if (Build.VERSION.SDK_INT >= 29) {
                try {
                    File A11 = AbstractC166987dD.A11(medium.A0X);
                    Medium medium2 = this.A05.A01;
                    createVideoThumbnail = ThumbnailUtils.createVideoThumbnail(A11, new Size(medium2.A0B, medium2.A04), null);
                } catch (IOException e) {
                    C0w9.A07("KenBurnsImage.loadBitmap#IOException", e);
                    return;
                }
            } else {
                createVideoThumbnail = ThumbnailUtils.createVideoThumbnail(medium.A0X, 1);
            }
            if (createVideoThumbnail == null) {
                return;
            }
            A00(createVideoThumbnail, this);
        }
    }

    public AKT(float f) {
        this.A0C = f;
    }
}
