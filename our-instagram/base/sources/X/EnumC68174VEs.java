package X;

import com.facebookpay.offsite.models.message.MessageAvailabilityResponseId$Companion;

/* renamed from: X.VEs, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public enum EnumC68174VEs {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    AVAILABLE(MessageAvailabilityResponseId$Companion.AVAILABLE),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR("ERROR"),
    /* JADX INFO: Fake field, exist only in values array */
    EXPIRED("EXPIRED"),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_ENOUGH_REACH("NOT_ENOUGH_REACH"),
    /* JADX INFO: Fake field, exist only in values array */
    OLD_POST("OLD_POST"),
    /* JADX INFO: Fake field, exist only in values array */
    UNTRACKED("UNTRACKED");

    public final String A00;

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    EnumC68174VEs(String str) {
        this.A00 = str;
    }
}
