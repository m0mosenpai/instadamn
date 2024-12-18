package X;

import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import com.facebook.R;
import com.instagram.actionbar.ActionButton;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.model.business.PublicPhoneContact;
import com.instagram.phonenumber.model.CountryCodeData;
import com.instagram.ui.widget.editphonenumber.EditPhoneNumberView;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes6.dex */
public final class EO4 extends C53Z implements InterfaceC37212GaN, InterfaceC60122ou, GY8 {
    public static final String A09 = AnonymousClass001.A0R(EO4.class.getName(), ".EXTRA_PUBLIC_PHONE_CONTACT");
    public static final String __redex_internal_original_name = "BusinessPhoneNumberEditFragment";
    public RadioGroup A00;
    public ActionButton A01;
    public EditPhoneNumberView A02;
    public String A03;
    public String A04;
    public BusinessFlowAnalyticsLogger A06;
    public PublicPhoneContact A07;
    public boolean A05 = false;
    public final Handler A08 = AbstractC167007dF.A0J();

    @Override // X.InterfaceC37212GaN
    public final boolean DCu(int i) {
        return false;
    }

    @Override // X.InterfaceC37212GaN
    public final void DYO() {
    }

    @Override // X.InterfaceC37212GaN
    public final void DyV() {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "business_edit_phone_number";
    }

    public static void A00(EO4 eo4) {
        PublicPhoneContact publicPhoneContact = eo4.A07;
        boolean z = false;
        C18C.A0F(AbstractC167007dF.A1W(publicPhoneContact));
        if (!TextUtils.isEmpty(publicPhoneContact.A03) || !TextUtils.isEmpty(AbstractC167007dF.A0g(eo4.A02.A01))) {
            z = !eo4.A02.getPhoneNumber().equals(eo4.A07.A03);
        }
        eo4.A05 = z;
    }

    @Override // X.InterfaceC37212GaN
    public final void CxI() {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A06;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Cm3(new Y7A("business_contact_info", "edit_profile", "area_code", null, null, Collections.singletonMap("area_code", this.A02.getCountryCode()), null, null));
        }
    }

    @Override // X.InterfaceC37212GaN
    public final void Dx4() {
        if (this.A01 != null) {
            A00(this);
            this.A01.setEnabled(this.A05);
        }
    }

    @Override // X.GY8
    public final void ESF(CountryCodeData countryCodeData) {
        this.A02.setCountryCodeWithPlus(countryCodeData);
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A06;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Cim(new Y7A("business_contact_info", "edit_profile", null, null, null, null, Collections.singletonMap("area_code", this.A02.getCountryCode()), null));
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.Ffp, java.lang.Object] */
    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        ?? obj = new Object();
        C35197Ffp.A01(AbstractC166997dE.A0N(this), obj, 2131969565);
        ActionButton A00 = C31722DwR.A00(ViewOnClickListenerC35690FpP.A00(this, 0), interfaceC56362iU, obj);
        this.A01 = A00;
        A00.setEnabled(this.A05);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        EditPhoneNumberView editPhoneNumberView = (EditPhoneNumberView) view.requireViewById(R.id.phone_number_edit_view);
        this.A02 = editPhoneNumberView;
        EditPhoneNumberView.A01(this, null, getSession(), null, null, this, editPhoneNumberView);
        EditPhoneNumberView editPhoneNumberView2 = this.A02;
        PublicPhoneContact publicPhoneContact = this.A07;
        publicPhoneContact.getClass();
        editPhoneNumberView2.setupEditPhoneNumberView(publicPhoneContact.A01, this.A07.A02);
        String str = this.A07.A00;
        str.getClass();
        this.A03 = str;
        if ("UNKNOWN".equals(str)) {
            this.A03 = "TEXT";
        }
        this.A00 = (RadioGroup) view.requireViewById(R.id.contact_method_group);
        AbstractC166997dE.A0T(view, R.id.contact_method_header).getPaint().setFakeBoldText(true);
        this.A00.setOnCheckedChangeListener(null);
        this.A00.removeAllViews();
        this.A04 = new String(this.A03);
        ArrayList A1E = AbstractC166987dD.A1E();
        C35124FeR.A00("CALL", AbstractC166997dE.A0N(this).getString(2131954458), A1E);
        C35124FeR.A00("TEXT", AbstractC166997dE.A0N(this).getString(2131975283), A1E);
        RadioGroup.LayoutParams layoutParams = new RadioGroup.LayoutParams(-1, -2, 16.0f);
        int i = 0;
        while (i < A1E.size()) {
            CompoundButton compoundButton = (CompoundButton) AbstractC31175DnJ.A06(this).inflate(R.layout.contact_method_radio_button_item, (ViewGroup) null);
            compoundButton.setText(((C35124FeR) A1E.get(i)).A03);
            compoundButton.setLayoutParams(layoutParams);
            int i2 = i + 1;
            compoundButton.setId(i2);
            this.A00.addView(compoundButton);
            AbstractC31175DnJ.A06(this).inflate(R.layout.row_divider, this.A00);
            if (((C35124FeR) A1E.get(i)).A02.equals(this.A03)) {
                compoundButton.setChecked(true);
            }
            i = i2;
        }
        this.A00.setOnCheckedChangeListener(new C35748Fqg(this, 0));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(796659274);
        super.onCreate(bundle);
        EVO.A00(this);
        this.A07 = (PublicPhoneContact) requireArguments().getParcelable(A09);
        this.A06 = AbstractC151606s6.A00(EnumC151596s5.A07, this, getSession(), AbstractC166997dE.A0n());
        C0f9.A09(2091854250, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1648518273);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.business_phone_number_layout);
        C0f9.A09(1987211193, A02);
        return A0A;
    }
}
