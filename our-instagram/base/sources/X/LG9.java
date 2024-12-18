package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class LG9 {
    public final InterfaceC16820sZ A00;
    public final InterfaceC16820sZ A01;
    public final InterfaceC16660sJ A02;
    public final UserSession A03;
    public final C1Z6 A04;
    public final InterfaceC16660sJ A05;
    public final InterfaceC16660sJ A06;

    public LG9(UserSession userSession, C1Z6 c1z6, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, InterfaceC16660sJ interfaceC16660sJ3) {
        AbstractC167007dF.A1G(interfaceC16660sJ, 3, interfaceC16820sZ);
        this.A03 = userSession;
        this.A04 = c1z6;
        this.A02 = interfaceC16660sJ;
        this.A05 = interfaceC16660sJ2;
        this.A00 = interfaceC16820sZ;
        this.A01 = interfaceC16820sZ2;
        this.A06 = interfaceC16660sJ3;
    }

    public static final LG9 A00(UserSession userSession) {
        if (userSession == null) {
            return AbstractC46884KoR.A00(userSession);
        }
        return (LG9) userSession.A01(LG9.class, MHJ.A00(userSession, 21));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.0Jk, java.lang.Object] */
    public final void A01(C116155Nu c116155Nu) {
        InterfaceC50494MQx interfaceC50494MQx = (InterfaceC50494MQx) this.A06.invoke(c116155Nu);
        if (interfaceC50494MQx.Ek4()) {
            UserSession userSession = this.A03;
            if (userSession != null && C14360o3.A0K(userSession.userId, c116155Nu.A0j) && interfaceC50494MQx.Ek3()) {
                this.A05.invoke(Integer.valueOf(c116155Nu.A08.A01));
                this.A04.A02();
            }
            String str = c116155Nu.A0j;
            if (userSession != null && AbstractC31171DnF.A1V(userSession, str)) {
                if (!AbstractC25231BEo.A1b(this.A00) || AbstractC25231BEo.A1b(this.A01)) {
                    return;
                }
            } else if (!interfaceC50494MQx.Ek5()) {
                return;
            }
            if (this.A04.A04()) {
                C023409i.A0A.A0A(new Object(), null, C49592Lvl.A00, str);
            }
            C71933Kq Ctk = interfaceC50494MQx.Ctk();
            C11T.A02(new M6R(Ctk, new C71943Kr(Ctk, null, null), this, str));
        }
    }
}
