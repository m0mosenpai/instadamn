package X;

import com.facebook.iabadscontext.IABAdsBwIntegrationExtension;
import com.instagram.api.schemas.AchievementButtonInfo;
import com.instagram.business.promote.model.InstagramMediaProductType;
import com.instagram.business.promote.model.PromoteButtonAction;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import java.util.List;

/* loaded from: classes10.dex */
public final class QIz extends C0T6 {
    public final int A00 = 0;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public QIz(IABAdsBwIntegrationExtension iABAdsBwIntegrationExtension) {
        this(iABAdsBwIntegrationExtension.A01, iABAdsBwIntegrationExtension.A02, iABAdsBwIntegrationExtension.A03, iABAdsBwIntegrationExtension.A07, iABAdsBwIntegrationExtension.A05, iABAdsBwIntegrationExtension.A06, iABAdsBwIntegrationExtension.A08);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QIz.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int A0L;
        int A07;
        switch (this.A00) {
            case 0:
                Integer num = (Integer) this.A01;
                int A0C = AbstractC25230BEn.A0C(num, AbstractC61778RtY.A00(num)) * 31;
                Integer num2 = (Integer) this.A03;
                A0L = (((((((AbstractC167017dG.A0L(num2, AbstractC61779RtZ.A00(num2), A0C) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31;
                A07 = AbstractC25227BEk.A07(this.A07);
                break;
            case 1:
                A07 = AbstractC166997dE.A0J(this.A02, AbstractC166997dE.A0J(this.A01, AbstractC166997dE.A0K(this.A07, AbstractC166997dE.A0K(this.A04, AbstractC166997dE.A0K(this.A05, AbstractC166987dD.A0J(this.A06))))));
                A0L = AbstractC167017dG.A0M(this.A03);
                break;
            case 2:
                A07 = AbstractC166997dE.A0K(this.A06, (((((AbstractC166997dE.A0K(this.A04, AbstractC166987dD.A0G(this.A01)) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC166997dE.A0I(this.A03)) * 31);
                A0L = this.A07.hashCode();
                break;
            default:
                return super.hashCode();
        }
        return A0L + A07;
    }

    public final String toString() {
        StringBuilder A1C;
        String str;
        String str2;
        switch (this.A00) {
            case 0:
                A1C = AbstractC166987dD.A1C();
                A1C.append("BwIAdsInfo(bwIType=");
                Integer num = (Integer) this.A01;
                if (num != null) {
                    str = AbstractC61778RtY.A00(num);
                } else {
                    str = "null";
                }
                A1C.append(str);
                A1C.append(", partnerType=");
                Integer num2 = (Integer) this.A03;
                if (num2 != null) {
                    str2 = AbstractC61779RtZ.A00(num2);
                } else {
                    str2 = "null";
                }
                A1C.append(str2);
                A1C.append(", initialUrl=");
                A1C.append(this.A06);
                A1C.append(", oauthIntegrationId=");
                A1C.append(this.A02);
                A1C.append(", apiKey=");
                A1C.append(this.A04);
                A1C.append(", bauProductUrl=");
                A1C.append(this.A05);
                A1C.append(", pageName=");
                A1C.append(this.A07);
                break;
            case 1:
                A1C = AbstractC166987dD.A1C();
                A1C.append("PromotionInformationData(screenTitle=");
                A1C.append(this.A06);
                A1C.append(", displayTitle=");
                A1C.append(this.A05);
                A1C.append(", displayBody=");
                A1C.append(this.A04);
                A1C.append(MSV.A00(643));
                A1C.append(this.A07);
                A1C.append(", mediaProductType=");
                A1C.append(this.A01);
                A1C.append(", primaryButtonAction=");
                A1C.append(this.A02);
                A1C.append(", secondaryButtonAction=");
                A1C.append(this.A03);
                break;
            default:
                return super.toString();
        }
        return AbstractC167017dG.A0p(A1C);
    }

    public QIz(InstagramMediaProductType instagramMediaProductType, PromoteButtonAction promoteButtonAction, PromoteButtonAction promoteButtonAction2, String str, String str2, String str3, String str4) {
        this.A06 = str;
        this.A05 = str2;
        this.A04 = str3;
        this.A07 = str4;
        this.A01 = instagramMediaProductType;
        this.A02 = promoteButtonAction;
        this.A03 = promoteButtonAction2;
    }

    public QIz(ImageUrl imageUrl, User user, Long l, String str, String str2, String str3, String str4) {
        this.A06 = str;
        this.A01 = user;
        this.A02 = imageUrl;
        this.A07 = str2;
        this.A03 = l;
        this.A04 = str3;
        this.A05 = str4;
    }

    public QIz(AchievementButtonInfo achievementButtonInfo, AchievementButtonInfo achievementButtonInfo2, String str, String str2, String str3, String str4, List list) {
        C14360o3.A0B(list, 1);
        C14360o3.A0B(str, 2);
        AbstractC167017dG.A1U(str3, str4);
        this.A01 = list;
        this.A04 = str;
        this.A05 = str2;
        this.A02 = achievementButtonInfo;
        this.A03 = achievementButtonInfo2;
        this.A06 = str3;
        this.A07 = str4;
    }

    public QIz(Integer num, Integer num2, Long l, String str, String str2, String str3, String str4) {
        AbstractC167017dG.A1P(num, num2);
        this.A01 = num;
        this.A03 = num2;
        this.A06 = str;
        this.A02 = l;
        this.A04 = str2;
        this.A05 = str3;
        this.A07 = str4;
    }
}
