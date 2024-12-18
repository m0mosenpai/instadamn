package X;

/* loaded from: classes5.dex */
public enum C84 {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    ARCHIVED("ARCHIVED"),
    /* JADX INFO: Fake field, exist only in values array */
    DRAFT("DRAFT"),
    IN_REVIEW("IN_REVIEW"),
    /* JADX INFO: Fake field, exist only in values array */
    PREPARING("PREPARING"),
    PUBLISHED("PUBLISHED"),
    PUBLISHED_EDITS_DRAFT("PUBLISHED_EDITS_DRAFT"),
    PUBLISHED_EDITS_IN_REVIEW("PUBLISHED_EDITS_IN_REVIEW"),
    PUBLISHED_EDITS_REJECTED("PUBLISHED_EDITS_REJECTED"),
    /* JADX INFO: Fake field, exist only in values array */
    READY_TO_PUBLISH("READY_TO_PUBLISH"),
    /* JADX INFO: Fake field, exist only in values array */
    READY_TO_RELEASE("READY_TO_RELEASE"),
    REJECTED("REJECTED"),
    REQUIRES_CHANGES("REQUIRES_CHANGES"),
    /* JADX INFO: Fake field, exist only in values array */
    UNPUBLISHED("UNPUBLISHED");

    public final String A00;

    C84(String str) {
        this.A00 = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }
}
