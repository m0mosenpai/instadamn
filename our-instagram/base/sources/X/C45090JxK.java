package X;

/* renamed from: X.JxK, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45090JxK extends C0T6 {
    public final long A00;
    public final C2ED A01;
    public final MNQ A02;
    public final Boolean A03;
    public final Integer A04;
    public final Long A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final boolean A0B;
    public final boolean A0C;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45090JxK) {
                C45090JxK c45090JxK = (C45090JxK) obj;
                if (!C14360o3.A0K(this.A07, c45090JxK.A07) || !C14360o3.A0K(this.A06, c45090JxK.A06) || this.A00 != c45090JxK.A00 || !C14360o3.A0K(this.A0A, c45090JxK.A0A) || !C14360o3.A0K(this.A01, c45090JxK.A01) || this.A0C != c45090JxK.A0C || !C14360o3.A0K(this.A05, c45090JxK.A05) || !C14360o3.A0K(this.A03, c45090JxK.A03) || !C14360o3.A0K(this.A09, c45090JxK.A09) || this.A04 != c45090JxK.A04 || !C14360o3.A0K(this.A02, c45090JxK.A02) || !C14360o3.A0K(this.A08, c45090JxK.A08) || this.A0B != c45090JxK.A0B) {
                }
            }
            return false;
        }
        return true;
    }

    public C45090JxK(C2ED c2ed, MNQ mnq, Boolean bool, Integer num, Long l, String str, String str2, String str3, String str4, String str5, long j, boolean z, boolean z2) {
        C14360o3.A0B(mnq, 11);
        this.A07 = str;
        this.A06 = str2;
        this.A00 = j;
        this.A0A = str3;
        this.A01 = c2ed;
        this.A0C = z;
        this.A05 = l;
        this.A03 = bool;
        this.A09 = str4;
        this.A04 = num;
        this.A02 = mnq;
        this.A08 = str5;
        this.A0B = z2;
    }

    public final boolean A00() {
        if (AbstractC31178DnM.A03(this.A05) > 0 || AbstractC166997dE.A1Z(this.A03, true)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str;
        int A0D = (((((AbstractC167007dF.A0D(this.A0C, (AbstractC166997dE.A0K(this.A0A, AbstractC25236BEt.A01(this.A00, (AbstractC166987dD.A0J(this.A07) + AbstractC167017dG.A0O(this.A06)) * 31)) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0O(this.A09)) * 31;
        int intValue = this.A04.intValue();
        switch (intValue) {
            case 1:
                str = "EDITED";
                break;
            case 2:
                str = "REMOVED";
                break;
            case 3:
                str = "EXPIRED";
                break;
            case 4:
                str = "UPDATED";
                break;
            default:
                str = "ADDED";
                break;
        }
        return AbstractC166987dD.A0K(this.A0B, (AbstractC166997dE.A0J(this.A02, AbstractC25231BEo.A0H(str, intValue, A0D)) + AbstractC25227BEk.A07(this.A08)) * 31);
    }
}
