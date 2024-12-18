package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.9By, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C206419By extends C0T6 {
    public long A00;
    public Object A01;
    public String A02;
    public final int A03;

    public C206419By(ImageUrl imageUrl, String str, long j) {
        this.A03 = 1;
        C14360o3.A0B(str, 2);
        this.A00 = j;
        this.A02 = str;
        this.A01 = imageUrl;
    }

    public final boolean equals(Object obj) {
        if (this.A03 != 0) {
            if (this != obj) {
                if (obj instanceof C206419By) {
                    C206419By c206419By = (C206419By) obj;
                    if (c206419By.A03 != 1 || this.A00 != c206419By.A00 || !C14360o3.A0K(this.A02, c206419By.A02) || !C14360o3.A0K(this.A01, c206419By.A01)) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return true;
        }
        if (this != obj) {
            if (!(obj instanceof C206419By)) {
                return false;
            }
            C206419By c206419By2 = (C206419By) obj;
            if (c206419By2.A03 != 0 || !C14360o3.A0K(this.A02, c206419By2.A02) || this.A01 != c206419By2.A01 || this.A00 != c206419By2.A00) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        String str;
        int hashCode2;
        int i;
        if (this.A03 != 0) {
            long j = this.A00;
            hashCode2 = ((((int) (j ^ (j >>> 32))) * 31) + this.A02.hashCode()) * 31;
            Object obj = this.A01;
            if (obj == null) {
                i = 0;
            } else {
                i = obj.hashCode();
            }
        } else {
            String str2 = this.A02;
            if (str2 == null) {
                hashCode = 0;
            } else {
                hashCode = str2.hashCode();
            }
            int i2 = hashCode * 31;
            int intValue = ((Number) this.A01).intValue();
            switch (intValue) {
                case 1:
                    str = "UNSET";
                    break;
                case 2:
                    str = "PRIORITY";
                    break;
                case 3:
                    str = "AD_INQUIRY";
                    break;
                case 4:
                    str = "APPOINTMENT_BOOKED";
                    break;
                case 5:
                    str = "ORDER_PLACED";
                    break;
                case 6:
                    str = "PAYMENT_RECEIVED";
                    break;
                case 7:
                    str = "ORDER_SHIPPED";
                    break;
                case 8:
                    str = "APPOINTMENT_REQUESTED";
                    break;
                case 9:
                    str = "HIGH_INTENT";
                    break;
                case 10:
                    str = "LEAD";
                    break;
                case 11:
                    str = "IMPORTANT";
                    break;
                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                    str = "FOLLOW_UP";
                    break;
                case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                    str = "DETECTED_ORDER";
                    break;
                case 14:
                    str = "DETECTED_LEAD";
                    break;
                default:
                    str = "UNKNOWN";
                    break;
            }
            hashCode2 = (i2 + str.hashCode() + intValue) * 31;
            long j2 = this.A00;
            i = (int) (j2 ^ (j2 >>> 32));
        }
        return hashCode2 + i;
    }

    public final String toString() {
        if (this.A03 != 0) {
            return super.toString();
        }
        return String.valueOf(AbstractC46786Kmh.A00((Integer) this.A01));
    }

    public C206419By() {
        this.A03 = 0;
        this.A03 = 0;
        Integer num = C05F.A00;
        this.A03 = 0;
        this.A02 = null;
        this.A01 = num;
        this.A00 = 0L;
    }
}
