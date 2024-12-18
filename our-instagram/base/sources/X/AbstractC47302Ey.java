package X;

import com.meta.foa.performancelogging.FOAMessagingPerformanceLogger;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.2Ey, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC47302Ey {
    public final ConcurrentHashMap activeLoggers = new ConcurrentHashMap();
    public final boolean allowsConcurrentLogger;
    public final boolean enableDebugLogging;

    public abstract String getTAG();

    public synchronized boolean maybeAddNonconcurrentLogger(int i, FOAMessagingPerformanceLogger fOAMessagingPerformanceLogger) {
        boolean z;
        C14360o3.A0B(fOAMessagingPerformanceLogger, 1);
        if (!this.activeLoggers.isEmpty() && ((FOAMessagingPerformanceLogger) ((Map.Entry) this.activeLoggers.entrySet().iterator().next()).getValue()).isMarkerOn()) {
            logError("Concurrent logger is not allowed for this type");
            z = false;
        } else {
            this.activeLoggers.clear();
            this.activeLoggers.put(Integer.valueOf(i), fOAMessagingPerformanceLogger);
            z = true;
        }
        return z;
    }

    public synchronized void onLoggerEnded(FOAMessagingPerformanceLogger fOAMessagingPerformanceLogger) {
        C14360o3.A0B(fOAMessagingPerformanceLogger, 0);
        Integer instanceKey = fOAMessagingPerformanceLogger.getInstanceKey();
        if (instanceKey != null) {
            int intValue = instanceKey.intValue();
            if (this.activeLoggers.remove(instanceKey) == null) {
                logWarning(AnonymousClass001.A0O("Logger does not exist for instanceKey: ", intValue));
            }
        }
    }

    public synchronized boolean onLoggerStarted(FOAMessagingPerformanceLogger fOAMessagingPerformanceLogger) {
        boolean maybeAddNonconcurrentLogger;
        C14360o3.A0B(fOAMessagingPerformanceLogger, 0);
        Integer instanceKey = fOAMessagingPerformanceLogger.getInstanceKey();
        if (instanceKey != null) {
            int intValue = instanceKey.intValue();
            if (this.allowsConcurrentLogger) {
                FOAMessagingPerformanceLogger fOAMessagingPerformanceLogger2 = (FOAMessagingPerformanceLogger) this.activeLoggers.get(instanceKey);
                if (fOAMessagingPerformanceLogger2 != null && fOAMessagingPerformanceLogger2.isMarkerOn()) {
                    logWarning(AnonymousClass001.A0c("Logger already exists for instanceKey: ", ", ignoring the new logger. Please use the existing logger instead.", intValue));
                } else {
                    this.activeLoggers.put(instanceKey, fOAMessagingPerformanceLogger);
                    maybeAddNonconcurrentLogger = true;
                }
            } else {
                maybeAddNonconcurrentLogger = maybeAddNonconcurrentLogger(intValue, fOAMessagingPerformanceLogger);
            }
            return maybeAddNonconcurrentLogger;
        }
        return false;
    }

    private final void logError(String str) {
        if (this.enableDebugLogging) {
            C0K8.A0C(getTAG(), str);
        }
    }

    private final void logWarning(String str) {
        if (this.enableDebugLogging) {
            C0K8.A0D(getTAG(), str);
        }
    }

    public final ConcurrentHashMap getActiveLoggers() {
        return this.activeLoggers;
    }

    public final boolean getAllowsConcurrentLogger() {
        return this.allowsConcurrentLogger;
    }

    public final boolean getEnableDebugLogging() {
        return this.enableDebugLogging;
    }

    public FOAMessagingPerformanceLogger getLogger(Integer num) {
        if (num != null) {
            return (FOAMessagingPerformanceLogger) this.activeLoggers.get(num);
        }
        return null;
    }

    public AbstractC47302Ey(boolean z, boolean z2) {
        this.enableDebugLogging = z;
        this.allowsConcurrentLogger = z2;
    }
}
