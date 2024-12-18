package X;

import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.AdFormatType;
import com.instagram.api.schemas.AppstoreMetadataDict;
import com.instagram.api.schemas.AppstoreMetadataDictImpl;
import com.instagram.api.schemas.BrandedContentAdsPaidPartnershipLabelRemovalOption;
import com.instagram.api.schemas.DynamicProductAdDisplayOption;
import com.instagram.api.schemas.IGCTMessagingAdsInfoDict;
import com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf;
import com.instagram.api.schemas.IGRFSurveyInfoDict;
import com.instagram.api.schemas.IGRFSurveyInfoDictImpl;
import com.instagram.api.schemas.ImmutablePandoAppstoreMetadataDict;
import com.instagram.api.schemas.ImmutablePandoIGCTMessagingAdsInfoDict;
import com.instagram.api.schemas.ImmutablePandoIGRFSurveyInfoDict;
import com.instagram.api.schemas.ImmutablePandoTestimonialDict;
import com.instagram.api.schemas.TestimonialDict;
import com.instagram.api.schemas.TestimonialDictImpl;
import com.instagram.feed.media.ImmutablePandoMediaDict;
import com.instagram.model.androidlink.ImmutablePandoAndroidLink;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.HMg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39178HMg extends C17T implements InterfaceC43584JMs {
    public JJU A00;
    public TestimonialDict A01;
    public InterfaceC105004oG A02;
    public InterfaceC38901rP A03;
    public InterfaceC38901rP A04;
    public InterfaceC104774nh A05;
    public JKB A06;
    public InterfaceC104924o5 A07;
    public List A08;

    @Override // X.InterfaceC43584JMs
    public final InterfaceC87713vf AZQ() {
        return (InterfaceC87713vf) A05(-1422642818, C39216HOz.class);
    }

    @Override // X.InterfaceC43584JMs
    public final InterfaceC104774nh AaF() {
        InterfaceC104774nh interfaceC104774nh = this.A05;
        if (interfaceC104774nh == null) {
            return (InterfaceC104774nh) A05(2045846486, C39181HMj.class);
        }
        return interfaceC104774nh;
    }

    @Override // X.InterfaceC43584JMs
    public final InterfaceC39271s5 AaR() {
        return (InterfaceC39271s5) A05(682005289, C39185HMo.class);
    }

    @Override // X.InterfaceC43584JMs
    public final List Abm() {
        return A0o(-683992599, ImmutablePandoAndroidLink.class);
    }

    @Override // X.InterfaceC43584JMs
    public final InterfaceC104784ni AjP() {
        return (InterfaceC104784ni) A05(-533849090, HNK.class);
    }

    @Override // X.InterfaceC43584JMs
    public final InterfaceC87893vx AmK() {
        return (InterfaceC87893vx) A05(-1121579356, HNS.class);
    }

    @Override // X.InterfaceC43584JMs
    public final InterfaceC38021pm Anu() {
        return (InterfaceC38021pm) A05(537407194, HXg.class);
    }

    @Override // X.InterfaceC43584JMs
    public final List Ark() {
        return A08(-295216049, HNL.class);
    }

    @Override // X.InterfaceC43584JMs
    public final InterfaceC104804nl Asp() {
        return (InterfaceC104804nl) A05(-570023199, HOI.class);
    }

    @Override // X.InterfaceC43584JMs
    public final InterfaceC104814nm Atg() {
        return (InterfaceC104814nm) A05(-816224899, HNM.class);
    }

    @Override // X.InterfaceC43584JMs
    public final List Azx() {
        return A08(1887846250, C39210HOg.class);
    }

    @Override // X.InterfaceC43584JMs
    public final DynamicProductAdDisplayOption B02() {
        return (DynamicProductAdDisplayOption) A0N(-1572866338, C43226J8x.A00);
    }

    @Override // X.InterfaceC43584JMs
    public final AdFormatType B82() {
        return (AdFormatType) A0N(1458614914, C43227J8y.A00);
    }

    @Override // X.InterfaceC43584JMs
    public final List BDm() {
        return A0o(-983661271, HPM.class);
    }

    @Override // X.InterfaceC43584JMs
    public final InterfaceC38221qC BJK() {
        return (InterfaceC38221qC) A05(-955246378, HXK.class);
    }

    @Override // X.InterfaceC43584JMs
    public final InterfaceC104914o3 BMq() {
        return (InterfaceC104914o3) A05(-57386478, C39222HPn.class);
    }

    @Override // X.InterfaceC43584JMs
    public final C46j BQT() {
        return (C46j) A05(1758667881, C1C.class);
    }

    @Override // X.InterfaceC43584JMs
    public final JKB BVB() {
        JKB jkb = this.A06;
        if (jkb == null) {
            return (JKB) A05(-347059681, C39195HNj.class);
        }
        return jkb;
    }

    @Override // X.InterfaceC43584JMs
    public final InterfaceC104924o5 BVd() {
        InterfaceC104924o5 interfaceC104924o5 = this.A07;
        if (interfaceC104924o5 == null) {
            return (InterfaceC104924o5) A05(-780321144, HT4.class);
        }
        return interfaceC104924o5;
    }

    @Override // X.InterfaceC43584JMs
    public final InterfaceC104934o6 BYm() {
        return (InterfaceC104934o6) A05(-1699641528, C14.class);
    }

    @Override // X.InterfaceC43584JMs
    public final C4o9 Bm0() {
        return (C4o9) A05(1239608894, C39303HXc.class);
    }

    @Override // X.InterfaceC43584JMs
    public final InterfaceC104954oA Bm1() {
        return (InterfaceC104954oA) A05(2009579145, HXd.class);
    }

    @Override // X.InterfaceC43584JMs
    public final List getItems() {
        List list = this.A08;
        if (list != null) {
            return list;
        }
        throw AbstractC166987dD.A1D("Please call reconciledWithStore() first to access the 'items' field.");
    }

    @Override // X.InterfaceC43584JMs
    public final String AYx() {
        return A0j(-1650554971);
    }

    @Override // X.InterfaceC43584JMs
    public final String AZ3() {
        return A0h(243470802);
    }

    @Override // X.InterfaceC43584JMs
    public final String AZE() {
        return A0k(92655287);
    }

    @Override // X.InterfaceC43584JMs
    public final String AZR() {
        return A0h(-1359893700);
    }

    @Override // X.InterfaceC43584JMs
    public final String AcH() {
        return A0j(-1411074055);
    }

    @Override // X.InterfaceC43584JMs
    public final Long AiY() {
        return A0L(-383562417);
    }

    @Override // X.InterfaceC43584JMs
    public final String AkD() {
        return A0j(2083788458);
    }

    @Override // X.InterfaceC43584JMs
    public final Boolean Axd() {
        return getOptionalBooleanValueByHashCode(669973513);
    }

    @Override // X.InterfaceC43584JMs
    public final String AyU() {
        return A0i(1341635297);
    }

    @Override // X.InterfaceC43584JMs
    public final Integer AzC() {
        return getOptionalIntValueByHashCode(-1156866267);
    }

    @Override // X.InterfaceC43584JMs
    public final Boolean B1Q() {
        return getOptionalBooleanValueByHashCode(-463750539);
    }

    @Override // X.InterfaceC43584JMs
    public final Boolean B1h() {
        return getOptionalBooleanValueByHashCode(-388021690);
    }

    @Override // X.InterfaceC43584JMs
    public final String B4X() {
        return A0j(617356508);
    }

    @Override // X.InterfaceC43584JMs
    public final String B4v() {
        return A0i(266416098);
    }

    @Override // X.InterfaceC43584JMs
    public final int BDg() {
        return getIntValueByHashCode(-1555005202);
    }

    @Override // X.InterfaceC43584JMs
    public final String BIt() {
        return A0i(-1142947031);
    }

    @Override // X.InterfaceC43584JMs
    public final Integer BKC() {
        return getOptionalIntValueByHashCode(-2141142810);
    }

    @Override // X.InterfaceC43584JMs
    public final String BKx() {
        return A0h(102727412);
    }

    @Override // X.InterfaceC43584JMs
    public final String BNP() {
        return A0h(-1410034208);
    }

    @Override // X.InterfaceC43584JMs
    public final String BNT() {
        return A0i(-1624294830);
    }

    @Override // X.InterfaceC43584JMs
    public final Integer BRq() {
        return getOptionalIntValueByHashCode(1939875509);
    }

    @Override // X.InterfaceC43584JMs
    public final String BVG() {
        return A0i(-494812862);
    }

    @Override // X.InterfaceC43584JMs
    public final String Baa() {
        return A0i(924848935);
    }

    @Override // X.InterfaceC43584JMs
    public final String Baz() {
        return A0j(-803548981);
    }

    @Override // X.InterfaceC43584JMs
    public final Boolean Bv2() {
        return getOptionalBooleanValueByHashCode(-1007197316);
    }

    @Override // X.InterfaceC43584JMs
    public final boolean Bvx() {
        return getBooleanValueByHashCode(-1831214760);
    }

    @Override // X.InterfaceC43584JMs
    public final String CAR() {
        return A0h(-1938614671);
    }

    @Override // X.InterfaceC43584JMs
    public final Integer CFr() {
        return getOptionalIntValueByHashCode(1496409374);
    }

    @Override // X.InterfaceC43584JMs
    public final Boolean CSS() {
        return getOptionalBooleanValueByHashCode(158239729);
    }

    @Override // X.InterfaceC43584JMs
    public final boolean CSX() {
        return getBooleanValueByHashCode(2081772504);
    }

    @Override // X.InterfaceC43584JMs
    public final Boolean CXw() {
        return getOptionalBooleanValueByHashCode(-890554225);
    }

    @Override // X.InterfaceC43584JMs
    public final Boolean CaD() {
        return getOptionalBooleanValueByHashCode(-1275697362);
    }

    @Override // X.InterfaceC43584JMs
    public final Boolean Cc8() {
        return getOptionalBooleanValueByHashCode(-1091878802);
    }

    @Override // X.InterfaceC43584JMs
    public final Boolean Ccp() {
        return getOptionalBooleanValueByHashCode(138640398);
    }

    @Override // X.InterfaceC43584JMs
    public final InterfaceC43584JMs E8g(C1DY c1dy) {
        InterfaceC104774nh AaF = AaF();
        InterfaceC105004oG interfaceC105004oG = null;
        if (AaF != null) {
            AaF.E8h(c1dy);
        } else {
            AaF = null;
        }
        this.A05 = AaF;
        InterfaceC38901rP interfaceC38901rP = this.A03;
        if (interfaceC38901rP == null) {
            interfaceC38901rP = (InterfaceC38901rP) A05(-1115058732, C37956Gmy.class);
        }
        if (interfaceC38901rP != null) {
            interfaceC38901rP.EBK(c1dy);
        } else {
            interfaceC38901rP = null;
        }
        this.A03 = interfaceC38901rP;
        List A0o = A0o(100526016, ImmutablePandoMediaDict.class);
        ArrayList A0q = AbstractC167017dG.A0q(A0o);
        Iterator it = A0o.iterator();
        while (it.hasNext()) {
            AbstractC37304Gc5.A1E(c1dy, A0q, it);
        }
        this.A08 = A0q;
        JJU jju = this.A00;
        if (jju == null) {
            jju = (JJU) A05(221704369, HRF.class);
        }
        if (jju != null) {
            jju.E9M(c1dy);
        } else {
            jju = null;
        }
        this.A00 = jju;
        JKB BVB = BVB();
        if (BVB != null) {
            BVB.E8r(c1dy);
        } else {
            BVB = null;
        }
        this.A06 = BVB;
        InterfaceC104924o5 BVd = BVd();
        if (BVd != null) {
            BVd.E9v(c1dy);
        } else {
            BVd = null;
        }
        this.A07 = BVd;
        InterfaceC38901rP interfaceC38901rP2 = this.A04;
        if (interfaceC38901rP2 == null) {
            interfaceC38901rP2 = (InterfaceC38901rP) A05(-965505206, C37956Gmy.class);
        }
        if (interfaceC38901rP2 != null) {
            interfaceC38901rP2.EBK(c1dy);
        } else {
            interfaceC38901rP2 = null;
        }
        this.A04 = interfaceC38901rP2;
        TestimonialDict testimonialDict = this.A01;
        if (testimonialDict == null) {
            testimonialDict = (TestimonialDict) A05(30484369, ImmutablePandoTestimonialDict.class);
        }
        if (testimonialDict != null) {
            testimonialDict.EB1(c1dy);
        } else {
            testimonialDict = null;
        }
        this.A01 = testimonialDict;
        InterfaceC105004oG interfaceC105004oG2 = this.A02;
        if (interfaceC105004oG2 != null || (interfaceC105004oG2 = (InterfaceC105004oG) A05(1238212428, HVO.class)) != null) {
            interfaceC105004oG2.EB9(c1dy);
            interfaceC105004oG = interfaceC105004oG2;
        }
        this.A02 = interfaceC105004oG;
        return this;
    }

    @Override // X.InterfaceC43584JMs
    public final C37471Gep Eqa(C1DY c1dy) {
        C5Fa c5Fa;
        C87703ve c87703ve;
        C114555Fb c114555Fb;
        C1s4 c1s4;
        AppstoreMetadataDictImpl appstoreMetadataDictImpl;
        H2W h2w;
        C87883vw c87883vw;
        C38011pl c38011pl;
        ArrayList arrayList;
        C114565Fc c114565Fc;
        C52r c52r;
        C114575Fd c114575Fd;
        C1sA c1sA;
        IGCTMessagingAdsInfoDict iGCTMessagingAdsInfoDict;
        ArrayList arrayList2;
        C114595Ff c114595Ff;
        C38891rO F4U;
        H3Y h3y;
        C39411sM c39411sM;
        C38730H3t c38730H3t;
        IGRFSurveyInfoDictImpl iGRFSurveyInfoDictImpl;
        C106004qE c106004qE;
        C38211qB c38211qB;
        H4L Eww;
        C108034tm c108034tm;
        C102724k9 c102724k9;
        C38697H2i c38697H2i;
        C114615Fj c114615Fj;
        C51L c51l;
        C5G3 c5g3;
        C38739H4d c38739H4d;
        C106024qG c106024qG;
        C5Fk c5Fk;
        C5Fl c5Fl;
        C106594rE c106594rE;
        C38891rO F4U2;
        TestimonialDictImpl F2r;
        C38732H3v c38732H3v;
        C114625Fm F3U;
        String A0j = A0j(-1650554971);
        String A0h = A0h(243470802);
        InterfaceC104764ng interfaceC104764ng = (InterfaceC104764ng) A05(-1593201482, HWb.class);
        if (interfaceC104764ng != null) {
            c5Fa = interfaceC104764ng.F5k();
        } else {
            c5Fa = null;
        }
        String A0k = A0k(92655287);
        InterfaceC87713vf AZQ = AZQ();
        if (AZQ != null) {
            c87703ve = AZQ.EtZ();
        } else {
            c87703ve = null;
        }
        String A0h2 = A0h(-1359893700);
        InterfaceC104774nh AaF = AaF();
        if (AaF != null) {
            c114555Fb = AaF.Eqf(c1dy);
        } else {
            c114555Fb = null;
        }
        String A0i = A0i(2033156745);
        InterfaceC39271s5 AaR = AaR();
        if (AaR != null) {
            c1s4 = AaR.Eqj();
        } else {
            c1s4 = null;
        }
        List Abm = Abm();
        ArrayList A0i2 = AbstractC167007dF.A0i(Abm);
        Iterator it = Abm.iterator();
        while (it.hasNext()) {
            AbstractC37303Gc4.A1V(A0i2, it);
        }
        String A0j2 = A0j(-1411074055);
        AppstoreMetadataDict appstoreMetadataDict = (AppstoreMetadataDict) A05(160943406, ImmutablePandoAppstoreMetadataDict.class);
        if (appstoreMetadataDict != null) {
            appstoreMetadataDictImpl = appstoreMetadataDict.Eqw();
        } else {
            appstoreMetadataDictImpl = null;
        }
        BrandedContentAdsPaidPartnershipLabelRemovalOption brandedContentAdsPaidPartnershipLabelRemovalOption = (BrandedContentAdsPaidPartnershipLabelRemovalOption) A0N(-985471814, C43225J8w.A00);
        Long A0L = A0L(-383562417);
        InterfaceC104784ni AjP = AjP();
        if (AjP != null) {
            h2w = AjP.ErV();
        } else {
            h2w = null;
        }
        String A0j3 = A0j(2083788458);
        String A0j4 = A0j(1498535089);
        InterfaceC87893vx AmK = AmK();
        if (AmK != null) {
            c87883vw = AmK.Erf();
        } else {
            c87883vw = null;
        }
        InterfaceC38021pm Anu = Anu();
        if (Anu != null) {
            c38011pl = Anu.F7F();
        } else {
            c38011pl = null;
        }
        List cookies = getCookies();
        List Ark = Ark();
        if (Ark != null) {
            arrayList = AbstractC167007dF.A0i(Ark);
            Iterator it2 = Ark.iterator();
            while (it2.hasNext()) {
                arrayList.add(((InterfaceC38791rB) it2.next()).ErW());
            }
        } else {
            arrayList = null;
        }
        InterfaceC104794nk interfaceC104794nk = (InterfaceC104794nk) A05(-1153378822, HOH.class);
        if (interfaceC104794nk != null) {
            c114565Fc = interfaceC104794nk.Esg();
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
        InterfaceC39301sB interfaceC39301sB = (InterfaceC39301sB) A05(1829539395, HNX.class);
        if (interfaceC39301sB != null) {
            c1sA = interfaceC39301sB.Erm();
        } else {
            c1sA = null;
        }
        IGCTMessagingAdsInfoDictIntf iGCTMessagingAdsInfoDictIntf = (IGCTMessagingAdsInfoDictIntf) A05(-926784535, ImmutablePandoIGCTMessagingAdsInfoDict.class);
        if (iGCTMessagingAdsInfoDictIntf != null) {
            iGCTMessagingAdsInfoDict = iGCTMessagingAdsInfoDictIntf.EuZ();
        } else {
            iGCTMessagingAdsInfoDict = null;
        }
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(669973513);
        String A0i3 = A0i(1341635297);
        Boolean optionalBooleanValueByHashCode2 = getOptionalBooleanValueByHashCode(-732595499);
        String A0i4 = A0i(1714924804);
        Integer optionalIntValueByHashCode = getOptionalIntValueByHashCode(-1156866267);
        List Azx = Azx();
        if (Azx != null) {
            arrayList2 = AbstractC167007dF.A0i(Azx);
            Iterator it3 = Azx.iterator();
            while (it3.hasNext()) {
                arrayList2.add(((InterfaceC43533JKt) it3.next()).EtA());
            }
        } else {
            arrayList2 = null;
        }
        DynamicProductAdDisplayOption B02 = B02();
        Boolean optionalBooleanValueByHashCode3 = getOptionalBooleanValueByHashCode(-463750539);
        Boolean optionalBooleanValueByHashCode4 = getOptionalBooleanValueByHashCode(-388021690);
        String A0j5 = A0j(617356508);
        String A0i5 = A0i(266416098);
        AdFormatType B82 = B82();
        InterfaceC104844nr interfaceC104844nr = (InterfaceC104844nr) A05(1828016905, HPB.class);
        if (interfaceC104844nr != null) {
            c114595Ff = interfaceC104844nr.Ets();
        } else {
            c114595Ff = null;
        }
        InterfaceC38901rP interfaceC38901rP = this.A03;
        if (interfaceC38901rP == null && (interfaceC38901rP = (InterfaceC38901rP) A05(-1115058732, C37956Gmy.class)) == null) {
            F4U = null;
        } else {
            F4U = interfaceC38901rP.F4U(c1dy);
        }
        int intValueByHashCode = getIntValueByHashCode(-1555005202);
        String A0i6 = A0i(686704055);
        List BDm = BDm();
        ArrayList A0i7 = AbstractC167007dF.A0i(BDm);
        Iterator it4 = BDm.iterator();
        while (it4.hasNext()) {
            A0i7.add(((InterfaceC39331sE) it4.next()).Eu7());
        }
        JJE jje = (JJE) A05(-2107052014, HPO.class);
        if (jje != null) {
            h3y = jje.EuB();
        } else {
            h3y = null;
        }
        InterfaceC39421sN interfaceC39421sN = (InterfaceC39421sN) A05(1599949067, HPj.class);
        if (interfaceC39421sN != null) {
            c39411sM = interfaceC39421sN.Euh();
        } else {
            c39411sM = null;
        }
        String A0i8 = A0i(-1505401810);
        InterfaceC104884nz interfaceC104884nz = (InterfaceC104884nz) A05(421345560, HQK.class);
        if (interfaceC104884nz != null) {
            c38730H3t = interfaceC104884nz.EvK();
        } else {
            c38730H3t = null;
        }
        IGRFSurveyInfoDict iGRFSurveyInfoDict = (IGRFSurveyInfoDict) A05(-889553367, ImmutablePandoIGRFSurveyInfoDict.class);
        if (iGRFSurveyInfoDict != null) {
            iGRFSurveyInfoDictImpl = iGRFSurveyInfoDict.EvV();
        } else {
            iGRFSurveyInfoDictImpl = null;
        }
        InterfaceC104904o2 interfaceC104904o2 = (InterfaceC104904o2) A05(1390140446, C0p.class);
        if (interfaceC104904o2 != null) {
            c106004qE = interfaceC104904o2.Evb();
        } else {
            c106004qE = null;
        }
        String A0i9 = A0i(-1142947031);
        InterfaceC38221qC BJK = BJK();
        if (BJK != null) {
            c38211qB = BJK.F6e();
        } else {
            c38211qB = null;
        }
        List A0o = A0o(1180716295, C0T.class);
        ArrayList A0i10 = AbstractC167007dF.A0i(A0o);
        Iterator it5 = A0o.iterator();
        while (it5.hasNext()) {
            A0i10.add(((InterfaceC31103Dll) it5.next()).Eqx());
        }
        Boolean optionalBooleanValueByHashCode5 = getOptionalBooleanValueByHashCode(1784862051);
        Boolean optionalBooleanValueByHashCode6 = getOptionalBooleanValueByHashCode(-1630877749);
        Boolean optionalBooleanValueByHashCode7 = getOptionalBooleanValueByHashCode(158239729);
        boolean booleanValueByHashCode = getBooleanValueByHashCode(2081772504);
        Boolean optionalBooleanValueByHashCode8 = getOptionalBooleanValueByHashCode(1112511486);
        Boolean optionalBooleanValueByHashCode9 = getOptionalBooleanValueByHashCode(-890554225);
        Boolean optionalBooleanValueByHashCode10 = getOptionalBooleanValueByHashCode(-33515775);
        Boolean optionalBooleanValueByHashCode11 = getOptionalBooleanValueByHashCode(-1275697362);
        Boolean optionalBooleanValueByHashCode12 = getOptionalBooleanValueByHashCode(-1387806465);
        Boolean optionalBooleanValueByHashCode13 = getOptionalBooleanValueByHashCode(-1091878802);
        Boolean optionalBooleanValueByHashCode14 = getOptionalBooleanValueByHashCode(138640398);
        Integer optionalIntValueByHashCode2 = getOptionalIntValueByHashCode(-2141142810);
        List A0o2 = A0o(100526016, ImmutablePandoMediaDict.class);
        ArrayList A0q = AbstractC167017dG.A0q(A0o2);
        Iterator it6 = A0o2.iterator();
        while (it6.hasNext()) {
            AbstractC37304Gc5.A1E(c1dy, A0q, it6);
        }
        ArrayList A0i11 = AbstractC167007dF.A0i(A0q);
        Iterator it7 = A0q.iterator();
        while (it7.hasNext()) {
            AbstractC37304Gc5.A1H(c1dy, A0i11, it7);
        }
        String A0h3 = A0h(102727412);
        JJU jju = this.A00;
        if (jju == null && (jju = (JJU) A05(221704369, HRF.class)) == null) {
            Eww = null;
        } else {
            Eww = jju.Eww(c1dy);
        }
        InterfaceC104914o3 BMq = BMq();
        if (BMq != null) {
            c108034tm = BMq.Eum();
        } else {
            c108034tm = null;
        }
        String A0h4 = A0h(-1410034208);
        String A0i12 = A0i(-1624294830);
        C46j BQT = BQT();
        if (BQT != null) {
            c102724k9 = BQT.Ez3();
        } else {
            c102724k9 = null;
        }
        String A0f = A0f();
        Integer optionalIntValueByHashCode3 = getOptionalIntValueByHashCode(1939875509);
        JKB BVB = BVB();
        if (BVB != null) {
            c38697H2i = BVB.Es1(c1dy);
        } else {
            c38697H2i = null;
        }
        String A0i13 = A0i(-494812862);
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
        String A0i14 = A0i(-1174104782);
        String A0j6 = A0j(-1501688576);
        C5G4 c5g4 = (C5G4) A05(1935775157, HRX.class);
        if (c5g4 != null) {
            c5g3 = c5g4.Exp();
        } else {
            c5g3 = null;
        }
        String A0i15 = A0i(924848935);
        String A0j7 = A0j(-803548981);
        JJF jjf = (JJF) A05(110810, HRu.class);
        if (jjf != null) {
            c38739H4d = jjf.EyD();
        } else {
            c38739H4d = null;
        }
        InterfaceC104944o7 interfaceC104944o7 = (InterfaceC104944o7) A05(1455378029, C39247HRk.class);
        if (interfaceC104944o7 != null) {
            c106024qG = interfaceC104944o7.Ey1();
        } else {
            c106024qG = null;
        }
        String A0j8 = A0j(1675234547);
        String A0j9 = A0j(1675234771);
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
        Boolean optionalBooleanValueByHashCode15 = getOptionalBooleanValueByHashCode(-1007197316);
        boolean booleanValueByHashCode2 = getBooleanValueByHashCode(-1831214760);
        InterfaceC104974oC interfaceC104974oC = (InterfaceC104974oC) A05(1548981937, C1H.class);
        if (interfaceC104974oC != null) {
            c106594rE = interfaceC104974oC.Ezm();
        } else {
            c106594rE = null;
        }
        InterfaceC38901rP interfaceC38901rP2 = this.A04;
        if (interfaceC38901rP2 == null && (interfaceC38901rP2 = (InterfaceC38901rP) A05(-965505206, C37956Gmy.class)) == null) {
            F4U2 = null;
        } else {
            F4U2 = interfaceC38901rP2.F4U(c1dy);
        }
        TestimonialDict testimonialDict = this.A01;
        if (testimonialDict == null && (testimonialDict = (TestimonialDict) A05(30484369, ImmutablePandoTestimonialDict.class)) == null) {
            F2r = null;
        } else {
            F2r = testimonialDict.F2r(c1dy);
        }
        Integer optionalIntValueByHashCode4 = getOptionalIntValueByHashCode(-1175925531);
        InterfaceC104994oF interfaceC104994oF = (InterfaceC104994oF) A05(934064958, HQT.class);
        if (interfaceC104994oF != null) {
            c38732H3v = interfaceC104994oF.EvW();
        } else {
            c38732H3v = null;
        }
        String A0h5 = A0h(-1938614671);
        InterfaceC105004oG interfaceC105004oG = this.A02;
        if (interfaceC105004oG == null && (interfaceC105004oG = (InterfaceC105004oG) A05(1238212428, HVO.class)) == null) {
            F3U = null;
        } else {
            F3U = interfaceC105004oG.F3U(c1dy);
        }
        return new C37471Gep(B82, c114555Fb, c1s4, appstoreMetadataDictImpl, brandedContentAdsPaidPartnershipLabelRemovalOption, h2w, c114575Fd, c87883vw, c1sA, c38697H2i, c114565Fc, c52r, B02, c87703ve, c114595Ff, h3y, iGCTMessagingAdsInfoDict, c39411sM, c108034tm, c38730H3t, iGRFSurveyInfoDictImpl, c38732H3v, c106004qE, Eww, c51l, c5g3, c106024qG, c38739H4d, c102724k9, c106594rE, c114615Fj, F2r, F3U, F4U, F4U2, c5Fa, c38211qB, c5Fk, c5Fl, c38011pl, optionalBooleanValueByHashCode, optionalBooleanValueByHashCode2, optionalBooleanValueByHashCode3, optionalBooleanValueByHashCode4, optionalBooleanValueByHashCode5, optionalBooleanValueByHashCode6, optionalBooleanValueByHashCode7, optionalBooleanValueByHashCode8, optionalBooleanValueByHashCode9, optionalBooleanValueByHashCode10, optionalBooleanValueByHashCode11, optionalBooleanValueByHashCode12, optionalBooleanValueByHashCode13, optionalBooleanValueByHashCode14, optionalBooleanValueByHashCode15, optionalIntValueByHashCode, optionalIntValueByHashCode2, optionalIntValueByHashCode3, optionalIntValueByHashCode4, getOptionalIntValueByHashCode(1496409374), A0L, A0j, A0h, A0k, A0h2, A0i, A0j2, A0j3, A0j4, A0i3, A0i4, A0j5, A0i5, A0i6, A0i8, A0i9, A0h3, A0h4, A0i12, A0f, A0i13, A0i14, A0j6, A0i15, A0j7, A0j8, A0j9, A0h5, A0i2, cookies, arrayList, arrayList2, A0i7, A0i10, A0i11, intValueByHashCode, booleanValueByHashCode, booleanValueByHashCode2);
    }

    @Override // X.InterfaceC43584JMs
    public final C37471Gep Eqb(C1DV c1dv) {
        return Eqa(AbstractC37304Gc5.A09(c1dv));
    }

    @Override // X.InterfaceC43584JMs
    public final List getCookies() {
        ImmutableList stringListByHashCode = getStringListByHashCode(952189583);
        C14360o3.A07(stringListByHashCode);
        return stringListByHashCode;
    }

    @Override // X.InterfaceC43584JMs
    public final String getDominantColor() {
        return A0i(1714924804);
    }

    @Override // X.InterfaceC43584JMs
    public final String getMediaId() {
        return A0f();
    }
}
