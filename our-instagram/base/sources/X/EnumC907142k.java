package X;

/* renamed from: X.42k, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC907142k implements InterfaceC02530Ab {
    CLIENT_SEND_REQUEST("client_send_request"),
    CLIENT_RECEIVE_RESPONSE_NULL("client_receive_response_null"),
    /* JADX INFO: Fake field, exist only in values array */
    CLIENT_RECEIVE_RESPONSE_LAUNCH_FLOW("client_receive_response_launch_flow"),
    CLIENT_ERROR("client_error"),
    CLIENT_FLOW_LAUNCH("client_flow_launch"),
    /* JADX INFO: Fake field, exist only in values array */
    CLIENT_REACT_NATIVE_FLOW_LAUNCH("client_react_native_flow_launch"),
    /* JADX INFO: Fake field, exist only in values array */
    SERVER_NULL_RESPONSE("server_null_response"),
    /* JADX INFO: Fake field, exist only in values array */
    SERVER_LAUNCH_FLOW_RESPONSE("server_launch_flow_response"),
    /* JADX INFO: Fake field, exist only in values array */
    SERVER_ELIGIBILITY_RESPONSE("server_eligibility_response");

    public final String A00;

    @Override // X.InterfaceC02530Ab
    public final /* bridge */ /* synthetic */ Object getValue() {
        return this.A00;
    }

    EnumC907142k(String str) {
        this.A00 = str;
    }
}
