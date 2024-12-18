package X;

/* loaded from: classes5.dex */
public enum C85 {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    AUDIO("AUDIO"),
    FLASH_IMAGE("FLASH_IMAGE"),
    FLASH_RECAP_VIDEO("FLASH_RECAP_VIDEO"),
    GIF("GIF"),
    IMAGE("IMAGE"),
    REEL("REEL"),
    STICKER("STICKER"),
    UPLOADED_IMAGE("UPLOADED_IMAGE"),
    /* JADX INFO: Fake field, exist only in values array */
    VIDEO("VIDEO");

    public final String A00;

    C85(String str) {
        this.A00 = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }
}
