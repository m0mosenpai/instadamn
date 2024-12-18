package com.instagram.survey.structuredsurvey.views;

import X.UCs;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes11.dex */
public class SurveyMessageListItemView extends UCs {
    public TextView A00;

    public SurveyMessageListItemView(Context context) {
        super(context);
        setContentView(R.layout.survey_message_view);
        this.A00 = (TextView) requireViewById(R.id.survey_message_text);
    }

    public SurveyMessageListItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setContentView(R.layout.survey_message_view);
        this.A00 = (TextView) requireViewById(R.id.survey_message_text);
    }
}
