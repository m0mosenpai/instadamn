package X;

import com.facebook.pando.TreeJNI;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.FriendshipStatus;
import com.instagram.user.model.FriendshipStatusImpl;
import com.instagram.user.model.ImmutablePandoFriendshipStatus;

/* renamed from: X.17R, reason: invalid class name */
/* loaded from: classes.dex */
public final class C17R {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Boolean A04;
    public Boolean A05;
    public Boolean A06;
    public Boolean A07;
    public Boolean A08;
    public Boolean A09;
    public Boolean A0A;
    public Boolean A0B;
    public Boolean A0C;
    public Boolean A0D;
    public Boolean A0E;
    public Boolean A0F;
    public Boolean A0G;
    public Boolean A0H;
    public Boolean A0I;
    public Boolean A0J;
    public Boolean A0K;
    public Boolean A0L;
    public Boolean A0M;
    public Boolean A0N;
    public Boolean A0O;
    public Boolean A0P;
    public Integer A0Q;
    public final FriendshipStatus A0R;

    public final FriendshipStatus A00() {
        Object friendshipStatusImpl;
        Object obj = this.A0R;
        if (obj instanceof ImmutablePandoFriendshipStatus) {
            TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
            TreeJNI treeJNI = (TreeJNI) obj;
            friendshipStatusImpl = new TreeUpdaterJNI(AbstractC06930Yk.A06(new C09530e4("blocking", this.A00), new C09530e4("followed_by", this.A01), new C09530e4("following", this.A02), new C09530e4("incoming_request", this.A03), new C09530e4("is_banner_profile_upsell", this.A04), new C09530e4("is_bestie", this.A05), new C09530e4("is_blocking_reel", this.A06), new C09530e4("is_eligible_to_subscribe", this.A07), new C09530e4("is_fb_friends", this.A08), new C09530e4("is_feed_favorite", this.A09), new C09530e4("is_group_creation_reachable", this.A0A), new C09530e4("is_messaging_only_blocking", this.A0B), new C09530e4("is_messaging_pseudo_blocking", this.A0C), new C09530e4("is_muting_media_notes", this.A0E), new C09530e4("is_muting_notes", this.A0F), new C09530e4("is_muting_reel", this.A0G), new C09530e4("is_muting_friend_map", this.A0D), new C09530e4("is_private", this.A0H), new C09530e4("is_restricted", this.A0I), new C09530e4("is_unavailable", this.A0J), new C09530e4("is_viewer_unconnected", this.A0K), new C09530e4("muting", this.A0L), new C09530e4("outgoing_request", this.A0M), new C09530e4("reachability_status", this.A0Q), new C09530e4("should_show_profile_upsell", this.A0N), new C09530e4("subscribed", this.A0O), new C09530e4("text_post_app_pre_following", this.A0P)), treeJNI).applyToTree(treeJNI);
            C14360o3.A07(friendshipStatusImpl);
        } else {
            friendshipStatusImpl = new FriendshipStatusImpl(this.A00, this.A01, this.A02, this.A03, this.A04, this.A05, this.A06, this.A07, this.A08, this.A09, this.A0A, this.A0B, this.A0C, this.A0D, this.A0E, this.A0F, this.A0G, this.A0H, this.A0I, this.A0J, this.A0K, this.A0L, this.A0M, this.A0N, this.A0O, this.A0P, this.A0Q);
        }
        return (FriendshipStatus) friendshipStatusImpl;
    }

