package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.AdFormatType;
import com.instagram.api.schemas.AppstoreMetadataDict;
import com.instagram.api.schemas.AppstoreMetadataDictImpl;
import com.instagram.api.schemas.BrandedContentAdsPaidPartnershipLabelRemovalOption;
import com.instagram.api.schemas.CallAdsInfoDict;
import com.instagram.api.schemas.CallAdsInfoDictImpl;
import com.instagram.api.schemas.DynamicProductAdDisplayOption;
import com.instagram.api.schemas.IGAdCreativeStory9x16CaptionData;
import com.instagram.api.schemas.IGAdCreativeStory9x16CaptionDataImpl;
import com.instagram.api.schemas.IGAdProfileProductTabDict;
import com.instagram.api.schemas.IGAdProfileProductTabDictImpl;
import com.instagram.api.schemas.IGAdsIABScreenshotDataDict;
import com.instagram.api.schemas.IGAdsIABScreenshotDataDictImpl;
import com.instagram.api.schemas.IGCTATextVariant;
import com.instagram.api.schemas.IGCTATextVariantImpl;
import com.instagram.api.schemas.IGCTMessagingAdsInfoDict;
import com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf;
import com.instagram.api.schemas.IGRFSurveyInfoDict;
import com.instagram.api.schemas.IGRFSurveyInfoDictImpl;
import com.instagram.api.schemas.ImmutablePandoAppstoreMetadataDict;
import com.instagram.api.schemas.ImmutablePandoCallAdsInfoDict;
import com.instagram.api.schemas.ImmutablePandoIGAdCreativeStory9x16CaptionData;
import com.instagram.api.schemas.ImmutablePandoIGAdProfileProductTabDict;
import com.instagram.api.schemas.ImmutablePandoIGAdsIABScreenshotDataDict;
import com.instagram.api.schemas.ImmutablePandoIGCTATextVariant;
import com.instagram.api.schemas.ImmutablePandoIGCTMessagingAdsInfoDict;
import com.instagram.api.schemas.ImmutablePandoIGRFSurveyInfoDict;
import com.instagram.api.schemas.ImmutablePandoTestimonialDict;
import com.instagram.api.schemas.TestimonialDict;
import com.instagram.api.schemas.TestimonialDictImpl;
import com.instagram.feed.media.ImmutablePandoMediaDict;
import com.instagram.model.androidlink.AndroidLink;
import com.instagram.model.androidlink.ImmutablePandoAndroidLink;
import com.instagram.model.mediatype.CTAStyle;
import com.instagram.sponsored.signals.model.AdsCTATrustInfo;
import com.instagram.sponsored.signals.model.AdsCTATrustInfoIntf;
import com.instagram.sponsored.signals.model.AdsIAWRatingInfo;
import com.instagram.sponsored.signals.model.AdsIAWRatingInfoIntf;
import com.instagram.sponsored.signals.model.AdsRatingInfo;
import com.instagram.sponsored.signals.model.AdsRatingInfoIntf;
import com.instagram.sponsored.signals.model.AdsTextTrustInfo;
import com.instagram.sponsored.signals.model.AdsTextTrustInfoIntf;
import com.instagram.sponsored.signals.model.ImmutablePandoAdsCTATrustInfo;
import com.instagram.sponsored.signals.model.ImmutablePandoAdsIAWRatingInfo;
import com.instagram.sponsored.signals.model.ImmutablePandoAdsRatingInfo;
import com.instagram.sponsored.signals.model.ImmutablePandoAdsTextTrustInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3vu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C87863vu extends C17T implements InterfaceC39541sb {
    public InterfaceC104774nh A00;
    public IGAdProfileProductTabDict A01;
    public InterfaceC104924o5 A02;
    public TestimonialDict A03;
    public InterfaceC105004oG A04;
    public InterfaceC38901rP A05;
    public List A06;

    @Override // X.InterfaceC39541sb
    public final C914346k AgT() {
        return null;
    }

    @Override // X.InterfaceC39541sb
    public final C39531sa F4v(C1DV c1dv) {
        return F4u(new C1DY(c1dv, 6, false));
    }

    private final List A01(C1DY c1dy) {
        ImmutableList A08 = A08(100526016, ImmutablePandoMediaDict.class);
        if (A08 != null) {
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(A08, 10));
            Iterator<E> it = A08.iterator();
            while (it.hasNext()) {
                ImmutablePandoMediaDict immutablePandoMediaDict = (ImmutablePandoMediaDict) it.next();
                C38801rC c38801rC = C38321qM.A0h;
                C14360o3.A0A(immutablePandoMediaDict);
                arrayList.add(C38801rC.A00(c1dy, immutablePandoMediaDict));
            }
            return arrayList;
        }
        return null;
    }

    @Override // X.InterfaceC39541sb
    public final /* synthetic */ C87853vt AKj() {
        return new C87853vt(this);
    }

    @Override // X.InterfaceC39541sb
    public final InterfaceC104764ng AZB() {
        return (InterfaceC104764ng) A05(-1593201482, HWb.class);
    }

    @Override // X.InterfaceC39541sb
    public final InterfaceC37891pS AZO() {
        return (InterfaceC37891pS) A05(-167621279, HWZ.class);
    }

    @Override // X.InterfaceC39541sb
    public final InterfaceC87713vf AZQ() {
        return (InterfaceC87713vf) A05(-1422642818, C39216HOz.class);
    }

    @Override // X.InterfaceC39541sb
    public final InterfaceC37891pS Aa3() {
        return (InterfaceC37891pS) A05(309576122, HWZ.class);
    }

    @Override // X.InterfaceC39541sb
    public final AdsIAWRatingInfoIntf Aa6() {
        return (AdsIAWRatingInfoIntf) A05(-369249631, ImmutablePandoAdsIAWRatingInfo.class);
    }

    @Override // X.InterfaceC39541sb
    public final AdsRatingInfoIntf AaD() {
        return (AdsRatingInfoIntf) A05(566794394, ImmutablePandoAdsRatingInfo.class);
    }

    @Override // X.InterfaceC39541sb
    public final InterfaceC104774nh AaF() {
        InterfaceC104774nh interfaceC104774nh = this.A00;
        if (interfaceC104774nh == null) {
            return (InterfaceC104774nh) A05(2045846486, C39181HMj.class);
        }
        return interfaceC104774nh;
    }

    @Override // X.InterfaceC39541sb
    public final InterfaceC39271s5 AaR() {
        return (InterfaceC39271s5) A05(682005289, C39185HMo.class);
    }

    @Override // X.InterfaceC39541sb
    public final AppstoreMetadataDict AcT() {
        return (AppstoreMetadataDict) A05(160943406, ImmutablePandoAppstoreMetadataDict.class);
    }

    @Override // X.InterfaceC39541sb
    public final BrandedContentAdsPaidPartnershipLabelRemovalOption Afo() {
        return (BrandedContentAdsPaidPartnershipLabelRemovalOption) A0N(-985471814, JCX.A00);
    }

    @Override // X.InterfaceC39541sb
    public final InterfaceC104784ni AjP() {
        return (InterfaceC104784ni) A05(-533849090, HNK.class);
    }

    @Override // X.InterfaceC39541sb
    public final CallAdsInfoDict Ajk() {
        return (CallAdsInfoDict) A05(-608037986, ImmutablePandoCallAdsInfoDict.class);
    }

    @Override // X.InterfaceC39541sb
    public final List Ame() {
        return A08(-1211607222, HNL.class);
    }

    @Override // X.InterfaceC39541sb
    public final InterfaceC39281s8 Ann() {
        return (InterfaceC39281s8) A05(1406625574, HPe.class);
    }

    @Override // X.InterfaceC39541sb
    public final List Ark() {
        return A08(-295216049, HNL.class);
    }

    @Override // X.InterfaceC39541sb
    public final InterfaceC104794nk Asn() {
        return (InterfaceC104794nk) A05(-1153378822, HOH.class);
    }

    @Override // X.InterfaceC39541sb
    public final InterfaceC104804nl Asp() {
        return (InterfaceC104804nl) A05(-570023199, HOI.class);
    }

    @Override // X.InterfaceC39541sb
    public final InterfaceC104814nm Atg() {
        return (InterfaceC104814nm) A05(-816224899, HNM.class);
    }

    @Override // X.InterfaceC39541sb
    public final CTAStyle Atm() {
        return (CTAStyle) A0N(476264130, JCY.A00);
    }

    @Override // X.InterfaceC39541sb
    public final InterfaceC87573vP Atv() {
        return (InterfaceC87573vP) A05(-1286346871, HNW.class);
    }

    @Override // X.InterfaceC39541sb
    public final InterfaceC39301sB Aty() {
        return (InterfaceC39301sB) A05(1829539395, HNX.class);
    }

    @Override // X.InterfaceC39541sb
    public final IGCTMessagingAdsInfoDictIntf Au0() {
        return (IGCTMessagingAdsInfoDictIntf) A05(-926784535, ImmutablePandoIGCTMessagingAdsInfoDict.class);
    }

    @Override // X.InterfaceC39541sb
    public final InterfaceC104824nn Au1() {
        return (InterfaceC104824nn) A05(-1575976657, HNY.class);
    }

    @Override // X.InterfaceC39541sb
    public final List Azx() {
        return A08(1887846250, C39210HOg.class);
    }

    @Override // X.InterfaceC39541sb
    public final DynamicProductAdDisplayOption B02() {
        return (DynamicProductAdDisplayOption) A0N(-1572866338, JCZ.A00);
    }

    @Override // X.InterfaceC39541sb
    public final InterfaceC104834np B5i() {
        return (InterfaceC104834np) A05(518596130, C33013EhC.class);
    }

    @Override // X.InterfaceC39541sb
    public final AdFormatType B82() {
        return (AdFormatType) A0N(1458614914, C43307JCa.A00);
    }

    @Override // X.InterfaceC39541sb
    public final InterfaceC104844nr B9f() {
        return (InterfaceC104844nr) A05(1828016905, HPB.class);
    }

    @Override // X.InterfaceC39541sb
    public final List BDm() {
        return A08(-983661271, HPM.class);
    }

    @Override // X.InterfaceC39541sb
    public final InterfaceC39391sK BEV() {
        return (InterfaceC39391sK) A05(104010, HPi.class);
    }

    @Override // X.InterfaceC39541sb
    public final InterfaceC39421sN BEa() {
        return (InterfaceC39421sN) A05(1599949067, HPj.class);
    }

    @Override // X.InterfaceC39541sb
    public final InterfaceC104854ns BFH() {
        return (InterfaceC104854ns) A05(1875822737, C68048V8a.class);
    }

    @Override // X.InterfaceC39541sb
    public final InterfaceC104864nt BFI() {
        return (InterfaceC104864nt) A05(-402579701, C68049V8b.class);
    }

    @Override // X.InterfaceC39541sb
    public final AdsCTATrustInfoIntf BFJ() {
        return (AdsCTATrustInfoIntf) A05(-292288265, ImmutablePandoAdsCTATrustInfo.class);
    }

    @Override // X.InterfaceC39541sb
    public final AdsTextTrustInfoIntf BFK() {
        return (AdsTextTrustInfoIntf) A05(649944304, ImmutablePandoAdsTextTrustInfo.class);
    }

    @Override // X.InterfaceC39541sb
    public final IGAdsIABScreenshotDataDict BFN() {
        return (IGAdsIABScreenshotDataDict) A05(1580830910, ImmutablePandoIGAdsIABScreenshotDataDict.class);
    }

    @Override // X.InterfaceC39541sb
    public final IGCTATextVariant BFZ() {
        return (IGCTATextVariant) A05(-842046426, ImmutablePandoIGCTATextVariant.class);
    }

    @Override // X.InterfaceC39541sb
    public final InterfaceC88193wT BFe() {
        return (InterfaceC88193wT) A05(1431755399, C27249C0m.class);
    }

    @Override // X.InterfaceC39541sb
    public final InterfaceC104874ny BFf() {
        return (InterfaceC104874ny) A05(872587249, C27251C0o.class);
    }

    @Override // X.InterfaceC39541sb
    public final InterfaceC104884nz BG5() {
        return (InterfaceC104884nz) A05(421345560, HQK.class);
    }

    @Override // X.InterfaceC39541sb
    public final InterfaceC104894o0 BG6() {
        return (InterfaceC104894o0) A05(-1240456943, HQL.class);
    }

    @Override // X.InterfaceC39541sb
    public final IGRFSurveyInfoDict BGD() {
        return (IGRFSurveyInfoDict) A05(-889553367, ImmutablePandoIGRFSurveyInfoDict.class);
    }

    @Override // X.InterfaceC39541sb
    public final InterfaceC104904o2 BGF() {
        return (InterfaceC104904o2) A05(1390140446, C0p.class);
    }

    @Override // X.InterfaceC39541sb
    public final C46j BGM() {
        return (C46j) A05(-2128019800, C1C.class);
    }

    @Override // X.InterfaceC39541sb
    public final InterfaceC38221qC BJK() {
        return (InterfaceC38221qC) A05(-955246378, HXK.class);
    }

    @Override // X.InterfaceC39541sb
    public final List BMi() {
        return A08(2105301271, ImmutablePandoAndroidLink.class);
    }

    @Override // X.InterfaceC39541sb
    public final List BMo() {
        return A08(193745717, ImmutablePandoAndroidLink.class);
    }

    @Override // X.InterfaceC39541sb
    public final InterfaceC104914o3 BMq() {
        return (InterfaceC104914o3) A05(-57386478, C39222HPn.class);
    }

    @Override // X.InterfaceC39541sb
    public final C46j BQT() {
        return (C46j) A05(1758667881, C1C.class);
    }

    @Override // X.InterfaceC39541sb
    public final C4o4 BSs() {
        return (C4o4) A05(-94351386, HR4.class);
    }

    @Override // X.InterfaceC39541sb
    public final InterfaceC104924o5 BVd() {
        InterfaceC104924o5 interfaceC104924o5 = this.A02;
        if (interfaceC104924o5 == null) {
            return (InterfaceC104924o5) A05(-780321144, HT4.class);
        }
        return interfaceC104924o5;
    }

    @Override // X.InterfaceC39541sb
    public final InterfaceC104934o6 BYm() {
        return (InterfaceC104934o6) A05(-1699641528, C14.class);
    }

    @Override // X.InterfaceC39541sb
    public final InterfaceC104944o7 BeI() {
        return (InterfaceC104944o7) A05(1455378029, C39247HRk.class);
    }

    @Override // X.InterfaceC39541sb
    public final List Bf8() {
        return A0p(-563721412, C43308JCb.A00);
    }

    @Override // X.InterfaceC39541sb
    public final List Bf9() {
        return A0p(-2012696332, C25110B9g.A00);
    }

    @Override // X.InterfaceC39541sb
    public final IGAdProfileProductTabDict Bi3() {
        IGAdProfileProductTabDict iGAdProfileProductTabDict = this.A01;
        if (iGAdProfileProductTabDict == null) {
            return (IGAdProfileProductTabDict) A05(1285758778, ImmutablePandoIGAdProfileProductTabDict.class);
        }
        return iGAdProfileProductTabDict;
    }

    @Override // X.InterfaceC39541sb
    public final C47W BiD() {
        return (C47W) A05(-749700953, HSM.class);
    }

    @Override // X.InterfaceC39541sb
    public final C4o9 Bm0() {
        return (C4o9) A05(1239608894, C39303HXc.class);
    }

    @Override // X.InterfaceC39541sb
    public final InterfaceC104954oA Bm1() {
        return (InterfaceC104954oA) A05(2009579145, HXd.class);
    }

    @Override // X.InterfaceC39541sb
    public final InterfaceC104964oB But() {
        return (InterfaceC104964oB) A05(1710237709, HQU.class);
    }

    @Override // X.InterfaceC39541sb
    public final InterfaceC104974oC BzH() {
        return (InterfaceC104974oC) A05(1548981937, C1H.class);
    }

    @Override // X.InterfaceC39541sb
    public final InterfaceC104984oD C1Q() {
        return (InterfaceC104984oD) A05(-117255030, HTM.class);
    }

    @Override // X.InterfaceC39541sb
    public final IGAdCreativeStory9x16CaptionData C4k() {
        return (IGAdCreativeStory9x16CaptionData) A05(-1139417117, ImmutablePandoIGAdCreativeStory9x16CaptionData.class);
    }

    @Override // X.InterfaceC39541sb
    public final InterfaceC38901rP C5p() {
        InterfaceC38901rP interfaceC38901rP = this.A05;
        if (interfaceC38901rP == null) {
            return (InterfaceC38901rP) A05(-965505206, C37956Gmy.class);
        }
        return interfaceC38901rP;
    }

    @Override // X.InterfaceC39541sb
    public final TestimonialDict C5q() {
        TestimonialDict testimonialDict = this.A03;
        if (testimonialDict == null) {
            return (TestimonialDict) A05(30484369, ImmutablePandoTestimonialDict.class);
        }
        return testimonialDict;
    }

    @Override // X.InterfaceC39541sb
    public final InterfaceC104994oF C6P() {
        return (InterfaceC104994oF) A05(934064958, HQT.class);
    }

    @Override // X.InterfaceC39541sb
    public final InterfaceC105004oG CDT() {
        InterfaceC105004oG interfaceC105004oG = this.A04;
        if (interfaceC105004oG == null) {
            return (InterfaceC105004oG) A05(1238212428, HVO.class);
        }
        return interfaceC105004oG;
    }

    @Override // X.InterfaceC39541sb
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(AbstractC37394Gda.A00(this), this);
    }

    @Override // X.InterfaceC39541sb
    public final List getItems() {
        return this.A06;
    }

    @Override // X.InterfaceC39541sb
    public final String AXn() {
        return A0i(-1192534288);
    }

    @Override // X.InterfaceC39541sb
    public final String AYx() {
        return A0j(-1650554971);
    }

    @Override // X.InterfaceC39541sb
    public final String AZ3() {
        return A0i(243470802);
    }

    @Override // X.InterfaceC39541sb
    public final Long AZC() {
        return A0L(1394689863);
    }

    @Override // X.InterfaceC39541sb
    public final String AZE() {
        return A0j(92655287);
    }

    @Override // X.InterfaceC39541sb
    public final Integer AZL() {
        return getOptionalIntValueByHashCode(-2020695524);
    }

    @Override // X.InterfaceC39541sb
    public final String AZR() {
        return A0i(-1359893700);
    }

    @Override // X.InterfaceC39541sb
    public final String AaI() {
        return A0i(2033156745);
    }

    @Override // X.InterfaceC39541sb
    public final String AcH() {
        return A0j(-1411074055);
    }

    @Override // X.InterfaceC39541sb
    public final List AiV() {
        return getOptionalIntListByHashCode(1763309900);
    }

    @Override // X.InterfaceC39541sb
    public final Long AiY() {
        return A0L(-383562417);
    }

    @Override // X.InterfaceC39541sb
    public final String AkD() {
        return A0j(2083788458);
    }

    @Override // X.InterfaceC39541sb
    public final String ArY() {
        return A0i(-1108302649);
    }

    @Override // X.InterfaceC39541sb
    public final String Asj() {
        return A0i(1523404155);
    }

    @Override // X.InterfaceC39541sb
    public final Boolean Axd() {
        return getOptionalBooleanValueByHashCode(669973513);
    }

    @Override // X.InterfaceC39541sb
    public final String AyU() {
        return A0i(1341635297);
    }

    @Override // X.InterfaceC39541sb
    public final Boolean AyV() {
        return getOptionalBooleanValueByHashCode(-732595499);
    }

    @Override // X.InterfaceC39541sb
    public final Boolean Ayi() {
        return getOptionalBooleanValueByHashCode(1546691918);
    }

    @Override // X.InterfaceC39541sb
    public final Integer AzC() {
        return getOptionalIntValueByHashCode(-1156866267);
    }

    @Override // X.InterfaceC39541sb
    public final Boolean B1Q() {
        return getOptionalBooleanValueByHashCode(-463750539);
    }

    @Override // X.InterfaceC39541sb
    public final Boolean B1h() {
        return getOptionalBooleanValueByHashCode(-388021690);
    }

    @Override // X.InterfaceC39541sb
    public final String B4X() {
        return A0j(617356508);
    }

    @Override // X.InterfaceC39541sb
    public final String B4v() {
        return A0i(266416098);
    }

    @Override // X.InterfaceC39541sb
    public final Integer BA3() {
        return getOptionalIntValueByHashCode(2034576965);
    }

    @Override // X.InterfaceC39541sb
    public final Integer BDh() {
        return getOptionalIntValueByHashCode(-1555005202);
    }

    @Override // X.InterfaceC39541sb
    public final String BDj() {
        return A0i(686704055);
    }

    @Override // X.InterfaceC39541sb
    public final String BEc() {
        return A0i(-1505401810);
    }

    @Override // X.InterfaceC39541sb
    public final String BFc() {
        return A0i(-277445838);
    }

    @Override // X.InterfaceC39541sb
    public final Integer BH5() {
        return getOptionalIntValueByHashCode(632151045);
    }

    @Override // X.InterfaceC39541sb
    public final Integer BHB() {
        return getOptionalIntValueByHashCode(1550511618);
    }

    @Override // X.InterfaceC39541sb
    public final Integer BKC() {
        return getOptionalIntValueByHashCode(-2141142810);
    }

    @Override // X.InterfaceC39541sb
    public final String BKx() {
        return A0i(102727412);
    }

    @Override // X.InterfaceC39541sb
    public final Boolean BMh() {
        return getOptionalBooleanValueByHashCode(-1758543067);
    }

    @Override // X.InterfaceC39541sb
    public final String BMj() {
        return A0i(-701807740);
    }

    @Override // X.InterfaceC39541sb
    public final Boolean BMl() {
        return getOptionalBooleanValueByHashCode(-1503904634);
    }

    @Override // X.InterfaceC39541sb
    public final String BMm() {
        return A0j(-1697466332);
    }

    @Override // X.InterfaceC39541sb
    public final Boolean BMp() {
        return getOptionalBooleanValueByHashCode(-2101345088);
    }

    @Override // X.InterfaceC39541sb
    public final String BNP() {
        return A0i(-1410034208);
    }

    @Override // X.InterfaceC39541sb
    public final String BNT() {
        return A0i(-1624294830);
    }

    @Override // X.InterfaceC39541sb
    public final String BZH() {
        return A0i(427397093);
    }

    @Override // X.InterfaceC39541sb
    public final String Baa() {
        return A0i(924848935);
    }

    @Override // X.InterfaceC39541sb
    public final List Baq() {
        return A0n(-774319794);
    }

    @Override // X.InterfaceC39541sb
    public final String Baz() {
        return A0j(-803548981);
    }

    @Override // X.InterfaceC39541sb
    public final String Bck() {
        return A0i(-612351174);
    }

    @Override // X.InterfaceC39541sb
    public final Boolean Bv2() {
        return getOptionalBooleanValueByHashCode(-1007197316);
    }

    @Override // X.InterfaceC39541sb
    public final Boolean BvW() {
        return getOptionalBooleanValueByHashCode(736103798);
    }

    @Override // X.InterfaceC39541sb
    public final Boolean Bvg() {
        return getOptionalBooleanValueByHashCode(-260609927);
    }

    @Override // X.InterfaceC39541sb
    public final Boolean Bvw() {
        return getOptionalBooleanValueByHashCode(-1831214760);
    }

    @Override // X.InterfaceC39541sb
    public final Boolean BwT() {
        return getOptionalBooleanValueByHashCode(-1903660933);
    }

    @Override // X.InterfaceC39541sb
    public final Boolean Bwg() {
        return getOptionalBooleanValueByHashCode(-1641698328);
    }

    @Override // X.InterfaceC39541sb
    public final String CAR() {
        return A0i(-1938614671);
    }

    @Override // X.InterfaceC39541sb
    public final Integer CEO() {
        return getOptionalIntValueByHashCode(-641011977);
    }

    @Override // X.InterfaceC39541sb
    public final List CFu() {
        return getOptionalStringListByHashCode(-1573023373);
    }

    @Override // X.InterfaceC39541sb
    public final Boolean CPy() {
        return getOptionalBooleanValueByHashCode(1784862051);
    }

    @Override // X.InterfaceC39541sb
    public final Boolean CQK() {
        return getOptionalBooleanValueByHashCode(-24105094);
    }

    @Override // X.InterfaceC39541sb
    public final Boolean CQW() {
        return getOptionalBooleanValueByHashCode(-430048452);
    }

    @Override // X.InterfaceC39541sb
    public final Boolean CQk() {
        return getOptionalBooleanValueByHashCode(1565244781);
    }

    @Override // X.InterfaceC39541sb
    public final Boolean CRf() {
        return getOptionalBooleanValueByHashCode(784863612);
    }

    @Override // X.InterfaceC39541sb
    public final Boolean CRg() {
        return getOptionalBooleanValueByHashCode(852642504);
    }

    @Override // X.InterfaceC39541sb
    public final Boolean CRm() {
        return getOptionalBooleanValueByHashCode(-1630877749);
    }

    @Override // X.InterfaceC39541sb
    public final Boolean CSS() {
        return getOptionalBooleanValueByHashCode(158239729);
    }

    @Override // X.InterfaceC39541sb
    public final Boolean CSW() {
        return getOptionalBooleanValueByHashCode(2081772504);
    }

    @Override // X.InterfaceC39541sb
    public final Boolean CU8() {
        return getOptionalBooleanValueByHashCode(2080043724);
    }

    @Override // X.InterfaceC39541sb
    public final Boolean CUh() {
        return getOptionalBooleanValueByHashCode(1443018240);
    }

    @Override // X.InterfaceC39541sb
    public final Boolean CV6() {
        return getOptionalBooleanValueByHashCode(224671005);
    }

    @Override // X.InterfaceC39541sb
    public final Boolean CVu() {
        return getOptionalBooleanValueByHashCode(-1702889446);
    }

    @Override // X.InterfaceC39541sb
    public final Boolean CW5() {
        return getOptionalBooleanValueByHashCode(1112511486);
    }

    @Override // X.InterfaceC39541sb
    public final Boolean CXL() {
        return getOptionalBooleanValueByHashCode(1859602719);
    }

    @Override // X.InterfaceC39541sb
    public final Boolean CXw() {
        return getOptionalBooleanValueByHashCode(-890554225);
    }

    @Override // X.InterfaceC39541sb
    public final Boolean CYx() {
        return getOptionalBooleanValueByHashCode(-33515775);
    }

    @Override // X.InterfaceC39541sb
    public final Boolean CaD() {
        return getOptionalBooleanValueByHashCode(-1275697362);
    }

    @Override // X.InterfaceC39541sb
    public final Boolean CaE() {
        return getOptionalBooleanValueByHashCode(-1387806465);
    }

    @Override // X.InterfaceC39541sb
    public final Boolean Caf() {
        return getOptionalBooleanValueByHashCode(409465363);
    }

    @Override // X.InterfaceC39541sb
    public final Boolean Caw() {
        return getOptionalBooleanValueByHashCode(-178973479);
    }

    @Override // X.InterfaceC39541sb
    public final Boolean Cc8() {
        return getOptionalBooleanValueByHashCode(-1091878802);
    }

    @Override // X.InterfaceC39541sb
    public final Boolean Ccp() {
        return getOptionalBooleanValueByHashCode(138640398);
    }

    @Override // X.InterfaceC39541sb
    public final Boolean CdF() {
        return getOptionalBooleanValueByHashCode(-525934283);
    }

    @Override // X.InterfaceC39541sb
    public final InterfaceC39541sb EBX(C1DY c1dy) {
        InterfaceC104774nh AaF = AaF();
        InterfaceC105004oG interfaceC105004oG = null;
        if (AaF != null) {
            AaF.E8h(c1dy);
        } else {
            AaF = null;
        }
        this.A00 = AaF;
        this.A06 = A01(c1dy);
        InterfaceC104924o5 BVd = BVd();
        if (BVd != null) {
            BVd.E9v(c1dy);
        } else {
            BVd = null;
        }
        this.A02 = BVd;
        IGAdProfileProductTabDict Bi3 = Bi3();
        if (Bi3 != null) {
            Bi3.E9A(c1dy);
        } else {
            Bi3 = null;
        }
        this.A01 = Bi3;
        InterfaceC38901rP C5p = C5p();
        if (C5p != null) {
            C5p.EBK(c1dy);
        } else {
            C5p = null;
        }
        this.A05 = C5p;
        TestimonialDict C5q = C5q();
        if (C5q != null) {
            C5q.EB1(c1dy);
        } else {
            C5q = null;
        }
        this.A03 = C5q;
        InterfaceC105004oG CDT = CDT();
        if (CDT != null) {
            CDT.EB9(c1dy);
            interfaceC105004oG = CDT;
        }
        this.A04 = interfaceC105004oG;
        return this;
    }

    @Override // X.InterfaceC39541sb
    public final C39531sa F4u(C1DY c1dy) {
        C5Fa c5Fa;
        C37881pR c37881pR;
        C87703ve c87703ve;
        C37881pR c37881pR2;
        AdsIAWRatingInfo adsIAWRatingInfo;
        AdsRatingInfo adsRatingInfo;
        C114555Fb c114555Fb;
        C1s4 c1s4;
        AppstoreMetadataDictImpl appstoreMetadataDictImpl;
        H2W h2w;
        CallAdsInfoDictImpl callAdsInfoDictImpl;
        ArrayList arrayList;
        C1s7 c1s7;
        ArrayList arrayList2;
        C114565Fc c114565Fc;
        C52r c52r;
        C114575Fd c114575Fd;
        C87563vO c87563vO;
        C1sA c1sA;
        IGCTMessagingAdsInfoDict iGCTMessagingAdsInfoDict;
        C38691H2c c38691H2c;
        ArrayList arrayList3;
        C114585Fe c114585Fe;
        C114595Ff c114595Ff;
        ArrayList arrayList4;
        C39381sJ c39381sJ;
        C39411sM c39411sM;
        UQv uQv;
        UQw uQw;
        AdsCTATrustInfo adsCTATrustInfo;
        AdsTextTrustInfo adsTextTrustInfo;
        IGAdsIABScreenshotDataDictImpl iGAdsIABScreenshotDataDictImpl;
        IGCTATextVariantImpl iGCTATextVariantImpl;
        C100444f8 c100444f8;
        C5L8 c5l8;
        C38730H3t c38730H3t;
        C1117552c c1117552c;
        IGRFSurveyInfoDictImpl iGRFSurveyInfoDictImpl;
        C106004qE c106004qE;
        C102724k9 c102724k9;
        C38211qB c38211qB;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        C108034tm c108034tm;
        C102724k9 c102724k92;
        C114605Fi c114605Fi;
        C114615Fj c114615Fj;
        C51L c51l;
        C106024qG c106024qG;
        IGAdProfileProductTabDictImpl iGAdProfileProductTabDictImpl;
        C104014mN c104014mN;
        C5Fk c5Fk;
        C5Fl c5Fl;
        C108344uL c108344uL;
        C106594rE c106594rE;
        H5V h5v;
        IGAdCreativeStory9x16CaptionDataImpl iGAdCreativeStory9x16CaptionDataImpl;
        C38891rO c38891rO;
        TestimonialDictImpl testimonialDictImpl;
        C38732H3v c38732H3v;
        C114625Fm c114625Fm;
        String A0i = A0i(-1192534288);
        String A0j = A0j(-1650554971);
        String A0i2 = A0i(243470802);
        InterfaceC104764ng AZB = AZB();
        if (AZB != null) {
            c5Fa = AZB.F5k();
        } else {
            c5Fa = null;
        }
        Long A0L = A0L(1394689863);
        String A0j2 = A0j(92655287);
        Integer optionalIntValueByHashCode = getOptionalIntValueByHashCode(-2020695524);
        InterfaceC37891pS AZO = AZO();
        if (AZO != null) {
            c37881pR = AZO.F5f();
        } else {
            c37881pR = null;
        }
        InterfaceC87713vf AZQ = AZQ();
        if (AZQ != null) {
            c87703ve = AZQ.EtZ();
        } else {
            c87703ve = null;
        }
        String A0i3 = A0i(-1359893700);
        InterfaceC37891pS Aa3 = Aa3();
        if (Aa3 != null) {
            c37881pR2 = Aa3.F5f();
        } else {
            c37881pR2 = null;
        }
        AdsIAWRatingInfoIntf Aa6 = Aa6();
        if (Aa6 != null) {
            adsIAWRatingInfo = Aa6.F7I();
        } else {
            adsIAWRatingInfo = null;
        }
        AdsRatingInfoIntf AaD = AaD();
        if (AaD != null) {
            adsRatingInfo = AaD.F7J();
        } else {
            adsRatingInfo = null;
        }
        InterfaceC104774nh AaF = AaF();
        if (AaF != null) {
            c114555Fb = AaF.Eqf(c1dy);
        } else {
            c114555Fb = null;
        }
        String A0i4 = A0i(2033156745);
        InterfaceC39271s5 AaR = AaR();
        if (AaR != null) {
            c1s4 = AaR.Eqj();
        } else {
            c1s4 = null;
        }
        String A0j3 = A0j(-1411074055);
        AppstoreMetadataDict AcT = AcT();
        if (AcT != null) {
            appstoreMetadataDictImpl = AcT.Eqw();
        } else {
            appstoreMetadataDictImpl = null;
        }
        BrandedContentAdsPaidPartnershipLabelRemovalOption Afo = Afo();
        ImmutableList optionalIntListByHashCode = getOptionalIntListByHashCode(1763309900);
        Long A0L2 = A0L(-383562417);
        InterfaceC104784ni AjP = AjP();
        if (AjP != null) {
            h2w = AjP.ErV();
        } else {
            h2w = null;
        }
        CallAdsInfoDict Ajk = Ajk();
        if (Ajk != null) {
            callAdsInfoDictImpl = Ajk.ErZ();
        } else {
            callAdsInfoDictImpl = null;
        }
        String A0j4 = A0j(2083788458);
        List Ame = Ame();
        if (Ame != null) {
            arrayList = new ArrayList(AbstractC06950Ym.A1E(Ame, 10));
            Iterator it = Ame.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC38791rB) it.next()).ErW());
            }
        } else {
            arrayList = null;
        }
        InterfaceC39281s8 Ann = Ann();
        if (Ann != null) {
            c1s7 = Ann.Eua();
        } else {
            c1s7 = null;
        }
        String A0i5 = A0i(-1108302649);
        ImmutableList optionalStringListByHashCode = getOptionalStringListByHashCode(952189583);
        List Ark = Ark();
        if (Ark != null) {
            arrayList2 = new ArrayList(AbstractC06950Ym.A1E(Ark, 10));
            Iterator it2 = Ark.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((InterfaceC38791rB) it2.next()).ErW());
            }
        } else {
            arrayList2 = null;
        }
        String A0i6 = A0i(1523404155);
        InterfaceC104794nk Asn = Asn();
        if (Asn != null) {
            c114565Fc = Asn.Esg();
        } else {
            c114565Fc = null;
        }
        InterfaceC104804nl Asp = Asp();
        if (Asp != null) {
            c52r = Asp.Esh();
        } else {
            c52r = null;
        }
        InterfaceC104814nm Atg = Atg();
        if (Atg != null) {
            c114575Fd = Atg.ErX();
        } else {
            c114575Fd = null;
        }
        CTAStyle Atm = Atm();
        InterfaceC87573vP Atv = Atv();
        if (Atv != null) {
            c87563vO = Atv.Erl();
        } else {
            c87563vO = null;
        }
        InterfaceC39301sB Aty = Aty();
        if (Aty != null) {
            c1sA = Aty.Erm();
        } else {
            c1sA = null;
        }
        IGCTMessagingAdsInfoDictIntf Au0 = Au0();
        if (Au0 != null) {
            iGCTMessagingAdsInfoDict = Au0.EuZ();
        } else {
            iGCTMessagingAdsInfoDict = null;
        }
        InterfaceC104824nn Au1 = Au1();
        if (Au1 != null) {
            c38691H2c = Au1.Ern();
        } else {
            c38691H2c = null;
        }
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(669973513);
        String A0i7 = A0i(1341635297);
        Boolean optionalBooleanValueByHashCode2 = getOptionalBooleanValueByHashCode(-732595499);
        Boolean optionalBooleanValueByHashCode3 = getOptionalBooleanValueByHashCode(1546691918);
        String A0i8 = A0i(1714924804);
        Integer optionalIntValueByHashCode2 = getOptionalIntValueByHashCode(-1156866267);
        List Azx = Azx();
        if (Azx != null) {
            arrayList3 = new ArrayList(AbstractC06950Ym.A1E(Azx, 10));
            Iterator it3 = Azx.iterator();
            while (it3.hasNext()) {
                arrayList3.add(((InterfaceC43533JKt) it3.next()).EtA());
            }
        } else {
            arrayList3 = null;
        }
        DynamicProductAdDisplayOption B02 = B02();
        Boolean optionalBooleanValueByHashCode4 = getOptionalBooleanValueByHashCode(-463750539);
        Boolean optionalBooleanValueByHashCode5 = getOptionalBooleanValueByHashCode(-388021690);
        String A0j5 = A0j(617356508);
        String A0i9 = A0i(266416098);
        InterfaceC104834np B5i = B5i();
        if (B5i != null) {
            c114585Fe = B5i.EtY();
        } else {
            c114585Fe = null;
        }
        AdFormatType B82 = B82();
        InterfaceC104844nr B9f = B9f();
        if (B9f != null) {
            c114595Ff = B9f.Ets();
        } else {
            c114595Ff = null;
        }
        Integer optionalIntValueByHashCode3 = getOptionalIntValueByHashCode(2034576965);
        Integer optionalIntValueByHashCode4 = getOptionalIntValueByHashCode(-1555005202);
        String A0i10 = A0i(686704055);
        List BDm = BDm();
        if (BDm != null) {
            arrayList4 = new ArrayList(AbstractC06950Ym.A1E(BDm, 10));
            Iterator it4 = BDm.iterator();
            while (it4.hasNext()) {
                arrayList4.add(((InterfaceC39331sE) it4.next()).Eu7());
            }
        } else {
            arrayList4 = null;
        }
        InterfaceC39391sK BEV = BEV();
        if (BEV != null) {
            c39381sJ = BEV.Eug();
        } else {
            c39381sJ = null;
        }
        InterfaceC39421sN BEa = BEa();
        if (BEa != null) {
            c39411sM = BEa.Euh();
        } else {
            c39411sM = null;
        }
        String A0i11 = A0i(-1505401810);
        InterfaceC104854ns BFH = BFH();
        if (BFH != null) {
            uQv = BFH.EuH();
        } else {
            uQv = null;
        }
        InterfaceC104864nt BFI = BFI();
        if (BFI != null) {
            uQw = BFI.EuI();
        } else {
            uQw = null;
        }
        AdsCTATrustInfoIntf BFJ = BFJ();
        if (BFJ != null) {
            adsCTATrustInfo = BFJ.F7H();
        } else {
            adsCTATrustInfo = null;
        }
        AdsTextTrustInfoIntf BFK = BFK();
        if (BFK != null) {
            adsTextTrustInfo = BFK.F7K();
        } else {
            adsTextTrustInfo = null;
        }
        IGAdsIABScreenshotDataDict BFN = BFN();
        if (BFN != null) {
            iGAdsIABScreenshotDataDictImpl = BFN.EuP();
        } else {
            iGAdsIABScreenshotDataDictImpl = null;
        }
        IGCTATextVariant BFZ = BFZ();
        if (BFZ != null) {
            iGCTATextVariantImpl = BFZ.EuY();
        } else {
            iGCTATextVariantImpl = null;
        }
        String A0i12 = A0i(-277445838);
        InterfaceC88193wT BFe = BFe();
        if (BFe != null) {
            c100444f8 = BFe.EuO();
        } else {
            c100444f8 = null;
        }
        InterfaceC104874ny BFf = BFf();
        if (BFf != null) {
            c5l8 = BFf.Eue();
        } else {
            c5l8 = null;
        }
        InterfaceC104884nz BG5 = BG5();
        if (BG5 != null) {
            c38730H3t = BG5.EvK();
        } else {
            c38730H3t = null;
        }
        InterfaceC104894o0 BG6 = BG6();
        if (BG6 != null) {
            c1117552c = BG6.EvL();
        } else {
            c1117552c = null;
        }
        IGRFSurveyInfoDict BGD = BGD();
        if (BGD != null) {
            iGRFSurveyInfoDictImpl = BGD.EvV();
        } else {
            iGRFSurveyInfoDictImpl = null;
        }
        InterfaceC104904o2 BGF = BGF();
        if (BGF != null) {
            c106004qE = BGF.Evb();
        } else {
            c106004qE = null;
        }
        C46j BGM = BGM();
        if (BGM != null) {
            c102724k9 = BGM.Ez3();
        } else {
            c102724k9 = null;
        }
        Integer optionalIntValueByHashCode5 = getOptionalIntValueByHashCode(632151045);
        Integer optionalIntValueByHashCode6 = getOptionalIntValueByHashCode(1550511618);
        InterfaceC38221qC BJK = BJK();
        if (BJK != null) {
            c38211qB = BJK.F6e();
        } else {
            c38211qB = null;
        }
        Boolean optionalBooleanValueByHashCode6 = getOptionalBooleanValueByHashCode(2080043724);
        Boolean optionalBooleanValueByHashCode7 = getOptionalBooleanValueByHashCode(1784862051);
        Boolean optionalBooleanValueByHashCode8 = getOptionalBooleanValueByHashCode(-24105094);
        Boolean optionalBooleanValueByHashCode9 = getOptionalBooleanValueByHashCode(-430048452);
        Boolean optionalBooleanValueByHashCode10 = getOptionalBooleanValueByHashCode(1565244781);
        Boolean optionalBooleanValueByHashCode11 = getOptionalBooleanValueByHashCode(784863612);
        Boolean optionalBooleanValueByHashCode12 = getOptionalBooleanValueByHashCode(852642504);
        Boolean optionalBooleanValueByHashCode13 = getOptionalBooleanValueByHashCode(-1630877749);
        Boolean optionalBooleanValueByHashCode14 = getOptionalBooleanValueByHashCode(158239729);
        Boolean optionalBooleanValueByHashCode15 = getOptionalBooleanValueByHashCode(2081772504);
        Boolean optionalBooleanValueByHashCode16 = getOptionalBooleanValueByHashCode(1443018240);
        Boolean optionalBooleanValueByHashCode17 = getOptionalBooleanValueByHashCode(224671005);
        Boolean optionalBooleanValueByHashCode18 = getOptionalBooleanValueByHashCode(-1702889446);
        Boolean optionalBooleanValueByHashCode19 = getOptionalBooleanValueByHashCode(1112511486);
        Boolean optionalBooleanValueByHashCode20 = getOptionalBooleanValueByHashCode(1859602719);
        Boolean optionalBooleanValueByHashCode21 = getOptionalBooleanValueByHashCode(-890554225);
        Boolean optionalBooleanValueByHashCode22 = getOptionalBooleanValueByHashCode(-33515775);
        Boolean optionalBooleanValueByHashCode23 = getOptionalBooleanValueByHashCode(-1275697362);
        Boolean optionalBooleanValueByHashCode24 = getOptionalBooleanValueByHashCode(-1387806465);
        Boolean optionalBooleanValueByHashCode25 = getOptionalBooleanValueByHashCode(409465363);
        Boolean optionalBooleanValueByHashCode26 = getOptionalBooleanValueByHashCode(-178973479);
        Boolean optionalBooleanValueByHashCode27 = getOptionalBooleanValueByHashCode(-1091878802);
        Boolean optionalBooleanValueByHashCode28 = getOptionalBooleanValueByHashCode(138640398);
        Boolean optionalBooleanValueByHashCode29 = getOptionalBooleanValueByHashCode(-525934283);
        Integer optionalIntValueByHashCode7 = getOptionalIntValueByHashCode(-2141142810);
        List A01 = A01(c1dy);
        if (A01 != null) {
            arrayList5 = new ArrayList(AbstractC06950Ym.A1E(A01, 10));
            Iterator it5 = A01.iterator();
            while (it5.hasNext()) {
                arrayList5.add(c1dy.A00((C38321qM) it5.next()));
            }
        } else {
            arrayList5 = null;
        }
        String A0i13 = A0i(102727412);
        Boolean optionalBooleanValueByHashCode30 = getOptionalBooleanValueByHashCode(-1758543067);
        List BMi = BMi();
        if (BMi != null) {
            arrayList6 = new ArrayList(AbstractC06950Ym.A1E(BMi, 10));
            Iterator it6 = BMi.iterator();
            while (it6.hasNext()) {
                arrayList6.add(((AndroidLink) it6.next()).F53());
            }
        } else {
            arrayList6 = null;
        }
        String A0i14 = A0i(-701807740);
        Boolean optionalBooleanValueByHashCode31 = getOptionalBooleanValueByHashCode(-1503904634);
        String A0j6 = A0j(-1697466332);
        List BMo = BMo();
        if (BMo != null) {
            arrayList7 = new ArrayList(AbstractC06950Ym.A1E(BMo, 10));
            Iterator it7 = BMo.iterator();
            while (it7.hasNext()) {
                arrayList7.add(((AndroidLink) it7.next()).F53());
            }
        } else {
            arrayList7 = null;
        }
        Boolean optionalBooleanValueByHashCode32 = getOptionalBooleanValueByHashCode(-2101345088);
        InterfaceC104914o3 BMq = BMq();
        if (BMq != null) {
            c108034tm = BMq.Eum();
        } else {
            c108034tm = null;
        }
        String A0i15 = A0i(-1410034208);
        String A0i16 = A0i(-1624294830);
        C46j BQT = BQT();
        if (BQT != null) {
            c102724k92 = BQT.Ez3();
        } else {
            c102724k92 = null;
        }
        String A0f = A0f();
        C4o4 BSs = BSs();
        if (BSs != null) {
            c114605Fi = BSs.Ewd();
        } else {
            c114605Fi = null;
        }
        InterfaceC104924o5 BVd = BVd();
        if (BVd != null) {
            c114615Fj = BVd.Ezn(c1dy);
        } else {
            c114615Fj = null;
        }
        InterfaceC104934o6 BYm = BYm();
        if (BYm != null) {
            c51l = BYm.ExV();
        } else {
            c51l = null;
        }
        String A0i17 = A0i(427397093);
        String A0i18 = A0i(924848935);
        List A0n = A0n(-774319794);
        String A0j7 = A0j(-803548981);
        String A0i19 = A0i(-612351174);
        InterfaceC104944o7 BeI = BeI();
        if (BeI != null) {
            c106024qG = BeI.Ey1();
        } else {
            c106024qG = null;
        }
        List Bf8 = Bf8();
        List Bf9 = Bf9();
        IGAdProfileProductTabDict Bi3 = Bi3();
        if (Bi3 != null) {
            iGAdProfileProductTabDictImpl = Bi3.EuJ(c1dy);
        } else {
            iGAdProfileProductTabDictImpl = null;
        }
        C47W BiD = BiD();
        if (BiD != null) {
            c104014mN = BiD.Eyi();
        } else {
            c104014mN = null;
        }
        C4o9 Bm0 = Bm0();
        if (Bm0 != null) {
            c5Fk = Bm0.F7B();
        } else {
            c5Fk = null;
        }
        InterfaceC104954oA Bm1 = Bm1();
        if (Bm1 != null) {
            c5Fl = Bm1.F7C();
        } else {
            c5Fl = null;
        }
        InterfaceC104964oB But = But();
        if (But != null) {
            c108344uL = But.EvX();
        } else {
            c108344uL = null;
        }
        Boolean optionalBooleanValueByHashCode33 = getOptionalBooleanValueByHashCode(-1007197316);
        Boolean optionalBooleanValueByHashCode34 = getOptionalBooleanValueByHashCode(736103798);
        Boolean optionalBooleanValueByHashCode35 = getOptionalBooleanValueByHashCode(-260609927);
        Boolean optionalBooleanValueByHashCode36 = getOptionalBooleanValueByHashCode(-1831214760);
        Boolean optionalBooleanValueByHashCode37 = getOptionalBooleanValueByHashCode(-1903660933);
        Boolean optionalBooleanValueByHashCode38 = getOptionalBooleanValueByHashCode(-1641698328);
        InterfaceC104974oC BzH = BzH();
        if (BzH != null) {
            c106594rE = BzH.Ezm();
        } else {
            c106594rE = null;
        }
        InterfaceC104984oD C1Q = C1Q();
        if (C1Q != null) {
            h5v = C1Q.F0I();
        } else {
            h5v = null;
        }
        IGAdCreativeStory9x16CaptionData C4k = C4k();
        if (C4k != null) {
            iGAdCreativeStory9x16CaptionDataImpl = C4k.EuG();
        } else {
            iGAdCreativeStory9x16CaptionDataImpl = null;
        }
        InterfaceC38901rP C5p = C5p();
        if (C5p != null) {
            c38891rO = C5p.F4U(c1dy);
        } else {
            c38891rO = null;
        }
        TestimonialDict C5q = C5q();
        if (C5q != null) {
            testimonialDictImpl = C5q.F2r(c1dy);
        } else {
            testimonialDictImpl = null;
        }
        InterfaceC104994oF C6P = C6P();
        if (C6P != null) {
            c38732H3v = C6P.EvW();
        } else {
            c38732H3v = null;
        }
        String A0i20 = A0i(-1938614671);
        InterfaceC105004oG CDT = CDT();
        if (CDT != null) {
            c114625Fm = CDT.F3U(c1dy);
        } else {
            c114625Fm = null;
        }
        return new C39531sa(B82, c114555Fb, c1s4, appstoreMetadataDictImpl, Afo, h2w, c114575Fd, callAdsInfoDictImpl, c87563vO, c1sA, c38691H2c, c114565Fc, c52r, B02, c114585Fe, c87703ve, c114595Ff, iGAdCreativeStory9x16CaptionDataImpl, uQv, uQw, iGAdProfileProductTabDictImpl, c100444f8, iGAdsIABScreenshotDataDictImpl, iGCTATextVariantImpl, iGCTMessagingAdsInfoDict, c1s7, c5l8, c39381sJ, c39411sM, c108034tm, c38730H3t, c1117552c, iGRFSurveyInfoDictImpl, c38732H3v, c108344uL, c106004qE, c114605Fi, c51l, c106024qG, c104014mN, c102724k9, c102724k92, c106594rE, c114615Fj, h5v, testimonialDictImpl, c114625Fm, null, c38891rO, Atm, c37881pR, c37881pR2, c5Fa, c38211qB, c5Fk, c5Fl, adsCTATrustInfo, adsIAWRatingInfo, adsRatingInfo, adsTextTrustInfo, optionalBooleanValueByHashCode, optionalBooleanValueByHashCode2, optionalBooleanValueByHashCode3, optionalBooleanValueByHashCode4, optionalBooleanValueByHashCode5, optionalBooleanValueByHashCode6, optionalBooleanValueByHashCode7, optionalBooleanValueByHashCode8, optionalBooleanValueByHashCode9, optionalBooleanValueByHashCode10, optionalBooleanValueByHashCode11, optionalBooleanValueByHashCode12, optionalBooleanValueByHashCode13, optionalBooleanValueByHashCode14, optionalBooleanValueByHashCode15, optionalBooleanValueByHashCode16, optionalBooleanValueByHashCode17, optionalBooleanValueByHashCode18, optionalBooleanValueByHashCode19, optionalBooleanValueByHashCode20, optionalBooleanValueByHashCode21, optionalBooleanValueByHashCode22, optionalBooleanValueByHashCode23, optionalBooleanValueByHashCode24, optionalBooleanValueByHashCode25, optionalBooleanValueByHashCode26, optionalBooleanValueByHashCode27, optionalBooleanValueByHashCode28, optionalBooleanValueByHashCode29, optionalBooleanValueByHashCode30, optionalBooleanValueByHashCode31, optionalBooleanValueByHashCode32, optionalBooleanValueByHashCode33, optionalBooleanValueByHashCode34, optionalBooleanValueByHashCode35, optionalBooleanValueByHashCode36, optionalBooleanValueByHashCode37, optionalBooleanValueByHashCode38, optionalIntValueByHashCode, optionalIntValueByHashCode2, optionalIntValueByHashCode3, optionalIntValueByHashCode4, optionalIntValueByHashCode5, optionalIntValueByHashCode6, optionalIntValueByHashCode7, getOptionalIntValueByHashCode(-641011977), A0L, A0L2, A0i, A0j, A0i2, A0j2, A0i3, A0i4, A0j3, A0j4, A0i5, A0i6, A0i7, A0i8, A0j5, A0i9, A0i10, A0i11, A0i12, A0i13, A0i14, A0j6, A0i15, A0i16, A0f, A0i17, A0i18, A0j7, A0i19, A0i20, optionalIntListByHashCode, arrayList, optionalStringListByHashCode, arrayList2, arrayList3, arrayList4, arrayList5, arrayList6, arrayList7, A0n, Bf8, Bf9, getOptionalStringListByHashCode(-1573023373));
    }

    @Override // X.InterfaceC39541sb
    public final List getCookies() {
        return getOptionalStringListByHashCode(952189583);
    }

    @Override // X.InterfaceC39541sb
    public final String getDominantColor() {
        return A0i(1714924804);
    }

    @Override // X.InterfaceC39541sb
    public final String getMediaId() {
        return A0f();
    }
}
