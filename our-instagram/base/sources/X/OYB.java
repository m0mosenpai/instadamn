package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public abstract class OYB {
    public static final NZZ A02(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        AbstractC147826l7 A00 = AbstractC147826l7.A0K.A00(userSession, EnumC142806cg.A03);
        C14360o3.A0C(A00, "null cannot be cast to non-null type com.instagram.video.live.mvvm.model.repository.store.IgLiveHostRepositoryStore");
        return (NZZ) A00;
    }

    public static MTU A01(Object obj) {
        return A02(((C56806PIx) obj).A06).A03();
    }

    public static C54817OKs A00(UserSession userSession) {
        return (C54817OKs) A02(userSession).A07.getValue();
    }
}
