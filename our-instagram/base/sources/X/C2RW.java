package X;

import android.text.TextUtils;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.quicklog.EventBuilder;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;

/* renamed from: X.2RW, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2RW {
    public final LightweightQuickPerformanceLogger A00;

    public static EventBuilder A00(C2RW c2rw, String str, String str2, long j) {
        EventBuilder markEventBuilder = c2rw.A00.markEventBuilder(21370350, str);
        markEventBuilder.annotate("stage", str2);
        if (j > 0) {
            markEventBuilder.annotate("timestamp", j);
        }
        return markEventBuilder;
    }

    public C2RW(LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger) {
        this.A00 = lightweightQuickPerformanceLogger;
    }

    public static void A01(C2RW c2rw, CharSequence charSequence, String str, String str2, String str3, int i, int i2, int i3, long j) {
        EventBuilder A00 = A00(c2rw, str2, str, System.currentTimeMillis());
        A00.annotate(OptSvcAnalyticsStore.LOGGING_KEY_ATTEMPT_NUMBER, i);
        A00.annotate("hprof_id", charSequence.toString());
        A00.annotate("file_size", j);
        if (str3 != null) {
            A00.annotate("reason", str3);
        }
        if (i2 > 0) {
            A00.annotate("number_of_chunks", i2);
            A00.annotate("current_chunk_index", i3);
        }
        A00.report();
    }

    public final void A02(CharSequence charSequence, String str, String str2, String str3) {
        EventBuilder A00 = A00(this, str, "dump_failed", System.currentTimeMillis());
        A00.annotate("hprof_id", charSequence.toString());
        if (str3 != null) {
            A00.annotate("reason", str3);
        }
        if (!TextUtils.isEmpty(str2)) {
            A00.annotate("asl_session_id", str2);
        }
        A00.report();
    }
}
