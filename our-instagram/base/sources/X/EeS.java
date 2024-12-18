package X;

import com.instagram.api.schemas.FanClubNextStepsRecommendationsType;

/* loaded from: classes6.dex */
public final class EeS extends AbstractC33558EsW {
    public final FanClubNextStepsRecommendationsType A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EeS) {
                EeS eeS = (EeS) obj;
                if (this.A00 != eeS.A00 || !C14360o3.A0K(this.A02, eeS.A02) || !C14360o3.A0K(this.A01, eeS.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A01, AbstractC166997dE.A0K(this.A02, AbstractC166987dD.A0G(this.A00)));
    }

    public EeS(FanClubNextStepsRecommendationsType fanClubNextStepsRecommendationsType, String str, String str2) {
        AbstractC167017dG.A1R(str, str2);
        this.A00 = fanClubNextStepsRecommendationsType;
        this.A02 = str;
        this.A01 = str2;
    }
}
