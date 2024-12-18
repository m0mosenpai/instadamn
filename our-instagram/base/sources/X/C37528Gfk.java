package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ImmutablePandoIntentAwareAdsInfo;
import com.instagram.api.schemas.IntentAwareAdsFormatInfo;
import com.instagram.api.schemas.IntentAwareAdsFormatInfoImpl;
import com.instagram.api.schemas.IntentAwareAdsInfo;
import com.instagram.api.schemas.IntentAwareAdsInfoIntf;

/* renamed from: X.Gfk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37528Gfk {
    public IntentAwareAdsFormatInfo A00;
    public Boolean A01;
    public Integer A02;
    public Integer A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public final IntentAwareAdsInfoIntf A0A;

    public final IntentAwareAdsInfoIntf A00() {
        IntentAwareAdsFormatInfoImpl intentAwareAdsFormatInfoImpl;
        Object intentAwareAdsInfo;
        TreeUpdaterJNI treeUpdaterJNI;
        IntentAwareAdsInfoIntf intentAwareAdsInfoIntf = this.A0A;
        if (intentAwareAdsInfoIntf instanceof ImmutablePandoIntentAwareAdsInfo) {
            TreeUpdaterJNI treeUpdaterJNI2 = TreeUpdaterJNI.$redex_init_class;
            IntentAwareAdsFormatInfo intentAwareAdsFormatInfo = this.A00;
            if (intentAwareAdsFormatInfo != null) {
                treeUpdaterJNI = intentAwareAdsFormatInfo.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            intentAwareAdsInfo = AbstractC37303Gc4.A06(intentAwareAdsInfoIntf, new C09530e4[]{AbstractC166987dD.A1L("format_info", treeUpdaterJNI), AbstractC166987dD.A1L("insertion_mechanism", this.A04), AbstractC166987dD.A1L("is_seed_ad_eligible", this.A01), AbstractC166987dD.A1L("multi_ads_first_ad_id", this.A05), AbstractC166987dD.A1L("multi_ads_type", this.A02), AbstractC166987dD.A1L("multi_ads_unit_id", this.A06), AbstractC166987dD.A1L("seed_ad_id", this.A07), AbstractC166987dD.A1L("seed_ad_position", this.A03), AbstractC166987dD.A1L("seed_ad_token", this.A08), AbstractC166987dD.A1L("trigger_type", this.A09)});
        } else {
            IntentAwareAdsFormatInfo intentAwareAdsFormatInfo2 = this.A00;
            if (intentAwareAdsFormatInfo2 != null) {
                intentAwareAdsFormatInfoImpl = intentAwareAdsFormatInfo2.Evi();
            } else {
                intentAwareAdsFormatInfoImpl = null;
            }
            String str = this.A04;
            Boolean bool = this.A01;
            String str2 = this.A05;
            intentAwareAdsInfo = new IntentAwareAdsInfo(intentAwareAdsFormatInfoImpl, bool, this.A02, this.A03, str, str2, this.A06, this.A07, this.A08, this.A09);
        }
        return (IntentAwareAdsInfoIntf) intentAwareAdsInfo;
    }

    public C37528Gfk(IntentAwareAdsInfo intentAwareAdsInfo) {
        this.A0A = intentAwareAdsInfo;
        this.A00 = intentAwareAdsInfo.B7z();
        this.A04 = intentAwareAdsInfo.BIG();
        this.A01 = intentAwareAdsInfo.CcZ();
        this.A05 = intentAwareAdsInfo.BVC();
        this.A02 = intentAwareAdsInfo.BVJ();
        this.A06 = intentAwareAdsInfo.BVL();
        this.A07 = intentAwareAdsInfo.Brx();
        this.A03 = intentAwareAdsInfo.Bry();
        this.A08 = intentAwareAdsInfo.Brz();
        this.A09 = intentAwareAdsInfo.CB4();
    }
}
