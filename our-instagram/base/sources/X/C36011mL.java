package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.1mL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36011mL implements InterfaceC29451bM {
    public static final C0KV A01 = new C0KV() { // from class: X.1mM
        @Override // X.C0KV
        public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
            int A03 = C0f9.A03(125616845);
            int A032 = C0f9.A03(-1233221875);
            C36011mL c36011mL = new C36011mL(userSession);
            C0f9.A0A(825560055, A032);
            C0f9.A0A(-1322857948, A03);
            return c36011mL;
        }
    };
    public final UserSession A00;

    @Override // X.InterfaceC29451bM
    public final /* bridge */ /* synthetic */ void EHt(C1OW c1ow, boolean z) {
    }

    @Override // X.InterfaceC29451bM
    public final /* bridge */ /* synthetic */ void EHw(C1OW c1ow, boolean z) {
    }

    @Override // X.InterfaceC29451bM
    public final /* bridge */ /* synthetic */ void EHu(C19260xA c19260xA, C1OW c1ow, C114675Fx c114675Fx, boolean z, boolean z2) {
        C35951mF c35951mF = (C35951mF) c1ow;
        UserSession userSession = this.A00;
        boolean z3 = c35951mF.A03;
        String str = c35951mF.A02;
        C35199Ffr c35199Ffr = c35951mF.A00;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(str, 2);
        C14360o3.A0B(c35199Ffr, 3);
        C35263Fgx.A02(userSession, c35199Ffr, str, !z3 ? 1 : 0);
    }

    @Override // X.InterfaceC29451bM
    public final /* bridge */ /* synthetic */ void EHv(C19260xA c19260xA, C1OW c1ow, boolean z, boolean z2) {
        C35951mF c35951mF = (C35951mF) c1ow;
        if (!z) {
            UserSession userSession = this.A00;
            boolean z3 = c35951mF.A03;
            String str = c35951mF.A02;
            C35199Ffr c35199Ffr = c35951mF.A00;
            C14360o3.A0B(userSession, 0);
            C14360o3.A0B(str, 2);
            C14360o3.A0B(c35199Ffr, 3);
            C35263Fgx.A01(userSession, c35199Ffr, str, !z3 ? 1 : 0);
        }
    }

    @Override // X.InterfaceC29451bM
    public final /* bridge */ /* synthetic */ void EHx(C19260xA c19260xA, C1OW c1ow, boolean z) {
        C35951mF c35951mF = (C35951mF) c1ow;
        UserSession userSession = this.A00;
        boolean z2 = c35951mF.A03;
        String str = c35951mF.A02;
        C35199Ffr c35199Ffr = c35951mF.A00;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(str, 2);
        C14360o3.A0B(c35199Ffr, 3);
        C35263Fgx.A03(userSession, c35199Ffr, str, !z2 ? 1 : 0);
    }

    public C36011mL(UserSession userSession) {
        this.A00 = userSession;
    }
}
