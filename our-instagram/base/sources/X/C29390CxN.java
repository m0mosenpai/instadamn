package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.CxN, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29390CxN implements C7XU {
    public final /* synthetic */ C166947d8 A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ InterfaceC16820sZ A02;

    @Override // X.C7XU
    public final void DB3() {
    }

    public C29390CxN(C166947d8 c166947d8, UserSession userSession, InterfaceC16820sZ interfaceC16820sZ) {
        this.A01 = userSession;
        this.A00 = c166947d8;
        this.A02 = interfaceC16820sZ;
    }

    @Override // X.C7XU
    public final void DAy() {
        C28238Cci c28238Cci = C28238Cci.A00;
        UserSession userSession = this.A01;
        c28238Cci.A01(userSession);
        userSession.A01(VgT.class, new C50168MDv(43, userSession, false));
        this.A00.A00.getId();
        InterfaceC16820sZ interfaceC16820sZ = this.A02;
        if (interfaceC16820sZ != null) {
            interfaceC16820sZ.invoke();
        }
    }
}
