package X;

import com.facebook.xanalytics.XAnalyticsAdapter;

/* renamed from: X.Abb, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23521Abb implements XAnalyticsAdapter {
    public final /* synthetic */ C23336AWf A00;

    @Override // com.facebook.xanalytics.XAnalyticsAdapter
    public final void cleanup() {
    }

    @Override // com.facebook.xanalytics.XAnalyticsAdapter
    public final void flush() {
    }

    @Override // com.facebook.xanalytics.XAnalyticsAdapter
    public final String getStructureSamplingConfig(String str) {
        return "";
    }

    @Override // com.facebook.xanalytics.XAnalyticsAdapter
    public final void logCounter(String str, double d) {
    }

    @Override // com.facebook.xanalytics.XAnalyticsAdapter
    public final void logCounter(String str, double d, String str2) {
    }

    @Override // com.facebook.xanalytics.XAnalyticsAdapter
    public final void logEventBypassSampling(String str, String str2) {
        AbstractC167007dF.A1K(str, str2);
        logEvent(str, str2, "", false, -1.0d);
    }

    @Override // com.facebook.xanalytics.XAnalyticsAdapter
    public final boolean shouldLog(String str) {
        return true;
    }

    public C23521Abb(C23336AWf c23336AWf) {
        this.A00 = c23336AWf;
    }

    @Override // com.facebook.xanalytics.XAnalyticsAdapter
    public final void logEvent(String str, String str2, String str3, boolean z, double d) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        C14360o3.A0B(str3, 2);
        this.A00.A03.add(AbstractC61636Rr0.A00(AbstractC166987dD.A1L("eventType", C05F.A00), AbstractC166987dD.A1L("eventName", str), AbstractC166987dD.A1L("extra", str2), AbstractC166987dD.A1L("eventExtraKeys", str3), AbstractC166987dD.A1L("isHiPri", Boolean.valueOf(z)), AbstractC166987dD.A1L("ts", Double.valueOf(d))));
    }
}
