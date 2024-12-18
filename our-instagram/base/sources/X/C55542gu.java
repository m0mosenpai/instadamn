package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.2gu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C55542gu extends C03E implements InterfaceC16620sF {
    public C55542gu(Object obj) {
        super(2, obj, C55462gm.class, "createEligibilityPersistedState", "createEligibilityPersistedState(Lcom/instagram/common/session/UserSession;Ljava/lang/String;)Lcom/facebook/quickpromotion/sdk/eligibility/QPEligibilityPersistedState;", 0);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        UserSession userSession = (UserSession) obj;
        String str = (String) obj2;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(str, 1);
        return C55462gm.A00(userSession, str);
    }
}
