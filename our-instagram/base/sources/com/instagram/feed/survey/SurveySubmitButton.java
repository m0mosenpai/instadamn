package com.instagram.feed.survey;

import X.C14360o3;
import android.content.Context;
import android.util.AttributeSet;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;

/* loaded from: classes8.dex */
public final class SurveySubmitButton extends IgTextView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SurveySubmitButton(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
    }

    @Override // android.view.View
    public void setActivated(boolean z) {
        super.setActivated(z);
        boolean isActivated = isActivated();
        int i = R.drawable.not_activated_survey_submit_button_background;
        if (isActivated) {
            i = R.drawable.activated_survey_submit_button_background;
        }
        setBackgroundResource(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SurveySubmitButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SurveySubmitButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
    }
}
