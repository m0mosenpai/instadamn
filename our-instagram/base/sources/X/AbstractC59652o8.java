package X;

import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.2o8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC59652o8 {
    public static final C59692oC A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        C06090Tz c06090Tz = C06090Tz.A05;
        return new C59692oC((int) C18U.A01(c06090Tz, userSession, 36610417195685938L), (int) C18U.A01(c06090Tz, userSession, 36610417195292718L), C18U.A06(c06090Tz, userSession, 36328942218657671L), (int) C18U.A01(c06090Tz, userSession, 36610417195423791L), C18U.A06(c06090Tz, userSession, 36328942219050889L), (int) C18U.A01(c06090Tz, userSession, 36610417195489328L), C18U.A06(c06090Tz, userSession, 36328942219575185L), (int) C18U.A01(c06090Tz, userSession, 36610434375161936L), C18U.A06(c06090Tz, userSession, 36328942219116426L));
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0218, code lost:
    
        if (X.C18U.A06(r0, r51, 36328942218919816L) != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C59742oH A01(com.instagram.common.session.UserSession r51) {
        /*
            Method dump skipped, instructions count: 704
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC59652o8.A01(com.instagram.common.session.UserSession):X.2oH");
    }

    public static final Map A02(C59742oH c59742oH) {
        if (!c59742oH.A0T) {
            return AbstractC06930Yk.A0E();
        }
        HashMap hashMap = new HashMap();
        C59672oA c59672oA = c59742oH.A0L;
        C59692oC c59692oC = c59742oH.A0K;
        boolean z = c59672oA.A08;
        int i = R.layout.fragment_direct_inbox;
        if (z) {
            i = R.layout.fragment_direct_inbox_ls;
        }
        Integer valueOf = Integer.valueOf(i);
        Integer num = C05F.A01;
        hashMap.put(valueOf, new C9BQ(num, 0, 5));
        if (c59672oA.A09) {
            hashMap.put(Integer.valueOf(R.layout.direct_inbox_row_layout), new C9BQ(num, c59672oA.A06, 4));
        }
        int i2 = c59672oA.A03;
        if (i2 > 0) {
            hashMap.put(Integer.valueOf(R.layout.layout_header_with_action_text), new C9BQ(num, i2, 4));
        }
        if (c59672oA.A0A) {
            hashMap.put(Integer.valueOf(R.layout.search_row_redesign), new C9BQ(C05F.A0C, 0, 5));
        }
        int i3 = c59672oA.A02;
        if (i3 > 0) {
            hashMap.put(Integer.valueOf(R.layout.layout_listview_empty_state), new C9BQ(num, i3, 4));
        }
        hashMap.put(Integer.valueOf(R.layout.fragment_direct_message_thread), new C9BQ(num, 0, 5));
        if (!c59692oC.A05) {
            A03(hashMap, c59692oC.A01);
        }
        int i4 = c59692oC.A02;
        if (i4 > 0) {
            hashMap.put(Integer.valueOf(R.layout.fragment_direct_thread_toggle), new C9BQ(num, i4, 4));
        }
        int i5 = c59692oC.A03;
        if (i5 > 0) {
            hashMap.put(Integer.valueOf(R.layout.direct_reel_share_message), new C9BQ(num, i5, 4));
        }
        int i6 = c59692oC.A00;
        if (i6 > 0) {
            hashMap.put(Integer.valueOf(R.layout.direct_composer_bar_with_overflow_for_composer_buttons), new C9BQ(num, i6, 4));
        }
        int i7 = c59692oC.A04;
        if (i7 > 0) {
            hashMap.put(Integer.valueOf(R.layout.layout_direct_thread_header), new C9BQ(C05F.A0C, i7, 4));
        }
        hashMap.put(Integer.valueOf(R.layout.item_pog), new C9BQ(num, c59672oA.A04, 4));
        boolean z2 = c59672oA.A0C;
        int i8 = R.layout.cf_hub_avatar_view;
        if (z2) {
            i8 = R.layout.cf_hub_avatar_view_v2;
        }
        hashMap.put(Integer.valueOf(i8), new C9BQ(num, c59672oA.A01, 4));
        hashMap.put(Integer.valueOf(R.layout.cf_hub_pog_note_bubble_view), new C9BQ(num, c59672oA.A00, 4));
        hashMap.put(Integer.valueOf(R.layout.fragment_direct_private_share_one_tap), new C9BQ(num, c59672oA.A05, 4));
        boolean z3 = c59672oA.A0B;
        int i9 = R.layout.direct_share_sheet_grid_view_pog;
        if (z3) {
            i9 = R.layout.direct_share_sheet_grid_view_larger_pog;
        }
        hashMap.put(Integer.valueOf(i9), new C9BQ(num, c59672oA.A07, 4));
        if (c59742oH.A0N) {
            Integer valueOf2 = Integer.valueOf(R.layout.profile_header_user_info_row);
            int i10 = c59742oH.A0B;
            Integer num2 = C05F.A0C;
            hashMap.put(valueOf2, new C9BQ(num2, i10, 4));
            hashMap.put(Integer.valueOf(R.layout.profile_header_user_actions_row), new C9BQ(num2, c59742oH.A0A, 4));
            hashMap.put(Integer.valueOf(R.layout.profile_header_user_actions_generic_button), new C9BQ(num2, c59742oH.A07, 4));
            hashMap.put(Integer.valueOf(R.layout.layout_highlights_reel_tray), new C9BQ(num2, c59742oH.A02, 4));
            hashMap.put(Integer.valueOf(R.layout.profile_header_chaining_icon), new C9BQ(num2, c59742oH.A08, 4));
            hashMap.put(Integer.valueOf(R.layout.layout_profile_tab_fragment), new C9BQ(num2, c59742oH.A04, 4));
            hashMap.put(Integer.valueOf(R.layout.profile_header_user_actions_follow_button), new C9BQ(num2, c59742oH.A09, 4));
            hashMap.put(Integer.valueOf(R.layout.reel_item_story_unit), new C9BQ(num2, c59742oH.A0D, 4));
            hashMap.put(Integer.valueOf(R.layout.reel_item_avatar_content), new C9BQ(num2, c59742oH.A0C, 4));
            hashMap.put(Integer.valueOf(R.layout.layout_profile_tombstone), new C9BQ(num2, c59742oH.A05, 4));
            hashMap.put(Integer.valueOf(R.layout.refreshable_profile_tabbed_viewpager_legacy), new C9BQ(num2, c59742oH.A0F, 4));
        }
        Integer valueOf3 = Integer.valueOf(R.layout.layout_reel_item);
        int i11 = c59742oH.A0G;
        hashMap.put(valueOf3, new C9BQ((Integer) null, i11, 6));
        Integer valueOf4 = Integer.valueOf(R.layout.showreel_view);
        hashMap.put(valueOf4, new C9BQ((Integer) null, 0, 7));
        if (c59742oH.A0M) {
            hashMap.put(Integer.valueOf(R.layout.layout_sponsored_reel_item), new C9BQ((Integer) null, i11, 6));
            hashMap.put(Integer.valueOf(R.layout.layout_netego_reel_item), new C9BQ((Integer) null, i11, 6));
        }
        if (c59742oH.A0R) {
            boolean z4 = c59742oH.A0O;
            int i12 = R.layout.layout_iglive_reel_item;
            if (z4) {
                i12 = R.layout.layout_iglive_reel_item_igds;
            }
            hashMap.put(Integer.valueOf(i12), new C9BQ((Integer) null, i11, 6));
            hashMap.put(Integer.valueOf(R.layout.layout_iglive_archive_reel_item), new C9BQ((Integer) null, i11, 6));
        }
        hashMap.put(valueOf4, new C9BQ((Integer) null, 0, 7));
        hashMap.put(Integer.valueOf(R.layout.layout_grid_recyclerview_wrapper), new C9BQ((Integer) null, c59742oH.A03, 6));
        hashMap.put(Integer.valueOf(R.layout.layout_grid_item_image), new C9BQ((Integer) null, c59742oH.A01, 6));
        hashMap.put(Integer.valueOf(R.layout.layout_grid_item_clips), new C9BQ((Integer) null, 0, 6));
        hashMap.put(Integer.valueOf(R.layout.layout_grid_item_video), new C9BQ((Integer) null, 0, 6));
        Integer valueOf5 = Integer.valueOf(R.layout.layout_reel_viewer_animator);
        int i13 = c59742oH.A0E;
        int i14 = c59742oH.A00;
        hashMap.put(valueOf5, new C9BQ(num, i14 * i13, 4));
        hashMap.put(Integer.valueOf(R.layout.reel_avatar_with_badge_view), new C9BQ(num, i14, 4));
        hashMap.put(Integer.valueOf(R.layout.layout_clips_viewer_ad_item_prefetch), new C9BQ((Integer) null, 0, 7));
        hashMap.put(Integer.valueOf(R.layout.layout_reel_viewer), new C9BQ(C05F.A0C, c59742oH.A06, 4));
        if (c59742oH.A0U) {
            hashMap.put(Integer.valueOf(R.layout.tifu_unit), new C9BQ((Integer) null, 1, 6));
        }
        hashMap.put(Integer.valueOf(R.layout.layout_quick_capture_controller), new C9BQ((Integer) null, 0, 7));
        C59712oE c59712oE = c59742oH.A0I;
        if (c59712oE == null) {
            return hashMap;
        }
        if (!C18U.A06(C06090Tz.A05, c59712oE.A00, 36328203484151107L)) {
            return hashMap;
        }
        hashMap.put(Integer.valueOf(R.layout.social_ufi_sandwich_dots_with_larger_cta_optimized), new C9BQ(C05F.A00, 2, 4));
        return hashMap;
    }

    public static final void A03(HashMap hashMap, int i) {
        if (i > 0) {
            hashMap.put(Integer.valueOf(R.layout.common_decorated_message_root_frame_layout), new C9BQ(i, C05F.A01, R.style.DirectMessageBorderlessGroupedRedesign, 2));
        }
    }
}
