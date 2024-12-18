package X;

import com.instagram.api.schemas.IGAIAgentType;

/* renamed from: X.Bf6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26017Bf6 extends C0T6 {
    public final IGAIAgentType A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final boolean A0A;
    public final boolean A0B;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26017Bf6) {
                C26017Bf6 c26017Bf6 = (C26017Bf6) obj;
                if (!C14360o3.A0K(this.A06, c26017Bf6.A06) || !C14360o3.A0K(this.A07, c26017Bf6.A07) || !C14360o3.A0K(this.A05, c26017Bf6.A05) || !C14360o3.A0K(this.A08, c26017Bf6.A08) || !C14360o3.A0K(this.A01, c26017Bf6.A01) || this.A0B != c26017Bf6.A0B || this.A0A != c26017Bf6.A0A || !C14360o3.A0K(this.A03, c26017Bf6.A03) || !C14360o3.A0K(this.A02, c26017Bf6.A02) || this.A00 != c26017Bf6.A00 || !C14360o3.A0K(this.A09, c26017Bf6.A09) || !C14360o3.A0K(this.A04, c26017Bf6.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((AbstractC167007dF.A0D(this.A0A, AbstractC167007dF.A0D(this.A0B, AbstractC166997dE.A0K(this.A01, (AbstractC166997dE.A0K(this.A05, AbstractC166997dE.A0K(this.A07, AbstractC166987dD.A0J(this.A06))) + AbstractC167017dG.A0O(this.A08)) * 31))) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0O(this.A09)) * 31) + AbstractC25227BEk.A07(this.A04);
    }

    public C26017Bf6(IGAIAgentType iGAIAgentType, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, boolean z2) {
        this.A06 = str;
        this.A07 = str2;
        this.A05 = str3;
        this.A08 = str4;
        this.A01 = str5;
        this.A0B = z;
        this.A0A = z2;
        this.A03 = str6;
        this.A02 = str7;
        this.A00 = iGAIAgentType;
        this.A09 = str8;
        this.A04 = str9;
    }
}
