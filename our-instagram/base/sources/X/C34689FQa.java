package X;

import com.facebook.pando.TreeJNI;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.FanClubFanConsiderationPageFeatureEligibilityResponse;
import com.instagram.api.schemas.FanClubFanConsiderationPageFeatureEligibilityResponseImpl;
import com.instagram.api.schemas.FanClubInfoDict;
import com.instagram.api.schemas.FanClubInfoDictImpl;
import com.instagram.api.schemas.ImmutablePandoFanClubInfoDict;

/* renamed from: X.FQa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C34689FQa {
    public FanClubFanConsiderationPageFeatureEligibilityResponse A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Boolean A04;
    public Integer A05;
    public Integer A06;
    public String A07;
    public String A08;
    public String A09;
    public final FanClubInfoDict A0A;

    public final FanClubInfoDict A00() {
        FanClubFanConsiderationPageFeatureEligibilityResponseImpl fanClubFanConsiderationPageFeatureEligibilityResponseImpl;
        Object fanClubInfoDictImpl;
        TreeUpdaterJNI treeUpdaterJNI;
        Object obj = this.A0A;
        if (obj instanceof ImmutablePandoFanClubInfoDict) {
            TreeUpdaterJNI treeUpdaterJNI2 = TreeUpdaterJNI.$redex_init_class;
            C09530e4 A1L = AbstractC166987dD.A1L("autosave_to_exclusive_highlight", this.A01);
            C09530e4 A1L2 = AbstractC166987dD.A1L("connected_member_count", this.A05);
            C09530e4 A1L3 = AbstractC166987dD.A1L("fan_club_id", this.A07);
            C09530e4 A1L4 = AbstractC166987dD.A1L("fan_club_name", this.A08);
            FanClubFanConsiderationPageFeatureEligibilityResponse fanClubFanConsiderationPageFeatureEligibilityResponse = this.A00;
            if (fanClubFanConsiderationPageFeatureEligibilityResponse != null) {
                treeUpdaterJNI = fanClubFanConsiderationPageFeatureEligibilityResponse.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            TreeJNI treeJNI = (TreeJNI) obj;
            fanClubInfoDictImpl = AbstractC25234BEr.A0P(treeJNI, AbstractC06930Yk.A06(A1L, A1L2, A1L3, A1L4, AbstractC166987dD.A1L("fan_consideration_page_revamp_eligiblity", treeUpdaterJNI), AbstractC166987dD.A1L("has_enough_subscribers_for_ssc", this.A02), AbstractC166987dD.A1L("is_fan_club_gifting_eligible", this.A03), AbstractC166987dD.A1L("is_fan_club_referral_eligible", this.A04), AbstractC166987dD.A1L("largest_public_bc_id", this.A09), AbstractC166987dD.A1L("subscriber_count", this.A06))).applyToTree(treeJNI);
            C14360o3.A07(fanClubInfoDictImpl);
        } else {
            Boolean bool = this.A01;
            Integer num = this.A05;
            String str = this.A07;
            String str2 = this.A08;
            FanClubFanConsiderationPageFeatureEligibilityResponse fanClubFanConsiderationPageFeatureEligibilityResponse2 = this.A00;
            if (fanClubFanConsiderationPageFeatureEligibilityResponse2 != null) {
                fanClubFanConsiderationPageFeatureEligibilityResponseImpl = fanClubFanConsiderationPageFeatureEligibilityResponse2.EtP();
            } else {
                fanClubFanConsiderationPageFeatureEligibilityResponseImpl = null;
            }
            fanClubInfoDictImpl = new FanClubInfoDictImpl(fanClubFanConsiderationPageFeatureEligibilityResponseImpl, bool, this.A02, this.A03, this.A04, num, this.A06, str, str2, this.A09);
        }
        return (FanClubInfoDict) fanClubInfoDictImpl;
    }

    public C34689FQa(FanClubInfoDict fanClubInfoDict) {
        this.A0A = fanClubInfoDict;
        this.A01 = fanClubInfoDict.AeJ();
        this.A05 = fanClubInfoDict.AqM();
        this.A07 = fanClubInfoDict.getFanClubId();
        this.A08 = fanClubInfoDict.getFanClubName();
        this.A00 = fanClubInfoDict.B4S();
        this.A02 = fanClubInfoDict.BBZ();
        this.A03 = fanClubInfoDict.CUI();
        this.A04 = fanClubInfoDict.CUK();
        this.A09 = fanClubInfoDict.BLB();
        this.A06 = fanClubInfoDict.C3U();
    }
}
