package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.business.ui.BusinessInfoSectionView;
import com.instagram.business.ui.BusinessNavBar;
import com.instagram.common.session.UserSession;
import com.instagram.model.business.Address;
import com.instagram.model.business.BusinessInfo;
import com.instagram.model.business.PublicPhoneContact;
import com.instagram.phonenumber.model.CountryCodeData;
import com.instagram.user.model.User;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class ELV extends AbstractC59962oe implements InterfaceC60072op, InterfaceC37296Gbx, InterfaceC60122ou, InterfaceC37190Ga1, InterfaceC60152ox, GXG, GY8, CallerContextable {
    public static final String A0H = AnonymousClass001.A0R(ELV.class.getName(), ".EXTRA_ADDRESS");
    public static final String __redex_internal_original_name = "EditBusinessProfileFragment";
    public View A00;
    public BusinessFlowAnalyticsLogger A01;
    public InterfaceC37222GaX A02;
    public BusinessInfoSectionView A03;
    public EVM A04;
    public UserSession A05;
    public BusinessInfo A06;
    public User A07;
    public String A08;
    public LinearLayout A0A;
    public BusinessNavBar A0B;
    public C3I9 A0C;
    public boolean A0D;
    public final Handler A0E = AbstractC167007dF.A0J();
    public boolean A09 = false;
    public final Runnable A0F = new RunnableC36812GKl(this);
    public final InterfaceC41501vz A0G = C31650DvG.A00(this, 4);

    public static void A00(ELV elv, boolean z) {
        BusinessInfoSectionView businessInfoSectionView = elv.A03;
        UserSession userSession = elv.A05;
        BusinessInfo businessInfo = elv.A06;
        C06090Tz c06090Tz = C06090Tz.A05;
        businessInfoSectionView.setBusinessInfo(userSession, businessInfo, elv, true, true, false, AbstractC31178DnM.A1X(c06090Tz, userSession, 36315121013754910L), AbstractC31178DnM.A1X(c06090Tz, elv.A05, 36314592732777192L), true, z, false, elv);
        elv.A02(z);
    }

    @Override // X.InterfaceC37190Ga1
    public final void APP() {
    }

    @Override // X.InterfaceC37190Ga1
    public final void ARU() {
    }

    @Override // X.InterfaceC37212GaN
    public final boolean DCu(int i) {
        return false;
    }

    @Override // X.InterfaceC37296Gbx
    public final void DYK() {
        A02(true);
    }

    @Override // X.InterfaceC37296Gbx
    public final void DYL() {
    }

    @Override // X.InterfaceC37212GaN
    public final void Dx4() {
    }

    @Override // X.InterfaceC37212GaN
    public final void DyV() {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "edit_business_profile";
    }

    private void A01(String str) {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A01;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Cm3(new Y7A("edit_contact_info", this.A08, str, null, null, null, null, null));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r3.A03.A09() != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A02(boolean r4) {
        /*
            r3 = this;
            com.instagram.model.business.BusinessInfo r0 = r3.A06
            boolean r0 = r0.A0S
            r2 = 1
            if (r0 == 0) goto L10
            com.instagram.business.ui.BusinessInfoSectionView r0 = r3.A03
            boolean r0 = r0.A09()
            r1 = 1
            if (r0 == 0) goto L11
        L10:
            r1 = 0
        L11:
            com.instagram.model.business.BusinessInfo r0 = r3.A06
            com.instagram.model.business.BusinessInfo r0 = X.C35130FeX.A00(r0, r1)
            r3.A06 = r0
            com.instagram.business.ui.BusinessInfoSectionView r1 = r3.A03
            boolean r0 = r0.A0S
            r1.A08(r2, r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ELV.A02(boolean):void");
    }

    @Override // X.InterfaceC37296Gbx
    public final void Cvq() {
        A01("address");
        C34724FRn A0P = AbstractC31174DnI.A0P();
        String str = this.A08;
        if (str == null) {
            str = "";
        }
        ELD A05 = A0P.A05(this.A06.A00, null, str, "primary", false, false, false, false, true);
        A05.setTargetFragment(this, 0);
        AbstractC31177DnL.A0w(null, A05, requireActivity(), this.A05);
    }

    @Override // X.InterfaceC37212GaN
    public final void CxI() {
        A01("area_code");
    }

    @Override // X.InterfaceC37296Gbx
    public final void DDG() {
        A01("email");
    }

    @Override // X.InterfaceC60152ox
    public final void DOK(int i, boolean z) {
        int i2;
        BusinessNavBar businessNavBar = this.A0B;
        businessNavBar.getClass();
        int height = businessNavBar.getHeight();
        View currentFocus = requireActivity().getCurrentFocus();
        int[] iArr = new int[2];
        if (currentFocus != null) {
            currentFocus.getLocationInWindow(iArr);
        }
        if (i > 0) {
            if (currentFocus != null) {
                i2 = currentFocus.getHeight();
            } else {
                i2 = 0;
            }
            int A09 = (AbstractC13880nE.A09(requireContext()) - iArr[1]) - i2;
            int i3 = i + height;
            if (A09 < i3) {
                this.A00.postDelayed(new GNT(this, i3 - A09), 300L);
            }
        }
    }

    @Override // X.InterfaceC37212GaN
    public final void DYO() {
        A01("phone");
    }

    @Override // X.InterfaceC37296Gbx
    public final void Dba(boolean z) {
        if (this.A01 != null) {
            HashMap A1G = AbstractC166987dD.A1G();
            A1G.put("should_show_public_contacts", String.valueOf(z));
            this.A01.Cm3(new Y7A("edit_contact_info", this.A08, "contact_options_profile_display_toggle", null, null, null, A1G, null));
        }
        if (z && this.A03.A09()) {
            BusinessInfoSectionView businessInfoSectionView = this.A03;
            C193328hC A0I = AbstractC31171DnF.A0I(requireContext());
            A0I.A0A(2131968561);
            A0I.A09(2131952295);
            AbstractC31176DnK.A15(DialogInterfaceOnClickListenerC35452Fk9.A00(businessInfoSectionView, 27), A0I);
            return;
        }
        this.A06 = C35130FeX.A00(this.A06, z);
    }

    @Override // X.InterfaceC37190Ga1
    public final void DjW() {
        A01("skip");
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A01;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Clj(new Y7A("edit_contact_info", this.A08, null, null, null, null, null, null));
        }
        ((BusinessConversionActivity) this.A02).A0p(null, true);
    }

    @Override // X.InterfaceC37296Gbx
    public final void E1y() {
        String str;
        if (!AbstractC166987dD.A10(this.A05).A1a()) {
            str = AbstractC111324zv.A00(46);
        } else {
            str = "com.instagram.wa_linking.ig_whatsapp_linking_detail.DetailScreen";
        }
        C66277U6x A01 = C66277U6x.A01(str, AbstractC31180DnO.A0p("edit_business_profile", "whatsapp_linking_in_business_conversion_flow"));
        IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(this.A05);
        AbstractC31171DnF.A17(this, A0C, 2131977078);
        C72743Nv A02 = W6d.A02(A0C, A01);
        C140966Yy A0r = AbstractC25225BEi.A0r(requireActivity(), this.A05);
        A0r.A0A = "edit_business_profile";
        A0r.A0F = true;
        A0r.A0E(A02);
        A0r.A04();
    }

    @Override // X.GY8
    public final void ESF(CountryCodeData countryCodeData) {
        this.A03.setCountryCode(countryCodeData);
        String str = countryCodeData.A01;
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put("area_code", str);
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A01;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Cm3(new Y7A("edit_contact_info", this.A08, "area_code_option", null, null, null, A1G, null));
        }
    }

    @Override // X.GXG
    public final void FBL(Address address, String str) {
        if (this.A06 == null && AbstractC31176DnK.A0K(this.A02).A02 != null) {
            this.A06 = AbstractC31176DnK.A0K(this.A02).A02;
        }
        BusinessInfoSectionView businessInfoSectionView = this.A03;
        if (businessInfoSectionView != null) {
            C35130FeX c35130FeX = new C35130FeX(this.A06);
            c35130FeX.A0B = businessInfoSectionView.getEmail();
            c35130FeX.A01 = this.A03.getSubmitPublicPhoneContact();
            c35130FeX.A00 = address;
            this.A06 = new BusinessInfo(c35130FeX);
            this.A03.A05(address);
        }
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        interfaceC56362iU.setTitle("");
        if (this.A0D) {
            ViewOnClickListenerC35690FpP.A02(AbstractC31174DnI.A0K(), interfaceC56362iU, this, 12);
        }
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A01;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Cid(new Y7A("edit_contact_info", this.A08, null, null, null, null, null, null));
        }
        if (this.A0D) {
            AbstractC31179DnN.A1T(this.A02);
            return true;
        }
        return true;
    }

    @Override // X.InterfaceC37296Gbx
    public final void DV0() {
        AbstractC31174DnI.A0P();
        boolean z = this.A06.A0P;
        String str = this.A08;
        if (str == null) {
            str = "";
        }
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A01;
        Bundle A0E = AbstractC31174DnI.A0E(str, 2);
        A0E.putBoolean("is_profile_audio_call_enabled", z);
        A0E.putBoolean("maybe_show_confirmation_dialog", false);
        AbstractC31171DnF.A13(A0E, str);
        EJL ejl = new EJL();
        ejl.A00 = businessFlowAnalyticsLogger;
        ejl.setArguments(A0E);
        AbstractC31177DnL.A15(ejl, requireActivity(), this.A05);
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger2 = this.A01;
        if (businessFlowAnalyticsLogger2 != null) {
            businessFlowAnalyticsLogger2.Cm3(new Y7A("edit_contact_info", this.A08, "profile_native_calling", null, null, null, null, null));
            this.A01.Clo(new Y7A("profile_native_calling", this.A08, null, null, null, Collections.singletonMap("is_profile_audio_call_enabled", String.valueOf(this.A06.A0P)), null, null));
        }
    }

    @Override // X.InterfaceC37190Ga1
    public final void Dao() {
        String str;
        String string;
        String str2;
        TextView textView;
        String str3;
        AbstractC31171DnF.A16(this);
        A01("continue");
        BusinessInfo businessInfo = this.A06;
        String str4 = businessInfo.A0B;
        Address address = businessInfo.A00;
        if (address != null) {
            str = address.A03;
        } else {
            str = "";
        }
        BusinessInfoSectionView businessInfoSectionView = this.A03;
        if (businessInfoSectionView.getEmail().length() != 0 && !AbstractC13670mt.A0C(businessInfoSectionView.getEmail())) {
            string = getString(2131969694);
            str2 = "INVALID_EMAIL";
        } else if (address != null && TextUtils.isEmpty(address.A00)) {
            string = getString(2131969693);
            str2 = "NO_CITY";
        } else {
            if (this.A01 != null) {
                HashMap A1G = AbstractC166987dD.A1G();
                if (!TextUtils.isEmpty(str4)) {
                    A1G.put("email", str4);
                }
                if (!TextUtils.isEmpty(str)) {
                    A1G.put("address", str);
                }
                this.A01.CjJ(new Y7A("edit_contact_info", this.A08, "business_info_validation", null, null, null, A1G, null));
            }
            C35788FrQ A0K = AbstractC31176DnK.A0K(this.A02);
            C35130FeX c35130FeX = new C35130FeX(this.A06);
            c35130FeX.A0B = this.A03.getEmail();
            c35130FeX.A01 = this.A03.getSubmitPublicPhoneContact();
            c35130FeX.A0P = this.A06.A0P;
            c35130FeX.A0L = this.A07.A03.CHZ();
            A0K.A02 = new BusinessInfo(c35130FeX);
            EVM evm = this.A04;
            if (evm != null) {
                evm.A01();
            }
            Handler handler = this.A0E;
            Runnable runnable = this.A0F;
            handler.removeCallbacks(runnable);
            handler.post(runnable);
            return;
        }
        if (str2.equals("INVALID_EMAIL")) {
            textView = this.A03.A03;
            if (textView == null) {
                str3 = "emailInlineErrorMessage";
                C14360o3.A0F(str3);
                throw C00O.createAndThrow();
            }
            textView.setVisibility(0);
        } else if (str2.equals("NO_CONTACT_INFORMATION_PROVIDED")) {
            textView = this.A03.A02;
            if (textView == null) {
                str3 = "bottomInlineErrorMessage";
                C14360o3.A0F(str3);
                throw C00O.createAndThrow();
            }
            textView.setVisibility(0);
        }
        if (this.A01 != null) {
            HashMap A1G2 = AbstractC166987dD.A1G();
            if (!TextUtils.isEmpty(str4)) {
                A1G2.put("email", str4);
            }
            if (!TextUtils.isEmpty(str)) {
                A1G2.put("address", str);
            }
            this.A01.CjK(new Y7A("edit_contact_info", this.A08, "business_info_validation", string, str2, null, A1G2, null));
        }
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A01;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Clv(new Y7A("edit_contact_info", this.A08, "save_info", string, str2, null, F0F.A00(this.A06), null));
        }
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A05;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        InterfaceC37222GaX A01 = AbstractC35211Fg4.A01(this);
        A01.getClass();
        this.A02 = A01;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0074, code lost:
    
        if (r3.A01(r7.A05).A1d() != false) goto L12;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r8) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ELV.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(108382590);
        View inflate = layoutInflater.inflate(R.layout.edit_business_profile_fragment, viewGroup, false);
        BusinessNavBar businessNavBar = (BusinessNavBar) inflate.requireViewById(R.id.navigation_bar);
        this.A0B = businessNavBar;
        EVM evm = new EVM(businessNavBar, this, 2131968535, -1);
        this.A04 = evm;
        registerLifecycleListener(evm);
        this.A0B.setVisibility(0);
        BusinessNavBar businessNavBar2 = this.A0B;
        int i = 2131961124;
        if (this.A02.E3v() != null) {
            i = 2131968535;
        }
        businessNavBar2.setPrimaryButtonText(i);
        this.A0B.setSecondaryButtonText(2131961130);
        this.A0B.A02(true);
        this.A0C.A9e(this);
        TextView A0T = AbstractC166997dE.A0T(inflate, R.id.public_business_information_text);
        int i2 = 2131971123;
        if (AbstractC35211Fg4.A03(this.A02)) {
            i2 = 2131971148;
        }
        A0T.setText(i2);
        if (requireArguments().getBoolean("update_from_argument", false)) {
            C35130FeX c35130FeX = new C35130FeX(this.A06);
            c35130FeX.A0B = requireArguments().getString("android.intent.extra.EMAIL");
            c35130FeX.A01 = (PublicPhoneContact) requireArguments().getParcelable("android.intent.extra.PHONE_NUMBER");
            this.A06 = new BusinessInfo(c35130FeX);
        }
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A01;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Clo(new Y7A("edit_contact_info", this.A08, null, null, null, F0F.A00(this.A06), null, null));
        }
        C0f9.A09(720538660, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1225960620);
        super.onDestroyView();
        unregisterLifecycleListener(this.A04);
        this.A0C.EFx(this);
        this.A04 = null;
        this.A0B = null;
        requireArguments().putBoolean("update_from_argument", true);
        requireArguments().putParcelable("android.intent.extra.PHONE_NUMBER", this.A03.getSubmitPublicPhoneContact());
        requireArguments().putString("android.intent.extra.EMAIL", this.A03.getEmail());
        AbstractC25651Mw.A00(this.A05).A02(this.A0G, C23613Ad8.class);
        C0f9.A09(-116450871, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(1662578765);
        super.onPause();
        this.A03.A02();
        AbstractC31181DnP.A0r(this);
        C0f9.A09(996588023, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-1032223514);
        super.onResume();
        this.A03.setBusinessInfoListeners(this);
        AbstractC25651Mw.A00(this.A05).A01(this.A0G, C23613Ad8.class);
        if (this.A03 != null && AbstractC166987dD.A10(this.A05).A1a()) {
            C35130FeX c35130FeX = new C35130FeX(this.A06);
            c35130FeX.A0L = this.A07.A03.CHZ();
            this.A06 = new BusinessInfo(c35130FeX);
            this.A03.A04(this.A05);
        }
        Activity rootActivity = getRootActivity();
        rootActivity.getClass();
        AbstractC31180DnO.A0x(rootActivity);
        A00(this, false);
        C0f9.A09(-1487981512, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(-1215408529);
        super.onStart();
        this.A0C.Dnr((Activity) getContext());
        C0f9.A09(-901533121, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(-1480249668);
        super.onStop();
        AbstractC31171DnF.A16(this);
        this.A0C.onStop();
        C0f9.A09(197524609, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        PublicPhoneContact publicPhoneContact;
        super.onViewCreated(view, bundle);
        this.A00 = view.requireViewById(R.id.scroll_view);
        this.A0A = AbstractC31172DnG.A0B(view, R.id.scroll_container);
        BusinessNavBar businessNavBar = this.A0B;
        businessNavBar.getClass();
        businessNavBar.A01(this.A0A);
        View A0E = AbstractC31173DnH.A0E(AbstractC31173DnH.A0G(view, R.id.header_stub), R.layout.business_title_card_bigger_title);
        AbstractC31180DnO.A06(A0E).setText(2131961659);
        AbstractC31176DnK.A0E(A0E).setText(2131961580);
        this.A03 = (BusinessInfoSectionView) view.requireViewById(R.id.business_info_section);
        BusinessInfo businessInfo = this.A06;
        if (TextUtils.isEmpty(businessInfo.A0B) && businessInfo.A00 == null && (((publicPhoneContact = businessInfo.A01) == null || TextUtils.isEmpty(publicPhoneContact.A02)) && TextUtils.isEmpty(businessInfo.A0L) && !this.A09)) {
            C1ON A06 = AbstractC152476ta.A06(this.A05);
            C32548EUy.A01(A06, this, 12);
            schedule(A06);
        } else {
            A00(this, false);
        }
        String str = AbstractC31176DnK.A0K(this.A02).A05;
        if (str != null) {
            C9GR.A09(getContext(), str);
        }
    }

    @Override // X.InterfaceC37296Gbx
    public final void DDF(boolean z) {
        A02(z);
    }
}
