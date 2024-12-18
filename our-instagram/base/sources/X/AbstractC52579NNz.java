package X;

import com.instagram.igds.components.form.IgFormField;
import com.instagram.leadgen.core.model.LeadGenFormBaseQuestion;

/* renamed from: X.NNz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC52579NNz extends NO5 implements InterfaceC58120Ppj {
    public C51761Mtk A00;
    public InterfaceC16660sJ A01;

    @Override // X.NO5, X.AbstractC50822Mcy
    public void A0G(LeadGenFormBaseQuestion leadGenFormBaseQuestion, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(leadGenFormBaseQuestion, 0);
        super.A0G(leadGenFormBaseQuestion, z, z2, z3);
        IgFormField igFormField = ((NO5) this).A02;
        igFormField.setInComboMode(new ViewOnClickListenerC55461OkG(this, 38));
        if (z3 && leadGenFormBaseQuestion.A0I) {
            igFormField.getBottomSubtitleInfoView().setText((CharSequence) null);
            AbstractC55110ObT.A02(igFormField, new P37(this, 3));
        }
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

    public final void setCurrentCountry(C51761Mtk c51761Mtk) {
        this.A00 = c51761Mtk;
    }

    @Override // X.InterfaceC58120Ppj
    public void setOnCountryPickerClickListener(InterfaceC16660sJ interfaceC16660sJ) {
        this.A01 = interfaceC16660sJ;
    }
}
