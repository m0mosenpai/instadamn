package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.C7o, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public enum EnumC27411C7o {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    FACEPILE("facepile"),
    /* JADX INFO: Fake field, exist only in values array */
    SUGGESTED_PROMPT("suggested_prompt"),
    /* JADX INFO: Fake field, exist only in values array */
    USER(PublicKeyCredentialControllerUtility.JSON_KEY_USER);

    public final String A00;

    EnumC27411C7o(String str) {
        this.A00 = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }
}
