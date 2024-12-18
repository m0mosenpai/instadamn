package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.G5a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36425G5a implements InterfaceC37261GbE {
    public final UserSession A00;
    public final InterfaceC37261GbE A01;
    public final String A02;

    @Override // X.InterfaceC37261GbE
    public final void DUq(C114675Fx c114675Fx, String str) {
        if (c114675Fx == null) {
            C26141Ov.A01(this.A00).A08(this.A02, str, null);
        }
        this.A01.DUq(c114675Fx, null);
    }

    @Override // X.InterfaceC37261GbE
    public final C19260xA B4C() {
        return this.A01.B4C();
    }

    @Override // X.InterfaceC37261GbE
    public final C19260xA BtO() {
        return this.A01.BtO();
    }

    public C36425G5a(UserSession userSession, InterfaceC37261GbE interfaceC37261GbE, String str) {
        this.A01 = interfaceC37261GbE;
        this.A00 = userSession;
        this.A02 = str;
    }
}
