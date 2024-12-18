package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Kp2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46921Kp2 {
    public static final C7TH A00(UserSession userSession, InterfaceC83713oG interfaceC83713oG) {
        C7TH A00;
        AbstractC167017dG.A1N(interfaceC83713oG, userSession);
        if (AbstractC140946Yw.A08(interfaceC83713oG)) {
            A00 = AbstractC165967bO.A00(userSession);
        } else if (interfaceC83713oG instanceof InterfaceC2056098k) {
            A00 = AbstractC44138Jf3.A00(userSession);
        } else {
            throw AbstractC166987dD.A14("Unknown ThreadTargetType");
        }
        return A00;
    }
}