    public C17R(FriendshipStatus friendshipStatus) {
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        Boolean bool4;
        Boolean bool5;
        Boolean bool6;
        Boolean bool7;
        Boolean bool8;
        Boolean bool9;
        Boolean bool10;
        Boolean bool11;
        Boolean bool12;
        Boolean bool13;
        Boolean bool14;
        Boolean bool15;
        Boolean bool16;
        Boolean bool17;
        Boolean bool18;
        Boolean bool19;
        Boolean bool20;
        Boolean bool21;
        Boolean bool22;
        Boolean bool23;
        Integer num;
        Boolean bool24;
        Boolean bool25;
        this.A0R = friendshipStatus;
        if (friendshipStatus != null) {
            bool = friendshipStatus.AgM();
        } else {
            bool = null;
        }
        this.A00 = bool;
        if (friendshipStatus != null) {
            bool2 = friendshipStatus.B7Q();
        } else {
            bool2 = null;
        }
        this.A01 = bool2;
        if (friendshipStatus != null) {
            bool3 = friendshipStatus.B7V();
        } else {
            bool3 = null;
        }
        this.A02 = bool3;
        if (friendshipStatus != null) {
            bool4 = friendshipStatus.BHO();
        } else {
            bool4 = null;
        }
        this.A03 = bool4;
        if (friendshipStatus != null) {
            bool5 = friendshipStatus.CQV();
        } else {
            bool5 = null;
        }
        this.A04 = bool5;
        if (friendshipStatus != null) {
            bool6 = friendshipStatus.CQa();
        } else {
            bool6 = null;
        }
        this.A05 = bool6;
        if (friendshipStatus != null) {
            bool7 = friendshipStatus.CQg();
        } else {
            bool7 = null;
        }
        this.A06 = bool7;
        if (friendshipStatus != null) {
            bool8 = friendshipStatus.CTh();
        } else {
            bool8 = null;
        }
        this.A07 = bool8;
        if (friendshipStatus != null) {
            bool9 = friendshipStatus.CUV();
        } else {
            bool9 = null;
        }
        this.A08 = bool9;
        if (friendshipStatus != null) {
            bool10 = friendshipStatus.CUg();
        } else {
            bool10 = null;
        }
        this.A09 = bool10;
        if (friendshipStatus != null) {
            bool11 = friendshipStatus.CVR();
        } else {
            bool11 = null;
        }
        this.A0A = bool11;
        if (friendshipStatus != null) {
            bool12 = friendshipStatus.CYZ();
        } else {
            bool12 = null;
        }
        this.A0B = bool12;
        if (friendshipStatus != null) {
            bool13 = friendshipStatus.CYa();
        } else {
            bool13 = null;
        }
        this.A0C = bool13;
        if (friendshipStatus != null) {
            bool14 = friendshipStatus.CZC();
        } else {
            bool14 = null;
        }
        this.A0F = bool14;
        if (friendshipStatus != null) {
            bool15 = friendshipStatus.CZB();
        } else {
            bool15 = null;
        }
        this.A0E = bool15;
        if (friendshipStatus != null) {
            bool16 = friendshipStatus.CZD();
        } else {
            bool16 = null;
        }
        this.A0G = bool16;
        if (friendshipStatus != null) {
            bool17 = friendshipStatus.CZA();
        } else {
            bool17 = null;
        }
        this.A0D = bool17;
        if (friendshipStatus != null) {
            bool18 = friendshipStatus.Cb1();
        } else {
            bool18 = null;
        }
        this.A0H = bool18;
        if (friendshipStatus != null) {
            bool19 = friendshipStatus.Cc1();
        } else {
            bool19 = null;
        }
        this.A0I = bool19;
        if (friendshipStatus != null) {
            bool20 = friendshipStatus.Cex();
        } else {
            bool20 = null;
        }
        this.A0J = bool20;
        if (friendshipStatus != null) {
            bool21 = friendshipStatus.Cfx();
        } else {
            bool21 = null;
        }
        this.A0K = bool21;
        if (friendshipStatus != null) {
            bool22 = friendshipStatus.BVx();
        } else {
            bool22 = null;
        }
        this.A0L = bool22;
        if (friendshipStatus != null) {
            bool23 = friendshipStatus.BaD();
        } else {
            bool23 = null;
        }
        this.A0M = bool23;
        if (friendshipStatus != null) {
            num = friendshipStatus.Bkc();
        } else {
            num = null;
        }
        this.A0Q = num;
        if (friendshipStatus != null) {
            bool24 = friendshipStatus.Bvc();
        } else {
            bool24 = null;
        }
        this.A0N = bool24;
        if (friendshipStatus != null) {
            bool25 = friendshipStatus.C3Q();
        } else {
            bool25 = null;
        }
        this.A0O = bool25;
        this.A0P = friendshipStatus != null ? friendshipStatus.C6a() : null;
    }
}
