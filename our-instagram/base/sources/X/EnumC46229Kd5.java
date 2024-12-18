package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.Kd5, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public enum EnumC46229Kd5 {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    FIRST_TIME_BONUS("FIRST_TIME_BONUS"),
    /* JADX INFO: Fake field, exist only in values array */
    FIVE_GIFTS_SEND_BONUS("FIVE_GIFTS_SEND_BONUS"),
    /* JADX INFO: Fake field, exist only in values array */
    NONE(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED);

    public final String A00;

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    EnumC46229Kd5(String str) {
        this.A00 = str;
    }
}
