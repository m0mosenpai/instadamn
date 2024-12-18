package X;

import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.proxygen.LigerSamplePolicy;
import com.instagram.common.session.UserSession;
import com.meta.foa.performancelogging.FOAMessagingPerformanceLogger;
import java.util.Map;

/* renamed from: X.2Ex, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC47292Ex extends AbstractC47302Ey implements InterfaceC13000lm {
    public final String TAG;
    public final C218914p backgroundDetector;
    public final InterfaceC12870lZ backgroundDetectorListener;

    public AbstractC47292Ex(boolean z, UserSession userSession) {
        super(false, z);
        this.TAG = "IGFOAMessagingPerformanceLoggingController";
        this.backgroundDetector = C218914p.A08;
        InterfaceC12870lZ interfaceC12870lZ = new InterfaceC12870lZ() { // from class: X.2F0
            @Override // X.InterfaceC12870lZ
            public final void onAppBackgrounded() {
                int A03 = C0f9.A03(1004521473);
                for (Map.Entry entry : AbstractC06930Yk.A0B(AbstractC47292Ex.this.activeLoggers).entrySet()) {
                    ((Number) entry.getKey()).intValue();
                    FOAMessagingPerformanceLogger fOAMessagingPerformanceLogger = (FOAMessagingPerformanceLogger) entry.getValue();
                    boolean z2 = C218914p.A05;
                    fOAMessagingPerformanceLogger.onAppBackgrounded(AwakeTimeSinceBootClock.INSTANCE.now() - LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
                }
                C0f9.A0A(-231432439, A03);
            }

            @Override // X.InterfaceC12870lZ
            public final void onAppForegrounded() {
                int A03 = C0f9.A03(249457404);
                for (Map.Entry entry : AbstractC06930Yk.A0B(AbstractC47292Ex.this.activeLoggers).entrySet()) {
                    ((Number) entry.getKey()).intValue();
                    ((FOAMessagingPerformanceLogger) entry.getValue()).onAppForegrounded();
                }
                C0f9.A0A(-1346822180, A03);
            }
        };
        this.backgroundDetectorListener = interfaceC12870lZ;
        C218914p.A03(EnumC220415e.A03, interfaceC12870lZ);
    }

    public final C218914p getBackgroundDetector() {
        return this.backgroundDetector;
    }

    public final InterfaceC12870lZ getBackgroundDetectorListener() {
        return this.backgroundDetectorListener;
    }

    @Override // X.AbstractC47302Ey
    public String getTAG() {
        return this.TAG;
    }

    @Override // X.InterfaceC13000lm
    public void onSessionWillEnd() {
        for (Map.Entry entry : AbstractC06930Yk.A0B(this.activeLoggers).entrySet()) {
            ((Number) entry.getKey()).intValue();
            ((FOAMessagingPerformanceLogger) entry.getValue()).onEndFlowCancel("user session is ending.");
        }
        this.activeLoggers.clear();
        C218914p.A06(this.backgroundDetectorListener);
    }
}
