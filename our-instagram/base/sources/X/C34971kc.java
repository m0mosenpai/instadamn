package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.1kc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34971kc implements InterfaceC29301b7 {
    public static final C0KV A01 = C34981kd.A00;
    public final UserSession A00;

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        return true;
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        C34951ka c34951ka = (C34951ka) c1ow;
        C14360o3.A0B(c34951ka, 0);
        C14360o3.A0B(interfaceC37261GbE, 2);
        UserSession userSession = this.A00;
        String str = c34951ka.A02;
        if (str != null) {
            AbstractC47995LLh.A0I(userSession, str);
            interfaceC37261GbE.DUq(null, null);
        } else {
            C14360o3.A0F("stickerId");
            throw C00O.createAndThrow();
        }
    }

    public C34971kc(UserSession userSession) {
        this.A00 = userSession;
    }
}
