package X;

import java.util.List;

/* renamed from: X.9CS, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9CS extends C0T6 {
    public final int A00;
    public final int A01;
    public final long A02;
    public final Object A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;

    public C9CS(String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, int i, int i2, long j) {
        this.A00 = i2;
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 2);
        C14360o3.A0B(str3, 3);
        C14360o3.A0B(str4, 4);
        C14360o3.A0B(str5, 5);
        C14360o3.A0B(list, 7);
        C14360o3.A0B(str6, 9);
        C14360o3.A0B(str7, 10);
        if (i2 != 0) {
            this.A09 = str;
            this.A05 = str2;
            this.A06 = str3;
            this.A04 = str4;
            this.A07 = str5;
            this.A01 = i;
            this.A03 = list;
            this.A02 = j;
            this.A0A = str6;
            this.A08 = str7;
            return;
        }
        this.A0A = str;
        this.A07 = str2;
        this.A08 = str3;
        this.A05 = str4;
        this.A09 = str5;
        this.A01 = i;
        this.A03 = list;
        this.A02 = j;
        this.A06 = str6;
        this.A04 = str7;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (this.A00 != 0) {
            if (this != obj) {
                if (obj instanceof C9CS) {
                    C9CS c9cs = (C9CS) obj;
                    if (c9cs.A00 == 1 && C14360o3.A0K(this.A09, c9cs.A09) && C14360o3.A0K(this.A05, c9cs.A05) && C14360o3.A0K(this.A06, c9cs.A06) && C14360o3.A0K(this.A04, c9cs.A04) && C14360o3.A0K(this.A07, c9cs.A07) && this.A01 == c9cs.A01 && C14360o3.A0K(this.A03, c9cs.A03) && this.A02 == c9cs.A02 && C14360o3.A0K(this.A0A, c9cs.A0A)) {
                        str = this.A08;
                        str2 = c9cs.A08;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else if (this != obj) {
            if (!(obj instanceof C9CS)) {
                return false;
            }
            C9CS c9cs2 = (C9CS) obj;
            if (c9cs2.A00 != 0 || !C14360o3.A0K(this.A0A, c9cs2.A0A) || !C14360o3.A0K(this.A07, c9cs2.A07) || !C14360o3.A0K(this.A08, c9cs2.A08) || !C14360o3.A0K(this.A05, c9cs2.A05) || !C14360o3.A0K(this.A09, c9cs2.A09) || this.A01 != c9cs2.A01 || !C14360o3.A0K(this.A03, c9cs2.A03) || this.A02 != c9cs2.A02 || !C14360o3.A0K(this.A06, c9cs2.A06)) {
                return false;
            }
            str = this.A04;
            str2 = c9cs2.A04;
        } else {
            return true;
        }
        if (!C14360o3.A0K(str, str2)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        String str;
        if (this.A00 != 0) {
            int hashCode2 = ((((((((((((this.A09.hashCode() * 31) + this.A05.hashCode()) * 31) + this.A06.hashCode()) * 31) + this.A04.hashCode()) * 31) + this.A07.hashCode()) * 31) + this.A01) * 31) + this.A03.hashCode()) * 31;
            long j = this.A02;
            hashCode = (((hashCode2 + ((int) (j ^ (j >>> 32)))) * 31) + this.A0A.hashCode()) * 31;
            str = this.A08;
        } else {
            int hashCode3 = ((((((((((((this.A0A.hashCode() * 31) + this.A07.hashCode()) * 31) + this.A08.hashCode()) * 31) + this.A05.hashCode()) * 31) + this.A09.hashCode()) * 31) + this.A01) * 31) + this.A03.hashCode()) * 31;
            long j2 = this.A02;
            hashCode = (((hashCode3 + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.A06.hashCode()) * 31;
            str = this.A04;
        }
        return hashCode + str.hashCode();
    }

    public final String toString() {
        StringBuilder sb;
        String str;
        if (this.A00 != 0) {
            sb = new StringBuilder();
            sb.append("XoutRealtimeInfo(signalId=");
            sb.append(this.A09);
            sb.append(", containerModule=");
            sb.append(this.A05);
            sb.append(", inventorySource=");
            sb.append(this.A06);
            sb.append(", authorId=");
            sb.append(this.A04);
            sb.append(", itemId=");
            sb.append(this.A07);
            sb.append(", itemType=");
            sb.append(this.A01);
            sb.append(", mediaIds=");
            sb.append(this.A03);
            sb.append(AbstractC111324zv.A00(581));
            sb.append(this.A02);
            sb.append(AbstractC111324zv.A00(580));
            sb.append(this.A0A);
            sb.append(", reason=");
            str = this.A08;
        } else {
            sb = new StringBuilder();
            sb.append("ProfileTapRealtimeInfo(signalId=");
            sb.append(this.A0A);
            sb.append(", containerModule=");
            sb.append(this.A07);
            sb.append(", inventorySource=");
            sb.append(this.A08);
            sb.append(", authorId=");
            sb.append(this.A05);
            sb.append(", itemId=");
            sb.append(this.A09);
            sb.append(", itemType=");
            sb.append(this.A01);
            sb.append(", mediaIds=");
            sb.append(this.A03);
            sb.append(", clickTimestamp=");
            sb.append(this.A02);
            sb.append(", clickMediaId=");
            sb.append(this.A06);
            sb.append(AbstractC111324zv.A00(52));
            str = this.A04;
        }
        sb.append(str);
        sb.append(')');
        return sb.toString();
    }
}
