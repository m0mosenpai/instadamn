package org.webrtc;

import X.AbstractC166987dD;
import X.AnonymousClass001;
import X.C3OO;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.EnumSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes10.dex */
public class Logging {
    public static final Logger fallbackLogger = createFallbackLogger();
    public static Loggable loggable;
    public static Severity loggableSeverity;
    public static volatile boolean loggingEnabled;

    /* loaded from: classes12.dex */
    public enum Severity {
        LS_VERBOSE,
        LS_INFO,
        LS_WARNING,
        LS_ERROR,
        LS_NONE
    }

    public static void d(String str, String str2) {
    }

    public static void deleteInjectedLoggable() {
        loggable = null;
    }

    public static void e(String str, String str2) {
    }

    @Deprecated
    public static void enableTracing(String str, EnumSet enumSet) {
    }

    public static native void nativeEnableLogThreads();

    public static native void nativeEnableLogTimeStamps();

    public static native void nativeEnableLogToDebugOutput(int i);

    public static native void nativeLog(int i, String str, String str2);

    public static void v(String str, String str2) {
    }

    public static void w(String str, String str2) {
    }

    /* renamed from: org.webrtc.Logging$1, reason: invalid class name */
    /* loaded from: classes12.dex */
    public abstract /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$org$webrtc$Logging$Severity;

        static {
            int[] iArr = new int[Severity.values().length];
            $SwitchMap$org$webrtc$Logging$Severity = iArr;
            try {
                iArr[Severity.LS_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Severity.LS_WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Severity.LS_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Deprecated
    /* loaded from: classes4.dex */
    public enum TraceLevel {
        TRACE_NONE(0),
        TRACE_STATEINFO(1),
        TRACE_WARNING(2),
        TRACE_ERROR(4),
        TRACE_CRITICAL(8),
        TRACE_APICALL(16),
        TRACE_DEFAULT(255),
        TRACE_MODULECALL(32),
        TRACE_MEMORY(256),
        TRACE_TIMER(512),
        TRACE_STREAM(1024),
        TRACE_DEBUG(C3OO.FLAG_MOVED),
        TRACE_INFO(4096),
        TRACE_TERSEINFO(8192),
        TRACE_ALL(65535);

        public final int level;

        TraceLevel(int i) {
            this.level = i;
        }
    }

    public static Logger createFallbackLogger() {
        Logger logger = Logger.getLogger("org.webrtc.Logging");
        logger.setLevel(Level.ALL);
        return logger;
    }

    public static synchronized void enableLogToDebugOutput(Severity severity) {
        synchronized (Logging.class) {
            if (loggable == null) {
                nativeEnableLogToDebugOutput(severity.ordinal());
                loggingEnabled = true;
            } else {
                throw AbstractC166987dD.A14("Logging to native debug output not supported while Loggable is injected. Delete the Loggable before calling this method.");
            }
        }
    }

    public static String getStackTraceString(Throwable th) {
        if (th == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static void injectLoggable(Loggable loggable2, Severity severity) {
        if (loggable2 != null) {
            loggable = loggable2;
            loggableSeverity = severity;
        }
    }

    public static void log(Severity severity, String str, String str2) {
        Level level;
        if (str != null && str2 != null) {
            Loggable loggable2 = loggable;
            if (loggable2 != null) {
                if (severity.ordinal() >= loggableSeverity.ordinal()) {
                    loggable2.onLogMessage(str2, severity, str);
                    return;
                }
                return;
            } else {
                if (loggingEnabled) {
                    nativeLog(severity.ordinal(), str, str2);
                    return;
                }
                int ordinal = severity.ordinal();
                if (ordinal != 3) {
                    if (ordinal != 2) {
                        if (ordinal != 1) {
                            level = Level.FINE;
                        } else {
                            level = Level.INFO;
                        }
                    } else {
                        level = Level.WARNING;
                    }
                } else {
                    level = Level.SEVERE;
                }
                fallbackLogger.log(level, AnonymousClass001.A0g(str, ": ", str2));
                return;
            }
        }
        throw AbstractC166987dD.A12("Logging tag or message may not be null.");
    }

    public static void enableLogThreads() {
        nativeEnableLogThreads();
    }

    public static void enableLogTimeStamps() {
        nativeEnableLogTimeStamps();
    }

    public static void e(String str, String str2, Throwable th) {
        th.toString();
        getStackTraceString(th);
    }

    public static void w(String str, String str2, Throwable th) {
        th.toString();
        getStackTraceString(th);
    }
}
