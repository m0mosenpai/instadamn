package X;

/* renamed from: X.85A, reason: invalid class name */
/* loaded from: classes4.dex */
public enum C85A {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    DIRECT("DIRECT"),
    DIRECT_POSTCAPTURE("DIRECT_POSTCAPTURE"),
    DIRECT_RTC("DIRECT_RTC"),
    LIVE("LIVE"),
    REELS("REELS"),
    REELS_POSTCAPTURE("REELS_POSTCAPTURE"),
    STORIES("STORIES"),
    STORIES_POSTCAPTURE("STORIES_POSTCAPTURE"),
    THREADS("THREADS");

    public final String A00;

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    C85A(String str) {
        this.A00 = str;
    }
}
