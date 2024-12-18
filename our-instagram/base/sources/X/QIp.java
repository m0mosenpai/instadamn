package X;

/* loaded from: classes10.dex */
public final class QIp extends C0T6 {
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;

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
        if (obj instanceof QIp) {
            QIp qIp = (QIp) obj;
            if (qIp.A00 != i || !C14360o3.A0K(this.A0M, qIp.A0M) || !C14360o3.A0K(this.A04, qIp.A04) || !C14360o3.A0K(this.A03, qIp.A03) || !C14360o3.A0K(this.A05, qIp.A05) || !C14360o3.A0K(this.A0H, qIp.A0H) || !C14360o3.A0K(this.A0I, qIp.A0I) || !C14360o3.A0K(this.A0J, qIp.A0J) || !C14360o3.A0K(this.A01, qIp.A01) || !C14360o3.A0K(this.A02, qIp.A02) || !C14360o3.A0K(this.A0D, qIp.A0D) || !C14360o3.A0K(this.A0G, qIp.A0G) || !C14360o3.A0K(this.A06, qIp.A06) || !C14360o3.A0K(this.A07, qIp.A07) || !C14360o3.A0K(this.A08, qIp.A08) || !C14360o3.A0K(this.A09, qIp.A09) || !C14360o3.A0K(this.A0A, qIp.A0A) || !C14360o3.A0K(this.A0B, qIp.A0B) || !C14360o3.A0K(this.A0C, qIp.A0C) || !C14360o3.A0K(this.A0E, qIp.A0E) || !C14360o3.A0K(this.A0F, qIp.A0F) || !C14360o3.A0K(this.A0K, qIp.A0K) || !C14360o3.A0K(this.A0L, qIp.A0L)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((AbstractC167017dG.A0O(this.A0M) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0O(this.A0H)) * 31) + AbstractC167017dG.A0O(this.A0I)) * 31) + AbstractC167017dG.A0O(this.A0J)) * 31) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0O(this.A0D)) * 31) + AbstractC167017dG.A0O(this.A0G)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC167017dG.A0O(this.A08)) * 31) + AbstractC167017dG.A0O(this.A09)) * 31) + AbstractC167017dG.A0O(this.A0A)) * 31) + AbstractC167017dG.A0O(this.A0B)) * 31) + AbstractC167017dG.A0O(this.A0C)) * 31) + AbstractC167017dG.A0O(this.A0E)) * 31) + AbstractC167017dG.A0O(this.A0F)) * 31) + AbstractC167017dG.A0O(this.A0K)) * 31) + AbstractC25227BEk.A07(this.A0L);
    }

    public QIp(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, int i) {
        this.A00 = i;
        this.A0M = str;
        this.A04 = str2;
        this.A03 = str3;
        this.A05 = str4;
        this.A0H = str5;
        this.A0I = str6;
        this.A0J = str7;
        this.A01 = str8;
        this.A02 = str9;
        this.A0D = str10;
        this.A0G = str11;
        this.A06 = str12;
        this.A07 = str13;
        this.A08 = str14;
        this.A09 = str15;
        this.A0A = str16;
        this.A0B = str17;
        this.A0C = str18;
        this.A0E = str19;
        this.A0F = str20;
        this.A0K = str21;
        this.A0L = str22;
    }
}
