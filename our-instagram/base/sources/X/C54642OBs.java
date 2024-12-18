package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;

/* renamed from: X.OBs, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54642OBs {
    public final InterfaceC19390xP A00;
    public final InterfaceC19390xP A01;
    public final InterfaceC19390xP A02;
    public final UserSession A03;

    public C54642OBs(UserSession userSession, String str) {
        this.A03 = userSession;
        C25621Ms A0M = AbstractC31177DnL.A0M(userSession);
        A0M.A0P(null, C2045893s.class, C2046093u.class, false);
        A0M.A0B("users/{user_id}/info/");
        A0M.A0A = "users/{user_id}/info/";
        A0M.A04();
        this.A01 = JX4.A00(new MC2(35, null), AbstractC31172DnG.A0T(A0M, CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str).A03(965180918));
        this.A02 = JX4.A00(new MC2(36, null), AnonymousClass748.A02(userSession, new AnonymousClass500(str), null, false).A03(837018141));
        this.A00 = JX4.A00(new MC2(34, null), AbstractC151506rw.A02(userSession, str, false).A03(1213818469));
    }
}
