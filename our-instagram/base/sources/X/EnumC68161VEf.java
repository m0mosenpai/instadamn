package X;

import com.facebookpay.offsite.models.message.OffsiteShippingType$Companion;

/* renamed from: X.VEf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public enum EnumC68161VEf {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    DELIVERY(OffsiteShippingType$Companion.DELIVERY),
    /* JADX INFO: Fake field, exist only in values array */
    PICKUP("PICKUP"),
    /* JADX INFO: Fake field, exist only in values array */
    SHIPPING("SHIPPING");

    public final String A00;

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    EnumC68161VEf(String str) {
        this.A00 = str;
    }
}
