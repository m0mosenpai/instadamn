package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.analytics.intf.AnalyticsEventDebugInfo;
import com.instagram.common.analytics.intf.AnalyticsEventEntry;
import java.util.Date;

/* renamed from: X.0xG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C19320xG extends AbstractC37441oh {
    public static C19320xG A01;
    public final C1HT A00;

    /* JADX WARN: Type inference failed for: r1v1, types: [com.instagram.common.analytics.intf.AnalyticsEventEntry, java.lang.Object] */
    @Override // X.AbstractC37441oh
    public final void onEventReceivedWithParamsCollectionMap(C0CA c0ca, C42751y3 c42751y3) {
        AnalyticsEventDebugInfo analyticsEventDebugInfo = new AnalyticsEventDebugInfo(1);
        for (int i = 0; i < c0ca.A00; i++) {
            String A0D = c0ca.A0D(i);
            if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A0D)) {
                analyticsEventDebugInfo.A00 = (String) c0ca.A0C(i);
                analyticsEventDebugInfo.A01.add(new AnalyticsEventEntry(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, c0ca.A0C(i)));
            }
            if ("module".equals(A0D)) {
                analyticsEventDebugInfo.A01.add(new AnalyticsEventEntry("module", c0ca.A0C(i)));
            }
            if ("sample_rate".equals(A0D)) {
                analyticsEventDebugInfo.A01.add(new AnalyticsEventEntry("sample_rate", c0ca.A0C(i)));
            }
            if ("tags".equals(A0D)) {
                analyticsEventDebugInfo.A01.add(new AnalyticsEventEntry("tags", c0ca.A0C(i)));
            }
            if ("time".equals(A0D)) {
                double doubleValue = ((Number) c0ca.A0C(i)).doubleValue() * 1000.0d;
                analyticsEventDebugInfo.A01.add(new AnalyticsEventEntry("time", AnonymousClass001.A0u(String.valueOf(doubleValue), " (", AbstractC11490j8.A00.format(new Date((long) doubleValue)), ")")));
            }
            if ("extra".equals(A0D)) {
                AnalyticsEventDebugInfo A00 = AbstractC11490j8.A00((C0CA) c0ca.A0C(i));
                ?? obj = new Object();
                obj.A02 = "extra";
                obj.A00 = A00;
                analyticsEventDebugInfo.A01.add(obj);
            }
        }
        this.A00.A03(analyticsEventDebugInfo);
        StringBuilder sb = new StringBuilder();
        sb.append("{\n");
        AnalyticsEventDebugInfo.A03(analyticsEventDebugInfo, "| ", sb, true);
    }

    public static C19320xG A00() {
        C19320xG c19320xG = A01;
        if (c19320xG == null) {
            C19320xG c19320xG2 = new C19320xG(100);
            A01 = c19320xG2;
            return c19320xG2;
        }
        return c19320xG;
    }

    public C19320xG(int i) {
        this.A00 = new C1HT(i);
    }
}
