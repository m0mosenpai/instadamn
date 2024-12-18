package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeConstants;
import com.instagram.settings.privacy.messages.privacysettings.graphql.IGDirectPrivacySettingsQueryResponseImpl;

/* renamed from: X.DuG, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31588DuG extends C4A7 {
    public final UserSession A00;
    public final InterfaceC09390do A01;
    public final C05A A02;
    public final C05A A03;
    public final C05A A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31588DuG(UserSession userSession) {
        super(RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING, C4A8.A00(989658741));
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A02 = C10E.A00(null);
        this.A03 = C10E.A00(null);
        this.A04 = C10E.A00(null);
        this.A01 = C37061GUv.A00(this, EnumC09460dv.A02, 43);
    }

    public final void A00() {
        C40701ud A01 = AbstractC40691uc.A01(this.A00);
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC25225BEi.A0c(), "IGDirectPrivacySettingsQuery", AbstractC25225BEi.A0b().getParamsCopy(), AbstractC25225BEi.A0b().getParamsCopy(), IGDirectPrivacySettingsQueryResponseImpl.class, false, null, 0, null, "viewer", AbstractC166987dD.A1E());
        A01.ATV(C31656DvM.A00, new C31463Ds7(this, 12), pandoGraphQLRequest);
    }
}
