package X;

import com.instagram.api.schemas.IntentAwareAdsInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.6YT, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6YT implements C32O {
    public final C145816he A00;
    public final C1PY A01;
    public final HashSet A02;

    public C6YT(C145816he c145816he, C1PY c1py) {
        C14360o3.A0B(c1py, 2);
        this.A00 = c145816he;
        this.A01 = c1py;
        this.A02 = new HashSet();
    }

    @Override // X.C32O
    public final void D3D() {
    }

    @Override // X.C32O
    public final void DyU(Collection collection, int i) {
        String str;
        C14360o3.A0B(collection, 0);
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C41551w4 c41551w4 = (C41551w4) it.next();
            AbstractC130925vf.A0n(c41551w4);
            IntentAwareAdsInfo intentAwareAdsInfo = c41551w4.A0H.A0B;
            C0eB c0eB = null;
            if (intentAwareAdsInfo != null && (str = intentAwareAdsInfo.A06) != null) {
                Integer num = intentAwareAdsInfo.A02;
                if (num != null && num.intValue() == 12) {
                    HashSet hashSet = this.A02;
                    if (!hashSet.contains(str)) {
                        C145816he c145816he = this.A00;
                        List singletonList = Collections.singletonList(c41551w4);
                        C14360o3.A07(singletonList);
                        C145816he.A01(intentAwareAdsInfo, null, c145816he, null, null, null, singletonList);
                        hashSet.add(str);
                    }
                }
                c0eB = C0eB.A00;
            }
            arrayList.add(c0eB);
        }
    }

    @Override // X.C32O
    public final /* bridge */ /* synthetic */ void D7b(Object obj, List list, int i) {
        Long l;
        Long l2;
        Long l3;
        C41551w4 c41551w4 = (C41551w4) obj;
        C14360o3.A0B(c41551w4, 0);
        C14360o3.A0B(list, 2);
        IntentAwareAdsInfo intentAwareAdsInfo = c41551w4.A0H.A0B;
        if (intentAwareAdsInfo != null) {
            C145816he c145816he = this.A00;
            C1PY c1py = this.A01;
            C18920wW c18920wW = c145816he.A02;
            InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "instagram_ad_pivots_insertion_success");
            if (A00.isSampled()) {
                A00.A9K("chaining_position", Long.valueOf(i));
                C1M1 c1m1 = c145816he.A04;
                A00.AAP("chaining_session_id", c1m1.getSessionId());
                A00.AAP("client_session_id", c1m1.getSessionId());
                A00.AAP("contextual_ads_category", "");
                A00.AAP("container_module", "reel_feed_timeline");
                A00.AAP("trigger_type", intentAwareAdsInfo.CB4());
                String str = null;
                if (intentAwareAdsInfo.BVJ() != null) {
                    l = Long.valueOf(r0.intValue());
                } else {
                    l = null;
                }
                A00.A9K("multi_ads_type_number", l);
                A00.AAP("insertion_mechanism", intentAwareAdsInfo.BIG());
                String Brx = intentAwareAdsInfo.Brx();
                if (Brx != null) {
                    l2 = AbstractC003100w.A0k(10, Brx);
                } else {
                    l2 = null;
                }
                A00.A9K("hscroll_seed_ad_id", l2);
                if (intentAwareAdsInfo.Bry() != null) {
                    l3 = Long.valueOf(r0.intValue());
                } else {
                    l3 = null;
                }
                A00.A9K("hscroll_seed_ad_position", l3);
                A00.AAk("ad_ids", C145816he.A00(c41551w4));
                String BVL = intentAwareAdsInfo.BVL();
                A00.AAP("multi_ads_id", BVL);
                A00.AAP("multi_ads_unit_id", BVL);
                LinkedList linkedList = c1py.A02;
                A00.A9K("num_ads_in_ad_pool", Long.valueOf(linkedList.size()));
                if (!linkedList.isEmpty()) {
                    List A0J = ((C41551w4) c1py.A00().BUM()).A0H.A0J();
                    C14360o3.A07(A0J);
                    C40971v4 c40971v4 = (C40971v4) AbstractC001800i.A0J(A0J);
                    if (c40971v4 != null) {
                        str = c40971v4.A0S;
                    }
                }
                A00.AAP("top_of_ad_pool_ad_id", str);
                A00.A7v("is_seed_ad_multi_ads_eligible", intentAwareAdsInfo.CcZ());
                A00.AAP("hscroll_seed_ad_tracking_token", intentAwareAdsInfo.Brz());
                A00.Cht();
            }
        }
        if (list.contains("end_of_stories_did_meet") && !list.contains("highest_position_rule_did_meet") && !list.contains("highest_position_rule_and_consumed_media_gap_did_meet")) {
            C145816he c145816he2 = this.A00;
            C18920wW c18920wW2 = c145816he2.A02;
            InterfaceC02590Ai A002 = c18920wW2.A00(c18920wW2.A00, "instagram_ad_pivots_end_of_stories_insertion");
            if (A002.isSampled()) {
                A002.A9K("chaining_position", 0L);
                C1M1 c1m12 = c145816he2.A04;
                A002.AAP("chaining_session_id", c1m12.getSessionId());
                A002.AAP("client_session_id", c1m12.getSessionId());
                A002.AAP("contextual_ads_category", "");
                A002.AAP("container_module", c145816he2.A01.getModuleName());
                A002.AAk("ad_ids", C145816he.A00(c41551w4));
                A002.Cht();
            }
        }
    }
}
