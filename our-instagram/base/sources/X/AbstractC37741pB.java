package X;

import com.instagram.api.schemas.CarouselRenderingType;
import com.instagram.api.schemas.IntentAwareAdsInfo;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.ReelType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.1pB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC37741pB {
    public static final C37771pE A00;

    static {
        new C1DY((C1DV) new C37761pD(null), 6, false);
        A00 = new C37771pE(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public static final C37771pE A00(UserSession userSession, C37771pE c37771pE) {
        CarouselRenderingType carouselRenderingType;
        int i;
        Integer num;
        C14360o3.A0B(c37771pE, 0);
        C14360o3.A0B(userSession, 1);
        if (c37771pE.A1k == null || !(!r0.isEmpty())) {
            LinkedList linkedList = new LinkedList();
            List<C37771pE> list = c37771pE.A1j;
            LinkedList linkedList2 = null;
            if (list != null) {
                for (C37771pE c37771pE2 : list) {
                    List list2 = c37771pE2.A1k;
                    if (list2 != null) {
                        linkedList.add(AbstractC001800i.A0I(list2));
                        if (list2.size() > 1 && (carouselRenderingType = c37771pE2.A01) != CarouselRenderingType.A06 && carouselRenderingType != CarouselRenderingType.A04 && !C18U.A06(C06090Tz.A06, userSession, 36317792484267593L)) {
                            C0f5 AEp = C18950wb.A00.AEp("multiple items received in Multi Advertiser Carousel reel", 817901200);
                            AEp.ABU("numItems", list2.size());
                            IntentAwareAdsInfo intentAwareAdsInfo = c37771pE.A06;
                            if (intentAwareAdsInfo != null && (num = intentAwareAdsInfo.A02) != null) {
                                i = num.intValue();
                            } else {
                                i = -1;
                            }
                            AEp.ABU("multiAdsType", i);
                            AEp.report();
                            return null;
                        }
                    }
                }
            }
            if (!linkedList.isEmpty()) {
                linkedList2 = linkedList;
            }
            if (list != null) {
                C73303Qg c73303Qg = new C73303Qg(c37771pE);
                c73303Qg.A1j = linkedList2;
                return c73303Qg.A00();
            }
        }
        return c37771pE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        if (r1 != null) goto L14;
     */
    /* JADX WARN: Type inference failed for: r0v18, types: [X.6ZI, X.1NB, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C1NB A01(com.instagram.common.session.UserSession r3, X.C37771pE r4) {
        /*
            r0 = 0
            X.C14360o3.A0B(r4, r0)
            r0 = 1
            X.C14360o3.A0B(r3, r0)
            X.1qb r1 = r4.A0A
            if (r1 == 0) goto L14
            X.6ZI r0 = new X.6ZI
            r0.<init>()
            r0.A00 = r1
            return r0
        L14:
            com.instagram.user.model.User r1 = r4.A0a
            if (r1 != 0) goto L2b
            java.lang.Integer r1 = A02(r4)
            java.lang.Integer r0 = X.C05F.A01
            r2 = 0
            if (r1 != r0) goto L31
            X.1qM r0 = r4.A0H
            if (r0 == 0) goto L9c
            com.instagram.user.model.User r1 = r0.A2E(r3)
            if (r1 == 0) goto L9c
        L2b:
            X.1N9 r0 = new X.1N9
            r0.<init>(r1)
            return r0
        L31:
            java.lang.Integer r1 = A02(r4)
            java.lang.Integer r0 = X.C05F.A00
            if (r1 == r0) goto L9c
            java.lang.Integer r1 = A02(r4)
            java.lang.Integer r0 = X.C05F.A0C
            if (r1 == r0) goto L9c
            java.lang.Integer r1 = A02(r4)
            java.lang.Integer r0 = X.C05F.A0N
            if (r1 == r0) goto L9c
            java.lang.Integer r1 = A02(r4)
            java.lang.Integer r0 = X.C05F.A0Y
            if (r1 == r0) goto L9c
            java.lang.Integer r1 = A02(r4)
            java.lang.Integer r0 = X.C05F.A0j
            if (r1 == r0) goto L9c
            java.lang.Integer r1 = A02(r4)
            java.lang.Integer r0 = X.C05F.A0u
            if (r1 == r0) goto L9c
            java.lang.Integer r1 = A02(r4)
            java.lang.Integer r0 = X.C05F.A15
            if (r1 == r0) goto L9c
            java.lang.Integer r1 = A02(r4)
            java.lang.Integer r0 = X.C05F.A1F
            if (r1 == r0) goto L9c
            java.lang.Integer r1 = A02(r4)
            java.lang.Integer r0 = X.C05F.A1I
            if (r1 == r0) goto L9c
            java.lang.Integer r1 = A02(r4)
            java.lang.Integer r0 = X.C05F.A02
            if (r1 == r0) goto L9c
            java.lang.Integer r1 = A02(r4)
            java.lang.Integer r0 = X.C05F.A03
            if (r1 == r0) goto L9c
            java.lang.Integer r1 = A02(r4)
            java.lang.Integer r0 = X.C05F.A04
            if (r1 == r0) goto L9c
            java.lang.Integer r1 = A02(r4)
            java.lang.Integer r0 = X.C05F.A05
            if (r1 == r0) goto L9c
            A02(r4)
        L9c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC37741pB.A01(com.instagram.common.session.UserSession, X.1pE):X.1NB");
    }

    public static final String A03(UserSession userSession, C37771pE c37771pE) {
        Object obj;
        C14360o3.A0B(userSession, 1);
        StringBuilder sb = new StringBuilder();
        String str = c37771pE.A1V;
        if (str == null) {
            str = "";
        }
        sb.append(str);
        sb.append(' ');
        sb.append(A01(userSession, c37771pE));
        sb.append(' ');
        List list = c37771pE.A1k;
        if (list != null) {
            obj = Integer.valueOf(list.size());
        } else {
            obj = "EMPTY";
        }
        sb.append(obj);
        return sb.toString();
    }

    public static final List A05(C37771pE c37771pE) {
        C38321qM c38321qM;
        C14360o3.A0B(c37771pE, 0);
        ReelType reelType = c37771pE.A0N;
        if (reelType != ReelType.A06 && reelType != ReelType.A0U) {
            List list = c37771pE.A1k;
            if (list == null) {
                if (A02(c37771pE) == C05F.A01 && (c38321qM = c37771pE.A0H) != null) {
                    List singletonList = Collections.singletonList(c38321qM);
                    C14360o3.A07(singletonList);
                    return singletonList;
                }
                return C16930sl.A00;
            }
            return list;
        }
        ArrayList arrayList = new ArrayList();
        List list2 = c37771pE.A1k;
        if (list2 == null) {
            return arrayList;
        }
        int i = 0;
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC16960so.A1U();
                throw C00O.createAndThrow();
            }
            if (!A06(c37771pE).contains(Integer.valueOf(i))) {
                arrayList.add(obj);
            }
            i = i2;
        }
        return arrayList;
    }

    public static final boolean A07(UserSession userSession, C37771pE c37771pE) {
        Integer num;
        C14360o3.A0B(c37771pE, 0);
        C14360o3.A0B(userSession, 1);
        C1NB A01 = A01(userSession, c37771pE);
        if (A01 != null) {
            num = A01.CBs();
        } else {
            num = null;
        }
        if (num != C05F.A04) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        if (r0.getId() != null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A08(com.instagram.common.session.UserSession r4, X.C37771pE r5) {
        /*
            r0 = 1
            X.C14360o3.A0B(r4, r0)
            java.lang.String r0 = r5.A1V
            r3 = 1
            if (r0 == 0) goto L26
            X.1NB r0 = A01(r4, r5)
            if (r0 == 0) goto L24
            java.lang.Integer r1 = r0.CBs()
        L13:
            java.lang.Integer r0 = X.C05F.A01
            if (r1 != r0) goto L26
            X.1NB r0 = A01(r4, r5)
            if (r0 == 0) goto L26
            java.lang.String r0 = r0.getId()
            if (r0 == 0) goto L26
        L23:
            return r3
        L24:
            r1 = 0
            goto L13
        L26:
            X.1qi r0 = r5.A0J
            if (r0 == 0) goto L38
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36318080246421381(0x81071a00031785, double:3.031038416783345E-306)
            boolean r0 = X.C18U.A06(r2, r4, r0)
            if (r0 == 0) goto L38
            return r3
        L38:
            boolean r0 = A07(r4, r5)
            if (r0 != 0) goto L23
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC37741pB.A08(com.instagram.common.session.UserSession, X.1pE):boolean");
    }

    public static final Integer A02(C37771pE c37771pE) {
        String str = c37771pE.A1X;
        if (str != null) {
            Integer num = C05F.A00;
            if (!str.equals("ads_bakeoff_survey_in_story")) {
                Integer num2 = C05F.A01;
                if (!str.equals("ad4ad_in_story")) {
                    Integer num3 = C05F.A0C;
                    if (!str.equals("suggested_users_in_story")) {
                        Integer num4 = C05F.A0N;
                        if (!str.equals("story_survey")) {
                            Integer num5 = C05F.A0Y;
                            if (!str.equals("story_creation_upsell")) {
                                Integer num6 = C05F.A0j;
                                if (!str.equals("suggested_clips_story_netego")) {
                                    Integer num7 = C05F.A0u;
                                    if (!str.equals("reconsideration_products_for_you_in_story")) {
                                        Integer num8 = C05F.A15;
                                        if (!str.equals("continue_shopping_in_story")) {
                                            Integer num9 = C05F.A1F;
                                            if (!str.equals("visit_these_shops_again_in_story")) {
                                                Integer num10 = C05F.A1I;
                                                if (!str.equals("ig_ads_consent_growth_story_netego")) {
                                                    Integer num11 = C05F.A03;
                                                    if (!str.equals("trending_prompts_in_story")) {
                                                        Integer num12 = C05F.A04;
                                                        if (!str.equals("ig_insights_story_netego")) {
                                                            Integer num13 = C05F.A05;
                                                            if (!str.equals("share_comment_to_story_netego")) {
                                                                Integer num14 = C05F.A06;
                                                                if (!str.equals("meta_gallery_stories_netego")) {
                                                                    Integer num15 = C05F.A07;
                                                                    if (!str.equals("threads_in_stories_unit_acquisition")) {
                                                                        if (AbstractC001900j.A0a(str, "bloks", false)) {
                                                                            return C05F.A02;
                                                                        }
                                                                        throw new UnsupportedOperationException(AnonymousClass001.A0R("Unsupported story netego type: ", str));
                                                                    }
                                                                    return num15;
                                                                }
                                                                return num14;
                                                            }
                                                            return num13;
                                                        }
                                                        return num12;
                                                    }
                                                    return num11;
                                                }
                                                return num10;
                                            }
                                            return num9;
                                        }
                                        return num8;
                                    }
                                    return num7;
                                }
                                return num6;
                            }
                            return num5;
                        }
                        return num4;
                    }
                    return num3;
                }
                return num2;
            }
            return num;
        }
        return null;
    }

    public static final List A04(C37771pE c37771pE) {
        if (c37771pE.A0N == ReelType.A04) {
            List A05 = A05(c37771pE);
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(A05, 10));
            Iterator it = A05.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC40881uv.A00((C38321qM) it.next()));
            }
            return arrayList;
        }
        return null;
    }

    public static final java.util.Set A06(C37771pE c37771pE) {
        if (c37771pE.A0N == ReelType.A06) {
            HashSet hashSet = new HashSet();
            List list = c37771pE.A1k;
            if (list != null) {
                int i = 0;
                for (Object obj : list) {
                    int i2 = i + 1;
                    if (i < 0) {
                        AbstractC16960so.A1U();
                        throw C00O.createAndThrow();
                    }
                    Boolean CCK = ((C38321qM) obj).A0C.CCK();
                    if (CCK != null && CCK.booleanValue()) {
                        hashSet.add(Integer.valueOf(i));
                    }
                    i = i2;
                }
                return hashSet;
            }
            return hashSet;
        }
        return C16910sj.A00;
    }
}
