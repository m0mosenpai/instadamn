package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.NhI, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public enum EnumC53280NhI {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    NONE(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED),
    /* JADX INFO: Fake field, exist only in values array */
    TAR_BROTLI("TAR_BROTLI"),
    /* JADX INFO: Fake field, exist only in values array */
    TAR_LZMA2("TAR_LZMA2"),
    /* JADX INFO: Fake field, exist only in values array */
    ZIP("ZIP");

    public final String A00;

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    EnumC53280NhI(String str) {
        this.A00 = str;
    }
}
