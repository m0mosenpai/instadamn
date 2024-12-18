package X;

import com.facebook.pando.TreeJNI;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.FriendshipStatus;
import com.instagram.user.model.FriendshipStatusImpl;
import com.instagram.user.model.ImmutablePandoFriendshipStatus;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1tC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC39881tC {
    /* JADX WARN: Multi-variable type inference failed */
    public static FriendshipStatus A00(FriendshipStatus friendshipStatus, FriendshipStatus friendshipStatus2) {
        Object friendshipStatusImpl;
        Boolean AgM = friendshipStatus.AgM();
        Boolean B7Q = friendshipStatus.B7Q();
        Boolean B7V = friendshipStatus.B7V();
        Boolean BHO = friendshipStatus.BHO();
        Boolean CQV = friendshipStatus.CQV();
        Boolean CQa = friendshipStatus.CQa();
        Boolean CQg = friendshipStatus.CQg();
        Boolean CTh = friendshipStatus.CTh();
        Boolean CUV = friendshipStatus.CUV();
        Boolean CUg = friendshipStatus.CUg();
        Boolean CVR = friendshipStatus.CVR();
        Boolean CYZ = friendshipStatus.CYZ();
        Boolean CYa = friendshipStatus.CYa();
        Boolean CZA = friendshipStatus.CZA();
        Boolean CZB = friendshipStatus.CZB();
        Boolean CZC = friendshipStatus.CZC();
        Boolean CZD = friendshipStatus.CZD();
        Boolean Cb1 = friendshipStatus.Cb1();
        Boolean Cc1 = friendshipStatus.Cc1();
        Boolean Cex = friendshipStatus.Cex();
        Boolean Cfx = friendshipStatus.Cfx();
        Boolean BVx = friendshipStatus.BVx();
        Boolean BaD = friendshipStatus.BaD();
        Integer Bkc = friendshipStatus.Bkc();
        Boolean Bvc = friendshipStatus.Bvc();
        Boolean C3Q = friendshipStatus.C3Q();
        Boolean C6a = friendshipStatus.C6a();
        if (friendshipStatus2.AgM() != null) {
            AgM = friendshipStatus2.AgM();
        }
        if (friendshipStatus2.B7Q() != null) {
            B7Q = friendshipStatus2.B7Q();
        }
        if (friendshipStatus2.B7V() != null) {
            B7V = friendshipStatus2.B7V();
        }
        if (friendshipStatus2.BHO() != null) {
            BHO = friendshipStatus2.BHO();
        }
        if (friendshipStatus2.CQV() != null) {
            CQV = friendshipStatus2.CQV();
        }
        if (friendshipStatus2.CQa() != null) {
            CQa = friendshipStatus2.CQa();
        }
        if (friendshipStatus2.CQg() != null) {
            CQg = friendshipStatus2.CQg();
        }
        if (friendshipStatus2.CTh() != null) {
            CTh = friendshipStatus2.CTh();
        }
        if (friendshipStatus2.CUV() != null) {
            CUV = friendshipStatus2.CUV();
        }
        if (friendshipStatus2.CUg() != null) {
            CUg = friendshipStatus2.CUg();
        }
        if (friendshipStatus2.CVR() != null) {
            CVR = friendshipStatus2.CVR();
        }
        if (friendshipStatus2.CYZ() != null) {
            CYZ = friendshipStatus2.CYZ();
        }
        if (friendshipStatus2.CYa() != null) {
            CYa = friendshipStatus2.CYa();
        }
        if (friendshipStatus2.CZA() != null) {
            CZA = friendshipStatus2.CZA();
        }
        if (friendshipStatus2.CZB() != null) {
            CZB = friendshipStatus2.CZB();
        }
        if (friendshipStatus2.CZC() != null) {
            CZC = friendshipStatus2.CZC();
        }
        if (friendshipStatus2.CZD() != null) {
            CZD = friendshipStatus2.CZD();
        }
        if (friendshipStatus2.Cb1() != null) {
            Cb1 = friendshipStatus2.Cb1();
        }
        if (friendshipStatus2.Cc1() != null) {
            Cc1 = friendshipStatus2.Cc1();
        }
        if (friendshipStatus2.Cex() != null) {
            Cex = friendshipStatus2.Cex();
        }
        if (friendshipStatus2.Cfx() != null) {
            Cfx = friendshipStatus2.Cfx();
        }
        if (friendshipStatus2.BVx() != null) {
            BVx = friendshipStatus2.BVx();
        }
        if (friendshipStatus2.BaD() != null) {
            BaD = friendshipStatus2.BaD();
        }
        if (friendshipStatus2.Bkc() != null) {
            Bkc = friendshipStatus2.Bkc();
        }
        if (friendshipStatus2.Bvc() != null) {
            Bvc = friendshipStatus2.Bvc();
        }
        if (friendshipStatus2.C3Q() != null) {
            C3Q = friendshipStatus2.C3Q();
        }
        if (friendshipStatus2.C6a() != null) {
            C6a = friendshipStatus2.C6a();
        }
        if (friendshipStatus instanceof ImmutablePandoFriendshipStatus) {
            TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
            TreeJNI treeJNI = (TreeJNI) friendshipStatus;
            friendshipStatusImpl = new TreeUpdaterJNI(AbstractC06930Yk.A06(new C09530e4("blocking", AgM), new C09530e4("followed_by", B7Q), new C09530e4("following", B7V), new C09530e4("incoming_request", BHO), new C09530e4("is_banner_profile_upsell", CQV), new C09530e4("is_bestie", CQa), new C09530e4("is_blocking_reel", CQg), new C09530e4("is_eligible_to_subscribe", CTh), new C09530e4("is_fb_friends", CUV), new C09530e4("is_feed_favorite", CUg), new C09530e4("is_group_creation_reachable", CVR), new C09530e4("is_messaging_only_blocking", CYZ), new C09530e4("is_messaging_pseudo_blocking", CYa), new C09530e4("is_muting_friend_map", CZA), new C09530e4("is_muting_media_notes", CZB), new C09530e4("is_muting_notes", CZC), new C09530e4("is_muting_reel", CZD), new C09530e4("is_private", Cb1), new C09530e4("is_restricted", Cc1), new C09530e4("is_unavailable", Cex), new C09530e4("is_viewer_unconnected", Cfx), new C09530e4("muting", BVx), new C09530e4("outgoing_request", BaD), new C09530e4("reachability_status", Bkc), new C09530e4("should_show_profile_upsell", Bvc), new C09530e4("subscribed", C3Q), new C09530e4("text_post_app_pre_following", C6a)), treeJNI).applyToTree(treeJNI);
            C14360o3.A07(friendshipStatusImpl);
        } else {
            Boolean bool = Cb1;
            Boolean bool2 = Cc1;
            Boolean bool3 = Cex;
            Boolean bool4 = Cfx;
            Boolean bool5 = BVx;
            Boolean bool6 = BaD;
            Boolean bool7 = Bvc;
            Boolean bool8 = C3Q;
            Boolean bool9 = C6a;
            Integer num = Bkc;
            Boolean bool10 = AgM;
            Boolean bool11 = B7Q;
            Boolean bool12 = B7V;
            Boolean bool13 = BHO;
            Boolean bool14 = CQV;
            Boolean bool15 = CQa;
            Boolean bool16 = CQg;
            friendshipStatusImpl = new FriendshipStatusImpl(bool10, bool11, bool12, bool13, bool14, bool15, bool16, CTh, CUV, CUg, CVR, CYZ, CYa, CZA, CZB, CZC, CZD, bool, bool2, bool3, bool4, bool5, bool6, bool7, bool8, bool9, num);
        }
        return (FriendshipStatus) friendshipStatusImpl;
    }

    public static Map A01(FriendshipStatus friendshipStatus) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (friendshipStatus.AgM() != null) {
            linkedHashMap.put("blocking", friendshipStatus.AgM());
        }
        if (friendshipStatus.B7Q() != null) {
            linkedHashMap.put("followed_by", friendshipStatus.B7Q());
        }
        if (friendshipStatus.B7V() != null) {
            linkedHashMap.put("following", friendshipStatus.B7V());
        }
        if (friendshipStatus.BHO() != null) {
            linkedHashMap.put("incoming_request", friendshipStatus.BHO());
        }
        if (friendshipStatus.CQV() != null) {
            linkedHashMap.put("is_banner_profile_upsell", friendshipStatus.CQV());
        }
        if (friendshipStatus.CQa() != null) {
            linkedHashMap.put("is_bestie", friendshipStatus.CQa());
        }
        if (friendshipStatus.CQg() != null) {
            linkedHashMap.put("is_blocking_reel", friendshipStatus.CQg());
        }
        if (friendshipStatus.CTh() != null) {
            linkedHashMap.put("is_eligible_to_subscribe", friendshipStatus.CTh());
        }
        if (friendshipStatus.CUV() != null) {
            linkedHashMap.put("is_fb_friends", friendshipStatus.CUV());
        }
        if (friendshipStatus.CUg() != null) {
            linkedHashMap.put("is_feed_favorite", friendshipStatus.CUg());
        }
        if (friendshipStatus.CVR() != null) {
            linkedHashMap.put("is_group_creation_reachable", friendshipStatus.CVR());
        }
        if (friendshipStatus.CYZ() != null) {
            linkedHashMap.put("is_messaging_only_blocking", friendshipStatus.CYZ());
        }
        if (friendshipStatus.CYa() != null) {
            linkedHashMap.put("is_messaging_pseudo_blocking", friendshipStatus.CYa());
        }
        if (friendshipStatus.CZA() != null) {
            linkedHashMap.put("is_muting_friend_map", friendshipStatus.CZA());
        }
        if (friendshipStatus.CZB() != null) {
            linkedHashMap.put("is_muting_media_notes", friendshipStatus.CZB());
        }
        if (friendshipStatus.CZC() != null) {
            linkedHashMap.put("is_muting_notes", friendshipStatus.CZC());
        }
        if (friendshipStatus.CZD() != null) {
            linkedHashMap.put("is_muting_reel", friendshipStatus.CZD());
        }
        if (friendshipStatus.Cb1() != null) {
            linkedHashMap.put("is_private", friendshipStatus.Cb1());
        }
        if (friendshipStatus.Cc1() != null) {
            linkedHashMap.put("is_restricted", friendshipStatus.Cc1());
        }
        if (friendshipStatus.Cex() != null) {
            linkedHashMap.put("is_unavailable", friendshipStatus.Cex());
        }
        if (friendshipStatus.Cfx() != null) {
            linkedHashMap.put("is_viewer_unconnected", friendshipStatus.Cfx());
        }
        if (friendshipStatus.BVx() != null) {
            linkedHashMap.put("muting", friendshipStatus.BVx());
        }
        if (friendshipStatus.BaD() != null) {
            linkedHashMap.put("outgoing_request", friendshipStatus.BaD());
        }
        if (friendshipStatus.Bkc() != null) {
            linkedHashMap.put("reachability_status", friendshipStatus.Bkc());
        }
        if (friendshipStatus.Bvc() != null) {
            linkedHashMap.put("should_show_profile_upsell", friendshipStatus.Bvc());
        }
        if (friendshipStatus.C3Q() != null) {
            linkedHashMap.put("subscribed", friendshipStatus.C3Q());
        }
        if (friendshipStatus.C6a() != null) {
            linkedHashMap.put("text_post_app_pre_following", friendshipStatus.C6a());
        }
        return AbstractC06930Yk.A0B(linkedHashMap);
    }
}
