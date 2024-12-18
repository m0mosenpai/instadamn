package X;

import com.instagram.api.schemas.AdFormatType;
import com.instagram.api.schemas.IGAdsFeedVideoWBViewerTypeEnum;
import com.instagram.api.schemas.IGFormatLiquidityUseCaseEnum;
import com.instagram.api.schemas.IntentAwareAdsInfoIntf;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: X.5dq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C120985dq extends C0T6 implements InterfaceC41201vU, InterfaceC120995dr {
    public static final C128085qc A0d = new Object();
    public int A00;
    public EnumC129395t1 A01;
    public C38321qM A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Long A06;
    public String A07;
    public List A08;
    public boolean A09;
    public boolean A0A;
    public C75363a3 A0B;
    public final int A0C;
    public final long A0D;
    public final AdFormatType A0E;
    public final InterfaceC87893vx A0F;
    public final InterfaceC120995dr A0G;
    public final C5HS A0H;
    public final EnumC76383bi A0I;
    public final EnumC40111tc A0J;
    public final User A0K;
    public final String A0L;
    public final String A0M;
    public final String A0N;
    public final String A0O;
    public final String A0P;
    public final String A0Q;
    public final List A0R;
    public final List A0S;
    public final List A0T;
    public final boolean A0U;
    public final boolean A0V;
    public final boolean A0W;
    public final boolean A0X;
    public final boolean A0Y;
    public final boolean A0Z;
    public final boolean A0a;
    public final boolean A0b;
    public final String A0c;

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0080, code lost:
    
        if (r41.CBb() != X.EnumC129395t1.A0G) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0098, code lost:
    
        if (r41.CBb() != X.EnumC129395t1.A0G) goto L32;
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C120985dq(X.InterfaceC120995dr r41) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C120985dq.<init>(X.5dr):void");
    }

    public final User A09(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        C38321qM c38321qM = this.A02;
        if (c38321qM != null) {
            return c38321qM.A2E(userSession);
        }
        return null;
    }

    public final C75363a3 A0A(UserSession userSession, Integer num) {
        IGFormatLiquidityUseCaseEnum iGFormatLiquidityUseCaseEnum;
        InterfaceC104874ny BFf;
        List list;
        C38321qM c38321qM;
        C14360o3.A0B(userSession, 0);
        C38321qM c38321qM2 = this.A02;
        C75363a3 c75363a3 = null;
        if (num != null && (list = this.A0R) != null && (c38321qM = (C38321qM) list.get(num.intValue())) != null) {
            c38321qM2 = c38321qM;
        }
        if (c38321qM2 != null && c38321qM2.A5Q()) {
            InterfaceC39541sb injected = c38321qM2.A0C.getInjected();
            if (injected != null && (BFf = injected.BFf()) != null) {
                iGFormatLiquidityUseCaseEnum = BFf.B80();
            } else {
                iGFormatLiquidityUseCaseEnum = null;
            }
            if (iGFormatLiquidityUseCaseEnum == IGFormatLiquidityUseCaseEnum.A07) {
                c38321qM2 = c38321qM2.A1d();
            }
        }
        if (C18U.A06(C06090Tz.A05, userSession, 36321932831893401L)) {
            C75363a3 c75363a32 = this.A0B;
            if (c75363a32 == null) {
                if (c38321qM2 != null) {
                    c75363a32 = c38321qM2.CFR();
                }
                this.A0B = c75363a3;
            }
            c75363a3 = c75363a32;
            this.A0B = c75363a3;
        } else if (c38321qM2 != null) {
            return c38321qM2.CFR();
        }
        return c75363a3;
    }

    public final void A0E(Integer num) {
        EnumC73363Qm enumC73363Qm;
        C14360o3.A0B(num, 0);
        this.A03 = num;
        switch (num.intValue()) {
            case 0:
            case 3:
                enumC73363Qm = EnumC73363Qm.A05;
                break;
            case 1:
                enumC73363Qm = EnumC73363Qm.A04;
                break;
            case 2:
            case 4:
                enumC73363Qm = EnumC73363Qm.A03;
                break;
            case 5:
                return;
            default:
                throw new RuntimeException();
        }
        C38321qM c38321qM = this.A02;
        if (c38321qM != null) {
            c38321qM.A0e.clear();
            c38321qM.A4G(enumC73363Qm);
        }
    }

    @Override // X.InterfaceC120995dr
    public final String Ayl(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return this.A0G.Ayl(userSession);
    }

    @Override // X.C1NI
    public final String BzL(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return this.A0G.BzL(userSession);
    }

    @Override // X.InterfaceC120995dr
    public final /* synthetic */ boolean CKk() {
        return AbstractC128095qd.A02(this);
    }

    public final C38663Gz4 A01() {
        InterfaceC120995dr interfaceC120995dr = this.A0G;
        C14360o3.A0C(interfaceC120995dr, "null cannot be cast to non-null type com.instagram.clips.model.MidcardClipsImpressionItem");
        return ((C38226GrV) interfaceC120995dr).A00;
    }

    public final C38661Gz2 A02() {
        C38225GrU c38225GrU;
        InterfaceC120995dr interfaceC120995dr = this.A0G;
        if (!(interfaceC120995dr instanceof C38225GrU) || (c38225GrU = (C38225GrU) interfaceC120995dr) == null) {
            return null;
        }
        return c38225GrU.A00;
    }

    public final C42159Im7 A03() {
        InterfaceC120995dr interfaceC120995dr = this.A0G;
        C14360o3.A0C(interfaceC120995dr, "null cannot be cast to non-null type com.instagram.clips.model.MultiAdsClipsImpressionItem");
        return (C42159Im7) interfaceC120995dr;
    }

    public final IKS A04() {
        C42158Im6 c42158Im6;
        InterfaceC120995dr interfaceC120995dr = this.A0G;
        if (!(interfaceC120995dr instanceof C42158Im6) || (c42158Im6 = (C42158Im6) interfaceC120995dr) == null) {
            return null;
        }
        return c42158Im6.A01;
    }

    public final C38321qM A05() {
        EnumC129395t1 enumC129395t1 = this.A01;
        if (enumC129395t1 != EnumC129395t1.A0B && enumC129395t1 != EnumC129395t1.A05) {
            return A06().A0K;
        }
        return this.A02;
    }

    public final C40971v4 A06() {
        boolean z = false;
        if (this.A01 == EnumC129395t1.A03) {
            z = true;
        }
        if (!z && A0G()) {
            InterfaceC120995dr interfaceC120995dr = this.A0G;
            C14360o3.A0C(interfaceC120995dr, "null cannot be cast to non-null type com.instagram.clips.model.MultiAdsClipsImpressionItem");
            return ((C42159Im7) interfaceC120995dr).A02;
        }
        InterfaceC120995dr interfaceC120995dr2 = this.A0G;
        C14360o3.A0C(interfaceC120995dr2, "null cannot be cast to non-null type com.instagram.clips.model.SponsoredClipsImpressionItem");
        return ((C37899Glv) interfaceC120995dr2).A00;
    }

    public final C40971v4 A07() {
        C128075qb c128075qb;
        InterfaceC120995dr interfaceC120995dr = this.A0G;
        if (!(interfaceC120995dr instanceof C128075qb) || (c128075qb = (C128075qb) interfaceC120995dr) == null) {
            return null;
        }
        return c128075qb.A01;
    }

    public final C4NJ A08() {
        InterfaceC120995dr interfaceC120995dr = this.A0G;
        C14360o3.A0C(interfaceC120995dr, "null cannot be cast to non-null type com.instagram.clips.model.QPMidcardImpressionItem");
        return ((C42156Im4) interfaceC120995dr).A00;
    }

    public final String A0C() {
        if (AbstractC37647Ghg.A01(this.A01)) {
            if (A0G()) {
                InterfaceC120995dr interfaceC120995dr = this.A0G;
                C14360o3.A0C(interfaceC120995dr, "null cannot be cast to non-null type com.instagram.clips.model.MultiAdsClipsImpressionItem");
                return ((C42159Im7) interfaceC120995dr).A01.A02;
            }
            String id = A06().A0K.getId();
            if (id != null) {
                return id;
            }
            throw new IllegalStateException("Required value was null.");
        }
        return getId();
    }

    public final String A0D() {
        C38321qM c38321qM;
        String A2u;
        if (this.A01 != EnumC129395t1.A0G || (c38321qM = this.A02) == null || (A2u = c38321qM.A2u()) == null) {
            return getId();
        }
        return A2u;
    }

    public final boolean A0F() {
        if (this.A0G.CdW() && EnumC40111tc.A09 == this.A0J) {
            return true;
        }
        return false;
    }

    public final boolean A0G() {
        if (this.A01 != EnumC129395t1.A0A) {
            return false;
        }
        return true;
    }

    public final boolean A0H() {
        if (this.A01 != EnumC129395t1.A0B) {
            return false;
        }
        return true;
    }

    public final boolean A0I() {
        if (this.A0G.CdW()) {
            if (A06().A0K.A5w() || A06().A0K.A5v() || A06().A0K.A5m()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean A0J() {
        C38321qM c38321qM;
        if (this.A0G.CdW() && (c38321qM = this.A02) != null && c38321qM.A5x() && !A06().A06()) {
            return true;
        }
        return false;
    }

    public final boolean A0K() {
        IGAdsFeedVideoWBViewerTypeEnum iGAdsFeedVideoWBViewerTypeEnum;
        InterfaceC39541sb injected;
        InterfaceC88193wT BFe;
        if (!this.A0G.CdW()) {
            return false;
        }
        C38321qM c38321qM = this.A02;
        if (c38321qM != null && (injected = c38321qM.A0C.getInjected()) != null && (BFe = injected.BFe()) != null) {
            iGAdsFeedVideoWBViewerTypeEnum = BFe.BFM();
        } else {
            iGAdsFeedVideoWBViewerTypeEnum = null;
        }
        if (iGAdsFeedVideoWBViewerTypeEnum != IGAdsFeedVideoWBViewerTypeEnum.A09 && iGAdsFeedVideoWBViewerTypeEnum != IGAdsFeedVideoWBViewerTypeEnum.A0A && !C14360o3.A0K(A06().A0e, "WATCH_AND_BROWSE")) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC41201vU
    public final float Ack(UserSession userSession) {
        C96444Vc A1U;
        C38321qM c38321qM = this.A02;
        if (c38321qM != null && (A1U = c38321qM.A1U()) != null) {
            return A1U.A01 / A1U.A00;
        }
        return 0.0f;
    }

    @Override // X.InterfaceC120995dr
    public final List AmB() {
        return this.A0R;
    }

    @Override // X.InterfaceC120995dr
    public final InterfaceC87893vx AmK() {
        return this.A0F;
    }

    @Override // X.InterfaceC120995dr
    public final AdFormatType B82() {
        return this.A0E;
    }

    @Override // X.InterfaceC120995dr
    public final String BHD() {
        return this.A0M;
    }

    @Override // X.InterfaceC41201vU
    public final C38321qM BQN() {
        return this.A02;
    }

    @Override // X.InterfaceC120995dr
    public final EnumC40111tc BRp() {
        return this.A0J;
    }

    @Override // X.InterfaceC41201vU
    public final List BlY(EnumC75383a5 enumC75383a5) {
        List A3w;
        C38321qM c38321qM = this.A02;
        if (c38321qM == null || (A3w = c38321qM.A3w(enumC75383a5)) == null) {
            return C16930sl.A00;
        }
        return A3w;
    }

    @Override // X.InterfaceC120995dr
    public final List C7s() {
        return this.A0T;
    }

    @Override // X.InterfaceC120995dr
    public final EnumC129395t1 CBb() {
        return this.A01;
    }

    @Override // X.InterfaceC41201vU
    public final /* bridge */ /* synthetic */ User CDj() {
        return this.A0K;
    }

    @Override // X.InterfaceC41201vU
    public final String CGe() {
        return this.A0c;
    }

    @Override // X.C1NI
    public final boolean CW9() {
        return this.A0W;
    }

    @Override // X.InterfaceC41201vU
    public final boolean CY4() {
        return this.A0X;
    }

    @Override // X.C1NI
    public final boolean CZq() {
        return this.A0Y;
    }

    @Override // X.C1NI
    public final boolean CdW() {
        return this.A0G.CdW();
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C120985dq) && AbstractC50102Ry.A00(((C120985dq) obj).getId(), getId())) {
            return true;
        }
        return false;
    }

    @Override // X.C1NI, X.InterfaceC38381qS, X.InterfaceC38411qV
    public final String getId() {
        String id = this.A0G.getId();
        if (id != null) {
            return id;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.InterfaceC120995dr
    public final String getOrganicTrackingToken() {
        return this.A0P;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("ClipsItem(content=");
        sb.append(this.A0G);
        sb.append(", organicTrackingToken=");
        sb.append(this.A0P);
        sb.append(", impressionToken=");
        sb.append(this.A0M);
        sb.append(", isOrganicTrackable=");
        sb.append(this.A0Y);
        sb.append(", isImpressionTrackable=");
        sb.append(this.A0W);
        sb.append(", type=");
        sb.append(this.A01);
        sb.append(", media=");
        sb.append(this.A02);
        sb.append(MSV.A00(68));
        sb.append(this.A0J);
        sb.append(", formatType=");
        sb.append(this.A0E);
        sb.append(", carouselMedia=");
        sb.append(this.A0R);
        sb.append(", carouselRenderingConfiguration=");
        sb.append(this.A0F);
        sb.append(", rankingInfoToken=");
        sb.append(this.A0Q);
        sb.append(", mezqlToken=");
        sb.append(this.A0O);
        sb.append(", takenAtSeconds=");
        sb.append(this.A0D);
        sb.append(MSV.A00(285));
        sb.append(this.A0I);
        sb.append(", localVideoPath=");
        sb.append(this.A0N);
        sb.append(", deeplinkAREffectId=");
        sb.append(this.A0L);
        sb.append(", hasAudio=");
        sb.append(this.A0V);
        sb.append(", isShownOnProfileGrid=");
        sb.append(this.A0a);
        sb.append(", isProfileGridControlEnabled=");
        sb.append(this.A0Z);
        sb.append(", playCountValue=");
        sb.append(this.A0C);
        sb.append(", viewerInteractionSettings=");
        sb.append(this.A0H);
        sb.append(", peopleTags=");
        sb.append(this.A0S);
        sb.append(", disableUseInCache=");
        sb.append(this.A0U);
        sb.append(", threads=");
        sb.append(this.A0T);
        sb.append(", directSenders=");
        sb.append(this.A08);
        sb.append(", directSearchSection=");
        sb.append(this.A04);
        sb.append(", directSearchUISectionPosition=");
        sb.append(this.A05);
        sb.append(", clientReceivedTimeSec=");
        sb.append(this.A06);
        sb.append(", secondaryTitle=");
        sb.append(this.A07);
        sb.append(", isPartOfMultiAds=");
        sb.append(this.A0A);
        sb.append(", _customStartTimeMs=");
        sb.append(this.A00);
        sb.append(", _source=");
        Integer num = this.A03;
        if (num != null) {
            str = AbstractC37799GkE.A00(num);
        } else {
            str = "null";
        }
        sb.append(str);
        sb.append(", _isStreaming=");
        sb.append(this.A09);
        sb.append(')');
        return sb.toString();
    }

    public final IntentAwareAdsInfoIntf A00() {
        if (A0G()) {
            return (IntentAwareAdsInfoIntf) A03().A01.A01;
        }
        if (AbstractC37647Ghg.A01(this.A01)) {
            return A06().A0C;
        }
        return null;
    }

    public final Integer A0B() {
        if (A0G()) {
            Iterator it = AbstractC001800i.A0p((Iterable) A03().A01.A00).iterator();
            while (it.hasNext()) {
                C0eP c0eP = (C0eP) it.next();
                if (C14360o3.A0K(A06().A0S, ((C40971v4) c0eP.A01).A0S)) {
                    return Integer.valueOf(c0eP.A00);
                }
            }
            throw new NoSuchElementException(MSV.A00(1));
        }
        return null;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{getId()});
    }

    public C120985dq(AdFormatType adFormatType, InterfaceC87893vx interfaceC87893vx, InterfaceC120995dr interfaceC120995dr, EnumC129395t1 enumC129395t1, C5HS c5hs, C38321qM c38321qM, EnumC76383bi enumC76383bi, EnumC40111tc enumC40111tc, Integer num, Integer num2, Integer num3, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, List list2, List list3, List list4, int i, int i2, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        User user;
        C14360o3.A0B(enumC129395t1, 6);
        this.A0G = interfaceC120995dr;
        this.A0P = str;
        this.A0M = str2;
        this.A0Y = z;
        this.A0W = z2;
        this.A01 = enumC129395t1;
        this.A02 = c38321qM;
        this.A0J = enumC40111tc;
        this.A0E = adFormatType;
        this.A0R = list;
        this.A0F = interfaceC87893vx;
        this.A0Q = str3;
        this.A0O = str4;
        this.A0D = j;
        this.A0I = enumC76383bi;
        this.A0N = str5;
        this.A0L = str6;
        this.A0V = z3;
        this.A0a = z4;
        this.A0Z = z5;
        this.A0C = i;
        this.A0H = c5hs;
        this.A0S = list2;
        this.A0U = z6;
        this.A0T = list3;
        this.A08 = list4;
        this.A04 = num;
        this.A05 = num2;
        this.A06 = l;
        this.A07 = str7;
        this.A0A = z7;
        this.A00 = i2;
        this.A03 = num3;
        this.A09 = z8;
        if (c38321qM != null) {
            user = c38321qM.A0C.CDj();
        } else {
            user = null;
        }
        this.A0K = user;
        this.A0X = this.A02 != null;
        this.A0c = getId();
        A0F();
        C38321qM c38321qM2 = this.A02;
        this.A0b = c38321qM2 != null ? C14360o3.A0K(c38321qM2.A0C.CdU(), true) : false;
    }

    public C120985dq(C37683GiK c37683GiK) {
        this(null, null, c37683GiK, c37683GiK.A00, null, c37683GiK.A01, EnumC76383bi.A06, null, null, null, C05F.A0j, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, 0L, false, false, false, false, false, false, false, false);
    }

    public C120985dq() {
        this(new C37683GiK(EnumC129395t1.A0M, null));
    }
}
