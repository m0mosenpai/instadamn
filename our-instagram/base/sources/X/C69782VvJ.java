package X;

import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.Collections;

/* renamed from: X.VvJ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69782VvJ {
    public static volatile Integer A0D;
    public final double A00;
    public final double A01;
    public final String A02;
    public final int A03;
    public final int A04;
    public final long A05;
    public final Integer A06;
    public final String A07;
    public final String A08;
    public final java.util.Set A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    public C69782VvJ(Integer num, String str, String str2, String str3, java.util.Set set, double d, double d2, int i, int i2, long j, boolean z, boolean z2, boolean z3) {
        this.A0A = z;
        this.A05 = j;
        AbstractC63311ShH.A04(str, "fullAddress");
        this.A07 = str;
        this.A00 = d;
        this.A03 = i;
        this.A01 = d2;
        this.A04 = i2;
        this.A0B = z2;
        this.A06 = num;
        this.A0C = z3;
        AbstractC63311ShH.A04(str2, "userId");
        this.A02 = str2;
        AbstractC63311ShH.A04(str3, "userName");
        this.A08 = str3;
        this.A09 = Collections.unmodifiableSet(set);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C69782VvJ) {
                C69782VvJ c69782VvJ = (C69782VvJ) obj;
                if (this.A0A != c69782VvJ.A0A || this.A05 != c69782VvJ.A05 || !C14360o3.A0K(this.A07, c69782VvJ.A07) || this.A00 != c69782VvJ.A00 || this.A03 != c69782VvJ.A03 || this.A01 != c69782VvJ.A01 || this.A04 != c69782VvJ.A04 || this.A0B != c69782VvJ.A0B || A00() != c69782VvJ.A00() || this.A0C != c69782VvJ.A0C || !C14360o3.A0K(this.A02, c69782VvJ.A02) || !C14360o3.A0K(this.A08, c69782VvJ.A08)) {
                }
            }
            return false;
        }
        return true;
    }

    public final Integer A00() {
        if (this.A09.contains(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS)) {
            return this.A06;
        }
        if (A0D == null) {
            synchronized (this) {
                if (A0D == null) {
                    A0D = C05F.A00;
                }
            }
        }
        return A0D;
    }

    public final int hashCode() {
        int intValue;
        int A01 = AbstractC63311ShH.A01((AbstractC63311ShH.A00(this.A01, (AbstractC63311ShH.A00(this.A00, (((AbstractC63311ShH.A01(1, this.A0A) * 31) + AbstractC25228BEl.A03(this.A05)) * 31) + AbstractC25235BEs.A06(this.A07)) * 31) + this.A03) * 31) + this.A04, this.A0B);
        if (A00() == null) {
            intValue = -1;
        } else {
            intValue = A00().intValue();
        }
        return (((AbstractC63311ShH.A01((A01 * 31) + intValue, this.A0C) * 31) + AbstractC25235BEs.A06(this.A02)) * 31) + AbstractC25235BEs.A06(this.A08);
    }
}
