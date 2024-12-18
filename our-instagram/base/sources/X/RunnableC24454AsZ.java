package X;

import com.instagram.direct.msys.impl.MsysMailboxSessionManagerImpl;

/* renamed from: X.AsZ, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24454AsZ implements Runnable {
    public final /* synthetic */ MsysMailboxSessionManagerImpl A00;

    public RunnableC24454AsZ(MsysMailboxSessionManagerImpl msysMailboxSessionManagerImpl) {
        this.A00 = msysMailboxSessionManagerImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C91Y A00 = C91Y.A0A.A00();
        if (A00 != null) {
            String str = this.A00.userSession.userId;
            C14360o3.A0B(str, 0);
            A00.A04.remove(str);
            if (A00.A02 == null && (!A00.A05.isEmpty())) {
                C91Y.A00(A00);
            }
        }
        JZK A002 = JZK.A0A.A00();
        if (A002 != null) {
            A002.A05(this.A00.userSession.userId);
        }
    }
}
