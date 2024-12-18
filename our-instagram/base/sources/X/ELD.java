package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.facebook.R;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.business.ui.BusinessNavBar;
import com.instagram.common.session.UserSession;
import com.instagram.model.business.Address;
import com.instagram.model.business.BusinessInfo;
import com.instagram.model.business.ProfileAddressData;
import com.instagram.user.model.User;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class ELD extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "BusinessLocationFragment";
    public EditText A00;
    public TextView A01;
    public BusinessFlowAnalyticsLogger A02;
    public InterfaceC37222GaX A03;
    public UserSession A04;
    public Address A05;
    public Integer A06;
    public String A07;
    public String A08;
    public boolean A09;
    public boolean A0A;
    public ViewGroup A0B;
    public ViewGroup A0C;
    public ViewGroup A0D;
    public TextView A0E;
    public TextView A0F;
    public ProfileAddressData A0G;
    public User A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "business_location";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Integer num;
        String str;
        super.onViewCreated(view, bundle);
        String str2 = this.A08;
        if (str2 != null && "profile_multiple_addresses_edit_list".equals(str2)) {
            boolean z = !this.A09;
            UserSession userSession = this.A04;
            C14360o3.A0B(userSession, 1);
            if (z) {
                str = "ig_profile_edit_address_page";
            } else {
                str = "ig_profile_add_address_page";
            }
            FAI.A00(this, userSession, "impression", "form", "subscriber", str, userSession.userId, null);
        }
        View requireViewById = view.requireViewById(R.id.remove_container);
        TextView A0T = AbstractC166997dE.A0T(view, R.id.remove_button);
        Address address = this.A05;
        if (address != null && !TextUtils.isEmpty(address.A03)) {
            Fp1.A00(A0T, 66, this);
            if (this.A0I || this.A0J) {
                A0T.setEnabled(false);
                Context context = getContext();
                if (context != null) {
                    AbstractC31177DnL.A0y(A0T, context);
                }
            }
        } else {
            requireViewById.setVisibility(AbstractC31177DnL.A01(view, R.id.remove_button_bottom_divider));
        }
        this.A0C = AbstractC31173DnH.A0F(view, R.id.edit_lock_header);
        this.A0F = AbstractC166997dE.A0T(view, R.id.edit_lock_header_text);
        this.A0D = AbstractC31173DnH.A0F(view, R.id.primary_location_header);
        this.A00 = AbstractC31173DnH.A0H(view, R.id.street_address);
        this.A0B = AbstractC31173DnH.A0F(view, R.id.city_state_container);
        this.A0E = AbstractC166997dE.A0T(view, R.id.city_state);
        this.A01 = AbstractC166997dE.A0T(view, R.id.zip);
        A02(this);
        if (!this.A0I && ((num = this.A06) == null || num.intValue() != 0)) {
            Fp1.A00(this.A0B, 67, this);
        }
        BusinessNavBar businessNavBar = (BusinessNavBar) view.requireViewById(R.id.navigation_bar);
        if (this.A03 != null) {
            businessNavBar.setPrimaryButtonText(2131972699);
        }
        if ((!"edit_profile".equals(this.A08)) && !this.A0I) {
            Integer num2 = this.A06;
            if (num2 == null || num2.intValue() != 0) {
                businessNavBar.setVisibility(0);
                businessNavBar.setPrimaryButtonOnclickListeners(new Fp1(this, 68));
            }
        }
    }

    private HashMap A00() {
        String str;
        String str2;
        Address address = this.A05;
        String str3 = null;
        if (address == null) {
            str = null;
            str2 = null;
        } else {
            str = address.A04;
            str2 = address.A01;
            str3 = address.A02;
        }
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put("address", str);
        A1G.put(ServerW3CShippingAddressConstants.CITY, str2);
        A1G.put("zip_code", str3);
        return A1G;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0024, code lost:
    
        if ("profile_multiple_addresses_edit_list".equals(r1) == false) goto L9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A01(X.ELD r17) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ELD.A01(X.ELD):void");
    }

    public static void A03(ELD eld, Address address) {
        InterfaceC37222GaX interfaceC37222GaX = eld.A03;
        if (interfaceC37222GaX != null) {
            BusinessInfo businessInfo = AbstractC31176DnK.A0K(interfaceC37222GaX).A02;
            C35788FrQ A0K = AbstractC31176DnK.A0K(eld.A03);
            C35130FeX c35130FeX = new C35130FeX(businessInfo);
            c35130FeX.A00 = address;
            A0K.A02 = new BusinessInfo(c35130FeX);
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [X.Ffp, java.lang.Object] */
    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        Fp1 fp1 = new Fp1(this, 69);
        if (this.A0A) {
            ?? obj = new Object();
            C35197Ffp.A01(AbstractC166997dE.A0N(this), obj, 2131965668);
            C31722DwR.A01(fp1, interfaceC56362iU, obj);
            return;
        }
        interfaceC56362iU.Efu(2131965668);
        AbstractC31176DnK.A1C(new Fp1(this, 70), AbstractC31176DnK.A0I(), interfaceC56362iU);
        if ((!"edit_profile".equals(this.A08)) || this.A0I) {
            return;
        }
        Integer num = this.A06;
        if (num != null && num.intValue() == 0) {
            return;
        }
        int i = 2131961124;
        if (this.A03 == null) {
            i = 2131972699;
        }
        String string = getString(i);
        C3LO A0B = AbstractC31171DnF.A0B();
        A0B.A0K = string;
        AbstractC31176DnK.A1B(fp1, A0B, interfaceC56362iU);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        String str;
        if (!this.A0L) {
            BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A02;
            if (businessFlowAnalyticsLogger != null) {
                businessFlowAnalyticsLogger.Cid(new Y7A("page_import_info_location", this.A08, null, null, null, null, A00(), null));
            }
            String str2 = this.A08;
            if (str2 != null && "profile_multiple_addresses_edit_list".equals(str2)) {
                boolean z = !this.A09;
                UserSession userSession = this.A04;
                C14360o3.A0B(userSession, 1);
                if (z) {
                    str = "ig_profile_edit_address_page";
                } else {
                    str = "ig_profile_add_address_page";
                }
                FAI.A00(this, userSession, "click", "cancel_button", "subscriber", str, userSession.userId, null);
                return false;
            }
            return false;
        }
        return false;
    }

    public static void A02(ELD eld) {
        Integer num;
        ProfileAddressData profileAddressData;
        Context context = eld.getContext();
        Address address = eld.A05;
        if (address != null) {
            eld.A00.setText(address.A04);
            eld.A01.setText(eld.A05.A02);
            if (!TextUtils.isEmpty(eld.A05.A01)) {
                eld.A0E.setText(eld.A05.A01);
            }
            if (context != null && TextUtils.isEmpty(eld.A05.A01)) {
                AbstractC31177DnL.A0y(eld.A0E, context);
            }
        }
        eld.A0D.setVisibility(8);
        if (!eld.A0K && (profileAddressData = eld.A0G) != null && C14360o3.A0K(profileAddressData.A06, "primary")) {
            eld.A0D.setVisibility(0);
        }
        eld.A0C.setVisibility(8);
        if (!eld.A0I && ((num = eld.A06) == null || num.intValue() != 0)) {
            return;
        }
        eld.A00.setEnabled(false);
        eld.A01.setEnabled(false);
        if (context != null) {
            AbstractC31177DnL.A0y(eld.A00, context);
            AbstractC31177DnL.A0y(eld.A0E, context);
            AbstractC31177DnL.A0y(eld.A01, context);
        }
        C5JN AZo = eld.A0H.A03.AZo();
        Integer num2 = eld.A06;
        if (num2 == null || num2.intValue() != 0) {
            return;
        }
        if (AZo != null && !TextUtils.isEmpty(AZo.B0M())) {
            eld.A0F.setText(AZo.B0M());
        } else {
            eld.A0F.setText(2131966630);
        }
        eld.A0C.setVisibility(0);
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A04;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.A03 = AbstractC35211Fg4.A01(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(522683282);
        super.onCreate(bundle);
        EVO.A00(this);
        Bundle requireArguments = requireArguments();
        this.A08 = AbstractC31171DnF.A0Z(requireArguments);
        this.A05 = (Address) requireArguments.getParcelable(ELV.A0H);
        this.A07 = requireArguments.getString("BusinessLocationFragment.EXTRA_ADDITIONAL_ADDRESS_ID");
        InterfaceC37222GaX interfaceC37222GaX = this.A03;
        if (interfaceC37222GaX != null && AbstractC31176DnK.A0K(interfaceC37222GaX).A02 != null) {
            this.A05 = AbstractC31176DnK.A0K(this.A03).A02.A00;
        }
        Address address = this.A05;
        if (address != null) {
            this.A0G = AbstractC34249F8v.A00(address, this.A07);
        }
        this.A0A = requireArguments.getBoolean("BusinessLocationFragment.EXTRA_SHOULD_SHOW_IN_MODAL");
        this.A0I = requireArguments.getBoolean("BusinessLocationFragment.EXTRA_IS_MV4B_VERIFIED", false);
        if (requireArguments.containsKey("BusinessLocationFragment.NUM_EDITS_LEFT_BEFORE_REACHING_MULTIPLE_ADDRESSES_LIMIT")) {
            this.A06 = AbstractC31179DnN.A0X(requireArguments, "BusinessLocationFragment.NUM_EDITS_LEFT_BEFORE_REACHING_MULTIPLE_ADDRESSES_LIMIT");
        }
        this.A0J = requireArguments.getBoolean("BusinessLocationFragment.EXTRA_IS_REMOVE_LOCKED_FOR_MULTIPLE_ADDRESSES", false);
        this.A09 = requireArguments.getBoolean("BusinessLocationFragment.EXTRA_IS_ADDING_NEW_ADDRESS", false);
        this.A0K = requireArguments.getBoolean("BusinessLocationFragment.EXTRA_SHOULD_HIDE_PRIMARY_LOCATION_HEADER", true);
        UserSession A0S = AbstractC31176DnK.A0S(this);
        this.A04 = A0S;
        this.A0H = AbstractC166987dD.A10(A0S);
        BusinessFlowAnalyticsLogger A00 = AbstractC35211Fg4.A00(this.A03, this, this.A04);
        this.A02 = A00;
        if (A00 != null) {
            A00.Clo(new Y7A("page_import_info_location", this.A08, null, null, null, A00(), null, null));
        }
        C0f9.A09(1215196383, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-267122108);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.business_location_fragment);
        C0f9.A09(1307725469, A02);
        return A0A;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(1443604154);
        super.onPause();
        AbstractC31181DnP.A0r(this);
        C0f9.A09(-1840966242, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-1717970123);
        super.onResume();
        Activity rootActivity = getRootActivity();
        rootActivity.getClass();
        AbstractC31180DnO.A0x(rootActivity);
        C0f9.A09(1553737362, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(-1523405357);
        super.onStop();
        AbstractC31171DnF.A16(this);
        C0f9.A09(-2007910827, A02);
    }
}
