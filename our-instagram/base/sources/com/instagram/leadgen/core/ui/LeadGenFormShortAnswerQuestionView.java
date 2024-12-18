package com.instagram.leadgen.core.ui;

import X.AbstractC31172DnG;
import X.AbstractC31173DnH;
import X.AbstractC50822Mcy;
import X.AbstractC55110ObT;
import X.AbstractC77703du;
import X.C14360o3;
import X.C55345Oi5;
import X.EnumC77673dr;
import X.JQ0;
import X.P35;
import X.P37;
import android.content.Context;
import android.graphics.Typeface;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.form.IgFormField;
import com.instagram.leadgen.core.model.LeadGenFormBaseQuestion;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class LeadGenFormShortAnswerQuestionView extends AbstractC50822Mcy {
    public TextWatcher A00;
    public final IgFormField A01;
    public final IgTextView A02;
    public final IgTextView A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeadGenFormShortAnswerQuestionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        View.inflate(context, R.layout.lead_gen_view_form_short_answer, this);
        this.A02 = AbstractC31172DnG.A0X(this, R.id.label_text_view);
        this.A01 = AbstractC31172DnG.A0k(this, R.id.answer_form_field);
        this.A03 = AbstractC31172DnG.A0X(this, R.id.optional_label);
    }

    @Override // X.AbstractC50822Mcy
    public final void A0G(LeadGenFormBaseQuestion leadGenFormBaseQuestion, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(leadGenFormBaseQuestion, 0);
        ((AbstractC50822Mcy) this).A00 = leadGenFormBaseQuestion;
        ((AbstractC50822Mcy) this).A04 = z3;
        IgTextView igTextView = this.A02;
        igTextView.setText(leadGenFormBaseQuestion.A0A);
        setLastKnownInput(leadGenFormBaseQuestion.A00);
        ((AbstractC50822Mcy) this).A06 = z2;
        IgFormField igFormField = this.A01;
        igFormField.setPrismMode(z2);
        igFormField.setText(leadGenFormBaseQuestion.A00);
        igFormField.setRuleChecker(new P35(leadGenFormBaseQuestion, this, false, z));
        A0I();
        igFormField.setInputType(16385);
        AbstractC55110ObT.A00(igFormField);
        if (z3 && leadGenFormBaseQuestion.A0I) {
            this.A03.setVisibility(0);
            AbstractC55110ObT.A02(igFormField, new P37(this, 4));
        } else {
            this.A03.setVisibility(8);
        }
        AbstractC77703du.A05(igTextView, EnumC77673dr.A0T);
    }

    public final void A0I() {
        TextWatcher textWatcher = this.A00;
        if (textWatcher != null) {
            AbstractC31173DnH.A1D(textWatcher, this.A01);
        }
        LeadGenFormBaseQuestion leadGenFormBaseQuestion = ((AbstractC50822Mcy) this).A00;
        if (leadGenFormBaseQuestion != null) {
            C55345Oi5 c55345Oi5 = new C55345Oi5(2, leadGenFormBaseQuestion, this);
            this.A00 = c55345Oi5;
            this.A01.A0H(c55345Oi5);
        }
    }

    public final String getText() {
        return this.A01.getText().toString();
    }

    public final void setUpLabelTextStyle(boolean z) {
        IgTextView igTextView = this.A02;
        if (z) {
            igTextView.setGravity(17);
            igTextView.setTextAppearance(R.style.igds_title);
        } else {
            igTextView.setGravity(8388611);
            igTextView.setTextAppearance(R.style.igds_emphasized_label);
            igTextView.setTypeface(Typeface.DEFAULT_BOLD);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LeadGenFormShortAnswerQuestionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LeadGenFormShortAnswerQuestionView(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }

    public /* synthetic */ LeadGenFormShortAnswerQuestionView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i2), JQ0.A03(i2, i));
    }
}
