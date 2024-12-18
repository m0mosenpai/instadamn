package com.facebook.smartcapture.components;

import X.AbstractC166987dD;
import X.AbstractC43592JPx;
import X.C0f9;
import X.C14360o3;
import X.RunnableC49816LzN;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.R;

/* loaded from: classes8.dex */
public final class RectDetectionVisualizerView extends View {
    public Handler A00;
    public final Paint A01;
    public final Path A02;
    public final Path A03;
    public final Paint A04;
    public final Paint A05;
    public final Runnable A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RectDetectionVisualizerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        this.A02 = AbstractC166987dD.A0T();
        this.A03 = AbstractC166987dD.A0T();
        Paint A0R = AbstractC166987dD.A0R();
        AbstractC166987dD.A1R(A0R);
        A00(A0R);
        this.A05 = A0R;
        Paint A0R2 = AbstractC166987dD.A0R();
        AbstractC43592JPx.A1E(A0R2);
        A0R2.setStrokeWidth(getResources().getDimension(R.dimen.abc_control_corner_material));
        A00(A0R2);
        this.A04 = A0R2;
        Paint A0R3 = AbstractC166987dD.A0R();
        AbstractC166987dD.A1R(A0R3);
        A00(A0R3);
        this.A01 = A0R3;
        this.A06 = new RunnableC49816LzN(this);
    }

    private final void A00(Paint paint) {
        paint.setColor(0);
        paint.setDither(true);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setPathEffect(new CornerPathEffect(getResources().getDimension(R.dimen.abc_action_bar_elevation_material)));
        paint.setAntiAlias(true);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(-1497981615);
        super.onAttachedToWindow();
        Handler handler = new Handler();
        handler.post(this.A06);
        this.A00 = handler;
        C0f9.A0D(-428774044, A06);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(-237318060);
        super.onDetachedFromWindow();
        Handler handler = this.A00;
        if (handler != null) {
            handler.removeCallbacks(this.A06);
        }
        this.A00 = null;
        C0f9.A0D(-455829498, A06);
    }

    public final void setProgress(int i) {
        postInvalidate();
    }
}
