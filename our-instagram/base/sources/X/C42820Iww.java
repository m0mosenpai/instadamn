package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Iww, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42820Iww implements InterfaceC169327h6 {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C38321qM A01;

    public C42820Iww(UserSession userSession, C38321qM c38321qM) {
        this.A00 = userSession;
        this.A01 = c38321qM;
    }

    @Override // X.InterfaceC169327h6
    public final C1ON AN3(String str) {
        UserSession userSession = this.A00;
        String A0g = AnonymousClass001.A0g("media/", this.A01.A1g(userSession).A2u(), AbstractC111324zv.A00(1472));
        C25621Ms A0M = AbstractC31177DnL.A0M(userSession);
        A0M.A0B(A0g);
        return AbstractC25227BEk.A0e(A0M, C38857H9f.class, C41247INn.class);
    }
}
