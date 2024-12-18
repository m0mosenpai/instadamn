package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.List;

/* loaded from: classes9.dex */
public final class OKS {
    public final int A00 = MSW.A01();
    public final QuickPerformanceLogger A01 = AbstractC43592JPx.A0N();

    public final void A01(String str, String str2) {
        C14360o3.A0B(str2, 1);
        int A03 = AbstractC25226BEj.A03(str, this.A00);
        QuickPerformanceLogger quickPerformanceLogger = this.A01;
        quickPerformanceLogger.markerAnnotate(396363750, A03, "error", str2);
        quickPerformanceLogger.markerEnd(396363750, A03, (short) 3);
    }

    public final void A00(Integer num, String str, List list, long j) {
        String str2;
        int A03 = AbstractC25226BEj.A03(str, this.A00);
        QuickPerformanceLogger quickPerformanceLogger = this.A01;
        switch (num.intValue()) {
            case 0:
                str2 = "attachment_generated";
                break;
            case 1:
                str2 = "no_logs";
                break;
            default:
                str2 = "has_null_uri";
                break;
        }
        quickPerformanceLogger.markerAnnotate(396363750, A03, "result", str2);
        quickPerformanceLogger.markerAnnotate(396363750, A03, "file_size", j);
        quickPerformanceLogger.markerAnnotate(396363750, A03, "file_names", AbstractC31175DnJ.A0a(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, list));
        quickPerformanceLogger.markerEnd(396363750, A03, (short) 2);
    }
}
