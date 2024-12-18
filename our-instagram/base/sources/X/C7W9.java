package X;

import com.facebook.quicklog.reliability.CancelReason;
import com.instagram.common.session.UserSession;
import java.util.LinkedHashSet;

/* renamed from: X.7W9, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7W9 implements InterfaceC13050lr {
    public long A00;
    public String A01;
    public final C1QT A02;
    public final java.util.Set A03;

    public C7W9(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A02 = C1QS.A00(userSession);
        this.A03 = new LinkedHashSet();
    }

    public static final void A00(C7W9 c7w9, InterfaceC16820sZ interfaceC16820sZ) {
        if (c7w9.A00 != 0) {
            interfaceC16820sZ.invoke();
        }
    }

    @Override // X.InterfaceC13050lr
    public final void onUserSessionWillEnd(boolean z) {
        long j = this.A00;
        if (j != 0) {
            this.A02.flowEndCancel(j, CancelReason.USER_CANCELLED);
            this.A00 = 0L;
        }
    }
}
