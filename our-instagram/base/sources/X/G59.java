package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class G59 implements C77P {
    public final UserSession A00;
    public final C7U0 A01;

    @Override // X.C77P
    public final void F80(C9B7 c9b7) {
        C7U0 c7u0 = this.A01;
        InterfaceC163837Ux C7r = c7u0.C7r();
        Integer num = C7r.C7W().A0N.A00;
        Integer num2 = C7r.C7W().A0N.A01;
        UserSession userSession = this.A00;
        InterfaceC160517Hl A01 = AbstractC160497Hj.A01(userSession, C7r.C7W(), true);
        C7TT C7W = C7r.C7W();
        C14360o3.A07(C7W);
        boolean CPf = A01.CPf(userSession, C7W);
        InterfaceC83733oI CCa = C7r.CCa();
        if (CCa != null) {
            boolean z = c9b7.A01;
            if (z && num != null && (!CPf || num2 != null)) {
                C35224FgH c35224FgH = C35224FgH.A00;
                C81613kW c81613kW = C7r.C7W().A0G;
                int intValue = num.intValue();
                Integer num3 = null;
                if (CPf) {
                    num3 = num2;
                }
                if (c35224FgH.A03(userSession, c81613kW, num3, intValue) && A01.CfG(userSession)) {
                    c7u0.C78().F7u(userSession, CCa, num2, c9b7.A00, intValue);
                    return;
                }
            }
            c7u0.C78().F7t(userSession, C7r.C7W().A0G, CCa, c9b7.A00, z, CPf);
        }
    }

    public G59(UserSession userSession, C7U0 c7u0) {
        this.A00 = userSession;
        this.A01 = c7u0;
    }
}
