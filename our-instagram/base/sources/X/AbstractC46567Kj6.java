package X;

import com.facebook.msys.mci.LoggingOption;
import com.facebook.msys.mci.TraceLogger;

/* renamed from: X.Kj6, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46567Kj6 {
    public static final void A00(LoggingOption loggingOption) {
        if (loggingOption != null && loggingOption.getTraceInfo() != null) {
            TraceLogger.log(null, loggingOption.getTraceInfo().getTraceType().intValue(), null, 2001, loggingOption.getTraceInfo().getTraceId(), null, 0, null);
        }
    }
}
