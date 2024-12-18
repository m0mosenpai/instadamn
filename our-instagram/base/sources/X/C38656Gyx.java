package X;

import com.instagram.model.mediasize.ExtendedImageUrl;

/* renamed from: X.Gyx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38656Gyx extends C0T6 {
    public final ExtendedImageUrl A00;
    public final EnumC40111tc A01;
    public final C3YE A02;
    public final Integer A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final EnumC40111tc A0B;
    public final boolean A0C;

    public C38656Gyx(ExtendedImageUrl extendedImageUrl, EnumC40111tc enumC40111tc, EnumC40111tc enumC40111tc2, C3YE c3ye, Integer num, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        AbstractC25229BEm.A1K(num, 6, c3ye);
        this.A07 = z;
        this.A01 = enumC40111tc;
        this.A08 = z2;
        this.A0C = z3;
        this.A0B = enumC40111tc2;
        this.A03 = num;
        this.A00 = extendedImageUrl;
        this.A05 = str;
        this.A06 = str2;
        this.A04 = str3;
        this.A02 = c3ye;
        this.A0A = z4;
        this.A09 = z5;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38656Gyx) {
                C38656Gyx c38656Gyx = (C38656Gyx) obj;
                if (this.A07 != c38656Gyx.A07 || this.A01 != c38656Gyx.A01 || this.A08 != c38656Gyx.A08 || this.A0C != c38656Gyx.A0C || this.A0B != c38656Gyx.A0B || this.A03 != c38656Gyx.A03 || !C14360o3.A0K(this.A00, c38656Gyx.A00) || !C14360o3.A0K(this.A05, c38656Gyx.A05) || !C14360o3.A0K(this.A06, c38656Gyx.A06) || !C14360o3.A0K(this.A04, c38656Gyx.A04) || this.A02 != c38656Gyx.A02 || this.A0A != c38656Gyx.A0A || this.A09 != c38656Gyx.A09) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A0J = AbstractC166997dE.A0J(this.A0B, AbstractC167007dF.A0D(this.A0C, AbstractC167007dF.A0D(this.A08, (AbstractC25225BEi.A08(this.A07) + AbstractC167017dG.A0M(this.A01)) * 31)));
        int intValue = this.A03.intValue();
        switch (intValue) {
            case 1:
                str = "VIDEO";
                break;
            case 2:
                str = "CAROUSEL";
                break;
            case 3:
                str = "PHOTO";
                break;
            case 4:
                str = "REEL";
                break;
            default:
                str = "IGTV";
                break;
        }
        return AbstractC166987dD.A0K(this.A09, AbstractC167007dF.A0D(this.A0A, AbstractC166997dE.A0J(this.A02, (((AbstractC166997dE.A0K(this.A05, (AbstractC25231BEo.A0H(str, intValue, A0J) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC25227BEk.A07(this.A04)) * 31)));
    }
}
