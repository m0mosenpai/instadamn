package X;

import android.content.Context;
import com.instagram.igds.components.form.IgFormField;
import com.instagram.leadgen.core.model.LeadGenFormBaseQuestion;

/* renamed from: X.NNy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52578NNy extends NO5 implements InterfaceC58120Ppj {
    public InterfaceC16660sJ A00;
    public C51761Mtk A01;

    @Override // X.NO5, X.AbstractC50822Mcy
    public final void A0G(LeadGenFormBaseQuestion leadGenFormBaseQuestion, boolean z, boolean z2, boolean z3) {
        String str;
        C14360o3.A0B(leadGenFormBaseQuestion, 0);
        ((AbstractC50822Mcy) this).A00 = leadGenFormBaseQuestion;
        ((AbstractC50822Mcy) this).A06 = z2;
        ((AbstractC50822Mcy) this).A04 = z3;
        IgFormField igFormField = ((NO5) this).A02;
        igFormField.setPrismMode(z2);
        Context A0L = AbstractC166997dE.A0L(this);
        Integer num = leadGenFormBaseQuestion.A04;
        if (num != null) {
            str = AbstractC166997dE.A0p(A0L, num.intValue());
        } else {
            str = leadGenFormBaseQuestion.A0A;
        }
        igFormField.setLabelText(str);
        C51761Mtk A00 = C55205OeH.A00(A0L, leadGenFormBaseQuestion.A00);
        this.A01 = A00;
        String A03 = A00.A03();
        C14360o3.A0B(A03, 0);
        leadGenFormBaseQuestion.A00 = A03;
        igFormField.setText(A00.A04());
        igFormField.setRuleChecker(new P35(leadGenFormBaseQuestion, this, false, z));
        igFormField.setInPickerMode(new ViewOnClickListenerC55461OkG(this, 36));
    }

    @Override // X.InterfaceC58120Ppj
    public final void FC3(C51761Mtk c51761Mtk) {
        C14360o3.A0B(c51761Mtk, 0);
        this.A01 = c51761Mtk;
        LeadGenFormBaseQuestion leadGenFormBaseQuestion = ((AbstractC50822Mcy) this).A00;
        if (leadGenFormBaseQuestion != null && !C14360o3.A0K(c51761Mtk.A03(), leadGenFormBaseQuestion.A00)) {
            A0F(leadGenFormBaseQuestion, c51761Mtk.A03());
            InterfaceC57958Pn4 interfaceC57958Pn4 = ((AbstractC50822Mcy) this).A02;
            if (interfaceC57958Pn4 != null) {
                interfaceC57958Pn4.Dxu(leadGenFormBaseQuestion);
            }
            ((NO5) this).A02.setText(c51761Mtk.A04());
        }
    }

    @Override // X.InterfaceC58120Ppj
    public String getCurrentCountryCode() {
        String A03;
        C51761Mtk c51761Mtk = this.A01;
        if (c51761Mtk == null || (A03 = c51761Mtk.A03()) == null) {
            return "";
        }
        return A03;
    }

    public InterfaceC16660sJ getOnCountryPickerClickListener() {
        return this.A00;
    }

    @Override // X.InterfaceC58120Ppj
    public void setOnCountryPickerClickListener(InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = interfaceC16660sJ;
    }
}
