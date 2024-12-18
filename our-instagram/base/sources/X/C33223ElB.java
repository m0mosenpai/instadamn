package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.ElB, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33223ElB extends AbstractC33235ElU implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "VisibilityOffInstagramFragment";
    public C40701ud A00;
    public C31349DqE A01;
    public C36731GHa A02;
    public C36731GHa A03;
    public User A04;
    public Boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final InterfaceC09390do A09 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131976909);
    }

    @Override // X.AbstractC33235ElU
    public final int getBottomPadding() {
        return 0;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "visibility_off_instagram";
    }

    @Override // X.AbstractC33235ElU
    public final int getTopPadding() {
        return 0;
    }

    @Override // X.AbstractC33235ElU, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        User user = this.A04;
        if (user == null) {
            C14360o3.A0F("currentUser");
            throw C00O.createAndThrow();
        }
        if (user.A0M() == C05F.A01) {
            this.A06 = true;
            InterfaceC09390do interfaceC09390do = this.A09;
            C25621Ms A0M = AbstractC31177DnL.A0M(AbstractC25230BEn.A0k(interfaceC09390do, 0));
            A0M.A03();
            A0M.A0B("api/v1/accounts/get_embeds_opt_out/");
            C1ON A0R = AbstractC31172DnG.A0R(null, A0M, EAD.class, FSM.class, false);
            C14360o3.A0C(A0R, "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.GetEmbedsOptOutResponse>, com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.GetEmbedsOptOutResponse>>");
            C31714DwJ.A00(A0R, this, 2);
            schedule(A0R);
            if (C18U.A06(C06090Tz.A05, AbstractC166987dD.A0o(interfaceC09390do), 36314064451996046L)) {
                this.A08 = true;
                User A0g = AbstractC31176DnK.A0g(C17060sy.A01, interfaceC09390do);
                C40701ud c40701ud = this.A00;
                if (c40701ud != null) {
                    C2JM A0b = AbstractC25225BEi.A0b();
                    C2JM A0b2 = AbstractC25225BEi.A0b();
                    A0b.A04(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0g.getId());
                    C35826Fs2.A00(new C35830Fs6(5, A0g, this), new PandoGraphQLRequest(AbstractC25227BEk.A0U(true), "IGSeoIndexingOptOut", A0b.getParamsCopy(), A0b2.getParamsCopy(), QmP.class, false, null, 0, null, "fetch__XDTUserDict", AbstractC166987dD.A1E()), c40701ud, this, 13);
                }
            }
        }
    }

    public static final List A00(C33223ElB c33223ElB) {
        if (!c33223ElB.A06 && !c33223ElB.A08) {
            ArrayList A1E = AbstractC166987dD.A1E();
            User user = c33223ElB.A04;
            if (user != null) {
                if (user.A0M() == C05F.A01) {
                    if (c33223ElB.A05 != null) {
                        C36731GHa A02 = C36731GHa.A02(new C35745Fqd(c33223ElB, 49), 2131961726, !r1.equals(AbstractC166997dE.A0b()));
                        c33223ElB.A02 = A02;
                        A1E.add(A02);
                        AbstractC33235ElU.A07(AbstractC25227BEk.A0B(AbstractC63260SgI.A01(c33223ElB.requireActivity(), "https://help.instagram.com/620154495870484?ref=igapp")), c33223ElB, AbstractC25227BEk.A0v(c33223ElB, 2131965052), A1E, 2131961725);
                    }
                    User user2 = c33223ElB.A04;
                    if (user2 != null) {
                        if (user2.A03.CTU() != null) {
                            if (C18U.A06(C06090Tz.A05, AbstractC166987dD.A0o(c33223ElB.A09), 36314064451996046L)) {
                                C35119FeM.A00(A1E, true);
                                User user3 = c33223ElB.A04;
                                if (user3 != null) {
                                    C36731GHa A022 = C36731GHa.A02(new C35745Fqd(c33223ElB, 50), 2131973319, AbstractC166997dE.A1Z(user3.A03.CTU(), true));
                                    c33223ElB.A03 = A022;
                                    A1E.add(A022);
                                    AbstractC33235ElU.A07(AbstractC25227BEk.A0B(AbstractC63260SgI.A01(c33223ElB.requireActivity(), "https://help.instagram.com/147542625391305?ref=igapp")), c33223ElB, AbstractC25227BEk.A0v(c33223ElB, 2131965052), A1E, 2131973318);
                                }
                            }
                        }
                    }
                }
                return A1E;
            }
            C14360o3.A0F("currentUser");
            throw C00O.createAndThrow();
        }
        return AbstractC166987dD.A1J(new Object());
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A09);
    }

    public static final void A01(C33223ElB c33223ElB) {
        Context context = c33223ElB.getContext();
        if (context != null) {
            C31349DqE c31349DqE = c33223ElB.A01;
            if (c31349DqE != null) {
                AbstractC31177DnL.A1L(c31349DqE);
                c33223ElB.A01 = null;
            }
            C146106i8 A0j = AbstractC25229BEm.A0j();
            A0j.A0H = "visibility_off_instagram_settings_error";
            int i = 2131968572;
            if (AbstractC15820qc.A0F(context)) {
                i = 2131974293;
            }
            AbstractC31171DnF.A18(c33223ElB, A0j, i);
            C31349DqE A00 = A0j.A00();
            AbstractC166997dE.A1O(C41451vu.A01, A00);
            c33223ElB.A01 = A00;
        }
    }

    @Override // X.AbstractC33235ElU, X.AbstractC60672pq, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1055493724);
        super.onCreate(bundle);
        C08730cb c08730cb = C17060sy.A01;
        InterfaceC09390do interfaceC09390do = this.A09;
        this.A04 = AbstractC31176DnK.A0g(c08730cb, interfaceC09390do);
        this.A00 = AbstractC40691uc.A01(AbstractC166987dD.A0r(interfaceC09390do));
        setAdapter(new C33239ElY(requireContext(), AbstractC166987dD.A0o(interfaceC09390do), this));
        C0f9.A09(375525656, A02);
    }

    @Override // X.AbstractC60672pq, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-626828626);
        super.onDestroyView();
        C31349DqE c31349DqE = this.A01;
        if (c31349DqE != null) {
            AbstractC31177DnL.A1L(c31349DqE);
            this.A01 = null;
        }
        C0f9.A09(1886891674, A02);
    }

    @Override // X.AbstractC60672pq, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(2067644697);
        super.onResume();
        setItems(A00(this));
        C0f9.A09(-699447465, A02);
    }
}
