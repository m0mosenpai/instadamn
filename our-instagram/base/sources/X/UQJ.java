package X;

import com.instagram.api.schemas.AdGeoLocationType;
import com.instagram.api.schemas.AdvantageAudienceData;
import com.instagram.api.schemas.TargetingRelaxationConstants;
import com.instagram.business.promote.model.AudienceGeoLocation;
import com.instagram.business.promote.model.PromoteAudienceInfo;
import java.util.List;

/* loaded from: classes11.dex */
public final class UQJ extends C0T6 {
    public int A00;
    public int A01;
    public AdvantageAudienceData A02;
    public TargetingRelaxationConstants A03;
    public String A04;
    public String A05;
    public List A06;
    public List A07;
    public List A08;
    public boolean A09;

    public UQJ(PromoteAudienceInfo promoteAudienceInfo) {
        C14360o3.A0B(promoteAudienceInfo, 1);
        this.A04 = null;
        this.A05 = null;
        this.A01 = 0;
        this.A00 = 0;
        this.A06 = null;
        this.A07 = null;
        this.A08 = null;
        this.A03 = null;
        this.A02 = null;
        this.A09 = false;
        this.A04 = promoteAudienceInfo.A04;
        this.A05 = promoteAudienceInfo.A05;
        this.A01 = promoteAudienceInfo.A01;
        this.A00 = promoteAudienceInfo.A00;
        this.A06 = promoteAudienceInfo.A06;
        this.A07 = promoteAudienceInfo.A07;
        this.A08 = promoteAudienceInfo.A08;
        this.A03 = promoteAudienceInfo.A03;
        this.A02 = promoteAudienceInfo.A02;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.UQJ, java.lang.Object] */
    public static /* synthetic */ UQJ A00(AdvantageAudienceData advantageAudienceData, TargetingRelaxationConstants targetingRelaxationConstants, UQJ uqj, String str, List list, List list2, List list3, int i, int i2, int i3, boolean z) {
        String str2 = (i3 & 1) != 0 ? uqj.A04 : null;
        if ((i3 & 2) != 0) {
            str = uqj.A05;
        }
        if ((i3 & 4) != 0) {
            i = uqj.A01;
        }
        if ((i3 & 8) != 0) {
            i2 = uqj.A00;
        }
        if ((i3 & 16) != 0) {
            list = uqj.A06;
        }
        if ((i3 & 32) != 0) {
            list2 = uqj.A07;
        }
        if ((i3 & 64) != 0) {
            list3 = uqj.A08;
        }
        if ((i3 & 128) != 0) {
            targetingRelaxationConstants = uqj.A03;
        }
        if ((i3 & 256) != 0) {
            advantageAudienceData = uqj.A02;
        }
        if ((i3 & 512) != 0) {
            z = uqj.A09;
        }
        ?? obj = new Object();
        obj.A04 = str2;
        obj.A05 = str;
        obj.A01 = i;
        obj.A00 = i2;
        obj.A06 = list;
        obj.A07 = list2;
        obj.A08 = list3;
        obj.A03 = targetingRelaxationConstants;
        obj.A02 = advantageAudienceData;
        obj.A09 = z;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UQJ) {
                UQJ uqj = (UQJ) obj;
                if (!C14360o3.A0K(this.A04, uqj.A04) || !C14360o3.A0K(this.A05, uqj.A05) || this.A01 != uqj.A01 || this.A00 != uqj.A00 || !C14360o3.A0K(this.A06, uqj.A06) || !C14360o3.A0K(this.A07, uqj.A07) || !C14360o3.A0K(this.A08, uqj.A08) || this.A03 != uqj.A03 || !C14360o3.A0K(this.A02, uqj.A02) || this.A09 != uqj.A09) {
                }
            }
            return false;
        }
        return true;
    }

    public final AudienceGeoLocation A01() {
        AdGeoLocationType adGeoLocationType;
        List list = this.A07;
        if (list == null || list.size() != 1) {
            return null;
        }
        AdGeoLocationType adGeoLocationType2 = ((AudienceGeoLocation) AbstractC001800i.A0I(list)).A03;
        if (adGeoLocationType2 != null) {
            adGeoLocationType = VRX.A00(adGeoLocationType2);
        } else {
            adGeoLocationType = null;
        }
        if (adGeoLocationType != AdGeoLocationType.A07) {
            return null;
        }
        return (AudienceGeoLocation) AbstractC001800i.A0I(list);
    }

    public final int hashCode() {
        int i = 0;
        int A0O = ((((((((((((((AbstractC167017dG.A0O(this.A04) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + this.A01) * 31) + this.A00) * 31) + AbstractC167017dG.A0M(this.A06)) * 31) + AbstractC167017dG.A0M(this.A07)) * 31) + AbstractC167017dG.A0M(this.A08)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31;
        AdvantageAudienceData advantageAudienceData = this.A02;
        if (advantageAudienceData != null) {
            i = advantageAudienceData.hashCode();
        }
        int i2 = (A0O + i) * 31;
        int i3 = 1237;
        if (this.A09) {
            i3 = 1231;
        }
        return i2 + i3;
    }

    public UQJ() {
        this.A04 = null;
        this.A05 = null;
        this.A01 = 0;
        this.A00 = 0;
        this.A06 = null;
        this.A07 = null;
        this.A08 = null;
        this.A03 = null;
        this.A02 = null;
        this.A09 = false;
    }
}
