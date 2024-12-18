package X;

import android.os.Bundle;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import com.instagram.ui.widget.searchedittext.SearchEditText;

/* renamed from: X.EIm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32253EIm extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "TwoFacContactFormFragment";
    public CheckBox A00;
    public EditText A01;
    public RadioGroup A02;
    public RadioGroup A03;
    public C07270a1 A04;
    public ProgressButton A05;
    public SearchEditText A06;
    public SearchEditText A07;
    public final TextWatcher A08 = new C35469Fl4(this, 21);
    public final C1P1 A09 = EV0.A00(this, 40);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "two_fac_contact_form";
    }

    public static String A00(C32253EIm c32253EIm) {
        Integer num;
        int checkedRadioButtonId = c32253EIm.A02.getCheckedRadioButtonId();
        if (checkedRadioButtonId == R.id.account_type_company) {
            num = C05F.A00;
        } else if (checkedRadioButtonId == R.id.account_type_personal_with_photo) {
            num = C05F.A01;
        } else if (checkedRadioButtonId == R.id.account_type_personal_without_photo) {
            num = C05F.A0C;
        } else {
            return "";
        }
        switch (num.intValue()) {
            case 0:
                return "COMPANY";
            case 1:
                return "PERSONAL_WITH_PHOTO";
            default:
                return "PERSONAL_WITHOUT_PHOTO";
        }
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A04;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-658856937);
        super.onCreate(bundle);
        C07270a1 A022 = C023409i.A0A.A02(this.mArguments);
        this.A04 = A022;
        AbstractC167017dG.A1N(A022, "request_support_impression");
        C35203Ffv.A01(A022, "request_support_impression");
        C0f9.A09(708410926, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1060891684);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.reg_container);
        layoutInflater.inflate(R.layout.two_fac_contact_form, AbstractC31180DnO.A05(A0A), true);
        AbstractC166997dE.A0T(A0A, R.id.field_title).setText(2131975890);
        TextView A0T = AbstractC166997dE.A0T(A0A, R.id.field_detail);
        Bundle bundle2 = this.mArguments;
        C14360o3.A0B(bundle2, 0);
        EnumC33365Eoy enumC33365Eoy = EnumC33365Eoy.values()[bundle2.getInt("flow_key")];
        EnumC33365Eoy enumC33365Eoy2 = EnumC33365Eoy.A08;
        int i = 2131965775;
        if (enumC33365Eoy == enumC33365Eoy2) {
            i = 2131975889;
        }
        A0T.setText(i);
        SearchEditText searchEditText = (SearchEditText) A0A.requireViewById(R.id.signup_email_edittext);
        this.A07 = searchEditText;
        searchEditText.setHint(2131975886);
        C35251Fgk.A04(this.A07);
        SearchEditText searchEditText2 = (SearchEditText) A0A.requireViewById(R.id.contact_email_edittext);
        this.A06 = searchEditText2;
        searchEditText2.setHint(2131975885);
        C35251Fgk.A04(this.A06);
        SearchEditText searchEditText3 = this.A07;
        TextWatcher textWatcher = this.A08;
        searchEditText3.addTextChangedListener(textWatcher);
        this.A06.addTextChangedListener(textWatcher);
        EditText A0H = AbstractC31173DnH.A0H(A0A, R.id.additional_details_edittext);
        this.A01 = A0H;
        A0H.setHint(2131975884);
        this.A01.setOnTouchListener(new ViewOnTouchListenerC35710Fpk(this, 2));
        ProgressButton A0U = AbstractC31180DnO.A0U(A0A);
        this.A05 = A0U;
        A0U.setText(2131975890);
        this.A05.setEnabled(false);
        ViewOnClickListenerC35677FpC.A00(this.A05, 35, this);
        this.A02 = (RadioGroup) A0A.findViewById(R.id.account_type_radiogroup);
        TextView A0T2 = AbstractC166997dE.A0T(A0A, R.id.log_in_button);
        AbstractC31180DnO.A13(AbstractC166997dE.A0N(this), A0T2, 2131975919);
        ViewOnClickListenerC35677FpC.A00(A0T2, 36, this);
        AbstractC35081Fcs.A00(A0T2, requireContext());
        this.A03 = (RadioGroup) A0A.requireViewById(R.id.failed_reason_radiogroup);
        Bundle bundle3 = this.mArguments;
        C14360o3.A0B(bundle3, 0);
        EnumC33365Eoy enumC33365Eoy3 = EnumC33365Eoy.values()[bundle3.getInt("flow_key")];
        RadioGroup radioGroup = this.A03;
        int i2 = 0;
        if (enumC33365Eoy3 == enumC33365Eoy2) {
            i2 = 8;
        }
        radioGroup.setVisibility(i2);
        CheckBox checkBox = (CheckBox) A0A.requireViewById(R.id.same_email_chbox);
        this.A00 = checkBox;
        C35745Fqd.A01(checkBox, this, 33);
        C0f9.A09(-1554092179, A02);
        return A0A;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(245706080);
        super.onPause();
        AbstractC31174DnI.A0H(this).setSoftInputMode(0);
        C0f9.A09(383453669, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(820693324);
        super.onResume();
        AbstractC31180DnO.A1B(this);
        C0f9.A09(1166372088, A02);
    }
}
