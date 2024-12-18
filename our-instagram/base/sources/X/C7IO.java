package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.instagram.common.session.UserSession;

/* renamed from: X.7IO, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7IO implements InterfaceC164227Wl {
    public final UserSession A00;
    public final C7U0 A01;
    public final InterfaceC08830cm A02;

    @Override // X.InterfaceC164227Wl
    public final boolean CYr() {
        return C6X6.A08(this.A00, this.A01.C7r().C7W());
    }

    @Override // X.InterfaceC164227Wl
    public final boolean CYs() {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.A02.get();
        if (linearLayoutManager == null) {
            return false;
        }
        return this.A01.BT6().CSc(linearLayoutManager.A1a(), linearLayoutManager.A1b());
    }

    @Override // X.InterfaceC164227Wl
    public final boolean CeO() {
        InterfaceC163837Ux C7r = this.A01.C7r();
        InterfaceC83713oG C7i = C7r.C7i();
        C14360o3.A07(C7i);
        boolean z = C7i instanceof InterfaceC83703oF;
        C7TT C7W = C7r.C7W();
        UserSession userSession = this.A00;
        C14360o3.A0A(C7W);
        return C6X6.A0B(userSession, C7W, z);
    }

    public C7IO(UserSession userSession, C7U0 c7u0, InterfaceC08830cm interfaceC08830cm) {
        this.A00 = userSession;
        this.A01 = c7u0;
        this.A02 = interfaceC08830cm;
    }
}
