package X;

import java.util.List;

/* loaded from: classes7.dex */
public final class H6X extends C0T6 implements InterfaceC37260GbD {
    public final InterfaceC31091DlZ A00;
    public final InterfaceC31094Dlc A01;
    public final Boolean A02;
    public final Integer A03;
    public final Integer A04;
    public final Integer A05;
    public final Integer A06;
    public final Integer A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final List A0I;
    public final List A0J;
    public final boolean A0K;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H6X) {
                H6X h6x = (H6X) obj;
                if (!C14360o3.A0K(this.A03, h6x.A03) || !C14360o3.A0K(this.A02, h6x.A02) || !C14360o3.A0K(this.A08, h6x.A08) || !C14360o3.A0K(this.A09, h6x.A09) || !C14360o3.A0K(this.A0A, h6x.A0A) || !C14360o3.A0K(this.A0B, h6x.A0B) || !C14360o3.A0K(this.A04, h6x.A04) || !C14360o3.A0K(this.A05, h6x.A05) || !C14360o3.A0K(this.A0C, h6x.A0C) || !C14360o3.A0K(this.A00, h6x.A00) || !C14360o3.A0K(this.A0D, h6x.A0D) || !C14360o3.A0K(this.A06, h6x.A06) || !C14360o3.A0K(this.A0E, h6x.A0E) || !C14360o3.A0K(this.A07, h6x.A07) || !C14360o3.A0K(this.A0F, h6x.A0F) || !C14360o3.A0K(this.A01, h6x.A01) || !C14360o3.A0K(this.A0I, h6x.A0I) || this.A0K != h6x.A0K || !C14360o3.A0K(this.A0G, h6x.A0G) || !C14360o3.A0K(this.A0J, h6x.A0J) || !C14360o3.A0K(this.A0H, h6x.A0H)) {
                }
            }
            return false;
        }
        return true;
    }

    public H6X(InterfaceC31091DlZ interfaceC31091DlZ, InterfaceC31094Dlc interfaceC31094Dlc, Boolean bool, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, List list, List list2, boolean z) {
        AbstractC25229BEm.A1M(str6, 11, str7);
        this.A03 = num;
        this.A02 = bool;
        this.A08 = str;
        this.A09 = str2;
        this.A0A = str3;
        this.A0B = str4;
        this.A04 = num2;
        this.A05 = num3;
        this.A0C = str5;
        this.A00 = interfaceC31091DlZ;
        this.A0D = str6;
        this.A06 = num4;
        this.A0E = str7;
        this.A07 = num5;
        this.A0F = str8;
        this.A01 = interfaceC31094Dlc;
        this.A0I = list;
        this.A0K = z;
        this.A0G = str9;
        this.A0J = list2;
        this.A0H = str10;
    }

    @Override // X.InterfaceC37260GbD
    public final String getName() {
        return this.A0E;
    }

    public final int hashCode() {
        return ((((AbstractC167007dF.A0D(this.A0K, (((((((AbstractC166997dE.A0K(this.A0E, (AbstractC166997dE.A0K(this.A0D, ((((((((((((((((((AbstractC167017dG.A0M(this.A03) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0O(this.A08)) * 31) + AbstractC167017dG.A0O(this.A09)) * 31) + AbstractC167017dG.A0O(this.A0A)) * 31) + AbstractC167017dG.A0O(this.A0B)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC167017dG.A0O(this.A0C)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0M(this.A06)) * 31) + AbstractC167017dG.A0M(this.A07)) * 31) + AbstractC167017dG.A0O(this.A0F)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A0I)) * 31) + AbstractC167017dG.A0O(this.A0G)) * 31) + AbstractC167017dG.A0M(this.A0J)) * 31) + AbstractC25227BEk.A07(this.A0H);
    }
}
