package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.Nhh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public enum EnumC53305Nhh {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    META_AI("META_AI"),
    /* JADX INFO: Fake field, exist only in values array */
    NONE(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED);

    public final String A00;

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    EnumC53305Nhh(String str) {
        this.A00 = str;
    }
}
