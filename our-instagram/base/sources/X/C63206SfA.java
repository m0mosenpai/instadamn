package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.SfA, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63206SfA {
    public final int A00;
    public final Integer A01;
    public final List A02;
    public static final C63206SfA A08 = A00(C05F.A00);
    public static final C63206SfA A0C = A00(C05F.A01);
    public static final C63206SfA A0B = A00(C05F.A0C);
    public static final C63206SfA A09 = A00(C05F.A0N);
    public static final C63206SfA A07 = A00(C05F.A0Y);
    public static final C63206SfA A0D = A00(C05F.A15);
    public static final C63206SfA A05 = A00(C05F.A1F);
    public static final C63206SfA A0A = A00(C05F.A1I);
    public static final C63206SfA A04 = A00(C05F.A02);
    public static final C63206SfA A03 = A00(C05F.A03);
    public static final C63206SfA A06 = A00(C05F.A05);

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this != obj) {
            Class<?> cls2 = getClass();
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (C14360o3.A0K(cls2, cls)) {
                C14360o3.A0C(obj, "null cannot be cast to non-null type com.facebook.wearable.datax.Error");
                if (this.A00 != ((C63206SfA) obj).A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A00 + 7;
    }

    public final String toString() {
        String str;
        String A0z = AbstractC166997dE.A0z("%04x", Arrays.copyOf(AbstractC25228BEl.A1Y(this.A00), 1));
        int intValue = this.A01.intValue();
        if (intValue != 15) {
            if (intValue != 5) {
                switch (intValue) {
                    case 1:
                        str = "SERVICE_NOT_FOUND";
                        break;
                    case 2:
                        str = "SERVICE_LOST";
                        break;
                    case 3:
                        str = "OUT_OF_CHANNELS";
                        break;
                    case 4:
                        str = "INTERNAL_ERROR";
                        break;
                    case 5:
                    default:
                        str = "OK";
                        break;
                    case 6:
                        str = "CHANNEL_CLOSED";
                        break;
                    case 7:
                        str = "UNKNOWN_TYPE";
                        break;
                    case 8:
                        str = "DEPRECATED_TYPE";
                        break;
                    case 9:
                        str = "REMOVED_TYPE";
                        break;
                    case 10:
                        str = "BAD_TYPE";
                        break;
                    case 11:
                        str = "BAD_REQUEST";
                        break;
                    case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                        str = "SERIALIZE_FAILED";
                        break;
                    case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                        str = "DESERIALIZE_FAILED";
                        break;
                    case 14:
                        str = "WRITE_WOULD_BLOCK";
                        break;
                }
            } else {
                str = "Message is too long. DataX cannot send messages longer than 16383 bytes. Try fragmenting your data into more messages, for example if you're sending a list of contacts then send each contact in a separate message instead of all in one big list.";
            }
        } else {
            str = "This code doesn't match to a known error type, please reach out to the connectivityteam or the owners of the service you are trying to communicate with on the deviceteam to figure out what this code means.";
        }
        return AnonymousClass001.A0v("Error(0x", A0z, ": ", str, ')');
    }

    public C63206SfA(int i) {
        Integer num;
        this.A00 = i;
        Integer[] A00 = C05F.A00(16);
        int length = A00.length;
        int i2 = 0;
        while (true) {
            if (i2 < length) {
                num = A00[i2];
                if (this.A00 == AbstractC62180S1b.A00(num)) {
                    break;
                } else {
                    i2++;
                }
            } else {
                num = C05F.A07;
                break;
            }
        }
        this.A01 = num;
        this.A02 = AbstractC16960so.A1Q(A0C, A0B, A09);
        int i3 = this.A00;
        if (i3 >= 0 && i3 <= 65535) {
        } else {
            throw AbstractC166987dD.A14(AnonymousClass001.A03(i3, " must be unsigned 16bit"));
        }
    }

    public static C63206SfA A00(Integer num) {
        return new C63206SfA(AbstractC62180S1b.A00(num));
    }
}
