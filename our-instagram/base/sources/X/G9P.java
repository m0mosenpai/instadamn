package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class G9P implements InterfaceC1569372x {
    public final /* synthetic */ AbstractC59962oe A00;
    public final /* synthetic */ InterfaceC11380iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ InterfaceC1569372x A03;
    public final /* synthetic */ User A04;
    public final /* synthetic */ boolean A05;

    @Override // X.InterfaceC1569472y
    public final void CkI(InterfaceC37273GbQ interfaceC37273GbQ) {
    }

    public G9P(AbstractC59962oe abstractC59962oe, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC1569372x interfaceC1569372x, User user, boolean z) {
        this.A00 = abstractC59962oe;
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A05 = z;
        this.A04 = user;
        this.A03 = interfaceC1569372x;
    }

    @Override // X.InterfaceC1569372x
    public final void DMe(View view, C51758Mth c51758Mth, boolean z) {
        String B6s;
        InterfaceC1569372x interfaceC1569372x = this.A03;
        if (interfaceC1569372x != null) {
            interfaceC1569372x.DMe(view, c51758Mth, z);
        }
        InterfaceC37273GbQ interfaceC37273GbQ = (InterfaceC37273GbQ) c51758Mth.A00;
        if (interfaceC37273GbQ != null && (B6s = interfaceC37273GbQ.B6s()) != null) {
            UserSession userSession = this.A02;
            C1567972f.A05(AbstractC31171DnF.A0A(AbstractC166987dD.A0f(AbstractC12220kQ.A01(this.A01, userSession), "ig_bio_interests_profile_events"), 195), userSession, AbstractC166997dE.A0j(B6s), "pill_impression", C1567972f.A00(B6s, this.A04.A0R()), this.A05);
        }
    }

    @Override // X.InterfaceC1569372x
    public final void DMf(C51758Mth c51758Mth) {
        String B6s;
        if (c51758Mth == null) {
            AbstractC31364DqT.A03().A02(this.A00.requireActivity(), this.A02, "self_profile");
            return;
        }
        InterfaceC37273GbQ interfaceC37273GbQ = (InterfaceC37273GbQ) c51758Mth.A00;
        if (interfaceC37273GbQ == null || (B6s = interfaceC37273GbQ.B6s()) == null) {
            return;
        }
        UserSession userSession = this.A02;
        InterfaceC11380iw interfaceC11380iw = this.A01;
        boolean z = this.A05;
        User user = this.A04;
        AbstractC59962oe abstractC59962oe = this.A00;
        C1567972f.A05(AbstractC31171DnF.A0A(AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "ig_bio_interests_profile_events"), 195), userSession, AbstractC166997dE.A0j(B6s), "tap", C1567972f.A00(B6s, user.A0R()), z);
        AbstractC192798gL A05 = C192108fB.A05(userSession, "com.instagram.connections.youth_experiences.bio_interests_bottomsheet", AbstractC06930Yk.A02(AbstractC25229BEm.A1b(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, user.getId(), AbstractC166987dD.A1L(AbstractC111324zv.A00(4008), B6s))));
        C32394EOv.A00(A05, abstractC59962oe, userSession, 8);
        C1GJ.A03(A05);
    }
}
