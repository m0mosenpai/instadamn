package X;

/* renamed from: X.160, reason: invalid class name */
/* loaded from: classes.dex */
public enum AnonymousClass160 {
    AUTO_CLOSE_TARGET(true),
    AUTO_CLOSE_JSON_CONTENT(true),
    FLUSH_PASSED_TO_STREAM(true),
    QUOTE_FIELD_NAMES(true),
    QUOTE_NON_NUMERIC_NUMBERS(true),
    ESCAPE_NON_ASCII(false),
    WRITE_NUMBERS_AS_STRINGS(false),
    WRITE_BIGDECIMAL_AS_PLAIN(false),
    STRICT_DUPLICATE_DETECTION(false),
    /* JADX INFO: Fake field, exist only in values array */
    IGNORE_UNKNOWN(false);

    public final int A00 = 1 << ordinal();
    public final boolean A01;

    AnonymousClass160(boolean z) {
        this.A01 = z;
    }
}
