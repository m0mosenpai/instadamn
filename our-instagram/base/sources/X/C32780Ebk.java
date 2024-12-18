package X;

import java.util.List;

/* renamed from: X.Ebk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32780Ebk extends FKR {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final List A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32780Ebk) {
                C32780Ebk c32780Ebk = (C32780Ebk) obj;
                if (!C14360o3.A0K(this.A00, c32780Ebk.A00) || !C14360o3.A0K(this.A02, c32780Ebk.A02) || !C14360o3.A0K(this.A04, c32780Ebk.A04) || !C14360o3.A0K(this.A06, c32780Ebk.A06) || !C14360o3.A0K(this.A03, c32780Ebk.A03) || !C14360o3.A0K(this.A05, c32780Ebk.A05) || !C14360o3.A0K(this.A01, c32780Ebk.A01) || !C14360o3.A0K(this.A07, c32780Ebk.A07)) {
                }
            }
            return false;
        }
        return true;
    }

    public C32780Ebk(String str, String str2, String str3, String str4, String str5, String str6, String str7, List list) {
        super(C2EY.A0g, str);
        this.A00 = str;
        this.A02 = str2;
        this.A04 = str3;
        this.A06 = str4;
        this.A03 = str5;
        this.A05 = str6;
        this.A01 = str7;
        this.A07 = list;
    }

    public final int hashCode() {
        return ((((((((AbstractC166997dE.A0K(this.A04, AbstractC166997dE.A0K(this.A02, AbstractC167017dG.A0O(this.A00) * 31)) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC166997dE.A0I(this.A07);
    }
}
