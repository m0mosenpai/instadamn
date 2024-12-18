package com.instagram.survey.structuredsurvey.views;

import X.C0f9;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.RadioButton;

/* loaded from: classes6.dex */
public class InertRadioButton extends RadioButton {
    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        return false;
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyMultiple(int i, int i2, KeyEvent keyEvent) {
        return false;
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        return false;
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onKeyShortcut(int i, KeyEvent keyEvent) {
        return false;
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        return false;
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0f9.A0C(1035249555, C0f9.A05(-779261832));
        return false;
    }

    public InertRadioButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public InertRadioButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public InertRadioButton(Context context) {
        super(context);
    }
}
