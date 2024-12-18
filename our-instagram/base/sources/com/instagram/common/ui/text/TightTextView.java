package com.instagram.common.ui.text;

import X.C0f9;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import com.instagram.common.accessibility.AccessibleTextView;

/* loaded from: classes3.dex */
public class TightTextView extends AccessibleTextView {
    public boolean A00;
    public boolean A01;

    public TightTextView(Context context) {
        super(context);
        this.A01 = true;
        this.A00 = false;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        Layout layout;
        int A06 = C0f9.A06(-744288736);
        super.onMeasure(i, i2);
        if (!this.A01) {
            i3 = 1808413649;
        } else {
            if (View.MeasureSpec.getMode(i) != 1073741824 && (layout = getLayout()) != null) {
                int lineCount = layout.getLineCount();
                float f = 0.0f;
                for (int i4 = 0; i4 < lineCount; i4++) {
                    if (layout.getLineWidth(i4) > f) {
                        f = layout.getLineWidth(i4);
                    }
                }
                int ceil = ((int) Math.ceil(f)) + getCompoundPaddingLeft() + getCompoundPaddingRight();
                if (ceil < getMeasuredWidth() && ceil > getMinimumWidth()) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(ceil, Integer.MIN_VALUE), i2);
                }
                if (!this.A00) {
                    int i5 = 8388611;
                    if (ceil < getMinimumWidth()) {
                        i5 = 17;
                    }
                    setGravity(i5);
                }
            }
            i3 = 481974070;
        }
        C0f9.A0D(i3, A06);
    }

    public void setDisableGravityOnMeasure(boolean z) {
        this.A00 = z;
    }

    public void setTightMeasurementEnabled(boolean z) {
        this.A01 = z;
    }

    public TightTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A01 = true;
        this.A00 = false;
    }

    public TightTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A01 = true;
        this.A00 = false;
    }
}
