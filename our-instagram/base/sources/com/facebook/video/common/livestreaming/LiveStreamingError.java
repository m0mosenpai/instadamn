package com.facebook.video.common.livestreaming;

import X.AbstractC16490ru;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC25233BEq;
import X.AbstractC50522MSa;
import X.C14360o3;
import X.S1U;

/* loaded from: classes9.dex */
public class LiveStreamingError {
    public final Throwable A00;
    public final String description;
    public final String domain;
    public final int errorCode;
    public final String fullDescription;
    public final LiveStreamingError innerError;
    public final boolean isConnectivityLost;
    public final boolean isRecoverable;
    public final boolean isStreamTerminated;
    public final String reason;

    public LiveStreamingError(String str, String str2, Throwable th, int i, boolean z) {
        this.A00 = th;
        this.errorCode = i;
        this.domain = str;
        String message = th.getMessage();
        message = message == null ? "" : message;
        this.description = message;
        this.reason = message;
        this.fullDescription = str2;
        this.isRecoverable = false;
        this.isConnectivityLost = false;
        this.isStreamTerminated = false;
        Throwable cause = th.getCause();
        LiveStreamingError liveStreamingError = null;
        if (cause != null && !z) {
            String canonicalName = cause.getClass().getCanonicalName();
            String A0m = AbstractC50522MSa.A0m(cause);
            C14360o3.A07(A0m);
            liveStreamingError = new LiveStreamingError(canonicalName, A0m, cause, S1U.A00(cause), true);
        }
        this.innerError = liveStreamingError;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("\n        Error:");
        A1C.append(this.errorCode);
        A1C.append(", \n        Domain:");
        A1C.append(this.domain);
        A1C.append(", \n        Reason:");
        A1C.append(this.reason);
        A1C.append(", \n        Description:");
        A1C.append(this.description);
        A1C.append(", \n        Full Description:");
        A1C.append(this.fullDescription);
        A1C.append(", \n        isTransient:");
        A1C.append(this.isRecoverable);
        A1C.append(", \n        isConnectionLost:");
        A1C.append(this.isConnectivityLost);
        A1C.append(", \n        isStreamTerminated:");
        A1C.append(this.isStreamTerminated);
        String A0p = AbstractC16490ru.A0p(AbstractC166997dE.A0x("\n        ", A1C));
        LiveStreamingError liveStreamingError = this.innerError;
        if (liveStreamingError != null) {
            liveStreamingError.toString();
        }
        return A0p;
    }

    public LiveStreamingError(int i, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3) {
        AbstractC25233BEq.A0x(3, str2, str3, str4);
        this.errorCode = i;
        this.domain = str;
        this.reason = str2;
        this.description = str3;
        this.fullDescription = str4;
        this.isRecoverable = z;
        this.isConnectivityLost = z2;
        this.isStreamTerminated = z3;
        this.A00 = null;
        this.innerError = null;
    }
}
