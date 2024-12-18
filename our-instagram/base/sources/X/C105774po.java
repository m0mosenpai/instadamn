package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.4po, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C105774po implements C1NI {
    public final InterfaceC38601qq A00;

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
        String obj;
        Long BF7 = this.A00.BF7();
        if (BF7 == null || (obj = BF7.toString()) == null) {
            return "";
        }
        return obj;
    }

    public C105774po(InterfaceC38601qq interfaceC38601qq) {
        this.A00 = interfaceC38601qq;
    }
}
