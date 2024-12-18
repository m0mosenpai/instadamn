package com.instagram.reels.fundraiser.view;

import X.AbstractC13880nE;
import X.C0f9;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.instagram.common.ui.base.IgEditText;

/* loaded from: classes4.dex */
public class DonationAmountIgEditText extends IgEditText {
    public DonationAmountIgEditText(Context context) {
        super(context);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int A05 = C0f9.A05(1311323137);
        if (motionEvent.getAction() == 1) {
            if (!isFocused()) {
                requestFocus();
            }
            AbstractC13880nE.A0R(this);
        }
        C0f9.A0C(819163787, A05);
        return true;
    }

    public DonationAmountIgEditText(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public DonationAmountIgEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public DonationAmountIgEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
