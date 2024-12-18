package X;

import com.instagram.api.schemas.IGTVAccountLevelMonetizationToggleSetting;
import com.instagram.api.schemas.UserMonetizationProductType;

/* renamed from: X.Gy6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38603Gy6 extends C0T6 {
    public final IGTVAccountLevelMonetizationToggleSetting A00;
    public final UserMonetizationProductType A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38603Gy6) {
                C38603Gy6 c38603Gy6 = (C38603Gy6) obj;
                if (this.A00 != c38603Gy6.A00 || this.A01 != c38603Gy6.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC166987dD.A0G(this.A00));
    }

    public C38603Gy6(IGTVAccountLevelMonetizationToggleSetting iGTVAccountLevelMonetizationToggleSetting, UserMonetizationProductType userMonetizationProductType) {
        AbstractC167017dG.A1P(iGTVAccountLevelMonetizationToggleSetting, userMonetizationProductType);
        this.A00 = iGTVAccountLevelMonetizationToggleSetting;
        this.A01 = userMonetizationProductType;
    }
}
