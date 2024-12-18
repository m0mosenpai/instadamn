package X;

/* loaded from: classes10.dex */
public enum Rg1 {
    RESPONSE_CODE_UNSPECIFIED(-999),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_TIMEOUT(-3),
    /* JADX INFO: Fake field, exist only in values array */
    FEATURE_NOT_SUPPORTED(-2),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_DISCONNECTED(-1),
    /* JADX INFO: Fake field, exist only in values array */
    OK(0),
    /* JADX INFO: Fake field, exist only in values array */
    USER_CANCELED(1),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_UNAVAILABLE(2),
    /* JADX INFO: Fake field, exist only in values array */
    BILLING_UNAVAILABLE(3),
    /* JADX INFO: Fake field, exist only in values array */
    ITEM_UNAVAILABLE(4),
    /* JADX INFO: Fake field, exist only in values array */
    DEVELOPER_ERROR(5),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR(6),
    /* JADX INFO: Fake field, exist only in values array */
    ITEM_ALREADY_OWNED(7),
    /* JADX INFO: Fake field, exist only in values array */
    ITEM_NOT_OWNED(8),
    /* JADX INFO: Fake field, exist only in values array */
    EXPIRED_OFFER_TOKEN(11),
    /* JADX INFO: Fake field, exist only in values array */
    NETWORK_ERROR(12);

    public static final C64775TTj A01;
    public final int A00;

    static {
        C62729SNt c62729SNt = new C62729SNt();
        for (Rg1 rg1 : values()) {
            c62729SNt.A01(Integer.valueOf(rg1.A00), rg1);
        }
        A01 = c62729SNt.A00();
    }

    public static Rg1 A00(int i) {
        C64775TTj c64775TTj = A01;
        Integer valueOf = Integer.valueOf(i);
        if (!c64775TTj.containsKey(valueOf)) {
            return RESPONSE_CODE_UNSPECIFIED;
        }
        return (Rg1) c64775TTj.get(valueOf);
    }

    Rg1(int i) {
        this.A00 = i;
    }
}
