package X;

import com.facebook.react.devsupport.CxxInspectorPackagerConnection;
import java.io.Closeable;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes10.dex */
public final class THK implements Closeable {
    public final /* synthetic */ CxxInspectorPackagerConnection.DelegateImpl A00;
    public final /* synthetic */ SZM A01;

    public THK(CxxInspectorPackagerConnection.DelegateImpl delegateImpl, SZM szm) {
        this.A00 = delegateImpl;
        this.A01 = szm;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        SZM szm = this.A01;
        synchronized (szm) {
            C64531TIl A02 = C64531TIl.A02("End of session");
            if (A02.A05() <= 123) {
                if (!szm.A0D && !szm.A0C) {
                    szm.A0C = true;
                    szm.A0H.add(new C62462SCp(A02));
                    ScheduledExecutorService scheduledExecutorService = szm.A05;
                    if (scheduledExecutorService != null) {
                        scheduledExecutorService.execute(szm.A0F);
                    }
                }
            } else {
                throw AbstractC167007dF.A0c("reason.size() > 123: ", "End of session");
            }
        }
    }
}
