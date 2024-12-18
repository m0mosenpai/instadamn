package X;

import com.facebook.smartcapture.logging.CommonLoggingFields;
import com.facebook.smartcapture.logging.FederatedAnalyticsCardData;
import com.facebook.smartcapture.logging.SmartCaptureLogger;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.T1o, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64161T1o implements SmartCaptureLogger {
    public CommonLoggingFields A00;
    public String A01;
    public final InterfaceC02550Ad A02;
    public final C006802i A03;

    public C64161T1o(AbstractC12990ll abstractC12990ll) {
        C14360o3.A0B(abstractC12990ll, 1);
        this.A00 = CommonLoggingFields.NO_OP_LOGGING_FIELDS;
        this.A01 = "";
        this.A02 = AbstractC12220kQ.A02(abstractC12990ll);
        this.A03 = C006802i.A0p;
    }

    @Override // com.facebook.smartcapture.logging.SmartCaptureLogger
    public final void logError(String str, Throwable th) {
        C14360o3.A0B(str, 0);
        logError(str, "", th);
    }

    @Override // com.facebook.smartcapture.logging.SmartCaptureLogger
    public final void logEvent(String str, Map map) {
        HashMap A1G;
        C14360o3.A0B(str, 0);
        InterfaceC02590Ai A0H = MSY.A0H(this.A02, "scp_event");
        if (A0H.isSampled()) {
            A0H.AAP("event", str);
            int ordinal = this.A00.featureLevel.ordinal();
            String str2 = "low";
            if (ordinal != 2) {
                if (ordinal == 1) {
                    str2 = "mid";
                }
            } else {
                str2 = "high";
            }
            A0H.AAP("feature_level", str2);
            A0H.AAP("flow_type", this.A00.flowType);
            A0H.AAP("product", this.A00.product);
            A0H.A9M("tags", AbstractC58318PtA.A12(this.A00._tagsMap));
            A0H.AAP(AbstractC58354Ptu.A00(), this.A00.sessionId);
            A0H.AAP("submission_id", this.A00.submissionId);
            if (map != null) {
                A1G = AbstractC58318PtA.A10(map);
            } else {
                A1G = AbstractC166987dD.A1G();
            }
            A1G.put("wizard_screen", this.A01);
            A0H.A9M("event_specific_fields", A1G);
            A0H.Cht();
        }
    }

    @Override // com.facebook.smartcapture.logging.SmartCaptureLogger
    public final void logFederatedAnalyticsCardData(FederatedAnalyticsCardData federatedAnalyticsCardData) {
    }

    @Override // com.facebook.smartcapture.logging.SmartCaptureLogger
    public final void qplMarkerAnnotate(int i, String str, long j) {
        C14360o3.A0B(str, 1);
        this.A03.markerAnnotate(i, str, j);
    }

    @Override // com.facebook.smartcapture.logging.SmartCaptureLogger
    public final void setCommonFields(CommonLoggingFields commonLoggingFields) {
        C14360o3.A0B(commonLoggingFields, 0);
        this.A00 = commonLoggingFields;
    }

    @Override // com.facebook.smartcapture.logging.SmartCaptureLogger
    public final void setCurrentScreen(String str) {
        C14360o3.A0B(str, 0);
        this.A01 = str;
    }

    @Override // com.facebook.smartcapture.logging.SmartCaptureLogger
    public final CommonLoggingFields getCommonFields() {
        return this.A00;
    }

    @Override // com.facebook.smartcapture.logging.SmartCaptureLogger
    public final void qplMarkerEnd(int i, boolean z) {
        C006802i c006802i = this.A03;
        short s = 3;
        if (z) {
            s = 2;
        }
        c006802i.markerEnd(i, s);
    }

    @Override // com.facebook.smartcapture.logging.SmartCaptureLogger
    public final void qplMarkerStart(int i) {
        C006802i c006802i = this.A03;
        c006802i.markerStart(i);
        c006802i.markerAnnotate(i, "product", this.A00.product);
    }

    @Override // com.facebook.smartcapture.logging.SmartCaptureLogger
    public final void logError(String str, String str2, Throwable th) {
        C14360o3.A0B(str, 0);
        C0w9 c0w9 = C0w9.A01;
        String A0R = AnonymousClass001.A0R("smart_capture: ", str);
        if (th == null) {
            if (str2 == null) {
                str2 = "";
            }
            c0w9.EmO(A0R, str2, 10);
        } else {
            if (str2 == null) {
                str2 = "";
            }
            c0w9.EmT(A0R, str2, 10, th);
        }
    }

    @Override // com.facebook.smartcapture.logging.SmartCaptureLogger
    public final void logEvent(String str) {
        C14360o3.A0B(str, 0);
        logEvent(str, null);
    }

    @Override // com.facebook.smartcapture.logging.SmartCaptureLogger
    public final void qplMarkerAnnotate(int i, String str, String str2) {
        AbstractC167017dG.A1P(str, str2);
        this.A03.markerAnnotate(i, str, str2);
    }
}
