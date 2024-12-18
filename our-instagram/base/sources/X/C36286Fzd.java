package X;

import android.content.Context;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.Fzd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36286Fzd implements InterfaceC13000lm {
    public final UserSession A00;
    public volatile Boolean A01;
    public volatile Boolean A02;

    public final void A00(Context context, String str, String str2, Map map, InterfaceC16820sZ interfaceC16820sZ, boolean z) {
        if (this.A01 == null) {
            UserSession userSession = this.A00;
            if (AbstractC31303DpP.A00(userSession, true) && (!str2.equals("IG_TAS_SCREEN_IN_THREAD_LIST") || AbstractC31303DpP.A01(userSession, true))) {
                C40701ud A01 = AbstractC40691uc.A01(userSession);
                C2JM A0b = AbstractC25225BEi.A0b();
                C2JM A0b2 = AbstractC25225BEi.A0b();
                A0b.A01("include_consumer_status");
                A0b.A01("ignore_business_opt_in_status");
                String str3 = userSession.userId;
                A0b.A04("business_ig_id", str3);
                C35826Fs2.A00(new C35834FsA(context, this, str, str2, map, interfaceC16820sZ, z), new PandoGraphQLRequest(AbstractC25227BEk.A0U(AbstractC167007dF.A1W(str3)), "AdsEventSharingSettingsQuery", A0b.getParamsCopy(), A0b2.getParamsCopy(), C59378Qdb.class, false, null, 0, null, "xfb_biig_ads_event_sharing_settings", AbstractC166987dD.A1E()).setNetworkTimeoutSeconds(5).setMaxToleratedCacheAgeMs(0L).setEnsureCacheWrite(false), A01, interfaceC16820sZ, 3);
                return;
            }
        }
        interfaceC16820sZ.invoke();
    }

    public final void A01(String str, String str2) {
        C14360o3.A0B(str, 0);
        C40701ud A01 = AbstractC40691uc.A01(this.A00);
        C0CA A0T = AbstractC25227BEk.A0T(GraphQlCallInput.A02, str, "business_ig_id");
        C0CA.A00(A0T, str2, "notice_type");
        C2JM A0b = AbstractC25225BEi.A0b();
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC25233BEq.A0H(A0T, A0b, "data"), "AdsEventSharingNoticeLogImpressionMutation", A0b.getParamsCopy(), AbstractC25225BEi.A0b().getParamsCopy(), C59376QdZ.class, true, null, 96, null, "xig_log_impression_for_biig_ads_event_sharing_notice", AbstractC166987dD.A1E());
        A01.ATV(C35810Frm.A00, C35842FsI.A00, pandoGraphQLRequest);
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A00.A03(C36286Fzd.class);
    }

    public C36286Fzd(UserSession userSession) {
        this.A00 = userSession;
    }
}
