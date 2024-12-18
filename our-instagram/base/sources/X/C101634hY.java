package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.4hY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C101634hY implements C1NI {
    public final String A00;
    public final boolean A01;
    public final boolean A02;
    public final String A03;
    public final boolean A04;

    @Override // X.C1NI
    public final boolean CW9() {
        return this.A01;
    }

    @Override // X.C1NI
    public final boolean CZq() {
        return this.A04;
    }

    @Override // X.C1NI
    public final boolean CdW() {
        return this.A02;
    }

    @Override // X.C1NI, X.InterfaceC38381qS, X.InterfaceC38411qV
    public final String getId() {
        String str = this.A00;
        if (str == null) {
            return "";
        }
        return str;
    }

    public C101634hY(String str, String str2, boolean z, boolean z2, boolean z3) {
        this.A01 = z;
        this.A00 = str;
        this.A02 = z2;
        this.A04 = z3;
        this.A03 = str2;
    }

    @Override // X.C1NI
    public final String BzL(UserSession userSession) {
        return this.A03;
    }
}
