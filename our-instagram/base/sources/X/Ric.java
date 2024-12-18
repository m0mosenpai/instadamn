package X;

/* loaded from: classes10.dex */
public enum Ric implements InterfaceC02530Ab {
    /* JADX INFO: Fake field, exist only in values array */
    AUTH_FINISHED("auth_finished"),
    /* JADX INFO: Fake field, exist only in values array */
    DISCLOSURE_ACCEPT("disclosure_accept"),
    /* JADX INFO: Fake field, exist only in values array */
    DISCLOSURE_SHOWN("disclosure_shown"),
    END_AUTH_FLOW("end_auth_flow"),
    END_CODE_EXCHANGE("end_code_exchange"),
    END_GET_AUTH_URL("end_get_auth_url"),
    END_REFRESH_TOKEN("end_refresh_token"),
    SDK_INIT("sdk_init"),
    START_AUTH_FLOW("start_auth_flow"),
    START_CODE_EXCHANGE("start_code_exchange"),
    START_GET_AUTH_URL("start_get_auth_url"),
    START_REFRESH_TOKEN("start_refresh_token"),
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN("unknown"),
    /* JADX INFO: Fake field, exist only in values array */
    UI_IMPRESSION("ui_impression");

    public final String A00;

    @Override // X.InterfaceC02530Ab
    public final /* bridge */ /* synthetic */ Object getValue() {
        return this.A00;
    }

    Ric(String str) {
        this.A00 = str;
    }
}
