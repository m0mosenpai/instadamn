package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.4Zd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C97434Zd implements InterfaceC41201vU {
    public final C38321qM A00;

    public C97434Zd(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 1);
        this.A00 = c38321qM;
    }

    @Override // X.C1NI
    public final String BzL(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return this.A00.A33();
    }

    @Override // X.InterfaceC41201vU
    public final boolean CY4() {
        return true;
    }

    @Override // X.InterfaceC41201vU
    public final float Ack(UserSession userSession) {
        if (this.A00.A1U() != null) {
            return r2.A01 / r2.A00;
        }
        return 0.0f;
    }

    @Override // X.InterfaceC41201vU
    public final C38321qM BQN() {
        return this.A00;
    }

    @Override // X.InterfaceC41201vU
    public final List BlY(EnumC75383a5 enumC75383a5) {
        return this.A00.A3w(enumC75383a5);
    }

    @Override // X.InterfaceC41201vU
    public final /* bridge */ /* synthetic */ User CDj() {
        return this.A00.A0C.CDj();
    }

    @Override // X.InterfaceC41201vU
    public final String CGe() {
        String id = this.A00.getId();
        if (id != null) {
            return id;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.C1NI
    public final boolean CW9() {
        return this.A00.CW9();
    }

    @Override // X.C1NI
    public final boolean CZq() {
        return this.A00.CZq();
    }

    @Override // X.C1NI
    public final boolean CdW() {
        return this.A00.CdW();
    }

    @Override // X.C1NI, X.InterfaceC38381qS, X.InterfaceC38411qV
    public final String getId() {
        String id = this.A00.getId();
        if (id != null) {
            return id;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
