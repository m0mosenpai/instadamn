package X;

/* renamed from: X.KdL, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public enum EnumC46244KdL {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    BLOCK_STORE("BLOCK_STORE"),
    CLOUDKIT("CLOUDKIT"),
    GOOGLE_DRIVE("GOOGLE_DRIVE"),
    GOOGLE_ONE_AUTO_BACKUP("GOOGLE_ONE_AUTO_BACKUP"),
    HSM("HSM"),
    ICLOUD_DRIVE("ICLOUD_DRIVE"),
    ICLOUD_KEYCHAIN("ICLOUD_KEYCHAIN"),
    ICLOUD_KVS("ICLOUD_KVS"),
    KEYCHAIN("KEYCHAIN"),
    OFFLINE("OFFLINE"),
    PASSKEY("PASSKEY"),
    SECURITY_QUESTION_HSM("SECURITY_QUESTION_HSM"),
    /* JADX INFO: Fake field, exist only in values array */
    TRUSTED_CONTACT("TRUSTED_CONTACT");

    public final String A00;

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    EnumC46244KdL(String str) {
        this.A00 = str;
    }
}
