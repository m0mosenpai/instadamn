package com.instagram.arlink.ui;

import X.AbstractC166987dD;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.R;

/* loaded from: classes8.dex */
public class CoachMarkOverlay extends View {
    public int A00;
    public Bitmap A01;
    public final Paint A02;
    public final RectF A03;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.drawColor(this.A00);
        Bitmap bitmap = this.A01;
        if (bitmap != null) {
            RectF rectF = this.A03;
            canvas.drawBitmap(bitmap, rectF.left, rectF.top, this.A02);
        }
        super.onDraw(canvas);
    }

    public void setSpotlightAlpha(int i) {
        this.A02.setAlpha(i);
        invalidate();
    }

    public CoachMarkOverlay(Context context) {
        super(context);
        this.A02 = AbstractC166987dD.A0R();
        this.A03 = AbstractC166987dD.A0X();
        this.A00 = getContext().getColor(R.color.black_60_transparent);
    }

    public CoachMarkOverlay(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A02 = AbstractC166987dD.A0R();
        this.A03 = AbstractC166987dD.A0X();
        this.A00 = getContext().getColor(R.color.black_60_transparent);
    }

    public CoachMarkOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A02 = AbstractC166987dD.A0R();
        this.A03 = AbstractC166987dD.A0X();
        this.A00 = getContext().getColor(R.color.black_60_transparent);
    }
}
