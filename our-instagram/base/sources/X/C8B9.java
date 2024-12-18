package X;

/* renamed from: X.8B9, reason: invalid class name */
/* loaded from: classes4.dex */
public enum C8B9 {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    COLLECTIBLE("COLLECTIBLE"),
    MULTIMEDIA("MULTIMEDIA"),
    MULTI_PHOTO("MULTI_PHOTO"),
    MULTI_VIDEO("MULTI_VIDEO"),
    SINGLE_PHOTO("SINGLE_PHOTO"),
    SINGLE_VIDEO("SINGLE_VIDEO"),
    TEXT("TEXT"),
    UNSUPPORTED("UNSUPPORTED");

    public final String A00;

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    C8B9(String str) {
        this.A00 = str;
    }
}
