package com.google.android.material.timepicker;

import X.C0f9;
import X.C110964z8;
import X.C44406Jjj;
import X.C68706Vai;
import X.ViewOnTouchListenerC70251WNw;
import X.WNN;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;

/* loaded from: classes11.dex */
public class TimePickerView extends ConstraintLayout {
    public final View.OnClickListener A00;
    public final Chip A01;
    public final Chip A02;
    public final MaterialButtonToggleGroup A03;
    public final ClockFaceView A04;
    public final ClockHandView A05;

    private void A00() {
        if (this.A03.getVisibility() == 0) {
            C110964z8 c110964z8 = new C110964z8();
            c110964z8.A0I(this);
            int i = 1;
            if (getLayoutDirection() == 0) {
                i = 2;
            }
            c110964z8.A09(R.id.material_clock_display, i);
            c110964z8.A0G(this);
        }
    }

    public TimePickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A00 = new WNN(this, 53);
        LayoutInflater.from(context).inflate(R.layout.material_timepicker, this);
        this.A04 = (ClockFaceView) findViewById(R.id.material_clock_face);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(R.id.material_clock_period_toggle);
        this.A03 = materialButtonToggleGroup;
        materialButtonToggleGroup.A06.add(new C68706Vai(this));
        this.A02 = (Chip) findViewById(R.id.material_minute_tv);
        this.A01 = (Chip) findViewById(R.id.material_hour_tv);
        this.A05 = (ClockHandView) findViewById(R.id.material_clock_hand);
        ViewOnTouchListenerC70251WNw viewOnTouchListenerC70251WNw = new ViewOnTouchListenerC70251WNw(2, this, new GestureDetector(getContext(), new C44406Jjj(this, 3)));
        this.A02.setOnTouchListener(viewOnTouchListenerC70251WNw);
        this.A01.setOnTouchListener(viewOnTouchListenerC70251WNw);
        Chip chip = this.A02;
        chip.setTag(R.id.selection_type, 12);
        Chip chip2 = this.A01;
        chip2.setTag(R.id.selection_type, 10);
        View.OnClickListener onClickListener = this.A00;
        chip.setOnClickListener(onClickListener);
        chip2.setOnClickListener(onClickListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(1296839871);
        super.onAttachedToWindow();
        A00();
        C0f9.A0D(-432852972, A06);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            A00();
        }
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TimePickerView(Context context) {
        this(context, null);
    }
}
