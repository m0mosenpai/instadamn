package com.facebook.browser.lite.extensions.autofill.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

/* loaded from: classes11.dex */
public class AutofillLinearLayout extends LinearLayout {
    public int A00;

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.A00;
        if (i3 >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
    }

    public void setMaxHeight(int i) {
        this.A00 = i;
        invalidate();
    }

    public AutofillLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A00 = -1;
    }

    public AutofillLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A00 = -1;
    }

    public AutofillLinearLayout(Context context) {
        super(context);
        this.A00 = -1;
    }
}
