package X;

import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.IaI, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41569IaI {
    public static final Map A00;

    public static final String A00(UserSession userSession, String str, boolean z) {
        if (z && C18U.A06(C06090Tz.A05, userSession, 36319360147397847L) && str != null && str.length() != 0) {
            Map map = A00;
            Iterator it = map.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String A1B = AbstractC166987dD.A1B(it);
                if (AbstractC001900j.A0a(str, A1B, false)) {
                    String A1A = AbstractC166987dD.A1A(A1B, map);
                    if (A1A != null) {
                        return A1A;
                    }
                }
            }
        }
        return str;
    }

    static {
        C09530e4[] c09530e4Arr = new C09530e4[28];
        System.arraycopy(AbstractC25230BEn.A1b("suicide_or_self_harm_concern-eating_disorder", "ig_ad_offensive"), AbstractC31175DnJ.A1b(new C09530e4[]{AbstractC166987dD.A1L("fraud_or_scam-financial_or_identity_scam", "ig_ad_scam_misleading"), AbstractC166987dD.A1L("fraud_or_scam-misleading_product_or_service", "ig_ad_scam_misleading"), AbstractC166987dD.A1L("fake_celebrity_endorsement", "ig_ad_scam_misleading"), AbstractC166987dD.A1L("fake_advertiser", "ig_ad_business_impersonation"), AbstractC166987dD.A1L("misleading_annoying_or_scam-annoying_or_spam", "ig_ad_spam"), AbstractC166987dD.A1L("false_news", "ig_ad_scam_misleading"), AbstractC166987dD.A1L("unauthorized_political_ad", "ig_ad_political"), AbstractC166987dD.A1L("adult_content-threatening_to_share_nude_images", "ig_ad_sexually_inappropriate"), AbstractC166987dD.A1L("adult_content-prostitution", "ig_ad_sexually_inappropriate"), AbstractC166987dD.A1L("adult_content-sexual_exploitation", "ig_ad_sexually_inappropriate"), AbstractC166987dD.A1L("adult_content-nudity_or_sexual_activity", "ig_ad_sexually_inappropriate"), AbstractC166987dD.A1L("violent_hateful_or_disturbing-credible_threat", "ig_ad_violent_prohibited"), AbstractC166987dD.A1L("human_trafficking", "ig_ad_violent_prohibited"), AbstractC166987dD.A1L("violence_hate_or_exploitation-sexual_exploitation-yes", "ig_ad_violent_prohibited"), AbstractC166987dD.A1L("violence_hate_or_exploitation-sexual_exploitation-no", "ig_ad_violent_prohibited"), AbstractC166987dD.A1L("violent_hateful_or_disturbing-terrorism", "ig_ad_violent_prohibited"), AbstractC166987dD.A1L("violent_hateful_or_disturbing-violence", "ig_ad_violent_prohibited"), AbstractC166987dD.A1L("violent_hateful_or_disturbing-organised_crime", "ig_ad_violent_prohibited"), AbstractC166987dD.A1L("violent_hateful_or_disturbing-promotes_hate-organised_hate_group", "ig_ad_violent_prohibited"), AbstractC166987dD.A1L("violent_hateful_or_disturbing-promotes_hate-contains_hateful_speech", "ig_ad_violent_prohibited"), AbstractC166987dD.A1L("violent_hateful_or_disturbing-violence_death_or_severe_injury", "ig_ad_violent_prohibited"), AbstractC166987dD.A1L("violent_hateful_or_disturbing-animal_abuse", "ig_ad_violent_prohibited"), AbstractC166987dD.A1L("harrassment_or_abuse-harassment-me", "ig_ad_offensive"), AbstractC166987dD.A1L("ig_bullying_or_harassment-harassment-someone_i_know_v3", "ig_ad_offensive"), AbstractC166987dD.A1L("harrassment_or_abuse-harassment-someone_i_dont_know", "ig_ad_offensive"), AbstractC166987dD.A1L("intellectual_property", "ig_ad_ip_violation"), AbstractC166987dD.A1L("suicide_or_self_harm_concern-suicide_or_self_injury", "ig_ad_offensive")}, c09530e4Arr) ? 1 : 0, c09530e4Arr, 27, 1);
        A00 = AbstractC06930Yk.A06(c09530e4Arr);
    }
}
