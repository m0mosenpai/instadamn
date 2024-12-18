package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import com.instagram.video.live.mvvm.model.repository.IgLiveBroadcastSettingsRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveJoinRequestsRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveModerationRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveQuestionSubmissionsRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveShareRepository;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager;

/* renamed from: X.Mga, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51027Mga extends AbstractC52922bZ {
    public boolean A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final C56805PIw A03;
    public final IgLiveBroadcastSettingsRepository A04;
    public final IgLiveCommentsRepository A05;
    public final IgLiveJoinRequestsRepository A06;
    public final IgLiveModerationRepository A07;
    public final IgLiveQuestionSubmissionsRepository A08;
    public final IgLiveShareRepository A09;
    public final IgLiveBroadcastInfoManager A0A;
    public final IgLiveHeartbeatManager A0B;
    public final OLC A0C;
    public final MTU A0D;
    public final InterfaceC24731Iq A0E;
    public final InterfaceC19390xP A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final C54810OKj A0I;
    public final boolean A0J;

    public C51027Mga(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C56805PIw c56805PIw, C54810OKj c54810OKj, IgLiveBroadcastSettingsRepository igLiveBroadcastSettingsRepository, IgLiveCommentsRepository igLiveCommentsRepository, IgLiveJoinRequestsRepository igLiveJoinRequestsRepository, IgLiveModerationRepository igLiveModerationRepository, IgLiveQuestionSubmissionsRepository igLiveQuestionSubmissionsRepository, IgLiveShareRepository igLiveShareRepository, IgLiveBroadcastInfoManager igLiveBroadcastInfoManager, IgLiveHeartbeatManager igLiveHeartbeatManager, OLC olc, MTU mtu, boolean z, boolean z2, boolean z3) {
        AbstractC25234BEr.A1R(interfaceC11380iw, igLiveModerationRepository, mtu, igLiveCommentsRepository, igLiveJoinRequestsRepository);
        C14360o3.A0B(igLiveQuestionSubmissionsRepository, 7);
        AbstractC25234BEr.A0l(8, igLiveBroadcastSettingsRepository, igLiveShareRepository, igLiveBroadcastInfoManager, igLiveHeartbeatManager);
        AbstractC25229BEm.A1N(olc, 12, c54810OKj);
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A07 = igLiveModerationRepository;
        this.A0D = mtu;
        this.A05 = igLiveCommentsRepository;
        this.A06 = igLiveJoinRequestsRepository;
        this.A08 = igLiveQuestionSubmissionsRepository;
        this.A04 = igLiveBroadcastSettingsRepository;
        this.A09 = igLiveShareRepository;
        this.A0A = igLiveBroadcastInfoManager;
        this.A0B = igLiveHeartbeatManager;
        this.A0C = olc;
        this.A03 = c56805PIw;
        this.A0I = c54810OKj;
        this.A0J = z;
        this.A0G = z2;
        this.A0H = z3;
        C24721Ip A0s = MSY.A0s();
        this.A0E = A0s;
        this.A0F = AbstractC07080Za.A03(A0s);
        PZY.A01(this, mtu.A00, 20);
    }

    public static final void A00(C51027Mga c51027Mga, int i) {
        if (c51027Mga.A0J) {
            AbstractC166987dD.A1Z(new C57164PZi(c51027Mga, (InterfaceC23621Ds) null, i), AbstractC141776au.A00(c51027Mga));
        }
    }

    public final void A01() {
        String str;
        String str2;
        String str3;
        User user;
        C54810OKj c54810OKj = this.A0I;
        C0UO c0uo = this.A0A.A06;
        C51709Mse A0u = MSW.A0u(c0uo);
        if (A0u != null) {
            str = A0u.A08;
        } else {
            str = null;
        }
        C51709Mse A0u2 = MSW.A0u(c0uo);
        if (A0u2 != null && (user = A0u2.A05) != null) {
            str2 = user.getId();
        } else {
            str2 = null;
        }
        C51709Mse A0u3 = MSW.A0u(c0uo);
        if (A0u3 != null) {
            str3 = A0u3.A09;
        } else {
            str3 = null;
        }
        c54810OKj.A01("add_moderator_impression", null, str, str2, str3, "ufi_action_sheet");
    }

    public final void A02() {
        long j;
        Long A0k;
        C56805PIw c56805PIw = this.A03;
        InterfaceC02590Ai A0H = MSY.A0H(c56805PIw.A0N, AbstractC111324zv.A00(4612));
        MSX.A1D(A0H);
        int A00 = C56805PIw.A00(A0H, c56805PIw);
        String str = c56805PIw.A08;
        if (str != null && (A0k = AbstractC003100w.A0k(A00, str)) != null) {
            j = A0k.longValue();
        } else {
            j = 0;
        }
        MSY.A12(A0H, j);
        C56805PIw.A07(A0H, c56805PIw, "container_module", c56805PIw.A0O.getModuleName());
        A0H.Cht();
        AbstractC166987dD.A1Z(new PZY(this, null, 21), AbstractC141776au.A00(this));
    }

    public final void A03() {
        long j;
        Long A0k;
        C56805PIw c56805PIw = this.A03;
        InterfaceC02590Ai A0H = MSY.A0H(c56805PIw.A0N, AbstractC111324zv.A00(4613));
        MSX.A1D(A0H);
        int A00 = C56805PIw.A00(A0H, c56805PIw);
        String str = c56805PIw.A08;
        if (str != null && (A0k = AbstractC003100w.A0k(A00, str)) != null) {
            j = A0k.longValue();
        } else {
            j = 0;
        }
        MSY.A12(A0H, j);
        C56805PIw.A07(A0H, c56805PIw, "container_module", c56805PIw.A0O.getModuleName());
        A0H.Cht();
        AbstractC166987dD.A1Z(new PZY(this, null, 22), AbstractC141776au.A00(this));
    }
}
