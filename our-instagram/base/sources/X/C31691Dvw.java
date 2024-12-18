package X;

import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import com.instagram.explore.topiccluster.ExploreTopicCluster;

/* renamed from: X.Dvw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31691Dvw extends C0T6 {
    public final ExploreTopicCluster A00;
    public final Integer A01;
    public final String A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C31691Dvw) {
                C31691Dvw c31691Dvw = (C31691Dvw) obj;
                if (!C14360o3.A0K(this.A02, c31691Dvw.A02) || !C14360o3.A0K(this.A03, c31691Dvw.A03) || this.A01 != c31691Dvw.A01 || !C14360o3.A0K(this.A00, c31691Dvw.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A0K = AbstractC166997dE.A0K(this.A03, AbstractC167017dG.A0O(this.A02) * 31);
        int intValue = this.A01.intValue();
        switch (intValue) {
            case 1:
                str = "GhostPill";
                break;
            case 2:
                str = "ManageInterest";
                break;
            case 3:
                str = "TopicPickerDefault";
                break;
            case 4:
                str = "TopicPickerFollowed";
                break;
            default:
                str = ServerW3CShippingAddressConstants.DEFAULT;
                break;
        }
        return AbstractC25231BEo.A0H(str, intValue, A0K) + AbstractC166997dE.A0I(this.A00);
    }

    public C31691Dvw(ExploreTopicCluster exploreTopicCluster, Integer num, String str, String str2) {
        this.A02 = str;
        this.A03 = str2;
        this.A01 = num;
        this.A00 = exploreTopicCluster;
    }
}
