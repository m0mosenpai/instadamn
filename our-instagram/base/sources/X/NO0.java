package X;

import android.content.Context;
import com.facebook.phonenumbers.PhoneNumberUtil;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.form.IgFormField;
import com.instagram.leadgen.core.model.LeadGenFormBaseQuestion;
import com.instagram.phonenumber.model.CountryCodeData;

/* loaded from: classes9.dex */
public final class NO0 extends NOA {
    public C63481Snu A00;

    @Override // X.NOA, X.AbstractC50822Mcy
    public final void A0G(LeadGenFormBaseQuestion leadGenFormBaseQuestion, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(leadGenFormBaseQuestion, 0);
        super.A0G(leadGenFormBaseQuestion, z, z2, z3);
        IgFormField igFormField = ((NOA) this).A04;
        igFormField.setAutofillHints("phoneNational");
        Context context = getContext();
        PhoneNumberUtil A01 = PhoneNumberUtil.A01(context);
        AnonymousClass793 anonymousClass793 = null;
        try {
            anonymousClass793 = A01.A0F(leadGenFormBaseQuestion.A00, null);
        } catch (C40f unused) {
        }
        if (anonymousClass793 != null) {
            String A04 = PhoneNumberUtil.A04(anonymousClass793);
            C14360o3.A0A(A04);
            igFormField.setText(A04);
            setLastKnownInput(A0D(A04));
            C14360o3.A07(context);
            String A0H = A01.A0H(anonymousClass793);
            C14360o3.A07(A0H);
            FC3(C55205OeH.A00(context, A0H));
        } else {
            igFormField.setText("");
            C14360o3.A07(context);
            FC3(C55205OeH.A00(context, ""));
            A0F(leadGenFormBaseQuestion, "");
        }
        igFormField.A0H(new C55345Oi5(0, leadGenFormBaseQuestion, this));
    }

    @Override // X.NOA, X.InterfaceC58120Ppj
    public final void FC3(C51761Mtk c51761Mtk) {
        String str;
        C14360o3.A0B(c51761Mtk, 0);
        super.FC3(c51761Mtk);
        IgTextView igTextView = ((NOA) this).A03;
        CountryCodeData countryCodeData = (CountryCodeData) c51761Mtk.A00;
        if (countryCodeData != null) {
            str = countryCodeData.A02();
        } else {
            str = "";
        }
        igTextView.setText(str);
        C63481Snu c63481Snu = this.A00;
        if (c63481Snu != null) {
            AbstractC31173DnH.A1D(c63481Snu, ((NOA) this).A04);
        }
        C63481Snu c63481Snu2 = new C63481Snu(getContext(), c51761Mtk.A03());
        this.A00 = c63481Snu2;
        IgFormField igFormField = ((NOA) this).A04;
        igFormField.A0H(c63481Snu2);
        igFormField.setText(igFormField.getText());
    }
}
