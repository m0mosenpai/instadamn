package X;

/* renamed from: X.MsX, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51702MsX extends C0T6 {
    public final Integer A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C51702MsX() {
        /*
            r9 = this;
            r3 = 0
            java.lang.Integer r1 = X.C05F.A00
            r6 = 0
            r8 = 1
            r0 = r9
            r2 = r1
            r4 = r3
            r5 = r3
            r7 = r6
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51702MsX.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51702MsX) {
                C51702MsX c51702MsX = (C51702MsX) obj;
                if (this.A01 != c51702MsX.A01 || !C14360o3.A0K(this.A02, c51702MsX.A02) || !C14360o3.A0K(this.A04, c51702MsX.A04) || this.A00 != c51702MsX.A00 || this.A07 != c51702MsX.A07 || this.A05 != c51702MsX.A05 || !C14360o3.A0K(this.A03, c51702MsX.A03) || this.A06 != c51702MsX.A06) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int intValue = this.A01.intValue();
        switch (intValue) {
            case 1:
                str = "Loading";
                break;
            case 2:
                str = "Failed";
                break;
            case 3:
                str = "Success";
                break;
            default:
                str = "Initial";
                break;
        }
        return AbstractC166987dD.A0K(this.A06, (AbstractC167007dF.A0D(this.A05, AbstractC167007dF.A0D(this.A07, (((((AbstractC25228BEl.A0F(str, intValue) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC53866Nru.A00(this.A00)) * 31)) + AbstractC25227BEk.A07(this.A03)) * 31);
    }

    public C51702MsX(Integer num, Integer num2, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        this.A01 = num;
        this.A02 = str;
        this.A04 = str2;
        this.A00 = num2;
        this.A07 = z;
        this.A05 = z2;
        this.A03 = str3;
        this.A06 = z3;
    }
}
