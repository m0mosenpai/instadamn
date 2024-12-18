package X;

import java.util.HashMap;
import java.util.List;

/* renamed from: X.Gef, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37461Gef extends C0T6 {
    public final C37462Geg A00;
    public final Integer A01;
    public final Integer A02;
    public final List A03;
    public final Boolean A04;
    public final Boolean A05;
    public final String A06;
    public final HashMap A07;
    public final List A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C37461Gef) {
                C37461Gef c37461Gef = (C37461Gef) obj;
                if (!C14360o3.A0K(this.A03, c37461Gef.A03) || !C14360o3.A0K(this.A01, c37461Gef.A01) || !C14360o3.A0K(this.A06, c37461Gef.A06) || !C14360o3.A0K(this.A02, c37461Gef.A02) || !C14360o3.A0K(this.A04, c37461Gef.A04) || !C14360o3.A0K(this.A07, c37461Gef.A07) || !C14360o3.A0K(this.A05, c37461Gef.A05) || !C14360o3.A0K(this.A08, c37461Gef.A08) || !C14360o3.A0K(this.A00, c37461Gef.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A08, (((((((AbstractC166997dE.A0K(this.A06, (AbstractC166987dD.A0G(this.A03) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0M(this.A07)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public C37461Gef(C37462Geg c37462Geg, Boolean bool, Boolean bool2, Integer num, Integer num2, String str, HashMap hashMap, List list, List list2) {
        AbstractC167017dG.A1Q(list, str);
        C14360o3.A0B(list2, 8);
        this.A03 = list;
        this.A01 = num;
        this.A06 = str;
        this.A02 = num2;
        this.A04 = bool;
        this.A07 = hashMap;
        this.A05 = bool2;
        this.A08 = list2;
        this.A00 = c37462Geg;
    }
}
