package X;

import com.facebook.jni.HybridData;
import com.facebook.papaya.mldw.Host;
import com.facebook.papaya.mldw.ITransport;
import com.facebook.papaya.mldw.Manager;
import com.facebook.papaya.mldw.network_transport.Transport;
import com.instagram.common.session.UserSession;
import com.instagram.service.tigon.IGAuthedTigonService;
import java.io.File;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.OwB, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56147OwB implements InterfaceC13050lr {
    public static final OG2 A01 = new Object();
    public final UserSession A00;

    public final synchronized Host A00() {
        Host host;
        Map map;
        try {
            Map map2 = Manager.sHosts;
            synchronized (Manager.class) {
                try {
                    map = Manager.sHosts;
                    host = (Host) map2.get(10);
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Exception e) {
            C0K8.A0F("IgMldwStoreManager", "Failed to register MLDW host for FA", e);
        }
        if (host == null) {
            UserSession userSession = this.A00;
            C14360o3.A0B(userSession, 0);
            File A0w = MSW.A0w(AbstractC23881Ey.A00().AXd(null, 861573803), AnonymousClass001.A0R("mldw_store_", userSession.userId));
            if (!A0w.exists()) {
                A0w.mkdirs();
            }
            String A0R = AnonymousClass001.A0R(A0w.getCanonicalPath(), "/falco.db");
            IGAuthedTigonService iGAuthedTigonService = IGAuthedTigonService.getInstance(userSession);
            C14360o3.A07(iGAuthedTigonService);
            C53722NpB c53722NpB = Transport.Companion;
            HybridData initHybrid = Transport.initHybrid(iGAuthedTigonService, "", "https://i.instagram.com/api/v1/mldw/mldw_get_feature_group");
            if (initHybrid != null) {
                ITransport iTransport = new ITransport(initHybrid);
                Manager.nativeAddLogSink("ig_mldw_falco_log_sink", EnumC53219NgH.VERBOSE.A00, new C51969MyB(userSession));
                ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
                synchronized (Manager.class) {
                    if (!map.containsKey(10)) {
                        map.put(10, Manager.nativeRegisterHost(10, newSingleThreadScheduledExecutor, A0R, iTransport, null));
                    }
                    ((Host) map.get(10)).getClass();
                }
                synchronized (Manager.class) {
                    host = (Host) AbstractC166997dE.A0m(Manager.sHosts, 10);
                }
            } else {
                throw AbstractC166987dD.A14("initHybrid shouldn't be null");
            }
        }
        return host;
    }

    @Override // X.InterfaceC13050lr
    public final synchronized void onUserSessionWillEnd(boolean z) {
        Map map = Manager.sHosts;
        synchronized (Manager.class) {
            Map map2 = Manager.sHosts;
            if (map.containsKey(10)) {
                map2.remove(10);
                Manager.nativeUnregisterHost(10);
            }
        }
        Manager.nativeRemoveLogSink("ig_mldw_falco_log_sink");
    }

    public C56147OwB(UserSession userSession) {
        this.A00 = userSession;
    }
}
