package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.google.android.material.textfield.TextInputLayout;
import com.instagram.actionbar.ActionButton;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgButton;

/* loaded from: classes6.dex */
public final class ELC extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "PasswordResetFragment";
    public View A00;
    public EditText A01;
    public EditText A02;
    public TextInputLayout A03;
    public TextInputLayout A04;
    public C07270a1 A05;
    public ImageUrl A06;
    public FQT A07;
    public String A08;
    public String A09;
    public boolean A0A;
    public boolean A0B;
    public IgButton A0C;
    public C35161Ff3 A0D;
    public G9Q A0E;
    public final C1P1 A0G = EV0.A00(this, 32);
    public final View.OnClickListener A0F = new ViewOnClickListenerC35677FpC(this, 29);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "password_reset";
    }

    public static void A00(View view, ELC elc) {
        TextView A0T;
        String str;
        if (view != null) {
            AbstractC31172DnG.A0Z(view, R.id.user_profile_picture).setUrl(elc.A06, elc);
            if (elc.A0A) {
                A0T = AbstractC166987dD.A0e(view, R.id.passwordless_reset_title);
                if (A0T != null) {
                    str = AbstractC31174DnI.A0w(elc, elc.A09, 2131963014);
                }
                elc.A0B = false;
                AbstractC31175DnJ.A0j(elc.getActivity(), false);
            }
            A0T = AbstractC166997dE.A0T(view, R.id.username_textview);
            str = elc.A09;
            A0T.setText(str);
            elc.A0B = false;
            AbstractC31175DnJ.A0j(elc.getActivity(), false);
        }
    }

    public static void A01(FragmentActivity fragmentActivity, ELC elc) {
        String A0g;
        EditText editText;
        String A0g2;
        C07270a1 c07270a1 = elc.A05;
        String str = elc.A08;
        EditText editText2 = elc.A02;
        if (editText2 == null) {
            A0g = null;
        } else {
            A0g = AbstractC167007dF.A0g(editText2);
        }
        if (elc.A0A) {
            editText = elc.A02;
        } else {
            editText = elc.A01;
        }
        if (editText == null) {
            A0g2 = null;
        } else {
            A0g2 = AbstractC167007dF.A0g(editText);
        }
        String string = elc.requireArguments().getString("argument_reset_token");
        String A00 = C16030qx.A00(fragmentActivity);
        String A10 = AbstractC31172DnG.A10(fragmentActivity);
        C25621Ms A0M = AbstractC31173DnH.A0M(c07270a1);
        A0M.A0B("accounts/change_password/");
        A0M.A9s("enc_new_password1", AbstractC31176DnK.A0p(c07270a1, A0g));
        A0M.A9s("enc_new_password2", AbstractC31176DnK.A0p(c07270a1, A0g2));
        AbstractC31171DnF.A1J(A0M, str);
        AbstractC31180DnO.A1R(A0M, "token", string, A00, A10);
        C1ON A0H = AbstractC31180DnO.A0H(A0M, EfU.class, C35072Fcj.class);
        C07270a1 c07270a12 = elc.A05;
        EnumC31713DwI enumC31713DwI = EnumC31713DwI.A1C;
        Integer num = C05F.A00;
        G9Q g9q = elc.A0E;
        android.net.Uri A01 = AbstractC31525Dt9.A01(elc);
        Bundle bundle = elc.mArguments;
        if (bundle != null) {
            bundle.getString("flow_id");
        }
        A0H.A00 = new Efi(fragmentActivity, A01, elc, c07270a12, g9q, elc, enumC31713DwI, num);
        elc.schedule(A0H);
    }

    public static void A02(ELC elc) {
        Context context;
        int i;
        String str;
        FQT fqt = elc.A07;
        String A0g = AbstractC167007dF.A0g(fqt.A06);
        String A0g2 = AbstractC167007dF.A0g(fqt.A05);
        if (A0g.length() >= 6 && A0g2.equals(A0g)) {
            FD5.A00(elc.A05, "password_reset");
            FragmentActivity activity = elc.getActivity();
            if (activity != null) {
                if (AbstractC31178DnM.A1X(C06090Tz.A05, elc.A05, 36311478881550877L)) {
                    C14120nc.A00().ATO(new C32656EZf(activity, elc));
                    return;
                } else {
                    A01(activity, elc);
                    return;
                }
            }
            return;
        }
        FQT fqt2 = elc.A07;
        EditText editText = fqt2.A06;
        String A0g3 = AbstractC167007dF.A0g(editText);
        String A0g4 = AbstractC167007dF.A0g(fqt2.A05);
        if (A0g3.length() >= 6 && A0g4.length() >= 6) {
            if (!A0g3.equals(A0g4)) {
                context = editText.getContext();
                i = 2131969379;
            } else {
                str = null;
                C9GR.A0G(str);
            }
        } else {
            context = editText.getContext();
            i = 2131969374;
        }
        str = context.getString(i);
        C9GR.A0G(str);
    }

    public static boolean A03(ELC elc) {
        Bundle bundle = elc.mArguments;
        if (bundle != null && AbstractC31172DnG.A13(bundle, "flow_id").equals("fxcal")) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.Ffp, java.lang.Object] */
    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        if (this.A0A) {
            if (getContext() != null) {
                interfaceC56362iU.EPD(getContext().getDrawable(AbstractC53242c7.A0D(getContext())));
            }
            AbstractC31179DnN.A1G(interfaceC56362iU);
        } else {
            ?? obj = new Object();
            C35197Ffp.A02(AbstractC166997dE.A0N(this), obj, 2131955011);
            ActionButton A00 = C31722DwR.A00(this.A0F, interfaceC56362iU, obj);
            this.A00 = A00;
            A00.setEnabled(this.A07.A00());
        }
        interfaceC56362iU.setIsLoading(this.A0B);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        C35159Ff1.A00.A02(this.A05, "password_reset");
        return false;
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A05;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(908624642);
        super.onCreate(bundle);
        this.A05 = AbstractC31180DnO.A0L(this);
        this.A0D = C35161Ff3.A00(requireArguments());
        C07270a1 c07270a1 = this.A05;
        AbstractC167017dG.A1N(c07270a1, "password_reset");
        C35203Ffv.A01(c07270a1, "password_reset");
        this.A08 = requireArguments().getString("argument_user_id");
        this.A09 = requireArguments().getString("argument_user_name");
        this.A06 = (ImageUrl) requireArguments().getParcelable("argument_profile_pic_url");
        C07340a8 c07340a8 = C07340a8.A00;
        if (this.A09 != null) {
            this.A0B = false;
        } else {
            C25621Ms A0N = AbstractC31173DnH.A0N(this.A05);
            A0N.A0L("users/%s/filtered_info/", android.net.Uri.encode(this.A08));
            A0N.A0P(c07340a8, C32182ECd.class, FX2.class, false);
            C1ON A0N2 = A0N.A0N();
            A0N2.A00 = this.A0G;
            schedule(A0N2);
        }
        this.A0E = new G9Q(getActivity());
        if (A03(this)) {
            C07270a1 c07270a12 = this.A05;
            String str = this.A08;
            C14360o3.A0B(c07270a12, 0);
            AbstractC34214F7m.A00(c07270a12, "passwordless_flow_viewed_password_reset_surface", str, null);
        }
        C0f9.A09(-1533949028, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        EditText editText;
        EditText editText2;
        int A02 = C0f9.A02(985780102);
        boolean A03 = A03(this);
        this.A0A = A03;
        int i = R.layout.fragment_password_reset;
        if (A03) {
            i = R.layout.fragment_passwordless_reset;
        }
        View inflate = layoutInflater.inflate(i, viewGroup, false);
        this.A02 = AbstractC31173DnH.A0H(inflate, R.id.new_password);
        IgButton igButton = null;
        if (this.A0A) {
            editText = null;
        } else {
            editText = (EditText) inflate.findViewById(R.id.confirm_new_password);
        }
        this.A01 = editText;
        if (this.A0A) {
            igButton = (IgButton) inflate.findViewById(R.id.save_password_button);
        }
        this.A0C = igButton;
        if (this.A0A && igButton != null) {
            C0fQ.A00(this.A0F, igButton);
        }
        EditText editText3 = this.A02;
        Typeface typeface = Typeface.DEFAULT;
        editText3.setTypeface(typeface);
        AbstractC31179DnN.A0s(this.A02);
        EditText editText4 = this.A01;
        if (!this.A0A && editText4 != null) {
            editText4.setTypeface(typeface);
            AbstractC31179DnN.A0s(editText4);
        }
        Resources A0N = AbstractC166997dE.A0N(this);
        EditText editText5 = this.A02;
        if (this.A0A) {
            editText2 = editText5;
        } else {
            editText2 = this.A01;
        }
        FQT fqt = new FQT(A0N, editText5, editText2);
        this.A07 = fqt;
        fqt.A00 = new C34449FGn(this);
        if (this.A09 != null) {
            A00(inflate, this);
        }
        this.A04 = (TextInputLayout) inflate.findViewById(R.id.new_password_input_layout);
        if (!this.A0A) {
            this.A03 = (TextInputLayout) inflate.findViewById(R.id.confirm_password_input_layout);
        }
        TextInputLayout textInputLayout = this.A04;
        if (textInputLayout != null) {
            textInputLayout.setEndIconVisible(false);
        }
        TextInputLayout textInputLayout2 = this.A03;
        if (textInputLayout2 != null) {
            textInputLayout2.setEndIconVisible(false);
        }
        ViewOnFocusChangeListenerC35694FpU.A00(this.A02, 8, this);
        EditText editText6 = this.A01;
        if (!this.A0A && editText6 != null) {
            ViewOnFocusChangeListenerC35694FpU.A00(editText6, 9, this);
        }
        EditText editText7 = this.A01;
        if (!this.A0A && editText7 != null) {
            C35754Fqr.A00(editText7, this, 9);
        }
        C0f9.A09(-1616507862, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(1085259463);
        super.onDestroy();
        C0f9.A09(-1232551366, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1011213320);
        super.onDestroyView();
        FQT fqt = this.A07;
        fqt.A00 = null;
        fqt.A06.setOnFocusChangeListener(null);
        fqt.A05.setOnFocusChangeListener(null);
        this.A07 = null;
        this.A01 = null;
        this.A02 = null;
        this.A00 = null;
        this.A0C = null;
        this.A03 = null;
        this.A04 = null;
        C0f9.A09(-72044962, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-1668860928);
        super.onPause();
        if (requireActivity().getCurrentFocus() != null) {
            AbstractC13880nE.A0O(requireActivity().getCurrentFocus());
        }
        AbstractC31179DnN.A1K(this, 0);
        C0f9.A09(1821339296, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(1691875454);
        super.onResume();
        ((BaseFragmentActivity) requireActivity()).A0d();
        ((BaseFragmentActivity) requireActivity()).A0Z();
        AbstractC31179DnN.A1K(this, 8);
        C0f9.A09(433037402, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C006802i.A0p.markerEnd(725091390, (short) 2);
    }
}
