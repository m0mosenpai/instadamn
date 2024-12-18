package com.instagram.business.fragment;

import X.AbstractC151606s6;
import X.AbstractC1567472a;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC18680vv;
import X.AbstractC31171DnF;
import X.AbstractC31173DnH;
import X.AbstractC31174DnI;
import X.AbstractC31175DnJ;
import X.AbstractC31176DnK;
import X.AbstractC31178DnM;
import X.AbstractC31179DnN;
import X.AbstractC31180DnO;
import X.AbstractC34025F0e;
import X.AbstractC38851rI;
import X.AbstractC43591JPw;
import X.AbstractC60672pq;
import X.C00O;
import X.C06090Tz;
import X.C0f9;
import X.C0w9;
import X.C14360o3;
import X.C155706yz;
import X.C193328hC;
import X.C2E7;
import X.C2US;
import X.C31722DwR;
import X.C32548EUy;
import X.C35130FeX;
import X.C35197Ffp;
import X.C35939Ftx;
import X.C3FQ;
import X.DialogInterfaceOnClickListenerC35452Fk9;
import X.DialogInterfaceOnClickListenerC35455FkC;
import X.EQC;
import X.EVO;
import X.EnumC151596s5;
import X.GBX;
import X.InterfaceC56362iU;
import X.InterfaceC60072op;
import X.InterfaceC60122ou;
import X.LJW;
import X.P3U;
import X.ViewOnClickListenerC35684FpJ;
import X.ViewOnClickListenerC35690FpP;
import X.Y7A;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.actionbar.ActionButton;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.switchbutton.IgdsSwitch;
import com.instagram.model.business.BusinessInfo;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class ProfileDisplayOptionsFragment extends AbstractC60672pq implements InterfaceC60072op, InterfaceC60122ou {
    public View A00;
    public View A01;
    public BusinessFlowAnalyticsLogger A02;
    public UserSession A03;
    public BusinessInfo A04;
    public BusinessInfo A05;
    public User A06;
    public String A07;
    public boolean A08;
    public IgdsSwitch categoryToggle;
    public IgdsSwitch contactsToggle;
    public IgdsSwitch discountToggle;
    public View rootView;
    public ActionButton saveButton;

    private final void A00(View view, IgdsSwitch igdsSwitch, Integer num) {
        igdsSwitch.A07 = new P3U(1, num, this, igdsSwitch);
        ViewOnClickListenerC35684FpJ.A00(view, num, this, igdsSwitch, 6);
    }

    private final boolean A04(User user) {
        if (user != null) {
            boolean A1P = AbstractC167007dF.A1P(user.A2J() ? 1 : 0, 1);
            Context requireContext = requireContext();
            UserSession userSession = this.A03;
            if (userSession != null) {
                return AbstractC1567472a.A00(requireContext, userSession, user, true, false) - (A1P ? 1 : 0) > 0;
            }
            AbstractC31171DnF.A0y();
            throw C00O.createAndThrow();
        }
        return false;
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, X.6yy] */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.2US, X.2xM, X.EQC] */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        UserSession userSession = this.A03;
        if (userSession != null) {
            if (!AbstractC31178DnM.A1X(C06090Tz.A05, userSession, 36330552831263646L)) {
                requireContext();
                UserSession userSession2 = this.A03;
                if (userSession2 != null) {
                    User user = this.A06;
                    C14360o3.A0A(user);
                    boolean A01 = C2E7.A01(this.A06);
                    boolean booleanValue = getUseRecyclerViewFromQE().booleanValue();
                    ?? c2us = new C2US(false);
                    C35939Ftx c35939Ftx = new C35939Ftx(this, this, userSession2, new GBX(c2us), A01);
                    c2us.A00 = c35939Ftx;
                    ?? obj = new Object();
                    c2us.A01 = obj;
                    obj.A0E = user;
                    obj.A0K = false;
                    obj.A00 = 0;
                    obj.A08 = null;
                    obj.A0D = null;
                    obj.A0C = null;
                    obj.A04 = null;
                    obj.A01 = null;
                    obj.A0B = null;
                    obj.A0J = false;
                    obj.A0H = null;
                    obj.A0G = null;
                    obj.A0F = null;
                    obj.A07 = null;
                    obj.A06 = null;
                    obj.A09 = null;
                    obj.A02 = null;
                    obj.A0M = false;
                    obj.A0I = false;
                    obj.A0L = false;
                    obj.A03 = null;
                    c2us.A02 = new C155706yz();
                    AbstractC31173DnH.A1R(c2us, c35939Ftx);
                    c2us.addModel(c2us.A01, c2us.A02, c2us.A00);
                    c2us.A03 = booleanValue;
                    setAdapter(c2us);
                }
            }
            C3FQ scrollingViewProxy = getScrollingViewProxy();
            C14360o3.A0A(scrollingViewProxy);
            if (scrollingViewProxy.CXX()) {
                ViewGroup CFj = scrollingViewProxy.CFj();
                C14360o3.A0C(CFj, AbstractC43591JPw.A00(42));
                LJW.A00((ListView) CFj);
            }
            View view2 = this.A01;
            if (view2 != null && this.A00 != null) {
                view2.setVisibility(0);
                View view3 = this.A00;
                C14360o3.A0A(view3);
                view3.setVisibility(8);
            }
            UserSession userSession3 = this.A03;
            if (userSession3 != null) {
                AbstractC34025F0e.A00(new C32548EUy(this, 19), userSession3, this, false);
                return;
            }
        }
        C14360o3.A0F("userSession");
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
    
        if (r2.A04(r2.A06) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(com.instagram.business.fragment.ProfileDisplayOptionsFragment r2) {
        /*
            boolean r0 = r2.A08
            if (r0 == 0) goto L16
            com.instagram.model.business.BusinessInfo r0 = r2.A04
            X.C14360o3.A0A(r0)
            boolean r0 = r0.A0S
            if (r0 == 0) goto L16
            com.instagram.user.model.User r0 = r2.A06
            boolean r0 = r2.A04(r0)
            r1 = 1
            if (r0 != 0) goto L17
        L16:
            r1 = 0
        L17:
            com.instagram.model.business.BusinessInfo r0 = r2.A04
            com.instagram.model.business.BusinessInfo r0 = X.C35130FeX.A00(r0, r1)
            r2.A04 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.business.fragment.ProfileDisplayOptionsFragment.A01(com.instagram.business.fragment.ProfileDisplayOptionsFragment):void");
    }

    public static final void A02(ProfileDisplayOptionsFragment profileDisplayOptionsFragment, IgdsSwitch igdsSwitch, Integer num, boolean z) {
        User user;
        boolean z2;
        String str;
        String str2;
        C35130FeX c35130FeX = new C35130FeX(profileDisplayOptionsFragment.A04);
        User user2 = profileDisplayOptionsFragment.A06;
        try {
            Parcelable.Creator creator = User.CREATOR;
        } catch (IOException unused) {
            C0w9.A03("profile_display_options", "Exception on serialize and deserialize User");
            user = null;
        }
        if (user2 != null) {
            user = AbstractC38851rI.A04(AbstractC38851rI.A07(user2));
            profileDisplayOptionsFragment.A06 = user;
            if (user != null && profileDisplayOptionsFragment.A05 != null) {
                int intValue = num.intValue();
                if (intValue != 0) {
                    if (intValue != 1) {
                        c35130FeX.A0R = z;
                        C14360o3.A0A(user);
                        user.A03.Ebm(Boolean.valueOf(z));
                        BusinessInfo businessInfo = profileDisplayOptionsFragment.A05;
                        C14360o3.A0A(businessInfo);
                        z2 = businessInfo.A0R;
                        str = "switch_display_discount";
                    } else {
                        if (!profileDisplayOptionsFragment.A04(user)) {
                            C193328hC A0O = AbstractC31175DnJ.A0O(profileDisplayOptionsFragment);
                            A0O.A0A(2131968561);
                            A0O.A09(2131952295);
                            DialogInterfaceOnClickListenerC35452Fk9.A02(A0O, profileDisplayOptionsFragment, 21, 2131952294);
                            AbstractC31176DnK.A14(DialogInterfaceOnClickListenerC35455FkC.A00(igdsSwitch, profileDisplayOptionsFragment, 8), A0O);
                            z2 = false;
                        } else {
                            User user3 = profileDisplayOptionsFragment.A06;
                            C14360o3.A0A(user3);
                            user3.A03.EeC(Boolean.valueOf(z));
                            BusinessInfo businessInfo2 = profileDisplayOptionsFragment.A05;
                            C14360o3.A0A(businessInfo2);
                            z2 = businessInfo2.A0S;
                        }
                        c35130FeX.A0S = z;
                        str = "switch_display_contact";
                    }
                } else {
                    c35130FeX.A0Q = z;
                    C14360o3.A0A(user);
                    user.A03.Ee4(Boolean.valueOf(z));
                    BusinessInfo businessInfo3 = profileDisplayOptionsFragment.A05;
                    C14360o3.A0A(businessInfo3);
                    z2 = businessInfo3.A0Q;
                    str = "switch_display_category";
                }
                profileDisplayOptionsFragment.A04 = new BusinessInfo(c35130FeX);
                EQC eqc = (EQC) profileDisplayOptionsFragment.getAdapter();
                if (eqc != null) {
                    eqc.A00(profileDisplayOptionsFragment.A06);
                }
                C3FQ scrollingViewProxy = profileDisplayOptionsFragment.getScrollingViewProxy();
                C14360o3.A0A(scrollingViewProxy);
                if (scrollingViewProxy.CXX()) {
                    ViewGroup CFj = scrollingViewProxy.CFj();
                    C14360o3.A0C(CFj, AbstractC43591JPw.A00(42));
                    LJW.A00((ListView) CFj);
                }
                HashMap A1G = AbstractC166987dD.A1G();
                A1G.put("is_profile_info_shown", String.valueOf(z2));
                HashMap A1G2 = AbstractC166987dD.A1G();
                A1G2.put("is_profile_info_shown", String.valueOf(z));
                BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = profileDisplayOptionsFragment.A02;
                if (businessFlowAnalyticsLogger == null) {
                    str2 = "logger";
                } else {
                    String str3 = profileDisplayOptionsFragment.A07;
                    if (str3 == null) {
                        str2 = "entryPoint";
                    } else {
                        businessFlowAnalyticsLogger.Cim(new Y7A("profile_display_options", str3, str, null, null, A1G, A1G2, null));
                        return;
                    }
                }
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            }
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public static final boolean A03(ProfileDisplayOptionsFragment profileDisplayOptionsFragment) {
        UserSession userSession = profileDisplayOptionsFragment.A03;
        if (userSession == null) {
            AbstractC31171DnF.A0y();
            throw C00O.createAndThrow();
        }
        return AbstractC31178DnM.A1X(C06090Tz.A05, userSession, 36315683654471154L);
    }

    @Override // X.AbstractC60672pq
    public final Boolean getUseRecyclerViewFromQE() {
        UserSession userSession = this.A03;
        if (userSession == null) {
            AbstractC31171DnF.A0y();
            throw C00O.createAndThrow();
        }
        return AbstractC166997dE.A0c(C06090Tz.A05, userSession, 36314008617224565L);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        String str;
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A02;
        if (businessFlowAnalyticsLogger == null) {
            str = "logger";
        } else {
            String str2 = this.A07;
            if (str2 == null) {
                str = "entryPoint";
            } else {
                businessFlowAnalyticsLogger.Cid(new Y7A("profile_display_options", str2, null, null, null, null, null, null));
                return false;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C35197Ffp A00 = C35197Ffp.A00(interfaceC56362iU);
        C35197Ffp.A02(AbstractC166997dE.A0N(this), A00, 2131961612);
        this.saveButton = C31722DwR.A00(ViewOnClickListenerC35690FpP.A00(this, 34), interfaceC56362iU, A00);
        ViewOnClickListenerC35690FpP.A02(AbstractC31174DnI.A0K(), interfaceC56362iU, this, 35);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "profile_display_options";
    }

    @Override // X.AbstractC60672pq, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1678781454);
        this.A03 = AbstractC31176DnK.A0S(this);
        super.onCreate(bundle);
        String A0b = AbstractC31180DnO.A0b(this);
        C14360o3.A0A(A0b);
        this.A07 = A0b;
        EnumC151596s5 enumC151596s5 = EnumC151596s5.A07;
        UserSession userSession = this.A03;
        if (userSession == null) {
            AbstractC31171DnF.A0y();
            throw C00O.createAndThrow();
        }
        BusinessFlowAnalyticsLogger A00 = AbstractC151606s6.A00(enumC151596s5, this, userSession, null);
        if (A00 != null) {
            this.A02 = A00;
            EVO.A00(this);
            C0f9.A09(-1157918645, A02);
        } else {
            IllegalStateException A0g = AbstractC166997dE.A0g();
            C0f9.A09(1339703207, A02);
            throw A0g;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x007b, code lost:
    
        if (X.AbstractC31178DnM.A1X(X.C06090Tz.A05, r4, 36321675133855410L) != false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01d2  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r13, android.view.ViewGroup r14, android.os.Bundle r15) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.business.fragment.ProfileDisplayOptionsFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // X.AbstractC60672pq, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(1948731935);
        super.onResume();
        IgdsSwitch igdsSwitch = this.categoryToggle;
        C14360o3.A0A(igdsSwitch);
        BusinessInfo businessInfo = this.A04;
        C14360o3.A0A(businessInfo);
        igdsSwitch.setChecked(businessInfo.A0Q);
        A01(this);
        IgdsSwitch igdsSwitch2 = this.contactsToggle;
        C14360o3.A0A(igdsSwitch2);
        BusinessInfo businessInfo2 = this.A04;
        C14360o3.A0A(businessInfo2);
        igdsSwitch2.setChecked(businessInfo2.A0S);
        User user = this.A06;
        if (user != null) {
            BusinessInfo businessInfo3 = this.A04;
            C14360o3.A0A(businessInfo3);
            user.A03.EeC(Boolean.valueOf(businessInfo3.A0S));
        }
        EQC eqc = (EQC) getAdapter();
        if (eqc != null) {
            eqc.A00(this.A06);
        }
        if (!A03(this)) {
            IgdsSwitch igdsSwitch3 = this.discountToggle;
            C14360o3.A0A(igdsSwitch3);
            BusinessInfo businessInfo4 = this.A04;
            C14360o3.A0A(businessInfo4);
            igdsSwitch3.setChecked(businessInfo4.A0R);
        }
        C0f9.A09(391554211, A02);
    }

    @Override // X.AbstractC60672pq
    public final void onRecyclerViewCreated(RecyclerView recyclerView) {
        AbstractC31179DnN.A12(recyclerView);
    }
}
