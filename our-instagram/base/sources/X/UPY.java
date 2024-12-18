package X;

import com.instagram.api.schemas.AdvantageAudienceData;
import com.instagram.api.schemas.TargetingRelaxationConstants;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes11.dex */
public final class UPY extends C0T6 {
    public final double A00;
    public final double A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final AdvantageAudienceData A05;
    public final TargetingRelaxationConstants A06;
    public final XIGIGBoostDestination A07;
    public final UserSession A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final List A0E;
    public final List A0F;
    public final List A0G;
    public final List A0H;
    public final List A0I;
    public final List A0J;
    public final List A0K;
    public final List A0L;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UPY) {
                UPY upy = (UPY) obj;
                if (!C14360o3.A0K(this.A08, upy.A08) || !C14360o3.A0K(this.A0L, upy.A0L) || !C14360o3.A0K(this.A0A, upy.A0A) || !C14360o3.A0K(this.A0B, upy.A0B) || this.A03 != upy.A03 || this.A02 != upy.A02 || !C14360o3.A0K(this.A0H, upy.A0H) || !C14360o3.A0K(this.A0I, upy.A0I) || this.A06 != upy.A06 || !C14360o3.A0K(this.A05, upy.A05) || !C14360o3.A0K(this.A0C, upy.A0C) || !C14360o3.A0K(this.A0G, upy.A0G) || !C14360o3.A0K(this.A0J, upy.A0J) || !C14360o3.A0K(this.A0F, upy.A0F) || !C14360o3.A0K(this.A0K, upy.A0K) || Double.compare(this.A00, upy.A00) != 0 || Double.compare(this.A01, upy.A01) != 0 || this.A04 != upy.A04 || !C14360o3.A0K(this.A09, upy.A09) || !C14360o3.A0K(this.A0D, upy.A0D) || this.A07 != upy.A07 || !C14360o3.A0K(this.A0E, upy.A0E)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int A0K = (((((((((((((((((((AbstractC166997dE.A0K(this.A0C, ((((((((((((((((((this.A08.hashCode() * 31) + AbstractC167017dG.A0M(this.A0L)) * 31) + AbstractC167017dG.A0O(this.A0A)) * 31) + AbstractC167017dG.A0O(this.A0B)) * 31) + this.A03) * 31) + this.A02) * 31) + AbstractC167017dG.A0M(this.A0H)) * 31) + AbstractC167017dG.A0M(this.A0I)) * 31) + AbstractC167017dG.A0M(this.A06)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC167017dG.A0M(this.A0G)) * 31) + AbstractC167017dG.A0M(this.A0J)) * 31) + AbstractC167017dG.A0M(this.A0F)) * 31) + AbstractC167017dG.A0M(this.A0K)) * 31) + AbstractC28006CWd.A00(this.A00)) * 31) + AbstractC28006CWd.A00(this.A01)) * 31) + this.A04) * 31) + AbstractC167017dG.A0O(this.A09)) * 31) + AbstractC167017dG.A0O(this.A0D)) * 31) + AbstractC167017dG.A0M(this.A07)) * 31;
        List list = this.A0E;
        if (list != null) {
            i = list.hashCode();
        }
        return A0K + i;
    }

    public UPY(AdvantageAudienceData advantageAudienceData, TargetingRelaxationConstants targetingRelaxationConstants, XIGIGBoostDestination xIGIGBoostDestination, UserSession userSession, String str, String str2, String str3, String str4, String str5, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, double d, double d2, int i, int i2, int i3) {
        this.A08 = userSession;
        this.A0L = list;
        this.A0A = str;
        this.A0B = str2;
        this.A03 = i;
        this.A02 = i2;
        this.A0H = list2;
        this.A0I = list3;
        this.A06 = targetingRelaxationConstants;
        this.A05 = advantageAudienceData;
        this.A0C = str3;
        this.A0G = list4;
        this.A0J = list5;
        this.A0F = list6;
        this.A0K = list7;
        this.A00 = d;
        this.A01 = d2;
        this.A04 = i3;
        this.A09 = str4;
        this.A0D = str5;
        this.A07 = xIGIGBoostDestination;
        this.A0E = list8;
    }
}
