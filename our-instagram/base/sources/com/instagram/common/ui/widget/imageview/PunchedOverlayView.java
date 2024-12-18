package com.instagram.common.ui.widget.imageview;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC46675Kks;
import X.C0f9;
import X.C14360o3;
import X.KL0;
import X.KL1;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes8.dex */
public final class PunchedOverlayView extends View {
    public float A00;
    public int A01;
    public Paint A02;
    public Path A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PunchedOverlayView(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
        this.A01 = Color.argb(192, 0, 0, 0);
        this.A00 = 1.0f;
    }

    public final void setDarkenColor(int i) {
        this.A01 = i;
    }

    public final void A00(AbstractC46675Kks abstractC46675Kks) {
        int width = getWidth();
        int height = getHeight();
        Path A0T = AbstractC166987dD.A0T();
        A0T.setFillType(Path.FillType.EVEN_ODD);
        A0T.addRect(0.0f, 0.0f, width, height, Path.Direction.CW);
        this.A03 = A0T;
        if (abstractC46675Kks instanceof KL1) {
            float f = ((KL1) abstractC46675Kks).A00;
            if (f > 0.0f) {
                A0T.addCircle(r11.A01, r11.A02, f, Path.Direction.CCW);
            }
        } else {
            KL0 kl0 = (KL0) abstractC46675Kks;
            RectF rectF = kl0.A01;
            float f2 = kl0.A00;
            A0T.addRoundRect(rectF, f2, f2, Path.Direction.CCW);
        }
        Paint A0P = AbstractC166997dE.A0P();
        A0P.setColor(this.A01);
        A0P.setAlpha((int) (this.A00 * Color.alpha(this.A01)));
        this.A02 = A0P;
        invalidate();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int A0N = AbstractC167017dG.A0N(canvas, 1072568178);
        Path path = this.A03;
        if (path != null) {
            Paint paint = this.A02;
            if (paint != null) {
                canvas.drawPath(path, paint);
                float f = this.A00;
                if (f < 1.0f) {
                    float min = Math.min(f + (1.0f / 0.0f), 1.0f);
                    this.A00 = min;
                    Paint paint2 = this.A02;
                    if (paint2 != null) {
                        paint2.setAlpha((int) (min * Color.alpha(this.A01)));
                    }
                    postInvalidateOnAnimation();
                }
            } else {
                IllegalArgumentException A12 = AbstractC166987dD.A12("Required value was null.");
                C0f9.A0A(513994468, A0N);
                throw A12;
            }
        }
        C0f9.A0A(-2144461042, A0N);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PunchedOverlayView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC167017dG.A1P(context, attributeSet);
        this.A01 = Color.argb(192, 0, 0, 0);
        this.A00 = 1.0f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PunchedOverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC167017dG.A1P(context, attributeSet);
        this.A01 = Color.argb(192, 0, 0, 0);
        this.A00 = 1.0f;
    }
}
