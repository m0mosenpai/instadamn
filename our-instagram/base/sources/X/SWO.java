package X;

import android.text.TextUtils;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.Map;

/* loaded from: classes10.dex */
public final class SWO {
    public final C62948SYq A01;
    public int A00 = 0;
    public final Map A02 = new C005001p(0);

    public static final String A00(SWO swo) {
        String string;
        C62948SYq c62948SYq = swo.A01;
        synchronized (c62948SYq) {
            string = c62948SYq.A01.getString("topic_operation_queue", "");
        }
        if (!TextUtils.isEmpty(string)) {
            String[] split = string.split(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
            if (split.length > 1 && !TextUtils.isEmpty(split[1])) {
                return split[1];
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.01p, java.util.Map] */
    public SWO(C62948SYq c62948SYq) {
        this.A01 = c62948SYq;
    }
}
