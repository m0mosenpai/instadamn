package X;

import com.instagram.realtimeclient.DirectRealtimePayload;

/* renamed from: X.EDg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32207EDg extends C40781ul implements InterfaceC37134GXv {
    public DirectRealtimePayload A00;

    public final long A00() {
        DirectRealtimePayload directRealtimePayload = this.A00;
        if (directRealtimePayload != null) {
            return directRealtimePayload.timestamp;
        }
        throw AbstractC166997dE.A0g();
    }

    public final String A01() {
        DirectRealtimePayload directRealtimePayload = this.A00;
        if (directRealtimePayload != null) {
            return directRealtimePayload.threadId;
        }
        return null;
    }

    @Override // X.InterfaceC37134GXv
    public final String BK3() {
        DirectRealtimePayload directRealtimePayload = this.A00;
        if (directRealtimePayload != null) {
            String str = directRealtimePayload.itemId;
            C14360o3.A06(str);
            return str;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.C40781ul, X.InterfaceC40821up
    public final boolean getCanSeeBroadcastChats() {
        DirectRealtimePayload directRealtimePayload = this.A00;
        if (directRealtimePayload != null) {
            return directRealtimePayload.canSeeBroadcastChats;
        }
        return this.mCanSeeBroadcastChats;
    }

    @Override // X.C40781ul, X.InterfaceC40821up
    public final boolean getCanSeeNotes() {
        DirectRealtimePayload directRealtimePayload = this.A00;
        if (directRealtimePayload != null) {
            return directRealtimePayload.canSeeNotes;
        }
        return this.mCanSeeNotes;
    }

    @Override // X.C40781ul, X.InterfaceC40821up
    public final String getClientFacingErrorMessage() {
        String str;
        DirectRealtimePayload directRealtimePayload = this.A00;
        if (directRealtimePayload == null || (str = directRealtimePayload.clientFacingErrorMessage) == null) {
            return this.mClientFacingErrorMessage;
        }
        return str;
    }

    @Override // X.C40781ul, X.InterfaceC40821up
    public final String getErrorCode() {
        String str;
        DirectRealtimePayload directRealtimePayload = this.A00;
        if (directRealtimePayload == null || (str = directRealtimePayload.errorCode) == null) {
            return this.mErrorCode;
        }
        return str;
    }

    @Override // X.C40781ul, X.InterfaceC40821up
    public final String getErrorMessage() {
        String str;
        DirectRealtimePayload directRealtimePayload = this.A00;
        if (directRealtimePayload == null || (str = directRealtimePayload.message) == null) {
            return this.mErrorMessage;
        }
        return str;
    }

    @Override // X.C40781ul, X.InterfaceC40821up
    public final boolean isEpdError() {
        DirectRealtimePayload directRealtimePayload = this.A00;
        if (directRealtimePayload != null) {
            return directRealtimePayload.isEpdError;
        }
        return this.mIsEpdError;
    }
}
