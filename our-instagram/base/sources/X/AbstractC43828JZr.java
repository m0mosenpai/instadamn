package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.JZr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC43828JZr extends IgImageView {
    public float A00;
    public PointF A01;
    public float A02;
    public float A03;
    public float A04;
    public Runnable A05;
    public boolean A06;
    public final Matrix A07;
    public final Matrix A08;
    public final C55982hj A09;
    public final C55982hj A0A;
    public final C55982hj A0B;
    public final C55942hf A0C;
    public final C55942hf A0D;
    public final C55952hg A0E;
    public final C47792L8z A0F;
    public final C44264JhA A0G;
    public final Matrix A0H;
    public final RectF A0I;
    public final RectF A0J;
    public final RectF A0K;
    public final float[] A0L;

    public final void A0I() {
        this.A06 = false;
        this.A04 = this.A02;
    }

    public final void A0J(float f, float f2) {
        Matrix matrix = this.A08;
        matrix.set(getImageMatrix());
        C47792L8z c47792L8z = this.A0F;
        A0K(matrix, c47792L8z);
        if (c47792L8z.A01() && f == 0.0f && f2 == 0.0f) {
            A0M(true);
        } else {
            new C48217LVr(matrix, this, c47792L8z, f, f2);
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        C14360o3.A0B(keyEvent, 1);
        if (i == 4 && keyEvent.getRepeatCount() == 0) {
            keyEvent.startTracking();
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public final void setForcedMinZoom(float f) {
        this.A06 = true;
        this.A04 = f;
    }

    @Override // com.instagram.common.ui.widget.imageview.IgImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C44264JhA c44264JhA = this.A0G;
        c44264JhA.A01 = bitmap;
        c44264JhA.A00 = 0;
        setHighQuality(true);
    }

    public final void setImageRotateBitmapResetBase(C44264JhA c44264JhA, float[] fArr, ViewGroup.LayoutParams layoutParams) {
        int width;
        C14360o3.A0B(c44264JhA, 0);
        if (layoutParams != null) {
            width = layoutParams.width;
        } else {
            width = getWidth();
        }
        if (width <= 0) {
            this.A05 = new RunnableC44319JiB(this, c44264JhA, fArr);
            return;
        }
        Bitmap bitmap = c44264JhA.A01;
        if (bitmap != null) {
            int i = c44264JhA.A00;
            super.setImageBitmap(bitmap);
            C44264JhA c44264JhA2 = this.A0G;
            c44264JhA2.A01 = bitmap;
            c44264JhA2.A00 = i;
            setHighQuality(true);
            setupBaseMatrix(layoutParams);
        } else {
            this.A07.reset();
            setImageBitmap(null);
        }
        Matrix matrix = this.A08;
        if (fArr == null) {
            matrix.set(this.A07);
        } else {
            matrix.setValues(fArr);
        }
        setImageMatrix(matrix);
    }

    public static final float A00(Matrix matrix, AbstractC43828JZr abstractC43828JZr) {
        float[] fArr = abstractC43828JZr.A0L;
        matrix.getValues(fArr);
        return (float) AbstractC43594JPz.A00(fArr[0], fArr[3]);
    }

    public static final void A01(AbstractC43828JZr abstractC43828JZr) {
        Matrix matrix = abstractC43828JZr.A08;
        C47792L8z c47792L8z = abstractC43828JZr.A0F;
        abstractC43828JZr.A0K(matrix, c47792L8z);
        if (c47792L8z.A01()) {
            abstractC43828JZr.setImageMatrix(matrix);
            return;
        }
        Matrix matrix2 = abstractC43828JZr.A0H;
        matrix2.set(matrix);
        c47792L8z.A02 = (float) Math.sqrt(c47792L8z.A02);
        float f = c47792L8z.A00;
        if (f != 0.0f) {
            c47792L8z.A00 = LHK.A00(f, abstractC43828JZr.A0K.width());
        }
        float f2 = c47792L8z.A01;
        if (f2 != 0.0f) {
            c47792L8z.A01 = LHK.A00(f2, abstractC43828JZr.A0K.height());
        }
        c47792L8z.A00(matrix2);
        abstractC43828JZr.setImageMatrix(matrix2);
    }

    private final void setupBaseMatrix(ViewGroup.LayoutParams layoutParams) {
        float A07;
        int height;
        if (layoutParams != null) {
            A07 = layoutParams.width;
            height = layoutParams.height;
        } else {
            A07 = AbstractC166987dD.A07(this);
            height = getHeight();
        }
        float f = height;
        C44264JhA c44264JhA = this.A0G;
        float A01 = c44264JhA.A01();
        float A00 = c44264JhA.A00();
        float max = Math.max(A07 / A01, f / A00);
        Matrix matrix = this.A07;
        C14360o3.A0B(matrix, 0);
        matrix.reset();
        if (c44264JhA.A00 != 0) {
            if (c44264JhA.A01 != null) {
                float f2 = (-r0.getWidth()) / 2.0f;
                if (c44264JhA.A01 != null) {
                    matrix.postTranslate(f2, (-r0.getHeight()) / 2.0f);
                    matrix.postRotate(c44264JhA.A00);
                    matrix.postTranslate(c44264JhA.A01() / 2.0f, c44264JhA.A00() / 2.0f);
                } else {
                    throw AbstractC166997dE.A0g();
                }
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        matrix.postScale(max, max);
        matrix.postTranslate((A07 - (A01 * max)) / 2.0f, (f - (A00 * max)) / 2.0f);
        matrix.mapRect(this.A0K, this.A0I);
    }

    public final void A0H() {
        Matrix matrix = this.A08;
        C47792L8z c47792L8z = this.A0F;
        A0K(matrix, c47792L8z);
        if (!c47792L8z.A01()) {
            c47792L8z.A00(matrix);
            setImageMatrix(matrix);
            this.A01 = null;
        }
        this.A0E.A04.clear();
    }

    public final void A0L(RectF rectF, float f, float f2) {
        this.A02 = f;
        if (!this.A06) {
            A0I();
        }
        this.A03 = f2;
        this.A0I.set(rectF);
    }

    public final void A0N(boolean z) {
        if (this.A0G.A01 != null) {
            setupBaseMatrix(null);
            Matrix matrix = this.A08;
            matrix.set(this.A07);
            if (z) {
                float f = this.A04;
                matrix.postScale(f, f, AbstractC166987dD.A07(this) / 2.0f, AbstractC166987dD.A08(this) / 2.0f);
            }
            setImageMatrix(matrix);
            this.A01 = null;
            return;
        }
        Runnable runnable = this.A05;
        if (runnable == null) {
            return;
        }
        this.A05 = new RunnableC44320JiC(this, runnable, z);
    }

    public final Matrix getBaseMatrix$fbandroid_java_com_instagram_creation_photo_crop_crop() {
        return this.A07;
    }

    public final float getCropAspectRatio() {
        return this.A00;
    }

    public final Matrix getCropMatrix() {
        return this.A08;
    }

    public final float[] getCropMatrixValues() {
        float[] fArr = new float[9];
        this.A08.getValues(fArr);
        return fArr;
    }

    public final float getCurrentScale() {
        return A00(this.A08, this) / A00(this.A07, this);
    }

    public final C44264JhA getRotateBitmap() {
        return this.A0G;
    }

    public final void setCropAspectRatio(float f) {
        this.A00 = f;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.JhA, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.L8z, java.lang.Object] */
    public AbstractC43828JZr(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A07 = AbstractC166987dD.A0Q();
        this.A08 = AbstractC166987dD.A0Q();
        ?? obj = new Object();
        obj.A01 = null;
        obj.A00 = 0;
        this.A0G = obj;
        this.A0F = new Object();
        this.A0H = AbstractC166987dD.A0Q();
        this.A0J = AbstractC166987dD.A0X();
        this.A0L = new float[9];
        this.A02 = 1.0f;
        this.A04 = 1.0f;
        this.A03 = 1.0f;
        this.A0I = AbstractC166987dD.A0X();
        this.A0K = AbstractC166987dD.A0X();
        this.A00 = 1.0f;
        setScaleType(ImageView.ScaleType.MATRIX);
        setCropToPadding(false);
        C55952hg A00 = AbstractC13560mi.A00();
        this.A0E = A00;
        C55942hf A04 = C55942hf.A04(30.0d, 9.0d);
        this.A0C = A04;
        this.A0D = C55942hf.A04(0.0d, 1.5d);
        C55982hj A02 = A00.A02();
        A02.A09(A04);
        this.A0B = A02;
        C55982hj A022 = this.A0E.A02();
        A022.A00 = 1.0d;
        A022.A02 = 10.0d;
        A022.A06 = false;
        this.A09 = A022;
        C55982hj A023 = this.A0E.A02();
        A023.A00 = 1.0d;
        A023.A02 = 10.0d;
        A023.A06 = false;
        this.A0A = A023;
    }

    private final void setHighQuality(boolean z) {
        Drawable drawable = getDrawable();
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            bitmapDrawable.setDither(z);
            bitmapDrawable.setAntiAlias(z);
            bitmapDrawable.setFilterBitmap(z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0K(android.graphics.Matrix r11, X.C47792L8z r12) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC43828JZr.A0K(android.graphics.Matrix, X.L8z):void");
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        Runnable runnable = this.A05;
        if (runnable != null) {
            this.A05 = null;
            runnable.run();
        }
        if (this.A0G.A01 != null) {
            setupBaseMatrix(null);
        }
    }

    public void A0M(boolean z) {
        setHighQuality(z);
    }
}
