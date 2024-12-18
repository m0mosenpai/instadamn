package X;

/* loaded from: classes5.dex */
public final class BLG extends C0T6 {
    public final int A00;
    public final BLC A01;
    public final C50559MTq A02;
    public final C75113Zb A03;
    public final C23031Ai A04;
    public final Integer A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public BLG(BLC blc, C50559MTq c50559MTq, C75113Zb c75113Zb, C23031Ai c23031Ai, Integer num, int i, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(c23031Ai, 3);
        this.A03 = c75113Zb;
        this.A05 = num;
        this.A04 = c23031Ai;
        this.A06 = z;
        this.A08 = z2;
        this.A07 = z3;
        this.A00 = i;
        this.A01 = blc;
        this.A02 = c50559MTq;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BLG) {
                BLG blg = (BLG) obj;
                if (!C14360o3.A0K(this.A03, blg.A03) || this.A05 != blg.A05 || !C14360o3.A0K(this.A04, blg.A04) || this.A06 != blg.A06 || this.A08 != blg.A08 || this.A07 != blg.A07 || this.A00 != blg.A00 || !C14360o3.A0K(this.A01, blg.A01) || !C14360o3.A0K(this.A02, blg.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A0M = AbstractC167017dG.A0M(this.A03) * 31;
        int intValue = this.A05.intValue();
        switch (intValue) {
            case 1:
                str = "BELOW_PAUSE_ICON";
                break;
            case 2:
                str = "NO_AUDIO_CONTROL";
                break;
            default:
                str = "ABOVE_PAUSE_ICON";
                break;
        }
        return AbstractC166987dD.A0I(this.A02, AbstractC166997dE.A0J(this.A01, (AbstractC167007dF.A0D(this.A07, AbstractC167007dF.A0D(this.A08, AbstractC167007dF.A0D(this.A06, AbstractC166997dE.A0J(this.A04, AbstractC25231BEo.A0H(str, intValue, A0M))))) + this.A00) * 31));
    }
}
