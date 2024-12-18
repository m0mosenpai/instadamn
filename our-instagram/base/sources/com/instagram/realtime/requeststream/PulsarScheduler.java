package com.instagram.realtime.requeststream;

import X.C06090Tz;
import X.C09170dP;
import X.C0f9;
import X.C14250np;
import X.C18U;
import X.C218914p;
import X.InterfaceC12870lZ;
import X.InterfaceC13000lm;
import X.InterfaceC16820sZ;
import com.facebook.jni.HybridData;
import com.facebook.realtime.requeststream.api.BaseRequestStreamClient;
import com.facebook.xanalytics.XAnalyticsAdapterHolder;
import com.facebook.xanalytics.XAnalyticsHolder;
import com.instagram.common.session.UserSession;
import com.instagram.realtime.requeststream.PulsarScheduler;
import com.instagram.realtime.requeststream.dgw.DGWRequestStreamClientHolder;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class PulsarScheduler implements InterfaceC12870lZ, InterfaceC13000lm {
    public static final PulsarScheduler $redex_init_class = null;
    public final HybridData mHybridData;
    public ScheduledFuture mPulsarFuture = null;
    public final UserSession mUserSession;

    public static native HybridData initHybrid(BaseRequestStreamClient baseRequestStreamClient, XAnalyticsHolder xAnalyticsHolder);

    /* JADX INFO: Access modifiers changed from: private */
    public native void startPulsarTest(ScheduledExecutorService scheduledExecutorService, long j);

    @Override // X.InterfaceC12870lZ
    public synchronized void onAppBackgrounded() {
        int A03 = C0f9.A03(437169909);
        ScheduledFuture scheduledFuture = this.mPulsarFuture;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.mPulsarFuture = null;
        }
        C0f9.A0A(989340488, A03);
    }

    @Override // X.InterfaceC12870lZ
    public synchronized void onAppForegrounded() {
        int A03 = C0f9.A03(1501260326);
        maybeSchedulePulsarTest();
        C0f9.A0A(-157342698, A03);
    }

    @Override // X.InterfaceC13000lm
    public synchronized void onSessionWillEnd() {
        ScheduledFuture scheduledFuture = this.mPulsarFuture;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.mPulsarFuture = null;
        }
        C218914p.A06(this);
    }

    public static void initialize(final UserSession userSession) {
        PulsarScheduler pulsarScheduler;
        synchronized (PulsarScheduler.class) {
            pulsarScheduler = (PulsarScheduler) userSession.A01(PulsarScheduler.class, new InterfaceC16820sZ() { // from class: X.2cj
                @Override // X.InterfaceC16820sZ
                public final Object invoke() {
                    UserSession userSession2 = UserSession.this;
                    PulsarScheduler pulsarScheduler2 = PulsarScheduler.$redex_init_class;
                    BaseRequestStreamClient baseRequestStreamClient = DGWRequestStreamClientHolder.getInstance(userSession2).mClient;
                    XAnalyticsAdapterHolder xAnalyticsAdapterHolder = XAnalyticsAdapterHolder.$redex_init_class;
                    C14360o3.A0B(userSession2, 1);
                    return new PulsarScheduler(userSession2, baseRequestStreamClient, new XAnalyticsAdapterHolder(new C12250kT(null, userSession2, "IgXAnalyticsAdapter")));
                }
            });
        }
        synchronized (pulsarScheduler) {
            C218914p.A08.A0A(pulsarScheduler);
            pulsarScheduler.maybeSchedulePulsarTest();
        }
    }

    private void maybeSchedulePulsarTest() {
        if (this.mPulsarFuture == null && !C218914p.A08()) {
            final long longValue = Long.valueOf(C18U.A01(C06090Tz.A05, this.mUserSession, 36593138541921234L)).longValue();
            final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = C14250np.A00().A00;
            this.mPulsarFuture = scheduledThreadPoolExecutor.schedule(new Runnable() { // from class: X.3Jr
                @Override // java.lang.Runnable
                public final void run() {
                    PulsarScheduler.this.startPulsarTest(scheduledThreadPoolExecutor, longValue);
                }
            }, 10L, TimeUnit.SECONDS);
        }
    }

    static {
        C09170dP.A0C("igrequeststream-jni");
    }

    public PulsarScheduler(UserSession userSession, BaseRequestStreamClient baseRequestStreamClient, XAnalyticsHolder xAnalyticsHolder) {
        this.mUserSession = userSession;
        this.mHybridData = initHybrid(baseRequestStreamClient, xAnalyticsHolder);
    }
}
