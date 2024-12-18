package X;

/* loaded from: classes11.dex */
public enum VFH {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    APPEND("APPEND"),
    /* JADX INFO: Fake field, exist only in values array */
    INTERRUPT_AT_BREAKPOINT("INTERRUPT_AT_BREAKPOINT"),
    /* JADX INFO: Fake field, exist only in values array */
    QUEUE_DURATION_BASED("QUEUE_DURATION_BASED"),
    /* JADX INFO: Fake field, exist only in values array */
    QUEUE_FLUSH_APPEND("QUEUE_FLUSH_APPEND");

    public final String A00;

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    VFH(String str) {
        this.A00 = str;
    }
}
