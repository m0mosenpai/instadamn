package X;

import com.instagram.api.schemas.LeadGenEntryPoint;

/* renamed from: X.MrU, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51637MrU extends C0T6 {
    public final LeadGenEntryPoint A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final boolean A08;
    public final String A09;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51637MrU) {
                C51637MrU c51637MrU = (C51637MrU) obj;
                if (!C14360o3.A0K(this.A09, c51637MrU.A09) || !C14360o3.A0K(this.A02, c51637MrU.A02) || !C14360o3.A0K(this.A05, c51637MrU.A05) || !C14360o3.A0K(this.A06, c51637MrU.A06) || !C14360o3.A0K(this.A01, c51637MrU.A01) || !C14360o3.A0K(this.A07, c51637MrU.A07) || !C14360o3.A0K(this.A03, c51637MrU.A03) || this.A00 != c51637MrU.A00 || this.A08 != c51637MrU.A08 || !C14360o3.A0K(this.A04, c51637MrU.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A08, AbstractC166997dE.A0J(this.A00, (((AbstractC166997dE.A0K(this.A01, AbstractC166997dE.A0K(this.A06, AbstractC166997dE.A0K(this.A05, AbstractC166997dE.A0K(this.A02, AbstractC166987dD.A0J(this.A09))))) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31)) + AbstractC25227BEk.A07(this.A04);
    }

    public C51637MrU(LeadGenEntryPoint leadGenEntryPoint, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z) {
        AbstractC167027dH.A13(str, str2, str3);
        C14360o3.A0B(leadGenEntryPoint, 8);
        this.A09 = str;
        this.A02 = str2;
        this.A05 = str3;
        this.A06 = str4;
        this.A01 = str5;
        this.A07 = str6;
        this.A03 = str7;
        this.A00 = leadGenEntryPoint;
        this.A08 = z;
        this.A04 = str8;
    }
}
