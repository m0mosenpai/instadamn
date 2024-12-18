package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Awj, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24702Awj implements Runnable {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C97674a2 A01;

    public RunnableC24702Awj(UserSession userSession, C97674a2 c97674a2) {
        this.A01 = c97674a2;
        this.A00 = userSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5SW c5sw = this.A01.A08;
        if (c5sw != null) {
            c5sw.A07(this.A00);
        }
    }
}
