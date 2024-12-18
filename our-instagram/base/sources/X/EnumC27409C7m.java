package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.C7m, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public enum EnumC27409C7m {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    AMERICAN_INDIAN_OR_ALASKA_NATIVE("AMERICAN_INDIAN_OR_ALASKA_NATIVE"),
    /* JADX INFO: Fake field, exist only in values array */
    ASIAN("ASIAN"),
    /* JADX INFO: Fake field, exist only in values array */
    BLACK_OR_AFRICAN_AMERICAN("BLACK_OR_AFRICAN_AMERICAN"),
    /* JADX INFO: Fake field, exist only in values array */
    DECLINE_TO_STATE("DECLINE_TO_STATE"),
    /* JADX INFO: Fake field, exist only in values array */
    HISPANIC("HISPANIC"),
    /* JADX INFO: Fake field, exist only in values array */
    MIDDLE_EASTERN("MIDDLE_EASTERN"),
    /* JADX INFO: Fake field, exist only in values array */
    NATIVE_HAWAII_OR_OTHER_PACIFIC_ISLANDER("NATIVE_HAWAII_OR_OTHER_PACIFIC_ISLANDER"),
    /* JADX INFO: Fake field, exist only in values array */
    NONE(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED),
    /* JADX INFO: Fake field, exist only in values array */
    TWO_OR_MORE_RACES("TWO_OR_MORE_RACES");

    public final String A00;

    EnumC27409C7m(String str) {
        this.A00 = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }
}
