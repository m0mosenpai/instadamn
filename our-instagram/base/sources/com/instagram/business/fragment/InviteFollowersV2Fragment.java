package com.instagram.business.fragment;

import X.AbstractC14490oL;
import X.AbstractC166987dD;
import X.AbstractC18680vv;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31175DnJ;
import X.AbstractC31176DnK;
import X.AbstractC31177DnL;
import X.AbstractC31179DnN;
import X.AbstractC31180DnO;
import X.AbstractC33235ElU;
import X.AbstractC35211Fg4;
import X.AnonymousClass001;
import X.C0BQ;
import X.C0KL;
import X.C0f9;
import X.C1GL;
import X.C25621Ms;
import X.C31500Dsk;
import X.C31650DvG;
import X.C31722DwR;
import X.C32548EUy;
import X.C41451vu;
import X.C54P;
import X.C56352iT;
import X.EBF;
import X.EnumC33401EpY;
import X.FTI;
import X.InterfaceC37222GaX;
import X.InterfaceC41501vz;
import X.InterfaceC56362iU;
import X.InterfaceC60072op;
import X.InterfaceC60122ou;
import X.ViewOnClickListenerC35690FpP;
import X.Y7A;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.actionbar.ActionButton;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.headline.IgdsHeadline;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes6.dex */
public class InviteFollowersV2Fragment extends AbstractC33235ElU implements InterfaceC60072op, InterfaceC60122ou {
    public C56352iT A00;
    public ActionButton A01;
    public BusinessFlowAnalyticsLogger A02;
    public C31500Dsk A03;
    public UserSession A04;
    public String A05;
    public boolean A06;
    public boolean A07;
    public InterfaceC37222GaX A09;
    public String A0A;
    public String A0B;
    public View mLoadingIndicator;
    public boolean A08 = true;
    public final InterfaceC41501vz A0C = C31650DvG.A00(this, 5);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "invite_followers_v2_fragment";
    }

    public static void A00(InviteFollowersV2Fragment inviteFollowersV2Fragment, String str) {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = inviteFollowersV2Fragment.A02;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Cm3(new Y7A("invite_followers", inviteFollowersV2Fragment.A05, str, null, null, null, null, null));
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.Ffp, java.lang.Object] */
    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        ?? obj = new Object();
        obj.A02 = "";
        ActionButton A00 = C31722DwR.A00(ViewOnClickListenerC35690FpP.A00(this, 18), interfaceC56362iU, obj);
        this.A01 = A00;
        A00.setEnabled(this.A06);
        AbstractC31180DnO.A17(ViewOnClickListenerC35690FpP.A00(this, 19), AbstractC31176DnK.A0I(), interfaceC56362iU);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger;
        if (this.A08 && (businessFlowAnalyticsLogger = this.A02) != null) {
            businessFlowAnalyticsLogger.Cid(new Y7A("invite_followers", this.A05, null, null, null, null, null, null));
            return false;
        }
        return false;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return this.A04;
    }

    @Override // X.AbstractC60672pq, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.A09 = AbstractC35211Fg4.A01(this);
    }

    @Override // X.AbstractC33235ElU, X.AbstractC60672pq, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1770995647);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A04 = AbstractC31176DnK.A0S(this);
        this.A05 = AbstractC31171DnF.A0Z(requireArguments);
        this.A0B = requireArguments.getString("ARG_TITLE", requireContext().getString(2131964656));
        this.A0A = requireArguments.getString("ARG_SUB_TITLE", requireContext().getString(2131964655));
        this.A03 = new C31500Dsk(this.A04, this);
        this.A07 = AbstractC31172DnG.A1X(requireArguments, "ARG_CHECKLIST_ITEM_COMPLETED");
        BusinessFlowAnalyticsLogger A00 = AbstractC35211Fg4.A00(this.A09, this, this.A04);
        this.A02 = A00;
        if (A00 != null) {
            A00.Clo(new Y7A("invite_followers", this.A05, null, null, null, null, null, null));
        }
        C0f9.A09(544863326, A02);
    }

    @Override // X.AbstractC33235ElU, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1191420795);
        View inflate = layoutInflater.inflate(R.layout.invite_followers_v2_fragment, viewGroup, false);
        IgdsHeadline A0Q = AbstractC31179DnN.A0Q(inflate, R.id.onboarding_checklist_headline);
        A0Q.setHeadline(this.A0B);
        A0Q.setBody(this.A0A);
        A0Q.setVisibility(0);
        this.mLoadingIndicator = inflate.requireViewById(R.id.loading_spinner);
        this.A00 = AbstractC31176DnK.A0J(this);
        C41451vu.A01.A02(this.A0C, C0KL.class);
        C0f9.A09(-1182420845, A02);
        return inflate;
    }

    @Override // X.AbstractC60672pq, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(409086049);
        super.onDestroyView();
        C41451vu.A01.A03(this.A0C, C0KL.class);
        C0f9.A09(148489313, A02);
    }

    @Override // X.AbstractC33235ElU, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean A0H;
        super.onViewCreated(view, bundle);
        C31500Dsk c31500Dsk = this.A03;
        Context requireContext = requireContext();
        C32548EUy c32548EUy = new C32548EUy(this, 14);
        C1GL c1gl = c31500Dsk.A01;
        UserSession userSession = c31500Dsk.A00;
        C25621Ms A0M = AbstractC31177DnL.A0M(userSession);
        A0M.A0B("business/account/get_invite_friends_subitems/");
        ArrayList A1E = AbstractC166987dD.A1E();
        for (EnumC33401EpY enumC33401EpY : EnumC33401EpY.values()) {
            switch (enumC33401EpY.ordinal()) {
                case 0:
                    A0H = C54P.A00(requireContext, userSession);
                    break;
                case 1:
                case 8:
                    A0H = C0BQ.A00(userSession).CLL();
                    break;
                case 2:
                case 4:
                case 5:
                case 6:
                    A1E.add(enumC33401EpY);
                    continue;
                case 7:
                    A0H = AbstractC14490oL.A0H(requireContext, "com.whatsapp");
                    break;
            }
            if (!A0H) {
            }
            A1E.add(enumC33401EpY);
            continue;
        }
        Iterator it = A1E.iterator();
        String str = "";
        while (it.hasNext()) {
            EnumC33401EpY enumC33401EpY2 = (EnumC33401EpY) it.next();
            if (str.length() > 0) {
                str = AnonymousClass001.A0C(str, ',');
            }
            str = AnonymousClass001.A0R(str, enumC33401EpY2.A00);
        }
        A0M.A9s("client_eligible_sub_items", str);
        A0M.A9s("logged_in_user_ids", C31500Dsk.A00(c31500Dsk));
        A0M.A0R(EBF.class, FTI.class);
        AbstractC31175DnJ.A1L(A0M, c32548EUy, c1gl);
    }
}
