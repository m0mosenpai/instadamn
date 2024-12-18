package com.instagram.ui.widget.tooltippopup;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.facebook.R;

/* loaded from: classes8.dex */
public class MaskingFrameLayout extends FrameLayout {
    public float A00;
    public Bitmap A01;
    public final Paint A02;
    public final Rect A03;
    public final Rect A04;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Bitmap bitmap = this.A01;
        if (bitmap != null) {
            Rect rect = this.A04;
            getGlobalVisibleRect(rect);
            float f = rect.left;
            float f2 = this.A00;
            rect.set(Math.round(f / f2), Math.round(rect.top / f2), Math.round(rect.right / f2), Math.round(rect.bottom / f2));
            Rect rect2 = this.A03;
            rect2.set(0, 0, getWidth(), getHeight());
            Paint paint = this.A02;
            canvas.drawBitmap(bitmap, rect, rect2, paint);
            paint.setAlpha(51);
            canvas.drawRect(0.0f, 0.0f, AbstractC166987dD.A07(this), AbstractC166987dD.A08(this), paint);
            paint.setAlpha(255);
        }
    }

    private void A00() {
        Paint paint = this.A02;
        AbstractC166987dD.A1N(getContext(), paint, R.color.grey_5);
        paint.setDither(true);
        paint.setFilterBitmap(true);
        AbstractC166997dE.A1D(paint, PorterDuff.Mode.SRC_ATOP);
    }

    public MaskingFrameLayout(Context context) {
        super(context);
        this.A02 = AbstractC166997dE.A0P();
        this.A03 = AbstractC166987dD.A0U();
        this.A04 = AbstractC166987dD.A0U();
        A00();
    }

    public MaskingFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A02 = AbstractC166997dE.A0P();
        this.A03 = AbstractC166987dD.A0U();
        this.A04 = AbstractC166987dD.A0U();
        A00();
    }

    public MaskingFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A02 = AbstractC166997dE.A0P();
        this.A03 = AbstractC166987dD.A0U();
        this.A04 = AbstractC166987dD.A0U();
        A00();
    }
}
