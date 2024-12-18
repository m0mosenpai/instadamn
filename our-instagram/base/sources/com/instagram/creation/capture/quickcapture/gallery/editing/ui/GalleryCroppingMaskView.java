package com.instagram.creation.capture.quickcapture.gallery.editing.ui;

import X.A2B;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC226539zB;
import X.C14360o3;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.R;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class GalleryCroppingMaskView extends View {
    public Path A00;
    public Matrix A01;
    public Rect A02;
    public final int A03;
    public final Paint A04;
    public final Paint A05;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GalleryCroppingMaskView(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        AbstractC167007dF.A0r(canvas);
        setLayerType(2, null);
        canvas.setMatrix(this.A01);
        canvas.drawColor(this.A03);
        Path path = this.A00;
        if (path != null) {
            AbstractC226539zB.A00(path, this.A02);
            canvas.drawPath(path, this.A05);
            canvas.drawPath(path, this.A04);
        }
        canvas.restore();
    }

    public final void setMask(Rect rect, Matrix matrix, Path path) {
        AbstractC167017dG.A1N(rect, matrix);
        this.A01 = matrix;
        this.A00 = path;
        this.A02 = rect;
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GalleryCroppingMaskView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        Paint A0R = AbstractC166987dD.A0R();
        A0R.setAntiAlias(true);
        AbstractC166987dD.A1R(A0R);
        AbstractC166997dE.A1D(A0R, PorterDuff.Mode.CLEAR);
        this.A05 = A0R;
        this.A03 = context.getColor(R.color.black_60_transparent);
        this.A02 = AbstractC166987dD.A0U();
        this.A04 = A2B.A00();
    }

    public /* synthetic */ GalleryCroppingMaskView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GalleryCroppingMaskView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }
}
