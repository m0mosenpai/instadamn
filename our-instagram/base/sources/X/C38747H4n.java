package X;

import com.instagram.api.schemas.FundraiserCampaignStateEnum;

/* renamed from: X.H4n, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38747H4n extends C0T6 implements InterfaceC43480JIs {
    public final FundraiserCampaignStateEnum A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38747H4n) {
                C38747H4n c38747H4n = (C38747H4n) obj;
                if (!C14360o3.A0K(this.A01, c38747H4n.A01) || this.A00 != c38747H4n.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0O(this.A01) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public C38747H4n(FundraiserCampaignStateEnum fundraiserCampaignStateEnum, String str) {
        this.A01 = str;
        this.A00 = fundraiserCampaignStateEnum;
    }
}
