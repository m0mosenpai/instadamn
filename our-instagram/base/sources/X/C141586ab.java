package X;

import android.os.Bundle;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelViewerConfig;
import com.instagram.search.common.analytics.SearchContext;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6ab, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C141586ab {
    public int A00;
    public long A01;
    public C70873Fz A02;
    public ReelViewerConfig A03;
    public C3G2 A04;
    public C3G5 A05;
    public SearchContext A06;
    public Float A07;
    public Integer A08;
    public Integer A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public ArrayList A0O;
    public ArrayList A0P;
    public ArrayList A0Q;
    public ArrayList A0R;
    public HashMap A0S;
    public HashMap A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public String A0e;
    public String A0f;
    public String A0g;
    public String A0h;
    public String A0i;

    public final void A01(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        this.A0i = userSession.token;
    }

    public final void A02(UserSession userSession, String str, List list) {
        C14360o3.A0B(list, 0);
        C14360o3.A0B(userSession, 2);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C70873Fz c70873Fz = new C70873Fz(userSession, list);
        Iterator it = list.iterator();
        C140666Xu c140666Xu = null;
        Reel reel = null;
        while (it.hasNext()) {
            Reel reel2 = (Reel) it.next();
            if (C2I7.A00(reel2.getId(), str)) {
                reel = reel2;
            }
            arrayList2.add(reel2.getId());
        }
        if (reel != null) {
            c140666Xu = new C140666Xu(userSession, reel);
        }
        int A00 = AbstractC140676Xv.A00(userSession, c140666Xu, arrayList, list);
        if (A00 < 0) {
            String str2 = userSession.userId;
            Iterator it2 = list.iterator();
            String str3 = "";
            while (it2.hasNext()) {
                Reel reel3 = (Reel) it2.next();
                C71473Il A002 = C71473Il.A00(',');
                Iterator<Object> it3 = new TZ0(str3, reel3.getId(), new Object[0]).iterator();
                StringBuilder sb = new StringBuilder();
                A002.A03(sb, it3);
                str3 = sb.toString();
            }
            if (str3.startsWith(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1)) {
                str3 = str3.substring(1);
            }
            C0w9.A03("InvalidOffset", StringFormatUtil.formatStrLocaleSafe("Reel with ID: %s for logged in user ID: %s, not found in reels.\nReelIds: %s", str, str2, str3));
        }
        int max = Math.max(A00, 0);
        this.A02 = c70873Fz;
        this.A0O = arrayList;
        this.A0Q = arrayList2;
        this.A00 = max;
        this.A0e = str;
    }

    public final void A03(C3G2 c3g2) {
        C14360o3.A0B(c3g2, 0);
        this.A04 = c3g2;
    }

    public final void A05(String str) {
        C14360o3.A0B(str, 0);
        this.A0f = str;
    }

    public final void A06(String str) {
        C14360o3.A0B(str, 0);
        this.A0g = str;
    }

    public final void A07(String str) {
        C14360o3.A0B(str, 0);
        this.A0h = str;
    }

    public final void A08(String str) {
        C14360o3.A0B(str, 0);
        this.A0N = str;
    }

    public final void A09(ArrayList arrayList) {
        C14360o3.A0B(arrayList, 0);
        this.A0O = arrayList;
    }

    public final void A0A(ArrayList arrayList) {
        C14360o3.A0B(arrayList, 0);
        this.A0Q = arrayList;
    }

    public final Bundle A00() {
        C70873Fz c70873Fz;
        if (this.A0O == null || this.A0Q == null || this.A04 == null || this.A0N == null || this.A02 == null) {
            C0w9.A03("ReelViewerFragmentParams", "ReelViewerFragmentParams builder validatation failed!");
        }
        if (this.A04 == C3G2.A1c && (c70873Fz = this.A02) != null && c70873Fz.A01.A00.A01 == 0 && this.A0G == null) {
            C0w9.A03("ReelViewerFragmentParams", "Source is push notification but push notification type is missing (non-live notification)");
        }
        if (this.A03 == null) {
            this.A03 = ReelViewerConfig.A00();
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_SELECTED_REEL_IDS", this.A0O);
        bundle.putStringArrayList("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_SOURCE_REEL_IDS", this.A0Q);
        bundle.putString("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_LAUNCHED_REEL_ID", this.A0e);
        bundle.putSerializable("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_SOURCE_MODULE", this.A04);
        bundle.putString("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_PUSH_NOTIF_TYPE", this.A0G);
        bundle.putString("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_TRAY_SESSION_ID", this.A0N);
        bundle.putBoolean("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_FORCE_LOAD_REELS", this.A0V);
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", this.A0i);
        bundle.putInt("ReelViewerFragment.ARGUMENTS_KEY_SELECTED_REEL_INDEX", this.A00);
        C70873Fz c70873Fz2 = this.A02;
        if (c70873Fz2 != null) {
            bundle.putInt("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_VIEWED_STORY_REEL_COUNT", c70873Fz2.A01.A01.A03);
            C70873Fz c70873Fz3 = this.A02;
            C14360o3.A0A(c70873Fz3);
            bundle.putInt("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_NEW_STORY_REEL_COUNT", c70873Fz3.A01.A01.A01);
            C70873Fz c70873Fz4 = this.A02;
            C14360o3.A0A(c70873Fz4);
            boolean z = false;
            if (c70873Fz4.A01.A01.A02 != 0) {
                z = true;
            }
            bundle.putBoolean("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_HAS_OWN_STORY_REEL", z);
            C70873Fz c70873Fz5 = this.A02;
            C14360o3.A0A(c70873Fz5);
            bundle.putInt("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_LIVE_REEL_COUNT", c70873Fz5.A01.A00.A01);
        }
        bundle.putString("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_STORY_RANKING_TOKEN", this.A0M);
        bundle.putLong("ReelViewerFragment.ARGUMENTS_REEL_VIEWER_LAUNCH_START_TIMESTAMP", this.A01);
        bundle.putBoolean("ReelViewerFragment.ARGUMENTS_REEL_VIEWER_LAUNCH_PRELOAD_SUCCESS", this.A0d);
        bundle.putBoolean("ReelViewerFragment.ARGUMENTS_KEY_REEL_VIEWER_RECENTLY_DELETED_MODE", this.A0W);
        bundle.putBoolean("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_SHOW_DASHBOARD", this.A0Z);
        bundle.putBoolean("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_SHOW_REPORT", this.A0b);
        bundle.putBoolean("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_SHOW_MISINFORMATION_FACT_CHECK", this.A0a);
        bundle.putBoolean("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_SHOW_STORY_COMMENT_SHEET", this.A0c);
        bundle.putStringArrayList("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_STORY_MENTIONS_PRESELECTED_USER_IDS", this.A0R);
        bundle.putBoolean("ReelViewerFragment.ARGUMENTS_KEY_ANIMATE_INTERSTITIAL_OVERLAY", this.A0X);
        bundle.putBoolean("ReelViewerFragment.ARGUMENTS_KEY_STORY_INTERSTITIAL", this.A0Y);
        bundle.putSerializable("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_MEDIA_REQUEST_PARAMS", this.A0S);
        bundle.putBoolean("ReelViewerFragment.ARGUMENTS_KEY_IS_MOMENT", false);
        bundle.putString("ReelViewerFragment.ARGUMENTS_KEY_REEL_VIEWER_ANIMATOR_HANDLE", this.A0f);
        bundle.putString("ReelViewerFragment.ARGUMENTS_KEY_REEL_VIEWER_HIDE_ANIMATION_COORDINATOR_HANDLE", this.A0h);
        bundle.putSerializable("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_REEL_TO_REEL_ITEM_IDS_FILTER", this.A0T);
        bundle.putString("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_DATA_CUT_FILTERING_TAG", this.A0F);
        Integer num = this.A08;
        if (num != null) {
            bundle.putInt("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_MID_FEED_TRAY_CLIENT_POSITION", num.intValue());
        }
        String str = this.A0L;
        if (str != null) {
            bundle.putString("ReelViewerFragment.ARGUMENTS_KEY_OVERRIDE_STARTING_ITEM_ID_IN_FIRST_REEL", str);
        }
        Integer num2 = this.A09;
        if (num2 != null) {
            bundle.putInt("ReelViewerFragment.ARGUMENTS_KEY_OVERRIDE_STARTING_INDEX_IN_FIRST_REEL", num2.intValue());
        }
        bundle.putParcelable("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_REEL_VIEWER_CONFIG", this.A03);
        String str2 = this.A0g;
        if (str2 != null) {
            bundle.putString("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_REEL_VIEWER_BOTTOM_SHEET_MANAGER_HANDLE", str2);
        }
        String str3 = this.A0E;
        if (str3 != null) {
            bundle.putString("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_EMOJI_REACT", str3);
        }
        String str4 = this.A0B;
        if (str4 != null) {
            bundle.putString("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_AVATAR_REACT", str4);
        }
        String str5 = this.A0H;
        if (str5 != null) {
            bundle.putString("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_REEL_SERVER_INFO", str5);
        }
        String str6 = this.A0J;
        if (str6 != null) {
            bundle.putString("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_RTC_MESSAGE", str6);
        }
        String str7 = this.A0C;
        if (str7 != null) {
            bundle.putString("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_BLOKS_APP_ID", str7);
        }
        String str8 = this.A0D;
        if (str8 != null) {
            bundle.putString("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_BLOKS_PARAMS", str8);
        }
        String str9 = this.A0K;
        if (str9 != null) {
            bundle.putString("shopping_session_id", str9);
        }
        SearchContext searchContext = this.A06;
        if (searchContext != null) {
            bundle.putParcelable("arguments_search_context", searchContext);
        }
        ArrayList<String> arrayList = this.A0P;
        if (arrayList != null) {
            bundle.putStringArrayList("ReelViewerFragment.ARGUMENTS_KEY_EARNED_ACHIEVEMENT_IDS", arrayList);
        }
        String str10 = this.A0A;
        if (str10 != null) {
            bundle.putString("ReelViewerFragment.ARGUMENTS_KEY_ACHIEVEMENT_ENTRY_POINT", str10);
        }
        C3G5 c3g5 = this.A05;
        if (c3g5 != null) {
            bundle.putSerializable("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_MEDIA_REQUEST_REASON", c3g5);
        }
        bundle.putBoolean("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_ENTERING_FROM_TRAY_END_CARD", this.A0U);
        Float f = this.A07;
        if (f != null) {
            bundle.putFloat("ReelViewerFragment.ARGUMENTS_KEY_STARTING_ITEM_PROGRESS", f.floatValue());
        }
        String str11 = this.A0I;
        if (str11 != null) {
            bundle.putString("ReelViewerFragment.ARGUMENTS_REEL_TRAY_TYPE", str11);
        }
        return bundle;
    }

    public final /* bridge */ /* synthetic */ void A04(Integer num) {
        int intValue = num.intValue();
        if (this.A0L == null) {
            this.A09 = Integer.valueOf(intValue);
            return;
        }
        throw new IllegalStateException("You're calling both setStartingItemIdInReel() and setStartingPositionInReel(). You should only be using one of them.");
    }
}
