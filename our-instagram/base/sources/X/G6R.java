package X;

import com.instagram.realtimeclient.DirectRealtimePayload;

/* loaded from: classes6.dex */
public final class G6R implements InterfaceC37119GXe {
    @Override // X.InterfaceC37119GXe
    public final C114675Fx AWh(InterfaceC40821up interfaceC40821up, String str) {
        C32207EDg c32207EDg;
        DirectRealtimePayload directRealtimePayload;
        int statusCode = interfaceC40821up.getStatusCode();
        String errorMessage = interfaceC40821up.getErrorMessage();
        String clientFacingErrorMessage = interfaceC40821up.getClientFacingErrorMessage();
        boolean isEpdError = interfaceC40821up.isEpdError();
        EnumC81843l3 enumC81843l3 = null;
        if ((interfaceC40821up instanceof C32207EDg) && (c32207EDg = (C32207EDg) interfaceC40821up) != null && (directRealtimePayload = c32207EDg.A00) != null) {
            enumC81843l3 = directRealtimePayload.throttlingType;
        }
        return AbstractC35240FgZ.A02(enumC81843l3, "http", errorMessage, clientFacingErrorMessage, interfaceC40821up.getErrorCode(), statusCode, isEpdError, interfaceC40821up.getCanSeeNotes(), interfaceC40821up.getCanSeeBroadcastChats());
    }
}
