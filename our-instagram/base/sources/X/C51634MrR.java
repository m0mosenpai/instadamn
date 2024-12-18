package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.MrR, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51634MrR extends C0T6 {
    public final C4SX A00;
    public final Boolean A01;
    public final Boolean A02;
    public final Long A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final List A07;
    public final Map A08;

    public C51634MrR(C4SX c4sx, Boolean bool, Boolean bool2, Long l, String str, String str2, String str3, List list, Map map) {
        AbstractC25229BEm.A1I(c4sx, 4, str);
        this.A03 = l;
        this.A07 = list;
        this.A08 = map;
        this.A00 = c4sx;
        this.A02 = bool;
        this.A04 = str;
        this.A06 = str2;
        this.A01 = bool2;
        this.A05 = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51634MrR) {
                C51634MrR c51634MrR = (C51634MrR) obj;
                if (!C14360o3.A0K(this.A03, c51634MrR.A03) || !C14360o3.A0K(this.A07, c51634MrR.A07) || !C14360o3.A0K(this.A08, c51634MrR.A08) || !C14360o3.A0K(this.A00, c51634MrR.A00) || !C14360o3.A0K(this.A02, c51634MrR.A02) || !C14360o3.A0K(this.A04, c51634MrR.A04) || !C14360o3.A0K(this.A06, c51634MrR.A06) || !C14360o3.A0K(this.A01, c51634MrR.A01) || !C14360o3.A0K(this.A05, c51634MrR.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A05, (((AbstractC166997dE.A0K(this.A04, (AbstractC166997dE.A0J(this.A00, ((((AbstractC167017dG.A0M(this.A03) * 31) + AbstractC167017dG.A0M(this.A07)) * 31) + AbstractC167017dG.A0M(this.A08)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC166997dE.A0I(this.A01)) * 31);
    }
}
