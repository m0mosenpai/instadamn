package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.At8, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24489At8 implements Runnable {
    public final /* synthetic */ A9A A00;

    public RunnableC24489At8(A9A a9a) {
        this.A00 = a9a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        A9A a9a = this.A00;
        C1ON c1on = a9a.A00;
        if (c1on != null) {
            c1on.A02 = true;
            C215499gP c215499gP = a9a.A02;
            if (c215499gP != null) {
                c215499gP.onFail(C7J2.A00());
            }
            UserSession userSession = a9a.A01;
            if (userSession != null) {
                C34926FaC.A00(userSession).markerEnd(246558735, (short) 113);
                return;
            }
            return;
        }
        C14360o3.A0F("task");
        throw C00O.createAndThrow();
    }
}
