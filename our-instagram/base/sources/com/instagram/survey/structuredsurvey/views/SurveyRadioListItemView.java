package com.instagram.survey.structuredsurvey.views;

import X.UCs;
import X.VAV;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.Checkable;
import android.widget.RadioButton;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes11.dex */
public class SurveyRadioListItemView extends UCs implements Checkable {
    public TextView A00;
    public RadioButton A01;
    public boolean A02;

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.A02;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        this.A02 = z;
        this.A01.setChecked(z);
        ((VAV) super.A00).A01 = this.A02;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.A02);
    }

    public SurveyRadioListItemView(Context context) {
        super(context);
        A00();
    }

    public final void A00() {
        setContentView(R.layout.survey_radio_view);
        this.A00 = (TextView) requireViewById(R.id.survey_radio_text);
        this.A01 = (RadioButton) requireViewById(R.id.survey_radio_button);
    }

    public SurveyRadioListItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }
}
