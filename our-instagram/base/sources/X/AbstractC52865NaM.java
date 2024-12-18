package X;

import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveModerationRepository;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager;
import java.util.List;
import java.util.Map;

/* renamed from: X.NaM, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC52865NaM extends AbstractC51025MgY {
    public Map A00;
    public AnonymousClass195 A01;
    public AnonymousClass195 A02;
    public AnonymousClass195 A03;
    public final C2GT A04;
    public final LIV A05;
    public final C57582kX A06;
    public final OT2 A07;
    public final IgLiveCommentsRepository A08;
    public final IgLiveHeartbeatManager A09;
    public final java.util.Set A0A;
    public final InterfaceC24731Iq A0B;
    public final InterfaceC19390xP A0C;
    public final C171547kk A0D;
    public final IgLiveModerationRepository A0E;

    public AbstractC52865NaM(LIV liv, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C171547kk c171547kk, C17060sy c17060sy, C57582kX c57582kX, OBA oba, O92 o92, OT2 ot2, IgLiveCommentsRepository igLiveCommentsRepository, IgLiveModerationRepository igLiveModerationRepository, IgLiveBroadcastInfoManager igLiveBroadcastInfoManager, C147856lA c147856lA, IgLiveHeartbeatManager igLiveHeartbeatManager, OLC olc, MTU mtu, boolean z) {
        super(interfaceC11380iw, userSession, c17060sy, oba, o92, igLiveBroadcastInfoManager, c147856lA, olc, mtu, z);
        this.A08 = igLiveCommentsRepository;
        this.A0E = igLiveModerationRepository;
        this.A09 = igLiveHeartbeatManager;
        this.A05 = liv;
        this.A07 = ot2;
        this.A0D = c171547kk;
        this.A06 = c57582kX;
        this.A00 = AbstractC166987dD.A1I();
        C24721Ip A12 = AbstractC25229BEm.A12();
        this.A0B = A12;
        this.A0C = AbstractC07080Za.A03(A12);
        this.A0A = AbstractC31171DnF.A0l();
        this.A04 = AbstractC31172DnG.A0E(C10Q.A01(new C57188PaR(0, null), olc.A0k, olc.A0d, igLiveCommentsRepository.A0L, igLiveCommentsRepository.A0J));
        PZY.A01(this, mtu.A00, 1);
    }

    public final void A04() {
        if (this.A01 == null) {
            this.A01 = MSY.A0q(this, MSW.A1I(new C57168PZm(this, (InterfaceC23621Ds) null, 14), this.A08.A0I));
        }
        if (this.A02 == null) {
            this.A02 = MSY.A0q(this, MSW.A1I(new C57168PZm(this, (InterfaceC23621Ds) null, 15), this.A08.A0E));
        }
        if (this.A03 == null) {
            this.A03 = MSY.A0q(this, MSW.A1I(new PZY(this, null, 2), this.A08.A0F));
        }
    }

    @Override // X.AbstractC51025MgY
    public final void A01(InterfaceC58171Pqb interfaceC58171Pqb) {
        super.A01(interfaceC58171Pqb);
        PZY.A02(interfaceC58171Pqb, this, AbstractC141776au.A00(this), 4);
    }

    @Override // X.AbstractC51025MgY
    public final void A03(List list, int i, boolean z, boolean z2, boolean z3) {
        super.A03(list, i, z, z2, z3);
        this.A08.A08 = list;
    }
}
