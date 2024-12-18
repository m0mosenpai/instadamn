package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import com.instagram.video.live.mvvm.model.repository.IgLiveQuestionSubmissionsRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveQuestionsRepository;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6lL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C147896lL extends AbstractC52922bZ {
    public final C2GT A00;
    public final C2GS A01;
    public final C2GS A02;
    public final C2GS A03;
    public final UserSession A04;
    public final EnumC142806cg A05;
    public final InterfaceC147786l3 A06;
    public final IgLiveQuestionSubmissionsRepository A07;
    public final IgLiveQuestionsRepository A08;
    public final IgLiveBroadcastInfoManager A09;
    public final C41761wQ A0A;
    public final C147886lK A0B;

    /* JADX WARN: Type inference failed for: r0v11, types: [X.2GT, X.2GS] */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.2GT, X.2GS] */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.2GT, X.2GS] */
    public C147896lL(UserSession userSession, EnumC142806cg enumC142806cg, InterfaceC147786l3 interfaceC147786l3, C147886lK c147886lK, IgLiveQuestionSubmissionsRepository igLiveQuestionSubmissionsRepository, IgLiveQuestionsRepository igLiveQuestionsRepository, IgLiveBroadcastInfoManager igLiveBroadcastInfoManager) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(enumC142806cg, 2);
        C14360o3.A0B(igLiveBroadcastInfoManager, 3);
        C14360o3.A0B(igLiveQuestionsRepository, 4);
        C14360o3.A0B(igLiveQuestionSubmissionsRepository, 5);
        C14360o3.A0B(c147886lK, 6);
        this.A04 = userSession;
        this.A05 = enumC142806cg;
        this.A09 = igLiveBroadcastInfoManager;
        this.A08 = igLiveQuestionsRepository;
        this.A07 = igLiveQuestionSubmissionsRepository;
        this.A0B = c147886lK;
        this.A06 = interfaceC147786l3;
        this.A0A = new C41761wQ(AbstractC142856cl.A01);
        this.A02 = new C2GT(C143166dG.A00);
        this.A03 = new C2GT();
        this.A00 = AbstractC58232lf.A00(AnonymousClass191.A00, C10Q.A03(new C9DE(this, null, 3), igLiveQuestionSubmissionsRepository.A06, c147886lK.A06));
        this.A01 = new C2GT(C143186dI.A00);
    }

    public final void A03(InterfaceC147626kn interfaceC147626kn, String str) {
        C14360o3.A0B(interfaceC147626kn, 1);
        C147886lK c147886lK = this.A0B;
        c147886lK.A02 = str;
        if (c147886lK.A00 == null) {
            C70722Wfn c70722Wfn = new C70722Wfn(c147886lK);
            C70721Wfm c70721Wfm = new C70721Wfm(c147886lK);
            C2JM c2jm = new C2JM();
            C2JM c2jm2 = new C2JM();
            C0CA A02 = GraphQlCallInput.A02.A02();
            C0CA.A00(A02, str, TraceFieldType.BroadcastId);
            c2jm.A00.A02().A0E(A02, "input");
            C2JQ c2jq = PandoGraphQLRequest.Companion;
            PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC40511uK.A00(), "LiveActiveQuestionSubscribe", c2jm.getParamsCopy(), c2jm2.getParamsCopy(), C67059Ufk.class, false, PandoRealtimeInfoJNI.forSubscription("xdt_live_active_question_event"), 0, null, "xdt_live_active_question_event", new ArrayList());
            c147886lK.A00 = AbstractC40691uc.A01(c147886lK.A03).A01(C70440WVs.A00, new WW2(c70722Wfn, c70721Wfm), pandoGraphQLRequest);
        }
        C70783Wgw c70783Wgw = new C70783Wgw(new C70781Wgu(c147886lK), TimeUnit.MILLISECONDS);
        C69714Vu9 c69714Vu9 = new C69714Vu9(interfaceC147626kn);
        c147886lK.A01 = c69714Vu9;
        c69714Vu9.A01 = new C68855VdB(c70783Wgw);
    }

    public final void A05(String str, boolean z) {
        C14360o3.A0B(str, 0);
        C141796aw A00 = AbstractC141776au.A00(this);
        AbstractC23641Du.A05(AnonymousClass191.A00, new PXZ(this, str, null, 16, z), A00);
    }

    public static final void A00(C147896lL c147896lL) {
        OM6 om6;
        C2GS c2gs = c147896lL.A02;
        IgLiveQuestionsRepository igLiveQuestionsRepository = c147896lL.A08;
        Long l = igLiveQuestionsRepository.A02;
        if (l != null) {
            om6 = (OM6) igLiveQuestionsRepository.A08.get(l);
        } else {
            om6 = null;
        }
        c2gs.A0B(new C52973Nc7(om6, igLiveQuestionsRepository.A08(), igLiveQuestionsRepository.A07()));
    }

    public static final void A01(C147896lL c147896lL, int i, long j, boolean z) {
        HashMap hashMap = c147896lL.A08.A08;
        Long valueOf = Long.valueOf(j);
        OM6 om6 = (OM6) hashMap.get(valueOf);
        if (om6 != null) {
            if (z != om6.A09) {
                long j2 = om6.A01;
                User user = om6.A04;
                ImageUrl imageUrl = om6.A03;
                String str = om6.A08;
                EnumC53318Nhu enumC53318Nhu = om6.A05;
                EnumC223199sy enumC223199sy = om6.A06;
                int i2 = om6.A00 + i;
                om6 = new OM6(om6.A02, imageUrl, user, enumC53318Nhu, enumC223199sy, om6.A07, str, i2, j2, z);
            }
            hashMap.put(valueOf, om6);
        }
        A00(c147896lL);
    }

    public final void A02() {
        IgLiveQuestionsRepository igLiveQuestionsRepository = this.A08;
        igLiveQuestionsRepository.A02 = null;
        C16930sl c16930sl = C16930sl.A00;
        igLiveQuestionsRepository.A04 = c16930sl;
        igLiveQuestionsRepository.A03 = c16930sl;
        igLiveQuestionsRepository.A08.clear();
        igLiveQuestionsRepository.A01 = 0;
        igLiveQuestionsRepository.A00 = 0;
        IgLiveQuestionSubmissionsRepository igLiveQuestionSubmissionsRepository = this.A07;
        C1Df c1Df = igLiveQuestionSubmissionsRepository.A01;
        if (c1Df != null) {
            c1Df.cancel();
        }
        igLiveQuestionSubmissionsRepository.A01 = null;
        C05A c05a = igLiveQuestionSubmissionsRepository.A05;
        c05a.Egh(new C9B7(((C9B7) c05a.getValue()).A01, 0, 2));
        c05a.Egh(new C9B7(false, ((C9B7) c05a.getValue()).A00, 2));
        igLiveQuestionSubmissionsRepository.A02 = null;
        C147886lK c147886lK = this.A0B;
        C1Df c1Df2 = c147886lK.A00;
        if (c1Df2 != null) {
            c1Df2.cancel();
            c147886lK.A00 = null;
        }
        C69714Vu9 c69714Vu9 = c147886lK.A01;
        if (c69714Vu9 != null) {
            if (c69714Vu9.A00 != null) {
                c69714Vu9.A04.Egw(null);
                c69714Vu9.A00 = null;
            }
            c69714Vu9.A05.clear();
            c69714Vu9.A03.removeCallbacksAndMessages(null);
        }
        C69714Vu9 c69714Vu92 = c147886lK.A01;
        if (c69714Vu92 != null) {
            c69714Vu92.A01 = null;
        }
        c147886lK.A01 = null;
        c147886lK.A05.Egh(null);
        c147886lK.A02 = null;
        this.A0A.A01();
    }

    public final void A04(String str) {
        IgLiveQuestionSubmissionsRepository igLiveQuestionSubmissionsRepository = this.A07;
        igLiveQuestionSubmissionsRepository.A02 = str;
        if (igLiveQuestionSubmissionsRepository.A01 == null) {
            C56030Ou2 c56030Ou2 = new C56030Ou2(igLiveQuestionSubmissionsRepository);
            C2JM c2jm = new C2JM();
            C2JM c2jm2 = new C2JM();
            C0CA A02 = GraphQlCallInput.A02.A02();
            C0CA.A00(A02, str, TraceFieldType.BroadcastId);
            c2jm.A00.A02().A0E(A02, "input");
            C2JQ c2jq = PandoGraphQLRequest.Companion;
            PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC40511uK.A00(), "LiveQuestionSubmissionStatusSubscribe", c2jm.getParamsCopy(), c2jm2.getParamsCopy(), Qn5.class, false, PandoRealtimeInfoJNI.forSubscription("xdt_live_question_submission_status_event"), 0, null, "xdt_live_question_submission_status_event", new ArrayList());
            igLiveQuestionSubmissionsRepository.A01 = AbstractC40691uc.A01(igLiveQuestionSubmissionsRepository.A03).A01(C55660Onl.A00, new C55662Onn(c56030Ou2), pandoGraphQLRequest);
        }
    }
}
