package X;

/* renamed from: X.Bhd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26152Bhd extends C0T6 implements InterfaceC132245y2 {
    public final C132175xv A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final C51758Mth A05 = new C51758Mth((C50679MYx) null, 2, true);
    public final C26036BfP A06;
    public final String A07;

    public C26152Bhd(C132175xv c132175xv, C26036BfP c26036BfP, Integer num, String str, String str2, boolean z) {
        this.A00 = c132175xv;
        this.A06 = c26036BfP;
        this.A03 = str;
        this.A02 = str2;
        this.A01 = num;
        this.A04 = z;
        this.A07 = AbstractC132295y8.A01(this, "uploadfailure", c132175xv.A03);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26152Bhd) {
                C26152Bhd c26152Bhd = (C26152Bhd) obj;
                if (!C14360o3.A0K(this.A00, c26152Bhd.A00) || !C14360o3.A0K(this.A06, c26152Bhd.A06) || !C14360o3.A0K(this.A03, c26152Bhd.A03) || !C14360o3.A0K(this.A02, c26152Bhd.A02) || this.A01 != c26152Bhd.A01 || this.A04 != c26152Bhd.A04) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A0J = (((AbstractC166997dE.A0J(this.A06, AbstractC166987dD.A0G(this.A00)) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC25227BEk.A07(this.A02)) * 31;
        int intValue = this.A01.intValue();
        switch (intValue) {
            case 1:
                str = "WaitingForAutoRetry";
                break;
            case 2:
                str = "CannotRetry";
                break;
            default:
                str = "CanManualRetry";
                break;
        }
        return AbstractC166987dD.A0K(this.A04, AbstractC25231BEo.A0H(str, intValue, A0J));
    }

    @Override // X.InterfaceC132245y2
    public final String BKd() {
        return this.A07;
    }

    @Override // X.InterfaceC132245y2
    public final C132175xv Bet() {
        return this.A00;
    }

    @Override // X.InterfaceC132245y2
    public final C51758Mth CGR() {
        return this.A05;
    }
}
