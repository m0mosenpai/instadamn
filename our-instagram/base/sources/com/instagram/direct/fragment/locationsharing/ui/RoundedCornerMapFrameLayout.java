package com.instagram.direct.fragment.locationsharing.ui;

import X.AbstractC13880nE;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.C0f9;
import X.C14360o3;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* loaded from: classes8.dex */
public final class RoundedCornerMapFrameLayout extends FrameLayout {
    public Path A00;
    public final float A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundedCornerMapFrameLayout(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
        this.A01 = AbstractC13880nE.A00(AbstractC166997dE.A0L(this), 12.0f);
        this.A00 = AbstractC166987dD.A0T();
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int A0N = AbstractC167017dG.A0N(canvas, -1959253627);
        canvas.save();
        canvas.clipPath(this.A00);
        super.draw(canvas);
        canvas.restore();
        C0f9.A0A(-534167924, A0N);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = C0f9.A06(1264662165);
        super.onSizeChanged(i, i2, i3, i4);
        RectF rectF = new RectF(0.0f, 0.0f, i, i2);
        Path A0T = AbstractC166987dD.A0T();
        this.A00 = A0T;
        float f = this.A01;
        A0T.addRoundRect(rectF, f, f, Path.Direction.CW);
        this.A00.close();
        C0f9.A0D(2044779744, A06);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundedCornerMapFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A01 = AbstractC13880nE.A00(AbstractC166997dE.A0L(this), 12.0f);
        this.A00 = AbstractC166987dD.A0T();
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundedCornerMapFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        this.A01 = AbstractC13880nE.A00(AbstractC166997dE.A0L(this), 12.0f);
        this.A00 = AbstractC166987dD.A0T();
        setWillNotDraw(false);
    }
}
