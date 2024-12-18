package X;

import com.instagram.realtimeclient.DirectRealtimePayload;

/* loaded from: classes6.dex */
public final class EDZ extends C40781ul {
    public DirectRealtimePayload A00;
    public String A01;

    @Override // X.C40781ul, X.InterfaceC40821up
    public final String getClientFacingErrorMessage() {
        DirectRealtimePayload directRealtimePayload = this.A00;
        if (directRealtimePayload != null) {
            return directRealtimePayload.clientFacingErrorMessage;
        }
        return this.mClientFacingErrorMessage;
    }

    @Override // X.C40781ul, X.InterfaceC40821up
    public final String getErrorCode() {
        DirectRealtimePayload directRealtimePayload = this.A00;
        if (directRealtimePayload == null) {
            return null;
        }
        return directRealtimePayload.errorCode;
    }

    @Override // X.C40781ul, X.InterfaceC40821up
    public final String getErrorMessage() {
        DirectRealtimePayload directRealtimePayload = this.A00;
        if (directRealtimePayload == null) {
            return this.mErrorMessage;
        }
        return directRealtimePayload.message;
    }
}
