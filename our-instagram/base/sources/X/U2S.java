package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public final class U2S implements XDR {
    public static final U2S A00 = new Object();

    @Override // X.XDR
    public final void AHx(UserSession userSession) {
        InterfaceC19610xo A0Q = AbstractC65702TsY.A0Q(userSession);
        A0Q.EEj("recent_audio_searches_with_ts");
        A0Q.apply();
    }

    @Override // X.XDR
    public final String B8o(UserSession userSession) {
        C23031Ai A002 = AbstractC23021Ah.A00(userSession);
        return MSX.A0j(A002, A002.A6x, C23031Ai.A8c, 14);
    }

    @Override // X.XDR
    public final void ELw(UserSession userSession, String str) {
        AbstractC167017dG.A1N(userSession, str);
        C23031Ai A002 = AbstractC23021Ah.A00(userSession);
        AbstractC31171DnF.A1S(A002, str, A002.A6x, C23031Ai.A8c, 14);
    }
}
