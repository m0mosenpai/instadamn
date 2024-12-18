package com.instagram.survey.structuredsurvey.views;

import X.UCs;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.R;

/* loaded from: classes11.dex */
public class SurveySpaceListItemView extends UCs {
    public View A00;

    public SurveySpaceListItemView(Context context) {
        super(context);
        setContentView(R.layout.survey_space_view);
        this.A00 = requireViewById(R.id.survey_space_view);
    }

    public SurveySpaceListItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setContentView(R.layout.survey_space_view);
        this.A00 = requireViewById(R.id.survey_space_view);
    }
}
