package X;

import com.facebook.common.dextricks.DexOptimization;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.common.session.UserSession;

/* renamed from: X.IaS, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41579IaS {
    public final UserSession A00;
    public final InterfaceC11380iw A01;
    public final C39697HjT A02;

    public static final C19280xC A00(C41579IaS c41579IaS, String str) {
        String str2;
        int A04;
        UserSession userSession = c41579IaS.A00;
        String Bd9 = AbstractC11060iN.A00(userSession).Bd9();
        if (Bd9 != null && (A04 = AbstractC001900j.A04(Bd9, '.', 0)) > 0) {
            str2 = Bd9.substring(0, A04);
            C14360o3.A07(str2);
        } else {
            str2 = null;
        }
        C19280xC A00 = C19280xC.A00(c41579IaS.A01, AnonymousClass001.A0R("payflows_", str));
        A00.A0C("client_app_user_id", userSession.userId);
        A00.A0C(OptSvcAnalyticsStore.LOGGING_KEY_CLIENT_TIME, str2);
        C39697HjT c39697HjT = c41579IaS.A02;
        String str3 = c39697HjT.A01;
        C14360o3.A07(str3);
        A00.A0C("product", AbstractC37303Gc4.A0X(str3));
        A00.A0C("other_profile_id", c39697HjT.A03);
        A00.A0C(MSV.A00(447), c39697HjT.A02);
        A00.A0C(AbstractC31188DnX.A00(), c39697HjT.A00);
        A00.A0C("event_name", str);
        A00.A0C("event_type", DexOptimization.OPT_KEY_CLIENT);
        return A00;
    }

    public C41579IaS(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C39697HjT c39697HjT) {
        AbstractC167017dG.A1P(userSession, interfaceC11380iw);
        this.A00 = userSession;
        this.A01 = interfaceC11380iw;
        this.A02 = c39697HjT;
    }
}
