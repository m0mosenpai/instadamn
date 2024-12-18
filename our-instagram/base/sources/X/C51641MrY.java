package X;

/* renamed from: X.MrY, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51641MrY extends C0T6 {
    public final C54712OEo A00;
    public final Boolean A01;
    public final Long A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final int A08;
    public final String A09;
    public final String A0A;

    public C51641MrY(C54712OEo c54712OEo, Boolean bool, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i) {
        C14360o3.A0B(str5, 6);
        this.A07 = str;
        this.A01 = bool;
        this.A09 = str2;
        this.A03 = str3;
        this.A06 = str4;
        this.A05 = str5;
        this.A08 = i;
        this.A00 = c54712OEo;
        this.A04 = str6;
        this.A02 = l;
        this.A0A = str7;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51641MrY) {
                C51641MrY c51641MrY = (C51641MrY) obj;
                if (!C14360o3.A0K(this.A07, c51641MrY.A07) || !C14360o3.A0K(this.A01, c51641MrY.A01) || !C14360o3.A0K(this.A09, c51641MrY.A09) || !C14360o3.A0K(this.A03, c51641MrY.A03) || !C14360o3.A0K(this.A06, c51641MrY.A06) || !C14360o3.A0K(this.A05, c51641MrY.A05) || this.A08 != c51641MrY.A08 || !C14360o3.A0K(this.A00, c51641MrY.A00) || !C14360o3.A0K(this.A04, c51641MrY.A04) || !C14360o3.A0K(this.A02, c51641MrY.A02) || !C14360o3.A0K(this.A0A, c51641MrY.A0A)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((AbstractC166997dE.A0K(this.A05, ((((((((AbstractC167017dG.A0O(this.A07) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0O(this.A09)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + this.A08) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC25227BEk.A07(this.A0A);
    }
}
