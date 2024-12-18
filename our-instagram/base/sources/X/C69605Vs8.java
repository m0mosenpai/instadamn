package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.Vs8, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69605Vs8 {
    public final InterfaceC103334l8 A00;
    public final InterfaceC103314l6 A01;
    public final C103284l3 A02;
    public final QuickPerformanceLogger A03;
    public final ConcurrentHashMap A04;

    /* JADX WARN: Type inference failed for: r0v4, types: [X.4l8, java.lang.Object] */
    public C69605Vs8(QuickPerformanceLogger quickPerformanceLogger, VWI vwi) {
        C14360o3.A0B(quickPerformanceLogger, 1);
        this.A03 = quickPerformanceLogger;
        this.A02 = C103284l3.A05.A00();
        this.A01 = new WU6(vwi);
        this.A00 = new Object();
        this.A04 = new ConcurrentHashMap();
    }

    public final U3t A00(int i) {
        int i2;
        int i3;
        InterfaceC103334l8 interfaceC103334l8 = this.A00;
        interfaceC103334l8.now();
        long now = interfaceC103334l8.now();
        C2FA c2fa = C2FA.A04;
        long A00 = AbstractC46551Kiq.A00(now, c2fa.A03.get(), c2fa.A02.get());
        synchronized (this) {
            ConcurrentHashMap concurrentHashMap = this.A04;
            Integer valueOf = Integer.valueOf(i);
            Integer num = (Integer) concurrentHashMap.get(valueOf);
            if (num != null) {
                i2 = num.intValue();
            } else {
                i2 = 0;
            }
            i3 = i2 + 1;
            AbstractC166997dE.A1U(valueOf, concurrentHashMap, i3);
        }
        QuickPerformanceLogger quickPerformanceLogger = this.A03;
        C103284l3 c103284l3 = this.A02;
        U3t u3t = new U3t(interfaceC103334l8, this.A01, c103284l3, quickPerformanceLogger, "Remote Presence", i, i3, interfaceC103334l8.now(), A00, true, false);
        c103284l3.A00(u3t);
        return u3t;
    }
}
