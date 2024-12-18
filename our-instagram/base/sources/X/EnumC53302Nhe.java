package X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;

/* renamed from: X.Nhe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public enum EnumC53302Nhe {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    FAILURE(OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_FAILURE),
    SUCCESS("success");

    public final String A00;

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    EnumC53302Nhe(String str) {
        this.A00 = str;
    }
}
