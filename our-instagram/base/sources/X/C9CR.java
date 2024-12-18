package X;

import java.util.List;

/* renamed from: X.9CR, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9CR extends C0T6 {
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
    public final boolean A0A;

    public C9CR(String str, String str2, String str3, String str4, String str5, String str6, List list, int i, int i2, long j, boolean z) {
        this.A00 = i2;
        C14360o3.A0B(str, 2);
        C14360o3.A0B(str2, 3);
        C14360o3.A0B(str3, 4);
        C14360o3.A0B(str4, 5);
        C14360o3.A0B(list, 7);
        C14360o3.A0B(str5, 9);
        C14360o3.A0B(str6, 10);
        this.A0A = z;
        this.A08 = str;
        this.A05 = str2;
        this.A06 = str3;
        this.A07 = str4;
        this.A01 = i;
        this.A03 = list;
        this.A02 = j;
        this.A04 = str5;
        this.A09 = str6;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this.A00 != 0) {
            if (this != obj) {
                i = 1;
            } else {
                return true;
            }
        } else if (this != obj) {
            i = 0;
        } else {
            return true;
        }
        if (obj instanceof C9CR) {
            C9CR c9cr = (C9CR) obj;
            if (c9cr.A00 != i || this.A0A != c9cr.A0A || !C14360o3.A0K(this.A08, c9cr.A08) || !C14360o3.A0K(this.A05, c9cr.A05) || !C14360o3.A0K(this.A06, c9cr.A06) || !C14360o3.A0K(this.A07, c9cr.A07) || this.A01 != c9cr.A01 || !C14360o3.A0K(this.A03, c9cr.A03) || this.A02 != c9cr.A02 || !C14360o3.A0K(this.A04, c9cr.A04) || !C14360o3.A0K(this.A09, c9cr.A09)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A0A) {
            i = 1231;
        }
        int hashCode = ((((((((((((i * 31) + this.A08.hashCode()) * 31) + this.A05.hashCode()) * 31) + this.A06.hashCode()) * 31) + this.A07.hashCode()) * 31) + this.A01) * 31) + this.A03.hashCode()) * 31;
        long j = this.A02;
        return ((((hashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.A04.hashCode()) * 31) + this.A09.hashCode();
    }

    public final String toString() {
        StringBuilder sb;
        String str;
        if (this.A00 != 0) {
            sb = new StringBuilder();
            str = "IABNoBounceRealTimeInfo(isNoBounce=";
        } else {
            sb = new StringBuilder();
            str = "AdClickRealTimeInfo(isAdClick=";
        }
        sb.append(str);
        sb.append(this.A0A);
        sb.append(", signalId=");
        sb.append(this.A08);
        sb.append(", containerModule=");
        sb.append(this.A05);
        sb.append(", inventorySource=");
        sb.append(this.A06);
        sb.append(", itemId=");
        sb.append(this.A07);
        sb.append(", itemType=");
        sb.append(this.A01);
        sb.append(", mediaIds=");
        sb.append(this.A03);
        sb.append(", clickTimestamp=");
        sb.append(this.A02);
        sb.append(", clickMediaId=");
        sb.append(this.A04);
        sb.append(MSV.A00(23));
        sb.append(this.A09);
        sb.append(')');
        return sb.toString();
    }
}
