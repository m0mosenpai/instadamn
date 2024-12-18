package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;

/* loaded from: classes8.dex */
public final class JX0 {
    public final InterfaceC08830cm A00;
    public final InterfaceC08830cm A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final UserSession A04;

    public JX0(UserSession userSession, InterfaceC08830cm interfaceC08830cm, InterfaceC08830cm interfaceC08830cm2) {
        C14360o3.A0B(userSession, 1);
        this.A04 = userSession;
        this.A00 = interfaceC08830cm;
        this.A01 = interfaceC08830cm2;
        this.A02 = AbstractC09440dt.A01(new C50160MDn(this, 28));
        this.A03 = AbstractC09440dt.A01(new C50160MDn(this, 29));
    }

    public final C7TM A01(DirectShareTarget directShareTarget) {
        InterfaceC09390do interfaceC09390do;
        C14360o3.A0B(directShareTarget, 0);
        boolean A08 = AbstractC140946Yw.A08(directShareTarget.A01());
        boolean z = directShareTarget.A01() instanceof InterfaceC2056098k;
        if (A08) {
            interfaceC09390do = this.A02;
        } else if (z) {
            interfaceC09390do = this.A03;
        } else {
            throw AbstractC166987dD.A14("Expected Direct or Msys derived DirectShareTarget");
        }
        return (C7TM) AbstractC166987dD.A17(interfaceC09390do);
    }

    public static C7TM A00(UserSession userSession, DirectShareTarget directShareTarget) {
        return C36911no.A00().E6g(userSession).A01(directShareTarget);
    }
}
