package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Fzh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36287Fzh implements InterfaceC13000lm {
    public final C41761wQ A00;
    public final UserSession A01;
    public final C2DS A02;

    public static final C7TL A00(C7TM c7tm) {
        if (c7tm instanceof C7TL) {
            return (C7TL) c7tm;
        }
        throw AbstractC166987dD.A14(AbstractC167017dG.A0n(c7tm, AbstractC43591JPw.A00(282), AbstractC166987dD.A1C()));
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A00.A01();
    }

    public C36287Fzh(UserSession userSession, C2DS c2ds) {
        AbstractC167017dG.A1P(userSession, c2ds);
        this.A01 = userSession;
        this.A02 = c2ds;
        this.A00 = AbstractC31174DnI.A0S();
    }
}
