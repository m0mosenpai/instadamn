package X;

import android.app.Application;
import android.content.Context;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.EventBuilder;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.5e2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C121105e2 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Context A03;
    public final C121095e1 A04;
    public final C2RW A05;
    public final C2RW A06;
    public final C2RX A07;
    public final C121085e0 A08;
    public final Executor A09;
    public final AtomicBoolean A0A = new AtomicBoolean(false);
    public final boolean A0B;

    public static void A00(C121105e2 c121105e2, CharSequence charSequence, String str, String str2, int i, int i2, int i3, long j, long j2) {
        C2RW c2rw = c121105e2.A06;
        if (c2rw != null) {
            EventBuilder A00 = C2RW.A00(c2rw, str, "compression_failed", System.currentTimeMillis());
            A00.annotate(OptSvcAnalyticsStore.LOGGING_KEY_ATTEMPT_NUMBER, i);
            A00.annotate("hprof_id", charSequence.toString());
            A00.annotate("original_file_size", j);
            A00.annotate(TraceFieldType.CompressionType, i2);
            A00.annotate("compression_level", i3);
            A00.annotate("time_spent_compressing_ms", (int) j2);
            A00.annotate("reason", str2);
            A00.report();
        }
    }

    public C121105e2(Application application, C121095e1 c121095e1, C121085e0 c121085e0, Executor executor, int i, int i2, int i3, boolean z) {
        C2RW c2rw;
        C2RX c2rx;
        this.A08 = c121085e0;
        this.A09 = executor;
        this.A04 = c121095e1;
        this.A03 = application.getApplicationContext();
        C2S1 A00 = C2S1.A00();
        synchronized (A00) {
            c2rw = A00.A0E;
        }
        this.A06 = c2rw;
        C2S1 A002 = C2S1.A00();
        synchronized (A002) {
            c2rx = A002.A0F;
        }
        this.A07 = c2rx;
        this.A05 = C2S1.A00().A0D;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = i3;
        this.A0B = z;
    }
}
