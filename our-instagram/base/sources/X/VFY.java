package X;

/* loaded from: classes11.dex */
public enum VFY {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    CAN_OPT_IN("CAN_OPT_IN"),
    /* JADX INFO: Fake field, exist only in values array */
    CAN_OPT_IN_NO_MEDIA("CAN_OPT_IN_NO_MEDIA"),
    /* JADX INFO: Fake field, exist only in values array */
    DISABLED("DISABLED"),
    OPTED_IN("OPTED_IN"),
    /* JADX INFO: Fake field, exist only in values array */
    OPTED_IN_UNACKNOWLEDGED("OPTED_IN_UNACKNOWLEDGED"),
    /* JADX INFO: Fake field, exist only in values array */
    OPTED_OUT("OPTED_OUT");

    public final String A00;

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    VFY(String str) {
        this.A00 = str;
    }
}
