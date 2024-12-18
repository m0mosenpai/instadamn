package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public abstract class OQX {
    public static C56805PIw A00(C52154N6e c52154N6e) {
        return A01(c52154N6e, C52154N6e.A00(c52154N6e)).A01(c52154N6e.requireContext());
    }

    public static final NYV A01(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        AbstractC167017dG.A1N(userSession, interfaceC11380iw);
        AbstractC147746kz A00 = AbstractC147746kz.A0A.A00(interfaceC11380iw, userSession, EnumC142806cg.A03);
        C14360o3.A0C(A00, "null cannot be cast to non-null type com.instagram.video.live.mvvm.model.logger.store.IgLiveHostLoggerStore");
        return (NYV) A00;
    }
}
