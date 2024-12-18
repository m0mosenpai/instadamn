package X;

import android.content.Context;
import com.facebook.phonenumbers.PhoneNumberUtil;
import com.instagram.igds.components.form.IgFormField;
import com.instagram.leadgen.core.model.LeadGenFormBaseQuestion;
import com.instagram.phonenumber.model.CountryCodeData;

/* loaded from: classes9.dex */
public final class NO2 extends AbstractC52579NNz {
    public C63481Snu A00;

    @Override // X.AbstractC52579NNz, X.NO5, X.AbstractC50822Mcy
    public final void A0G(LeadGenFormBaseQuestion leadGenFormBaseQuestion, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(leadGenFormBaseQuestion, 0);
        super.A0G(leadGenFormBaseQuestion, z, z2, z3);
        Context context = getContext();
        PhoneNumberUtil A01 = PhoneNumberUtil.A01(context);
        AnonymousClass793 anonymousClass793 = null;
        try {
            anonymousClass793 = A01.A0F(leadGenFormBaseQuestion.A00, null);
        } catch (C40f unused) {
        }
        if (anonymousClass793 != null) {
            String A04 = PhoneNumberUtil.A04(anonymousClass793);
            IgFormField igFormField = ((NO5) this).A02;
            C14360o3.A0A(A04);
            igFormField.setText(A04);
            setLastKnownInput(A0D(A04));
            C14360o3.A07(context);
            String A0H = A01.A0H(anonymousClass793);
            C14360o3.A07(A0H);
            FC3(C55205OeH.A00(context, A0H));
            return;
        }
        ((NO5) this).A02.setText("");
        C14360o3.A07(context);
        FC3(C55205OeH.A00(context, ""));
        A0F(leadGenFormBaseQuestion, "");
    }

    @Override // X.InterfaceC58120Ppj
    public final void FC3(C51761Mtk c51761Mtk) {
        String str;
        C14360o3.A0B(c51761Mtk, 0);
        ((AbstractC52579NNz) this).A00 = c51761Mtk;
        IgFormField igFormField = ((NO5) this).A02;
        CountryCodeData countryCodeData = (CountryCodeData) c51761Mtk.A00;
        if (countryCodeData != null) {
            str = countryCodeData.A02();
        } else {
            str = "";
        }
        igFormField.setComboFieldText(str, null);
        C63481Snu c63481Snu = this.A00;
        if (c63481Snu != null) {
            AbstractC31173DnH.A1D(c63481Snu, igFormField);
        }
        C63481Snu c63481Snu2 = new C63481Snu(getContext(), c51761Mtk.A03());
        this.A00 = c63481Snu2;
        igFormField.A0H(c63481Snu2);
        igFormField.setText(igFormField.getText());
    }
}
