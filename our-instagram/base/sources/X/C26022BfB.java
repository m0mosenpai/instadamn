package X;

/* renamed from: X.BfB, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26022BfB extends C0T6 {
    public final int A00;
    public final MUD A01;
    public final MUD A02;
    public final C51743MtS A03;
    public final Integer A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final C5Hc A0C;
    public final EnumC72384XcK A0D;
    public final EnumC72405Xcs A0E;
    public final Integer A0F;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26022BfB) {
                C26022BfB c26022BfB = (C26022BfB) obj;
                if (!C14360o3.A0K(this.A05, c26022BfB.A05) || this.A0E != c26022BfB.A0E || !C14360o3.A0K(this.A0B, c26022BfB.A0B) || this.A0D != c26022BfB.A0D || this.A00 != c26022BfB.A00 || !C14360o3.A0K(this.A09, c26022BfB.A09) || !C14360o3.A0K(this.A08, c26022BfB.A08) || !C14360o3.A0K(this.A04, c26022BfB.A04) || !C14360o3.A0K(this.A0A, c26022BfB.A0A) || !C14360o3.A0K(this.A01, c26022BfB.A01) || !C14360o3.A0K(this.A02, c26022BfB.A02) || !C14360o3.A0K(this.A07, c26022BfB.A07) || !C14360o3.A0K(this.A0F, c26022BfB.A0F) || !C14360o3.A0K(this.A0C, c26022BfB.A0C) || !C14360o3.A0K(this.A03, c26022BfB.A03) || !C14360o3.A0K(this.A06, c26022BfB.A06)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((((((((((AbstractC166997dE.A0K(this.A09, (AbstractC166997dE.A0J(this.A0D, AbstractC166997dE.A0K(this.A0B, AbstractC166997dE.A0J(this.A0E, AbstractC166987dD.A0J(this.A05)))) + this.A00) * 31) + AbstractC167017dG.A0O(this.A08)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0O(this.A0A)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC167017dG.A0M(this.A0F)) * 31) + AbstractC167017dG.A0M(this.A0C)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC25227BEk.A07(this.A06);
    }

    public C26022BfB(MUD mud, MUD mud2, C51743MtS c51743MtS, EnumC72384XcK enumC72384XcK, EnumC72405Xcs enumC72405Xcs, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, C5Hc c5Hc, int i) {
        this.A05 = str;
        this.A0E = enumC72405Xcs;
        this.A0B = str2;
        this.A0D = enumC72384XcK;
        this.A00 = i;
        this.A09 = str3;
        this.A08 = str4;
        this.A04 = num;
        this.A0A = str5;
        this.A01 = mud;
        this.A02 = mud2;
        this.A07 = str6;
        this.A0F = num2;
        this.A0C = c5Hc;
        this.A03 = c51743MtS;
        this.A06 = str7;
    }
}
