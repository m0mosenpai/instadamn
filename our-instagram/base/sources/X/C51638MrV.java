package X;

import com.instagram.api.schemas.UserMonetizationProductType;
import java.util.List;

/* renamed from: X.MrV, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51638MrV extends C0T6 {
    public String A00;
    public final UserMonetizationProductType A01;
    public final AbstractC53502NlT A02;
    public final Integer A03;
    public final Integer A04;
    public final Integer A05;
    public final String A06;
    public final List A07;
    public final boolean A08;
    public final boolean A09;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51638MrV) {
                C51638MrV c51638MrV = (C51638MrV) obj;
                if (this.A01 != c51638MrV.A01 || this.A09 != c51638MrV.A09 || !C14360o3.A0K(this.A04, c51638MrV.A04) || !C14360o3.A0K(this.A05, c51638MrV.A05) || !C14360o3.A0K(this.A02, c51638MrV.A02) || !C14360o3.A0K(this.A03, c51638MrV.A03) || this.A08 != c51638MrV.A08 || !C14360o3.A0K(this.A07, c51638MrV.A07) || !C14360o3.A0K(this.A00, c51638MrV.A00) || !C14360o3.A0K(this.A06, c51638MrV.A06)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((AbstractC167007dF.A0D(this.A08, (((((((AbstractC167007dF.A0D(this.A09, AbstractC166987dD.A0G(this.A01)) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A07)) * 31) + AbstractC167017dG.A0O(this.A00)) * 31) + AbstractC25227BEk.A07(this.A06);
    }

    public C51638MrV(UserMonetizationProductType userMonetizationProductType, AbstractC53502NlT abstractC53502NlT, Integer num, Integer num2, Integer num3, String str, String str2, List list, boolean z, boolean z2) {
        this.A01 = userMonetizationProductType;
        this.A09 = z;
        this.A04 = num;
        this.A05 = num2;
        this.A02 = abstractC53502NlT;
        this.A03 = num3;
        this.A08 = z2;
        this.A07 = list;
        this.A00 = str;
        this.A06 = str2;
    }
}
