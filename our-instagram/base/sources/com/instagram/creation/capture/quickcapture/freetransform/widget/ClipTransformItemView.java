package com.instagram.creation.capture.quickcapture.freetransform.widget;

import X.AbstractC166987dD;
import X.AbstractC43594JPz;
import X.AbstractC50524MSc;
import X.C14360o3;
import X.JQ0;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.R;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class ClipTransformItemView extends View {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public RectF A04;
    public float A05;
    public Bitmap A06;
    public Matrix A07;
    public RectF A08;
    public RectF A09;
    public final float A0A;
    public final Path A0B;
    public final int A0C;
    public final Paint A0D;
    public final Paint A0E;
    public final Paint A0F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClipTransformItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        Paint A0R = AbstractC166987dD.A0R();
        A0R.setColor(-16777216);
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        A0R.setStyle(style);
        this.A0D = A0R;
        Paint A0R2 = AbstractC166987dD.A0R();
        AbstractC43594JPz.A14(context, A0R2, R.attr.igds_color_creation_tools_grey_04);
        A0R2.setStyle(style);
        this.A0F = A0R2;
        Paint A0R3 = AbstractC166987dD.A0R();
        A0R3.setColor(-1);
        A0R3.setStrokeWidth(1.0f);
        A0R3.setStyle(Paint.Style.STROKE);
        this.A0E = A0R3;
        this.A0C = context.getColor(R.color.black_50_transparent);
        this.A0A = 0.5625f;
        this.A04 = AbstractC166987dD.A0X();
        this.A0B = new Path();
        this.A09 = AbstractC166987dD.A0X();
        this.A08 = AbstractC166987dD.A0X();
        this.A07 = new Matrix();
        this.A05 = 1.7777778f;
        this.A01 = 1.0f;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        super.onDraw(canvas);
        RectF rectF = this.A04;
        canvas.drawRoundRect(rectF, rectF.width() * 0.1f, this.A04.width() * 0.1f, this.A0D);
        canvas.drawRect(this.A08, this.A0F);
        Bitmap bitmap = this.A06;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, this.A07, null);
        }
        canvas.save();
        Path path = this.A0B;
        C14360o3.A0B(path, 1);
        canvas.clipOutPath(path);
        canvas.drawColor(this.A0C);
        canvas.restore();
        RectF rectF2 = this.A04;
        canvas.drawRoundRect(rectF2, rectF2.width() * 0.1f, this.A04.width() * 0.1f, this.A0E);
    }

    private final void A00() {
        Matrix matrix;
        float centerX = this.A04.centerX();
        float centerY = this.A04.centerY();
        if (this.A06 != null) {
            matrix = new Matrix();
            RectF rectF = this.A09;
            matrix.preTranslate(rectF.left, rectF.top);
            matrix.preScale(this.A09.width() / r4.getWidth(), this.A09.height() / r4.getHeight());
            AbstractC50524MSc.A0D(matrix, this, centerX, centerY);
        } else {
            matrix = new Matrix();
        }
        this.A07 = matrix;
        invalidate();
    }

    private final void A01() {
        float width = this.A04.width();
        float f = width / this.A05;
        float centerX = this.A04.centerX();
        float centerY = this.A04.centerY();
        float f2 = width / 2.0f;
        float f3 = f / 2.0f;
        this.A09 = new RectF(centerX - f2, centerY - f3, centerX + f2, centerY + f3);
        A02(this);
    }

    public static final void A02(ClipTransformItemView clipTransformItemView) {
        float centerX = clipTransformItemView.A04.centerX();
        float centerY = clipTransformItemView.A04.centerY();
        Matrix matrix = new Matrix();
        AbstractC50524MSc.A0D(matrix, clipTransformItemView, centerX, centerY);
        matrix.mapRect(clipTransformItemView.A08, clipTransformItemView.A09);
        clipTransformItemView.A00();
    }

    public final Bitmap getBitmap() {
        return this.A06;
    }

    public final float getVideoAspect() {
        return this.A05;
    }

    public final void setBitmap(Bitmap bitmap) {
        this.A06 = bitmap;
        A00();
    }

    public final void setVideoAspect(float f) {
        if (this.A05 != f) {
            this.A05 = f;
        }
        A01();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        float f;
        float f2;
        float f3;
        super.onMeasure(i, i2);
        PointF pointF = new PointF(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        float measuredWidth = getMeasuredWidth() / getMeasuredHeight();
        float f4 = this.A0A;
        if (measuredWidth >= f4) {
            f = getMeasuredHeight() * 0.9f;
            f2 = pointF.x;
            f3 = (f4 * f) / 2.0f;
        } else {
            float measuredWidth2 = getMeasuredWidth() * 0.9f;
            f = measuredWidth2 / f4;
            f2 = pointF.x;
            f3 = measuredWidth2 / 2.0f;
        }
        float f5 = pointF.y;
        float f6 = f / 2.0f;
        this.A04 = new RectF(f2 - f3, f5 - f6, f2 + f3, f5 + f6);
        Path path = this.A0B;
        path.reset();
        RectF rectF = this.A04;
        path.addRoundRect(rectF, rectF.width() * 0.1f, this.A04.width() * 0.1f, Path.Direction.CW);
        A01();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ClipTransformItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ClipTransformItemView(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }

    public /* synthetic */ ClipTransformItemView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i2), JQ0.A03(i2, i));
    }
}
