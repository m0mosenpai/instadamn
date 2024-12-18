package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.IsY, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC42554IsY implements InterfaceC38371qR, InterfaceC66482zP {
    public final C38321qM A00;
    public final InterfaceC38371qR A01;
    public final C75113Zb A02;

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

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        String id = this.A00.getId();
        if (id != null) {
            return id;
        }
        throw AbstractC166997dE.A0g();
    }

    public AbstractC42554IsY(InterfaceC38371qR interfaceC38371qR, C75113Zb c75113Zb) {
        this.A01 = interfaceC38371qR;
        this.A02 = c75113Zb;
        this.A00 = interfaceC38371qR.BQN();
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return false;
    }
}
