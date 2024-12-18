package com.instagram.survey.structuredsurvey.views;

import X.UCs;
import X.VAU;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes11.dex */
public class SurveyCheckboxListItemView extends UCs implements Checkable {
    public TextView A00;
    public CheckBox A01;
    public boolean A02;

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.A02;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        this.A02 = z;
        this.A01.setChecked(z);
        ((VAU) super.A00).A01 = this.A02;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.A02);
    }

    public SurveyCheckboxListItemView(Context context) {
        super(context);
        A00();
    }

    private void A00() {
        setContentView(R.layout.survey_checkbox_view);
        this.A00 = (TextView) requireViewById(R.id.survey_checkbox_text);
        this.A01 = (CheckBox) requireViewById(R.id.survey_checkbox);
    }

    public SurveyCheckboxListItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }
}
