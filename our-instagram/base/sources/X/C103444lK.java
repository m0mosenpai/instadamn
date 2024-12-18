package X;

/* renamed from: X.4lK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C103444lK extends C0T6 implements InterfaceC103454lL {
    public final InterfaceC39571se A00;
    public final C103434lJ A01;
    public final C914346k A02;
    public final Boolean A03;
    public final Integer A04;
    public final Integer A05;
    public final String A06;
    public final String A07;
    public final String A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C103444lK) {
                C103444lK c103444lK = (C103444lK) obj;
                if (!C14360o3.A0K(this.A02, c103444lK.A02) || !C14360o3.A0K(this.A04, c103444lK.A04) || !C14360o3.A0K(this.A06, c103444lK.A06) || !C14360o3.A0K(this.A03, c103444lK.A03) || !C14360o3.A0K(this.A00, c103444lK.A00) || !C14360o3.A0K(this.A01, c103444lK.A01) || !C14360o3.A0K(this.A07, c103444lK.A07) || !C14360o3.A0K(this.A08, c103444lK.A08) || !C14360o3.A0K(this.A05, c103444lK.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        C914346k c914346k = this.A02;
        int hashCode = (c914346k == null ? 0 : c914346k.hashCode()) * 31;
        Integer num = this.A04;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.A06;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.A03;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        InterfaceC39571se interfaceC39571se = this.A00;
        int hashCode5 = (hashCode4 + (interfaceC39571se == null ? 0 : interfaceC39571se.hashCode())) * 31;
        C103434lJ c103434lJ = this.A01;
        int hashCode6 = (hashCode5 + (c103434lJ == null ? 0 : c103434lJ.hashCode())) * 31;
        String str2 = this.A07;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A08;
        int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.A05;
        return hashCode8 + (num2 != null ? num2.hashCode() : 0);
    }

    public C103444lK(InterfaceC39571se interfaceC39571se, C103434lJ c103434lJ, C914346k c914346k, Boolean bool, Integer num, Integer num2, String str, String str2, String str3) {
        this.A02 = c914346k;
        this.A04 = num;
        this.A06 = str;
        this.A03 = bool;
        this.A00 = interfaceC39571se;
        this.A01 = c103434lJ;
        this.A07 = str2;
        this.A08 = str3;
        this.A05 = num2;
    }
}
