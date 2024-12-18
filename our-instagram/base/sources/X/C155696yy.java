package X;

import com.instagram.aistudio.profile.model.AiStudioProfileBannerModel;
import com.instagram.fanclub.intf.FanClubGuidedActivationProfileBannerParams;
import com.instagram.fanclub.intf.UserPayFanclubUpsellParams;
import com.instagram.sponsored.analytics.SourceModelInfoParams;
import com.instagram.user.model.User;

/* renamed from: X.6yy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C155696yy {
    public int A00;
    public C9C7 A01;
    public AiStudioProfileBannerModel A02;
    public C6C9 A03;
    public C155306yJ A04;
    public C1338462s A05;
    public FanClubGuidedActivationProfileBannerParams A06;
    public UserPayFanclubUpsellParams A07;
    public C38321qM A08;
    public MWW A09;
    public InterfaceC678133v A0A;
    public C33616EtS A0B;
    public C154536x3 A0C;
    public SourceModelInfoParams A0D;
    public User A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        User user = this.A0E;
        int i13 = 0;
        if (user != null) {
            i = user.hashCode();
        } else {
            i = 0;
        }
        int i14 = ((((i * 31) + (this.A0K ? 1 : 0)) * 31) + this.A00) * 31 * 31;
        C38321qM c38321qM = this.A08;
        if (c38321qM != null) {
            i2 = c38321qM.hashCode();
        } else {
            i2 = 0;
        }
        int i15 = (i14 + i2) * 31;
        SourceModelInfoParams sourceModelInfoParams = this.A0D;
        if (sourceModelInfoParams != null) {
            i3 = sourceModelInfoParams.hashCode();
        } else {
            i3 = 0;
        }
        int i16 = (i15 + i3) * 31;
        C154536x3 c154536x3 = this.A0C;
        if (c154536x3 != null) {
            i4 = c154536x3.hashCode();
        } else {
            i4 = 0;
        }
        int i17 = (i16 + i4) * 31;
        C155306yJ c155306yJ = this.A04;
        if (c155306yJ != null) {
            i5 = c155306yJ.hashCode();
        } else {
            i5 = 0;
        }
        int i18 = (i17 + i5) * 31;
        C9C7 c9c7 = this.A01;
        if (c9c7 != null) {
            i6 = c9c7.hashCode();
        } else {
            i6 = 0;
        }
        int i19 = (i18 + i6) * 31;
        C33616EtS c33616EtS = this.A0B;
        if (c33616EtS != null) {
            i7 = c33616EtS.hashCode();
        } else {
            i7 = 0;
        }
        int i20 = (((i19 + i7) * 31) + (this.A0J ? 1 : 0)) * 31;
        String str = this.A0H;
        if (str != null) {
            i8 = str.hashCode();
        } else {
            i8 = 0;
        }
        int i21 = (i20 + i8) * 31;
        String str2 = this.A0G;
        if (str2 != null) {
            i9 = str2.hashCode();
        } else {
            i9 = 0;
        }
        int i22 = (i21 + i9) * 31;
        String str3 = this.A0F;
        if (str3 != null) {
            i10 = str3.hashCode();
        } else {
            i10 = 0;
        }
        int i23 = (i22 + i10) * 31;
        UserPayFanclubUpsellParams userPayFanclubUpsellParams = this.A07;
        if (userPayFanclubUpsellParams != null) {
            i11 = userPayFanclubUpsellParams.hashCode();
        } else {
            i11 = 0;
        }
        int i24 = (i23 + i11) * 31;
        C1338462s c1338462s = this.A05;
        if (c1338462s != null) {
            i12 = c1338462s.hashCode();
        } else {
            i12 = 0;
        }
        int i25 = (i24 + i12) * 31;
        AiStudioProfileBannerModel aiStudioProfileBannerModel = this.A02;
        if (aiStudioProfileBannerModel != null) {
            i13 = aiStudioProfileBannerModel.hashCode();
        }
        return ((((i25 + i13) * 31) + (this.A0M ? 1 : 0)) * 31) + (this.A0I ? 1 : 0);
    }
}
