package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.1ex, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31541ex implements InterfaceC29451bM {
    public static final C0KV A01 = new C0KV() { // from class: X.1ey
        @Override // X.C0KV
        public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
            int A03 = C0f9.A03(1899589749);
            int A032 = C0f9.A03(995523008);
            C31541ex c31541ex = new C31541ex(userSession);
            C0f9.A0A(1075035599, A032);
            C0f9.A0A(1913581025, A03);
            return c31541ex;
        }
    };
    public final UserSession A00;

    @Override // X.InterfaceC29451bM
    public final /* bridge */ /* synthetic */ void EHw(C1OW c1ow, boolean z) {
    }

    @Override // X.InterfaceC29451bM
    public final /* bridge */ /* synthetic */ void EHt(C1OW c1ow, boolean z) {
        C31481er c31481er = (C31481er) c1ow;
        C162337Ov.A0W(null, this.A00, c31481er.C7Q(), C162337Ov.A04(c31481er.Ar9(), null, true), c31481er.A05, System.currentTimeMillis() - ((C1OW) c31481er).A01, z, ((C1OW) c31481er).A02.A07);
    }

    @Override // X.InterfaceC29451bM
    public final /* bridge */ /* synthetic */ void EHu(C19260xA c19260xA, C1OW c1ow, C114675Fx c114675Fx, boolean z, boolean z2) {
        C31481er c31481er = (C31481er) c1ow;
        C162337Ov.A0V(c19260xA, this.A00, c114675Fx, c31481er.C7Q(), C162337Ov.A04(c31481er.Ar9(), null, true), c31481er.A05, System.currentTimeMillis() - ((C1OW) c31481er).A01, z, z2, ((C1OW) c31481er).A02.A07);
    }

    @Override // X.InterfaceC29451bM
    public final /* bridge */ /* synthetic */ void EHv(C19260xA c19260xA, C1OW c1ow, boolean z, boolean z2) {
        C31481er c31481er = (C31481er) c1ow;
        C162337Ov.A0X(c19260xA, this.A00, c31481er.C7Q(), C162337Ov.A04(c31481er.Ar9(), null, true), c31481er.A05, z, z2, ((C1OW) c31481er).A02.A07);
    }

    @Override // X.InterfaceC29451bM
    public final /* bridge */ /* synthetic */ void EHx(C19260xA c19260xA, C1OW c1ow, boolean z) {
        C31481er c31481er = (C31481er) c1ow;
        C162337Ov.A0W(c19260xA, this.A00, c31481er.C7Q(), C162337Ov.A04(c31481er.Ar9(), null, true), c31481er.A05, System.currentTimeMillis() - ((C1OW) c31481er).A01, z, ((C1OW) c31481er).A02.A07);
    }

    public C31541ex(UserSession userSession) {
        this.A00 = userSession;
    }
}
