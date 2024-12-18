package X;

import java.util.Currency;

/* loaded from: classes11.dex */
public final class UPN extends C0T6 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final Currency A07;

    public UPN(String str, String str2, String str3, String str4, Currency currency, int i, int i2, int i3) {
        C14360o3.A0B(currency, 4);
        this.A06 = str;
        this.A05 = str2;
        this.A00 = i;
        this.A07 = currency;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = str3;
        this.A04 = str4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UPN) {
                UPN upn = (UPN) obj;
                if (!C14360o3.A0K(this.A06, upn.A06) || !C14360o3.A0K(this.A05, upn.A05) || this.A00 != upn.A00 || !C14360o3.A0K(this.A07, upn.A07) || this.A01 != upn.A01 || this.A02 != upn.A02 || !C14360o3.A0K(this.A03, upn.A03) || !C14360o3.A0K(this.A04, upn.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int A0J = (((((AbstractC166997dE.A0J(this.A07, ((((this.A06.hashCode() * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + this.A00) * 31) + this.A01) * 31) + this.A02) * 31) + AbstractC167017dG.A0O(this.A03)) * 31;
        String str = this.A04;
        if (str != null) {
            i = str.hashCode();
        }
        return A0J + i;
    }
}
