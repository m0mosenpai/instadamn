package X;

import com.instagram.realtimeclient.GraphQLSubscriptionID;

/* loaded from: classes11.dex */
public enum VFC {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    CONTAINS("contains"),
    /* JADX INFO: Fake field, exist only in values array */
    DEFAULT(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT),
    /* JADX INFO: Fake field, exist only in values array */
    MIX("mix"),
    /* JADX INFO: Fake field, exist only in values array */
    WITH_SOUND_EFFECTS("with_sound_effects");

    public final String A00;

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    VFC(String str) {
        this.A00 = str;
    }
}
