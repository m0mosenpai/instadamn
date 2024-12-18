package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.requeststream.SubscriptionHandler;
import com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveViewerJoinFlowRepository;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager;
import com.instagram.video.live.mvvm.viewmodel.state.IgLiveViewerStateViewModel$1;

/* renamed from: X.Mgr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51041Mgr extends AbstractC52922bZ {
    public AnonymousClass195 A00;
    public AnonymousClass195 A01;
    public AnonymousClass195 A02;
    public boolean A03;
    public final UserSession A04;
    public final C23031Ai A05;
    public final C147776l2 A06;
    public final IgLiveCommentsRepository A07;
    public final OJ4 A08;
    public final OCR A09;
    public final O96 A0A;
    public final IgLiveViewerJoinFlowRepository A0B;
    public final O97 A0C;
    public final IgLiveBroadcastInfoManager A0D;
    public final C147856lA A0E;
    public final IgLiveHeartbeatManager A0F;
    public final OLC A0G;
    public final MTU A0H;
    public final InterfaceC06180Ui A0I;
    public final C05A A0J;
    public final InterfaceC15070pN A0K;

    public static final void A00(InterfaceC147636ko interfaceC147636ko, C51041Mgr c51041Mgr, Boolean bool, String str, String str2, String str3, boolean z) {
        if (!c51041Mgr.A03 && MSZ.A1a(c51041Mgr.A08.A02)) {
            if (bool != null) {
                AbstractC166997dE.A1Y(c51041Mgr.A0G.A0H, bool.booleanValue());
            }
            if (str != null) {
                AbstractC166987dD.A1Z(new C57150PXo(c51041Mgr, str, str2, str3, null, 1, z), AbstractC141776au.A00(c51041Mgr));
                OCR ocr = c51041Mgr.A09;
                if (ocr.A00 == null) {
                    C2JM A0b = AbstractC25225BEi.A0b();
                    ocr.A00 = AbstractC40691uc.A01(ocr.A01).A01(null, new MV7(ocr, 17), new PandoGraphQLRequest(AbstractC25233BEq.A0H(AbstractC25227BEk.A0T(GraphQlCallInput.A02, str, TraceFieldType.BroadcastId), A0b, "input"), "LiveBadgeSettingSubsribe", A0b.getParamsCopy(), AbstractC25225BEi.A0b().getParamsCopy(), Qn1.class, false, PandoRealtimeInfoJNI.forSubscription("xdt_live_badge_setting_subscribe"), 0, null, "xdt_live_badge_setting_subscribe", AbstractC166987dD.A1E()));
                }
            }
            c51041Mgr.A0E.A00 = interfaceC147636ko;
            if (z) {
                c51041Mgr.A01 = MSY.A0r(c51041Mgr.A01);
            }
            if (c51041Mgr.A01 == null) {
                c51041Mgr.A01 = AbstractC25226BEj.A1L(new PZK(c51041Mgr, null, 15, z), AbstractC141776au.A00(c51041Mgr));
            }
            AbstractC166997dE.A1Y(c51041Mgr.A0J, true);
            C18U.A06(C06090Tz.A05, c51041Mgr.A04, 36318853342566972L);
        }
    }

    public static final boolean A02(C51041Mgr c51041Mgr) {
        InterfaceC108894vE interfaceC108894vE;
        C51709Mse A0U = MSX.A0U(c51041Mgr.A0D);
        boolean z = false;
        if (A0U == null) {
            return false;
        }
        C109054vU c109054vU = A0U.A03;
        if (c109054vU != null && (interfaceC108894vE = c109054vU.A05) != null && interfaceC108894vE.CQp()) {
            z = true;
        }
        boolean z2 = A0U.A0M;
        if (z && !z2) {
            return true;
        }
        return false;
    }

    public final void A03(String str) {
        String str2;
        AnonymousClass195 anonymousClass195 = this.A02;
        if (anonymousClass195 != null) {
            anonymousClass195.AGH(null);
        }
        C51709Mse A0U = MSX.A0U(this.A0D);
        if (A0U != null) {
            str2 = A0U.A08;
        } else {
            str2 = null;
        }
        if (C14360o3.A0K(str, str2)) {
            PZ1.A01(this, str, AbstractC141776au.A00(this), 41);
            this.A0J.Egh(false);
            AnonymousClass195 anonymousClass1952 = this.A01;
            if (anonymousClass1952 != null) {
                anonymousClass1952.AGH(null);
            }
            this.A01 = null;
            this.A0F.A00.Egh(null);
            A01(this, false);
            this.A07.A0I();
            OLC olc = this.A0G;
            olc.A0U.Egh(EnumC53165NfK.A06);
            olc.A0T.Egh(EnumC53145Nez.A03);
            olc.A06.Egh(EnumC53324Ni1.A0E);
            olc.A0G.Egh(false);
            C05A c05a = olc.A0K;
            EnumC142806cg enumC142806cg = olc.A03;
            boolean z = true;
            AbstractC166997dE.A1Y(c05a, AbstractC25229BEm.A1a(enumC142806cg, EnumC142806cg.A03));
            olc.A0H.Egh(false);
            C05A c05a2 = olc.A0J;
            if (enumC142806cg != EnumC142806cg.A04) {
                z = false;
            }
            AbstractC166997dE.A1Y(c05a2, z);
            olc.A0O.Egh(false);
            C05A c05a3 = olc.A0A;
            C16910sj c16910sj = C16910sj.A00;
            c05a3.Egh(c16910sj);
            olc.A05.Egh(c16910sj);
            olc.A0N.Egh(false);
            olc.A0M.Egh(false);
            MSX.A1S(olc.A07, 0);
            olc.A0E.Egh(false);
            olc.A0L.Egh(false);
            olc.A0P.Egh(false);
            olc.A0C.Egh(false);
            olc.A0Q.Egh(false);
            olc.A08.Egh(false);
            olc.A0F.Egh(false);
            olc.A09.Egh(false);
            olc.A0D.Egh(false);
            this.A0C.A00.Egh(false);
            OCR ocr = this.A09;
            C1Df c1Df = ocr.A00;
            if (c1Df != null) {
                c1Df.cancel();
            }
            ocr.A00 = null;
            ocr.A02.Egh(null);
            this.A0A.A00.Egh(EnumC53175NfW.A04);
            OJ4 oj4 = this.A08;
            C41551w4 c41551w4 = oj4.A00;
            if (c41551w4 != null) {
                c41551w4.A0C = false;
            }
            oj4.A00 = null;
            oj4.A01.Egh(false);
        }
    }

    public /* synthetic */ C51041Mgr(UserSession userSession, C147776l2 c147776l2, IgLiveCommentsRepository igLiveCommentsRepository, OJ4 oj4, OCR ocr, O96 o96, IgLiveViewerJoinFlowRepository igLiveViewerJoinFlowRepository, O97 o97, IgLiveBroadcastInfoManager igLiveBroadcastInfoManager, C147856lA c147856lA, IgLiveHeartbeatManager igLiveHeartbeatManager, OLC olc, MTU mtu) {
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        C14360o3.A0B(userSession, 1);
        AbstractC25234BEr.A1R(igLiveBroadcastInfoManager, c147856lA, igLiveCommentsRepository, igLiveHeartbeatManager, olc);
        C14360o3.A0B(o97, 7);
        AbstractC25234BEr.A0l(8, ocr, igLiveViewerJoinFlowRepository, mtu, o96);
        AbstractC25234BEr.A1Q(oj4, c147776l2, A00);
        this.A04 = userSession;
        this.A0D = igLiveBroadcastInfoManager;
        this.A0E = c147856lA;
        this.A07 = igLiveCommentsRepository;
        this.A0F = igLiveHeartbeatManager;
        this.A0G = olc;
        this.A0C = o97;
        this.A09 = ocr;
        this.A0B = igLiveViewerJoinFlowRepository;
        this.A0H = mtu;
        this.A0A = o96;
        this.A08 = oj4;
        this.A06 = c147776l2;
        this.A05 = A00;
        AnonymousClass057 A002 = C10M.A00(C05F.A00, 1, 0);
        this.A0I = A002;
        this.A0K = new C06160Ug(null, A002);
        C008002u A1A = AbstractC25235BEs.A1A(false);
        this.A0J = A1A;
        C0UO c0uo = igLiveBroadcastInfoManager.A06;
        MSZ.A19(this, new IgLiveViewerStateViewModel$1(this, null), A1A, c0uo, olc.A0V);
        MSZ.A18(this, new C57181PaA(this, (InterfaceC23621Ds) null, 17), c0uo, igLiveHeartbeatManager.A08);
    }

    public static final void A01(C51041Mgr c51041Mgr, boolean z) {
        if (A02(c51041Mgr)) {
            if (!z) {
                IgLiveCommentsRepository igLiveCommentsRepository = c51041Mgr.A07;
                SubscriptionHandler subscriptionHandler = igLiveCommentsRepository.A06;
                if (subscriptionHandler != null) {
                    subscriptionHandler.cancel();
                }
                igLiveCommentsRepository.A06 = null;
                SubscriptionHandler subscriptionHandler2 = igLiveCommentsRepository.A05;
                if (subscriptionHandler2 != null) {
                    subscriptionHandler2.cancel();
                }
                igLiveCommentsRepository.A05 = null;
                return;
            }
            return;
        }
        c51041Mgr.A00 = MSY.A0r(c51041Mgr.A00);
    }
}
