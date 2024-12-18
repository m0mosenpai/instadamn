package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.CarouselRenderingType;
import com.instagram.api.schemas.FanClubStoriesTeaserType;
import com.instagram.api.schemas.HallpassDetailsDict;
import com.instagram.api.schemas.HighlightReelTypeStr;
import com.instagram.api.schemas.ImmutablePandoHallpassDetailsDict;
import com.instagram.api.schemas.ImmutablePandoIntentAwareAdsInfo;
import com.instagram.api.schemas.ImmutablePandoRingSpec;
import com.instagram.api.schemas.IntentAwareAdsInfoIntf;
import com.instagram.api.schemas.RingSpec;
import com.instagram.feed.media.ImmutablePandoMediaDict;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.reels.ReelType;
import com.instagram.sponsored.signals.model.AdsIAWRatingInfoIntf;
import com.instagram.sponsored.signals.model.AdsRatingInfoIntf;
import com.instagram.sponsored.signals.model.ImmutablePandoAdsIAWRatingInfo;
import com.instagram.sponsored.signals.model.ImmutablePandoAdsRatingInfo;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HWN extends C17T implements InterfaceC37791pH {
    public InterfaceC37961pd A00;
    public HallpassDetailsDict A01;
    public InterfaceC38731r5 A02;
    public InterfaceC38601qq A03;
    public InterfaceC38651qw A04;
    public InterfaceC38691r1 A05;
    public InterfaceC38711r3 A06;
    public C38321qM A07;
    public InterfaceC37821pL A08;
    public InterfaceC38121pw A09;
    public InterfaceC38671qy A0A;
    public InterfaceC38061pq A0B;
    public InterfaceC38061pq A0C;
    public User A0D;
    public List A0E;
    public List A0F;
    public List A0G;

    @Override // X.InterfaceC37791pH
    public final InterfaceC37821pL AYI() {
        InterfaceC37821pL interfaceC37821pL = this.A08;
        if (interfaceC37821pL == null) {
            return (InterfaceC37821pL) A05(1271567402, HWE.class);
        }
        return interfaceC37821pL;
    }

    @Override // X.InterfaceC37791pH
    public final InterfaceC37861pP AZ2() {
        return (InterfaceC37861pP) A05(92613716, HWR.class);
    }

    @Override // X.InterfaceC37791pH
    public final InterfaceC37891pS AZO() {
        return (InterfaceC37891pS) A05(-167621279, HWZ.class);
    }

    @Override // X.InterfaceC37791pH
    public final AdsIAWRatingInfoIntf Aa6() {
        return (AdsIAWRatingInfoIntf) A05(-369249631, ImmutablePandoAdsIAWRatingInfo.class);
    }

    @Override // X.InterfaceC37791pH
    public final AdsRatingInfoIntf AaD() {
        return (AdsRatingInfoIntf) A05(566794394, ImmutablePandoAdsRatingInfo.class);
    }

    @Override // X.InterfaceC37791pH
    public final InterfaceC37931pa AgY() {
        return (InterfaceC37931pa) A05(-1275007934, HWS.class);
    }

    @Override // X.InterfaceC37791pH
    public final InterfaceC37961pd AiD() {
        InterfaceC37961pd interfaceC37961pd = this.A00;
        if (interfaceC37961pd == null) {
            return (InterfaceC37961pd) A05(-1618876223, HNG.class);
        }
        return interfaceC37961pd;
    }

    @Override // X.InterfaceC37791pH
    public final CarouselRenderingType AmL() {
        return (CarouselRenderingType) A0N(-275400244, C43328JCv.A00);
    }

    @Override // X.InterfaceC37791pH
    public final List AmR() {
        return A0p(875883375, C43329JCw.A00);
    }

    @Override // X.InterfaceC37791pH
    public final InterfaceC38021pm Anu() {
        return (InterfaceC38021pm) A05(537407194, HXg.class);
    }

    @Override // X.InterfaceC37791pH
    public final InterfaceC38061pq Arc() {
        InterfaceC38061pq interfaceC38061pq = this.A0B;
        if (interfaceC38061pq == null) {
            return (InterfaceC38061pq) A05(-384210758, HWY.class);
        }
        return interfaceC38061pq;
    }

    @Override // X.InterfaceC37791pH
    public final List Ark() {
        return A08(-295216049, HNL.class);
    }

    @Override // X.InterfaceC37791pH
    public final InterfaceC38101pu AsP() {
        return (InterfaceC38101pu) A05(175980892, HWL.class);
    }

    @Override // X.InterfaceC37791pH
    public final InterfaceC38121pw B1O() {
        InterfaceC38121pw interfaceC38121pw = this.A09;
        if (interfaceC38121pw == null) {
            return (InterfaceC38121pw) A05(-678020908, HWJ.class);
        }
        return interfaceC38121pw;
    }

    @Override // X.InterfaceC37791pH
    public final FanClubStoriesTeaserType B4Q() {
        return (FanClubStoriesTeaserType) A0N(-1181278080, C43330JCx.A00);
    }

    @Override // X.InterfaceC37791pH
    public final HallpassDetailsDict BAs() {
        HallpassDetailsDict hallpassDetailsDict = this.A01;
        if (hallpassDetailsDict == null) {
            return (HallpassDetailsDict) A05(1985451775, ImmutablePandoHallpassDetailsDict.class);
        }
        return hallpassDetailsDict;
    }

    @Override // X.InterfaceC37791pH
    public final HighlightReelTypeStr BE5() {
        return (HighlightReelTypeStr) A0N(-1512610700, C43331JCy.A00);
    }

    @Override // X.InterfaceC37791pH
    public final List BER() {
        return this.A0E;
    }

    @Override // X.InterfaceC37791pH
    public final InterfaceC38171q4 BFO() {
        return (InterfaceC38171q4) A05(-124003287, C27250C0n.class);
    }

    @Override // X.InterfaceC37791pH
    public final IntentAwareAdsInfoIntf BIo() {
        return (IntentAwareAdsInfoIntf) A05(-1964130399, ImmutablePandoIntentAwareAdsInfo.class);
    }

    @Override // X.InterfaceC37791pH
    public final List BIp() {
        List list = this.A0F;
        if (list == null) {
            return A08(-750457594, HWN.class);
        }
        return list;
    }

    @Override // X.InterfaceC37791pH
    public final InterfaceC38221qC BJK() {
        return (InterfaceC38221qC) A05(-955246378, HXK.class);
    }

    @Override // X.InterfaceC37791pH
    public final InterfaceC38251qF BRO() {
        return (InterfaceC38251qF) A05(-1713645971, C39240HQw.class);
    }

    @Override // X.InterfaceC37791pH
    public final InterfaceC38281qI BTI() {
        return (InterfaceC38281qI) A05(1548961349, HR5.class);
    }

    @Override // X.InterfaceC37791pH
    public final C38321qM BWX() {
        return this.A07;
    }

    @Override // X.InterfaceC37791pH
    public final InterfaceC38481qc Bag() {
        return (InterfaceC38481qc) A05(106164915, HSa.class);
    }

    @Override // X.InterfaceC37791pH
    public final List Bf8() {
        return A0p(-563721412, C43332JCz.A00);
    }

    @Override // X.InterfaceC37791pH
    public final InterfaceC38501qe BkB() {
        return (InterfaceC38501qe) A05(1647967559, HWM.class);
    }

    @Override // X.InterfaceC37791pH
    public final InterfaceC38061pq BlC() {
        InterfaceC38061pq interfaceC38061pq = this.A0C;
        if (interfaceC38061pq == null) {
            return (InterfaceC38061pq) A05(-1604422820, HWY.class);
        }
        return interfaceC38061pq;
    }

    @Override // X.InterfaceC37791pH
    public final InterfaceC38531qh Blr() {
        return (InterfaceC38531qh) A05(1029625794, C33032Ehe.class);
    }

    @Override // X.InterfaceC37791pH
    public final ReelType Bls() {
        return (ReelType) A0N(-1629344193, JD0.A00);
    }

    @Override // X.InterfaceC37791pH
    public final InterfaceC38551qj BoN() {
        return (InterfaceC38551qj) A05(2009656958, HWF.class);
    }

    @Override // X.InterfaceC37791pH
    public final InterfaceC38571ql BpR() {
        return (InterfaceC38571ql) A05(740543069, HXa.class);
    }

    @Override // X.InterfaceC37791pH
    public final RingSpec BpS() {
        return (RingSpec) A05(301343850, ImmutablePandoRingSpec.class);
    }

    @Override // X.InterfaceC37791pH
    public final InterfaceC38601qq Bu6() {
        InterfaceC38601qq interfaceC38601qq = this.A03;
        if (interfaceC38601qq == null) {
            return (InterfaceC38601qq) A05(-1303425935, C39255HSq.class);
        }
        return interfaceC38601qq;
    }

    @Override // X.InterfaceC37791pH
    public final InterfaceC38621qt BxU() {
        return (InterfaceC38621qt) A05(1737448803, HXN.class);
    }

    @Override // X.InterfaceC37791pH
    public final InterfaceC38651qw By7() {
        InterfaceC38651qw interfaceC38651qw = this.A04;
        if (interfaceC38651qw == null) {
            return (InterfaceC38651qw) A05(1197591877, C39260HSz.class);
        }
        return interfaceC38651qw;
    }

    @Override // X.InterfaceC37791pH
    public final InterfaceC38671qy C3t() {
        InterfaceC38671qy interfaceC38671qy = this.A0A;
        if (interfaceC38671qy == null) {
            return (InterfaceC38671qy) A05(-1612548628, HWO.class);
        }
        return interfaceC38671qy;
    }

    @Override // X.InterfaceC37791pH
    public final InterfaceC38691r1 C43() {
        InterfaceC38691r1 interfaceC38691r1 = this.A05;
        if (interfaceC38691r1 == null) {
            return (InterfaceC38691r1) A05(-63762699, HUr.class);
        }
        return interfaceC38691r1;
    }

    @Override // X.InterfaceC37791pH
    public final InterfaceC38711r3 C7t() {
        InterfaceC38711r3 interfaceC38711r3 = this.A06;
        if (interfaceC38711r3 == null) {
            return (InterfaceC38711r3) A05(1667294722, HVJ.class);
        }
        return interfaceC38711r3;
    }

    @Override // X.InterfaceC37791pH
    public final InterfaceC38731r5 CB0() {
        InterfaceC38731r5 interfaceC38731r5 = this.A02;
        if (interfaceC38731r5 == null) {
            return (InterfaceC38731r5) A05(1255506917, HSO.class);
        }
        return interfaceC38731r5;
    }

    @Override // X.InterfaceC37791pH
    public final User CDj() {
        return this.A0D;
    }

    @Override // X.InterfaceC37791pH
    public final List CFa() {
        ImmutableList A08 = A08(1315660899, C37926GmO.class);
        if (A08 != null) {
            ArrayList A0q = AbstractC167017dG.A0q(A08);
            Iterator<E> it = A08.iterator();
            while (it.hasNext()) {
                C37926GmO c37926GmO = (C37926GmO) it.next();
                C14360o3.A0A(c37926GmO);
                A0q.add(new ExtendedImageUrl(c37926GmO));
            }
            return A0q;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02fd  */
    @Override // X.InterfaceC37791pH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C37771pE F5R(X.C1DY r124) {
        /*
            Method dump skipped, instructions count: 1167
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HWN.F5R(X.1DY):X.1pE");
    }

    @Override // X.InterfaceC37791pH
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40704I2k.A00(this));
    }

    @Override // X.InterfaceC37791pH
    public final List getItems() {
        return this.A0G;
    }

    @Override // X.InterfaceC37791pH
    public final String AYx() {
        return A0i(-1650554971);
    }

    @Override // X.InterfaceC37791pH
    public final Long AZC() {
        return A0L(1394689863);
    }

    @Override // X.InterfaceC37791pH
    public final String AcH() {
        return A0i(-1411074055);
    }

    @Override // X.InterfaceC37791pH
    public final String AcX() {
        return A0i(-104545864);
    }

    @Override // X.InterfaceC37791pH
    public final Boolean Ag6() {
        return getOptionalBooleanValueByHashCode(2014580835);
    }

    @Override // X.InterfaceC37791pH
    public final String AkD() {
        return A0i(2083788458);
    }

    @Override // X.InterfaceC37791pH
    public final Boolean Ake() {
        return getOptionalBooleanValueByHashCode(1254410627);
    }

    @Override // X.InterfaceC37791pH
    public final Boolean Aki() {
        return getOptionalBooleanValueByHashCode(373873083);
    }

    @Override // X.InterfaceC37791pH
    public final Boolean Akk() {
        return getOptionalBooleanValueByHashCode(-1482588131);
    }

    @Override // X.InterfaceC37791pH
    public final Integer AmH() {
        return getOptionalIntValueByHashCode(1793672856);
    }

    @Override // X.InterfaceC37791pH
    public final Float Ao0() {
        return A0K(-47277762);
    }

    @Override // X.InterfaceC37791pH
    public final Boolean Aqn() {
        return getOptionalBooleanValueByHashCode(1192530534);
    }

    @Override // X.InterfaceC37791pH
    public final Boolean Aqo() {
        return getOptionalBooleanValueByHashCode(-420581850);
    }

    @Override // X.InterfaceC37791pH
    public final Integer AsZ() {
        return getOptionalIntValueByHashCode(1369680106);
    }

    @Override // X.InterfaceC37791pH
    public final List Ay4() {
        return getOptionalStringListByHashCode(575485345);
    }

    @Override // X.InterfaceC37791pH
    public final Boolean B16() {
        return getOptionalBooleanValueByHashCode(-807275036);
    }

    @Override // X.InterfaceC37791pH
    public final Long B3E() {
        return A0L(31792438);
    }

    @Override // X.InterfaceC37791pH
    public final String B6b() {
        return A0i(-1817204443);
    }

    @Override // X.InterfaceC37791pH
    public final Boolean BBD() {
        return getOptionalBooleanValueByHashCode(-1895250381);
    }

    @Override // X.InterfaceC37791pH
    public final Boolean BBI() {
        return getOptionalBooleanValueByHashCode(-589207591);
    }

    @Override // X.InterfaceC37791pH
    public final Boolean BBe() {
        return getOptionalBooleanValueByHashCode(1835588620);
    }

    @Override // X.InterfaceC37791pH
    public final String BC9() {
        return A0i(-557182552);
    }

    @Override // X.InterfaceC37791pH
    public final Boolean BCP() {
        return getOptionalBooleanValueByHashCode(-304107480);
    }

    @Override // X.InterfaceC37791pH
    public final Boolean BCw() {
        return getOptionalBooleanValueByHashCode(72887958);
    }

    @Override // X.InterfaceC37791pH
    public final Boolean BDi() {
        return getOptionalBooleanValueByHashCode(1002875341);
    }

    @Override // X.InterfaceC37791pH
    public final Long BH3() {
        return A0L(-1411247483);
    }

    @Override // X.InterfaceC37791pH
    public final Boolean BHN() {
        return getOptionalBooleanValueByHashCode(1526377620);
    }

    @Override // X.InterfaceC37791pH
    public final String BIt() {
        return A0i(-1142947031);
    }

    @Override // X.InterfaceC37791pH
    public final Float BM9() {
        return A0K(-1315574141);
    }

    @Override // X.InterfaceC37791pH
    public final Long BMD() {
        return A0L(1930186039);
    }

    @Override // X.InterfaceC37791pH
    public final Long BMF() {
        return A0L(-63795856);
    }

    @Override // X.InterfaceC37791pH
    public final Integer BQb() {
        return getOptionalIntValueByHashCode(-9393932);
    }

    @Override // X.InterfaceC37791pH
    public final List BR1() {
        return A0n(2140775389);
    }

    @Override // X.InterfaceC37791pH
    public final Boolean BVw() {
        return getOptionalBooleanValueByHashCode(104264043);
    }

    @Override // X.InterfaceC37791pH
    public final String BWe() {
        return A0i(-1852539703);
    }

    @Override // X.InterfaceC37791pH
    public final Integer BWq() {
        return getOptionalIntValueByHashCode(-302348463);
    }

    @Override // X.InterfaceC37791pH
    public final String Baz() {
        return A0i(-803548981);
    }

    @Override // X.InterfaceC37791pH
    public final Integer BfS() {
        return getOptionalIntValueByHashCode(1156751559);
    }

    @Override // X.InterfaceC37791pH
    public final Integer BgY() {
        return getOptionalIntValueByHashCode(304036471);
    }

    @Override // X.InterfaceC37791pH
    public final Long Bib() {
        return A0L(1962741303);
    }

    @Override // X.InterfaceC37791pH
    public final Integer Bk9() {
        return getOptionalIntValueByHashCode(-1456594659);
    }

    @Override // X.InterfaceC37791pH
    public final Integer Bs8() {
        return getOptionalIntValueByHashCode(3526267);
    }

    @Override // X.InterfaceC37791pH
    public final Integer BsD() {
        return getOptionalIntValueByHashCode(-960041127);
    }

    @Override // X.InterfaceC37791pH
    public final Boolean BvF() {
        return getOptionalBooleanValueByHashCode(74209027);
    }

    @Override // X.InterfaceC37791pH
    public final Boolean Bvr() {
        return getOptionalBooleanValueByHashCode(-1473952391);
    }

    @Override // X.InterfaceC37791pH
    public final Boolean BwG() {
        return getOptionalBooleanValueByHashCode(518536183);
    }

    @Override // X.InterfaceC37791pH
    public final Boolean Bwe() {
        return getOptionalBooleanValueByHashCode(-416438509);
    }

    @Override // X.InterfaceC37791pH
    public final String Bxs() {
        return A0i(327472969);
    }

    @Override // X.InterfaceC37791pH
    public final String ByJ() {
        return A0i(-823445795);
    }

    @Override // X.InterfaceC37791pH
    public final String Byt() {
        return A0i(1671283925);
    }

    @Override // X.InterfaceC37791pH
    public final Integer C1O() {
        return getOptionalIntValueByHashCode(883232835);
    }

    @Override // X.InterfaceC37791pH
    public final Integer C2U() {
        return getOptionalIntValueByHashCode(-1328517066);
    }

    @Override // X.InterfaceC37791pH
    public final Long CCf() {
        return A0L(782815985);
    }

    @Override // X.InterfaceC37791pH
    public final List CCw() {
        return A0n(1853545970);
    }

    @Override // X.InterfaceC37791pH
    public final List CCy() {
        return A0n(758682832);
    }

    @Override // X.InterfaceC37791pH
    public final Integer CDF() {
        return getOptionalIntValueByHashCode(747083410);
    }

    @Override // X.InterfaceC37791pH
    public final List CFZ() {
        return A0l(-401532258);
    }

    @Override // X.InterfaceC37791pH
    public final Boolean CPa() {
        return getOptionalBooleanValueByHashCode(2047263580);
    }

    @Override // X.InterfaceC37791pH
    public final Boolean CPe() {
        return getOptionalBooleanValueByHashCode(-1166593166);
    }

    @Override // X.InterfaceC37791pH
    public final Boolean CQ1() {
        return getOptionalBooleanValueByHashCode(1843628887);
    }

    @Override // X.InterfaceC37791pH
    public final Boolean CR1() {
        return getOptionalBooleanValueByHashCode(-1864315129);
    }

    @Override // X.InterfaceC37791pH
    public final Boolean CRn() {
        return getOptionalBooleanValueByHashCode(-1982676575);
    }

    @Override // X.InterfaceC37791pH
    public final Boolean CS7() {
        return getOptionalBooleanValueByHashCode(2048434307);
    }

    @Override // X.InterfaceC37791pH
    public final Boolean CUX() {
        return getOptionalBooleanValueByHashCode(-804474282);
    }

    @Override // X.InterfaceC37791pH
    public final Boolean CUv() {
        return getOptionalBooleanValueByHashCode(13224064);
    }

    @Override // X.InterfaceC37791pH
    public final Boolean CZX() {
        return getOptionalBooleanValueByHashCode(-1179761924);
    }

    @Override // X.InterfaceC37791pH
    public final Boolean CaN() {
        return getOptionalBooleanValueByHashCode(1559214978);
    }

    @Override // X.InterfaceC37791pH
    public final InterfaceC37791pH EBd(C1DY c1dy) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        InterfaceC37821pL AYI = AYI();
        InterfaceC38731r5 interfaceC38731r5 = null;
        if (AYI != null) {
            AYI.EBa(c1dy);
        } else {
            AYI = null;
        }
        this.A08 = AYI;
        InterfaceC37961pd AiD = AiD();
        if (AiD != null) {
            AiD.E8l(c1dy);
        } else {
            AiD = null;
        }
        this.A00 = AiD;
        InterfaceC38061pq Arc = Arc();
        if (Arc != null) {
            Arc.EBj(c1dy);
        } else {
            Arc = null;
        }
        this.A0B = Arc;
        InterfaceC38121pw B1O = B1O();
        if (B1O != null) {
            B1O.EBc(c1dy);
        } else {
            B1O = null;
        }
        this.A09 = B1O;
        HallpassDetailsDict BAs = BAs();
        if (BAs != null) {
            BAs.E99(c1dy);
        } else {
            BAs = null;
        }
        this.A01 = BAs;
        ImmutableList A08 = A08(1447225418, ImmutablePandoUserDict.class);
        if (A08 != null) {
            arrayList = AbstractC167017dG.A0q(A08);
            Iterator<E> it = A08.iterator();
            while (it.hasNext()) {
                AbstractC31179DnN.A1I(c1dy, arrayList, it);
            }
        } else {
            arrayList = null;
        }
        this.A0E = arrayList;
        List<InterfaceC37791pH> BIp = BIp();
        if (BIp != null) {
            arrayList2 = AbstractC167017dG.A0q(BIp);
            for (InterfaceC37791pH interfaceC37791pH : BIp) {
                interfaceC37791pH.EBd(c1dy);
                arrayList2.add(interfaceC37791pH);
            }
        } else {
            arrayList2 = null;
        }
        this.A0F = arrayList2;
        ImmutableList A082 = A08(100526016, ImmutablePandoMediaDict.class);
        if (A082 != null) {
            arrayList3 = AbstractC167017dG.A0q(A082);
            Iterator<E> it2 = A082.iterator();
            while (it2.hasNext()) {
                AbstractC37304Gc5.A1F(c1dy, arrayList3, it2);
            }
        } else {
            arrayList3 = null;
        }
        this.A0G = arrayList3;
        this.A07 = AbstractC37304Gc5.A0D(c1dy, this, 1879186594);
        InterfaceC38061pq BlC = BlC();
        if (BlC != null) {
            BlC.EBj(c1dy);
        } else {
            BlC = null;
        }
        this.A0C = BlC;
        InterfaceC38601qq Bu6 = Bu6();
        if (Bu6 != null) {
            Bu6.E9p(c1dy);
        } else {
            Bu6 = null;
        }
        this.A03 = Bu6;
        InterfaceC38651qw By7 = By7();
        if (By7 != null) {
            By7.E9s(c1dy);
        } else {
            By7 = null;
        }
        this.A04 = By7;
        InterfaceC38671qy C3t = C3t();
        if (C3t != null) {
            C3t.EBe(c1dy);
        } else {
            C3t = null;
        }
        this.A0A = C3t;
        InterfaceC38691r1 C43 = C43();
        if (C43 != null) {
            C43.EAz(c1dy);
        } else {
            C43 = null;
        }
        this.A05 = C43;
        InterfaceC38711r3 C7t = C7t();
        if (C7t != null) {
            C7t.EB7(c1dy);
        } else {
            C7t = null;
        }
        this.A06 = C7t;
        InterfaceC38731r5 CB0 = CB0();
        if (CB0 != null) {
            CB0.E9i(c1dy);
            interfaceC38731r5 = CB0;
        }
        this.A02 = interfaceC38731r5;
        this.A0D = AbstractC31179DnN.A0T(c1dy, this);
        return this;
    }

    @Override // X.InterfaceC37791pH
    public final C37771pE F5S(C1DV c1dv) {
        return F5R(AbstractC37304Gc5.A09(c1dv));
    }

    @Override // X.InterfaceC37791pH
    public final String getId() {
        return A0e();
    }

    @Override // X.InterfaceC37791pH
    public final String getStrongId() {
        return A0j(356255459);
    }

    @Override // X.InterfaceC37791pH
    public final String getTitle() {
        return A0Y();
    }
}
