package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes9.dex */
public final class OVi {
    public C51759Mti A00;
    public final UserSession A01;
    public final ExecutorService A02;

    public static final synchronized void A00(OVi oVi, InterfaceC16820sZ interfaceC16820sZ) {
        synchronized (oVi) {
            if (oVi.A00 == null) {
                oVi.A00 = (C51759Mti) interfaceC16820sZ.invoke();
            }
        }
    }

    public final void A01(InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ) {
        if (C18U.A06(C06090Tz.A05, this.A01, 36323603575614885L)) {
            C14120nc.A00().ATO(new C52383NGe(this, interfaceC16820sZ, interfaceC16660sJ));
            return;
        }
        ExecutorService executorService = this.A02;
        if (executorService.isShutdown() || executorService.isTerminated()) {
            return;
        }
        try {
            executorService.execute(new RunnableC57048PSn(this, interfaceC16820sZ, interfaceC16660sJ));
        } catch (RejectedExecutionException e) {
            C0K8.A0J("RtcCallComponentsExecutor", "Operation execution rejected", e);
        }
    }

    public OVi(UserSession userSession) {
        this.A01 = userSession;
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        C14360o3.A07(newSingleThreadExecutor);
        this.A02 = newSingleThreadExecutor;
    }
}
