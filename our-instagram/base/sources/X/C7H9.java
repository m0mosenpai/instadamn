package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7H9, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7H9 implements C7H3 {
    public final UserSession A00;
    public final InterfaceC160027Fo A01;
    public final InterfaceC16820sZ A02;
    public final C7GY A03;

    @Override // X.C7H3
    public final boolean Cp3(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        C14360o3.A0B(str, 4);
        if (!z4) {
            UserSession userSession = this.A00;
            if ((!C7I2.A00(userSession) || !(!JUJ.A00(userSession).A04().isEmpty()) || !AbstractC2056298m.A00(userSession).A08()) && z && !z2 && z3) {
                JUI A00 = JUJ.A00(userSession);
                C11T.A06("This operation must be run on UI thread.");
                if (A00.A02(str) != null) {
                    this.A01.FBu(C7GX.A0M, new C50261MHq(this, 25), true);
                    return false;
                }
            }
            if (this.A03 == C7GY.A05) {
                this.A01.FBu(C7GX.A0L, C7I3.A00, false);
            } else {
                if (z && !z2 && !z3) {
                    this.A01.FBu(C7GX.A0L, new C9EL(this, 39), true);
                    return true;
                }
                this.A01.FBu(C7GX.A0L, B9Z.A00, false);
                return false;
            }
        }
        return false;
    }

    public C7H9(UserSession userSession, C7GY c7gy, InterfaceC160027Fo interfaceC160027Fo, InterfaceC16820sZ interfaceC16820sZ) {
        this.A00 = userSession;
        this.A02 = interfaceC16820sZ;
        this.A01 = interfaceC160027Fo;
        this.A03 = c7gy;
    }
}
