package com.instagram.survey.structuredsurvey.views;

import X.AbstractC167007dF;
import X.UCs;
import X.VAW;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import com.facebook.R;

/* loaded from: classes11.dex */
public class SurveyEditTextListItemView extends UCs {
    public EditText A00;

    public String getText() {
        return AbstractC167007dF.A0g(this.A00);
    }

    @Override // android.view.View
    public final void onStartTemporaryDetach() {
        ((VAW) super.A00).A00(AbstractC167007dF.A0g(this.A00));
        super.onStartTemporaryDetach();
    }

    public void setItemOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.A00.setOnFocusChangeListener(onFocusChangeListener);
    }

    public SurveyEditTextListItemView(Context context) {
        super(context);
        setContentView(R.layout.survey_editext_view);
        EditText editText = (EditText) requireViewById(R.id.survey_edit_text);
        this.A00 = editText;
        editText.setFocusable(true);
        this.A00.setFocusableInTouchMode(true);
    }

    public SurveyEditTextListItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setContentView(R.layout.survey_editext_view);
        EditText editText = (EditText) requireViewById(R.id.survey_edit_text);
        this.A00 = editText;
        editText.setFocusable(true);
        this.A00.setFocusableInTouchMode(true);
    }
}
