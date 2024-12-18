package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class L70 {
    public final UserSession A00;
    public final C18240vB A01;

    public L70(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        C0o0 A00 = AbstractC14350nz.A00();
        A00.A01 = "OnDeviceNudityInferencingManager";
        this.A01 = new C18240vB(A00);
    }

    public final void A00(InterfaceC50483MQl interfaceC50483MQl, String str) {
        UserSession userSession = this.A00;
        AbstractC61362qy.A00(userSession).A04(str);
        this.A01.ATO(new KMR(null, null, userSession, interfaceC50483MQl, str));
    }
}
