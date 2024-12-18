package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Adm, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23653Adm implements InterfaceC13000lm {
    public C38321qM A00;
    public String A01 = "";
    public String A02 = "";
    public final UserSession A03;

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A03.A03(C23653Adm.class);
    }

    public C23653Adm(UserSession userSession) {
        this.A03 = userSession;
    }
}
