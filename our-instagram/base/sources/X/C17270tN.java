package X;

import com.facebook.profilo.ipc.TraceContext;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.0tN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17270tN implements InterfaceC13050lr {
    public final UserSession A00;
    public volatile C0Uw A01;

    public C17270tN(UserSession userSession) {
        this.A00 = userSession;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.0V1, java.lang.Object] */
    @Override // X.InterfaceC13050lr
    public final void onUserSessionWillEnd(boolean z) {
        boolean z2;
        C06570Wi.A00().A03("IgProfiloSessionManager", Boolean.valueOf(z), "Session changed: clearData and stop tracing, isLoggedOut = %b");
        C20020yW A00 = C20020yW.A00();
        A00.A06(new Object());
        C06360Vc c06360Vc = C06360Vc.A0A;
        if (c06360Vc != null) {
            for (TraceContext traceContext : c06360Vc.A06()) {
                C06360Vc.A04(c06360Vc, traceContext.A0B, traceContext.A01, 0, 9, traceContext.A05);
            }
        }
        synchronized (A00) {
            C0W4 c0w4 = A00.A01;
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(C0W4.A00(c0w4, c0w4.A06));
            arrayList.addAll(C0W4.A00(c0w4, c0w4.A05));
            arrayList.addAll(C0W4.A00(c0w4, c0w4.A03));
            arrayList.addAll(C0W4.A00(c0w4, c0w4.A04));
            Iterator it = arrayList.iterator();
            z2 = true;
            while (it.hasNext()) {
                File file = (File) it.next();
                if (file.exists() && !file.delete()) {
                    z2 = false;
                    c0w4.A02.A02++;
                }
            }
        }
        C20020yW.A00().A08(null);
        if (!z2) {
            C0w9.A03("IgProfiloSessionManager", "Fail to clean up profilo traces and configuration during logout");
        }
    }
}
