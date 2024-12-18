package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.6Di, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC136036Di {
    public static LightweightQuickPerformanceLogger A00;
    public static AbstractC136036Di A01;
    public static C136046Dj A02;
    public static final AtomicInteger A04 = new AtomicInteger();
    public static final AtomicInteger A03 = new AtomicInteger();

    public void A0Q(Long l, String str, String str2, int i, boolean z) {
        AbstractC09800fd.A01("MsysBootstrapperPerformanceLoggerImpl.markerCreateMailboxStart", -1785101235);
        try {
            AbstractC09800fd.A01("markerStart", 965901212);
            A00.markerStartWithCancelPolicy(53084161, false, 0, -1L, TimeUnit.NANOSECONDS);
            AbstractC09800fd.A00(1073611576);
            A00.markerAnnotate(53084161, "PARAM_HAS_MAILBOX_BEEN_INIT", false);
            A00.markerAnnotate(53084161, "PARAM_BOOTSTRAPPER_VERSION", 3);
            A00.markerAnnotate(53084161, "PARAM_IS_FOREGROUND", C0L6.A07());
            A00.markerAnnotate(53084161, "STARTUP_IN_BACKGROUND", false);
            A00.markerAnnotate(53084161, "PARAM_SEQUENCE_ID", A04.incrementAndGet());
            A00.markerAnnotate(53084161, "PARAM_ACTIVE_MAILBOX_COUNT", A03.incrementAndGet());
            A00.markerAnnotate(53084161, "PARAM_DATABASEFILE_EXIST", new File(str).exists());
            A00.markerPoint(936448891, "BOOTSTRAP_START");
            if (l != null) {
                A00.markerAnnotate(53084161, "TIME_SINCE_STARTUP_MS", l.longValue());
            }
            if (str2 != null) {
                A00.markerAnnotate(53084161, "PARAM_CALLSITE", str2);
            }
            C0L6.A05(C0LK.A7T, "started");
            C0L6.A05(C0LK.A7S, String.valueOf(3));
            AbstractC09800fd.A00(1416033058);
        } catch (Throwable th) {
            AbstractC09800fd.A00(154555218);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, X.6Dj] */
    public static AbstractC136036Di A00(LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger) {
        AbstractC136036Di abstractC136036Di;
        AbstractC136036Di abstractC136036Di2 = A01;
        AbstractC136036Di abstractC136036Di3 = abstractC136036Di2;
        if (abstractC136036Di2 == null) {
            if (lightweightQuickPerformanceLogger != null) {
                A00 = lightweightQuickPerformanceLogger;
                C136046Dj c136046Dj = C136046Dj.A00;
                C136046Dj c136046Dj2 = c136046Dj;
                if (c136046Dj == null) {
                    ?? obj = new Object();
                    C136046Dj.A00 = obj;
                    c136046Dj2 = obj;
                }
                A02 = c136046Dj2;
                abstractC136036Di = new Object();
            } else {
                abstractC136036Di = new Object();
            }
            A01 = abstractC136036Di;
            abstractC136036Di3 = abstractC136036Di;
        }
        return abstractC136036Di3;
    }

    public void A01() {
        A00.markerEnd(53084161, (short) 2);
        C0L6.A05(C0LK.A7T, "succeeded");
    }

    public void A02() {
        A00.markerPoint(53084161, "CLEAN_UP_COMPLETE");
        A03.decrementAndGet();
    }

    public void A03() {
        A00.markerPoint(53084161, "CLEAN_UP_START");
    }

    public void A04() {
        A00.markerPoint(53084161, "CONFIGURE_PROXIES");
    }

    public void A05() {
        A00.markerPoint(53084161, "CONFIGURE_SYNC_PARAMS");
    }

    public void A06() {
        A00.markerPoint(53084161, "CONNECT_MQTT");
    }

    public void A07() {
        A00.markerPoint(53084161, "CREATE_DATABASE");
    }

    public void A08() {
        A00.markerPoint(53084161, "CREATE_MAILBOX");
        A00.markerPoint(936448891, "BOOTSTRAP_END");
    }

    public void A09() {
        A00.markerPoint(53084161, "EXECUTION_JOB_START");
    }

    public void A0A() {
        A00.markerPoint(53084161, "MAILBOX_HEALTH_FILE_CREATE_FAILED");
    }

    public void A0B() {
        A00.markerPoint(53084161, "MAILBOX_OBJECT_CREATE");
    }

    public void A0C() {
        A00.markerPoint(53084161, "PROC_MAPPING_COMPLETE");
    }

    public void A0D() {
        A00.markerPoint(53084161, "PROC_MAPPING_START");
    }

    public void A0E() {
        A00.markerPoint(53084161, "CREATE_NETWORK_SESSION");
    }

    public void A0F() {
        A00.markerPoint(53084161, "CREATE_NOTIFICATION_CENTER");
    }

    public void A0G() {
        A00.markerPoint(53084161, "CREATE_SLIM_MAILBOX_END");
    }

    public void A0H() {
        A00.markerPoint(53084161, "CREATE_SLIM_MAILBOX_START");
    }

    public void A0I() {
        A00.markerPoint(53084161, "EXECUTION_INIT_COMPLETE");
    }

    public void A0J() {
        A00.markerPoint(53084161, "FIRST_SYNC");
    }

    public void A0K() {
        A00.markerPoint(53084161, "IN_MEMORY_SCHEMA_UPGRADE_START");
        C0L6.A05(C0LK.A7X, "started");
    }

    public void A0L() {
        A00.markerPoint(53084161, "PERSISTENT_SCHEMA_UPGRADE_START");
        C0L6.A05(C0LK.A7Y, "started");
    }

    public void A0M() {
        A00.markerPoint(53084161, "DEPLOY_EARLY_DB_CONNECTION_END");
    }

    public void A0N() {
        A00.markerPoint(53084161, "DEPLOY_EARLY_DB_CONNECTION_START");
    }

    public void A0O(int i) {
        String str;
        A00.markerPoint(53084161, "IN_MEMORY_SCHEMA_UPGRADE_COMPLETE");
        A00.markerAnnotate(53084161, "PARAM_IN_MEMORY_SCHEMA_UPGRADE_RESULT", i);
        C10850hu c10850hu = C0LK.A7X;
        if (i == 0) {
            str = "succeeded";
        } else {
            str = "failed";
        }
        C0L6.A05(c10850hu, str);
    }

    public void A0P(int i) {
        String str;
        A00.markerPoint(53084161, "PERSISTENT_SCHEMA_UPGRADE_COMPLETE");
        A00.markerAnnotate(53084161, "PARAM_PERSISTENT_SCHEMA_UPGRADE_RESULT", i);
        C10850hu c10850hu = C0LK.A7Y;
        if (i == 0) {
            str = "succeeded";
        } else {
            str = "failed";
        }
        C0L6.A05(c10850hu, str);
    }

    public void A0R(String str) {
        A00.markerAnnotate(53084161, "PARAM_FAIL_TYPE", str);
        A00.markerEnd(53084161, (short) 3);
        C0L6.A05(C0LK.A7T, "failed");
        C0L6.A05(C0LK.A7V, str);
    }

    public void A0S(boolean z) {
        A00.markerPoint(53084161, "OPEN_DATABASE");
        A00.markerAnnotate(53084161, "PARAM_DID_CREATE_DATABASE", z);
        C0L6.A05(C0LK.A7W, String.valueOf(z));
    }
}
