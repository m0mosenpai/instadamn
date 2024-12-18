package X;

import android.os.Bundle;
import android.os.Handler;
import android.telephony.PhoneNumberUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.actionbar.ActionButton;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.business.ui.BusinessInfoSectionView;
import com.instagram.common.session.UserSession;
import com.instagram.model.business.Address;
import com.instagram.model.business.BusinessInfo;
import com.instagram.model.business.PublicPhoneContact;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes6.dex */
public final class EO0 extends C53Z implements InterfaceC60072op, InterfaceC37296Gbx, InterfaceC60122ou, GXG {
    public static final String __redex_internal_original_name = "BusinessContactButtonSetupFragment";
    public View A00;
    public View A01;
    public ActionButton A02;
    public BusinessFlowAnalyticsLogger A03;
    public BusinessInfoSectionView A04;
    public BusinessInfo A05;
    public User A06;
    public String A07;
    public HashSet A08;
    public boolean A09;
    public boolean A0B;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public final Handler A0G = AbstractC167007dF.A0J();
    public boolean A0C = false;
    public boolean A0A = false;
    public final InterfaceC41501vz A0I = C31650DvG.A00(this, 3);
    public final InterfaceC41501vz A0H = C31728DwZ.A00(this, 0);

    @Override // X.InterfaceC37212GaN
    public final void CxI() {
    }

    @Override // X.InterfaceC37212GaN
    public final boolean DCu(int i) {
        return false;
    }

    @Override // X.InterfaceC37296Gbx
    public final void DDG() {
    }

    @Override // X.InterfaceC37296Gbx
    public final void DYK() {
    }

    @Override // X.InterfaceC37212GaN
    public final void DYO() {
    }

    @Override // X.InterfaceC37212GaN
    public final void Dx4() {
    }

    @Override // X.InterfaceC37212GaN
    public final void DyV() {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "business_contact_button_setup";
    }

