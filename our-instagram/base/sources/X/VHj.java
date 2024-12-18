package X;

/* loaded from: classes11.dex */
public enum VHj implements InterfaceC02530Ab {
    ENTERED("entered"),
    LIST_FETCH_STARTED("list_fetch_started"),
    LIST_FETCHED_SUCESSS("list_fetched_success"),
    LIST_FETCHED_FAILED("list_fetched_failed"),
    HOST_SELECTED("host_selected"),
    HOST_VERIFICATION_STARTED("host_verification_started"),
    HOST_VERIFICATION_SUCESS("host_verification_success"),
    HOST_VERIFICATION_FAILED("host_verification_failed"),
    EXITED("exited");

    public final String A00;

    @Override // X.InterfaceC02530Ab
    public final /* bridge */ /* synthetic */ Object getValue() {
        return this.A00;
    }

    VHj(String str) {
        this.A00 = str;
    }
}
