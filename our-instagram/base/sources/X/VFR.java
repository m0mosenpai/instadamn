package X;

/* loaded from: classes11.dex */
public enum VFR {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    COMPLETED("COMPLETED"),
    /* JADX INFO: Fake field, exist only in values array */
    FAILED("FAILED"),
    /* JADX INFO: Fake field, exist only in values array */
    PENDING("PENDING"),
    /* JADX INFO: Fake field, exist only in values array */
    PENDING_WITH_PROVIDER("PENDING_WITH_PROVIDER"),
    /* JADX INFO: Fake field, exist only in values array */
    REJECTED_AFTER_SETTLED("REJECTED_AFTER_SETTLED"),
    /* JADX INFO: Fake field, exist only in values array */
    REJECTED_BEFORE_SETTLED("REJECTED_BEFORE_SETTLED"),
    SETTLED("SETTLED"),
    /* JADX INFO: Fake field, exist only in values array */
    VOIDED("VOIDED");

    public final String A00;

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    VFR(String str) {
        this.A00 = str;
    }
}
