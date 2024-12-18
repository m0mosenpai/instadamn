package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf;
import com.instagram.api.schemas.OnFeedMessagesIntf;
import com.instagram.api.schemas.PrivacyDisclosureInfo;
import com.instagram.api.schemas.SocialProofInfo;
import com.instagram.api.schemas.WhatsAppAttributionInfo;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class HoC {
    public static Map A00(IGCTMessagingAdsInfoDictIntf iGCTMessagingAdsInfoDictIntf) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        TreeUpdaterJNI treeUpdaterJNI3;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (iGCTMessagingAdsInfoDictIntf.BFQ() != null) {
            A1I.put("igAdvertiserId", iGCTMessagingAdsInfoDictIntf.BFQ());
        }
        if (iGCTMessagingAdsInfoDictIntf.CPO() != null) {
            A1I.put("isActive", iGCTMessagingAdsInfoDictIntf.CPO());
        }
        if (iGCTMessagingAdsInfoDictIntf.CTO() != null) {
            A1I.put("isEligibleForOnFeedMessages", iGCTMessagingAdsInfoDictIntf.CTO());
        }
        TreeUpdaterJNI treeUpdaterJNI4 = null;
        if (iGCTMessagingAdsInfoDictIntf.BUJ() != null) {
            OnFeedMessagesIntf BUJ = iGCTMessagingAdsInfoDictIntf.BUJ();
            if (BUJ != null) {
                treeUpdaterJNI3 = BUJ.F7o();
            } else {
                treeUpdaterJNI3 = null;
            }
            A1I.put("model", treeUpdaterJNI3);
        }
        if (iGCTMessagingAdsInfoDictIntf.Bay() != null) {
            A1I.put("pageID", iGCTMessagingAdsInfoDictIntf.Bay());
        }
        if (iGCTMessagingAdsInfoDictIntf.Bgc() != null) {
            PrivacyDisclosureInfo Bgc = iGCTMessagingAdsInfoDictIntf.Bgc();
            if (Bgc != null) {
                treeUpdaterJNI2 = Bgc.F7o();
            } else {
                treeUpdaterJNI2 = null;
            }
            A1I.put("privacyDisclosureInfo", treeUpdaterJNI2);
        }
        if (iGCTMessagingAdsInfoDictIntf.Bon() != null) {
            A1I.put("responsivenessText", iGCTMessagingAdsInfoDictIntf.Bon());
        }
        if (iGCTMessagingAdsInfoDictIntf.BrS() != null) {
            A1I.put("secondaryCTASubtitle", iGCTMessagingAdsInfoDictIntf.BrS());
        }
        if (iGCTMessagingAdsInfoDictIntf.BvD() != null) {
            A1I.put("shouldNavigateToThread", iGCTMessagingAdsInfoDictIntf.BvD());
        }
        if (iGCTMessagingAdsInfoDictIntf.Bvq() != null) {
            A1I.put("shouldTreatLinkStickerAsCTA", iGCTMessagingAdsInfoDictIntf.Bvq());
        }
        if (iGCTMessagingAdsInfoDictIntf.ByW() != null) {
            SocialProofInfo ByW = iGCTMessagingAdsInfoDictIntf.ByW();
            if (ByW != null) {
                treeUpdaterJNI = ByW.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("socialProofInfo", treeUpdaterJNI);
        }
        if (iGCTMessagingAdsInfoDictIntf.CHW() != null) {
            WhatsAppAttributionInfo CHW = iGCTMessagingAdsInfoDictIntf.CHW();
            if (CHW != null) {
                treeUpdaterJNI4 = CHW.F7o();
            }
            A1I.put("whatsaAppAttributionInfo", treeUpdaterJNI4);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
