package X;

import com.instagram.api.schemas.IGTVAccountLevelMonetizationToggleSetting;
import com.instagram.api.schemas.MonetizationEligibilityDecision;
import com.instagram.api.schemas.UserMonetizationProductType;

/* renamed from: X.4n6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C104404n6 extends C0T6 implements InterfaceC104414n7 {
    public final MonetizationEligibilityDecision A00;
    public final UserMonetizationProductType A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final IGTVAccountLevelMonetizationToggleSetting A05;
    public final MonetizationEligibilityDecision A06;

    public C104404n6(IGTVAccountLevelMonetizationToggleSetting iGTVAccountLevelMonetizationToggleSetting, MonetizationEligibilityDecision monetizationEligibilityDecision, MonetizationEligibilityDecision monetizationEligibilityDecision2, UserMonetizationProductType userMonetizationProductType, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(monetizationEligibilityDecision, 2);
        C14360o3.A0B(monetizationEligibilityDecision2, 5);
        C14360o3.A0B(userMonetizationProductType, 6);
        this.A02 = z;
        this.A00 = monetizationEligibilityDecision;
        this.A03 = z2;
        this.A05 = iGTVAccountLevelMonetizationToggleSetting;
        this.A06 = monetizationEligibilityDecision2;
        this.A01 = userMonetizationProductType;
        this.A04 = z3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C104404n6) {
                C104404n6 c104404n6 = (C104404n6) obj;
                if (this.A02 != c104404n6.A02 || this.A00 != c104404n6.A00 || this.A03 != c104404n6.A03 || this.A05 != c104404n6.A05 || this.A06 != c104404n6.A06 || this.A01 != c104404n6.A01 || this.A04 != c104404n6.A04) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i = 1237;
        if (this.A02) {
            i = 1231;
        }
        int hashCode2 = ((i * 31) + this.A00.hashCode()) * 31;
        int i2 = 1237;
        if (this.A03) {
            i2 = 1231;
        }
        int i3 = (hashCode2 + i2) * 31;
        IGTVAccountLevelMonetizationToggleSetting iGTVAccountLevelMonetizationToggleSetting = this.A05;
        if (iGTVAccountLevelMonetizationToggleSetting == null) {
            hashCode = 0;
        } else {
            hashCode = iGTVAccountLevelMonetizationToggleSetting.hashCode();
        }
        int hashCode3 = (((((i3 + hashCode) * 31) + this.A06.hashCode()) * 31) + this.A01.hashCode()) * 31;
        int i4 = 1237;
        if (this.A04) {
            i4 = 1231;
        }
        return hashCode3 + i4;
    }
}
