package X;

import com.instagram.realtimeclient.GraphQLSubscriptionID;

/* loaded from: classes11.dex */
public enum VF7 {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    DEFAULT(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT),
    /* JADX INFO: Fake field, exist only in values array */
    DEFAULT_OUTLINES("default_outlines"),
    /* JADX INFO: Fake field, exist only in values array */
    DISABLED("disabled"),
    /* JADX INFO: Fake field, exist only in values array */
    FROSTED("frosted"),
    /* JADX INFO: Fake field, exist only in values array */
    INVERTED("inverted"),
    /* JADX INFO: Fake field, exist only in values array */
    INVERTED_OUTLINES("inverted_outlines");

    public final String A00;

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    VF7(String str) {
        this.A00 = str;
    }
}
