package X;

import android.content.Context;
import com.facebook.common.dextricks.JITProfilePQR;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.discovery.chaining.model.DiscoveryChainingItem;
import com.instagram.explore.topiccluster.ExploreTopicCluster;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.IqG, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42413IqG implements InterfaceC43448JHm {
    public String A00;
    public java.util.Set A01 = null;
    public final Context A02;
    public final UserSession A03;
    public final DiscoveryChainingItem A04;
    public final InterfaceC60442pS A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final ExploreTopicCluster A09;
    public final InterfaceC61432r6 A0A;

    public static void A00(C06090Tz c06090Tz, AbstractC23721Ec abstractC23721Ec, AbstractC23721Ec abstractC23721Ec2, UserSession userSession) {
        if (C18U.A06(c06090Tz, userSession, 36313712264480976L)) {
            boolean z = AnonymousClass280.A01.A06(userSession).getBoolean("HAS_USER_EVER_SET_BREAKS", false);
            abstractC23721Ec.A0I("has_user_set_breaks", z);
            abstractC23721Ec2.A0I("has_user_set_breaks", z);
            int A0A = (int) AbstractC23021Ah.A00(userSession).A0A();
            abstractC23721Ec.A0D("take_a_break_nudge_last_seen_time", A0A);
            abstractC23721Ec2.A0D("take_a_break_nudge_last_seen_time", A0A);
            int A0O = (int) C455127l.A03(userSession).A0O();
            abstractC23721Ec.A0D("session_time_spent", A0O);
            abstractC23721Ec2.A0D("session_time_spent", A0O);
        }
    }

    static {
        TimeUnit.HOURS.toMillis(4L);
    }

    public static void A02(AbstractC23721Ec abstractC23721Ec, AbstractC23721Ec abstractC23721Ec2, C42413IqG c42413IqG, DiscoveryChainingItem discoveryChainingItem) {
        String str = discoveryChainingItem.A0H;
        abstractC23721Ec.A9s("post_trigger_eligibility_flags", str);
        abstractC23721Ec2.A9s("post_trigger_eligibility_flags", str);
        String str2 = discoveryChainingItem.A0G;
        abstractC23721Ec.A9s("organic_seed_ad_media_id", str2);
        abstractC23721Ec2.A9s("organic_seed_ad_media_id", str2);
        String str3 = discoveryChainingItem.A0F;
        abstractC23721Ec.A9s("organic_seed_ad_author_id", str3);
        abstractC23721Ec2.A9s("organic_seed_ad_author_id", str3);
        String str4 = discoveryChainingItem.A0C;
        abstractC23721Ec.A0H("interest_id", str4);
        abstractC23721Ec2.A0H("interest_id", str4);
        String str5 = c42413IqG.A08;
        abstractC23721Ec.A9s("surface", str5);
        abstractC23721Ec2.A9s("surface", str5);
        String str6 = c42413IqG.A06;
        abstractC23721Ec.A9s("chaining_session_id", str6);
        abstractC23721Ec2.A9s("chaining_session_id", str6);
        String str7 = c42413IqG.A07;
        abstractC23721Ec.A9s(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str7);
        abstractC23721Ec2.A9s(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str7);
        String str8 = c42413IqG.A00;
        abstractC23721Ec.A9s("chain_pagination_token", str8);
        abstractC23721Ec2.A9s("chain_pagination_token", str8);
    }

    @Override // X.InterfaceC43448JHm
    public final C25621Ms Bo1(InterfaceC65262xO interfaceC65262xO) {
        InterfaceC61432r6 interfaceC61432r6 = this.A0A;
        DiscoveryChainingItem discoveryChainingItem = this.A04;
        EnumC39592He2 enumC39592He2 = discoveryChainingItem.A01;
        String str = enumC39592He2.A01;
        Map AUS = interfaceC61432r6.AUS(str);
        this.A01 = AbstractC85703rz.A01(AUS);
        Context context = this.A02;
        UserSession userSession = this.A03;
        boolean A1V = AbstractC167007dF.A1V(userSession);
        C25621Ms A0q = AbstractC25228BEl.A0q(userSession);
        A0q.A0P(null, HB5.class, IQK.class, false);
        A0q.A9s("trigger", "tap");
        C23711Eb c23711Eb = new C23711Eb(userSession, 1056774691, A1V ? 1 : 0, false);
        c23711Eb.A01 = AbstractC37303Gc4.A0B(userSession, IQK.class, A1V, false);
        c23711Eb.A9s("trigger", "tap");
        AbstractC37301Gc2.A0t(context, A0q, userSession);
        AbstractC40600HzK.A00(A0q, interfaceC65262xO);
        Integer num = enumC39592He2.A00;
        A0q.A09(num);
        A0q.A0B(str);
        c23711Eb.A09(num);
        A01(c23711Eb, A0q, userSession, discoveryChainingItem, str);
        A02(A0q, c23711Eb, this, discoveryChainingItem);
        Map A00 = AbstractC85703rz.A00(AUS);
        if (!A00.isEmpty()) {
            Iterator A15 = AbstractC166997dE.A15(A00);
            while (A15.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(A15);
                String A17 = AbstractC31172DnG.A17(A1K);
                String str2 = (String) A1K.getValue();
                A0q.A9s(A17, str2);
                c23711Eb.A9s(A17, str2);
            }
            A0q.A9s("join_id", AbstractC37302Gc3.A0f(A00));
            c23711Eb.A9s("join_id", AbstractC37302Gc3.A0f(A00));
        }
        FBx(EnumC74603Ws.A06, false);
        ExploreTopicCluster exploreTopicCluster = this.A09;
        if (exploreTopicCluster != null) {
            String str3 = exploreTopicCluster.A06;
            A0q.A9s("topic_cluster_id", str3);
            c23711Eb.A9s("topic_cluster_id", str3);
        }
        C06090Tz c06090Tz = C06090Tz.A05;
        A00(c06090Tz, A0q, c23711Eb, userSession);
        if (C18U.A06(c06090Tz, userSession, 36314901970488226L)) {
            AbstractC40597HzH.A00(A0q, c23711Eb, AbstractC86593tX.A0I(userSession, C05F.A00));
        }
        if (C18U.A06(c06090Tz, userSession, 36322735991040450L)) {
            InterfaceC19630xq A0x = AbstractC166987dD.A0x(userSession);
            String A002 = AbstractC111324zv.A00(1072);
            int A03 = (int) AbstractC31175DnJ.A03(A0x, A002);
            A0q.A0D(A002, A03);
            c23711Eb.A0D(A002, A03);
        }
        return A0q;
    }

    @Override // X.InterfaceC43448JHm
    public final C23711Eb C2d(InterfaceC65262xO interfaceC65262xO) {
        InterfaceC61432r6 interfaceC61432r6 = this.A0A;
        DiscoveryChainingItem discoveryChainingItem = this.A04;
        EnumC39592He2 enumC39592He2 = discoveryChainingItem.A01;
        String str = enumC39592He2.A01;
        Map AUS = interfaceC61432r6.AUS(str);
        this.A01 = AbstractC85703rz.A01(AUS);
        Context context = this.A02;
        UserSession userSession = this.A03;
        boolean A1V = AbstractC167007dF.A1V(userSession);
        C25621Ms A0q = AbstractC25228BEl.A0q(userSession);
        A0q.A0P(null, HB5.class, IQK.class, false);
        A0q.A9s("trigger", "tap");
        C23711Eb c23711Eb = new C23711Eb(userSession, 1056774691, A1V ? 1 : 0, false);
        c23711Eb.A01 = AbstractC37303Gc4.A0B(userSession, IQK.class, A1V, false);
        c23711Eb.A9s("trigger", "tap");
        AbstractC37301Gc2.A0t(context, A0q, userSession);
        AbstractC40600HzK.A00(A0q, interfaceC65262xO);
        Integer num = enumC39592He2.A00;
        A0q.A09(num);
        A0q.A0B(str);
        c23711Eb.A09(num);
        A01(c23711Eb, A0q, userSession, discoveryChainingItem, str);
        A02(A0q, c23711Eb, this, discoveryChainingItem);
        Map A00 = AbstractC85703rz.A00(AUS);
        if (!A00.isEmpty()) {
            Iterator A15 = AbstractC166997dE.A15(A00);
            while (A15.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(A15);
                String A17 = AbstractC31172DnG.A17(A1K);
                String str2 = (String) A1K.getValue();
                A0q.A9s(A17, str2);
                c23711Eb.A9s(A17, str2);
            }
            A0q.A9s("join_id", AbstractC37302Gc3.A0f(A00));
            c23711Eb.A9s("join_id", AbstractC37302Gc3.A0f(A00));
        }
        FBx(EnumC74603Ws.A06, false);
        ExploreTopicCluster exploreTopicCluster = this.A09;
        if (exploreTopicCluster != null) {
            String str3 = exploreTopicCluster.A06;
            A0q.A9s("topic_cluster_id", str3);
            c23711Eb.A9s("topic_cluster_id", str3);
        }
        C06090Tz c06090Tz = C06090Tz.A05;
        A00(c06090Tz, A0q, c23711Eb, userSession);
        if (C18U.A06(c06090Tz, userSession, 36314901970488226L)) {
            AbstractC40597HzH.A00(A0q, c23711Eb, AbstractC86593tX.A0I(userSession, C05F.A00));
        }
        if (C18U.A06(c06090Tz, userSession, 36322735991040450L)) {
            InterfaceC19630xq A0x = AbstractC166987dD.A0x(userSession);
            String A002 = AbstractC111324zv.A00(1072);
            int A03 = (int) AbstractC31175DnJ.A03(A0x, A002);
            A0q.A0D(A002, A03);
            c23711Eb.A0D(A002, A03);
        }
        AbstractC37301Gc2.A0t(context, c23711Eb, userSession);
        AbstractC40600HzK.A00(c23711Eb, interfaceC65262xO);
        return c23711Eb;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x003d. Please report as an issue. */
    @Override // X.InterfaceC43448JHm
    public final /* bridge */ /* synthetic */ IKC E3W(InterfaceC40821up interfaceC40821up, int i) {
        String str;
        InterfaceC38381qS A0E;
        InterfaceC38381qS interfaceC38381qS;
        InterfaceC38381qS interfaceC38381qS2;
        int i2;
        String str2;
        HB5 hb5 = (HB5) interfaceC40821up;
        ArrayList A1E = AbstractC166987dD.A1E();
        ArrayList A1E2 = AbstractC166987dD.A1E();
        ArrayList A1E3 = AbstractC166987dD.A1E();
        C18950wb c18950wb = C18950wb.A01;
        ArrayList A1E4 = AbstractC166987dD.A1E();
        List list = hb5.A05;
        if (list == null) {
            AbstractC166987dD.A1T(c18950wb, "Received null FeedItem list from MediaFeedResponse payload on IG Explore Chain", 817903268);
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C3XG A0D = AbstractC37300Gc1.A0D(it);
                C14360o3.A0B(A0D, 0);
                A1E4.add(C3XH.A00(A0D, false, true));
            }
        }
        A1E4.removeAll(Collections.singleton(null));
        for (int i3 = 0; i3 < A1E4.size(); i3++) {
            int i4 = i + i3;
            C3XG c3xg = (C3XG) A1E4.get(i3);
            switch (c3xg.A06.ordinal()) {
                case 0:
                case 1:
                    if (c3xg.A06 == C1XV.A04) {
                        A0E = c3xg.A05;
                        C14360o3.A0C(A0E, AbstractC111324zv.A00(129));
                    } else {
                        A0E = AbstractC37300Gc1.A0E(c3xg);
                    }
                    A1E.add(A0E);
                    C38321qM A0E2 = AbstractC37300Gc1.A0E(c3xg);
                    A0E2.getClass();
                    if (A0E2.A55()) {
                        A1E2.add(A0E2);
                        A1E3.addAll(C3ZG.A00(this.A02, this.A05, this.A03, c3xg, i4));
                        break;
                    } else {
                        break;
                    }
                case 3:
                case 5:
                case 11:
                    interfaceC38381qS2 = c3xg.A05;
                    i2 = 2783;
                    str2 = AbstractC111324zv.A00(i2);
                    C14360o3.A0C(interfaceC38381qS2, str2);
                    A1E.add(interfaceC38381qS2);
                    A1E3.addAll(C3ZG.A00(this.A02, this.A05, this.A03, c3xg, i4));
                    break;
                case 33:
                    interfaceC38381qS = c3xg.A05;
                    C14360o3.A0C(interfaceC38381qS, AbstractC111324zv.A00(37));
                    A1E.add(interfaceC38381qS);
                    break;
                case 38:
                    interfaceC38381qS2 = c3xg.A05;
                    i2 = 4984;
                    str2 = AbstractC111324zv.A00(i2);
                    C14360o3.A0C(interfaceC38381qS2, str2);
                    A1E.add(interfaceC38381qS2);
                    A1E3.addAll(C3ZG.A00(this.A02, this.A05, this.A03, c3xg, i4));
                    break;
                case 44:
                case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                case 47:
                    interfaceC38381qS = c3xg.A00;
                    A1E.add(interfaceC38381qS);
                    break;
                case 57:
                    interfaceC38381qS2 = c3xg.A05;
                    str2 = "null cannot be cast to non-null type com.instagram.feed.tifu.model.TifuNetegoItem";
                    C14360o3.A0C(interfaceC38381qS2, str2);
                    A1E.add(interfaceC38381qS2);
                    A1E3.addAll(C3ZG.A00(this.A02, this.A05, this.A03, c3xg, i4));
                    break;
            }
        }
        String str3 = hb5.A01;
        if (str3 != null && (str = this.A04.A08) != null) {
            this.A00 = str3;
            AbstractC40601HzL.A00(this.A03).A00.put(str, str3);
        }
        Map emptyMap = Collections.emptyMap();
        C14360o3.A07(emptyMap);
        boolean z = hb5.A07;
        String str4 = hb5.A02;
        List list2 = hb5.A04;
        if (list2 != null && !list2.isEmpty()) {
            hb5.A00 = new C84543q2(AbstractC31176DnK.A01(((C40951IBy) list2.get(0)).A00, 0), AbstractC31176DnK.A01(((C40951IBy) list2.get(1)).A00, 1), AbstractC31176DnK.A01(((C40951IBy) list2.get(0)).A00, 1));
        }
        return new IKC(hb5.A00, str3, str4, A1E, A1E3, A1E2, emptyMap, z);
    }

    @Override // X.InterfaceC43448JHm
    public final void FBx(EnumC74603Ws enumC74603Ws, boolean z) {
        java.util.Set set = this.A01;
        if (set != null) {
            this.A0A.FCF(enumC74603Ws, set);
            if (z) {
                this.A01 = null;
            }
        }
    }

    public C42413IqG(Context context, UserSession userSession, DiscoveryChainingItem discoveryChainingItem, ExploreTopicCluster exploreTopicCluster, InterfaceC60442pS interfaceC60442pS, InterfaceC61432r6 interfaceC61432r6, String str, String str2, String str3) {
        this.A02 = context;
        this.A03 = userSession;
        this.A04 = discoveryChainingItem;
        this.A09 = exploreTopicCluster;
        this.A05 = interfaceC60442pS;
        this.A06 = str;
        this.A07 = str2;
        this.A08 = str3;
        this.A00 = discoveryChainingItem.A09;
        this.A0A = interfaceC61432r6;
    }

    public static void A01(AbstractC23721Ec abstractC23721Ec, AbstractC23721Ec abstractC23721Ec2, UserSession userSession, DiscoveryChainingItem discoveryChainingItem, String str) {
        abstractC23721Ec.A0B(str);
        String str2 = discoveryChainingItem.A0E;
        abstractC23721Ec2.A9s("media_id", str2);
        abstractC23721Ec.A9s("media_id", str2);
        String valueOf = String.valueOf(discoveryChainingItem.A00);
        abstractC23721Ec2.A9s("media_type", valueOf);
        abstractC23721Ec.A9s("media_type", valueOf);
        String str3 = discoveryChainingItem.A0D;
        abstractC23721Ec2.A9s("author_id", str3);
        abstractC23721Ec.A9s("author_id", str3);
        String str4 = discoveryChainingItem.A05;
        abstractC23721Ec2.A9s("ad_id", str4);
        abstractC23721Ec.A9s("ad_id", str4);
        String str5 = discoveryChainingItem.A06;
        abstractC23721Ec2.A9s("seed_ad_token", str5);
        abstractC23721Ec.A9s("seed_ad_token", str5);
        String str6 = discoveryChainingItem.A07;
        abstractC23721Ec2.A9s("category_id", str6);
        abstractC23721Ec.A9s("category_id", str6);
        String str7 = discoveryChainingItem.A0I;
        abstractC23721Ec2.A9s("explore_source_token", str7);
        abstractC23721Ec.A9s("explore_source_token", str7);
        String str8 = discoveryChainingItem.A0A;
        abstractC23721Ec2.A9s("grid_pagination_token", str8);
        abstractC23721Ec.A9s("grid_pagination_token", str8);
        String str9 = (String) AbstractC38168GqZ.A00(userSession).A01.get(str2);
        abstractC23721Ec2.A9s("chain_pagination_token_chain_scope", str9);
        abstractC23721Ec.A9s("chain_pagination_token_chain_scope", str9);
        Boolean bool = discoveryChainingItem.A03;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            abstractC23721Ec2.A0I("is_multi_ads_eligible", booleanValue);
            abstractC23721Ec.A0I("is_multi_ads_eligible", booleanValue);
        }
    }
}
