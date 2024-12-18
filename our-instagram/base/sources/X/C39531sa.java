package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.AdFormatType;
import com.instagram.api.schemas.AppstoreMetadataDict;
import com.instagram.api.schemas.BrandedContentAdsPaidPartnershipLabelRemovalOption;
import com.instagram.api.schemas.CallAdsInfoDict;
import com.instagram.api.schemas.DynamicProductAdDisplayOption;
import com.instagram.api.schemas.IGAdCreativeStory9x16CaptionData;
import com.instagram.api.schemas.IGAdProfileProductTabDict;
import com.instagram.api.schemas.IGAdsIABScreenshotDataDict;
import com.instagram.api.schemas.IGCTATextVariant;
import com.instagram.api.schemas.IGCTMessagingAdsInfoDict;
import com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf;
import com.instagram.api.schemas.IGRFSurveyInfoDict;
import com.instagram.api.schemas.TestimonialDict;
import com.instagram.model.mediatype.CTAStyle;
import com.instagram.sponsored.signals.model.AdsCTATrustInfo;
import com.instagram.sponsored.signals.model.AdsCTATrustInfoIntf;
import com.instagram.sponsored.signals.model.AdsIAWRatingInfo;
import com.instagram.sponsored.signals.model.AdsIAWRatingInfoIntf;
import com.instagram.sponsored.signals.model.AdsRatingInfo;
import com.instagram.sponsored.signals.model.AdsRatingInfoIntf;
import com.instagram.sponsored.signals.model.AdsTextTrustInfo;
import com.instagram.sponsored.signals.model.AdsTextTrustInfoIntf;
import java.util.List;

