package com.instagram.ui.widget.fixedtabbar;

import X.AbstractC13690mv;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC43594JPz;
import X.AbstractC63123SdR;
import X.C14360o3;
import X.C14640oc;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import java.util.List;

/* loaded from: classes8.dex */
public final class FixedTabBarIndicator extends View {
    public int A00;
    public int A01;
    public List A02;
    public boolean A03;
    public int A04;
    public boolean A05;
    public final Paint A06;
    public final Rect A07;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        List list = this.A02;
        if (list != null && !list.isEmpty() && this.A01 >= 0) {
            canvas.drawRect(this.A07, this.A06);
        }
    }

    public final void setTabs(List list) {
        C14360o3.A0B(list, 0);
        List list2 = this.A02;
        if (list2 == null || list2.size() != list.size()) {
            this.A05 = true;
        }
        this.A02 = list;
    }

    public final void A00(int i, float f) {
        this.A01 = i;
        Rect rect = this.A07;
        rect.offsetTo((int) (this.A04 * (i + f)), 0);
        if (C14640oc.A0E()) {
            rect.offset((this.A04 - rect.width()) / 2, 0);
        }
        postInvalidateOnAnimation();
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        List list = this.A02;
        if ((this.A05 || z) && list != null && !list.isEmpty()) {
            this.A05 = false;
            this.A03 = true;
            View A0E = AbstractC43594JPz.A0E(this);
            this.A04 = AbstractC43594JPz.A08(A0E, A0E.getWidth()) / list.size();
            if (C14640oc.A0E()) {
                int i5 = this.A00;
                Context A0L = AbstractC166997dE.A0L(this);
                this.A07.set(0, 0, i5 + AbstractC13690mv.A01(A0L, 20) + AbstractC13690mv.A01(A0L, 20), getHeight());
            } else {
                this.A07.set(0, 0, this.A04, getHeight());
            }
            int i6 = this.A01;
            if (i6 >= 0) {
                A00(i6, 0.0f);
            }
        }
    }

    public final void setLongestContentWidth(int i) {
        this.A00 = i;
    }

    public FixedTabBarIndicator(Context context) {
        super(context);
        this.A07 = AbstractC166987dD.A0U();
        this.A06 = AbstractC166987dD.A0R();
        this.A01 = -1;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (C14640oc.A0E()) {
            i2 = View.MeasureSpec.makeMeasureSpec(AbstractC167017dG.A07(AbstractC166997dE.A0L(this)), AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO);
        }
        super.onMeasure(i, i2);
    }

    public FixedTabBarIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A07 = AbstractC166987dD.A0U();
        this.A06 = AbstractC166987dD.A0R();
        this.A01 = -1;
    }

    public FixedTabBarIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A07 = AbstractC166987dD.A0U();
        this.A06 = AbstractC166987dD.A0R();
        this.A01 = -1;
    }
}
