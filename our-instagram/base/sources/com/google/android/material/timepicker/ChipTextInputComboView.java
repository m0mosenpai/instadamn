package com.google.android.material.timepicker;

import X.AbstractC167017dG;
import X.AbstractC25228BEl;
import X.C67755UxU;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.R;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes11.dex */
public class ChipTextInputComboView extends FrameLayout implements Checkable {
    public TextWatcher A00;
    public TextView A01;
    public final EditText A02;
    public final Chip A03;
    public final TextInputLayout A04;

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.A03.isChecked();
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        Chip chip = this.A03;
        chip.setChecked(z);
        EditText editText = this.A02;
        int i = 0;
        int i2 = 4;
        if (z) {
            i2 = 0;
        }
        editText.setVisibility(i2);
        if (z) {
            i = 8;
        }
        chip.setVisibility(i);
        if (isChecked()) {
            editText.requestFocus();
            if (!TextUtils.isEmpty(editText.getText())) {
                AbstractC167017dG.A18(editText);
            }
        }
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.A03.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        this.A03.setTag(i, obj);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        this.A03.toggle();
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(R.layout.material_time_chip, (ViewGroup) this, false);
        this.A03 = chip;
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(R.layout.material_time_input, (ViewGroup) this, false);
        this.A04 = textInputLayout;
        EditText editText = textInputLayout.A0F;
        this.A02 = editText;
        editText.setVisibility(4);
        C67755UxU c67755UxU = new C67755UxU(this);
        this.A00 = c67755UxU;
        editText.addTextChangedListener(c67755UxU);
        this.A02.setImeHintLocales(AbstractC25228BEl.A0M(this).getConfiguration().getLocales());
        addView(chip);
        addView(textInputLayout);
        this.A01 = (TextView) findViewById(R.id.material_label);
        editText.setSaveEnabled(false);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A02.setImeHintLocales(AbstractC25228BEl.A0M(this).getConfiguration().getLocales());
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ChipTextInputComboView(Context context) {
        this(context, null);
    }
}
