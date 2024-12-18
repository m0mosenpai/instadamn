package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Iks, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42085Iks implements InterfaceC72763Nx {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C38321qM A01;

    public C42085Iks(UserSession userSession, C38321qM c38321qM) {
        this.A00 = userSession;
        this.A01 = c38321qM;
    }

    @Override // X.InterfaceC72763Nx
    public final void DfM(int i) {
        String A0O;
        C3MG c3mg = C3MF.A06;
        UserSession userSession = this.A00;
        C38321qM c38321qM = this.A01;
        if (i == 9) {
            A0O = "success";
        } else {
            A0O = AnonymousClass001.A0O("android-progress-", i);
        }
        c3mg.A01(A0O, userSession, c38321qM);
    }
}
