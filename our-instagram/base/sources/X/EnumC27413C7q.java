package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.C7q, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public enum EnumC27413C7q {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    DARK("DARK"),
    /* JADX INFO: Fake field, exist only in values array */
    NONE(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED),
    /* JADX INFO: Fake field, exist only in values array */
    NORMAL("NORMAL");

    public final String A00;

    EnumC27413C7q(String str) {
        this.A00 = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }
}
