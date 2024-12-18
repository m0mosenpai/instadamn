package X;

import com.instagram.common.session.UserSession;
import java.io.File;

/* renamed from: X.95I, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C95I {
    public InterfaceC02550Ad A00;
    public C95J A01;
    public C1B4 A02;
    public final C13920nI A03;

    public C95I(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        C1B4 A00 = AbstractC23881Ey.A00();
        C18920wW A01 = AbstractC12220kQ.A01(new C19270xB("IGRTCEngine"), userSession);
        C95J c95j = C95J.A02;
        C1B4 A002 = AbstractC23881Ey.A00();
        C95J.A01 = A002;
        C95K c95k = C95K.A01;
        File file = null;
        try {
            file = A002.AXd(null, 384226697);
        } catch (Exception unused) {
        }
        C95K.A00 = file;
        C95J.A00 = c95k;
        C14360o3.A0B(c95j, 3);
        this.A03 = C13920nI.A00;
        this.A02 = A00;
        this.A00 = A01;
        this.A01 = c95j;
    }
}
