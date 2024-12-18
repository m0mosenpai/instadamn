package X;

import com.facebook.R;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.1QO, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1QO implements InterfaceC11380iw, C1QP {
    public static final /* synthetic */ EnumEntries A07;
    public static final /* synthetic */ C1QO[] A08;
    public static final C1QO A09;
    public static final C1QO A0A;
    public static final C1QO A0B;
    public static final C1QO A0C;
    public static final C1QO A0D;
    public static final C1QO A0E;
    public static final C1QO A0F;
    public static final C1QO A0G;
    public static final String __redex_internal_original_name = "IgTab";
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public static C1QO valueOf(String str) {
        return (C1QO) Enum.valueOf(C1QO.class, str);
    }

    public static C1QO[] values() {
        return (C1QO[]) A08.clone();
    }

    @Override // X.C1QP
    public final String B8U() {
        return this.A04;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A05;
    }

    static {
        C1QO c1qo = new C1QO("FEED", "fragment_feed", "main_home", "feed_timeline", 0, R.id.feed_tab, R.drawable.tab_home_drawable, R.drawable.instagram_home_pano_filled_24, 2131963647);
        A0C = c1qo;
        C1QO c1qo2 = new C1QO("NEWS", "fragment_news", "main_inbox", "newsfeed_you", 1, R.id.news_tab, R.drawable.instagram_heart_selector, R.drawable.instagram_heart_pano_filled_24, 2131952201);
        A0D = c1qo2;
        C1QO c1qo3 = new C1QO("SHARE", "fragment_share", "main_camera", "tabbed_gallery_camera", 2, R.id.share_tab, R.drawable.tab_camera_drawable, R.drawable.instagram_new_post_pano_filled_24, 2131954578);
        A0G = c1qo3;
        C1QO c1qo4 = new C1QO("CREATION", "fragment_share", "main_camera", "tabbed_gallery_camera", 3, R.id.creation_tab, R.drawable.tab_camera_drawable, R.drawable.instagram_new_post_pano_filled_24, 2131956988);
        A0A = c1qo4;
        C1QO c1qo5 = new C1QO("SEARCH", "fragment_search", "main_search", "explore_popular", 4, R.id.search_tab, R.drawable.tab_search_drawable, R.drawable.instagram_search_pano_filled_24, 2131962005);
        A0F = c1qo5;
        C1QO c1qo6 = new C1QO("PROFILE", "fragment_profile", "main_profile", "self_profile", 5, R.id.profile_tab, R.drawable.tab_profile_drawable, R.drawable.instagram_user_circle_pano_filled_24, 2131970121);
        A0E = c1qo6;
        C1QO c1qo7 = new C1QO("CLIPS", "fragment_clips", "main_clips", "clips_viewer_clips_tab", 6, R.id.clips_tab, R.drawable.tab_clips_drawable, R.drawable.instagram_reels_pano_filled_24, 2131955936);
        A09 = c1qo7;
        C1QO c1qo8 = new C1QO("DIRECT", "fragment_direct_tab", "main_direct", "direct_inbox", 7, R.id.direct_tab, R.drawable.tab_direct_drawable, R.drawable.instagram_direct_pano_filled_24, 2131966348);
        A0B = c1qo8;
        C1QO[] c1qoArr = {c1qo, c1qo2, c1qo3, c1qo4, c1qo5, c1qo6, c1qo7, c1qo8, new C1QO("PRODUCER_PROFILE_PANEL", "fragment_producer_profile_panel", "producer_profile", "clips_producer_profile", 8, R.id.producer_profile_tab, R.drawable.tab_profile_drawable, R.drawable.instagram_user_circle_pano_filled_24, 2131970121)};
        A08 = c1qoArr;
        A07 = AbstractC12190kN.A00(c1qoArr);
    }

    public C1QO(String str, String str2, String str3, String str4, int i, int i2, int i3, int i4, int i5) {
        this.A03 = i2;
        this.A04 = str2;
        this.A06 = str3;
        this.A00 = i3;
        this.A02 = i4;
        this.A01 = i5;
        this.A05 = str4;
    }
}
