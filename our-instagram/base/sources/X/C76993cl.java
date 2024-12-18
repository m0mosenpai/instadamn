package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.3cl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C76993cl implements InterfaceC38371qR {
    public final C38321qM A00;
    public final Integer A01;

    @Override // X.InterfaceC38371qR, X.C1NI
    public final /* synthetic */ String BzL(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        return BQN().A33();
    }

    @Override // X.C1NI
    public final /* synthetic */ boolean CW9() {
        return IQT.A00(this);
    }

    @Override // X.C1NI
    public final /* synthetic */ boolean CZq() {
        return IQT.A01(this);
    }

    @Override // X.InterfaceC38371qR
    public final C38321qM BQN() {
        return this.A00;
    }

    @Override // X.InterfaceC38371qR, X.C1NI
    public final /* synthetic */ boolean CdW() {
        return this.A00.CdW();
    }

    @Override // X.InterfaceC38371qR, X.C1NI, X.InterfaceC38381qS, X.InterfaceC38411qV
    public final /* synthetic */ String getId() {
        return this.A00.getId();
    }

    public C76993cl(C38321qM c38321qM, Integer num) {
        this.A00 = c38321qM;
        this.A01 = num;
    }
}
