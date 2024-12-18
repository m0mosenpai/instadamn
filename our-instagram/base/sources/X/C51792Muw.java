package X;

import com.instagram.api.schemas.IGTVAccountLevelMonetizationToggleSetting;
import com.instagram.api.schemas.UserMonetizationProductType;

/* renamed from: X.Muw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51792Muw extends C0T6 implements InterfaceC58237Prh {
    public final IGTVAccountLevelMonetizationToggleSetting A00;
    public final UserMonetizationProductType A01;

    public C51792Muw(IGTVAccountLevelMonetizationToggleSetting iGTVAccountLevelMonetizationToggleSetting, UserMonetizationProductType userMonetizationProductType) {
        C14360o3.A0B(userMonetizationProductType, 2);
        this.A00 = iGTVAccountLevelMonetizationToggleSetting;
        this.A01 = userMonetizationProductType;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51792Muw) {
                C51792Muw c51792Muw = (C51792Muw) obj;
                if (this.A00 != c51792Muw.A00 || this.A01 != c51792Muw.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC167017dG.A0M(this.A00) * 31);
    }
}
