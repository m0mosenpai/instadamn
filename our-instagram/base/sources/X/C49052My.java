package X;

import com.instagram.common.session.UserSession;
import com.instagram.reliablemedia.IGReliableMediaMonitor;

/* renamed from: X.2My, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49052My implements InterfaceC13050lr {
    public IGReliableMediaMonitor A00;
    public boolean A01;
    public final UserSession A02;

    @Override // X.InterfaceC13050lr
    public final void onUserSessionWillEnd(boolean z) {
        C9EU c9eu = new C9EU(this, 24);
        if (C18U.A06(C06090Tz.A05, this.A02, 2342172196245749880L)) {
            C1C8.A00.A00(new C2N1(c9eu));
        }
    }

    public C49052My(UserSession userSession) {
        this.A02 = userSession;
    }
}
