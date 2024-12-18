package X;

import com.instagram.api.schemas.IntentAwareAdsFormatInfo;
import com.instagram.api.schemas.IntentAwareAdsFormatInfoImpl;
import com.instagram.api.schemas.IntentAwareAdsFormatType;
import com.instagram.api.schemas.IntentAwareAdsInfo;
import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class ION {
    public static IntentAwareAdsInfo parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            IntentAwareAdsFormatInfoImpl intentAwareAdsFormatInfoImpl = null;
            String str = null;
            Boolean bool = null;
            String str2 = null;
            Integer num = null;
            String str3 = null;
            String str4 = null;
            Integer num2 = null;
            String str5 = null;
            String str6 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("format_info".equals(A0s)) {
                    intentAwareAdsFormatInfoImpl = AbstractC40033HpK.parseFromJson(c16l);
                } else if ("insertion_mechanism".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("is_seed_ad_eligible".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("multi_ads_first_ad_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("multi_ads_type".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("multi_ads_unit_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("seed_ad_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("seed_ad_position".equals(A0s)) {
                    num2 = AbstractC166997dE.A0h(c16l);
                } else if ("seed_ad_token".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if ("trigger_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str6 = null;
                    } else {
                        str6 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            return new IntentAwareAdsInfo(intentAwareAdsFormatInfoImpl, bool, num, num2, str, str2, str3, str4, str5, str6);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, IntentAwareAdsInfo intentAwareAdsInfo) {
        anonymousClass182.A0d();
        IntentAwareAdsFormatInfo intentAwareAdsFormatInfo = intentAwareAdsInfo.A00;
        if (intentAwareAdsFormatInfo != null) {
            anonymousClass182.A0r("format_info");
            IntentAwareAdsFormatInfoImpl Evi = intentAwareAdsFormatInfo.Evi();
            anonymousClass182.A0d();
            IntentAwareAdsFormatType intentAwareAdsFormatType = Evi.A00;
            if (intentAwareAdsFormatType != null) {
                anonymousClass182.A0S("format", intentAwareAdsFormatType.A00);
            }
            AbstractC37301Gc2.A1F(anonymousClass182, Evi.A01);
            anonymousClass182.A0a();
        }
        String str = intentAwareAdsInfo.A04;
        if (str != null) {
            anonymousClass182.A0S("insertion_mechanism", str);
        }
        Boolean bool = intentAwareAdsInfo.A01;
        if (bool != null) {
            anonymousClass182.A0T("is_seed_ad_eligible", bool.booleanValue());
        }
        String str2 = intentAwareAdsInfo.A05;
        if (str2 != null) {
            anonymousClass182.A0S("multi_ads_first_ad_id", str2);
        }
        Integer num = intentAwareAdsInfo.A02;
        if (num != null) {
            anonymousClass182.A0Q("multi_ads_type", num.intValue());
        }
        String str3 = intentAwareAdsInfo.A06;
        if (str3 != null) {
            anonymousClass182.A0S("multi_ads_unit_id", str3);
        }
        String str4 = intentAwareAdsInfo.A07;
        if (str4 != null) {
            anonymousClass182.A0S("seed_ad_id", str4);
        }
        Integer num2 = intentAwareAdsInfo.A03;
        if (num2 != null) {
            anonymousClass182.A0Q("seed_ad_position", num2.intValue());
        }
        String str5 = intentAwareAdsInfo.A08;
        if (str5 != null) {
            anonymousClass182.A0S("seed_ad_token", str5);
        }
        String str6 = intentAwareAdsInfo.A09;
        if (str6 != null) {
            anonymousClass182.A0S("trigger_type", str6);
        }
        anonymousClass182.A0a();
    }
}
