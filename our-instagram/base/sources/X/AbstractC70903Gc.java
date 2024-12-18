package X;

import android.content.Context;
import android.os.SystemClock;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.api.schemas.CarouselRenderingType;
import com.instagram.api.schemas.FanClubStoriesTeaserType;
import com.instagram.api.schemas.HallpassDetailsDictImpl;
import com.instagram.api.schemas.HighlightReelTypeStr;
import com.instagram.api.schemas.IntentAwareAdsInfo;
import com.instagram.api.schemas.RingSpecImpl;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelType;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.reels.store.ReelStore;
import com.instagram.sponsored.signals.model.AdsIAWRatingInfo;
import com.instagram.sponsored.signals.model.AdsRatingInfo;
import com.instagram.user.model.User;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;

/* renamed from: X.3Gc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC70903Gc implements InterfaceC669530m {
    public int A00;
    public int A01;
    public InterfaceC670130s A02;
    public List A04;
    public java.util.Set A05;
    public int A09;
    public long A0A;
    public C85773s6 A0B;
    public boolean A0D;
    public final long A0E;
    public final UserSession A0F;
    public final AnonymousClass318 A0G;
    public final C3GY A0H;
    public final C31G A0I;
    public final InterfaceC61432r6 A0J;
    public final C1M1 A0K;
    public final String A0L;
    public final boolean A0M;
    public final int A0N;
    public final Context A0O;
    public final AbstractC018607g A0P;
    public final C1P1 A0Q;
    public final C3G2 A0R;
    public final InterfaceC101944i9 A0S;
    public final C26191Pa A0T;
    public final boolean A0U;
    public final boolean A0V;
    public final boolean A0W;
    public final boolean A0X;
    public final boolean A0Y;
    public final boolean A0Z;
    public final boolean A0a;
    public final boolean A0b;
    public final boolean A0c;
    public final boolean A0d;
    public final boolean A0e;
    public final boolean A0f;
    public Integer A03 = C05F.A00;
    public boolean A07 = true;
    public boolean A08 = true;
    public InterfaceC669830p A0C = new C669730o();
    public AtomicBoolean A06 = new AtomicBoolean();

    public AbstractC70903Gc(Context context, AbstractC018607g abstractC018607g, UserSession userSession, AnonymousClass318 anonymousClass318, C3G2 c3g2, C3GY c3gy, InterfaceC101944i9 interfaceC101944i9, C26191Pa c26191Pa, C31G c31g, InterfaceC61432r6 interfaceC61432r6, C1M1 c1m1, String str, boolean z, boolean z2, boolean z3) {
        this.A0H = c3gy;
        this.A0O = context;
        this.A0L = str;
        this.A0P = abstractC018607g;
        this.A0F = userSession;
        this.A0K = c1m1;
        this.A0R = c3g2;
        this.A0T = c26191Pa;
        this.A0I = c31g;
        this.A0S = interfaceC101944i9;
        this.A0Z = z3;
        boolean z4 = true;
        this.A0Q = c3gy.AMB();
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A0V = C18U.A06(c06090Tz, userSession, 36310538289217717L);
        if (!C18U.A06(c06090Tz, userSession, 36321670838953645L) && !C18U.A06(C06090Tz.A06, userSession, 36321619299280520L)) {
            z4 = false;
        }
        this.A0c = z4;
        this.A0M = C18U.A06(c06090Tz, userSession, 36321670838888108L);
        this.A0X = C18U.A06(c06090Tz, userSession, 36321426026603941L);
        this.A0Y = C18U.A06(c06090Tz, userSession, 36326863454353574L);
        this.A0W = C18U.A06(c06090Tz, userSession, 36321426027259311L);
        this.A0E = C18U.A01(c06090Tz, userSession, 36602901004030824L);
        this.A0f = C18U.A06(c06090Tz, userSession, 36326863454550185L);
        c3gy.EQm(this);
        this.A0d = C18U.A06(c06090Tz, userSession, 36310538284695683L);
        this.A0N = (int) C18U.A01(c06090Tz, userSession, 36592013261340790L);
        this.A0a = C18U.A06(c06090Tz, userSession, 36310538284957831L);
        this.A0J = interfaceC61432r6;
        this.A0b = z;
        this.A0e = C18U.A06(c06090Tz, userSession, 36310538287644835L);
        this.A0U = z2;
        this.A0G = anonymousClass318;
    }

    public final C101484hA A01(String str, Collection collection, Collection collection2, UUID uuid, int i, long j, boolean z) {
        Integer num;
        String str2;
        C37801pJ c37801pJ;
        C37841pN c37841pN;
        AdsIAWRatingInfo adsIAWRatingInfo;
        AdsRatingInfo adsRatingInfo;
        C37921pZ c37921pZ;
        C37941pb c37941pb;
        C38041po c38041po;
        ArrayList arrayList;
        C38091pt c38091pt;
        C38111pv c38111pv;
        HallpassDetailsDictImpl hallpassDetailsDictImpl;
        C38161q3 c38161q3;
        IntentAwareAdsInfo intentAwareAdsInfo;
        ArrayList arrayList2;
        C38211qB c38211qB;
        C38231qD c38231qD;
        C38271qH c38271qH;
        C38471qb c38471qb;
        C38491qd c38491qd;
        C38041po c38041po2;
        C38521qg c38521qg;
        C38541qi c38541qi;
        C38561qk c38561qk;
        RingSpecImpl ringSpecImpl;
        C38591qp c38591qp;
        C38611qr c38611qr;
        C38641qv c38641qv;
        C38661qx c38661qx;
        C38681qz c38681qz;
        C38701r2 c38701r2;
        C38721r4 c38721r4;
        C14360o3.A0B(collection2, 3);
        if (!z) {
            AnonymousClass318 anonymousClass318 = this.A0G;
            anonymousClass318.A03 = false;
            anonymousClass318.A06 = false;
            anonymousClass318.A0V = null;
            anonymousClass318.A0W = null;
            anonymousClass318.A0C = null;
            anonymousClass318.A0G = null;
            anonymousClass318.A0X = null;
            anonymousClass318.A0Y = null;
            anonymousClass318.A0E = null;
        }
        UserSession userSession = this.A0F;
        ReelStore A03 = ReelStore.A03(userSession);
        C14360o3.A07(A03);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(collection);
        if (this.A0W) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                Reel A0M = A03.A0M(((C37771pE) it.next()).A1V);
                if (A0M != null) {
                    A0M.A0k = Long.valueOf(System.currentTimeMillis());
                }
            }
            ArrayList arrayList4 = new ArrayList(AbstractC06950Ym.A1E(collection, 10));
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                arrayList4.add(((C37771pE) it2.next()).A1V);
            }
            ArrayList<C26086BgF> arrayList5 = new ArrayList();
            for (Object obj : collection2) {
                if (!arrayList4.contains(((C26086BgF) obj).A03)) {
                    arrayList5.add(obj);
                }
            }
            ArrayList arrayList6 = new ArrayList();
            for (C26086BgF c26086BgF : arrayList5) {
                Reel A0M2 = A03.A0M(c26086BgF.A03);
                if (A0M2 != null) {
                    C37771pE c37771pE = A0M2.A0N;
                    if (c37771pE != null) {
                        List<C38321qM> list = c37771pE.A1k;
                        if (list != null) {
                            for (C38321qM c38321qM : list) {
                                InterfaceC39541sb injected = c38321qM.A0C.getInjected();
                                if (injected != null) {
                                    C87853vt c87853vt = new C87853vt(injected);
                                    c87853vt.A0y = c26086BgF.A04;
                                    C37881pR c37881pR = (C37881pR) c26086BgF.A00;
                                    c87853vt.A0C = c37881pR;
                                    c87853vt.A0D = c37881pR;
                                    c38321qM.A4E(c87853vt.A01());
                                }
                            }
                        }
                        C37801pJ c37801pJ2 = c37771pE.A0I;
                        String str3 = c37771pE.A1P;
                        C37841pN c37841pN2 = c37771pE.A0P;
                        Long l = c37771pE.A1I;
                        AdsIAWRatingInfo adsIAWRatingInfo2 = c37771pE.A0Y;
                        AdsRatingInfo adsRatingInfo2 = c37771pE.A0Z;
                        String str4 = c37771pE.A1Q;
                        String str5 = c37771pE.A1R;
                        Boolean bool = c37771pE.A0b;
                        C37921pZ c37921pZ2 = c37771pE.A0Q;
                        C37941pb c37941pb2 = c37771pE.A00;
                        String str6 = c37771pE.A1S;
                        Boolean bool2 = c37771pE.A0c;
                        Boolean bool3 = c37771pE.A0d;
                        Boolean bool4 = c37771pE.A0e;
                        Integer num2 = c37771pE.A16;
                        CarouselRenderingType carouselRenderingType = c37771pE.A01;
                        List list2 = c37771pE.A1f;
                        Float f = c37771pE.A14;
                        Boolean bool5 = c37771pE.A0f;
                        Boolean bool6 = c37771pE.A0g;
                        C38041po c38041po3 = c37771pE.A0R;
                        List list3 = c37771pE.A1g;
                        C38091pt c38091pt2 = c37771pE.A0L;
                        Integer num3 = c37771pE.A17;
                        List list4 = c37771pE.A1h;
                        Boolean bool7 = c37771pE.A0h;
                        C38111pv c38111pv2 = c37771pE.A0K;
                        Long l2 = c37771pE.A1J;
                        FanClubStoriesTeaserType fanClubStoriesTeaserType = c37771pE.A02;
                        String str7 = c37771pE.A1T;
                        HallpassDetailsDictImpl hallpassDetailsDictImpl2 = c37771pE.A03;
                        Boolean bool8 = c37771pE.A0i;
                        Boolean bool9 = c37771pE.A0j;
                        Boolean bool10 = c37771pE.A0k;
                        String str8 = c37771pE.A1U;
                        Boolean bool11 = c37771pE.A0l;
                        Boolean bool12 = c37771pE.A0m;
                        Boolean bool13 = c37771pE.A0n;
                        HighlightReelTypeStr highlightReelTypeStr = c37771pE.A04;
                        List list5 = c37771pE.A1i;
                        String str9 = c37771pE.A1V;
                        C38161q3 c38161q32 = c37771pE.A05;
                        Long l3 = c37771pE.A1K;
                        Boolean bool14 = c37771pE.A0o;
                        IntentAwareAdsInfo intentAwareAdsInfo2 = c37771pE.A06;
                        List list6 = c37771pE.A1j;
                        String str10 = c37771pE.A1W;
                        C38211qB c38211qB2 = c37771pE.A0U;
                        Boolean bool15 = c37771pE.A0p;
                        Boolean bool16 = c37771pE.A0q;
                        Boolean bool17 = c37771pE.A0r;
                        Boolean bool18 = c37771pE.A0s;
                        Boolean bool19 = c37771pE.A0t;
                        Boolean bool20 = c37771pE.A0u;
                        Boolean bool21 = c37771pE.A0v;
                        Boolean bool22 = c37771pE.A0w;
                        Boolean bool23 = c37771pE.A0x;
                        Boolean bool24 = c37771pE.A0y;
                        Float f2 = c37771pE.A15;
                        Long l4 = c37771pE.A1L;
                        Long l5 = c37771pE.A1M;
                        Integer num4 = c37771pE.A18;
                        List list7 = c37771pE.A1l;
                        C38231qD c38231qD2 = c37771pE.A07;
                        C38271qH c38271qH2 = c37771pE.A08;
                        Boolean bool25 = c37771pE.A0z;
                        C38321qM c38321qM2 = c37771pE.A0H;
                        String str11 = c37771pE.A1X;
                        Integer num5 = c37771pE.A19;
                        C38471qb c38471qb2 = c37771pE.A0A;
                        String str12 = c37771pE.A1Y;
                        List list8 = c37771pE.A1m;
                        Integer num6 = c37771pE.A1A;
                        Long l6 = c37771pE.A1N;
                        Integer num7 = c37771pE.A1C;
                        C38491qd c38491qd2 = c37771pE.A0M;
                        C38041po c38041po4 = c37771pE.A0S;
                        C38521qg c38521qg2 = c37771pE.A0B;
                        ReelType reelType = c37771pE.A0N;
                        C38541qi c38541qi2 = c37771pE.A0J;
                        C38561qk c38561qk2 = c37771pE.A0W;
                        RingSpecImpl ringSpecImpl2 = c37771pE.A0C;
                        Integer num8 = c37771pE.A1D;
                        Integer num9 = c37771pE.A1E;
                        C38591qp c38591qp2 = c37771pE.A0D;
                        Boolean bool26 = c37771pE.A10;
                        Boolean bool27 = c37771pE.A11;
                        Boolean bool28 = c37771pE.A12;
                        Boolean bool29 = c37771pE.A13;
                        C38611qr c38611qr2 = c37771pE.A0V;
                        String str13 = c37771pE.A1Z;
                        C38641qv c38641qv2 = c37771pE.A0E;
                        String str14 = c37771pE.A1a;
                        String str15 = c37771pE.A1b;
                        Integer num10 = c37771pE.A1F;
                        Integer num11 = c37771pE.A1G;
                        String str16 = c37771pE.A1c;
                        C38661qx c38661qx2 = c37771pE.A0O;
                        C38681qz c38681qz2 = c37771pE.A0F;
                        C38701r2 c38701r22 = c37771pE.A0G;
                        String str17 = c37771pE.A1d;
                        C38721r4 c38721r42 = c37771pE.A09;
                        Long l7 = c37771pE.A1O;
                        List list9 = c37771pE.A1n;
                        List list10 = c37771pE.A1o;
                        Integer num12 = c37771pE.A1H;
                        User user = c37771pE.A0a;
                        List list11 = c37771pE.A1p;
                        List list12 = c37771pE.A1e;
                        C38011pl c38011pl = (C38011pl) c26086BgF.A01;
                        Integer num13 = (Integer) c26086BgF.A02;
                        C37881pR c37881pR2 = (C37881pR) c26086BgF.A00;
                        C1DY c1dy = new C1DY((C1DV) new C37761pD(null), 6, false);
                        if (c37801pJ2 != null) {
                            c37801pJ = c37801pJ2.F5H(c1dy);
                        } else {
                            c37801pJ = null;
                        }
                        if (c37841pN2 != null) {
                            c37841pN = c37841pN2.F5X();
                        } else {
                            c37841pN = null;
                        }
                        C37881pR c37881pR3 = null;
                        if (c37881pR2 != null) {
                            c37881pR3 = c37881pR2;
                        }
                        if (adsIAWRatingInfo2 != null) {
                            adsIAWRatingInfo = adsIAWRatingInfo2.F7I();
                        } else {
                            adsIAWRatingInfo = null;
                        }
                        if (adsRatingInfo2 != null) {
                            adsRatingInfo = adsRatingInfo2.F7J();
                        } else {
                            adsRatingInfo = null;
                        }
                        if (c37921pZ2 != null) {
                            c37921pZ = c37921pZ2.F5Y();
                        } else {
                            c37921pZ = null;
                        }
                        if (c37941pb2 != null) {
                            c37941pb = c37941pb2.ErP(c1dy);
                        } else {
                            c37941pb = null;
                        }
                        C38011pl c38011pl2 = null;
                        if (c38011pl != null) {
                            c38011pl2 = c38011pl;
                        }
                        if (c38041po3 != null) {
                            c38041po = c38041po3.F5e(c1dy);
                        } else {
                            c38041po = null;
                        }
                        if (list3 != null) {
                            arrayList = new ArrayList(AbstractC06950Ym.A1E(list3, 10));
                            Iterator it3 = list3.iterator();
                            while (it3.hasNext()) {
                                arrayList.add(((InterfaceC38791rB) it3.next()).ErW());
                            }
                        } else {
                            arrayList = null;
                        }
                        if (c38091pt2 != null) {
                            c38091pt = c38091pt2.F5P();
                        } else {
                            c38091pt = null;
                        }
                        if (c38111pv2 != null) {
                            c38111pv = c38111pv2.F5N(c1dy);
                        } else {
                            c38111pv = null;
                        }
                        if (hallpassDetailsDictImpl2 != null) {
                            hallpassDetailsDictImpl = hallpassDetailsDictImpl2.Eu6(c1dy);
                        } else {
                            hallpassDetailsDictImpl = null;
                        }
                        if (c38161q32 != null) {
                            c38161q3 = c38161q32.EuR();
                        } else {
                            c38161q3 = null;
                        }
                        if (intentAwareAdsInfo2 != null) {
                            intentAwareAdsInfo = intentAwareAdsInfo2.Evj();
                        } else {
                            intentAwareAdsInfo = null;
                        }
                        if (list6 != null) {
                            arrayList2 = new ArrayList(AbstractC06950Ym.A1E(list6, 10));
                            Iterator it4 = list6.iterator();
                            while (it4.hasNext()) {
                                arrayList2.add(((InterfaceC37791pH) it4.next()).F5R(c1dy));
                            }
                        } else {
                            arrayList2 = null;
                        }
                        if (c38211qB2 != null) {
                            c38211qB = c38211qB2.F6e();
                        } else {
                            c38211qB = null;
                        }
                        if (c38231qD2 != null) {
                            c38231qD = c38231qD2.EwQ();
                        } else {
                            c38231qD = null;
                        }
                        if (c38271qH2 != null) {
                            c38271qH = c38271qH2.Ewe();
                        } else {
                            c38271qH = null;
                        }
                        if (c38471qb2 != null) {
                            c38471qb = c38471qb2.Ez2();
                        } else {
                            c38471qb = null;
                        }
                        if (c38491qd2 != null) {
                            c38491qd = c38491qd2.F5Q();
                        } else {
                            c38491qd = null;
                        }
                        if (c38041po4 != null) {
                            c38041po2 = c38041po4.F5e(c1dy);
                        } else {
                            c38041po2 = null;
                        }
                        if (c38521qg2 != null) {
                            c38521qg = c38521qg2.Ez6();
                        } else {
                            c38521qg = null;
                        }
                        if (c38541qi2 != null) {
                            c38541qi = c38541qi2.F5I();
                        } else {
                            c38541qi = null;
                        }
                        if (c38561qk2 != null) {
                            c38561qk = c38561qk2.F7A();
                        } else {
                            c38561qk = null;
                        }
                        if (ringSpecImpl2 != null) {
                            ringSpecImpl = ringSpecImpl2.EzF();
                        } else {
                            ringSpecImpl = null;
                        }
                        if (c38591qp2 != null) {
                            c38591qp = c38591qp2.EzQ(c1dy);
                        } else {
                            c38591qp = null;
                        }
                        if (c38611qr2 != null) {
                            c38611qr = c38611qr2.F6l();
                        } else {
                            c38611qr = null;
                        }
                        if (c38641qv2 != null) {
                            c38641qv = c38641qv2.Ezb(c1dy);
                        } else {
                            c38641qv = null;
                        }
                        if (c38661qx2 != null) {
                            c38661qx = c38661qx2.F5U(c1dy);
                        } else {
                            c38661qx = null;
                        }
                        if (c38681qz2 != null) {
                            c38681qz = c38681qz2.F2d(c1dy);
                        } else {
                            c38681qz = null;
                        }
                        if (c38701r22 != null) {
                            c38701r2 = c38701r22.F3M(c1dy);
                        } else {
                            c38701r2 = null;
                        }
                        if (c38721r42 != null) {
                            c38721r4 = c38721r42.Eym(c1dy);
                        } else {
                            c38721r4 = null;
                        }
                        arrayList6.add(new C37771pE(c37941pb, carouselRenderingType, fanClubStoriesTeaserType, hallpassDetailsDictImpl, highlightReelTypeStr, c38161q3, intentAwareAdsInfo, c38231qD, c38271qH, c38721r4, c38471qb, c38521qg, ringSpecImpl, c38591qp, c38641qv, c38681qz, c38701r2, c38321qM2, c37801pJ, c38541qi, c38111pv, c38091pt, c38491qd, reelType, c38661qx, c37841pN, c37921pZ, c38041po, c38041po2, c37881pR3, c38211qB, c38611qr, c38561qk, c38011pl2, adsIAWRatingInfo, adsRatingInfo, user, bool, bool2, bool3, bool4, bool5, bool6, bool7, bool8, bool9, bool10, bool11, bool12, bool13, bool14, bool15, bool16, bool17, bool18, bool19, bool20, bool21, bool22, bool23, bool24, bool25, bool26, bool27, bool28, bool29, f, f2, num2, num3, num4, num5, num6, num13, num7, num8, num9, num10, num11, num12, l, l2, l3, l4, l5, l6, l7, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, list2, arrayList, list4, list5, arrayList2, list, list7, list8, list9, list10, list11, list12));
                    } else {
                        throw new NullPointerException(AbstractC111324zv.A00(668));
                    }
                }
            }
            arrayList3.addAll(arrayList6);
        }
        ArrayList A0S = A03.A0S(arrayList3);
        final C120465cq c120465cq = C120465cq.A00;
        C01T.A1D(A0S, new Comparator(c120465cq) { // from class: X.5cr
            public final /* synthetic */ InterfaceC16620sF A00;

            {
                C14360o3.A0B(c120465cq, 1);
                this.A00 = c120465cq;
            }

            @Override // java.util.Comparator
            public final /* synthetic */ int compare(Object obj2, Object obj3) {
                return ((Number) this.A00.invoke(obj2, obj3)).intValue();
            }
        });
        ArrayList arrayList7 = new ArrayList(A0S.size());
        Iterator it5 = A0S.iterator();
        while (it5.hasNext()) {
            Reel reel = (Reel) it5.next();
            int i2 = ((int) reel.A04) + this.A01;
            boolean CdW = reel.CdW();
            long currentTimeMillis = System.currentTimeMillis();
            if (uuid != null) {
                str2 = uuid.toString();
            } else {
                str2 = null;
            }
            arrayList7.add(new C41551w4(userSession, reel, str, str2, i2, currentTimeMillis, CdW));
            if (this.A0Y) {
                C40861ut c40861ut = reel.A0b;
                if (c40861ut != null) {
                    boolean z2 = this.A0Z;
                    boolean z3 = this.A0f;
                    c40861ut.A01 = z2;
                    c40861ut.A02 = z3;
                }
                this.A0G.A05 = Boolean.valueOf(this.A0Z);
            }
        }
        if (!this.A08 ? j > 2600 : j > 1650) {
            this.A0G.A0Q = "bad_network";
        }
        InterfaceC670130s interfaceC670130s = this.A02;
        if (interfaceC670130s != null) {
            if (this instanceof C70893Gb) {
                num = C05F.A01;
            } else if (z) {
                num = C05F.A0N;
            } else {
                num = C05F.A00;
            }
            C101484hA DnX = interfaceC670130s.DnX(num, arrayList7);
            this.A0I.CiG(C85633rs.A0D, arrayList7, i, j, this.A08);
            this.A08 = false;
            EnumC74603Ws enumC74603Ws = EnumC74603Ws.A05;
            java.util.Set set = this.A05;
            if (set != null) {
                this.A0J.FCF(enumC74603Ws, set);
                this.A05 = null;
            }
            return DnX;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void A03(AnonymousClass320 anonymousClass320, InterfaceC669830p interfaceC669830p, InterfaceC670130s interfaceC670130s) {
        this.A01 = anonymousClass320.A02;
        this.A00 = anonymousClass320.A01;
        this.A02 = interfaceC670130s;
        this.A0C = interfaceC669830p;
        this.A04 = anonymousClass320.A03;
        this.A06.set(true);
        this.A0A = SystemClock.elapsedRealtime();
        this.A0D = anonymousClass320.A00;
    }

    public final void A04(EnumC37671p4 enumC37671p4, int i, boolean z) {
        Integer num;
        String str;
        String str2;
        String str3;
        EnumC23341Bw enumC23341Bw;
        String str4;
        int i2;
        String str5;
        C85713s0 A00;
        AnonymousClass318 anonymousClass318 = this.A0G;
        anonymousClass318.A01 = Boolean.valueOf(this.A07);
        C3GY c3gy = this.A0H;
        anonymousClass318.A00 = Boolean.valueOf(c3gy.Cbb());
        Integer num2 = C05F.A01;
        if (this instanceof C70893Gb) {
            num = C05F.A01;
        } else if (z) {
            num = C05F.A0N;
        } else {
            num = C05F.A00;
        }
        boolean z2 = false;
        if (num2 == num) {
            z2 = true;
        }
        anonymousClass318.A02 = Boolean.valueOf(z2);
        anonymousClass318.A0F = Integer.valueOf(i);
        List list = this.A04;
        if (list != null) {
            if (!list.isEmpty() && this.A0K.getSessionId() != null) {
                this.A03 = num2;
                this.A09 = i;
                InterfaceC669830p interfaceC669830p = this.A0C;
                List list2 = this.A04;
                C14360o3.A0A(list2);
                interfaceC669830p.DGn(new C85633rs(null, null, null, null, null, null, null, null, list2, false, false, false, false));
                InterfaceC101944i9 interfaceC101944i9 = this.A0S;
                if (interfaceC101944i9 != null && this.A0e) {
                    InterfaceC670130s interfaceC670130s = this.A02;
                    if (interfaceC670130s != null) {
                        for (Map.Entry entry : interfaceC670130s.Bkt().entrySet()) {
                            String str6 = (String) entry.getKey();
                            C5I4 c5i4 = (C5I4) entry.getValue();
                            C41551w4 Blv = interfaceC101944i9.Blv(str6);
                            if (!c5i4.CWh() && Blv != null) {
                                c5i4.EWC(interfaceC101944i9.CNR(Blv));
                            }
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
                InterfaceC670130s interfaceC670130s2 = this.A02;
                if (interfaceC670130s2 != null) {
                    interfaceC670130s2.CtX(i);
                    C85653ru A05 = A05(z);
                    Context context = A05.A05;
                    UserSession userSession = A05.A06;
                    String str7 = A05.A08;
                    String str8 = A05.A09;
                    Collection collection = A05.A0A;
                    int i3 = A05.A01;
                    int i4 = A05.A04;
                    boolean z3 = A05.A0H;
                    Map map = A05.A0C;
                    Map map2 = A05.A0B;
                    boolean z4 = A05.A0K;
                    int i5 = A05.A03;
                    int i6 = A05.A00;
                    boolean z5 = A05.A0I;
                    int i7 = A05.A02;
                    boolean z6 = A05.A0J;
                    boolean z7 = A05.A0G;
                    Map map3 = A05.A0D;
                    boolean z8 = A05.A0E;
                    boolean z9 = A05.A0F;
                    Double d = A05.A07;
                    boolean z10 = A05.A0L;
                    boolean z11 = A05.A0M;
                    HashMap hashMap = new HashMap();
                    HashMap hashMap2 = new HashMap();
                    for (Map.Entry entry2 : map.entrySet()) {
                        C5I4 c5i42 = (C5I4) entry2.getValue();
                        int intValue = c5i42.BKD().intValue();
                        if (intValue != 2) {
                            if (intValue == 3) {
                                hashMap2.put(entry2.getKey(), c5i42);
                            }
                        } else {
                            hashMap.put(entry2.getKey(), c5i42);
                        }
                    }
                    Integer valueOf = Integer.valueOf(i5);
                    Integer valueOf2 = Integer.valueOf(i6);
                    Boolean valueOf3 = Boolean.valueOf(z5);
                    Integer valueOf4 = Integer.valueOf(i7);
                    try {
                        synchronized (C85713s0.class) {
                            A00 = C85713s0.A01.A00();
                        }
                        str = A00.clientDocIdForQuery("IGCanvasDocumentQuery");
                    } catch (IOException | JSONException e) {
                        C0w9.A03("ReelApiUtil.createReelsSponsoredContentRequestTask", e.getMessage());
                        str = null;
                    }
                    C25621Ms c25621Ms = new C25621Ms(userSession);
                    c25621Ms.A09(num2);
                    c25621Ms.A0B("feed/injected_reels_media/");
                    c25621Ms.A9s("tray_session_id", str7);
                    c25621Ms.A9s("viewer_session_id", str8);
                    c25621Ms.A9s("entry_point_index", Integer.toString(i3));
                    c25621Ms.A0H("client_doc_id", str);
                    c25621Ms.A9s("ad_request_index", Integer.toString(i4));
                    try {
                        StringWriter stringWriter = new StringWriter();
                        C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
                        A0A.A0c();
                        for (C5I4 c5i43 : hashMap.values()) {
                            A0A.A0d();
                            A0A.A0S("ad_id", c5i43.getId());
                            A0A.A0Q("position", c5i43.BIC());
                            A0A.A0T("is_client_inserted_ad", c5i43.CWh());
                            A0A.A0a();
                        }
                        A0A.A0Z();
                        A0A.close();
                        str2 = stringWriter.toString();
                    } catch (IOException e2) {
                        C0K8.A07(C25401Lu.class, "Failed to convert a collection to json", e2, new Object[0]);
                        str2 = null;
                    }
                    c25621Ms.AA6("inserted_ad_indices", str2);
                    try {
                        StringWriter stringWriter2 = new StringWriter();
                        C222015v c222015v = AbstractC221915u.A00;
                        C17z A0A2 = c222015v.A0A(stringWriter2);
                        A0A2.A0c();
                        for (C5I4 c5i44 : hashMap2.values()) {
                            A0A2.A0d();
                            A0A2.A0S("netego_id", c5i44.getId());
                            A0A2.A0Q("position", c5i44.BIC());
                            A0A2.A0T("is_client_inserted_netego", c5i44.CWh());
                            A0A2.A0a();
                        }
                        A0A2.A0Z();
                        A0A2.close();
                        c25621Ms.AA6("inserted_netego_indices", stringWriter2.toString());
                        c25621Ms.A0I("is_first_page", z3);
                        c25621Ms.A0I("is_media_based_insertion_enabled", z4);
                        C06090Tz c06090Tz = C06090Tz.A05;
                        c25621Ms.A0I("is_ad_pod_enabled", C18U.A06(c06090Tz, userSession, 36312513970046105L));
                        c25621Ms.A0I("is_prefetch", z6);
                        c25621Ms.A0I("is_ads_sensitive", z8);
                        c25621Ms.A0I("is_carry_over_first_page", z9);
                        c25621Ms.A0I("is_refresh", z10);
                        c25621Ms.A0S(C40741uh.class, C85733s2.class);
                        if (map2 != null) {
                            try {
                                StringWriter stringWriter3 = new StringWriter();
                                C17z A0A3 = c222015v.A0A(stringWriter3);
                                A0A3.A0d();
                                for (Map.Entry entry3 : map2.entrySet()) {
                                    A0A3.A0M((String) entry3.getKey());
                                    Iterator it = ((List) entry3.getValue()).iterator();
                                    while (it.hasNext()) {
                                        A0A3.A0u((String) it.next());
                                    }
                                    A0A3.A0Z();
                                }
                                A0A3.A0a();
                                A0A3.close();
                                str3 = stringWriter3.toString();
                            } catch (IOException e3) {
                                C0K8.A07(C25401Lu.class, "Failed to convert a collection to json", e3, new Object[0]);
                                str3 = null;
                            }
                            c25621Ms.AA6("cached_ads", str3);
                        }
                        if (z6 && d != null) {
                            double doubleValue = d.doubleValue();
                            if (doubleValue >= 0.0d && doubleValue <= 1.0d) {
                                try {
                                    StringWriter stringWriter4 = new StringWriter();
                                    C17z A0A4 = c222015v.A0A(stringWriter4);
                                    A0A4.A0d();
                                    A0A4.A0O("story_prefetch_score", doubleValue);
                                    A0A4.A0a();
                                    A0A4.close();
                                    str5 = stringWriter4.toString();
                                } catch (IOException e4) {
                                    C0K8.A07(C25401Lu.class, "Failed to convert a collection to json", e4, new Object[0]);
                                    str5 = null;
                                }
                                c25621Ms.AA6("odml", str5);
                            }
                        }
                        try {
                            c25621Ms.AA6("tray_user_ids", C85743s3.A01(collection));
                        } catch (IOException e5) {
                            C0K8.A0G("ReelApiUtil", "Failed to convert a collection to json", e5);
                        }
                        if (z7) {
                            enumC23341Bw = EnumC23341Bw.CriticalAPI;
                        } else {
                            enumC23341Bw = EnumC23341Bw.API;
                        }
                        ((AbstractC23721Ec) c25621Ms).A06 = enumC23341Bw;
                        if (valueOf != null) {
                            c25621Ms.A9s("num_items_in_pool", Integer.toString(valueOf.intValue()));
                        }
                        if (valueOf2 != null) {
                            c25621Ms.A9s("earliest_request_position", Integer.toString(valueOf2.intValue()));
                        }
                        if (valueOf3 != null) {
                            c25621Ms.A0I("is_inventory_based_request_enabled", valueOf3.booleanValue());
                        }
                        if (valueOf4 != null) {
                            c25621Ms.A9s("reel_position", Integer.toString(valueOf4.intValue()));
                        }
                        if (z4) {
                            c25621Ms.AA6("ad_and_netego_request_information", C85753s4.A00(map));
                            C3ZC A002 = AbstractC85763s5.A00(userSession);
                            HashMap hashMap3 = new HashMap(map);
                            UserSession userSession2 = A002.A00;
                            if (C18U.A06(c06090Tz, userSession2, 36316843295773377L)) {
                                Collection<C5I4> values = hashMap3.values();
                                C14360o3.A07(values);
                                for (C5I4 c5i45 : values) {
                                    if (c5i45.C03() == C5I5.A07) {
                                        C1ZX A01 = C1ZV.A00(userSession2).A01(C05F.A03, C05F.A0R, false);
                                        switch (c5i45.BKD().intValue()) {
                                            case 1:
                                                i2 = 1;
                                                break;
                                            case 2:
                                                i2 = 2;
                                                break;
                                            case 3:
                                                i2 = 3;
                                                break;
                                            default:
                                                i2 = 0;
                                                break;
                                        }
                                        A01.A01("item_type", i2);
                                        A01.A03("item_id", c5i45.getId());
                                        A01.A01(TraceFieldType.CurrentState, c5i45.C03().A00);
                                        A01.A00();
                                    }
                                }
                            }
                        }
                        if (map3 != null && !map3.isEmpty()) {
                            for (Map.Entry entry4 : map3.entrySet()) {
                                c25621Ms.AA6((String) entry4.getKey(), (String) entry4.getValue());
                            }
                            c25621Ms.A0G("X_IG_PERF_QPL_JOIN_ID", String.valueOf(map3.toString().hashCode()));
                            c25621Ms.A0G("X_IG_PERF_QPL_MARKER_ID", "823333654");
                        }
                        if (C1AD.A06(c06090Tz, 18302131253547499L)) {
                            boolean A07 = AbstractC23451Ch.A07(context, "android.permission.RECORD_AUDIO");
                            boolean A072 = AbstractC23451Ch.A07(context, "android.permission.CAMERA");
                            if (A07 && A072) {
                                str4 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
                            } else {
                                str4 = "0";
                            }
                            c25621Ms.A9s("has_camera_permission", str4);
                        }
                        if (C18U.A06(c06090Tz, userSession, 36326863454353574L)) {
                            c25621Ms.A0I("is_self_pog_chaining", z11);
                        }
                        c25621Ms.A0V = true;
                        c25621Ms.A0R = true;
                        AbstractC23841Er.A00(context, c25621Ms, userSession, new C1CM(context), false);
                        C85773s6 c85773s6 = new C85773s6();
                        c85773s6.A00 = c25621Ms.A0N();
                        this.A0B = c85773s6;
                        C14360o3.A0A(c85773s6);
                        C1ON c1on = c85773s6.A00;
                        if (c1on != null) {
                            C85773s6 c85773s62 = this.A0B;
                            C14360o3.A0A(c85773s62);
                            c1on.A00 = c3gy.AMt(enumC37671p4, c85773s62.A06, z);
                            if (this.A0d) {
                                C85773s6 c85773s63 = this.A0B;
                                C14360o3.A0A(c85773s63);
                                C1ON c1on2 = c85773s63.A00;
                                if (c1on2 != null) {
                                    C1GJ.A06(c1on2, 796, this.A0N, true, true);
                                } else {
                                    throw new IllegalStateException("Required value was null.");
                                }
                            } else {
                                Context context2 = this.A0O;
                                AbstractC018607g abstractC018607g = this.A0P;
                                C85773s6 c85773s64 = this.A0B;
                                C14360o3.A0A(c85773s64);
                                C1ON c1on3 = c85773s64.A00;
                                if (c1on3 != null) {
                                    C1GJ.A00(context2, abstractC018607g, c1on3);
                                } else {
                                    throw new IllegalStateException("Required value was null.");
                                }
                            }
                            this.A07 = false;
                            return;
                        }
                        throw new IllegalStateException("Required value was null.");
                    } catch (IOException unused) {
                        throw new RuntimeException("Failed to convert received Netego info to JSON");
                    }
                }
                throw new IllegalStateException("Required value was null.");
            }
            StringBuilder sb = new StringBuilder();
            sb.append("ReelAdsController");
            List list3 = this.A04;
            if (list3 != null) {
                if (list3.isEmpty()) {
                    sb.append("#No reels id");
                }
                if (this.A0K.getSessionId() == null) {
                    sb.append("#No viewer session id");
                }
                String obj = sb.toString();
                C14360o3.A07(obj);
                C0w9.A03(obj, A06());
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.InterfaceC669530m
    public boolean A7S(AnonymousClass320 anonymousClass320, InterfaceC669830p interfaceC669830p, InterfaceC670130s interfaceC670130s) {
        C41541IZq c41541IZq;
        C14360o3.A0B(interfaceC670130s, 0);
        C14360o3.A0B(interfaceC669830p, 1);
        C14360o3.A0B(anonymousClass320, 2);
        this.A0H.A7R(anonymousClass320);
        C26191Pa c26191Pa = this.A0T;
        c26191Pa.A04 = false;
        c26191Pa.A06 = true;
        A03(anonymousClass320, interfaceC669830p, interfaceC670130s);
        String str = this.A0L;
        C14360o3.A0A(str);
        int i = anonymousClass320.A01;
        C40741uh c40741uh = new C40741uh();
        c40741uh.A02 = 2;
        c40741uh.A04 = Integer.valueOf(i + 1);
        c40741uh.A06 = str;
        this.A0G.A09 = Integer.valueOf(anonymousClass320.A02);
        if (this.A0b) {
            c41541IZq = C41541IZq.A00;
        } else {
            c41541IZq = null;
        }
        if (!c26191Pa.A02(this.A0Q, c41541IZq, c40741uh)) {
            A07(this.A00, false);
        } else {
            if (!C18U.A06(C06090Tz.A05, this.A0F, 36310538283647096L)) {
                this.A03 = C05F.A01;
            }
            this.A07 = false;
            this.A08 = false;
        }
        interfaceC669830p.DrF(str);
        return true;
    }

    @Override // X.InterfaceC669630n
    public final /* synthetic */ void CKM(C206209Bd c206209Bd, List list) {
    }

    @Override // X.InterfaceC669530m
    public final void Co5() {
    }

    @Override // X.InterfaceC669530m
    public final void CoL(AnonymousClass320 anonymousClass320, EnumC37671p4 enumC37671p4, boolean z) {
        if (this instanceof C70893Gb) {
            C14360o3.A0B(anonymousClass320, 0);
            C14360o3.A0B(enumC37671p4, 2);
            CoM(null, anonymousClass320, enumC37671p4, null, null, 0.0d, z);
        }
    }

    @Override // X.InterfaceC669530m
    public /* synthetic */ void CoM(C9C3 c9c3, AnonymousClass320 anonymousClass320, EnumC37671p4 enumC37671p4, String str, String str2, double d, boolean z) {
        C14360o3.A0B(anonymousClass320, 1);
        C14360o3.A0B(enumC37671p4, 3);
        CoL(anonymousClass320, enumC37671p4, z);
    }

    @Override // X.InterfaceC669530m
    public void Dtv(int i) {
    }

    public final void A02(int i, String str, long j) {
        this.A0I.CiE(str, i, j, this.A08);
        this.A08 = false;
        EnumC74603Ws enumC74603Ws = EnumC74603Ws.A04;
        java.util.Set set = this.A05;
        if (set != null) {
            this.A0J.FCF(enumC74603Ws, set);
            this.A05 = null;
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, X.3ru] */
    public C85653ru A05(boolean z) {
        String str;
        ?? obj = new Object();
        InterfaceC670130s interfaceC670130s = this.A02;
        if (interfaceC670130s != null) {
            Map Bkt = interfaceC670130s.Bkt();
            if (z && this.A0c && (!this.A0X || !this.A07)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : Bkt.entrySet()) {
                    if (((C5I4) entry.getValue()).C03() == C5I5.A06) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                Bkt = linkedHashMap;
            }
            InterfaceC61432r6 interfaceC61432r6 = this.A0J;
            Map AUS = interfaceC61432r6.AUS("feed/injected_reels_media/");
            this.A05 = AbstractC85703rz.A01(AUS);
            obj.A05 = this.A0O;
            UserSession userSession = this.A0F;
            obj.A06 = userSession;
            obj.A08 = this.A0L;
            obj.A09 = this.A0K.getSessionId();
            obj.A01 = this.A00;
            obj.A04 = this.A09;
            obj.A0K = true;
            obj.A0H = this.A07;
            obj.A0C = Bkt;
            obj.A0G = this.A0a;
            obj.A0E = this.A0D;
            obj.A0F = this.A0H.Cbb();
            obj.A0D = AbstractC85703rz.A00(AUS);
            obj.A0L = z;
            EnumC74603Ws enumC74603Ws = EnumC74603Ws.A06;
            java.util.Set set = this.A05;
            if (set != null) {
                interfaceC61432r6.FCF(enumC74603Ws, set);
            }
            if (this.A0Y) {
                obj.A0M = this.A0Z;
            }
            if (this.A0W) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                long j = this.A0E;
                if (j > 0) {
                    long currentTimeMillis = System.currentTimeMillis() - TimeUnit.MINUTES.toMillis(j);
                    ReelStore A03 = ReelStore.A03(userSession);
                    C14360o3.A07(A03);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = A03.A0D.entrySet().iterator();
                    while (it.hasNext()) {
                        Reel reel = (Reel) ((Map.Entry) it.next()).getValue();
                        if (reel.CdW() && reel.A0k.longValue() >= currentTimeMillis) {
                            arrayList.add(reel);
                        }
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        Reel reel2 = (Reel) it2.next();
                        C14360o3.A0A(reel2);
                        if (!AbstractC130925vf.A0W(reel2)) {
                            String id = reel2.getId();
                            List A0O = reel2.A0O(userSession);
                            C14360o3.A07(A0O);
                            ArrayList arrayList2 = new ArrayList(AbstractC06950Ym.A1E(A0O, 10));
                            Iterator it3 = A0O.iterator();
                            while (it3.hasNext()) {
                                C38321qM c38321qM = ((C41181vS) it3.next()).A0b;
                                if (c38321qM == null || (str = c38321qM.getId()) == null) {
                                    str = "";
                                }
                                arrayList2.add(str);
                            }
                            linkedHashMap2.put(id, arrayList2);
                        }
                    }
                }
                obj.A0B = linkedHashMap2;
            }
            InterfaceC101944i9 interfaceC101944i9 = this.A0S;
            if (this.A0V && interfaceC101944i9 != null) {
                List AZa = interfaceC101944i9.AZa();
                if (!AZa.isEmpty()) {
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it4 = AZa.iterator();
                    while (it4.hasNext()) {
                        arrayList3.add(((C41551w4) it4.next()).A0H);
                    }
                    this.A04 = AbstractC74043Tv.A00(arrayList3, null, 0).A03;
                }
            }
            List list = this.A04;
            if (list != null) {
                obj.A0A = list;
                return obj;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public String A06() {
        StringBuilder sb = new StringBuilder();
        sb.append("mViewerSource:");
        sb.append(this.A0R.A00);
        sb.append(" mViewerSessionId: ");
        sb.append(this.A0K.getSessionId());
        sb.append(" mTraySessionId: ");
        sb.append(this.A0L);
        sb.append(" adRequestIndex:");
        sb.append(this.A09);
        return sb.toString();
    }

    public void A07(int i, boolean z) {
        A04(EnumC37671p4.A04, i, z);
    }

    @Override // X.InterfaceC669530m
    public final boolean AFs() {
        return this.A0T.A01();
    }

    @Override // X.InterfaceC669530m
    public final /* synthetic */ C51G AND() {
        return new C43000Izq();
    }

    @Override // X.InterfaceC669630n
    public final /* synthetic */ String B5L() {
        return "";
    }

    @Override // X.InterfaceC669530m
    public final int BX5() {
        return this.A0H.BWp();
    }

    @Override // X.InterfaceC669530m
    public final int Bg5() {
        return this.A0H.Bg1();
    }

    @Override // X.InterfaceC669630n
    public final /* synthetic */ java.util.Set Bts() {
        return new HashSet();
    }

    @Override // X.InterfaceC669530m
    public final boolean CUl() {
        if (this.A03 == C05F.A00) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC669530m
    public final void Cnx(boolean z) {
        C40741uh B6g = this.A0H.B6g();
        if (B6g != null) {
            C26191Pa c26191Pa = this.A0T;
            if (c26191Pa.A01()) {
                if (z) {
                    Integer num = C05F.A0C;
                    num.getClass();
                    B6g.A03 = num;
                }
                c26191Pa.A00(B6g);
            }
        }
    }

    @Override // X.InterfaceC669530m
    public final void CoN(int i) {
        if (this.A03 == C05F.A00) {
            AnonymousClass318 anonymousClass318 = this.A0G;
            anonymousClass318.A0X = "TAILLOAD";
            anonymousClass318.A0C = null;
            A07(i, true);
        }
    }

    @Override // X.InterfaceC669530m
    public void deactivate() {
        boolean z;
        C26191Pa c26191Pa = this.A0T;
        if (c26191Pa.A00 == this.A0Q) {
            c26191Pa.A00 = c26191Pa.A09;
            z = true;
        } else {
            z = false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.A0A;
        if (z && elapsedRealtime > TimeUnit.SECONDS.toMillis(30L)) {
            C0w9.A03("stories_ads_prefetch", AnonymousClass001.A0r("Detected stories session that awaited external request that hasn't completed. Fetcher was active for ", " millis.  Error message: ", A06(), elapsedRealtime));
        }
        C85773s6 c85773s6 = this.A0B;
        if (c85773s6 != null && !this.A0U) {
            C1ON c1on = c85773s6.A00;
            if (c1on != null) {
                c1on.cancel();
                this.A0B = null;
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        c26191Pa.A04 = false;
        c26191Pa.A06 = false;
        this.A06.set(false);
    }
}
