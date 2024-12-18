package X;

import com.instagram.realtimeclient.DirectRealtimePayload;

/* loaded from: classes6.dex */
public final class G6Q implements InterfaceC37119GXe {
    @Override // X.InterfaceC37119GXe
    public final C114675Fx AWh(InterfaceC40821up interfaceC40821up, String str) {
        EnumC81843l3 enumC81843l3;
        DirectRealtimePayload directRealtimePayload;
        int statusCode = interfaceC40821up.getStatusCode();
        String errorMessage = interfaceC40821up.getErrorMessage();
        String clientFacingErrorMessage = interfaceC40821up.getClientFacingErrorMessage();
        boolean isEpdError = interfaceC40821up.isEpdError();
        if ((interfaceC40821up instanceof C32207EDg) && (directRealtimePayload = ((C32207EDg) interfaceC40821up).A00) != null) {
            enumC81843l3 = directRealtimePayload.throttlingType;
        } else {
            enumC81843l3 = null;
        }
        String errorCode = interfaceC40821up.getErrorCode();
        boolean canSeeNotes = interfaceC40821up.getCanSeeNotes();
        boolean canSeeBroadcastChats = interfaceC40821up.getCanSeeBroadcastChats();
        if (statusCode == 403) {
            return new C114675Fx(enumC81843l3, EnumC46247KdO.A0D, String.valueOf(statusCode), errorCode, "http", null, errorMessage, clientFacingErrorMessage, AbstractC166987dD.A1I(), false, false, isEpdError, canSeeNotes, canSeeBroadcastChats, false);
        }
        return AbstractC35240FgZ.A02(enumC81843l3, "http", errorMessage, clientFacingErrorMessage, errorCode, statusCode, isEpdError, canSeeNotes, canSeeBroadcastChats);
    }
}
