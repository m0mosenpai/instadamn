package com.instagram.creation.capture.quickcapture.sundial.edit;

import X.AbstractC31172DnG;
import X.C00O;
import X.C0f9;
import X.C14360o3;
import X.JQ0;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class StackedTimelineSpeedActionBar extends ConstraintLayout {
    public SeekBar A00;
    public IgTextView A01;
    public IgdsMediaButton A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StackedTimelineSpeedActionBar(Context context) {
        super(context, null);
        C14360o3.A0B(context, 1);
    }

    public final void setSpeedDoneButton(IgdsMediaButton igdsMediaButton) {
        C14360o3.A0B(igdsMediaButton, 0);
        this.A02 = igdsMediaButton;
    }

    public final void setSpeedLabel(IgTextView igTextView) {
        C14360o3.A0B(igTextView, 0);
        this.A01 = igTextView;
    }

    public final void setSpeedSlider(SeekBar seekBar) {
        C14360o3.A0B(seekBar, 0);
        this.A00 = seekBar;
    }

    public final IgdsMediaButton getSpeedDoneButton() {
        IgdsMediaButton igdsMediaButton = this.A02;
        if (igdsMediaButton != null) {
            return igdsMediaButton;
        }
        C14360o3.A0F("speedDoneButton");
        throw C00O.createAndThrow();
    }

    public final IgTextView getSpeedLabel() {
        IgTextView igTextView = this.A01;
        if (igTextView != null) {
            return igTextView;
        }
        C14360o3.A0F("speedLabel");
        throw C00O.createAndThrow();
    }

    public final SeekBar getSpeedSlider() {
        SeekBar seekBar = this.A00;
        if (seekBar != null) {
            return seekBar;
        }
        C14360o3.A0F("speedSlider");
        throw C00O.createAndThrow();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        int A06 = C0f9.A06(-1560600716);
        super.onFinishInflate();
        setSpeedSlider((SeekBar) requireViewById(R.id.speed_slider));
        setSpeedDoneButton((IgdsMediaButton) requireViewById(R.id.speed_done_button));
        setSpeedLabel(AbstractC31172DnG.A0X(this, R.id.speed_label));
        C0f9.A0D(-1286310370, A06);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StackedTimelineSpeedActionBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
    }

    public /* synthetic */ StackedTimelineSpeedActionBar(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i));
    }
}
