package X;

/* loaded from: classes11.dex */
public final class UPQ extends C0T6 {
    public final C50526MSf A00;
    public final C38686GzR A01;
    public final C26069Bfx A02;
    public final CharSequence A03;
    public final Integer A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final C26173Bhy A08;

    public UPQ(C50526MSf c50526MSf, C38686GzR c38686GzR, C26069Bfx c26069Bfx, C26173Bhy c26173Bhy, CharSequence charSequence, Integer num, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(charSequence, 2);
        this.A04 = num;
        this.A03 = charSequence;
        this.A05 = z;
        this.A06 = z2;
        this.A07 = z3;
        this.A02 = c26069Bfx;
        this.A01 = c38686GzR;
        this.A08 = c26173Bhy;
        this.A00 = c50526MSf;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UPQ) {
                UPQ upq = (UPQ) obj;
                if (this.A04 != upq.A04 || !C14360o3.A0K(this.A03, upq.A03) || this.A05 != upq.A05 || this.A06 != upq.A06 || this.A07 != upq.A07 || !C14360o3.A0K(this.A02, upq.A02) || !C14360o3.A0K(this.A01, upq.A01) || !C14360o3.A0K(this.A08, upq.A08) || !C14360o3.A0K(this.A00, upq.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.A04;
        int i = 0;
        int A0J = (AbstractC166997dE.A0J(this.A02, AbstractC167007dF.A0D(this.A07, AbstractC167007dF.A0D(this.A06, AbstractC167007dF.A0D(this.A05, AbstractC166997dE.A0J(this.A03, AbstractC25230BEn.A0C(num, AbstractC68481VSm.A00(num)) * 31))))) + AbstractC167017dG.A0M(this.A01)) * 31;
        C26173Bhy c26173Bhy = this.A08;
        if (c26173Bhy != null) {
            i = c26173Bhy.hashCode();
        }
        return ((A0J + i) * 31) + this.A00.hashCode();
    }
}
