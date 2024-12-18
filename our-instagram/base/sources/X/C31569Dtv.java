package X;

import android.os.Bundle;
import com.instagram.feed.intf.ContextualFeedNetworkConfig;
import com.instagram.search.common.analytics.SearchContext;
import instagram.features.feed.fragment.ContextualFeedFragment;
import java.util.ArrayList;

/* renamed from: X.Dtv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31569Dtv {
    public Bundle A00;
    public Bundle A01;
    public C11520jB A02;
    public ContextualFeedNetworkConfig A03;
    public SearchContext A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public ArrayList A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public final String A0G;

    public static Bundle A02(Bundle bundle, Bundle bundle2, String str, String str2, String str3, String str4, String str5, String str6, ArrayList arrayList) {
        return A01(bundle, bundle2, null, null, null, null, str, str2, null, str3, str4, str5, null, str6, null, null, arrayList, 0, 0, 0, false, false, false, false, false, true);
    }

    public static Bundle A03(Bundle bundle, C11520jB c11520jB, ContextualFeedNetworkConfig contextualFeedNetworkConfig, SearchContext searchContext, String str, String str2, String str3, String str4, String str5, String str6, String str7, ArrayList arrayList, boolean z, boolean z2) {
        return A01(bundle, null, c11520jB, contextualFeedNetworkConfig, searchContext, str, str2, str3, null, str4, str5, null, str6, str7, null, null, arrayList, 0, 0, 0, false, false, z, false, z2, true);
    }

    public static Bundle A04(Bundle bundle, String str, String str2, String str3, String str4, String str5, String str6, ArrayList arrayList) {
        return A00(null, bundle, null, null, null, null, str, str2, null, str3, str4, null, null, null, null, str5, null, null, str6, null, arrayList, 0, false, false, false, false, false, false, false, false, true, false);
    }

    public static Bundle A05(Bundle bundle, String str, String str2, String str3, String str4, String str5, String str6, ArrayList arrayList, boolean z, boolean z2, boolean z3, boolean z4) {
        return A00(null, bundle, null, null, null, null, str, str2, null, str3, str4, null, str5, null, null, null, null, null, str6, null, arrayList, 0, false, z, false, false, false, false, z2, false, z3, z4);
    }

    public static Bundle A06(Bundle bundle, String str, String str2, String str3, String str4, String str5, ArrayList arrayList) {
        return A00(null, bundle, null, null, null, null, str, str2, null, str3, str4, null, null, null, null, null, null, null, str5, null, arrayList, 0, false, false, false, false, false, false, false, false, true, false);
    }

    public final void A09(C37330GcY c37330GcY) {
        C14360o3.A0B(c37330GcY, 0);
        Bundle bundle = this.A00;
        if (bundle == null) {
            bundle = AbstractC166987dD.A0b();
            this.A00 = bundle;
        }
        c37330GcY.A01(bundle);
    }

    public final void A0A(ArrayList arrayList) {
        C14360o3.A0B(arrayList, 0);
        this.A0B = arrayList;
    }

    public final ContextualFeedFragment A08() {
        ContextualFeedFragment contextualFeedFragment = new ContextualFeedFragment();
        contextualFeedFragment.setArguments(A07());
        return contextualFeedFragment;
    }

    public C31569Dtv(String str) {
        this.A0G = str;
    }

    public final Bundle A07() {
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("ContextualFeedFragment.ARGUMENT_MEDIA_INITIAL_POSITION", this.A08);
        A0b.putStringArrayList("ContextualFeedFragment.ARGUMENT_MEDIA_ID_LIST", this.A0B);
        A0b.putString("ContextualFeedFragment.ARGUMENT_FEED_TITLE", this.A07);
        A0b.putString("ContextualFeedFragment.ARGUMENT_FEED_SUBTITLE", null);
        A0b.putBoolean("ContextualFeedFragment.ARGUMENT_IS_NAVIGATION_FROM_FULL_AUDIENCE_MEDIA_GRID", false);
        A0b.putString("ContextualFeedFragment.ARGUMENT_TAB_ANALYTICS_NAME", null);
        A0b.putString("ContextualFeedFragment.ARGUMENT_MODULE_NAME", this.A0G);
        A0b.putString("ContextualFeedFragment.ARGUMENT_NEXT_MAX_ID", null);
        A0b.putString("ContextualFeedFragment.ARGUMENT_GROUP_ID", null);
        A0b.putBoolean("ContextualFeedFragment.ARGUMENT_IS_WARM_START", false);
        A0b.putString("ContextualFeedFragment.ARGUMENT_CONTEXTUAL_FEED_MODE", this.A06);
        A0b.putParcelable("ContextualFeedFragment.ARGUMENT_NETWORK_CONFIG", this.A03);
        A0b.putBoolean("ContextualFeedFragment.ARGUMENT_SHOULD_SHOW_EDIT_IN_ACTION_BAR", false);
        A0b.putBoolean("ContextualFeedFragment.ARGUMENT_SHOW_ACTION_BAR_WHEN_SCROLL_DOWN", this.A0F);
        A0b.putString("ContextualFeedFragment.ARGUMENT_PAGINATION_SOURCE", null);
        A0b.putString("ContextualFeedFragment.ARGUMENT_PRIOR_MODULE", this.A09);
        A0b.putBundle("ContextualFeedFragment.ARGUMENT_EXTRA_ANALYTICS", this.A00);
        Bundle bundle = this.A01;
        if (bundle != null) {
            A0b.putAll(bundle);
        }
        A0b.putString("ContextualFeedFragment.ARGUMENT_SESSION_ID", this.A0A);
        C11520jB c11520jB = this.A02;
        if (c11520jB != null) {
            A0b.putSerializable("ContextualFeedFragment.ARGUMENT_NAVIGATION_EVENT_EXTRA.V2", c11520jB);
        }
        A0b.putBoolean("ContextualFeedFragment.ARGUMENT_IS_ELIGIBLE_FOR_REALTIME_SIGNAL_REPORTING", this.A0C);
        A0b.putBoolean("ContextualFeedFragment.ARGUMENT_SET_PAGING", false);
        A0b.putString("ContextualFeedFragment.ARGUMENT_RESHARE_TARGET", null);
        A0b.putBoolean("ContextualFeedFragment.ARGUMENT_SHOULD_HIDE_UFI_BUTTONS", this.A0D);
        A0b.putInt("ContextualFeedFragment.ARGUMENT_GRID_INDEX", 0);
        String str = this.A05;
        if (str != null) {
            A0b.putString("ContextualFeedFragment.ARGUMENT_CONTENT_SCHEDULING_ENTRY_POINT", str);
        }
        A0b.putBoolean("ContextualFeedFragment.ARGUMENT_SHOULD_OPEN_CAROUSEL_INDEX_OF_TAGGED_PHOTO", false);
        SearchContext searchContext = this.A04;
        if (searchContext != null) {
            A0b.putParcelable("ContextualFeedFragment.SEARCH_CONTEXT", searchContext);
        }
        A0b.putBoolean("ContextualFeedFragment.ARGUMENT_SHOULD_USE_BASE_DIFF_UTIL", true);
        A0b.putBoolean("ContextualFeedFragment.ARGUMENT_USER_ELIGIBLE_FOR_PROFILE_FEED_AD", true);
        A0b.putBoolean("ContextualFeedFragment.ARGUMENT_IS_HUNT_AND_PECK_ENTRY", false);
        A0b.putBoolean("ContextualFeedFragment.ARGUMENT_IS_FROM_NOTIFICATION", false);
        A0b.putBoolean("ContextualFeedFragment.ARGUMENT_SHOULD_SHOW_BOOST_GUIDANCE_BAR", this.A0E);
        A0b.putBoolean("ContextualFeedFragment.ARGUMENT_SHOULD_SHOW_TOP_STICKY_BANNER", false);
        return A0b;
    }

    public static Bundle A00(Bundle bundle, Bundle bundle2, C11520jB c11520jB, ContextualFeedNetworkConfig contextualFeedNetworkConfig, SearchContext searchContext, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, ArrayList arrayList, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        Bundle A05 = AbstractC31179DnN.A05(str4, str2, arrayList, z4);
        A05.putString("ContextualFeedFragment.ARGUMENT_TAB_ANALYTICS_NAME", str14);
        A05.putString("ContextualFeedFragment.ARGUMENT_MODULE_NAME", str5);
        A05.putString("ContextualFeedFragment.ARGUMENT_NEXT_MAX_ID", str6);
        A05.putString("ContextualFeedFragment.ARGUMENT_GROUP_ID", str3);
        A05.putBoolean("ContextualFeedFragment.ARGUMENT_IS_WARM_START", z5);
        A05.putString("ContextualFeedFragment.ARGUMENT_CONTEXTUAL_FEED_MODE", str);
        A05.putParcelable("ContextualFeedFragment.ARGUMENT_NETWORK_CONFIG", contextualFeedNetworkConfig);
        A05.putBoolean("ContextualFeedFragment.ARGUMENT_SHOULD_SHOW_EDIT_IN_ACTION_BAR", z7);
        A05.putBoolean("ContextualFeedFragment.ARGUMENT_SHOW_ACTION_BAR_WHEN_SCROLL_DOWN", z10);
        A05.putString("ContextualFeedFragment.ARGUMENT_PAGINATION_SOURCE", str7);
        A05.putString("ContextualFeedFragment.ARGUMENT_PRIOR_MODULE", str10);
        A05.putBundle("ContextualFeedFragment.ARGUMENT_EXTRA_ANALYTICS", bundle);
        if (bundle2 != null) {
            A05.putAll(bundle2);
        }
        A05.putString("ContextualFeedFragment.ARGUMENT_SESSION_ID", str13);
        if (c11520jB != null) {
            A05.putSerializable("ContextualFeedFragment.ARGUMENT_NAVIGATION_EVENT_EXTRA.V2", c11520jB);
        }
        A05.putBoolean("ContextualFeedFragment.ARGUMENT_IS_ELIGIBLE_FOR_REALTIME_SIGNAL_REPORTING", z2);
        A05.putBoolean("ContextualFeedFragment.ARGUMENT_SET_PAGING", z);
        A05.putString("ContextualFeedFragment.ARGUMENT_RESHARE_TARGET", str11);
        A05.putBoolean("ContextualFeedFragment.ARGUMENT_SHOULD_HIDE_UFI_BUTTONS", z6);
        A05.putInt("ContextualFeedFragment.ARGUMENT_GRID_INDEX", i);
        A05.putBoolean("ContextualFeedFragment.ARGUMENT_SHOULD_OPEN_CAROUSEL_INDEX_OF_TAGGED_PHOTO", false);
        if (num != null) {
            A05.putInt(AbstractC111324zv.A00(3544), num.intValue());
        }
        if (searchContext != null) {
            A05.putParcelable("ContextualFeedFragment.SEARCH_CONTEXT", searchContext);
        }
        if (str12 != null) {
            A05.putString("ContextualFeedFragment.ARGUMENT_SEED_MEDIA_ID", str12);
        }
        if (str8 != null) {
            A05.putString("ContextualFeedFragment.ARGUMENT_PARENT_CAROUSEL_MEDIA_ID", str8);
        }
        if (str9 != null) {
            A05.putString("ContextualFeedFragment.ARGUMENT_PARENT_CAROUSEL_MEDIA_THUMBNAIL_URL", str9);
        }
        A05.putBoolean("ContextualFeedFragment.ARGUMENT_SHOULD_USE_BASE_DIFF_UTIL", z9);
        A05.putBoolean("ContextualFeedFragment.ARGUMENT_USER_ELIGIBLE_FOR_PROFILE_FEED_AD", true);
        A05.putBoolean("ContextualFeedFragment.ARGUMENT_IS_HUNT_AND_PECK_ENTRY", false);
        A05.putBoolean("ContextualFeedFragment.ARGUMENT_IS_FROM_NOTIFICATION", z3);
        A05.putBoolean("ContextualFeedFragment.ARGUMENT_SHOULD_SHOW_BOOST_GUIDANCE_BAR", false);
        A05.putBoolean("ContextualFeedFragment.ARGUMENT_SHOULD_SHOW_TOP_STICKY_BANNER", z8);
        return A05;
    }

    public static Bundle A01(Bundle bundle, Bundle bundle2, C11520jB c11520jB, ContextualFeedNetworkConfig contextualFeedNetworkConfig, SearchContext searchContext, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, ArrayList arrayList, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        Bundle A05 = AbstractC31179DnN.A05(str5, str3, arrayList, z2);
        A05.putString("ContextualFeedFragment.ARGUMENT_TAB_ANALYTICS_NAME", str11);
        A05.putString("ContextualFeedFragment.ARGUMENT_MODULE_NAME", str6);
        A05.putString("ContextualFeedFragment.ARGUMENT_NEXT_MAX_ID", null);
        A05.putString("ContextualFeedFragment.ARGUMENT_GROUP_ID", null);
        A05.putBoolean("ContextualFeedFragment.ARGUMENT_IS_WARM_START", false);
        A05.putString("ContextualFeedFragment.ARGUMENT_CONTEXTUAL_FEED_MODE", str2);
        A05.putParcelable("ContextualFeedFragment.ARGUMENT_NETWORK_CONFIG", contextualFeedNetworkConfig);
        A05.putBoolean("ContextualFeedFragment.ARGUMENT_SHOULD_SHOW_EDIT_IN_ACTION_BAR", z5);
        A05.putBoolean("ContextualFeedFragment.ARGUMENT_SHOW_ACTION_BAR_WHEN_SCROLL_DOWN", false);
        A05.putString("ContextualFeedFragment.ARGUMENT_PAGINATION_SOURCE", null);
        A05.putString("ContextualFeedFragment.ARGUMENT_PRIOR_MODULE", str7);
        A05.putBundle("ContextualFeedFragment.ARGUMENT_EXTRA_ANALYTICS", bundle);
        if (bundle2 != null) {
            A05.putAll(bundle2);
        }
        A05.putString("ContextualFeedFragment.ARGUMENT_SESSION_ID", str9);
        if (c11520jB != null) {
            A05.putSerializable("ContextualFeedFragment.ARGUMENT_NAVIGATION_EVENT_EXTRA.V2", c11520jB);
        }
        A05.putBoolean("ContextualFeedFragment.ARGUMENT_IS_ELIGIBLE_FOR_REALTIME_SIGNAL_REPORTING", false);
        A05.putBoolean("ContextualFeedFragment.ARGUMENT_SET_PAGING", false);
        A05.putString("ContextualFeedFragment.ARGUMENT_RESHARE_TARGET", null);
        A05.putBoolean("ContextualFeedFragment.ARGUMENT_SHOULD_HIDE_UFI_BUTTONS", z3);
        if (str10 != null) {
            A05.putString("ContextualFeedFragment.ARGUMENTS_SOURCE_MEDIA_ID", str10);
            A05.putInt("ContextualFeedFragment.ARGUMENTS_SOURCE_MEDIA_CAROUSEL_INDEX", i2);
            A05.putInt("ContextualFeedFragment.ARGUMENTS_SOURCE_MEDIA_POSITION", i3);
        }
        A05.putInt("ContextualFeedFragment.ARGUMENT_GRID_INDEX", i);
        if (str != null) {
            A05.putString("ContextualFeedFragment.ARGUMENT_CONTENT_SCHEDULING_ENTRY_POINT", str);
        }
        A05.putBoolean("ContextualFeedFragment.ARGUMENT_SHOULD_OPEN_CAROUSEL_INDEX_OF_TAGGED_PHOTO", z4);
        if (str4 != null) {
            A05.putString("ContextualFeedFragment.ARGUMENT_HOST_PROFILE_USER_ID", str4);
        }
        if (searchContext != null) {
            A05.putParcelable("ContextualFeedFragment.SEARCH_CONTEXT", searchContext);
        }
        if (str8 != null) {
            A05.putString("ContextualFeedFragment.ARGUMENT_SEED_MEDIA_ID", str8);
        }
        A05.putBoolean("ContextualFeedFragment.ARGUMENT_SHOULD_USE_BASE_DIFF_UTIL", true);
        A05.putBoolean("ContextualFeedFragment.ARGUMENT_USER_ELIGIBLE_FOR_PROFILE_FEED_AD", z6);
        A05.putBoolean("ContextualFeedFragment.ARGUMENT_IS_HUNT_AND_PECK_ENTRY", z);
        A05.putBoolean("ContextualFeedFragment.ARGUMENT_IS_FROM_NOTIFICATION", false);
        A05.putBoolean("ContextualFeedFragment.ARGUMENT_SHOULD_SHOW_BOOST_GUIDANCE_BAR", false);
        A05.putBoolean("ContextualFeedFragment.ARGUMENT_SHOULD_SHOW_TOP_STICKY_BANNER", false);
        return A05;
    }
}
