package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.QuickPerformanceLoggerProvider;
import com.facebook.quicklog.reliability.UserFlowJNIProvider;
import com.facebook.quicklog.reliability.UserFlowLogger;
import com.facebook.quicklog.reliability.UserFlowLoggerImpl;

/* renamed from: X.6pl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C150366pl {
    public static UserFlowLogger A00;

    public static final synchronized void A00() {
        synchronized (C150366pl.class) {
            if (!UserFlowJNIProvider.isInitialized()) {
                UserFlowLogger userFlowLogger = A00;
                if (userFlowLogger == null) {
                    QuickPerformanceLogger qPLInstance = QuickPerformanceLoggerProvider.getQPLInstance();
                    if (qPLInstance != null) {
                        userFlowLogger = new UserFlowLoggerImpl(qPLInstance, true, false);
                        A00 = userFlowLogger;
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
                UserFlowJNIProvider.setUserFlowLogger(userFlowLogger);
            }
        }
    }
}
