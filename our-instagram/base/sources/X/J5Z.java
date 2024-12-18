package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public final class J5Z implements Runnable {
    public final /* synthetic */ C59062n7 A00;
    public final /* synthetic */ EnumC37742GjH A01;
    public final /* synthetic */ C38219GrO A02;

    public J5Z(C59062n7 c59062n7, EnumC37742GjH enumC37742GjH, C38219GrO c38219GrO) {
        this.A01 = enumC37742GjH;
        this.A00 = c59062n7;
        this.A02 = c38219GrO;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EnumC37742GjH enumC37742GjH = this.A01;
        if (enumC37742GjH != null) {
            C59062n7 c59062n7 = this.A00;
            C37648Ghh c37648Ghh = ((C37644Ghd) c59062n7.A04).A0F;
            if (c37648Ghh != null) {
                C38219GrO c38219GrO = this.A02;
                C37729Gj4 A00 = ((ILR) c37648Ghh.A04.getValue()).A00(enumC37742GjH);
                InterfaceC60442pS interfaceC60442pS = c38219GrO.A02;
                UserSession userSession = c38219GrO.A01;
                Object obj = c59062n7.A03;
                C14360o3.A06(obj);
                AbstractC40919IAr.A00((C120985dq) obj, userSession, interfaceC60442pS, A00, c37648Ghh, enumC37742GjH, "scrollback_0s", c38219GrO.A03.CGJ(), true);
            }
        }
    }
}
