package X;

import com.instagram.api.schemas.FanClubFanConsiderationPageFeatureEligibilityResponse;
import com.instagram.api.schemas.FanClubFanConsiderationPageFeatureEligibilityResponseImpl;
import com.instagram.api.schemas.FanClubInfoDictImpl;
import java.io.IOException;

/* renamed from: X.16t, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC223816t {
    public static FanClubInfoDictImpl parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool = null;
            Integer num = null;
            String str = null;
            String str2 = null;
            FanClubFanConsiderationPageFeatureEligibilityResponseImpl fanClubFanConsiderationPageFeatureEligibilityResponseImpl = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            Boolean bool4 = null;
            String str3 = null;
            Integer num2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("autosave_to_exclusive_highlight".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("connected_member_count".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("fan_club_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("fan_club_name".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("fan_consideration_page_revamp_eligiblity".equals(A0q)) {
                    fanClubFanConsiderationPageFeatureEligibilityResponseImpl = C3XM.parseFromJson(c16l);
                } else if ("has_enough_subscribers_for_ssc".equals(A0q)) {
                    bool2 = Boolean.valueOf(c16l.A0d());
                } else if ("is_fan_club_gifting_eligible".equals(A0q)) {
                    bool3 = Boolean.valueOf(c16l.A0d());
                } else if ("is_fan_club_referral_eligible".equals(A0q)) {
                    bool4 = Boolean.valueOf(c16l.A0d());
                } else if ("largest_public_bc_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("subscriber_count".equals(A0q)) {
                    num2 = Integer.valueOf(c16l.A1D());
                }
                c16l.A0z();
            }
            return new FanClubInfoDictImpl(fanClubFanConsiderationPageFeatureEligibilityResponseImpl, bool, bool2, bool3, bool4, num, num2, str, str2, str3);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, FanClubInfoDictImpl fanClubInfoDictImpl) {
        anonymousClass182.A0d();
        Boolean bool = fanClubInfoDictImpl.A01;
        if (bool != null) {
            anonymousClass182.A0T("autosave_to_exclusive_highlight", bool.booleanValue());
        }
        Integer num = fanClubInfoDictImpl.A05;
        if (num != null) {
            anonymousClass182.A0Q("connected_member_count", num.intValue());
        }
        String str = fanClubInfoDictImpl.A07;
        if (str != null) {
            anonymousClass182.A0S("fan_club_id", str);
        }
        String str2 = fanClubInfoDictImpl.A08;
        if (str2 != null) {
            anonymousClass182.A0S("fan_club_name", str2);
        }
        FanClubFanConsiderationPageFeatureEligibilityResponse fanClubFanConsiderationPageFeatureEligibilityResponse = fanClubInfoDictImpl.A00;
        if (fanClubFanConsiderationPageFeatureEligibilityResponse != null) {
            anonymousClass182.A0r("fan_consideration_page_revamp_eligiblity");
            FanClubFanConsiderationPageFeatureEligibilityResponseImpl EtP = fanClubFanConsiderationPageFeatureEligibilityResponse.EtP();
            anonymousClass182.A0d();
            anonymousClass182.A0T("should_show_content_preview", EtP.A00);
            anonymousClass182.A0T("should_show_social_context", EtP.A01);
            anonymousClass182.A0a();
        }
        Boolean bool2 = fanClubInfoDictImpl.A02;
        if (bool2 != null) {
            anonymousClass182.A0T("has_enough_subscribers_for_ssc", bool2.booleanValue());
        }
        Boolean bool3 = fanClubInfoDictImpl.A03;
        if (bool3 != null) {
            anonymousClass182.A0T("is_fan_club_gifting_eligible", bool3.booleanValue());
        }
        Boolean bool4 = fanClubInfoDictImpl.A04;
        if (bool4 != null) {
            anonymousClass182.A0T("is_fan_club_referral_eligible", bool4.booleanValue());
        }
        String str3 = fanClubInfoDictImpl.A09;
        if (str3 != null) {
            anonymousClass182.A0S("largest_public_bc_id", str3);
        }
        Integer num2 = fanClubInfoDictImpl.A06;
        if (num2 != null) {
            anonymousClass182.A0Q("subscriber_count", num2.intValue());
        }
        anonymousClass182.A0a();
    }
}
