package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.4pq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C105794pq implements C1NI {
    public final InterfaceC38711r3 A00;

    @Override // X.C1NI
    public final String BzL(UserSession userSession) {
        return null;
    }

    @Override // X.C1NI
    public final boolean CdW() {
        return false;
    }

    @Override // X.C1NI
    public final boolean CW9() {
        return false;
    }

    @Override // X.C1NI
    public final boolean CZq() {
        return false;
    }

    @Override // X.C1NI, X.InterfaceC38381qS, X.InterfaceC38411qV
    public final String getId() {
        String id = this.A00.getId();
        if (id != null) {
            return id;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public C105794pq(InterfaceC38711r3 interfaceC38711r3) {
        this.A00 = interfaceC38711r3;
    }
}
