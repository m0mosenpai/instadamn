package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;
import com.instagram.video.live.mvvm.viewmodel.composer.IgLiveComposerViewModel$onPostButtonTapped$1;

/* renamed from: X.MgZ */
/* loaded from: classes9.dex */
public final class C51026MgZ extends AbstractC52922bZ {
    public final Context A00;
    public final C2GT A01;
    public final C18920wW A02;
    public final UserSession A03;
    public final C145826hf A04;
    public final EnumC142806cg A05;
    public final OT2 A06;
    public final IgLiveCommentsRepository A07;
    public final OJ4 A08;
    public final IgLiveBroadcastInfoManager A09;
    public final C147856lA A0A;
    public final OLC A0B;
    public final MTU A0C;
    public final InterfaceC24731Iq A0D;
    public final InterfaceC19390xP A0E;
    public final C05A A0F;
    public final boolean A0G;
    public final C05A A0H;

    public C51026MgZ(Context context, C18920wW c18920wW, UserSession userSession, C145826hf c145826hf, EnumC142806cg enumC142806cg, OT2 ot2, IgLiveCommentsRepository igLiveCommentsRepository, OJ4 oj4, IgLiveBroadcastInfoManager igLiveBroadcastInfoManager, C147856lA c147856lA, OLC olc, MTU mtu, boolean z) {
        AbstractC25234BEr.A0j(2, c147856lA, olc, igLiveCommentsRepository, igLiveBroadcastInfoManager);
        AbstractC167007dF.A1I(mtu, 7, userSession);
        AbstractC25232BEp.A1P(enumC142806cg, ot2);
        this.A00 = context;
        this.A0A = c147856lA;
        this.A0B = olc;
        this.A07 = igLiveCommentsRepository;
        this.A09 = igLiveBroadcastInfoManager;
        this.A08 = oj4;
        this.A0C = mtu;
        this.A03 = userSession;
        this.A02 = c18920wW;
        this.A05 = enumC142806cg;
        this.A06 = ot2;
        this.A04 = c145826hf;
        this.A0G = z;
        C008002u A1H = AbstractC25225BEi.A1H(new C51699MsU(null, "", false, false, false));
        this.A0F = A1H;
        C008002u A1H2 = AbstractC25225BEi.A1H(AbstractC25227BEk.A0l());
        this.A0H = A1H2;
        C24721Ip c24721Ip = new C24721Ip(0);
        this.A0D = c24721Ip;
        this.A0E = AbstractC07080Za.A03(c24721Ip);
        MV5 A00 = MV5.A00(this, AbstractC50522MSa.A1b(new C0UO[]{olc.A0s, olc.A0f, olc.A0p, igLiveBroadcastInfoManager.A06, igLiveCommentsRepository.A0J, A1H, A1H2}), 27);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        this.A01 = AbstractC58232lf.A00(anonymousClass191, A00);
        AbstractC23641Du.A05(anonymousClass191, new C57164PZi(this, (InterfaceC23621Ds) null, 2), AbstractC141776au.A00(this));
    }

    public static /* synthetic */ void A00(C56803PIu c56803PIu, C51026MgZ c51026MgZ, String str, int i, boolean z, boolean z2, boolean z3) {
        String str2 = str;
        C56803PIu c56803PIu2 = c56803PIu;
        boolean z4 = z3;
        boolean z5 = z2;
        boolean z6 = z;
        if ((i & 1) != 0) {
            z6 = ((C51699MsU) c51026MgZ.A0F.getValue()).A03;
        }
        if ((i & 2) != 0) {
            z5 = ((C51699MsU) c51026MgZ.A0F.getValue()).A02;
        }
        if ((i & 4) != 0) {
            z4 = ((C51699MsU) c51026MgZ.A0F.getValue()).A04;
        }
        if ((i & 8) != 0) {
            c56803PIu2 = (C56803PIu) ((C51699MsU) c51026MgZ.A0F.getValue()).A00;
        }
        if ((i & 16) != 0) {
            str2 = ((C51699MsU) c51026MgZ.A0F.getValue()).A01;
        }
        AbstractC166997dE.A1Y(c51026MgZ.A0B.A0E, z4);
        c51026MgZ.A0F.Egh(new C51699MsU(c56803PIu2, str2, z6, z5, z4));
    }

    public final void A01(String str, int i, long j, boolean z) {
        AbstractC166987dD.A1Z(new IgLiveComposerViewModel$onPostButtonTapped$1(this, str, null, i, j, z), MSX.A0B(this, str, 3));
    }

    public final void A02(boolean z, boolean z2) {
        A00(null, this, null, 28, z, !z2, false);
    }

    @Override // X.AbstractC52922bZ
    public final void onCleared() {
        C147836l8 c147836l8 = AbstractC147826l7.A0K;
        UserSession userSession = this.A03;
        c147836l8.A01(userSession, this.A05);
        AbstractC147746kz.A0A.A01(userSession, EnumC142806cg.A05);
    }
}
