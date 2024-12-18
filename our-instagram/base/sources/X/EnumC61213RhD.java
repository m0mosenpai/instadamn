package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.RhD, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public enum EnumC61213RhD {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    NONE(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED),
    TAR_BROTLI("TAR_BROTLI"),
    TAR_LZMA2("TAR_LZMA2"),
    /* JADX INFO: Fake field, exist only in values array */
    ZIP("ZIP");

    public final String A00;

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    EnumC61213RhD(String str) {
        this.A00 = str;
    }
}
