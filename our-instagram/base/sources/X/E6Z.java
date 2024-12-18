package X;

import com.instagram.api.schemas.AdsTargetingGender;
import com.instagram.api.schemas.XFBIGBoostAudienceGeolocationImportance;
import java.util.List;

/* loaded from: classes6.dex */
public final class E6Z extends C0T6 {
    public final int A00;
    public final int A01;
    public final AdsTargetingGender A02;
    public final XFBIGBoostAudienceGeolocationImportance A03;
    public final Boolean A04;
    public final String A05;
    public final String A06;
    public final List A07;
    public final List A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E6Z) {
                E6Z e6z = (E6Z) obj;
                if (!C14360o3.A0K(this.A05, e6z.A05) || this.A02 != e6z.A02 || this.A03 != e6z.A03 || !C14360o3.A0K(this.A07, e6z.A07) || !C14360o3.A0K(this.A08, e6z.A08) || this.A00 != e6z.A00 || this.A01 != e6z.A01 || !C14360o3.A0K(this.A06, e6z.A06) || !C14360o3.A0K(this.A04, e6z.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((AbstractC166997dE.A0J(this.A08, AbstractC166997dE.A0J(this.A07, (AbstractC166997dE.A0J(this.A02, AbstractC166987dD.A0J(this.A05)) + AbstractC167017dG.A0M(this.A03)) * 31)) + this.A00) * 31) + this.A01) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC166997dE.A0I(this.A04);
    }

    public E6Z(AdsTargetingGender adsTargetingGender, XFBIGBoostAudienceGeolocationImportance xFBIGBoostAudienceGeolocationImportance, Boolean bool, String str, String str2, List list, List list2, int i, int i2) {
        AbstractC25234BEr.A1P(str, adsTargetingGender, list);
        C14360o3.A0B(list2, 5);
        this.A05 = str;
        this.A02 = adsTargetingGender;
        this.A03 = xFBIGBoostAudienceGeolocationImportance;
        this.A07 = list;
        this.A08 = list2;
        this.A00 = i;
        this.A01 = i2;
        this.A06 = str2;
        this.A04 = bool;
    }
}
