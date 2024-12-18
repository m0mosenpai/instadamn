package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.1kg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35011kg implements InterfaceC29301b7 {
    public static final C0KV A01 = C35021kh.A00;
    public final UserSession A00;

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        return true;
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        C34991ke c34991ke = (C34991ke) c1ow;
        C14360o3.A0B(c34991ke, 0);
        C14360o3.A0B(interfaceC37261GbE, 2);
        UserSession userSession = this.A00;
        String str = c34991ke.A02;
        if (str != null) {
            AbstractC47995LLh.A0J(userSession, str);
            interfaceC37261GbE.DUq(null, null);
        } else {
            C14360o3.A0F("stickerId");
            throw C00O.createAndThrow();
        }
    }

    public C35011kg(UserSession userSession) {
        this.A00 = userSession;
    }
}
