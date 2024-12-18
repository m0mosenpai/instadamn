package X;

import com.instagram.api.schemas.IGCTMessagingAdsInfoDict;
import com.instagram.api.schemas.OnFeedMessages;
import com.instagram.api.schemas.PrivacyDisclosureInfoImpl;
import com.instagram.api.schemas.SocialProofInfoImpl;
import com.instagram.api.schemas.WhatsAppAttributionInfoImpl;
import java.io.IOException;

/* renamed from: X.51a, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1116151a {
    public static IGCTMessagingAdsInfoDict parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            Boolean bool = null;
            Boolean bool2 = null;
            OnFeedMessages onFeedMessages = null;
            String str2 = null;
            PrivacyDisclosureInfoImpl privacyDisclosureInfoImpl = null;
            String str3 = null;
            String str4 = null;
            Boolean bool3 = null;
            Boolean bool4 = null;
            SocialProofInfoImpl socialProofInfoImpl = null;
            WhatsAppAttributionInfoImpl whatsAppAttributionInfoImpl = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("igAdvertiserId".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("isActive".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("isEligibleForOnFeedMessages".equals(A0q)) {
                    bool2 = Boolean.valueOf(c16l.A0d());
                } else if ("model".equals(A0q)) {
                    onFeedMessages = AbstractC1116251b.parseFromJson(c16l);
                } else if ("pageID".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("privacyDisclosureInfo".equals(A0q)) {
                    privacyDisclosureInfoImpl = AbstractC1116551i.parseFromJson(c16l);
                } else if ("responsivenessText".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("secondaryCTASubtitle".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("shouldNavigateToThread".equals(A0q)) {
                    bool3 = Boolean.valueOf(c16l.A0d());
                } else if ("shouldTreatLinkStickerAsCTA".equals(A0q)) {
                    bool4 = Boolean.valueOf(c16l.A0d());
                } else if ("socialProofInfo".equals(A0q)) {
                    socialProofInfoImpl = AbstractC1116651l.parseFromJson(c16l);
                } else if ("whatsaAppAttributionInfo".equals(A0q)) {
                    whatsAppAttributionInfoImpl = AbstractC1116751o.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new IGCTMessagingAdsInfoDict(onFeedMessages, privacyDisclosureInfoImpl, socialProofInfoImpl, whatsAppAttributionInfoImpl, bool, bool2, bool3, bool4, str, str2, str3, str4);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
