package com.instagram.survey.structuredsurvey.views;

import X.AbstractC13880nE;
import X.AbstractC167007dF;
import X.UCs;
import X.VAX;
import X.VDB;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.TextView;

/* loaded from: classes11.dex */
public class SurveyWriteInListItemView extends UCs implements Checkable {
    public View.OnFocusChangeListener A00;
    public View A01;
    public Checkable A02;
    public EditText A03;
    public TextView A04;
    public VDB A05;

    public String getText() {
        EditText editText = this.A03;
        editText.getClass();
        return AbstractC167007dF.A0g(editText);
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        Checkable checkable = this.A02;
        checkable.getClass();
        return checkable.isChecked();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        Checkable checkable = this.A02;
        checkable.getClass();
        checkable.setChecked(z);
        ((VAX) super.A00).A01 = Boolean.valueOf(z).booleanValue();
        this.A01.getClass();
        this.A03.getClass();
        View view = this.A01;
        if (z) {
            view.setVisibility(0);
            this.A03.setVisibility(0);
            return;
        }
        view.setVisibility(4);
        this.A03.setVisibility(4);
        Activity activity = (Activity) getContext();
        AbstractC13880nE.A0O(getRootView());
        Window window = activity.getWindow();
        window.getClass();
        window.setSoftInputMode(3);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        this.A02.getClass();
        setChecked(!r0.isChecked());
    }

    public SurveyWriteInListItemView(Context context) {
        super(context);
    }

    @Override // android.view.View
    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        VAX vax = (VAX) super.A00;
        vax.A02.A00(getText());
    }

    public void setItemOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.A00 = onFocusChangeListener;
    }

    public SurveyWriteInListItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
