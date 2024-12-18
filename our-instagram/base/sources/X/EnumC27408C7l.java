package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.C7l, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public enum EnumC27408C7l {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    DECLINE_TO_STATE("DECLINE_TO_STATE"),
    /* JADX INFO: Fake field, exist only in values array */
    DISABILITY("DISABILITY"),
    /* JADX INFO: Fake field, exist only in values array */
    ETHNIC_MINORITY("ETHNIC_MINORITY"),
    /* JADX INFO: Fake field, exist only in values array */
    LGBTQ("LGBTQ"),
    /* JADX INFO: Fake field, exist only in values array */
    NONE(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED),
    /* JADX INFO: Fake field, exist only in values array */
    VETERAN("VETERAN"),
    /* JADX INFO: Fake field, exist only in values array */
    WOMAN("WOMAN");

    public final String A00;

    EnumC27408C7l(String str) {
        this.A00 = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }
}
