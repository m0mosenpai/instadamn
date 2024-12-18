package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.ThumbnailInteractionType;
import com.instagram.common.session.UserSession;
import com.instagram.explore.topiccluster.ExploreTopicCluster;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Gkq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37836Gkq {
    public static long A00;

    public static final C25531Mh A00(EnumC130515uw enumC130515uw, C18920wW c18920wW, C5qT c5qT, C127915qK c127915qK, C132835z6 c132835z6, ExploreTopicCluster exploreTopicCluster, C38321qM c38321qM, Long l, Long l2, String str, String str2, String str3) {
        String str4;
        String str5;
        EnumC123285i3 enumC123285i3;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        List list;
        ArrayList arrayList;
        ThumbnailInteractionType C86;
        List BSa;
        C14360o3.A0B(c18920wW, 0);
        ArrayList arrayList2 = null;
        if (c38321qM != null) {
            str4 = c38321qM.getId();
        } else {
            str4 = null;
        }
        if (exploreTopicCluster != null) {
            str5 = exploreTopicCluster.A06;
        } else {
            str5 = null;
        }
        if (c38321qM != null) {
            enumC123285i3 = c38321qM.BRp().A00();
        } else {
            enumC123285i3 = EnumC123285i3.UNKNOWN;
        }
        if (exploreTopicCluster != null) {
            str6 = AbstractC127885qH.A00(exploreTopicCluster.A00());
            str7 = exploreTopicCluster.A0A;
        } else {
            str6 = null;
            str7 = null;
        }
        if (c38321qM != null) {
            str8 = c38321qM.A0C.getMezqlToken();
        } else {
            str8 = null;
        }
        if (c38321qM != null) {
            str9 = c38321qM.A0C.getAlgorithm();
        } else {
            str9 = null;
        }
        if (c38321qM != null) {
            str10 = c38321qM.A0C.getConnectionId();
        } else {
            str10 = null;
        }
        String A01 = AbstractC154266wb.A01(c5qT.A01, c5qT.A00);
        if (c38321qM != null) {
            str11 = c38321qM.A0C.getLoggingInfoToken();
        } else {
            str11 = null;
        }
        String A012 = AbstractC154266wb.A01(c127915qK.A01, c127915qK.A03);
        if (c38321qM != null) {
            list = c38321qM.A3o();
        } else {
            list = null;
        }
        if (c38321qM != null && (BSa = c38321qM.BSa()) != null) {
            arrayList2 = new ArrayList(AbstractC06950Ym.A1E(BSa, 10));
            Iterator it = BSa.iterator();
            while (it.hasNext()) {
                arrayList2.add(C4SX.A00((String) it.next()));
            }
        }
        if (c132835z6 != null) {
            str5 = c132835z6.A03;
            str6 = AbstractC127885qH.A00(c132835z6.A01());
            str7 = c132835z6.A00().A04;
        }
        C25531Mh c25531Mh = new C25531Mh(c18920wW.A00(c18920wW.A00, "explore_home_impression"), 153);
        c25531Mh.A0R("position", A01);
        c25531Mh.A0u(str);
        c25531Mh.A0l(str4);
        c25531Mh.A0M(enumC130515uw, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        c25531Mh.A0R("topic_cluster_id", str5);
        c25531Mh.A0R("size", A012);
        c25531Mh.A0M(enumC123285i3, "media_type");
        c25531Mh.A0R("topic_cluster_type", str6);
        c25531Mh.A0R("topic_cluster_title", str7);
        c25531Mh.A0R("inventory_source", str3);
        c25531Mh.A0R("mezql_token", str8);
        c25531Mh.A0R("algorithm", str9);
        c25531Mh.A0R("connection_id", str10);
        c25531Mh.A0R("ranking_info_token", str11);
        c25531Mh.A0S("product_ids", list);
        String str12 = null;
        if (arrayList2 != null) {
            arrayList = new ArrayList(AbstractC06950Ym.A1E(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList.add(((C4SX) it2.next()).A00);
            }
        } else {
            arrayList = null;
        }
        c25531Mh.A0S("merchant_ids", arrayList);
        c25531Mh.A0Q("playlist_id", l);
        c25531Mh.A0Q("page_num", l2);
        c25531Mh.A0R("content_source_type", str2);
        if (c38321qM != null && (C86 = c38321qM.A0C.C86()) != null) {
            int ordinal = C86.ordinal();
            if (ordinal != 1) {
                if (ordinal == 2) {
                    str12 = "reshares";
                }
            } else {
                str12 = "likes";
            }
        }
        c25531Mh.A0R("social_proof_interaction_type", str12);
        return c25531Mh;
    }

    public static final void A01(InterfaceC11380iw interfaceC11380iw, UserSession userSession, ExploreTopicCluster exploreTopicCluster, String str, String str2) {
        C14360o3.A0B(userSession, 0);
        if (exploreTopicCluster != null) {
            long currentTimeMillis = System.currentTimeMillis();
            long j = A00;
            if (1 <= j && j < currentTimeMillis) {
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "explore_home_pull_to_refresh");
                if (A0f.isSampled()) {
                    A0f.AAP("topic_cluster_id", exploreTopicCluster.A06);
                    A0f.AAP("topic_cluster_title", exploreTopicCluster.A0A);
                    A0f.AAP("topic_cluster_type", AbstractC127885qH.A00(exploreTopicCluster.A03));
                    A0f.AAP("topic_cluster_debug_info", exploreTopicCluster.A05);
                    AbstractC37301Gc2.A16(A0f, str);
                    A0f.A9K("time_spent", Long.valueOf(currentTimeMillis - A00));
                    A0f.AAP("event_outcome", str2);
                    A0f.Cht();
                }
                A00 = 0L;
            }
        }
    }
}
