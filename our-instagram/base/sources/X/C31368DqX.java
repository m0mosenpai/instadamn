package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.fanclub.intf.UserPayFanclubUpsellParams;
import com.instagram.fx.igxfb.IgxfbNetEgoCTABannerParams;
import com.instagram.profile.intf.AutoLaunchReelParams;
import com.instagram.profile.intf.UserDetailEntryInfo;
import com.instagram.profile.intf.UserDetailLaunchConfig;
import com.instagram.sponsored.analytics.SourceModelInfoParams;

/* renamed from: X.DqX, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31368DqX {
    public UserPayFanclubUpsellParams A00;
    public IgxfbNetEgoCTABannerParams A01;
    public AutoLaunchReelParams A02;
    public UserDetailEntryInfo A03;
    public SourceModelInfoParams A04;
    public Boolean A05;
    public Long A06;
    public Long A07;
    public String A08;
    public String A09;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public String A0P;
    public String A0Q;
    public String A0R;
    public String A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public final String A0m;
    public final String A0n;
    public boolean A0l = true;
    public boolean A0W = true;
    public String A0A = "";

    public final UserDetailLaunchConfig A03() {
        String str = this.A0n;
        String str2 = this.A0B;
        String str3 = this.A0m;
        String str4 = this.A0S;
        String str5 = this.A0R;
        AutoLaunchReelParams autoLaunchReelParams = this.A02;
        boolean z = this.A0l;
        String str6 = this.A0H;
        String str7 = this.A0D;
        String str8 = this.A0E;
        String str9 = this.A0L;
        String str10 = this.A0G;
        SourceModelInfoParams sourceModelInfoParams = this.A04;
        boolean z2 = this.A0X;
        boolean z3 = this.A0a;
        UserDetailEntryInfo userDetailEntryInfo = this.A03;
        boolean z4 = this.A0V;
        String str11 = this.A0O;
        boolean z5 = this.A0c;
        boolean z6 = this.A0b;
        boolean z7 = this.A0d;
        String str12 = this.A08;
        String str13 = this.A0N;
        String str14 = this.A09;
        String str15 = this.A0J;
        String str16 = this.A0K;
        boolean z8 = this.A0W;
        UserPayFanclubUpsellParams userPayFanclubUpsellParams = this.A00;
        boolean z9 = this.A0i;
        String str17 = this.A0P;
        String str18 = this.A0Q;
        Long l = this.A07;
        Long l2 = this.A06;
        boolean z10 = this.A0T;
        boolean z11 = this.A0f;
        boolean z12 = this.A0Y;
        boolean z13 = this.A0j;
        String str19 = this.A0C;
        boolean z14 = this.A0e;
        String str20 = this.A0A;
        String str21 = this.A0M;
        boolean z15 = this.A0h;
        boolean z16 = this.A0g;
        String str22 = this.A0F;
        boolean z17 = this.A0k;
        return new UserDetailLaunchConfig(null, userPayFanclubUpsellParams, this.A01, autoLaunchReelParams, userDetailEntryInfo, sourceModelInfoParams, this.A05, l, l2, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, this.A0I, null, z, z2, z3, z4, z5, z6, z7, false, z8, z9, z10, z11, z12, z13, z14, z15, z16, z17, this.A0U, this.A0Z);
    }

    public C31368DqX(String str, String str2, String str3) {
        this.A0n = str;
        this.A0B = str2;
        this.A0m = str3;
    }

    public static Fragment A00(UserSession userSession, C28431Ze c28431Ze, C31368DqX c31368DqX) {
        return c28431Ze.A02(userSession, c31368DqX.A03());
    }

    public static void A01(C140966Yy c140966Yy, UserSession userSession, C28431Ze c28431Ze, C31368DqX c31368DqX) {
        c140966Yy.A0E(c28431Ze.A02(userSession, c31368DqX.A03()));
        c140966Yy.A04();
    }

    public static void A02(C140966Yy c140966Yy, UserSession userSession, C28431Ze c28431Ze, C31368DqX c31368DqX) {
        c140966Yy.A0D(c28431Ze.A02(userSession, c31368DqX.A03()));
        c140966Yy.A04();
    }
}
