package X;

/* renamed from: X.MwC, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51868MwC extends C0T6 implements InterfaceC57855PlL {
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public String A05;
    public String A06;
    public boolean A07;
    public final Boolean A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51868MwC) {
                C51868MwC c51868MwC = (C51868MwC) obj;
                if (this.A07 != c51868MwC.A07 || this.A00 != c51868MwC.A00 || this.A02 != c51868MwC.A02 || this.A01 != c51868MwC.A01 || this.A04 != c51868MwC.A04 || this.A03 != c51868MwC.A03 || !C14360o3.A0K(this.A06, c51868MwC.A06) || !C14360o3.A0K(this.A05, c51868MwC.A05) || !C14360o3.A0K(this.A08, c51868MwC.A08)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((AbstractC167007dF.A07(this.A03, AbstractC167007dF.A07(this.A04, AbstractC167007dF.A07(this.A01, AbstractC167007dF.A07(this.A02, (AbstractC25225BEi.A08(this.A07) + this.A00) * 31)))) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC166997dE.A0I(this.A08);
    }

    public C51868MwC(Boolean bool, String str, String str2, int i, long j, long j2, long j3, long j4, boolean z) {
        this.A07 = z;
        this.A00 = i;
        this.A02 = j;
        this.A01 = j2;
        this.A04 = j3;
        this.A03 = j4;
        this.A06 = str;
        this.A05 = str2;
        this.A08 = bool;
    }
}
