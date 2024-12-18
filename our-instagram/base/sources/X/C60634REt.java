package X;

import java.util.Arrays;

/* renamed from: X.REt, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60634REt extends S2B {
    public final long A00;
    public final long A01;
    public final long A02;
    public final S2D A03;
    public final Integer A04;
    public final String A05;
    public final byte[] A06;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof S2B)) {
                return false;
            }
            C60634REt c60634REt = (C60634REt) ((S2B) obj);
            if (this.A00 == c60634REt.A00) {
                Integer num = this.A04;
                Integer num2 = c60634REt.A04;
                if (num == null) {
                    if (num2 != null) {
                        return false;
                    }
                } else if (!num.equals(num2)) {
                    return false;
                }
                if (this.A01 == c60634REt.A01 && Arrays.equals(this.A06, c60634REt.A06)) {
                    String str = this.A05;
                    String str2 = c60634REt.A05;
                    if (str == null) {
                        if (str2 != null) {
                            return false;
                        }
                    } else if (!str.equals(str2)) {
                        return false;
                    }
                    if (this.A02 == c60634REt.A02) {
                        S2D s2d = this.A03;
                        S2D s2d2 = c60634REt.A03;
                        if (s2d != null) {
                            return s2d.equals(s2d2);
                        }
                        if (s2d2 != null) {
                            return false;
                        }
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A00;
        int A0M = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ AbstractC167017dG.A0M(this.A04)) * 1000003;
        long j2 = this.A01;
        int hashCode = (((((A0M ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.A06)) * 1000003) ^ AbstractC167017dG.A0O(this.A05)) * 1000003;
        long j3 = this.A02;
        return ((hashCode ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ AbstractC166997dE.A0I(this.A03);
    }

    public C60634REt(S2D s2d, Integer num, String str, byte[] bArr, long j, long j2, long j3) {
        this.A00 = j;
        this.A04 = num;
        this.A01 = j2;
        this.A06 = bArr;
        this.A05 = str;
        this.A02 = j3;
        this.A03 = s2d;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("LogEvent{eventTimeMs=");
        A1C.append(this.A00);
        A1C.append(", eventCode=");
        A1C.append(this.A04);
        A1C.append(", eventUptimeMs=");
        A1C.append(this.A01);
        A1C.append(", sourceExtension=");
        A1C.append(Arrays.toString(this.A06));
        A1C.append(", sourceExtensionJsonProto3=");
        A1C.append(this.A05);
        A1C.append(", timezoneOffsetSeconds=");
        A1C.append(this.A02);
        A1C.append(", networkConnectionInfo=");
        return JQ0.A0l(this.A03, A1C);
    }
}
