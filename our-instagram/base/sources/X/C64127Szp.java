package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.QuickPerformanceLoggerProvider;

/* renamed from: X.Szp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64127Szp implements InterfaceC65541TmF {
    public static final C64127Szp A00 = new Object();

    @Override // X.InterfaceC65541TmF
    public final String Be9() {
        return "pushability_healthcheck";
    }

    @Override // X.InterfaceC65541TmF
    public final Object E6A(QIm qIm) {
        C14360o3.A0B(qIm, 0);
        try {
            QuickPerformanceLogger qPLInstance = QuickPerformanceLoggerProvider.getQPLInstance();
            if (qPLInstance != null) {
                qPLInstance.markerEnd(875301323, (short) 2);
            }
        } catch (Throwable unused) {
        }
        return qIm;
    }

    @Override // X.InterfaceC65541TmF
    public final boolean EjA(QIm qIm) {
        C14360o3.A0B(qIm, 0);
        Long l = qIm.A04.A01;
        if (l != null && l.longValue() == 52) {
            return true;
        }
        return false;
    }
}
