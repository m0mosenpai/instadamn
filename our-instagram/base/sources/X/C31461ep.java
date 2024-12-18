package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.1ep, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31461ep implements InterfaceC29451bM {
    public static final C0KV A01 = new C0KV() { // from class: X.1eq
        @Override // X.C0KV
        public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
            int A03 = C0f9.A03(1637662983);
            int A032 = C0f9.A03(398585536);
            C31461ep c31461ep = new C31461ep(userSession);
            C0f9.A0A(193938495, A032);
            C0f9.A0A(-1780214555, A03);
            return c31461ep;
        }
    };
    public final UserSession A00;

    @Override // X.InterfaceC29451bM
    public final /* bridge */ /* synthetic */ void EHw(C1OW c1ow, boolean z) {
    }

    @Override // X.InterfaceC29451bM
    public final /* bridge */ /* synthetic */ void EHt(C1OW c1ow, boolean z) {
        C31391ei c31391ei = (C31391ei) c1ow;
        C162337Ov.A0W(null, this.A00, c31391ei.A02, C2EY.A0m.A00, ((C1OW) c31391ei).A05, System.currentTimeMillis() - ((C1OW) c31391ei).A01, z, c31391ei.A06);
    }

    @Override // X.InterfaceC29451bM
    public final /* bridge */ /* synthetic */ void EHu(C19260xA c19260xA, C1OW c1ow, C114675Fx c114675Fx, boolean z, boolean z2) {
        C31391ei c31391ei = (C31391ei) c1ow;
        C162337Ov.A0V(c19260xA, this.A00, c114675Fx, c31391ei.A02, C2EY.A0m.A00, ((C1OW) c31391ei).A05, System.currentTimeMillis() - ((C1OW) c31391ei).A01, z, z2, c31391ei.A06);
    }

    @Override // X.InterfaceC29451bM
    public final /* bridge */ /* synthetic */ void EHv(C19260xA c19260xA, C1OW c1ow, boolean z, boolean z2) {
        C31391ei c31391ei = (C31391ei) c1ow;
        C162337Ov.A0X(c19260xA, this.A00, c31391ei.A02, C2EY.A0m.A00, ((C1OW) c31391ei).A05, z, z2, c31391ei.A06);
    }

    @Override // X.InterfaceC29451bM
    public final /* bridge */ /* synthetic */ void EHx(C19260xA c19260xA, C1OW c1ow, boolean z) {
        C31391ei c31391ei = (C31391ei) c1ow;
        C162337Ov.A0W(c19260xA, this.A00, c31391ei.A02, C2EY.A0m.A00, ((C1OW) c31391ei).A05, System.currentTimeMillis() - ((C1OW) c31391ei).A01, z, c31391ei.A06);
    }

    public C31461ep(UserSession userSession) {
        this.A00 = userSession;
    }
}
