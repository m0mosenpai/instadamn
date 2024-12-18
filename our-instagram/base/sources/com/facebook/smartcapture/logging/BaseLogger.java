package com.facebook.smartcapture.logging;

import X.AbstractC001800i;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25225BEi;
import X.AbstractC25228BEl;
import X.C14360o3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes10.dex */
public class BaseLogger implements SmartCaptureLogger {
    public static final Companion Companion = new Object();
    public final SmartCaptureLogger logger;

    public static final Map buildMap(Object... objArr) {
        return Companion.buildMap(objArr);
    }

    public final void logButtonClick(String str) {
        C14360o3.A0B(str, 0);
        logEvent("button_click", Companion.buildMap("button_name", str));
    }

    public final void logCaptureSessionEnd(String str) {
        C14360o3.A0B(str, 0);
        logEvent("capture_session_end", Companion.buildMap("state_history", str));
    }

    @Override // com.facebook.smartcapture.logging.SmartCaptureLogger
    public void logError(String str, Throwable th) {
        C14360o3.A0B(str, 0);
        logError(str, "", th);
    }

    @Override // com.facebook.smartcapture.logging.SmartCaptureLogger
    public void logEvent(String str, Map map) {
        C14360o3.A0B(str, 0);
        SmartCaptureLogger smartCaptureLogger = this.logger;
        if (smartCaptureLogger != null) {
            smartCaptureLogger.logEvent(str, map);
        }
    }

    @Override // com.facebook.smartcapture.logging.SmartCaptureLogger
    public void logFederatedAnalyticsCardData(FederatedAnalyticsCardData federatedAnalyticsCardData) {
        C14360o3.A0B(federatedAnalyticsCardData, 0);
        SmartCaptureLogger smartCaptureLogger = this.logger;
        if (smartCaptureLogger != null) {
            smartCaptureLogger.logFederatedAnalyticsCardData(federatedAnalyticsCardData);
        }
    }

    public final void logFlowCancel(CancelReason cancelReason) {
        C14360o3.A0B(cancelReason, 0);
        logEvent("flow_cancel", Companion.buildMap("cancel_reason", cancelReason.getReason()));
    }

    @Override // com.facebook.smartcapture.logging.SmartCaptureLogger
    public void qplMarkerAnnotate(int i, String str, long j) {
        C14360o3.A0B(str, 1);
        SmartCaptureLogger smartCaptureLogger = this.logger;
        if (smartCaptureLogger != null) {
            smartCaptureLogger.qplMarkerAnnotate(i, str, j);
        }
    }

    @Override // com.facebook.smartcapture.logging.SmartCaptureLogger
    public void setCommonFields(CommonLoggingFields commonLoggingFields) {
        C14360o3.A0B(commonLoggingFields, 0);
        SmartCaptureLogger smartCaptureLogger = this.logger;
        if (smartCaptureLogger != null) {
            smartCaptureLogger.setCommonFields(commonLoggingFields);
        }
    }

    @Override // com.facebook.smartcapture.logging.SmartCaptureLogger
    public void setCurrentScreen(String str) {
        C14360o3.A0B(str, 0);
        SmartCaptureLogger smartCaptureLogger = this.logger;
        if (smartCaptureLogger != null) {
            smartCaptureLogger.setCurrentScreen(str);
        }
    }

    /* loaded from: classes10.dex */
    public final class Companion {
        public final Map buildMap(Object... objArr) {
            C14360o3.A0B(objArr, 0);
            int length = objArr.length;
            if (length % 2 == 0) {
                HashMap A1G = AbstractC166987dD.A1G();
                ArrayList A17 = AbstractC25225BEi.A17(length);
                for (Object obj : objArr) {
                    AbstractC166997dE.A1S(obj, A17);
                }
                Iterator it = AbstractC001800i.A0Q(A17, 2).iterator();
                while (it.hasNext()) {
                    List list = (List) it.next();
                    A1G.put(list.get(0), list.get(1));
                }
                return A1G;
            }
            throw AbstractC166987dD.A12("Must pass a key & value in pairs.");
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    @Override // com.facebook.smartcapture.logging.SmartCaptureLogger
    public CommonLoggingFields getCommonFields() {
        CommonLoggingFields commonFields;
        SmartCaptureLogger smartCaptureLogger = this.logger;
        if (smartCaptureLogger == null || (commonFields = smartCaptureLogger.getCommonFields()) == null) {
            return CommonLoggingFields.NO_OP_LOGGING_FIELDS;
        }
        return commonFields;
    }

    public final void logCameraInitialize(int i, int i2, int i3, int i4, int i5, int i6) {
        logEvent("camera_initialize", Companion.buildMap("preview_width", Integer.valueOf(i), "preview_height", Integer.valueOf(i2), "image_width", Integer.valueOf(i3), "image_height", Integer.valueOf(i4), "view_width", Integer.valueOf(i5), "view_height", Integer.valueOf(i6)));
    }

    public final void logFlowEnd() {
        logEvent("flow_end");
    }

    public final void logFlowStart() {
        logEvent("flow_start");
    }

    public final void logPermissionExplain() {
        logEvent("permission_explain");
    }

    public final void logPermissionGrant(int i) {
        logEvent("permission_grant", Companion.buildMap(AbstractC25228BEl.A1Z("attempts", i)));
    }

    public final void logPermissionNeverAskAgain() {
        logEvent("permission_never_ask_again");
    }

    public final void logPermissionReject() {
        logEvent("permission_reject");
    }

    @Override // com.facebook.smartcapture.logging.SmartCaptureLogger
    public void qplMarkerEnd(int i, boolean z) {
        SmartCaptureLogger smartCaptureLogger = this.logger;
        if (smartCaptureLogger != null) {
            smartCaptureLogger.qplMarkerEnd(i, z);
        }
    }

    @Override // com.facebook.smartcapture.logging.SmartCaptureLogger
    public void qplMarkerStart(int i) {
        SmartCaptureLogger smartCaptureLogger = this.logger;
        if (smartCaptureLogger != null) {
            smartCaptureLogger.qplMarkerStart(i);
        }
    }

    public BaseLogger(SmartCaptureLogger smartCaptureLogger) {
        this.logger = smartCaptureLogger;
    }

    @Override // com.facebook.smartcapture.logging.SmartCaptureLogger
    public void logError(String str, String str2, Throwable th) {
        C14360o3.A0B(str, 0);
        SmartCaptureLogger smartCaptureLogger = this.logger;
        if (smartCaptureLogger != null) {
            smartCaptureLogger.logError(str, str2, th);
        }
    }

    @Override // com.facebook.smartcapture.logging.SmartCaptureLogger
    public void logEvent(String str) {
        C14360o3.A0B(str, 0);
        SmartCaptureLogger smartCaptureLogger = this.logger;
        if (smartCaptureLogger != null) {
            smartCaptureLogger.logEvent(str);
        }
    }

    @Override // com.facebook.smartcapture.logging.SmartCaptureLogger
    public void qplMarkerAnnotate(int i, String str, String str2) {
        AbstractC167017dG.A1P(str, str2);
        SmartCaptureLogger smartCaptureLogger = this.logger;
        if (smartCaptureLogger != null) {
            smartCaptureLogger.qplMarkerAnnotate(i, str, str2);
        }
    }
}
