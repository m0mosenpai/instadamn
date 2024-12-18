package X;

import com.facebook.graphql.enums.EnumHelper;

/* renamed from: X.KdT, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public enum EnumC46251KdT {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    SHARE("SHARE"),
    REPLY("REPLY"),
    REACT("REACT"),
    MENTION("MENTION");

    public final String A00;

    public static EnumC46251KdT A00(String str) {
        return (EnumC46251KdT) EnumHelper.A00(str, UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    EnumC46251KdT(String str) {
        this.A00 = str;
    }
}
