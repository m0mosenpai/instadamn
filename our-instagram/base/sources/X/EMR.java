package X;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.facebook.R;
import com.facebook.phonenumbers.PhoneNumberUtil;
import com.instagram.igds.components.form.IgFormField;
import com.instagram.ui.widget.progressbutton.ProgressButton;

/* loaded from: classes6.dex */
public final class EMR extends AbstractC59962oe implements InterfaceC37221GaW {
    public static final String __redex_internal_original_name = "PhoneAcquisitionFragment";
    public IgFormField A00;
    public InterfaceC37264GbH A01;
    public EVN A02;
    public TextView A03;
    public ProgressButton A04;
    public final InterfaceC09390do A06 = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A05 = C1XM.A00(new C57510Pfk(this, 7));

    @Override // X.InterfaceC37221GaW
    public final void APP() {
    }

    @Override // X.InterfaceC37221GaW
    public final void ARU() {
    }

    @Override // X.InterfaceC37221GaW
    public final EnumC33445EqI B75() {
        return null;
    }

    @Override // X.InterfaceC37221GaW
    public final void Dbn(boolean z) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "cp_acquisition_phone";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A01 = AbstractC34275F9v.A00(this);
        TextView A0T = AbstractC166997dE.A0T(view, R.id.skip_button);
        A0T.setText(2131968687);
        ViewOnClickListenerC31724DwT.A00(A0T, 19, this);
        this.A03 = A0T;
        AbstractC166997dE.A0T(view, R.id.disclaimer_text_line_01).setText(2131969554);
        TextView A0N = AbstractC167007dF.A0N(view, R.id.disclaimer_text_line_02);
        String A0v = AbstractC25227BEk.A0v(this, 2131969556);
        SpannableStringBuilder A08 = AbstractC31178DnM.A08(this, A0v, 2131969555);
        AnonymousClass773.A05(A08, new C31749Dx2(A0v, this, 6), A0v);
        AbstractC25227BEk.A11(A0N);
        A0N.setText(A08);
    }

    @Override // X.InterfaceC37221GaW
    public final boolean CbE() {
        CharSequence charSequence;
        CharSequence charSequence2;
        try {
            InterfaceC09390do interfaceC09390do = this.A05;
            PhoneNumberUtil phoneNumberUtil = (PhoneNumberUtil) AbstractC166987dD.A17(interfaceC09390do);
            StringBuilder A1C = AbstractC166987dD.A1C();
            IgFormField igFormField = this.A00;
            if (igFormField != null) {
                charSequence = igFormField.getComboFieldText();
            } else {
                charSequence = null;
            }
            A1C.append((Object) charSequence);
            IgFormField igFormField2 = this.A00;
            if (igFormField2 != null) {
                charSequence2 = igFormField2.getText();
            } else {
                charSequence2 = null;
            }
            return ((PhoneNumberUtil) AbstractC166987dD.A17(interfaceC09390do)).A0N(phoneNumberUtil.A0F(AbstractC166997dE.A0v(charSequence2, A1C), null));
        } catch (C40f unused) {
            return false;
        }
    }

    @Override // X.InterfaceC37221GaW
    public final void DVq() {
        CharSequence charSequence;
        C35031Fc4 c35031Fc4 = C35031Fc4.A00;
        InterfaceC09390do interfaceC09390do = this.A06;
        CharSequence charSequence2 = null;
        c35031Fc4.A00(AbstractC166987dD.A0o(interfaceC09390do), null, "cp_acquisition_phone");
        IgFormField igFormField = this.A00;
        if (igFormField != null) {
            charSequence = igFormField.getComboFieldText();
        } else {
            charSequence = null;
        }
        String valueOf = String.valueOf(charSequence);
        IgFormField igFormField2 = this.A00;
        if (igFormField2 != null) {
            charSequence2 = igFormField2.getText();
        }
        String valueOf2 = String.valueOf(charSequence2);
        if (valueOf.length() > 0 && valueOf2.length() > 0) {
            EVN evn = this.A02;
            if (evn != null) {
                evn.A01();
            }
            F9U.A00(AbstractC166987dD.A0r(interfaceC09390do), new GAT(this, valueOf2), AnonymousClass001.A0R(valueOf, valueOf2), AbstractC31180DnO.A0c(this), C16030qx.A02.A05(requireContext()), null);
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A06);
    }

    @Override // X.InterfaceC37221GaW
    public final EnumC31713DwI C0Q() {
        return EnumC31713DwI.A12;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        EditText editText;
        int A02 = C0f9.A02(1917958967);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.nux_phone_acquisition_fragment, viewGroup, false);
        IgFormField A0k = AbstractC31172DnG.A0k(inflate, R.id.add_phone_form);
        A0k.setLabelText(getString(2131969572));
        A0k.setInComboMode(new ViewOnClickListenerC55456OkA(this, 33));
        A0k.setInputType(3);
        A0k.setComboFieldText(AnonymousClass780.A00(requireActivity()).A02());
        this.A00 = A0k;
        ProgressButton A0U = AbstractC31180DnO.A0U(inflate);
        this.A04 = A0U;
        if (A0U != null) {
            AbstractC12990ll A0o = AbstractC166987dD.A0o(this.A06);
            IgFormField igFormField = this.A00;
            if (igFormField != null) {
                editText = igFormField.getMEditText();
            } else {
                editText = null;
            }
            EVN evn = new EVN(editText, A0o, this, A0U);
            this.A02 = evn;
            registerLifecycleListener(evn);
        }
        C0f9.A09(-12915600, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(569632939);
        this.A03 = null;
        this.A00 = null;
        this.A04 = null;
        unregisterLifecycleListener(this.A02);
        super.onDestroyView();
        C0f9.A09(179304677, A02);
    }
}
