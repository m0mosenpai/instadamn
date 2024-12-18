package X;

import android.app.Dialog;
import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;

/* renamed from: X.ElG, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33226ElG extends AbstractC33235ElU implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "AccountPrivacyOptionFragment";
    public Dialog A00;
    public Dialog A01;
    public C211739Zk A02;
    public C18920wW A03;
    public C40701ud A04;
    public EUR A05;
    public C36731GHa A06;
    public C36731GHa A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public C36731GHa A0D;
    public final InterfaceC09390do A0E = AbstractC60492pY.A02(this);
    public final C31728DwZ A0F = C31728DwZ.A00(this, 27);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131963150);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "account_privacy_option";
    }

    public static final void A01(UserSession userSession, C33226ElG c33226ElG) {
        C40701ud c40701ud = c33226ElG.A04;
        if (c40701ud != null) {
            FXR.A00(c33226ElG.requireContext(), userSession, c40701ud, "IG_PROFILE_PRIVACY", new JEZ(c33226ElG, 21), new JEZ(c33226ElG, 22));
        }
    }

    public static final void A02(C33226ElG c33226ElG, User user) {
        ViewOnClickListenerC35687FpM viewOnClickListenerC35687FpM = new ViewOnClickListenerC35687FpM(36, user, c33226ElG);
        C189448aO A0g = AbstractC25231BEo.A0g(c33226ElG.A0E);
        AbstractC25226BEj.A1M(c33226ElG.requireActivity(), A0g, 2131973610);
        A0g.A0U = new GH5(c33226ElG, 17);
        A0g.A0g = c33226ElG.requireActivity().getString(2131973608);
        A0g.A0K = viewOnClickListenerC35687FpM;
        A0g.A16 = false;
        C189478aR A00 = A0g.A00();
        A00.A0Q(true);
        EIT eit = new EIT();
        eit.A00 = new FHR(A00);
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putBoolean("ARG_PRIVACY_SWITCH_TO_PRIVATE", false);
        A0b.putBoolean("ARG_IS_REDESIGN", true);
        eit.setArguments(A0b);
        AbstractC31173DnH.A1G(c33226ElG, eit, A00);
        c33226ElG.A08 = true;
    }

    public static final void A04(C33226ElG c33226ElG, boolean z) {
        C2UU c2uu;
        C36731GHa c36731GHa = c33226ElG.A0D;
        if (c36731GHa != null) {
            c36731GHa.A0D = z;
        }
        if (c33226ElG.mView != null && (c2uu = (C2UU) AbstractC31175DnJ.A0P(c33226ElG)) != null) {
            c2uu.notifyDataSetChanged();
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0E);
    }

    public static final ArrayList A00(C33226ElG c33226ElG) {
        ArrayList A1E = AbstractC166987dD.A1E();
        C08730cb c08730cb = C17060sy.A01;
        InterfaceC09390do interfaceC09390do = c33226ElG.A0E;
        User A0g = AbstractC31176DnK.A0g(c08730cb, interfaceC09390do);
        C211739Zk c211739Zk = c33226ElG.A02;
        if (c211739Zk != null) {
            A1E.add(c211739Zk);
        }
        C36731GHa c36731GHa = new C36731GHa(new C35730FqD(12, c33226ElG, A0g), new G9C(4, A0g, c33226ElG), 2131969937, AbstractC167007dF.A1X(A0g.A0M(), C05F.A0C));
        c33226ElG.A0D = c36731GHa;
        c36731GHa.A0E = AbstractC167007dF.A1W(c33226ElG.A02);
        A1E.add(c36731GHa);
        C35246Fgf.A02(A1E, 2131971122);
        android.net.Uri A0B = AbstractC25227BEk.A0B(AbstractC63260SgI.A01(c33226ElG.requireActivity(), "https://help.instagram.com/116024195217477?ref=igapp"));
        String A0v = AbstractC25227BEk.A0v(c33226ElG, 2131965052);
        AbstractC33235ElU.A07(A0B, c33226ElG, A0v, A1E, 2131969938);
        AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, A0o, 36315378712186030L)) {
            C35119FeM.A00(A1E, true);
            C36731GHa A02 = C36731GHa.A02(new C35730FqD(13, c33226ElG, A0g), 2131961993, false);
            c33226ElG.A06 = A02;
            A02.A0D = AbstractC167007dF.A1T(A0g.A03.CbC());
            A1E.add(c33226ElG.A06);
            AbstractC33235ElU.A07(AbstractC25227BEk.A0B(AbstractC63260SgI.A01(c33226ElG.requireActivity(), "https://help.instagram.com/557544397610546?ref=igapp")), c33226ElG, A0v, A1E, 2131961992);
        }
        if (C18U.A06(c06090Tz, AbstractC166987dD.A0o(interfaceC09390do), 36314064451996046L)) {
            if (A0g.A0M() != C05F.A01) {
                c33226ElG.A07 = null;
                c33226ElG.A0A = false;
            } else if (!c33226ElG.A0A) {
                C40701ud c40701ud = c33226ElG.A04;
                if (c40701ud != null) {
                    C2JM A0b = AbstractC25225BEi.A0b();
                    C2JM A0b2 = AbstractC25225BEi.A0b();
                    A0b.A04(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0g.getId());
                    PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC25227BEk.A0U(true), "IGSeoIndexingOptOut", A0b.getParamsCopy(), A0b2.getParamsCopy(), QmP.class, false, null, 0, null, "fetch__XDTUserDict", AbstractC166987dD.A1E());
                    c40701ud.ATV(C35822Fry.A00, new C35830Fs6(2, A0g, c33226ElG), pandoGraphQLRequest);
                    return A1E;
                }
            } else if (c33226ElG.A07 == null && A0g.A03.CTU() != null) {
                C35119FeM.A00(A1E, true);
                C36731GHa A022 = C36731GHa.A02(new C35730FqD(11, c33226ElG, A0g), 2131973319, AbstractC166997dE.A1Z(A0g.A03.CTU(), true));
                c33226ElG.A07 = A022;
                A1E.add(A022);
                AbstractC33235ElU.A07(AbstractC25227BEk.A0B(AbstractC63260SgI.A01(c33226ElG.requireActivity(), "https://help.instagram.com/147542625391305?ref=igapp")), c33226ElG, AbstractC25227BEk.A0v(c33226ElG, 2131965052), A1E, 2131973318);
                return A1E;
            }
        }
        return A1E;
    }

    public static final void A03(C33226ElG c33226ElG, User user, Integer num, boolean z) {
        String str;
        user.A0n(num);
        InterfaceC09390do interfaceC09390do = c33226ElG.A0E;
        C35132FeZ.A01(AbstractC166987dD.A0r(interfaceC09390do));
        if (c33226ElG.isVisible()) {
            boolean A1O = AbstractC167007dF.A1O(F9N.A00(AbstractC166987dD.A0r(interfaceC09390do)).A00);
            c33226ElG.A05 = new EUR(c33226ElG.requireContext(), AbstractC166987dD.A0r(interfaceC09390do), new C32998Egl(c33226ElG, user, z));
            C25621Ms A0c = AbstractC167017dG.A0c(AbstractC166987dD.A0o(interfaceC09390do));
            if (user.A0M() == C05F.A0C) {
                str = "accounts/set_private/";
            } else {
                str = "accounts/set_public/";
            }
            A0c.A0E = str;
            A0c.A0I("send_approved_friendships_notif", A1O);
            C36014FvC c36014FvC = new C36014FvC(2);
            int i = C222015v.A09;
            AbstractC31178DnM.A1J(A0c, c36014FvC, AbstractC166987dD.A0r(interfaceC09390do));
            C1ON A0P = AbstractC31176DnK.A0P(A0c);
            A0P.A00 = c33226ElG.A05;
            c33226ElG.schedule(A0P);
        }
        AbstractC62582sx.A00(c33226ElG.requireActivity()).A0y("account_privacy_options_fragment_request_key", AbstractC166987dD.A0b());
    }

    @Override // X.AbstractC33235ElU, X.AbstractC60672pq, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1708076526);
        super.onCreate(bundle);
        InterfaceC09390do interfaceC09390do = this.A0E;
        this.A03 = AbstractC31176DnK.A0M(this, interfaceC09390do);
        this.A04 = AbstractC40691uc.A01(AbstractC166987dD.A0r(interfaceC09390do));
        AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do);
        C25621Ms A0D = AbstractC31179DnN.A0D(A0o);
        A0D.A0B("friendships/pending_follow_requests_count/");
        C1ON A0e = AbstractC25227BEk.A0e(A0D, EAM.class, C34739FSe.class);
        C31702Dw7.A01(A0e, A0o, 42);
        C1GJ.A03(A0e);
        A01(AbstractC166987dD.A0r(interfaceC09390do), this);
        AbstractC31176DnK.A0Q(interfaceC09390do).A01(this.A0F, C36092FwS.class);
        C0f9.A09(1902045060, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(2126517251);
        super.onPause();
        this.A0C = this.A08;
        C0f9.A09(2034380244, A02);
    }

    @Override // X.AbstractC60672pq, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(1943588041);
        super.onResume();
        setItems(A00(this));
        if (this.A0C && !this.A08) {
            A02(this, AbstractC31176DnK.A0g(C17060sy.A01, this.A0E));
        }
        C25621Ms A0D = AbstractC31179DnN.A0D(AbstractC166987dD.A0o(this.A0E));
        A0D.A0B("users/get_is_eligible_restrict_message_settings/");
        C31702Dw7.A00(this, AbstractC25227BEk.A0e(A0D, EC4.class, FXX.class), 38);
        C0f9.A09(-1361867913, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(-235647477);
        super.onStop();
        EUR eur = this.A05;
        if (eur != null) {
            eur.A00 = null;
        }
        AbstractC31176DnK.A0Q(this.A0E).A02(this.A0F, C36092FwS.class);
        C0f9.A09(-1656804753, A02);
    }
}
