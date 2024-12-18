package com.facebook.smartcapture.ui.view;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC25228BEl;
import X.AbstractC31174DnI;
import X.AbstractC43592JPx;
import X.AbstractC43594JPz;
import X.AbstractC47994LKy;
import X.AbstractC63123SdR;
import X.C0f9;
import X.C14360o3;
import X.C66041Tyd;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.R;
import java.util.Arrays;

/* loaded from: classes8.dex */
public final class FaceCaptureProgressView extends FrameLayout {
    public static final Property A0K = new C66041Tyd(Float.TYPE);
    public static final int[] A0L;
    public float A00;
    public ObjectAnimator A01;
    public boolean A02;
    public float A03;
    public float A04;
    public int A05;
    public Bitmap A06;
    public Canvas A07;
    public boolean A08;
    public final float[] A09;
    public final float[] A0A;
    public final float[] A0B;
    public final Paint A0C;
    public final Paint A0D;
    public final Paint A0E;
    public final Paint A0F;
    public final Paint A0G;
    public final Paint A0H;
    public final Paint A0I;
    public final RectF A0J;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FaceCaptureProgressView(Context context) {
        this(context, null, 0, 0);
        C14360o3.A0B(context, 1);
    }

    private final void A00(int i, Paint paint) {
        paint.setFlags(1);
        paint.setColor(i);
        AbstractC43592JPx.A1E(paint);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(this.A04);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        super.dispatchDraw(canvas);
        Bitmap bitmap = this.A06;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
        float A07 = AbstractC166987dD.A07(this);
        float A08 = AbstractC166987dD.A08(this);
        float f = this.A04 / 2.0f;
        RectF rectF = this.A0J;
        rectF.set(f, f, A07 - f, A08 - f);
        if (this.A08) {
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, this.A0E);
            return;
        }
        if (this.A02) {
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), (Math.min(rectF.width(), rectF.height()) / 2.0f) - (this.A03 + this.A04), this.A0H);
        }
        A02(canvas, this.A0G, null);
        A02(canvas, this.A0C, this.A09);
        A02(canvas, this.A0D, this.A0A);
        int[] iArr = A0L;
        int i = 0;
        do {
            float f2 = this.A0B[i];
            if (f2 != 0.0f) {
                float f3 = 83.0f * f2;
                Paint paint = this.A0I;
                paint.setAlpha((int) (this.A00 * 255.0f));
                canvas.drawArc(rectF, (iArr[i] + 41.5f) - (f3 / 2.0f), f3, false, paint);
            }
            i++;
        } while (i < 4);
    }

    static {
        int[] iArr = new int[4];
        A0L = iArr;
        iArr[0] = 139;
        int i = 1;
        do {
            iArr[i] = iArr[i - 1] + 83 + 7;
            i++;
        } while (i < 4);
    }

    private final void A01(Context context) {
        AbstractC166997dE.A1D(this.A0F, PorterDuff.Mode.CLEAR);
        this.A05 = AbstractC47994LKy.A01(context, R.attr.sc_surface_background);
        this.A0H.setColor(context.getResources().getColor(R.color.selfie_capture_warning_overlay));
        Context context2 = getContext();
        this.A04 = context2.getResources().getDimension(R.dimen.abc_button_inset_vertical_material);
        this.A03 = AbstractC43594JPz.A02(context2);
        A00(AbstractC47994LKy.A01(context, R.attr.selfie_capture_progress_idle), this.A0G);
        A00(AbstractC47994LKy.A01(context, R.attr.selfie_capture_progress_active), this.A0C);
        A00(AbstractC47994LKy.A01(context, R.attr.selfie_capture_progress_success), this.A0I);
        A00(AbstractC47994LKy.A01(context, R.attr.selfie_capture_progress_failure), this.A0D);
        A00(AbstractC47994LKy.A01(context, R.attr.selfie_capture_progress_filled), this.A0E);
        AbstractC31174DnI.A1C(this, AbstractC47994LKy.A01(context2, R.attr.selfie_capture_placeholder));
    }

    private final void A02(Canvas canvas, Paint paint, float[] fArr) {
        int[] iArr = A0L;
        int i = 0;
        do {
            if (fArr != null) {
                paint.setAlpha((int) (fArr[i] * 255.0f * this.A00));
            }
            canvas.drawArc(this.A0J, iArr[i], 83.0f, false, paint);
            i++;
            if (i >= 4) {
                return;
            }
        } while (i != 3);
    }

    public final void A03() {
        Arrays.fill(this.A09, 0.0f);
        Arrays.fill(this.A0B, 0.0f);
        Arrays.fill(this.A0A, 0.0f);
        invalidate();
    }

    public final float getDrawingAlpha() {
        return this.A00;
    }

    public final void setDrawingAlpha(float f) {
        this.A00 = f;
        invalidate();
    }

    public final void setFilled(boolean z) {
        this.A08 = z;
        invalidate();
    }

    public final void setFilledColor(int i) {
        this.A0E.setColor(i);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode == 0) {
            if (mode2 == 0) {
                size = (int) (AbstractC25228BEl.A0M(this).getDisplayMetrics().density * 320.0f);
            } else {
                size = size2;
            }
        } else if (mode2 != 0) {
            size = Math.min(size, size2);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec(size, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = C0f9.A06(-1644439632);
        if (i > 0 && i2 > 0 && (i != i3 || i2 != i4)) {
            Bitmap A0F = AbstractC167007dF.A0F(i, i2);
            this.A06 = A0F;
            this.A07 = AbstractC43592JPx.A06(A0F);
            float f = this.A03 + this.A04;
            float f2 = i * 0.5f;
            float f3 = i2 * 0.5f;
            float min = Math.min(f2 - f, f3 - f);
            A0F.eraseColor(0);
            Canvas canvas = this.A07;
            C14360o3.A0A(canvas);
            canvas.drawColor(this.A05);
            Canvas canvas2 = this.A07;
            C14360o3.A0A(canvas2);
            canvas2.drawCircle(f2, f3, min, this.A0F);
        }
        super.onSizeChanged(i, i2, i3, i4);
        C0f9.A0D(1582408847, A06);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FaceCaptureProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A0H = AbstractC166987dD.A0S(1);
        this.A0F = AbstractC166987dD.A0S(1);
        this.A0G = AbstractC166987dD.A0S(1);
        this.A0C = AbstractC166987dD.A0S(1);
        this.A0I = AbstractC166987dD.A0S(1);
        this.A0D = AbstractC166987dD.A0S(1);
        this.A0E = AbstractC166987dD.A0S(1);
        this.A0J = AbstractC166987dD.A0X();
        this.A09 = new float[4];
        this.A0B = new float[4];
        this.A0A = new float[4];
        A01(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FaceCaptureProgressView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C14360o3.A0B(context, 1);
        this.A0H = AbstractC166987dD.A0S(1);
        this.A0F = AbstractC166987dD.A0S(1);
        this.A0G = AbstractC166987dD.A0S(1);
        this.A0C = AbstractC166987dD.A0S(1);
        this.A0I = AbstractC166987dD.A0S(1);
        this.A0D = AbstractC166987dD.A0S(1);
        this.A0E = AbstractC166987dD.A0S(1);
        this.A0J = AbstractC166987dD.A0X();
        this.A09 = new float[4];
        this.A0B = new float[4];
        this.A0A = new float[4];
        A01(context);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FaceCaptureProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
        C14360o3.A0B(context, 1);
    }
}
