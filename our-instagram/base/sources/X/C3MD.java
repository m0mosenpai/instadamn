package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.3MD, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3MD implements InterfaceC53912dV {
    public final UserSession A00;
    public final AnonymousClass396 A01;
    public final C61572rK A02;
    public final InterfaceC16820sZ A03;
    public final InterfaceC16820sZ A04;
    public final InterfaceC16820sZ A05;

    public C3MD(UserSession userSession, AnonymousClass396 anonymousClass396, C61572rK c61572rK, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3) {
        C14360o3.A0B(c61572rK, 2);
        this.A00 = userSession;
        this.A02 = c61572rK;
        this.A03 = interfaceC16820sZ;
        this.A05 = interfaceC16820sZ2;
        this.A04 = interfaceC16820sZ3;
        this.A01 = anonymousClass396;
    }

    @Override // X.InterfaceC53912dV
    public final void DWU(C54822fg c54822fg) {
        int A03 = C0f9.A03(1934572272);
        C61572rK c61572rK = this.A02;
        if (c61572rK.A00()) {
            if (((Boolean) this.A03.invoke()).booleanValue()) {
                this.A05.invoke();
                C3D5.A00(this.A00).A06(C05F.A0C);
            }
        } else if (c61572rK.A01()) {
            this.A04.invoke();
        } else {
            AnonymousClass396 anonymousClass396 = this.A01;
            if (anonymousClass396 != null) {
                anonymousClass396.A00.onPause();
            }
        }
        C0f9.A0A(44588494, A03);
    }
}
