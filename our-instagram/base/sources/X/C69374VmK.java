package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.VmK, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69374VmK {
    public final C103284l3 A02;
    public final QuickPerformanceLogger A04;
    public final C0Gd mFbErrorReporter;
    public final Map A05 = Collections.synchronizedMap(new HashMap());
    public final InterfaceC103334l8 A00 = new WU4(this);
    public final InterfaceC103314l6 A01 = new WU5(this);
    public final C0JO A03 = new C0E1(new C49882Qy());

    public C69374VmK(C0Gd c0Gd, QuickPerformanceLogger quickPerformanceLogger) {
        C103284l3 A00;
        this.A04 = quickPerformanceLogger;
        this.mFbErrorReporter = c0Gd;
        synchronized (C103284l3.class) {
            A00 = C103284l3.A05.A00();
        }
        this.A02 = A00;
    }
}
