package X;

import com.instagram.api.schemas.IntentAwareAdsInfo;
import com.instagram.api.schemas.IntentAwareAdsInfoIntf;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6he, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C145816he {
    public InterfaceC101944i9 A00;
    public final InterfaceC11380iw A01;
    public final C18920wW A02;
    public final UserSession A03;
    public final C1M1 A04;

    public C145816he(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C1M1 c1m1) {
        C14360o3.A0B(userSession, 1);
        this.A03 = userSession;
        this.A04 = c1m1;
        this.A01 = interfaceC11380iw;
        C12210kP c12210kP = new C12210kP(userSession);
        c12210kP.A00 = interfaceC11380iw;
        this.A02 = c12210kP.A00();
    }

    public final void A02(EnumC71153Hb enumC71153Hb, Integer num, String str, String str2, String str3, String str4, int i, int i2, boolean z) {
        C14360o3.A0B(num, 3);
        C18920wW c18920wW = this.A02;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "instagram_ad_pivots_fetch_skip");
        if (A00.isSampled()) {
            A00.A9K("chaining_position", 0L);
            C1M1 c1m1 = this.A04;
            A00.AAP("chaining_session_id", c1m1.getSessionId());
            A00.AAP("client_session_id", c1m1.getSessionId());
            A00.AAP("contextual_ads_category", "");
            A00.AAP("container_module", "reel_feed_timeline");
            A00.AAP("trigger_type", enumC71153Hb.A00);
            A00.A9K("multi_ads_type_number", Long.valueOf(C5MB.A00(num)));
            A00.AAP("invalidation_reason", str3);
            A00.A9K("hscroll_seed_ad_id", AbstractC003100w.A0k(10, str));
            A00.A9K("hscroll_seed_ad_position", Long.valueOf(i));
            A00.A9K("num_ads_in_ad_pool", Long.valueOf(i2));
            A00.AAP("top_of_ad_pool_ad_id", str2);
            A00.A7v("is_seed_ad_multi_ads_eligible", Boolean.valueOf(z));
            A00.AAP("hscroll_seed_ad_tracking_token", str4);
            A00.Cht();
        }
    }

    public final void A03(C41551w4 c41551w4) {
        long j;
        String str;
        Long l;
        String str2;
        String str3;
        String str4;
        Long l2;
        Boolean bool;
        String str5;
        Integer num;
        String str6;
        Integer num2;
        C14360o3.A0B(c41551w4, 0);
        C18920wW c18920wW = this.A02;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "instagram_ad_pivots_dismiss");
        if (A00.isSampled()) {
            InterfaceC101944i9 interfaceC101944i9 = this.A00;
            if (interfaceC101944i9 != null) {
                j = interfaceC101944i9.CNR(c41551w4);
            } else {
                j = 0;
            }
            A00.A9K("chaining_position", Long.valueOf(j));
            C1M1 c1m1 = this.A04;
            A00.AAP("chaining_session_id", c1m1.getSessionId());
            A00.AAP("client_session_id", c1m1.getSessionId());
            A00.AAP("contextual_ads_category", "");
            A00.AAk("ad_ids", A00(c41551w4));
            A00.A9K("first_hscroll_item_ad_id", (Long) A00(c41551w4).get(0));
            Reel reel = c41551w4.A0H;
            IntentAwareAdsInfo intentAwareAdsInfo = reel.A0B;
            Long l3 = null;
            if (intentAwareAdsInfo != null) {
                str = intentAwareAdsInfo.A09;
            } else {
                str = null;
            }
            A00.AAP("trigger_type", str);
            A00.AAP("container_module", this.A01.getModuleName());
            IntentAwareAdsInfo intentAwareAdsInfo2 = reel.A0B;
            if (intentAwareAdsInfo2 != null && (num2 = intentAwareAdsInfo2.A02) != null) {
                l = Long.valueOf(num2.intValue());
            } else {
                l = null;
            }
            A00.A9K("multi_ads_type_number", l);
            IntentAwareAdsInfo intentAwareAdsInfo3 = reel.A0B;
            if (intentAwareAdsInfo3 != null) {
                str2 = intentAwareAdsInfo3.A06;
            } else {
                str2 = null;
            }
            A00.AAP("multi_ads_id", str2);
            IntentAwareAdsInfo intentAwareAdsInfo4 = reel.A0B;
            if (intentAwareAdsInfo4 != null) {
                str3 = intentAwareAdsInfo4.A06;
            } else {
                str3 = null;
            }
            A00.AAP("multi_ads_unit_id", str3);
            IntentAwareAdsInfo intentAwareAdsInfo5 = reel.A0B;
            if (intentAwareAdsInfo5 != null) {
                str4 = intentAwareAdsInfo5.A04;
            } else {
                str4 = null;
            }
            A00.AAP("insertion_mechanism", str4);
            IntentAwareAdsInfo intentAwareAdsInfo6 = reel.A0B;
            if (intentAwareAdsInfo6 != null && (str6 = intentAwareAdsInfo6.A07) != null) {
                l2 = AbstractC003100w.A0k(10, str6);
            } else {
                l2 = null;
            }
            A00.A9K("hscroll_seed_ad_id", l2);
            IntentAwareAdsInfo intentAwareAdsInfo7 = reel.A0B;
            if (intentAwareAdsInfo7 != null) {
                bool = intentAwareAdsInfo7.A01;
            } else {
                bool = null;
            }
            A00.A7v("is_seed_ad_multi_ads_eligible", bool);
            IntentAwareAdsInfo intentAwareAdsInfo8 = reel.A0B;
            if (intentAwareAdsInfo8 != null) {
                str5 = intentAwareAdsInfo8.A08;
            } else {
                str5 = null;
            }
            A00.AAP("hscroll_seed_ad_tracking_token", str5);
            IntentAwareAdsInfo intentAwareAdsInfo9 = reel.A0B;
            if (intentAwareAdsInfo9 != null && (num = intentAwareAdsInfo9.A03) != null) {
                l3 = Long.valueOf(num.intValue());
            }
            A00.A9K("hscroll_seed_ad_position", l3);
            A00.Cht();
        }
    }

    public final void A04(C41551w4 c41551w4, int i, int i2) {
        long j;
        Long l;
        String str;
        String str2;
        String str3;
        Long l2;
        Boolean bool;
        String str4;
        Integer num;
        String str5;
        Integer num2;
        C18920wW c18920wW = this.A02;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "instagram_ad_pivots_scroll");
        if (A00.isSampled()) {
            InterfaceC101944i9 interfaceC101944i9 = this.A00;
            if (interfaceC101944i9 != null) {
                j = interfaceC101944i9.CNR(c41551w4);
            } else {
                j = 0;
            }
            A00.A9K("chaining_position", Long.valueOf(j));
            C1M1 c1m1 = this.A04;
            A00.AAP("chaining_session_id", c1m1.getSessionId());
            A00.AAP("client_session_id", c1m1.getSessionId());
            A00.AAk("ad_ids", A00(c41551w4));
            A00.A9K("first_hscroll_item_ad_id", (Long) A00(c41551w4).get(0));
            A00.AAP("container_module", this.A01.getModuleName());
            Reel reel = c41551w4.A0H;
            IntentAwareAdsInfo intentAwareAdsInfo = reel.A0B;
            Long l3 = null;
            if (intentAwareAdsInfo != null && (num2 = intentAwareAdsInfo.A02) != null) {
                l = Long.valueOf(num2.intValue());
            } else {
                l = null;
            }
            A00.A9K("multi_ads_type_number", l);
            IntentAwareAdsInfo intentAwareAdsInfo2 = reel.A0B;
            if (intentAwareAdsInfo2 != null) {
                str = intentAwareAdsInfo2.A06;
            } else {
                str = null;
            }
            A00.AAP("multi_ads_id", str);
            IntentAwareAdsInfo intentAwareAdsInfo3 = reel.A0B;
            if (intentAwareAdsInfo3 != null) {
                str2 = intentAwareAdsInfo3.A06;
            } else {
                str2 = null;
            }
            A00.AAP("multi_ads_unit_id", str2);
            IntentAwareAdsInfo intentAwareAdsInfo4 = reel.A0B;
            if (intentAwareAdsInfo4 != null) {
                str3 = intentAwareAdsInfo4.A04;
            } else {
                str3 = null;
            }
            A00.AAP("insertion_mechanism", str3);
            A00.A9K("from_hscroll_position", Long.valueOf(i));
            A00.A9K("to_hscroll_position", Long.valueOf(i2));
            IntentAwareAdsInfo intentAwareAdsInfo5 = reel.A0B;
            if (intentAwareAdsInfo5 != null && (str5 = intentAwareAdsInfo5.A07) != null) {
                l2 = AbstractC003100w.A0k(10, str5);
            } else {
                l2 = null;
            }
            A00.A9K("hscroll_seed_ad_id", l2);
            IntentAwareAdsInfo intentAwareAdsInfo6 = reel.A0B;
            if (intentAwareAdsInfo6 != null) {
                bool = intentAwareAdsInfo6.A01;
            } else {
                bool = null;
            }
            A00.A7v("is_seed_ad_multi_ads_eligible", bool);
            A00.A7v("is_auto_scroll", false);
            IntentAwareAdsInfo intentAwareAdsInfo7 = reel.A0B;
            if (intentAwareAdsInfo7 != null) {
                str4 = intentAwareAdsInfo7.A08;
            } else {
                str4 = null;
            }
            A00.AAP("hscroll_seed_ad_tracking_token", str4);
            IntentAwareAdsInfo intentAwareAdsInfo8 = reel.A0B;
            if (intentAwareAdsInfo8 != null && (num = intentAwareAdsInfo8.A03) != null) {
                l3 = Long.valueOf(num.intValue());
            }
            A00.A9K("hscroll_seed_ad_position", l3);
            A00.Cht();
        }
    }

    public static final List A00(C41551w4 c41551w4) {
        C40971v4 c40971v4;
        String str;
        List A0J = c41551w4.A0H.A0J();
        C14360o3.A07(A0J);
        if (AbstractC130925vf.A0n(c41551w4)) {
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(A0J, 10));
            Iterator it = A0J.iterator();
            while (it.hasNext()) {
                arrayList.add(Long.valueOf(Long.parseLong(((C40971v4) it.next()).A0S)));
            }
            return arrayList;
        }
        Long l = null;
        if ((!A0J.isEmpty()) && (c40971v4 = (C40971v4) AbstractC001800i.A0J(A0J)) != null && (str = c40971v4.A0S) != null) {
            l = AbstractC003100w.A0k(10, str);
        }
        return AbstractC16960so.A1O(l);
    }

    public static final void A01(IntentAwareAdsInfoIntf intentAwareAdsInfoIntf, EnumC71153Hb enumC71153Hb, C145816he c145816he, Integer num, String str, String str2, List list) {
        String str3;
        Long l;
        Long l2;
        Long l3;
        String str4;
        String str5;
        String str6;
        Integer BVJ;
        C18920wW c18920wW = c145816he.A02;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "instagram_ad_pivots_delivery");
        if (A00.isSampled()) {
            A00.A9K("chaining_position", 0L);
            C1M1 c1m1 = c145816he.A04;
            A00.AAP("chaining_session_id", c1m1.getSessionId());
            A00.AAP("client_session_id", c1m1.getSessionId());
            A00.AAP("contextual_ads_category", "");
            A00.AAP("container_module", "reel_feed_timeline");
            Boolean bool = null;
            if (enumC71153Hb != null) {
                str3 = enumC71153Hb.A00;
            } else {
                str3 = null;
            }
            A00.AAP("trigger_type", str3);
            if (intentAwareAdsInfoIntf != null && (BVJ = intentAwareAdsInfoIntf.BVJ()) != null) {
                l = Long.valueOf(BVJ.intValue());
            } else {
                l = null;
            }
            A00.A9K("multi_ads_type_number", l);
            if (str != null) {
                l2 = AbstractC003100w.A0k(10, str);
            } else {
                l2 = null;
            }
            A00.A9K("hscroll_seed_ad_id", l2);
            if (num != null) {
                l3 = Long.valueOf(num.intValue());
            } else {
                l3 = null;
            }
            A00.A9K("hscroll_seed_ad_position", l3);
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(A00((C41551w4) it.next()));
            }
            A00.AAk("ad_ids", AbstractC001800i.A0W(AbstractC06950Ym.A1F(arrayList)));
            if (intentAwareAdsInfoIntf != null) {
                str4 = intentAwareAdsInfoIntf.BVL();
            } else {
                str4 = null;
            }
            A00.AAP("multi_ads_id", str4);
            if (intentAwareAdsInfoIntf != null) {
                str5 = intentAwareAdsInfoIntf.BVL();
            } else {
                str5 = null;
            }
            A00.AAP("multi_ads_unit_id", str5);
            if (intentAwareAdsInfoIntf != null) {
                str6 = intentAwareAdsInfoIntf.BIG();
            } else {
                str6 = null;
            }
            A00.AAP("insertion_mechanism", str6);
            if (intentAwareAdsInfoIntf != null) {
                bool = intentAwareAdsInfoIntf.CcZ();
            }
            A00.A7v("is_seed_ad_multi_ads_eligible", bool);
            A00.AAP("hscroll_seed_ad_tracking_token", str2);
            A00.Cht();
        }
    }
}
