package X;

/* renamed from: X.KdF, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public enum EnumC46239KdF {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    DOES_NOT_REQUIRE_MIGRATION("DOES_NOT_REQUIRE_MIGRATION"),
    REQUIRES_MIGRATION("REQUIRES_MIGRATION"),
    REQUIRES_PIN_RESET_FOR_NORMALIZATION("REQUIRES_PIN_RESET_FOR_NORMALIZATION"),
    /* JADX INFO: Fake field, exist only in values array */
    REQUIRES_PIN_RESET_FOR_PIN_NOT_REGISTERED("REQUIRES_PIN_RESET_FOR_PIN_NOT_REGISTERED");

    public final String A00;

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    EnumC46239KdF(String str) {
        this.A00 = str;
    }
}
