package X;

import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class ELA extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "UserPasswordRecoveryFragment";
    public int A00;
    public View A01;
    public View A02;
    public View A03;
    public TextView A04;
    public C07270a1 A05;
    public String A07;
    public String A08;
    public String A09;
    public List A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public Handler A0F = new Handler();
    public C35161Ff3 A06 = new C35161Ff3();

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "user_password_recovery";
    }

    public static void A01(ELA ela, String str) {
        C47989LJs.A00.A02(ela.A05, "recovery_page", str);
    }

    public static void A02(ELA ela, String str) {
        C19280xC A05 = C1Q9.A1G.A02(ela.A05).A05(null, EnumC31713DwI.A1J);
        ela.A06.A00.putString(AbstractC31176DnK.A0r(EnumC33320EoF.A0A), str);
        ela.A06.A03(A05);
        AbstractC31173DnH.A1S(A05, ela.A05);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        C35159Ff1.A00.A02(this.A05, "recovery_page");
        return false;
    }

    public static void A00(ELA ela) {
        double A01 = AbstractC31171DnF.A01();
        double A00 = AbstractC31171DnF.A00();
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(ela.A05), "recovery_sms");
        if (A0f.isSampled()) {
            AbstractC31177DnL.A1B(A0f, A01, A00);
            AbstractC31178DnM.A19(A0f, "recovery_page");
            A0f.AAP("cp_prefill_type", ela.A06.A00.getString(AbstractC31176DnK.A0r(EnumC33320EoF.A04)));
            C35161Ff3.A01(A0f, ela);
            AbstractC31172DnG.A1O(A0f);
            AbstractC31176DnK.A1K(A0f, A01);
            AbstractC31178DnM.A13(A0f);
            A0f.A7v("prefill_given_match", AbstractC31174DnI.A0n(ela.A06.A00, AbstractC31176DnK.A0r(EnumC33320EoF.A08)));
            AbstractC31176DnK.A1J(A0f, A00);
            A0f.A7v("was_from_recovery_flow", AbstractC31174DnI.A0n(ela.A06.A00, AbstractC31176DnK.A0r(EnumC33320EoF.A0C)));
            A0f.Cht();
        }
        C006802i.A0p.markerPoint(725096125, AbstractC111324zv.A00(1121));
        C1ON A012 = AbstractC35276FhB.A01(ela.requireContext(), ela.A05, null, null, ela.A08, null, true, false);
        A012.A00 = new C32980Efm(ela, ela.A05, ela, EnumC31713DwI.A1J);
        C1GJ.A03(A012);
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131952030);
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A05;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1856280317);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A08 = AbstractC31173DnH.A0j(requireArguments, "lookup_user_input");
        this.A0B = requireArguments.getBoolean("can_email_reset");
        this.A0C = requireArguments.getBoolean("can_sms_reset");
        this.A0D = requireArguments.getBoolean("can_wa_reset");
        this.A0E = AbstractC31172DnG.A1X(requireArguments, "is_autoconf_test_user");
        this.A07 = AbstractC31173DnH.A0j(requireArguments, "lookup_source");
        this.A05 = C023409i.A0A.A02(requireArguments);
        C35161Ff3 A00 = C35161Ff3.A00(requireArguments);
        this.A06 = A00;
        ArrayList A17 = AbstractC25225BEi.A17(4);
        if (this.A0B) {
            A17.add("email");
        }
        if (this.A0C) {
            A17.add("sms");
        }
        if (this.A0D) {
            A17.add("whatsapp");
        }
        A17.add("facebook");
        this.A0A = A17;
        A00.A00.putInt(AbstractC31176DnK.A0r(EnumC33320EoF.A03), A17.size());
        this.A06.A00.putStringArrayList(AbstractC31176DnK.A0r(EnumC33320EoF.A05), AbstractC166987dD.A1F(this.A0A));
        C07270a1 c07270a1 = this.A05;
        C35161Ff3 c35161Ff3 = this.A06;
        AbstractC167017dG.A1N(c07270a1, "recovery_page");
        C35203Ffv.A00(c07270a1, c35161Ff3, null, null, "recovery_page", null);
        C0f9.A09(764573097, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        int A02 = C0f9.A02(-791689457);
        View inflate = layoutInflater.inflate(R.layout.fragment_user_password_recovery, viewGroup, false);
        int A0H = AbstractC53242c7.A0H(requireContext(), R.attr.glyphColorPrimary);
        C35251Fgk.A02(AbstractC166997dE.A0T(inflate, R.id.fragment_user_password_recovery_button_email_reset), A0H);
        C35251Fgk.A02(AbstractC166997dE.A0T(inflate, R.id.fragment_user_password_recovery_button_sms_reset), A0H);
        C35251Fgk.A02(AbstractC166997dE.A0T(inflate, R.id.fragment_user_password_recovery_button_whatsapp_reset), A0H);
        C35251Fgk.A02(AbstractC166997dE.A0T(inflate, R.id.connect_with_facebook_textview), A0H);
        this.A02 = inflate.requireViewById(R.id.sms_spinner);
        if (this.A0C) {
            View requireViewById = inflate.requireViewById(R.id.fragment_user_password_recovery_button_sms_reset_container);
            requireViewById.setVisibility(0);
            ViewOnClickListenerC35677FpC.A00(requireViewById, 38, this);
        }
        if (this.A0B) {
            View requireViewById2 = inflate.requireViewById(R.id.fragment_user_password_recovery_button_email_reset_container);
            requireViewById2.setVisibility(0);
            ViewOnClickListenerC35677FpC.A00(requireViewById2, 39, this);
        }
        if (this.A0D) {
            View requireViewById3 = inflate.requireViewById(R.id.fragment_user_password_recovery_button_whatsapp_reset_container);
            requireViewById3.setVisibility(0);
            ViewOnClickListenerC35677FpC.A00(requireViewById3, 40, this);
        }
        ViewOnClickListenerC35677FpC.A00(inflate.requireViewById(R.id.fragment_user_password_recovery_dont_have_access), 41, this);
        IgImageView A0Z = AbstractC31172DnG.A0Z(inflate, R.id.user_profile_picture);
        TextView A0T = AbstractC166997dE.A0T(inflate, R.id.username_textview);
        if (AbstractC31182DnR.A01().equals(this.A07) && (str = this.A08) != null) {
            A0T.setText(str);
            Parcelable parcelable = requireArguments().getParcelable("user_profile_pic");
            parcelable.getClass();
            A0Z.setUrl((ImageUrl) parcelable, this);
        } else {
            A0Z.setVisibility(8);
            A0T.setVisibility(8);
            AbstractC31172DnG.A1J(inflate, R.id.divider_row, 8);
        }
        C0f9.A09(424151089, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-45585454);
        super.onDestroyView();
        this.A01 = null;
        this.A04 = null;
        this.A03 = null;
        this.A02 = null;
        C0f9.A09(-105329119, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(-1621545651);
        super.onStart();
        C0f9.A09(-549734070, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C006802i.A0p.markerEnd(725096220, (short) 2);
    }
}
