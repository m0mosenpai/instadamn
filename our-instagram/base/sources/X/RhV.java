package X;

/* loaded from: classes10.dex */
public enum RhV {
    NO_ERROR(0),
    UNKNOWN(1),
    API_DISABLED(2),
    ILLEGAL_ARGUMENT(3),
    ILLEGAL_STATE(4),
    INTERNAL_ERROR(5),
    NETWORK_FAILURE(6),
    UNKNOWN_APP_VERSION(7),
    UNKNOWN_MODULES(8),
    /* JADX INFO: Fake field, exist only in values array */
    DOWNLOAD_FAILURE(9);

    public final int A00;

    RhV(int i) {
        this.A00 = i;
    }

    public static void A00(int i) {
        for (RhV rhV : values()) {
            if (rhV.A00 == i) {
                return;
            }
        }
        C0K8.A09(RhV.class, "Invalid Reason: %d", AbstractC25228BEl.A1Y(i));
    }
}
