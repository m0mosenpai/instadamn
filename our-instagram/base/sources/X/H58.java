package X;

/* loaded from: classes7.dex */
public final class H58 extends C0T6 implements InterfaceC43485JIx {
    public final InterfaceC39571se A00;
    public final Integer A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final InterfaceC43475JIn A06;
    public final String A07;
    public final String A08;

    public H58(InterfaceC43475JIn interfaceC43475JIn, InterfaceC39571se interfaceC39571se, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5) {
        AbstractC167007dF.A1I(str3, 4, str5);
        this.A07 = str;
        this.A08 = str2;
        this.A01 = num;
        this.A03 = str3;
        this.A00 = interfaceC39571se;
        this.A06 = interfaceC43475JIn;
        this.A04 = str4;
        this.A05 = str5;
        this.A02 = num2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H58) {
                H58 h58 = (H58) obj;
                if (!C14360o3.A0K(this.A07, h58.A07) || !C14360o3.A0K(this.A08, h58.A08) || !C14360o3.A0K(this.A01, h58.A01) || !C14360o3.A0K(this.A03, h58.A03) || !C14360o3.A0K(this.A00, h58.A00) || !C14360o3.A0K(this.A06, h58.A06) || !C14360o3.A0K(this.A04, h58.A04) || !C14360o3.A0K(this.A05, h58.A05) || !C14360o3.A0K(this.A02, h58.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0K(this.A05, (((((AbstractC166997dE.A0K(this.A03, ((((AbstractC167017dG.A0O(this.A07) * 31) + AbstractC167017dG.A0O(this.A08)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0M(this.A06)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC166997dE.A0I(this.A02);
    }
}
