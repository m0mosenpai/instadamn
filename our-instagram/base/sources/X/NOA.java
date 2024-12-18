package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.form.IgFormField;
import com.instagram.leadgen.core.model.LeadGenFormBaseQuestion;

/* loaded from: classes9.dex */
public abstract class NOA extends AbstractC50822Mcy implements InterfaceC58120Ppj {
    public C51761Mtk A00;
    public InterfaceC16660sJ A01;
    public boolean A02;
    public final IgTextView A03;
    public final IgFormField A04;
    public final View A05;

    public static final void A01(NOA noa) {
        InterfaceC57949Pmv p35;
        LeadGenFormBaseQuestion leadGenFormBaseQuestion = ((AbstractC50822Mcy) noa).A00;
        if (leadGenFormBaseQuestion != null) {
            if (noa.A02) {
                IgFormField igFormField = noa.A04;
                boolean A1Y = AbstractC25229BEm.A1Y(igFormField);
                p35 = new P36(igFormField, leadGenFormBaseQuestion, noa, A1Y, A1Y);
            } else {
                p35 = new P35(leadGenFormBaseQuestion, noa, true, false);
            }
            noa.A04.setRuleChecker(p35);
        }
    }

    @Override // X.AbstractC50822Mcy
    public void A0G(LeadGenFormBaseQuestion leadGenFormBaseQuestion, boolean z, boolean z2, boolean z3) {
        String str;
        C14360o3.A0B(leadGenFormBaseQuestion, 0);
        ((AbstractC50822Mcy) this).A04 = z3;
        ((AbstractC50822Mcy) this).A00 = leadGenFormBaseQuestion;
        IgFormField igFormField = this.A04;
        Context A0L = AbstractC166997dE.A0L(this);
        Integer num = leadGenFormBaseQuestion.A04;
        if (num != null) {
            str = AbstractC166997dE.A0p(A0L, num.intValue());
        } else {
            str = leadGenFormBaseQuestion.A0A;
        }
        igFormField.setLabelText(str);
        A01(this);
        igFormField.setInputType(C55205OeH.A00.A05(leadGenFormBaseQuestion));
        this.A05.setOnClickListener(new ViewOnClickListenerC55461OkG(this, 37));
        if (z3 && leadGenFormBaseQuestion.A0I) {
            AbstractC55110ObT.A02(igFormField, new P37(this, 2));
        }
    }

    public void FC3(C51761Mtk c51761Mtk) {
        C14360o3.A0B(c51761Mtk, 0);
        this.A00 = c51761Mtk;
        A01(this);
        Context context = getContext();
        this.A05.setContentDescription(AbstractC31174DnI.A0t(context, AbstractC166997dE.A0p(context, 2131964851), c51761Mtk.A03(), 2131964853));
    }

    public final IgTextView getCountryText() {
        return this.A03;
    }

    public final C51761Mtk getCurrentCountry() {
        return this.A00;
    }

    @Override // X.InterfaceC58120Ppj
    public String getCurrentCountryCode() {
        String A03;
        C51761Mtk c51761Mtk = this.A00;
        if (c51761Mtk == null || (A03 = c51761Mtk.A03()) == null) {
            return "";
        }
        return A03;
    }

    public InterfaceC16660sJ getOnCountryPickerClickListener() {
        return this.A01;
    }

    public final IgFormField getQuestionForm() {
        return this.A04;
    }

    public NOA(Context context, AttributeSet attributeSet, int i, InterfaceC16660sJ interfaceC16660sJ) {
        super(context, attributeSet, i);
        this.A01 = interfaceC16660sJ;
        View.inflate(context, R.layout.lead_gen_view_form_field_with_picker, this);
        IgFormField A0k = AbstractC31172DnG.A0k(this, R.id.form_field);
        this.A04 = A0k;
        A0k.setPrismMode(false);
        this.A05 = requireViewById(R.id.country_picker_field);
        this.A03 = AbstractC31172DnG.A0X(this, R.id.country_picker_text);
    }

    public final void setCurrentCountry(C51761Mtk c51761Mtk) {
        this.A00 = c51761Mtk;
    }

    @Override // X.InterfaceC58120Ppj
    public void setOnCountryPickerClickListener(InterfaceC16660sJ interfaceC16660sJ) {
        this.A01 = interfaceC16660sJ;
    }
}
