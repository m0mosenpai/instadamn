package com.instagram.leadgen.core.ui;

import X.AbstractC166997dE;
import X.AbstractC25228BEl;
import X.AbstractC31172DnG;
import X.AbstractC50822Mcy;
import X.AbstractC77703du;
import X.C12500ku;
import X.C14360o3;
import X.EnumC77673dr;
import X.JQ0;
import X.MSW;
import X.ViewOnClickListenerC55420OjV;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.leadgen.core.model.LeadGenFormBaseQuestion;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class LeadGenFormSingleMultipleChoiceQuestionView extends AbstractC50822Mcy {
    public final IgLinearLayout A00;
    public final IgTextView A01;
    public final IgTextView A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeadGenFormSingleMultipleChoiceQuestionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        View.inflate(context, R.layout.lead_gen_view_form_single_multiple_choice, this);
        this.A01 = AbstractC31172DnG.A0X(this, R.id.label_text_view);
        this.A00 = (IgLinearLayout) requireViewById(R.id.multiple_choice_options);
        this.A02 = AbstractC31172DnG.A0X(this, R.id.optional_label);
    }

    @Override // X.AbstractC50822Mcy
    public final void A0G(LeadGenFormBaseQuestion leadGenFormBaseQuestion, boolean z, boolean z2, boolean z3) {
        IgFrameLayout igFrameLayout;
        C14360o3.A0B(leadGenFormBaseQuestion, 0);
        ((AbstractC50822Mcy) this).A04 = z3;
        IgTextView igTextView = this.A01;
        igTextView.setText(leadGenFormBaseQuestion.A0A);
        IgLinearLayout igLinearLayout = this.A00;
        igLinearLayout.removeAllViews();
        if (z3 && leadGenFormBaseQuestion.A0I) {
            this.A02.setVisibility(0);
        } else {
            this.A02.setVisibility(8);
        }
        for (String str : leadGenFormBaseQuestion.A0D) {
            View inflate = AbstractC25228BEl.A0P(this).inflate(R.layout.lead_gen_view_form_single_multiple_choice_option, (ViewGroup) igLinearLayout, false);
            if ((inflate instanceof IgFrameLayout) && (igFrameLayout = (IgFrameLayout) inflate) != null) {
                TextView textView = (TextView) AbstractC166997dE.A0S(igFrameLayout, R.id.option_text);
                textView.setText(str);
                if (C14360o3.A0K(str, leadGenFormBaseQuestion.A00)) {
                    igFrameLayout.setSelected(true);
                }
                textView.setOnClickListener(new ViewOnClickListenerC55420OjV(igFrameLayout, leadGenFormBaseQuestion, this, str, z3));
                igLinearLayout.addView(igFrameLayout);
            }
        }
        AbstractC77703du.A05(igTextView, EnumC77673dr.A0T);
    }

    public final void setUpTextStyle(boolean z) {
        IgTextView igTextView = this.A01;
        if (z) {
            igTextView.setGravity(17);
            igTextView.setTextAppearance(R.style.igds_title);
            C12500ku c12500ku = new C12500ku(this.A00);
            while (c12500ku.hasNext()) {
                AbstractC166997dE.A0S(MSW.A0A(c12500ku), R.id.option_text).setTextAlignment(5);
            }
            return;
        }
        igTextView.setGravity(8388611);
        igTextView.setTextAppearance(R.style.igds_emphasized_label);
        igTextView.setTypeface(Typeface.DEFAULT_BOLD);
        C12500ku c12500ku2 = new C12500ku(this.A00);
        while (c12500ku2.hasNext()) {
            AbstractC166997dE.A0S(MSW.A0A(c12500ku2), R.id.option_text).setTextAlignment(4);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LeadGenFormSingleMultipleChoiceQuestionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LeadGenFormSingleMultipleChoiceQuestionView(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }

    public /* synthetic */ LeadGenFormSingleMultipleChoiceQuestionView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i2), JQ0.A03(i2, i));
    }
}
