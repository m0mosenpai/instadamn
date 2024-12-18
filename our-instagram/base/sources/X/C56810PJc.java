package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;

/* renamed from: X.PJc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56810PJc implements InterfaceC58094PpJ {
    public final UserSession A00;
    public final OWU A01;

    @Override // X.InterfaceC58094PpJ
    public final InterfaceC19390xP Btz() {
        C2JM A0b = AbstractC25225BEi.A0b();
        C2JM A0b2 = AbstractC25225BEi.A0b();
        UserSession userSession = this.A00;
        return new MZP(AbstractC40691uc.A01(userSession).A05(new PandoGraphQLRequest(AbstractC25227BEk.A0U(AbstractC43594JPz.A1X(A0b, CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, userSession.userId)), "LikesVisibilityQuery", A0b.getParamsCopy(), A0b2.getParamsCopy(), C60427QzF.class, false, null, 0, null, "xdt_users__info", AbstractC166987dD.A1E())), 33);
    }

    @Override // X.InterfaceC58094PpJ
    public final /* bridge */ /* synthetic */ Object ELp(Object obj, Object obj2, InterfaceC23621Ds interfaceC23621Ds, boolean z) {
        C0CA A0T = AbstractC25227BEk.A0T(GraphQlCallInput.A02, String.valueOf(obj2), "setting");
        C2JM A0b = AbstractC25225BEi.A0b();
        try {
            C55661Onm.A00(new MV7(this, 19), new PandoGraphQLRequest(AbstractC25233BEq.A0H(A0T, A0b, "input"), "LikesVisibilityMutation", A0b.getParamsCopy(), AbstractC25225BEi.A0b().getParamsCopy(), C67502Un2.class, true, null, 0, null, "xdt_likes_visibility_preference", AbstractC166987dD.A1E()), AbstractC40691uc.A01(this.A00), this, 14);
            return AbstractC25227BEk.A0i();
        } catch (PW6 e) {
            C194848jk c194848jk = e.A00;
            C14360o3.A0C(c194848jk, "null cannot be cast to non-null type com.meta.kotlin.Try<Value of com.meta.kotlin.Try.Companion.build, Error of com.meta.kotlin.Try.Companion.build>");
            return c194848jk;
        }
    }

    public C56810PJc(UserSession userSession, OWU owu) {
        AbstractC167017dG.A1P(userSession, owu);
        this.A00 = userSession;
        this.A01 = owu;
    }
}