    public static HashMap A00(EO0 eo0) {
        String str;
        C19260xA c19260xA = new C19260xA();
        BusinessInfo businessInfo = eo0.A05;
        if (businessInfo != null) {
            PublicPhoneContact publicPhoneContact = businessInfo.A01;
            String str2 = null;
            if (publicPhoneContact == null) {
                str = null;
            } else {
                str = publicPhoneContact.A03;
            }
            String str3 = businessInfo.A0L;
            String str4 = businessInfo.A0B;
            Address address = businessInfo.A00;
            if (address != null) {
                str2 = address.A04;
            }
            String valueOf = String.valueOf(businessInfo.A0P);
            String valueOf2 = String.valueOf(businessInfo.A0S);
            C19260xA.A00(c19260xA, str, "phone");
            C19260xA.A00(c19260xA, str3, "whatsapp");
            C19260xA.A00(c19260xA, str4, "email");
            C19260xA.A00(c19260xA, str2, "address");
            C19260xA.A00(c19260xA, valueOf, "is_profile_audio_call_enabled");
            C19260xA.A00(c19260xA, valueOf2, "should_show_public_contacts");
        }
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put("phone", c19260xA.A05("phone"));
        A1G.put("whatsapp", c19260xA.A05("whatsapp"));
        A1G.put("email", c19260xA.A05("email"));
        A1G.put("address", c19260xA.A05("address"));
        A1G.put("is_profile_audio_call_enabled", c19260xA.A05("is_profile_audio_call_enabled"));
        A1G.put("should_show_public_contacts", c19260xA.A05("should_show_public_contacts"));
        return A1G;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000d, code lost:
    
        if (r3.A04.A09() != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A01(boolean r4) {
        /*
            r3 = this;
            com.instagram.model.business.BusinessInfo r0 = r3.A05
            boolean r0 = r0.A0S
            if (r0 == 0) goto Lf
            com.instagram.business.ui.BusinessInfoSectionView r0 = r3.A04
            boolean r0 = r0.A09()
            r1 = 1
            if (r0 == 0) goto L10
        Lf:
            r1 = 0
        L10:
            com.instagram.model.business.BusinessInfo r0 = r3.A05
            com.instagram.model.business.BusinessInfo r0 = X.C35130FeX.A00(r0, r1)
            r3.A05 = r0
            com.instagram.business.ui.BusinessInfoSectionView r2 = r3.A04
            boolean r1 = r3.A0D
            boolean r0 = r0.A0S
            r2.A08(r1, r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EO0.A01(boolean):void");
    }

    public static boolean A02(EO0 eo0, boolean z) {
        C06090Tz c06090Tz;
        Boolean CTM = eo0.A06.A03.CTM();
        if (CTM != null && CTM.booleanValue()) {
            UserSession session = eo0.getSession();
            C14360o3.A0B(session, 0);
            if (z) {
                c06090Tz = C06090Tz.A06;
            } else {
                c06090Tz = C06090Tz.A05;
            }
            if (C18U.A06(c06090Tz, session, 36322761761630702L)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0097, code lost:
    
        if (r2 != false) goto L23;
     */
    @Override // X.InterfaceC37296Gbx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Cvq() {
        /*
            r23 = this;
            r0 = r23
            com.instagram.model.business.BusinessInfo r1 = r0.A05
            com.instagram.model.business.Address r7 = r1.A00
            android.os.Bundle r2 = r0.requireArguments()
            java.lang.String r1 = "extra_is_mv4b_verified"
            r13 = 0
            boolean r6 = r2.getBoolean(r1, r13)
            java.util.ArrayList r1 = X.AbstractC166987dD.A1E()
            if (r7 == 0) goto L3e
            java.lang.String r2 = r7.A01
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L3e
            java.lang.String r5 = r7.A04
            java.lang.String r4 = r7.A00
            java.lang.String r3 = r7.A01
            java.lang.String r2 = r7.A02
            java.lang.String r17 = "primary"
            r15 = 0
            com.instagram.model.business.ProfileAddressData r14 = new com.instagram.model.business.ProfileAddressData
            r16 = r15
            r20 = r3
            r21 = r2
            r22 = r15
            r19 = r4
            r18 = r5
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22)
            r1.add(r14)
        L3e:
            com.instagram.model.business.BusinessInfo r2 = r0.A05
            java.util.List r2 = r2.A0M
            if (r2 == 0) goto L47
            r1.addAll(r2)
        L47:
            r11 = 1
            if (r7 == 0) goto L90
            java.lang.String r2 = r7.A01
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L90
            boolean r2 = A02(r0, r13)
            if (r2 == 0) goto L90
            com.instagram.common.session.UserSession r3 = r0.getSession()
            X.C14360o3.A0B(r3, r11)
            r2 = 30
            java.lang.String r5 = X.MSV.A00(r2)
            java.lang.String r2 = r3.userId
            r9 = 0
            java.lang.String r4 = "click"
            java.lang.String r6 = "subscriber"
            java.lang.String r7 = "ig_profile_edit_contact_options_page"
            r8 = r2
            r2 = r0
            X.FAI.A00(r2, r3, r4, r5, r6, r7, r8, r9)
            android.os.Bundle r3 = X.AbstractC166987dD.A0b()
            java.lang.String r2 = "address_list_key"
            r3.putParcelableArrayList(r2, r1)
            X.EK0 r1 = new X.EK0
            r1.<init>()
            r1.setArguments(r3)
        L84:
            androidx.fragment.app.FragmentActivity r2 = r0.requireActivity()
            com.instagram.common.session.UserSession r0 = r0.getSession()
            X.AbstractC31177DnL.A15(r1, r2, r0)
            return
        L90:
            boolean r2 = A02(r0, r11)
            if (r6 == 0) goto L99
            r12 = 1
            if (r2 == 0) goto L9a
        L99:
            r12 = 0
        L9a:
            r8 = 0
            if (r2 == 0) goto Lc1
            com.instagram.common.session.UserSession r3 = r0.getSession()
            X.C14360o3.A0B(r3, r11)
            java.lang.String r17 = "add_button"
            java.lang.String r2 = r3.userId
            java.lang.String r16 = "click"
            java.lang.String r18 = "subscriber"
            java.lang.String r19 = "ig_profile_edit_contact_options_page"
            r20 = r2
            r21 = r8
            r14 = r0
            r15 = r3
            X.FAI.A00(r14, r15, r16, r17, r18, r19, r20, r21)
            com.instagram.user.model.User r3 = r0.A06
            android.content.Context r2 = r0.getContext()
            java.lang.Integer r8 = X.AbstractC1567472a.A03(r2, r3, r1)
        Lc1:
            X.FRn r6 = X.AbstractC31174DnI.A0P()
            java.lang.String r9 = r0.A07
            X.C14360o3.A0B(r9, r13)
            java.lang.String r10 = "primary"
            r14 = r13
            r15 = r11
            X.ELD r1 = r6.A05(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1.setTargetFragment(r0, r13)
            goto L84
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EO0.Cvq():void");
    }

    @Override // X.InterfaceC37296Gbx
    public final void DDF(boolean z) {
        ActionButton actionButton = this.A02;
        actionButton.getClass();
        actionButton.setEnabled(true);
        this.A09 = true;
        A01(z);
    }

    @Override // X.InterfaceC37296Gbx
    public final void Dba(boolean z) {
        if (this.A03 != null) {
            HashMap A1G = AbstractC166987dD.A1G();
            A1G.put("should_show_public_contacts", String.valueOf(z));
            this.A03.Cm3(new Y7A("business_contact_info", this.A07, "contact_options_profile_display_toggle", null, null, null, A1G, null));
        }
        if (z && this.A04.A09()) {
            BusinessInfoSectionView businessInfoSectionView = this.A04;
            C193328hC A0I = AbstractC31171DnF.A0I(requireContext());
            A0I.A0A(2131968561);
            A0I.A09(2131952295);
            AbstractC31176DnK.A15(DialogInterfaceOnClickListenerC35452Fk9.A00(businessInfoSectionView, 27), A0I);
            return;
        }
        this.A05 = C35130FeX.A00(this.A05, z);
        this.A09 = true;
        ActionButton actionButton = this.A02;
        actionButton.getClass();
        actionButton.setEnabled(true);
    }

    @Override // X.GXG
    public final void FBL(Address address, String str) {
        Address address2;
        if (address == null) {
            address2 = new Address("", "", "0", "", "");
        } else {
            address2 = address;
        }
        C35130FeX c35130FeX = new C35130FeX(this.A05);
        c35130FeX.A0B = this.A04.getEmail();
        c35130FeX.A00 = address2;
        this.A05 = new BusinessInfo(c35130FeX);
        BusinessInfoSectionView businessInfoSectionView = this.A04;
        if (businessInfoSectionView != null) {
            businessInfoSectionView.A05(address);
        }
        this.A09 = true;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.Ffp, java.lang.Object] */
    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        ?? obj = new Object();
        C35197Ffp.A01(AbstractC166997dE.A0N(this), obj, 2131956661);
        ActionButton A00 = C31722DwR.A00(new Fp1(this, 64), interfaceC56362iU, obj);
        this.A02 = A00;
        A00.setEnabled(this.A09);
        interfaceC56362iU.setIsLoading(this.A0B);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger;
        if (!this.A0F && (businessFlowAnalyticsLogger = this.A03) != null) {
            businessFlowAnalyticsLogger.Cid(new Y7A("business_contact_info", this.A07, null, null, null, null, null, null));
        }
        if (this.A09 && !this.A0A) {
            C193328hC A0O = AbstractC31175DnJ.A0O(this);
            A0O.A0A(2131960926);
            A0O.A09(2131960925);
            DialogInterfaceOnClickListenerC35452Fk9.A02(A0O, this, 17, 2131960924);
            AbstractC31176DnK.A16(null, A0O, 2131960923);
            return true;
        }
        this.A0A = false;
        return false;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C2JS optionalTreeField;
        String optionalStringField;
        ArrayList<String> stringArrayList;
        super.onViewCreated(view, bundle);
        this.A01 = view.requireViewById(R.id.loading_spinner);
        this.A00 = view.requireViewById(R.id.contact_info_container);
        this.A04 = (BusinessInfoSectionView) view.requireViewById(R.id.business_info_section);
        boolean A1v = this.A06.A1v();
        this.A08 = AbstractC166987dD.A1H();
        if (A1v) {
            Bundle bundle2 = this.mArguments;
            if (bundle2 != null && (stringArrayList = bundle2.getStringArrayList("ldp_app_ids")) != null) {
                this.A08 = AbstractC31171DnF.A0k(stringArrayList);
            }
            this.A08.contains(this.A06.A03.B4q());
        }
        this.A04.setBusinessInfo(getSession(), this.A05, this, false, this.A0E, A02(this, true), true, C18U.A06(C06090Tz.A05, getSession(), 36314592732777192L), this.A0D, false, this.A0C, this);
        if (AbstractC1565371b.A00(getSession())) {
            TextView textView = this.A04.A05;
            if (textView == null) {
                C14360o3.A0F("whatsAppTextView");
                throw C00O.createAndThrow();
            }
            textView.setAlpha(0.3f);
        }
        A01(false);
        TextView A0T = AbstractC166997dE.A0T(view, R.id.public_business_information_text);
        int i = 2131971148;
        if (C2E7.A00(this.A06)) {
            i = 2131971123;
        }
        A0T.setText(i);
        BusinessInfoSectionView businessInfoSectionView = this.A04;
        if (businessInfoSectionView != null) {
            businessInfoSectionView.A04(getSession());
        }
        C67542Ung A00 = AbstractC34896FZi.A00();
        if (A00 != null && (optionalTreeField = A00.getOptionalTreeField(0, AbstractC111324zv.A00(2012), C67022Uf9.class, 945472526)) != null && (optionalStringField = optionalTreeField.getOptionalStringField(0, "subtext")) != null) {
            TextView A0T2 = AbstractC166997dE.A0T(view, R.id.fx_im_bci_contact_info_reminder);
            A0T2.setVisibility(0);
            A0T2.setText(optionalStringField);
            UserSession session = getSession();
            EnumC33507Erg enumC33507Erg = EnumC33507Erg.BIZ_EDIT_GENERAL_CONTACT_INFO;
            C14360o3.A0B(session, 0);
            C35241Fga.A01(enumC33507Erg, session, "reminder_shown");
        }
        View view2 = this.A01;
        if (view2 != null && this.A00 != null) {
            view2.setVisibility(0);
            this.A00.setVisibility(8);
        }
        AbstractC34025F0e.A00(new C32548EUy(this, 11), getSession(), this, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0052, code lost:
    
        if (r1.A07 == false) goto L29;
     */
    @Override // X.InterfaceC37296Gbx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DV0() {
        /*
            r14 = this;
            X.AbstractC31174DnI.A0P()
            com.instagram.model.business.BusinessInfo r0 = r14.A05
            boolean r7 = r0.A0P
            com.instagram.business.ui.BusinessInfoSectionView r1 = r14.A04
            android.widget.EditText r0 = r1.A00
            if (r0 != 0) goto L17
            java.lang.String r0 = "emailEditView"
        Lf:
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L17:
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L23
            int r0 = r0.length()
            if (r0 != 0) goto L54
        L23:
            boolean r0 = r1.A0A()
            if (r0 == 0) goto L54
            android.widget.TextView r0 = r1.A01
            if (r0 != 0) goto L30
            java.lang.String r0 = "addressTextView"
            goto Lf
        L30:
            java.lang.CharSequence r0 = r0.getText()
            if (r0 == 0) goto L3c
            int r0 = r0.length()
            if (r0 != 0) goto L54
        L3c:
            android.widget.TextView r0 = r1.A05
            if (r0 != 0) goto L43
            java.lang.String r0 = "whatsAppTextView"
            goto Lf
        L43:
            java.lang.CharSequence r0 = r0.getText()
            if (r0 == 0) goto L4f
            int r0 = r0.length()
            if (r0 != 0) goto L54
        L4f:
            boolean r0 = r1.A07
            r6 = 1
            if (r0 != 0) goto L55
        L54:
            r6 = 0
        L55:
            java.lang.String r2 = r14.A07
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r5 = r14.A03
            r0 = 2
            android.os.Bundle r1 = X.AbstractC31174DnI.A0E(r2, r0)
            java.lang.String r3 = "is_profile_audio_call_enabled"
            r1.putBoolean(r3, r7)
            java.lang.String r0 = "maybe_show_confirmation_dialog"
            r1.putBoolean(r0, r6)
            X.AbstractC31171DnF.A13(r1, r2)
            X.EJL r2 = new X.EJL
            r2.<init>()
            r2.A00 = r5
            r2.setArguments(r1)
            androidx.fragment.app.FragmentActivity r1 = r14.requireActivity()
            com.instagram.common.session.UserSession r0 = r14.getSession()
            X.AbstractC31177DnL.A15(r2, r1, r0)
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r0 = r14.A03
            if (r0 == 0) goto Lb2
            java.lang.String r6 = "business_contact_info"
            r9 = 0
            java.lang.String r7 = r14.A07
            java.lang.String r8 = "profile_native_calling"
            X.Y7A r5 = new X.Y7A
            r10 = r9
            r11 = r9
            r12 = r9
            r13 = r9
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r0.Cm3(r5)
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r1 = r14.A03
            java.lang.String r6 = r14.A07
            com.instagram.model.business.BusinessInfo r0 = r14.A05
            boolean r0 = r0.A0P
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.util.Map r10 = java.util.Collections.singletonMap(r3, r0)
            X.Y7A r4 = new X.Y7A
            r5 = r8
            r7 = r9
            r8 = r9
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r1.Clo(r4)
        Lb2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EO0.DV0():void");
    }

    @Override // X.InterfaceC37296Gbx
    public final void DYL() {
        String str;
        AbstractC31173DnH.A0u();
        PublicPhoneContact publicPhoneContact = this.A05.A01;
        publicPhoneContact.getClass();
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putParcelable(EO4.A09, publicPhoneContact);
        EO4 eo4 = new EO4();
        eo4.setArguments(A0b);
        eo4.setTargetFragment(this, 0);
        AbstractC31177DnL.A15(eo4, requireActivity(), getSession());
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A03;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Cm3(new Y7A("business_contact_info", this.A07, "phone", null, null, null, null, null));
            PublicPhoneContact publicPhoneContact2 = this.A05.A01;
            if (publicPhoneContact2 == null) {
                str = null;
            } else {
                str = publicPhoneContact2.A03;
            }
            this.A03.Clo(new Y7A("business_contact_info", this.A07, null, null, null, Collections.singletonMap("phone", String.valueOf(str)), null, null));
        }
    }

    @Override // X.InterfaceC37296Gbx
    public final void E1y() {
        String str;
        if (AbstractC1565371b.A00(getSession())) {
            AbstractC35176FfT.A02(requireContext(), getSession(), "whatsapp_linking");
            return;
        }
        getSession();
        if (!AbstractC166987dD.A10(getSession()).A1a()) {
            str = AbstractC111324zv.A00(46);
        } else {
            str = "com.instagram.wa_linking.ig_whatsapp_linking_detail.DetailScreen";
        }
        C66277U6x A01 = C66277U6x.A01(str, AbstractC31180DnO.A0p("ContactOptionsEntryPoint", "whatsapp_linking_in_business_contact_button_setup"));
        IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(getSession());
        AbstractC31171DnF.A17(this, A0C, 2131977078);
        C72743Nv A02 = W6d.A02(A0C, A01);
        C140966Yy A0F = AbstractC31178DnM.A0F(this);
        A0F.A0A = "ContactOptionsEntryPoint";
        A0F.A0F = true;
        A0F.A0E(A02);
        A0F.A04();
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [com.instagram.model.business.PublicPhoneContact, java.lang.Object] */
    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String stripSeparators;
        String str;
        int A02 = C0f9.A02(1063088398);
        super.onCreate(bundle);
        String A0b = AbstractC31180DnO.A0b(this);
        A0b.getClass();
        this.A07 = A0b;
        EVO.A00(this);
        AbstractC25651Mw.A00(getSession()).A01(this.A0I, C23613Ad8.class);
        getParentFragmentManager().A0u(new C35758Fqv(this, 0), this, "native_calling_page_save");
        C35758Fqv c35758Fqv = new C35758Fqv(this, 1);
        getParentFragmentManager().A0u(c35758Fqv, this, "update_primary_address_result_key");
        getParentFragmentManager().A0u(c35758Fqv, this, "update_additional_business_addresses_result_key");
        this.A06 = AbstractC166987dD.A10(getSession());
        this.A03 = AbstractC151606s6.A00(EnumC151596s5.A07, this, getSession(), AbstractC166997dE.A0n());
        this.A0D = requireArguments().getBoolean("show_public_contacts_toggle", true);
        Address A022 = AbstractC1567472a.A02(requireContext(), this.A06);
        if (A022 == null) {
            A022 = new Address("", "", "0", "", "");
        }
        ArrayList A06 = AbstractC1567472a.A06(this.A06);
        if (this.A06.A03.Bj9() == null) {
            stripSeparators = "";
        } else {
            stripSeparators = PhoneNumberUtils.stripSeparators(AnonymousClass001.A0g(this.A06.A03.Bj8(), " ", this.A06.A03.Bj9()));
        }
        String Bj8 = this.A06.A03.Bj8();
        String Bj9 = this.A06.A03.Bj9();
        switch (this.A06.A0K().intValue()) {
            case 0:
                str = "UNKNOWN";
                break;
            case 1:
                str = "CALL";
                break;
            default:
                str = "TEXT";
                break;
        }
        ?? obj = new Object();
        obj.A01 = Bj8;
        obj.A02 = Bj9;
        obj.A03 = stripSeparators;
        obj.A00 = str;
        C5F6 B4r = this.A06.A03.B4r();
        String str2 = null;
        if (B4r != null) {
            str2 = B4r.Aqb();
        }
        C35130FeX c35130FeX = new C35130FeX();
        c35130FeX.A09 = this.A06.A03.getCategory();
        c35130FeX.A0B = this.A06.A03.Bj6();
        c35130FeX.A01 = obj;
        c35130FeX.A00 = A022;
        c35130FeX.A0M = A06;
        c35130FeX.A0J = this.A06.A03.Baz();
        c35130FeX.A0L = this.A06.A03.CHZ();
        c35130FeX.A0P = this.A06.A2J();
        c35130FeX.A0N = this.A06.A1v();
        c35130FeX.A05 = this.A06.A03.B4p();
        c35130FeX.A04 = this.A06.A03.B4q();
        c35130FeX.A06 = this.A06.A03.B4s();
        c35130FeX.A07 = this.A06.A03.B4t();
        c35130FeX.A08 = str2;
        c35130FeX.A0C = this.A06.A03.B5A();
        c35130FeX.A0D = this.A06.A03.B5B();
        c35130FeX.A0E = this.A06.A03.B5D();
        c35130FeX.A0F = this.A06.A03.B5C();
        c35130FeX.A0S = this.A06.A1d();
        this.A05 = new BusinessInfo(c35130FeX);
        this.A0E = !C2E7.A01(this.A06);
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A03;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Clo(new Y7A("business_contact_info", this.A07, null, null, null, A00(this), null, null));
        }
        AbstractC25651Mw.A00(getSession()).A01(this.A0H, AbstractC36051Fvn.class);
        C0f9.A09(-795239667, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(474308974);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.contact_button_setup_fragment_layout);
        C0f9.A09(1132664414, A02);
        return A0A;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(140946808);
        super.onDestroy();
        AbstractC25651Mw.A00(getSession()).A02(this.A0H, AbstractC36051Fvn.class);
        AbstractC25651Mw.A00(getSession()).A02(this.A0I, C23613Ad8.class);
        C0f9.A09(-513979535, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1611485396);
        super.onDestroyView();
        C0f9.A09(-1651880704, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(337199959);
        super.onPause();
        this.A04.A02();
        C0f9.A09(1984754353, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(1763591004);
        super.onResume();
        this.A04.setBusinessInfoListeners(this);
        AbstractC31171DnF.A16(this);
        Window A0H = AbstractC31174DnI.A0H(this);
        A0H.getClass();
        A0H.setSoftInputMode(3);
        A01(false);
        C0f9.A09(864818697, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(249560852);
        super.onStop();
        AbstractC31171DnF.A16(this);
        Window A0H = AbstractC31174DnI.A0H(this);
        A0H.getClass();
        A0H.setSoftInputMode(3);
        C0f9.A09(2128965205, A02);
    }
}
