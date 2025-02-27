package com.instagram.survey.structuredsurvey.views;

import X.UCs;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes11.dex */
public class SurveyImageBlockListItemView extends UCs {
    public TextView A00;
    public TextView A01;

    public SurveyImageBlockListItemView(Context context) {
        super(context);
        A00();
    }

    private void A00() {
        setContentView(R.layout.survey_imageblock_view);
        this.A01 = (TextView) requireViewById(R.id.survey_imageblock_text);
        this.A00 = (TextView) requireViewById(R.id.survey_imageblock_button);
    }

    public SurveyImageBlockListItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }
}