/* renamed from: X.1sa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39531sa extends C0T6 implements InterfaceC39541sb {
    public final AdFormatType A00;
    public final C114555Fb A01;
    public final C1s4 A02;
    public final AppstoreMetadataDict A03;
    public final BrandedContentAdsPaidPartnershipLabelRemovalOption A04;
    public final InterfaceC104784ni A05;
    public final C114575Fd A06;
    public final CallAdsInfoDict A07;
    public final InterfaceC87573vP A08;
    public final InterfaceC39301sB A09;
    public final InterfaceC104824nn A0A;
    public final C114565Fc A0B;
    public final C52r A0C;
    public final DynamicProductAdDisplayOption A0D;
    public final C114585Fe A0E;
    public final C87703ve A0F;
    public final C114595Ff A0G;
    public final IGAdCreativeStory9x16CaptionData A0H;
    public final InterfaceC104854ns A0I;
    public final InterfaceC104864nt A0J;
    public final IGAdProfileProductTabDict A0K;
    public final C100444f8 A0L;
    public final IGAdsIABScreenshotDataDict A0M;
    public final IGCTATextVariant A0N;
    public final IGCTMessagingAdsInfoDict A0O;
    public final C1s7 A0P;
    public final InterfaceC104874ny A0Q;
    public final InterfaceC39391sK A0R;
    public final C39411sM A0S;
    public final InterfaceC104914o3 A0T;
    public final InterfaceC104884nz A0U;
    public final C1117552c A0V;
    public final IGRFSurveyInfoDict A0W;
    public final InterfaceC104994oF A0X;
    public final InterfaceC104964oB A0Y;
    public final InterfaceC104904o2 A0Z;
    public final C114605Fi A0a;
    public final C51L A0b;
    public final InterfaceC104944o7 A0c;
    public final C47W A0d;
    public final C102724k9 A0e;
    public final C102724k9 A0f;
    public final C106594rE A0g;
    public final C114615Fj A0h;
    public final InterfaceC104984oD A0i;
    public final TestimonialDict A0j;
    public final C114625Fm A0k;
    public final C914346k A0l;
    public final C38891rO A0m;
    public final CTAStyle A0n;
    public final C37881pR A0o;
    public final C37881pR A0p;
    public final C5Fa A0q;
    public final C38211qB A0r;
    public final C5Fk A0s;
    public final C5Fl A0t;
    public final AdsCTATrustInfo A0u;
    public final AdsIAWRatingInfo A0v;
    public final AdsRatingInfo A0w;
    public final AdsTextTrustInfo A0x;
    public final Boolean A0y;
    public final Boolean A0z;
    public final Boolean A10;
    public final Boolean A11;
    public final Boolean A12;
    public final Boolean A13;
    public final Boolean A14;
    public final Boolean A15;
    public final Boolean A16;
    public final Boolean A17;
    public final Boolean A18;
    public final Boolean A19;
    public final Boolean A1A;
    public final Boolean A1B;
    public final Boolean A1C;
    public final Boolean A1D;
    public final Boolean A1E;
    public final Boolean A1F;
    public final Boolean A1G;
    public final Boolean A1H;
    public final Boolean A1I;
    public final Boolean A1J;
    public final Boolean A1K;
    public final Boolean A1L;
    public final Boolean A1M;
    public final Boolean A1N;
    public final Boolean A1O;
    public final Boolean A1P;
    public final Boolean A1Q;
    public final Boolean A1R;
    public final Boolean A1S;
    public final Boolean A1T;
    public final Boolean A1U;
    public final Boolean A1V;
    public final Boolean A1W;
    public final Boolean A1X;
    public final Boolean A1Y;
    public final Boolean A1Z;
    public final Integer A1a;
    public final Integer A1b;
    public final Integer A1c;
    public final Integer A1d;
    public final Integer A1e;
    public final Integer A1f;
    public final Integer A1g;
    public final Integer A1h;
    public final Long A1i;
    public final Long A1j;
    public final String A1k;
    public final String A1l;
    public final String A1m;
    public final String A1n;
    public final String A1o;
    public final String A1p;
    public final String A1q;
    public final String A1r;
    public final String A1s;
    public final String A1t;
    public final String A1u;
    public final String A1v;
    public final String A1w;
    public final String A1x;
    public final String A1y;
    public final String A1z;
    public final String A20;
    public final String A21;
    public final String A22;
    public final String A23;
    public final String A24;
    public final String A25;
    public final String A26;
    public final String A27;
    public final String A28;
    public final String A29;
    public final String A2A;
    public final String A2B;
    public final List A2C;
    public final List A2D;
    public final List A2E;
    public final List A2F;
    public final List A2G;
    public final List A2H;
    public final List A2I;
    public final List A2J;
    public final List A2K;
    public final List A2L;
    public final List A2M;
    public final List A2N;
    public final List A2O;

    @Override // X.InterfaceC39541sb
    public final C39531sa F4u(C1DY c1dy) {
        return this;
    }

    @Override // X.InterfaceC39541sb
    public final C39531sa F4v(C1DV c1dv) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C39531sa) {
                C39531sa c39531sa = (C39531sa) obj;
                if (!C14360o3.A0K(this.A1k, c39531sa.A1k) || !C14360o3.A0K(this.A1l, c39531sa.A1l) || !C14360o3.A0K(this.A1m, c39531sa.A1m) || !C14360o3.A0K(this.A0q, c39531sa.A0q) || !C14360o3.A0K(this.A1i, c39531sa.A1i) || !C14360o3.A0K(this.A1n, c39531sa.A1n) || !C14360o3.A0K(this.A1a, c39531sa.A1a) || !C14360o3.A0K(this.A0o, c39531sa.A0o) || !C14360o3.A0K(this.A0F, c39531sa.A0F) || !C14360o3.A0K(this.A1o, c39531sa.A1o) || !C14360o3.A0K(this.A0p, c39531sa.A0p) || !C14360o3.A0K(this.A0v, c39531sa.A0v) || !C14360o3.A0K(this.A0w, c39531sa.A0w) || !C14360o3.A0K(this.A01, c39531sa.A01) || !C14360o3.A0K(this.A1p, c39531sa.A1p) || !C14360o3.A0K(this.A02, c39531sa.A02) || !C14360o3.A0K(this.A1q, c39531sa.A1q) || !C14360o3.A0K(this.A03, c39531sa.A03) || this.A04 != c39531sa.A04 || !C14360o3.A0K(this.A0l, c39531sa.A0l) || !C14360o3.A0K(this.A2C, c39531sa.A2C) || !C14360o3.A0K(this.A1j, c39531sa.A1j) || !C14360o3.A0K(this.A05, c39531sa.A05) || !C14360o3.A0K(this.A07, c39531sa.A07) || !C14360o3.A0K(this.A1r, c39531sa.A1r) || !C14360o3.A0K(this.A2D, c39531sa.A2D) || !C14360o3.A0K(this.A0P, c39531sa.A0P) || !C14360o3.A0K(this.A1s, c39531sa.A1s) || !C14360o3.A0K(this.A2E, c39531sa.A2E) || !C14360o3.A0K(this.A2F, c39531sa.A2F) || !C14360o3.A0K(this.A1t, c39531sa.A1t) || !C14360o3.A0K(this.A0B, c39531sa.A0B) || !C14360o3.A0K(this.A0C, c39531sa.A0C) || !C14360o3.A0K(this.A06, c39531sa.A06) || this.A0n != c39531sa.A0n || !C14360o3.A0K(this.A08, c39531sa.A08) || !C14360o3.A0K(this.A09, c39531sa.A09) || !C14360o3.A0K(this.A0O, c39531sa.A0O) || !C14360o3.A0K(this.A0A, c39531sa.A0A) || !C14360o3.A0K(this.A0y, c39531sa.A0y) || !C14360o3.A0K(this.A1u, c39531sa.A1u) || !C14360o3.A0K(this.A0z, c39531sa.A0z) || !C14360o3.A0K(this.A10, c39531sa.A10) || !C14360o3.A0K(this.A1v, c39531sa.A1v) || !C14360o3.A0K(this.A1b, c39531sa.A1b) || !C14360o3.A0K(this.A2G, c39531sa.A2G) || this.A0D != c39531sa.A0D || !C14360o3.A0K(this.A11, c39531sa.A11) || !C14360o3.A0K(this.A12, c39531sa.A12) || !C14360o3.A0K(this.A1w, c39531sa.A1w) || !C14360o3.A0K(this.A1x, c39531sa.A1x) || !C14360o3.A0K(this.A0E, c39531sa.A0E) || this.A00 != c39531sa.A00 || !C14360o3.A0K(this.A0G, c39531sa.A0G) || !C14360o3.A0K(this.A1c, c39531sa.A1c) || !C14360o3.A0K(this.A1d, c39531sa.A1d) || !C14360o3.A0K(this.A1y, c39531sa.A1y) || !C14360o3.A0K(this.A2H, c39531sa.A2H) || !C14360o3.A0K(this.A0R, c39531sa.A0R) || !C14360o3.A0K(this.A0S, c39531sa.A0S) || !C14360o3.A0K(this.A1z, c39531sa.A1z) || !C14360o3.A0K(this.A0I, c39531sa.A0I) || !C14360o3.A0K(this.A0J, c39531sa.A0J) || !C14360o3.A0K(this.A0u, c39531sa.A0u) || !C14360o3.A0K(this.A0x, c39531sa.A0x) || !C14360o3.A0K(this.A0M, c39531sa.A0M) || !C14360o3.A0K(this.A0N, c39531sa.A0N) || !C14360o3.A0K(this.A20, c39531sa.A20) || !C14360o3.A0K(this.A0L, c39531sa.A0L) || !C14360o3.A0K(this.A0Q, c39531sa.A0Q) || !C14360o3.A0K(this.A0U, c39531sa.A0U) || !C14360o3.A0K(this.A0V, c39531sa.A0V) || !C14360o3.A0K(this.A0W, c39531sa.A0W) || !C14360o3.A0K(this.A0Z, c39531sa.A0Z) || !C14360o3.A0K(this.A0e, c39531sa.A0e) || !C14360o3.A0K(this.A1e, c39531sa.A1e) || !C14360o3.A0K(this.A1f, c39531sa.A1f) || !C14360o3.A0K(this.A0r, c39531sa.A0r) || !C14360o3.A0K(this.A1C, c39531sa.A1C) || !C14360o3.A0K(this.A13, c39531sa.A13) || !C14360o3.A0K(this.A14, c39531sa.A14) || !C14360o3.A0K(this.A15, c39531sa.A15) || !C14360o3.A0K(this.A16, c39531sa.A16) || !C14360o3.A0K(this.A17, c39531sa.A17) || !C14360o3.A0K(this.A18, c39531sa.A18) || !C14360o3.A0K(this.A19, c39531sa.A19) || !C14360o3.A0K(this.A1A, c39531sa.A1A) || !C14360o3.A0K(this.A1B, c39531sa.A1B) || !C14360o3.A0K(this.A1D, c39531sa.A1D) || !C14360o3.A0K(this.A1E, c39531sa.A1E) || !C14360o3.A0K(this.A1F, c39531sa.A1F) || !C14360o3.A0K(this.A1G, c39531sa.A1G) || !C14360o3.A0K(this.A1H, c39531sa.A1H) || !C14360o3.A0K(this.A1I, c39531sa.A1I) || !C14360o3.A0K(this.A1J, c39531sa.A1J) || !C14360o3.A0K(this.A1K, c39531sa.A1K) || !C14360o3.A0K(this.A1L, c39531sa.A1L) || !C14360o3.A0K(this.A1M, c39531sa.A1M) || !C14360o3.A0K(this.A1N, c39531sa.A1N) || !C14360o3.A0K(this.A1O, c39531sa.A1O) || !C14360o3.A0K(this.A1P, c39531sa.A1P) || !C14360o3.A0K(this.A1Q, c39531sa.A1Q) || !C14360o3.A0K(this.A1g, c39531sa.A1g) || !C14360o3.A0K(this.A2I, c39531sa.A2I) || !C14360o3.A0K(this.A21, c39531sa.A21) || !C14360o3.A0K(this.A1R, c39531sa.A1R) || !C14360o3.A0K(this.A2J, c39531sa.A2J) || !C14360o3.A0K(this.A22, c39531sa.A22) || !C14360o3.A0K(this.A1S, c39531sa.A1S) || !C14360o3.A0K(this.A23, c39531sa.A23) || !C14360o3.A0K(this.A2K, c39531sa.A2K) || !C14360o3.A0K(this.A1T, c39531sa.A1T) || !C14360o3.A0K(this.A0T, c39531sa.A0T) || !C14360o3.A0K(this.A24, c39531sa.A24) || !C14360o3.A0K(this.A25, c39531sa.A25) || !C14360o3.A0K(this.A0f, c39531sa.A0f) || !C14360o3.A0K(this.A26, c39531sa.A26) || !C14360o3.A0K(this.A0a, c39531sa.A0a) || !C14360o3.A0K(this.A0h, c39531sa.A0h) || !C14360o3.A0K(this.A0b, c39531sa.A0b) || !C14360o3.A0K(this.A27, c39531sa.A27) || !C14360o3.A0K(this.A28, c39531sa.A28) || !C14360o3.A0K(this.A2L, c39531sa.A2L) || !C14360o3.A0K(this.A29, c39531sa.A29) || !C14360o3.A0K(this.A2A, c39531sa.A2A) || !C14360o3.A0K(this.A0c, c39531sa.A0c) || !C14360o3.A0K(this.A2M, c39531sa.A2M) || !C14360o3.A0K(this.A2N, c39531sa.A2N) || !C14360o3.A0K(this.A0K, c39531sa.A0K) || !C14360o3.A0K(this.A0d, c39531sa.A0d) || !C14360o3.A0K(this.A0s, c39531sa.A0s) || !C14360o3.A0K(this.A0t, c39531sa.A0t) || !C14360o3.A0K(this.A0Y, c39531sa.A0Y) || !C14360o3.A0K(this.A1U, c39531sa.A1U) || !C14360o3.A0K(this.A1V, c39531sa.A1V) || !C14360o3.A0K(this.A1W, c39531sa.A1W) || !C14360o3.A0K(this.A1X, c39531sa.A1X) || !C14360o3.A0K(this.A1Y, c39531sa.A1Y) || !C14360o3.A0K(this.A1Z, c39531sa.A1Z) || !C14360o3.A0K(this.A0g, c39531sa.A0g) || !C14360o3.A0K(this.A0i, c39531sa.A0i) || !C14360o3.A0K(this.A0H, c39531sa.A0H) || !C14360o3.A0K(this.A0m, c39531sa.A0m) || !C14360o3.A0K(this.A0j, c39531sa.A0j) || !C14360o3.A0K(this.A0X, c39531sa.A0X) || !C14360o3.A0K(this.A2B, c39531sa.A2B) || !C14360o3.A0K(this.A0k, c39531sa.A0k) || !C14360o3.A0K(this.A1h, c39531sa.A1h) || !C14360o3.A0K(this.A2O, c39531sa.A2O)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A1k;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.A1l;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A1m;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        C5Fa c5Fa = this.A0q;
        int hashCode4 = (hashCode3 + (c5Fa == null ? 0 : c5Fa.hashCode())) * 31;
        Long l = this.A1i;
        int hashCode5 = (hashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        String str4 = this.A1n;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.A1a;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        C37881pR c37881pR = this.A0o;
        int hashCode8 = (hashCode7 + (c37881pR == null ? 0 : c37881pR.hashCode())) * 31;
        C87703ve c87703ve = this.A0F;
        int hashCode9 = (hashCode8 + (c87703ve == null ? 0 : c87703ve.hashCode())) * 31;
        String str5 = this.A1o;
        int hashCode10 = (hashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        C37881pR c37881pR2 = this.A0p;
        int hashCode11 = (hashCode10 + (c37881pR2 == null ? 0 : c37881pR2.hashCode())) * 31;
        AdsIAWRatingInfo adsIAWRatingInfo = this.A0v;
        int hashCode12 = (hashCode11 + (adsIAWRatingInfo == null ? 0 : adsIAWRatingInfo.hashCode())) * 31;
        AdsRatingInfo adsRatingInfo = this.A0w;
        int hashCode13 = (hashCode12 + (adsRatingInfo == null ? 0 : adsRatingInfo.hashCode())) * 31;
        C114555Fb c114555Fb = this.A01;
        int hashCode14 = (hashCode13 + (c114555Fb == null ? 0 : c114555Fb.hashCode())) * 31;
        String str6 = this.A1p;
        int hashCode15 = (hashCode14 + (str6 == null ? 0 : str6.hashCode())) * 31;
        C1s4 c1s4 = this.A02;
        int hashCode16 = (hashCode15 + (c1s4 == null ? 0 : c1s4.hashCode())) * 31;
        String str7 = this.A1q;
        int hashCode17 = (hashCode16 + (str7 == null ? 0 : str7.hashCode())) * 31;
        AppstoreMetadataDict appstoreMetadataDict = this.A03;
        int hashCode18 = (hashCode17 + (appstoreMetadataDict == null ? 0 : appstoreMetadataDict.hashCode())) * 31;
        BrandedContentAdsPaidPartnershipLabelRemovalOption brandedContentAdsPaidPartnershipLabelRemovalOption = this.A04;
        int hashCode19 = (hashCode18 + (brandedContentAdsPaidPartnershipLabelRemovalOption == null ? 0 : brandedContentAdsPaidPartnershipLabelRemovalOption.hashCode())) * 31;
        C914346k c914346k = this.A0l;
        int hashCode20 = (hashCode19 + (c914346k == null ? 0 : c914346k.hashCode())) * 31;
        List list = this.A2C;
        int hashCode21 = (hashCode20 + (list == null ? 0 : list.hashCode())) * 31;
        Long l2 = this.A1j;
        int hashCode22 = (hashCode21 + (l2 == null ? 0 : l2.hashCode())) * 31;
        InterfaceC104784ni interfaceC104784ni = this.A05;
        int hashCode23 = (hashCode22 + (interfaceC104784ni == null ? 0 : interfaceC104784ni.hashCode())) * 31;
        CallAdsInfoDict callAdsInfoDict = this.A07;
        int hashCode24 = (hashCode23 + (callAdsInfoDict == null ? 0 : callAdsInfoDict.hashCode())) * 31;
        String str8 = this.A1r;
        int hashCode25 = (hashCode24 + (str8 == null ? 0 : str8.hashCode())) * 31;
        List list2 = this.A2D;
        int hashCode26 = (hashCode25 + (list2 == null ? 0 : list2.hashCode())) * 31;
        C1s7 c1s7 = this.A0P;
        int hashCode27 = (hashCode26 + (c1s7 == null ? 0 : c1s7.hashCode())) * 31;
        String str9 = this.A1s;
        int hashCode28 = (hashCode27 + (str9 == null ? 0 : str9.hashCode())) * 31;
        List list3 = this.A2E;
        int hashCode29 = (hashCode28 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List list4 = this.A2F;
        int hashCode30 = (hashCode29 + (list4 == null ? 0 : list4.hashCode())) * 31;
        String str10 = this.A1t;
        int hashCode31 = (hashCode30 + (str10 == null ? 0 : str10.hashCode())) * 31;
        C114565Fc c114565Fc = this.A0B;
        int hashCode32 = (hashCode31 + (c114565Fc == null ? 0 : c114565Fc.hashCode())) * 31;
        C52r c52r = this.A0C;
        int hashCode33 = (hashCode32 + (c52r == null ? 0 : c52r.hashCode())) * 31;
        C114575Fd c114575Fd = this.A06;
        int hashCode34 = (hashCode33 + (c114575Fd == null ? 0 : c114575Fd.hashCode())) * 31;
        CTAStyle cTAStyle = this.A0n;
        int hashCode35 = (hashCode34 + (cTAStyle == null ? 0 : cTAStyle.hashCode())) * 31;
        InterfaceC87573vP interfaceC87573vP = this.A08;
        int hashCode36 = (hashCode35 + (interfaceC87573vP == null ? 0 : interfaceC87573vP.hashCode())) * 31;
        InterfaceC39301sB interfaceC39301sB = this.A09;
        int hashCode37 = (hashCode36 + (interfaceC39301sB == null ? 0 : interfaceC39301sB.hashCode())) * 31;
        IGCTMessagingAdsInfoDict iGCTMessagingAdsInfoDict = this.A0O;
        int hashCode38 = (hashCode37 + (iGCTMessagingAdsInfoDict == null ? 0 : iGCTMessagingAdsInfoDict.hashCode())) * 31;
        InterfaceC104824nn interfaceC104824nn = this.A0A;
        int hashCode39 = (hashCode38 + (interfaceC104824nn == null ? 0 : interfaceC104824nn.hashCode())) * 31;
        Boolean bool = this.A0y;
        int hashCode40 = (hashCode39 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str11 = this.A1u;
        int hashCode41 = (hashCode40 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Boolean bool2 = this.A0z;
        int hashCode42 = (hashCode41 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.A10;
        int hashCode43 = (hashCode42 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str12 = this.A1v;
        int hashCode44 = (hashCode43 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Integer num2 = this.A1b;
        int hashCode45 = (hashCode44 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List list5 = this.A2G;
        int hashCode46 = (hashCode45 + (list5 == null ? 0 : list5.hashCode())) * 31;
        DynamicProductAdDisplayOption dynamicProductAdDisplayOption = this.A0D;
        int hashCode47 = (hashCode46 + (dynamicProductAdDisplayOption == null ? 0 : dynamicProductAdDisplayOption.hashCode())) * 31;
        Boolean bool4 = this.A11;
        int hashCode48 = (hashCode47 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.A12;
        int hashCode49 = (hashCode48 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        String str13 = this.A1w;
        int hashCode50 = (hashCode49 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.A1x;
        int hashCode51 = (hashCode50 + (str14 == null ? 0 : str14.hashCode())) * 31;
        C114585Fe c114585Fe = this.A0E;
        int hashCode52 = (hashCode51 + (c114585Fe == null ? 0 : c114585Fe.hashCode())) * 31;
        AdFormatType adFormatType = this.A00;
        int hashCode53 = (hashCode52 + (adFormatType == null ? 0 : adFormatType.hashCode())) * 31;
        C114595Ff c114595Ff = this.A0G;
        int hashCode54 = (hashCode53 + (c114595Ff == null ? 0 : c114595Ff.hashCode())) * 31;
        Integer num3 = this.A1c;
        int hashCode55 = (hashCode54 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.A1d;
        int hashCode56 = (hashCode55 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str15 = this.A1y;
        int hashCode57 = (hashCode56 + (str15 == null ? 0 : str15.hashCode())) * 31;
        List list6 = this.A2H;
        int hashCode58 = (hashCode57 + (list6 == null ? 0 : list6.hashCode())) * 31;
        InterfaceC39391sK interfaceC39391sK = this.A0R;
        int hashCode59 = (hashCode58 + (interfaceC39391sK == null ? 0 : interfaceC39391sK.hashCode())) * 31;
        C39411sM c39411sM = this.A0S;
        int hashCode60 = (hashCode59 + (c39411sM == null ? 0 : c39411sM.hashCode())) * 31;
        String str16 = this.A1z;
        int hashCode61 = (hashCode60 + (str16 == null ? 0 : str16.hashCode())) * 31;
        InterfaceC104854ns interfaceC104854ns = this.A0I;
        int hashCode62 = (hashCode61 + (interfaceC104854ns == null ? 0 : interfaceC104854ns.hashCode())) * 31;
        InterfaceC104864nt interfaceC104864nt = this.A0J;
        int hashCode63 = (hashCode62 + (interfaceC104864nt == null ? 0 : interfaceC104864nt.hashCode())) * 31;
        AdsCTATrustInfo adsCTATrustInfo = this.A0u;
        int hashCode64 = (hashCode63 + (adsCTATrustInfo == null ? 0 : adsCTATrustInfo.hashCode())) * 31;
        AdsTextTrustInfo adsTextTrustInfo = this.A0x;
        int hashCode65 = (hashCode64 + (adsTextTrustInfo == null ? 0 : adsTextTrustInfo.hashCode())) * 31;
        IGAdsIABScreenshotDataDict iGAdsIABScreenshotDataDict = this.A0M;
        int hashCode66 = (hashCode65 + (iGAdsIABScreenshotDataDict == null ? 0 : iGAdsIABScreenshotDataDict.hashCode())) * 31;
        IGCTATextVariant iGCTATextVariant = this.A0N;
        int hashCode67 = (hashCode66 + (iGCTATextVariant == null ? 0 : iGCTATextVariant.hashCode())) * 31;
        String str17 = this.A20;
        int hashCode68 = (hashCode67 + (str17 == null ? 0 : str17.hashCode())) * 31;
        C100444f8 c100444f8 = this.A0L;
        int hashCode69 = (hashCode68 + (c100444f8 == null ? 0 : c100444f8.hashCode())) * 31;
        InterfaceC104874ny interfaceC104874ny = this.A0Q;
        int hashCode70 = (hashCode69 + (interfaceC104874ny == null ? 0 : interfaceC104874ny.hashCode())) * 31;
        InterfaceC104884nz interfaceC104884nz = this.A0U;
        int hashCode71 = (hashCode70 + (interfaceC104884nz == null ? 0 : interfaceC104884nz.hashCode())) * 31;
        C1117552c c1117552c = this.A0V;
        int hashCode72 = (hashCode71 + (c1117552c == null ? 0 : c1117552c.hashCode())) * 31;
        IGRFSurveyInfoDict iGRFSurveyInfoDict = this.A0W;
        int hashCode73 = (hashCode72 + (iGRFSurveyInfoDict == null ? 0 : iGRFSurveyInfoDict.hashCode())) * 31;
        InterfaceC104904o2 interfaceC104904o2 = this.A0Z;
        int hashCode74 = (hashCode73 + (interfaceC104904o2 == null ? 0 : interfaceC104904o2.hashCode())) * 31;
        C102724k9 c102724k9 = this.A0e;
        int hashCode75 = (hashCode74 + (c102724k9 == null ? 0 : c102724k9.hashCode())) * 31;
        Integer num5 = this.A1e;
        int hashCode76 = (hashCode75 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.A1f;
        int hashCode77 = (hashCode76 + (num6 == null ? 0 : num6.hashCode())) * 31;
        C38211qB c38211qB = this.A0r;
        int hashCode78 = (hashCode77 + (c38211qB == null ? 0 : c38211qB.hashCode())) * 31;
        Boolean bool6 = this.A1C;
        int hashCode79 = (hashCode78 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.A13;
        int hashCode80 = (hashCode79 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.A14;
        int hashCode81 = (hashCode80 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Boolean bool9 = this.A15;
        int hashCode82 = (hashCode81 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        Boolean bool10 = this.A16;
        int hashCode83 = (hashCode82 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        Boolean bool11 = this.A17;
        int hashCode84 = (hashCode83 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
        Boolean bool12 = this.A18;
        int hashCode85 = (hashCode84 + (bool12 == null ? 0 : bool12.hashCode())) * 31;
        Boolean bool13 = this.A19;
        int hashCode86 = (hashCode85 + (bool13 == null ? 0 : bool13.hashCode())) * 31;
        Boolean bool14 = this.A1A;
        int hashCode87 = (hashCode86 + (bool14 == null ? 0 : bool14.hashCode())) * 31;
        Boolean bool15 = this.A1B;
        int hashCode88 = (hashCode87 + (bool15 == null ? 0 : bool15.hashCode())) * 31;
        Boolean bool16 = this.A1D;
        int hashCode89 = (hashCode88 + (bool16 == null ? 0 : bool16.hashCode())) * 31;
        Boolean bool17 = this.A1E;
        int hashCode90 = (hashCode89 + (bool17 == null ? 0 : bool17.hashCode())) * 31;
        Boolean bool18 = this.A1F;
        int hashCode91 = (hashCode90 + (bool18 == null ? 0 : bool18.hashCode())) * 31;
        Boolean bool19 = this.A1G;
        int hashCode92 = (hashCode91 + (bool19 == null ? 0 : bool19.hashCode())) * 31;
        Boolean bool20 = this.A1H;
        int hashCode93 = (hashCode92 + (bool20 == null ? 0 : bool20.hashCode())) * 31;
        Boolean bool21 = this.A1I;
        int hashCode94 = (hashCode93 + (bool21 == null ? 0 : bool21.hashCode())) * 31;
        Boolean bool22 = this.A1J;
        int hashCode95 = (hashCode94 + (bool22 == null ? 0 : bool22.hashCode())) * 31;
        Boolean bool23 = this.A1K;
        int hashCode96 = (hashCode95 + (bool23 == null ? 0 : bool23.hashCode())) * 31;
        Boolean bool24 = this.A1L;
        int hashCode97 = (hashCode96 + (bool24 == null ? 0 : bool24.hashCode())) * 31;
        Boolean bool25 = this.A1M;
        int hashCode98 = (hashCode97 + (bool25 == null ? 0 : bool25.hashCode())) * 31;
        Boolean bool26 = this.A1N;
        int hashCode99 = (hashCode98 + (bool26 == null ? 0 : bool26.hashCode())) * 31;
        Boolean bool27 = this.A1O;
        int hashCode100 = (hashCode99 + (bool27 == null ? 0 : bool27.hashCode())) * 31;
        Boolean bool28 = this.A1P;
        int hashCode101 = (hashCode100 + (bool28 == null ? 0 : bool28.hashCode())) * 31;
        Boolean bool29 = this.A1Q;
        int hashCode102 = (hashCode101 + (bool29 == null ? 0 : bool29.hashCode())) * 31;
        Integer num7 = this.A1g;
        int hashCode103 = (hashCode102 + (num7 == null ? 0 : num7.hashCode())) * 31;
        List list7 = this.A2I;
        int hashCode104 = (hashCode103 + (list7 == null ? 0 : list7.hashCode())) * 31;
        String str18 = this.A21;
        int hashCode105 = (hashCode104 + (str18 == null ? 0 : str18.hashCode())) * 31;
        Boolean bool30 = this.A1R;
        int hashCode106 = (hashCode105 + (bool30 == null ? 0 : bool30.hashCode())) * 31;
        List list8 = this.A2J;
        int hashCode107 = (hashCode106 + (list8 == null ? 0 : list8.hashCode())) * 31;
        String str19 = this.A22;
        int hashCode108 = (hashCode107 + (str19 == null ? 0 : str19.hashCode())) * 31;
        Boolean bool31 = this.A1S;
        int hashCode109 = (hashCode108 + (bool31 == null ? 0 : bool31.hashCode())) * 31;
        String str20 = this.A23;
        int hashCode110 = (hashCode109 + (str20 == null ? 0 : str20.hashCode())) * 31;
        List list9 = this.A2K;
        int hashCode111 = (hashCode110 + (list9 == null ? 0 : list9.hashCode())) * 31;
        Boolean bool32 = this.A1T;
        int hashCode112 = (hashCode111 + (bool32 == null ? 0 : bool32.hashCode())) * 31;
        InterfaceC104914o3 interfaceC104914o3 = this.A0T;
        int hashCode113 = (hashCode112 + (interfaceC104914o3 == null ? 0 : interfaceC104914o3.hashCode())) * 31;
        String str21 = this.A24;
        int hashCode114 = (hashCode113 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.A25;
        int hashCode115 = (hashCode114 + (str22 == null ? 0 : str22.hashCode())) * 31;
        C102724k9 c102724k92 = this.A0f;
        int hashCode116 = (hashCode115 + (c102724k92 == null ? 0 : c102724k92.hashCode())) * 31;
        String str23 = this.A26;
        int hashCode117 = (hashCode116 + (str23 == null ? 0 : str23.hashCode())) * 31;
        C114605Fi c114605Fi = this.A0a;
        int hashCode118 = (hashCode117 + (c114605Fi == null ? 0 : c114605Fi.hashCode())) * 31;
        C114615Fj c114615Fj = this.A0h;
        int hashCode119 = (hashCode118 + (c114615Fj == null ? 0 : c114615Fj.hashCode())) * 31;
        C51L c51l = this.A0b;
        int hashCode120 = (hashCode119 + (c51l == null ? 0 : c51l.hashCode())) * 31;
        String str24 = this.A27;
        int hashCode121 = (hashCode120 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.A28;
        int hashCode122 = (hashCode121 + (str25 == null ? 0 : str25.hashCode())) * 31;
        List list10 = this.A2L;
        int hashCode123 = (hashCode122 + (list10 == null ? 0 : list10.hashCode())) * 31;
        String str26 = this.A29;
        int hashCode124 = (hashCode123 + (str26 == null ? 0 : str26.hashCode())) * 31;
        String str27 = this.A2A;
        int hashCode125 = (hashCode124 + (str27 == null ? 0 : str27.hashCode())) * 31;
        InterfaceC104944o7 interfaceC104944o7 = this.A0c;
        int hashCode126 = (hashCode125 + (interfaceC104944o7 == null ? 0 : interfaceC104944o7.hashCode())) * 31;
        List list11 = this.A2M;
        int hashCode127 = (hashCode126 + (list11 == null ? 0 : list11.hashCode())) * 31;
        List list12 = this.A2N;
        int hashCode128 = (hashCode127 + (list12 == null ? 0 : list12.hashCode())) * 31;
        IGAdProfileProductTabDict iGAdProfileProductTabDict = this.A0K;
        int hashCode129 = (hashCode128 + (iGAdProfileProductTabDict == null ? 0 : iGAdProfileProductTabDict.hashCode())) * 31;
        C47W c47w = this.A0d;
        int hashCode130 = (hashCode129 + (c47w == null ? 0 : c47w.hashCode())) * 31;
        C5Fk c5Fk = this.A0s;
        int hashCode131 = (hashCode130 + (c5Fk == null ? 0 : c5Fk.hashCode())) * 31;
        C5Fl c5Fl = this.A0t;
        int hashCode132 = (hashCode131 + (c5Fl == null ? 0 : c5Fl.hashCode())) * 31;
        InterfaceC104964oB interfaceC104964oB = this.A0Y;
        int hashCode133 = (hashCode132 + (interfaceC104964oB == null ? 0 : interfaceC104964oB.hashCode())) * 31;
        Boolean bool33 = this.A1U;
        int hashCode134 = (hashCode133 + (bool33 == null ? 0 : bool33.hashCode())) * 31;
        Boolean bool34 = this.A1V;
        int hashCode135 = (hashCode134 + (bool34 == null ? 0 : bool34.hashCode())) * 31;
        Boolean bool35 = this.A1W;
        int hashCode136 = (hashCode135 + (bool35 == null ? 0 : bool35.hashCode())) * 31;
        Boolean bool36 = this.A1X;
        int hashCode137 = (hashCode136 + (bool36 == null ? 0 : bool36.hashCode())) * 31;
        Boolean bool37 = this.A1Y;
        int hashCode138 = (hashCode137 + (bool37 == null ? 0 : bool37.hashCode())) * 31;
        Boolean bool38 = this.A1Z;
        int hashCode139 = (hashCode138 + (bool38 == null ? 0 : bool38.hashCode())) * 31;
        C106594rE c106594rE = this.A0g;
        int hashCode140 = (hashCode139 + (c106594rE == null ? 0 : c106594rE.hashCode())) * 31;
        InterfaceC104984oD interfaceC104984oD = this.A0i;
        int hashCode141 = (hashCode140 + (interfaceC104984oD == null ? 0 : interfaceC104984oD.hashCode())) * 31;
        IGAdCreativeStory9x16CaptionData iGAdCreativeStory9x16CaptionData = this.A0H;
        int hashCode142 = (hashCode141 + (iGAdCreativeStory9x16CaptionData == null ? 0 : iGAdCreativeStory9x16CaptionData.hashCode())) * 31;
        C38891rO c38891rO = this.A0m;
        int hashCode143 = (hashCode142 + (c38891rO == null ? 0 : c38891rO.hashCode())) * 31;
        TestimonialDict testimonialDict = this.A0j;
        int hashCode144 = (hashCode143 + (testimonialDict == null ? 0 : testimonialDict.hashCode())) * 31;
        InterfaceC104994oF interfaceC104994oF = this.A0X;
        int hashCode145 = (hashCode144 + (interfaceC104994oF == null ? 0 : interfaceC104994oF.hashCode())) * 31;
        String str28 = this.A2B;
        int hashCode146 = (hashCode145 + (str28 == null ? 0 : str28.hashCode())) * 31;
        C114625Fm c114625Fm = this.A0k;
        int hashCode147 = (hashCode146 + (c114625Fm == null ? 0 : c114625Fm.hashCode())) * 31;
        Integer num8 = this.A1h;
        int hashCode148 = (hashCode147 + (num8 == null ? 0 : num8.hashCode())) * 31;
        List list13 = this.A2O;
        return hashCode148 + (list13 != null ? list13.hashCode() : 0);
    }

    @Override // X.InterfaceC39541sb
    public final /* bridge */ /* synthetic */ C87853vt AKj() {
        return new C87853vt(this);
    }

    @Override // X.InterfaceC39541sb
    public final String AXn() {
        return this.A1k;
    }

    @Override // X.InterfaceC39541sb
    public final String AYx() {
        return this.A1l;
    }

    @Override // X.InterfaceC39541sb
    public final String AZ3() {
        return this.A1m;
    }

    @Override // X.InterfaceC39541sb
    public final /* bridge */ /* synthetic */ InterfaceC104764ng AZB() {
        return this.A0q;
    }

    @Override // X.InterfaceC39541sb
    public final Long AZC() {
        return this.A1i;
    }

    @Override // X.InterfaceC39541sb
    public final String AZE() {
        return this.A1n;
    }

    @Override // X.InterfaceC39541sb
    public final Integer AZL() {
        return this.A1a;
    }

    @Override // X.InterfaceC39541sb
    public final /* bridge */ /* synthetic */ InterfaceC37891pS AZO() {
        return this.A0o;
    }

    @Override // X.InterfaceC39541sb
    public final /* bridge */ /* synthetic */ InterfaceC87713vf AZQ() {
        return this.A0F;
    }

    @Override // X.InterfaceC39541sb
    public final String AZR() {
        return this.A1o;
    }

    @Override // X.InterfaceC39541sb
    public final /* bridge */ /* synthetic */ InterfaceC37891pS Aa3() {
        return this.A0p;
    }

    @Override // X.InterfaceC39541sb
    public final /* bridge */ /* synthetic */ AdsIAWRatingInfoIntf Aa6() {
        return this.A0v;
    }

    @Override // X.InterfaceC39541sb
    public final /* bridge */ /* synthetic */ AdsRatingInfoIntf AaD() {
        return this.A0w;
    }

    @Override // X.InterfaceC39541sb
    public final /* bridge */ /* synthetic */ InterfaceC104774nh AaF() {
        return this.A01;
    }

    @Override // X.InterfaceC39541sb
    public final String AaI() {
        return this.A1p;
    }

    @Override // X.InterfaceC39541sb
    public final /* bridge */ /* synthetic */ InterfaceC39271s5 AaR() {
        return this.A02;
    }

    @Override // X.InterfaceC39541sb
    public final String AcH() {
        return this.A1q;
    }

    @Override // X.InterfaceC39541sb
    public final AppstoreMetadataDict AcT() {
        return this.A03;
    }

    @Override // X.InterfaceC39541sb
    public final BrandedContentAdsPaidPartnershipLabelRemovalOption Afo() {
        return this.A04;
    }

    @Override // X.InterfaceC39541sb
    public final C914346k AgT() {
        return this.A0l;
    }

    @Override // X.InterfaceC39541sb
    public final List AiV() {
        return this.A2C;
    }

    @Override // X.InterfaceC39541sb
    public final Long AiY() {
        return this.A1j;
    }

    @Override // X.InterfaceC39541sb
    public final InterfaceC104784ni AjP() {
        return this.A05;
    }

    @Override // X.InterfaceC39541sb
    public final CallAdsInfoDict Ajk() {
        return this.A07;
    }

    @Override // X.InterfaceC39541sb
    public final String AkD() {
        return this.A1r;
    }

    @Override // X.InterfaceC39541sb
    public final List Ame() {
        return this.A2D;
    }

    @Override // X.InterfaceC39541sb
    public final /* bridge */ /* synthetic */ InterfaceC39281s8 Ann() {
        return this.A0P;
    }

    @Override // X.InterfaceC39541sb
    public final String ArY() {
        return this.A1s;
    }

    @Override // X.InterfaceC39541sb
    public final List Ark() {
        return this.A2F;
    }

    @Override // X.InterfaceC39541sb
    public final String Asj() {
        return this.A1t;
    }

    @Override // X.InterfaceC39541sb
    public final /* bridge */ /* synthetic */ InterfaceC104794nk Asn() {
        return this.A0B;
    }

    @Override // X.InterfaceC39541sb
    public final /* bridge */ /* synthetic */ InterfaceC104804nl Asp() {
        return this.A0C;
    }

    @Override // X.InterfaceC39541sb
    public final /* bridge */ /* synthetic */ InterfaceC104814nm Atg() {
        return this.A06;
    }

    @Override // X.InterfaceC39541sb
    public final CTAStyle Atm() {
        return this.A0n;
    }

    @Override // X.InterfaceC39541sb
    public final InterfaceC87573vP Atv() {
        return this.A08;
    }

    @Override // X.InterfaceC39541sb
    public final InterfaceC39301sB Aty() {
        return this.A09;
    }

    @Override // X.InterfaceC39541sb
    public final /* bridge */ /* synthetic */ IGCTMessagingAdsInfoDictIntf Au0() {
        return this.A0O;
    }

    @Override // X.InterfaceC39541sb
    public final InterfaceC104824nn Au1() {
        return this.A0A;
    }

    @Override // X.InterfaceC39541sb
    public final Boolean Axd() {
        return this.A0y;
    }

    @Override // X.InterfaceC39541sb
    public final String AyU() {
        return this.A1u;
    }

    @Override // X.InterfaceC39541sb
    public final Boolean AyV() {
        return this.A0z;
    }

    @Override // X.InterfaceC39541sb
    public final Boolean Ayi() {
        return this.A10;
    }

    @Override // X.InterfaceC39541sb
    public final Integer AzC() {
        return this.A1b;
    }

    @Override // X.InterfaceC39541sb
    public final List Azx() {
        return this.A2G;
    }

    @Override // X.InterfaceC39541sb
    public final DynamicProductAdDisplayOption B02() {
        return this.A0D;
    }

    @Override // X.InterfaceC39541sb
    public final Boolean B1Q() {
        return this.A11;
    }

    @Override // X.InterfaceC39541sb
    public final Boolean B1h() {
        return this.A12;
    }

    @Override // X.InterfaceC39541sb
    public final String B4X() {
        return this.A1w;
    }

    @Override // X.InterfaceC39541sb
    public final String B4v() {
        return this.A1x;
    }

    @Override // X.InterfaceC39541sb
    public final /* bridge */ /* synthetic */ InterfaceC104834np B5i() {
        return this.A0E;
    }

    @Override // X.InterfaceC39541sb
    public final AdFormatType B82() {
        return this.A00;
    }

    @Override // X.InterfaceC39541sb
    public final /* bridge */ /* synthetic */ InterfaceC104844nr B9f() {
        return this.A0G;
    }

    @Override // X.InterfaceC39541sb
    public final Integer BA3() {
        return this.A1c;
    }

    @Override // X.InterfaceC39541sb
    public final Integer BDh() {
        return this.A1d;
    }

    @Override // X.InterfaceC39541sb
    public final String BDj() {
        return this.A1y;
    }

    @Override // X.InterfaceC39541sb
    public final List BDm() {
        return this.A2H;
    }

    @Override // X.InterfaceC39541sb
    public final InterfaceC39391sK BEV() {
        return this.A0R;
    }

    @Override // X.InterfaceC39541sb
    public final /* bridge */ /* synthetic */ InterfaceC39421sN BEa() {
        return this.A0S;
    }

    @Override // X.InterfaceC39541sb
    public final String BEc() {
        return this.A1z;
    }

    @Override // X.InterfaceC39541sb
    public final InterfaceC104854ns BFH() {
        return this.A0I;
    }

    @Override // X.InterfaceC39541sb
    public final InterfaceC104864nt BFI() {
        return this.A0J;
    }

    @Override // X.InterfaceC39541sb
    public final /* bridge */ /* synthetic */ AdsCTATrustInfoIntf BFJ() {
        return this.A0u;
    }

    @Override // X.InterfaceC39541sb
    public final /* bridge */ /* synthetic */ AdsTextTrustInfoIntf BFK() {
        return this.A0x;
    }

    @Override // X.InterfaceC39541sb
    public final IGAdsIABScreenshotDataDict BFN() {
        return this.A0M;
    }

    @Override // X.InterfaceC39541sb
    public final IGCTATextVariant BFZ() {
        return this.A0N;
    }

    @Override // X.InterfaceC39541sb
    public final String BFc() {
        return this.A20;
    }

    @Override // X.InterfaceC39541sb
    public final /* bridge */ /* synthetic */ InterfaceC88193wT BFe() {
        return this.A0L;
    }

    @Override // X.InterfaceC39541sb
    public final InterfaceC104874ny BFf() {
        return this.A0Q;
    }

    @Override // X.InterfaceC39541sb
    public final InterfaceC104884nz BG5() {
        return this.A0U;
    }

    @Override // X.InterfaceC39541sb
    public final /* bridge */ /* synthetic */ InterfaceC104894o0 BG6() {
        return this.A0V;
    }

    @Override // X.InterfaceC39541sb
    public final IGRFSurveyInfoDict BGD() {
        return this.A0W;
    }

    @Override // X.InterfaceC39541sb
    public final InterfaceC104904o2 BGF() {
        return this.A0Z;
    }

    @Override // X.InterfaceC39541sb
    public final /* bridge */ /* synthetic */ C46j BGM() {
        return this.A0e;
    }

    @Override // X.InterfaceC39541sb
    public final Integer BH5() {
        return this.A1e;
    }

    @Override // X.InterfaceC39541sb
    public final Integer BHB() {
        return this.A1f;
    }

    @Override // X.InterfaceC39541sb
    public final /* bridge */ /* synthetic */ InterfaceC38221qC BJK() {
        return this.A0r;
    }

    @Override // X.InterfaceC39541sb
    public final Integer BKC() {
        return this.A1g;
    }

    @Override // X.InterfaceC39541sb
    public final String BKx() {
        return this.A21;
    }

    @Override // X.InterfaceC39541sb
    public final Boolean BMh() {
        return this.A1R;
    }

    @Override // X.InterfaceC39541sb
    public final List BMi() {
        return this.A2J;
    }

    @Override // X.InterfaceC39541sb
    public final String BMj() {
        return this.A22;
    }

    @Override // X.InterfaceC39541sb
    public final Boolean BMl() {
        return this.A1S;
    }

    @Override // X.InterfaceC39541sb
    public final String BMm() {
        return this.A23;
    }

    @Override // X.InterfaceC39541sb
    public final List BMo() {
        return this.A2K;
    }

    @Override // X.InterfaceC39541sb
    public final Boolean BMp() {
        return this.A1T;
    }

    @Override // X.InterfaceC39541sb
    public final InterfaceC104914o3 BMq() {
        return this.A0T;
    }

    @Override // X.InterfaceC39541sb
    public final String BNP() {
        return this.A24;
    }

    @Override // X.InterfaceC39541sb
    public final String BNT() {
        return this.A25;
    }

    @Override // X.InterfaceC39541sb
    public final /* bridge */ /* synthetic */ C46j BQT() {
        return this.A0f;
    }

    @Override // X.InterfaceC39541sb
    public final /* bridge */ /* synthetic */ C4o4 BSs() {
        return this.A0a;
    }

    @Override // X.InterfaceC39541sb
    public final /* bridge */ /* synthetic */ InterfaceC104924o5 BVd() {
        return this.A0h;
    }

    @Override // X.InterfaceC39541sb
    public final /* bridge */ /* synthetic */ InterfaceC104934o6 BYm() {
        return this.A0b;
    }

    @Override // X.InterfaceC39541sb
    public final String BZH() {
        return this.A27;
    }

    @Override // X.InterfaceC39541sb
    public final String Baa() {
        return this.A28;
    }

    @Override // X.InterfaceC39541sb
    public final List Baq() {
        return this.A2L;
    }

    @Override // X.InterfaceC39541sb
    public final String Baz() {
        return this.A29;
    }

    @Override // X.InterfaceC39541sb
    public final String Bck() {
        return this.A2A;
    }

    @Override // X.InterfaceC39541sb
    public final InterfaceC104944o7 BeI() {
        return this.A0c;
    }

    @Override // X.InterfaceC39541sb
    public final List Bf8() {
        return this.A2M;
    }

    @Override // X.InterfaceC39541sb
    public final List Bf9() {
        return this.A2N;
    }

    @Override // X.InterfaceC39541sb
    public final IGAdProfileProductTabDict Bi3() {
        return this.A0K;
    }

    @Override // X.InterfaceC39541sb
    public final C47W BiD() {
        return this.A0d;
    }

    @Override // X.InterfaceC39541sb
    public final /* bridge */ /* synthetic */ C4o9 Bm0() {
        return this.A0s;
    }

    @Override // X.InterfaceC39541sb
    public final /* bridge */ /* synthetic */ InterfaceC104954oA Bm1() {
        return this.A0t;
    }

    @Override // X.InterfaceC39541sb
    public final InterfaceC104964oB But() {
        return this.A0Y;
    }

    @Override // X.InterfaceC39541sb
    public final Boolean Bv2() {
        return this.A1U;
    }

    @Override // X.InterfaceC39541sb
    public final Boolean BvW() {
        return this.A1V;
    }

    @Override // X.InterfaceC39541sb
    public final Boolean Bvg() {
        return this.A1W;
    }

    @Override // X.InterfaceC39541sb
    public final Boolean Bvw() {
        return this.A1X;
    }

    @Override // X.InterfaceC39541sb
    public final Boolean BwT() {
        return this.A1Y;
    }

    @Override // X.InterfaceC39541sb
    public final Boolean Bwg() {
        return this.A1Z;
    }

    @Override // X.InterfaceC39541sb
    public final /* bridge */ /* synthetic */ InterfaceC104974oC BzH() {
        return this.A0g;
    }

    @Override // X.InterfaceC39541sb
    public final InterfaceC104984oD C1Q() {
        return this.A0i;
    }

    @Override // X.InterfaceC39541sb
    public final IGAdCreativeStory9x16CaptionData C4k() {
        return this.A0H;
    }

    @Override // X.InterfaceC39541sb
    public final /* bridge */ /* synthetic */ InterfaceC38901rP C5p() {
        return this.A0m;
    }

    @Override // X.InterfaceC39541sb
    public final TestimonialDict C5q() {
        return this.A0j;
    }

    @Override // X.InterfaceC39541sb
    public final InterfaceC104994oF C6P() {
        return this.A0X;
    }

    @Override // X.InterfaceC39541sb
    public final String CAR() {
        return this.A2B;
    }

    @Override // X.InterfaceC39541sb
    public final /* bridge */ /* synthetic */ InterfaceC105004oG CDT() {
        return this.A0k;
    }

    @Override // X.InterfaceC39541sb
    public final Integer CEO() {
        return this.A1h;
    }

    @Override // X.InterfaceC39541sb
    public final List CFu() {
        return this.A2O;
    }

    @Override // X.InterfaceC39541sb
    public final Boolean CPy() {
        return this.A13;
    }

    @Override // X.InterfaceC39541sb
    public final Boolean CQK() {
        return this.A14;
    }

    @Override // X.InterfaceC39541sb
    public final Boolean CQW() {
        return this.A15;
    }

    @Override // X.InterfaceC39541sb
    public final Boolean CQk() {
        return this.A16;
    }

    @Override // X.InterfaceC39541sb
    public final Boolean CRf() {
        return this.A17;
    }

    @Override // X.InterfaceC39541sb
    public final Boolean CRg() {
        return this.A18;
    }

    @Override // X.InterfaceC39541sb
    public final Boolean CRm() {
        return this.A19;
    }

    @Override // X.InterfaceC39541sb
    public final Boolean CSS() {
        return this.A1A;
    }

    @Override // X.InterfaceC39541sb
    public final Boolean CSW() {
        return this.A1B;
    }

    @Override // X.InterfaceC39541sb
    public final Boolean CU8() {
        return this.A1C;
    }

    @Override // X.InterfaceC39541sb
    public final Boolean CUh() {
        return this.A1D;
    }

    @Override // X.InterfaceC39541sb
    public final Boolean CV6() {
        return this.A1E;
    }

    @Override // X.InterfaceC39541sb
    public final Boolean CVu() {
        return this.A1F;
    }

    @Override // X.InterfaceC39541sb
    public final Boolean CW5() {
        return this.A1G;
    }

    @Override // X.InterfaceC39541sb
    public final Boolean CXL() {
        return this.A1H;
    }

    @Override // X.InterfaceC39541sb
    public final Boolean CXw() {
        return this.A1I;
    }

    @Override // X.InterfaceC39541sb
    public final Boolean CYx() {
        return this.A1J;
    }

    @Override // X.InterfaceC39541sb
    public final Boolean CaD() {
        return this.A1K;
    }

    @Override // X.InterfaceC39541sb
    public final Boolean CaE() {
        return this.A1L;
    }

    @Override // X.InterfaceC39541sb
    public final Boolean Caf() {
        return this.A1M;
    }

    @Override // X.InterfaceC39541sb
    public final Boolean Caw() {
        return this.A1N;
    }

    @Override // X.InterfaceC39541sb
    public final Boolean Cc8() {
        return this.A1O;
    }

    @Override // X.InterfaceC39541sb
    public final Boolean Ccp() {
        return this.A1P;
    }

    @Override // X.InterfaceC39541sb
    public final Boolean CdF() {
        return this.A1Q;
    }

    @Override // X.InterfaceC39541sb
    public final InterfaceC39541sb EBX(C1DY c1dy) {
        return this;
    }

    @Override // X.InterfaceC39541sb
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTAdInsertionItemClientDict", AbstractC37394Gda.A00(this));
    }

    @Override // X.InterfaceC39541sb
    public final List getCookies() {
        return this.A2E;
    }

    @Override // X.InterfaceC39541sb
    public final String getDominantColor() {
        return this.A1v;
    }

    @Override // X.InterfaceC39541sb
    public final List getItems() {
        return this.A2I;
    }

    @Override // X.InterfaceC39541sb
    public final String getMediaId() {
        return this.A26;
    }

    public C39531sa(AdFormatType adFormatType, C114555Fb c114555Fb, C1s4 c1s4, AppstoreMetadataDict appstoreMetadataDict, BrandedContentAdsPaidPartnershipLabelRemovalOption brandedContentAdsPaidPartnershipLabelRemovalOption, InterfaceC104784ni interfaceC104784ni, C114575Fd c114575Fd, CallAdsInfoDict callAdsInfoDict, InterfaceC87573vP interfaceC87573vP, InterfaceC39301sB interfaceC39301sB, InterfaceC104824nn interfaceC104824nn, C114565Fc c114565Fc, C52r c52r, DynamicProductAdDisplayOption dynamicProductAdDisplayOption, C114585Fe c114585Fe, C87703ve c87703ve, C114595Ff c114595Ff, IGAdCreativeStory9x16CaptionData iGAdCreativeStory9x16CaptionData, InterfaceC104854ns interfaceC104854ns, InterfaceC104864nt interfaceC104864nt, IGAdProfileProductTabDict iGAdProfileProductTabDict, C100444f8 c100444f8, IGAdsIABScreenshotDataDict iGAdsIABScreenshotDataDict, IGCTATextVariant iGCTATextVariant, IGCTMessagingAdsInfoDict iGCTMessagingAdsInfoDict, C1s7 c1s7, InterfaceC104874ny interfaceC104874ny, InterfaceC39391sK interfaceC39391sK, C39411sM c39411sM, InterfaceC104914o3 interfaceC104914o3, InterfaceC104884nz interfaceC104884nz, C1117552c c1117552c, IGRFSurveyInfoDict iGRFSurveyInfoDict, InterfaceC104994oF interfaceC104994oF, InterfaceC104964oB interfaceC104964oB, InterfaceC104904o2 interfaceC104904o2, C114605Fi c114605Fi, C51L c51l, InterfaceC104944o7 interfaceC104944o7, C47W c47w, C102724k9 c102724k9, C102724k9 c102724k92, C106594rE c106594rE, C114615Fj c114615Fj, InterfaceC104984oD interfaceC104984oD, TestimonialDict testimonialDict, C114625Fm c114625Fm, C914346k c914346k, C38891rO c38891rO, CTAStyle cTAStyle, C37881pR c37881pR, C37881pR c37881pR2, C5Fa c5Fa, C38211qB c38211qB, C5Fk c5Fk, C5Fl c5Fl, AdsCTATrustInfo adsCTATrustInfo, AdsIAWRatingInfo adsIAWRatingInfo, AdsRatingInfo adsRatingInfo, AdsTextTrustInfo adsTextTrustInfo, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, Boolean bool17, Boolean bool18, Boolean bool19, Boolean bool20, Boolean bool21, Boolean bool22, Boolean bool23, Boolean bool24, Boolean bool25, Boolean bool26, Boolean bool27, Boolean bool28, Boolean bool29, Boolean bool30, Boolean bool31, Boolean bool32, Boolean bool33, Boolean bool34, Boolean bool35, Boolean bool36, Boolean bool37, Boolean bool38, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Long l, Long l2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, List list11, List list12, List list13) {
        this.A1k = str;
        this.A1l = str2;
        this.A1m = str3;
        this.A0q = c5Fa;
        this.A1i = l;
        this.A1n = str4;
        this.A1a = num;
        this.A0o = c37881pR;
        this.A0F = c87703ve;
        this.A1o = str5;
        this.A0p = c37881pR2;
        this.A0v = adsIAWRatingInfo;
        this.A0w = adsRatingInfo;
        this.A01 = c114555Fb;
        this.A1p = str6;
        this.A02 = c1s4;
        this.A1q = str7;
        this.A03 = appstoreMetadataDict;
        this.A04 = brandedContentAdsPaidPartnershipLabelRemovalOption;
        this.A0l = c914346k;
        this.A2C = list;
        this.A1j = l2;
        this.A05 = interfaceC104784ni;
        this.A07 = callAdsInfoDict;
        this.A1r = str8;
        this.A2D = list2;
        this.A0P = c1s7;
        this.A1s = str9;
        this.A2E = list3;
        this.A2F = list4;
        this.A1t = str10;
        this.A0B = c114565Fc;
        this.A0C = c52r;
        this.A06 = c114575Fd;
        this.A0n = cTAStyle;
        this.A08 = interfaceC87573vP;
        this.A09 = interfaceC39301sB;
        this.A0O = iGCTMessagingAdsInfoDict;
        this.A0A = interfaceC104824nn;
        this.A0y = bool;
        this.A1u = str11;
        this.A0z = bool2;
        this.A10 = bool3;
        this.A1v = str12;
        this.A1b = num2;
        this.A2G = list5;
        this.A0D = dynamicProductAdDisplayOption;
        this.A11 = bool4;
        this.A12 = bool5;
        this.A1w = str13;
        this.A1x = str14;
        this.A0E = c114585Fe;
        this.A00 = adFormatType;
        this.A0G = c114595Ff;
        this.A1c = num3;
        this.A1d = num4;
        this.A1y = str15;
        this.A2H = list6;
        this.A0R = interfaceC39391sK;
        this.A0S = c39411sM;
        this.A1z = str16;
        this.A0I = interfaceC104854ns;
        this.A0J = interfaceC104864nt;
        this.A0u = adsCTATrustInfo;
        this.A0x = adsTextTrustInfo;
        this.A0M = iGAdsIABScreenshotDataDict;
        this.A0N = iGCTATextVariant;
        this.A20 = str17;
        this.A0L = c100444f8;
        this.A0Q = interfaceC104874ny;
        this.A0U = interfaceC104884nz;
        this.A0V = c1117552c;
        this.A0W = iGRFSurveyInfoDict;
        this.A0Z = interfaceC104904o2;
        this.A0e = c102724k9;
        this.A1e = num5;
        this.A1f = num6;
        this.A0r = c38211qB;
        this.A1C = bool6;
        this.A13 = bool7;
        this.A14 = bool8;
        this.A15 = bool9;
        this.A16 = bool10;
        this.A17 = bool11;
        this.A18 = bool12;
        this.A19 = bool13;
        this.A1A = bool14;
        this.A1B = bool15;
        this.A1D = bool16;
        this.A1E = bool17;
        this.A1F = bool18;
        this.A1G = bool19;
        this.A1H = bool20;
        this.A1I = bool21;
        this.A1J = bool22;
        this.A1K = bool23;
        this.A1L = bool24;
        this.A1M = bool25;
        this.A1N = bool26;
        this.A1O = bool27;
        this.A1P = bool28;
        this.A1Q = bool29;
        this.A1g = num7;
        this.A2I = list7;
        this.A21 = str18;
        this.A1R = bool30;
        this.A2J = list8;
        this.A22 = str19;
        this.A1S = bool31;
        this.A23 = str20;
        this.A2K = list9;
        this.A1T = bool32;
        this.A0T = interfaceC104914o3;
        this.A24 = str21;
        this.A25 = str22;
        this.A0f = c102724k92;
        this.A26 = str23;
        this.A0a = c114605Fi;
        this.A0h = c114615Fj;
        this.A0b = c51l;
        this.A27 = str24;
        this.A28 = str25;
        this.A2L = list10;
        this.A29 = str26;
        this.A2A = str27;
        this.A0c = interfaceC104944o7;
        this.A2M = list11;
        this.A2N = list12;
        this.A0K = iGAdProfileProductTabDict;
        this.A0d = c47w;
        this.A0s = c5Fk;
        this.A0t = c5Fl;
        this.A0Y = interfaceC104964oB;
        this.A1U = bool33;
        this.A1V = bool34;
        this.A1W = bool35;
        this.A1X = bool36;
        this.A1Y = bool37;
        this.A1Z = bool38;
        this.A0g = c106594rE;
        this.A0i = interfaceC104984oD;
        this.A0H = iGAdCreativeStory9x16CaptionData;
        this.A0m = c38891rO;
        this.A0j = testimonialDict;
        this.A0X = interfaceC104994oF;
        this.A2B = str28;
        this.A0k = c114625Fm;
        this.A1h = num8;
        this.A2O = list13;
    }
}
