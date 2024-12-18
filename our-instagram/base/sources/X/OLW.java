package X;

import com.facebook.quicklog.QuickPerformanceLogger;

/* loaded from: classes9.dex */
public final class OLW {
    public final int A00;
    public final QuickPerformanceLogger A01;

    public final void A00(Integer num, String str, long j) {
        String str2;
        C14360o3.A0B(str, 0);
        int A03 = AbstractC25226BEj.A03(str, this.A00);
        QuickPerformanceLogger quickPerformanceLogger = this.A01;
        if (num.intValue() != 0) {
            str2 = "no_logs";
        } else {
            str2 = "attachment_generated";
        }
        quickPerformanceLogger.markerAnnotate(396363750, A03, "result", str2);
        quickPerformanceLogger.markerAnnotate(396363750, A03, "file_size", j);
        quickPerformanceLogger.markerEnd(396363750, A03, (short) 2);
    }

    public final void A02(String str, String str2, String str3) {
        C14360o3.A0B(str, 0);
        AbstractC167017dG.A1P(str2, str3);
        int A03 = AbstractC25226BEj.A03(str, this.A00);
        QuickPerformanceLogger quickPerformanceLogger = this.A01;
        quickPerformanceLogger.markerStart(396363750, A03);
        quickPerformanceLogger.markerAnnotate(396363750, A03, "file_name", str);
        quickPerformanceLogger.markerAnnotate(396363750, A03, "tag", str2);
        quickPerformanceLogger.markerAnnotate(396363750, A03, "client_server_join_key", str3);
    }

    public /* synthetic */ OLW(AbstractC12990ll abstractC12990ll) {
        int A01 = MSW.A01();
        C14360o3.A0B(abstractC12990ll, 1);
        this.A00 = A01;
        this.A01 = AbstractC43592JPx.A0N();
    }

    public final void A01(String str, String str2) {
        AbstractC167017dG.A1N(str, str2);
        int A03 = AbstractC25226BEj.A03(str, this.A00);
        QuickPerformanceLogger quickPerformanceLogger = this.A01;
        quickPerformanceLogger.markerAnnotate(396363750, A03, "error", str2);
        quickPerformanceLogger.markerEnd(396363750, A03, (short) 3);
    }
}
