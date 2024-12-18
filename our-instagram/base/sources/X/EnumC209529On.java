package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.9On, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public enum EnumC209529On {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    NONE(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED),
    TAR_BROTLI("TAR_BROTLI"),
    /* JADX INFO: Fake field, exist only in values array */
    TAR_LZMA2("TAR_LZMA2");

    public final String A00;

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    EnumC209529On(String str) {
        this.A00 = str;
    }
}
