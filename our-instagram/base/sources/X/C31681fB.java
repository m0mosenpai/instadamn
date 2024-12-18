package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.1fB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31681fB implements InterfaceC29451bM {
    public static final C0KV A01 = new C0KV() { // from class: X.1fC
        @Override // X.C0KV
        public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
            int A03 = C0f9.A03(363618276);
            int A032 = C0f9.A03(1006184329);
            C31681fB c31681fB = new C31681fB(userSession);
            C0f9.A0A(-1896173350, A032);
            C0f9.A0A(-1302936819, A03);
            return c31681fB;
        }
    };
    public final UserSession A00;

    @Override // X.InterfaceC29451bM
    public final /* bridge */ /* synthetic */ void EHw(C1OW c1ow, boolean z) {
    }

    @Override // X.InterfaceC29451bM
    public final /* bridge */ /* synthetic */ void EHt(C1OW c1ow, boolean z) {
        UserSession userSession = this.A00;
        AbstractC81003jU A03 = ((AbstractC31611f4) c1ow).A03();
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(A03, 1);
        AbstractC11060iN.A00(userSession).EHW(C162337Ov.A02(A03, "sent", z));
    }

    @Override // X.InterfaceC29451bM
    public final /* bridge */ /* synthetic */ void EHu(C19260xA c19260xA, C1OW c1ow, C114675Fx c114675Fx, boolean z, boolean z2) {
        UserSession userSession = this.A00;
        AbstractC81003jU A03 = ((AbstractC31611f4) c1ow).A03();
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(A03, 1);
        C14360o3.A0B(c114675Fx, 4);
        C14360o3.A0B(c19260xA, 5);
        C19280xC A02 = C162337Ov.A02(A03, "failed", z2);
        C162337Ov.A0F(A02, z);
        C162337Ov.A0D(A02, c114675Fx);
        A02.A04(c19260xA);
        AbstractC11060iN.A00(userSession).EHW(A02);
    }

    @Override // X.InterfaceC29451bM
    public final /* bridge */ /* synthetic */ void EHv(C19260xA c19260xA, C1OW c1ow, boolean z, boolean z2) {
        UserSession userSession = this.A00;
        AbstractC81003jU A03 = ((AbstractC31611f4) c1ow).A03();
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(A03, 1);
        C14360o3.A0B(c19260xA, 4);
        C19280xC A02 = C162337Ov.A02(A03, "send_attempt", z2);
        C162337Ov.A0F(A02, z);
        A02.A04(c19260xA);
        AbstractC11060iN.A00(userSession).EHW(A02);
    }

    @Override // X.InterfaceC29451bM
    public final /* bridge */ /* synthetic */ void EHx(C19260xA c19260xA, C1OW c1ow, boolean z) {
        UserSession userSession = this.A00;
        AbstractC81003jU A03 = ((AbstractC31611f4) c1ow).A03();
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(A03, 1);
        C19280xC A02 = C162337Ov.A02(A03, "sent", z);
        if (c19260xA != null) {
            A02.A04(c19260xA);
        }
        AbstractC11060iN.A00(userSession).EHW(A02);
    }

    public C31681fB(UserSession userSession) {
        this.A00 = userSession;
    }
}
