package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class MZF extends C4A7 implements InterfaceC13000lm {
    public long A00;
    public C0UO A01;
    public final C92694De A02;
    public final UserSession A03;
    public final C05A A04;
    public final C13920nI A05;

    public MZF(UserSession userSession) {
        super("meta_ai_suggestion_repository", C4A8.A00(1957986924));
        this.A03 = userSession;
        C008002u A00 = C10E.A00(null);
        this.A04 = A00;
        this.A02 = AbstractC166177bl.A00(MZG.A00);
        this.A00 = -1L;
        this.A05 = C13920nI.A00;
        this.A01 = A00;
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        C05A c05a = this.A04;
        do {
        } while (!c05a.AIi(c05a.getValue(), null));
    }
}
