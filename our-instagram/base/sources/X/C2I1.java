package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.2I1, reason: invalid class name */
/* loaded from: classes.dex */
public enum C2I1 {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    FAILURE("FAILURE"),
    NONE(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED),
    /* JADX INFO: Fake field, exist only in values array */
    PARTIAL("PARTIAL"),
    SKIPPED("SKIPPED"),
    SUCCESS("SUCCESS");

    public final String A00;

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    C2I1(String str) {
        this.A00 = str;
    }
}
