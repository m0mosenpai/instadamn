package X;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;

/* renamed from: X.Efp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32983Efp extends EMQ {
    public static final String __redex_internal_original_name = "RecoveryEmailVerifyFragment";
    public String A00;
    public boolean A01;
    public Dialog A02;
    public C35161Ff3 A03;

    @Override // X.InterfaceC37221GaW
    public final EnumC33445EqI B75() {
        return null;
    }

    @Override // X.InterfaceC37221GaW
    public final EnumC31713DwI C0Q() {
        return EnumC31713DwI.A1I;
    }

    @Override // X.EMQ, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(186371889);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        C18C.A07(bundle2, "Arguments in RecoveryEmailVerifyFragment cannot be null.");
        super.A02 = C023409i.A0A.A02(bundle2);
        this.A00 = AbstractC31173DnH.A0j(bundle2, "lookup_user_input");
        this.A06 = bundle2.getString("lookup_email");
        this.A01 = AbstractC31172DnG.A1X(bundle2, "arg_is_multiple_account_recovery");
        C35161Ff3 A00 = C35161Ff3.A00(bundle2);
        this.A03 = A00;
        AbstractC18680vv abstractC18680vv = super.A02;
        AbstractC167017dG.A1N(abstractC18680vv, "recovery_email_code_confirmation");
        C35203Ffv.A00(abstractC18680vv, A00, null, null, "recovery_email_code_confirmation", null);
        C0f9.A09(-226510578, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(389204690);
        super.onStop();
        Dialog dialog = this.A02;
        if (dialog != null) {
            AbstractC31176DnK.A10(dialog);
        }
        C0f9.A09(1519173988, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        FragmentActivity activity = getActivity();
        if (activity != null && this.A01 && this.A02 == null) {
            C193328hC A0H = AbstractC31171DnF.A0H(activity);
            A0H.A0A(2131965791);
            AbstractC31177DnL.A1A(this, A0H, this.A06, 2131965790);
            A0H.A08(R.drawable.confirmation_icon);
            A0H.A07();
            Dialog A02 = A0H.A02();
            this.A02 = A02;
            C0fJ.A00(A02);
            C19280xC A05 = C1Q9.A1E.A02(super.A02).A05(null, EnumC31713DwI.A1I);
            this.A03.A00.putString(AbstractC31176DnK.A0r(EnumC33320EoF.A09), "email");
            this.A03.A03(A05);
            AbstractC31173DnH.A1S(A05, super.A02);
        }
        C006802i.A0p.markerAnnotate(725096125, DatePickerDialogModule.ARG_MODE, "email");
        C006802i.A0p.markerEnd(725096125, (short) 2);
    }
}
