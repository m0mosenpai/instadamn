package X;

import java.util.List;

/* renamed from: X.9JS, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9JS extends C0T6 {
    public Boolean A00;
    public List A01;
    public final long A02;
    public final EnumC209589Ot A03;
    public final AbstractC172157lk A04;
    public final AbstractC172157lk A05;
    public final EnumC189548aZ A06;
    public final C202278x7 A07;
    public final String A08;
    public final String A09;
    public final String A0A;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9JS) {
                C9JS c9js = (C9JS) obj;
                if (!C14360o3.A0K(this.A09, c9js.A09) || this.A02 != c9js.A02 || !C14360o3.A0K(this.A0A, c9js.A0A) || this.A03 != c9js.A03 || !C14360o3.A0K(this.A08, c9js.A08) || !C14360o3.A0K(this.A00, c9js.A00) || !C14360o3.A0K(this.A01, c9js.A01) || this.A06 != c9js.A06 || !C14360o3.A0K(this.A05, c9js.A05) || !C14360o3.A0K(this.A07, c9js.A07)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((AbstractC166997dE.A0K(this.A08, AbstractC166997dE.A0J(this.A03, AbstractC166997dE.A0K(this.A0A, AbstractC167007dF.A07(this.A02, AbstractC166987dD.A0J(this.A09))))) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A06)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC166997dE.A0I(this.A07);
    }

    public C9JS(EnumC209589Ot enumC209589Ot, AbstractC172157lk abstractC172157lk, EnumC189548aZ enumC189548aZ, C202278x7 c202278x7, Boolean bool, String str, String str2, String str3, List list, long j) {
        AbstractC167017dG.A1Q(str, str2);
        AbstractC167017dG.A1S(enumC209589Ot, str3);
        this.A09 = str;
        this.A02 = j;
        this.A0A = str2;
        this.A03 = enumC209589Ot;
        this.A08 = str3;
        this.A00 = bool;
        this.A01 = list;
        this.A06 = enumC189548aZ;
        this.A05 = abstractC172157lk;
        this.A07 = c202278x7;
        this.A04 = abstractC172157lk == null ? null : abstractC172157lk;
    }
}
