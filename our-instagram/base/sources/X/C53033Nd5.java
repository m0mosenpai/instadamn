package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;

/* renamed from: X.Nd5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C53033Nd5 extends AbstractC53034Nd6 {
    public final C2GT A00;

    public C53033Nd5(C56810PJc c56810PJc) {
        super(c56810PJc, EnumC53312Nho.EVERYONE);
        C56810PJc c56810PJc2 = (C56810PJc) this.A01;
        C2JM A0b = AbstractC25225BEi.A0b();
        C2JM A0b2 = AbstractC25225BEi.A0b();
        UserSession userSession = c56810PJc2.A00;
        this.A00 = AbstractC31172DnG.A0E(new MZP(new MZP(AbstractC40691uc.A01(userSession).A05(new PandoGraphQLRequest(AbstractC25227BEk.A0U(AbstractC43594JPz.A1X(A0b, CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, userSession.userId)), "LikesVisibilityQuery", A0b.getParamsCopy(), A0b2.getParamsCopy(), C60427QzF.class, false, null, 0, null, "xdt_users__info", AbstractC166987dD.A1E())), 32), 34));
    }
}
