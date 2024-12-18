package com.instagram.secondaryaccount.ui;

import X.C14360o3;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class UsernameSuggestionContainerView extends LinearLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UsernameSuggestionContainerView(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getResources().getDimensionPixelOffset(R.dimen.abc_alert_dialog_button_dimen) * 5, Integer.MIN_VALUE));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UsernameSuggestionContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
    }
}
