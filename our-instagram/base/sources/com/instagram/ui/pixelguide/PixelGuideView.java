package com.instagram.ui.pixelguide;

import X.AbstractC13880nE;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AnonymousClass001;
import X.C0f9;
import X.C49632LwP;
import X.MPE;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.R;

/* loaded from: classes8.dex */
public class PixelGuideView extends View {
    public int A00;
    public int A01;
    public int A02;
    public Paint A03;
    public Paint A04;
    public Rect A05;
    public MPE A06;
    public String A07;
    public int A08;
    public int A09;
    public int A0A;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i = this.A09;
        if (i != 0) {
            this.A06.AQQ(canvas, i, this.A08);
            canvas.drawText(this.A07, this.A0A, this.A02, this.A03);
        }
    }

    public PixelGuideView(Context context) {
        super(context);
        A00();
    }

    private void A00() {
        Paint A0R = AbstractC166987dD.A0R();
        this.A04 = A0R;
        A0R.setColor(587137024);
        Context context = getContext();
        this.A07 = AnonymousClass001.A0N("Device Density: ", AbstractC13880nE.A0I(context).density);
        this.A00 = getLayoutDirection();
        Paint A0P = AbstractC166997dE.A0P();
        this.A03 = A0P;
        Resources resources = getResources();
        A0P.setTextSize(AbstractC166987dD.A04(resources, R.dimen.account_group_management_row_text_size));
        this.A03.setColor(resources.getColor(R.color.green_5, null));
        Rect A0U = AbstractC166987dD.A0U();
        this.A05 = A0U;
        Paint paint = this.A03;
        String str = this.A07;
        paint.getTextBounds(str, 0, str.length(), A0U);
        this.A02 = this.A05.height();
        int i = this.A00;
        int i2 = R.dimen.add_account_icon_circle_radius;
        if (i == 0) {
            i2 = R.dimen.account_group_management_clickable_width;
        }
        this.A01 = resources.getDimensionPixelSize(i2);
        this.A06 = new C49632LwP(AbstractC166987dD.A0C(context, 8));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int i5;
        int A06 = C0f9.A06(855974320);
        super.onSizeChanged(i, i2, i3, i4);
        this.A09 = i;
        this.A08 = i2;
        if (this.A00 == 0) {
            i5 = (i - this.A05.width()) - this.A01;
        } else {
            i5 = this.A01;
        }
        this.A0A = i5;
        C0f9.A0D(370788972, A06);
    }

    public PixelGuideView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }

    public PixelGuideView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }
}
