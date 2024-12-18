package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.41i, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C904841i implements InterfaceC904941j {
    public final UserSession A00;
    public final C75113Zb A01;
    public final String A02;

    public C904841i(UserSession userSession, C75113Zb c75113Zb, String str) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(str, 2);
        C14360o3.A0B(c75113Zb, 3);
        this.A00 = userSession;
        this.A02 = str;
        this.A01 = c75113Zb;
    }

    @Override // X.InterfaceC904941j
    public final String Am2() {
        C38321qM A1e;
        C38321qM A02 = C1DW.A00(this.A00).A02(this.A02);
        if (A02 != null && (A1e = A02.A1e(this.A01.A03)) != null) {
            return A1e.getId();
        }
        return null;
    }

    @Override // X.InterfaceC904941j
    public final Integer Am9() {
        return Integer.valueOf(this.A01.A03);
    }
}
