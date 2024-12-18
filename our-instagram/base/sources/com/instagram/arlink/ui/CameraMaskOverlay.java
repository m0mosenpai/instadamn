package com.instagram.arlink.ui;

import X.AbstractC13880nE;
import X.AbstractC167007dF;
import X.AbstractC56842jH;
import X.C0f9;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

/* loaded from: classes11.dex */
public class CameraMaskOverlay extends ImageView {
    public View A00;
    public boolean A01;
    public final Paint A02;
    public final Path A03;

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        Path path = this.A03;
        if (!path.isEmpty()) {
            if (this.A01) {
                canvas.drawPath(path, this.A02);
            }
            canvas.clipPath(path, Region.Op.DIFFERENCE);
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.ImageView
    public void setImageAlpha(int i) {
        this.A01 = AbstractC167007dF.A1Q(i, 255);
        this.A02.setColor(AbstractC56842jH.A06(-16777216, i));
        super.setImageAlpha(i);
    }

    public CameraMaskOverlay(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A03 = new Path();
        this.A02 = new Paint();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = C0f9.A06(-1657312850);
        super.onSizeChanged(i, i2, i3, i4);
        View view = this.A00;
        if (view != null) {
            RectF rectF = AbstractC13880nE.A01;
            RectF rectF2 = new RectF();
            AbstractC13880nE.A0M(rectF2, view);
            if (rectF2.width() > 0.0f && rectF2.height() > 0.0f) {
                Path path = this.A03;
                path.reset();
                path.addOval(rectF2, Path.Direction.CW);
            }
            this.A02.setColor(-16777216);
        }
        C0f9.A0D(1157724998, A06);
    }

    public void setCameraView(View view) {
        this.A00 = view;
    }

    public CameraMaskOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A03 = new Path();
        this.A02 = new Paint();
    }

    public CameraMaskOverlay(Context context) {
        super(context);
        this.A03 = new Path();
        this.A02 = new Paint();
    }
}
