package X;

import com.instagram.api.schemas.RingSpecImpl;
import com.instagram.api.schemas.StoryPromptTappableData;
import com.instagram.api.schemas.TrackDataImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6lx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C148276lx {
    public static final C148276lx A0a;
    public static final C148276lx A0b;
    public static final C148276lx A0c;
    public static final C148276lx A0d;
    public static final C148276lx A0e;
    public static final C148276lx A0f;
    public static final C148276lx A0g;
    public static final C148276lx A0h;
    public static final C148276lx A0i;
    public static final C148276lx A0j;
    public static final C148276lx A0k;
    public static final C148276lx A0l;
    public static final C148276lx A0m;
    public static final C148276lx A0n;
    public static final C148276lx A0o;
    public static final C148276lx A0p;
    public static final C148276lx A0q;
    public static final C148276lx A0r;
    public static final C148276lx A0s;
    public static final C148276lx A0t;
    public static final C148276lx A0u;
    public static final C148276lx A0v;
    public static final C148276lx A0w;
    public static final C148276lx A0x;
    public static final C148276lx A0y;
    public static final C148276lx A0z;
    public static final C148276lx A10;
    public static final C148276lx A11;
    public static final C148276lx A12;
    public static final C148276lx A13;
    public static final C148276lx A14;
    public static final C148276lx A15;
    public static final C148276lx A16;
    public static final C148276lx A17;
    public static final C148276lx A18;
    public static final C148276lx A19;
    public static final C148276lx A1A;
    public static final C148276lx A1B;
    public static final C148276lx A1C;
    public static final C148276lx A1D;
    public static final C148276lx A1E;
    public static final C148276lx A1F;
    public static final C148276lx A1G;
    public static final C148276lx A1H;
    public static final C148276lx A1I;
    public static final C148276lx A1J;
    public static final C148276lx A1K;
    public static final C148276lx A1L;
    public static final C148276lx A1M;
    public static final C148276lx A1N;
    public static final C148276lx A1O;
    public static final C148276lx A1P;
    public static final C148276lx A1Q;
    public static final C148276lx A1R;
    public static final C148276lx A1S;
    public static final C148276lx A1T;
    public static final C148276lx A1U;
    public static final C148276lx A1V;
    public static final C148276lx A1W;
    public static final C148276lx A1X;
    public static final C148276lx A1Y;
    public static final C148276lx A1Z;
    public static final C148276lx A1a;
    public static final C148276lx A1b;
    public static final C148276lx A1c;
    public static final C148276lx A1d;
    public static final C148276lx A1e;
    public static final C148276lx A1f;
    public static final C148276lx A1g;
    public static final C148276lx A1h;
    public static final C148276lx A1i;
    public RingSpecImpl A00;
    public StoryPromptTappableData A01;
    public TrackDataImpl A02;
    public EnumC150226pU A03;
    public EnumC150226pU A04;
    public AA7 A05;
    public C38561qk A06;
    public Boolean A07;
    public Boolean A08;
    public Boolean A09;
    public Boolean A0A;
    public Boolean A0B;
    public Float A0C;
    public Float A0D;
    public Integer A0E;
    public Integer A0F;
    public Long A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public List A0M;
    public List A0N;
    public List A0O;
    public List A0P;
    public List A0Q;
    public List A0R;
    public List A0S;
    public List A0T;
    public List A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public final String A0Z;

    public C148276lx(EnumC150226pU enumC150226pU, String str, List list) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(list, 2);
        this.A0Z = str;
        this.A0O = list;
        this.A03 = enumC150226pU;
        this.A0P = C16930sl.A00;
        A03();
    }

    static {
        C148286ly c148286ly = new C148286ly();
        c148286ly.A0S = "time_sticker_digital";
        C148286ly c148286ly2 = new C148286ly();
        c148286ly2.A0S = "time_sticker_analog";
        C148286ly c148286ly3 = new C148286ly();
        c148286ly3.A0S = "time_sticker_text";
        A1c = new C148276lx(EnumC150226pU.A1j, "time_sticker_id", AbstractC16960so.A1M(c148286ly, c148286ly2, c148286ly3));
        C148286ly c148286ly4 = new C148286ly();
        c148286ly4.A0S = "location_sticker_vibrant";
        C148286ly c148286ly5 = new C148286ly();
        c148286ly5.A0S = "location_sticker_subtle";
        A1d = new C148276lx(EnumC150226pU.A1k, "location_sticker_id", AbstractC16960so.A1M(c148286ly4, c148286ly5));
        C148286ly c148286ly6 = new C148286ly();
        c148286ly6.A0S = "captions_sticker_default";
        A13 = new C148276lx(EnumC150226pU.A0s, "captions_sticker_id", AbstractC16960so.A1M(c148286ly6));
        C148286ly c148286ly7 = new C148286ly();
        c148286ly7.A0S = "countdown_sticker_time";
        A0f = new C148276lx(EnumC150226pU.A0K, "countdown_sticker_bundle_id", AbstractC16960so.A1M(c148286ly7));
        C148286ly c148286ly8 = new C148286ly();
        c148286ly8.A0S = "fundraiser_sticker_id";
        A0q = new C148276lx(EnumC150226pU.A0a, "fundraiser_sticker_bundle_id", AbstractC16960so.A1M(c148286ly8));
        C148286ly c148286ly9 = new C148286ly();
        c148286ly9.A0S = "fb_community_tap_state_id_key";
        A0k = new C148276lx(EnumC150226pU.A0S, "fb_community_sticker_id", AbstractC16960so.A1M(c148286ly9));
        C148286ly c148286ly10 = new C148286ly();
        c148286ly10.A0S = "fb_tag_tap_state_id_key";
        A0l = new C148276lx(EnumC150226pU.A0T, "fb_tag_sticker_id", AbstractC16960so.A1M(c148286ly10));
        C148286ly c148286ly11 = new C148286ly();
        c148286ly11.A0S = "polling_sticker_vibrant";
        A1F = new C148276lx(EnumC150226pU.A1C, "poll_sticker_bundle_id", AbstractC16960so.A1M(c148286ly11));
        C148286ly c148286ly12 = new C148286ly();
        c148286ly12.A0S = "polling_sticker_v2";
        A1G = new C148276lx(EnumC150226pU.A1D, "poll_sticker_v2_bundle_id", AbstractC16960so.A1M(c148286ly12));
        C148286ly c148286ly13 = new C148286ly();
        c148286ly13.A0S = "question_sticker_ama";
        A1J = new C148276lx(EnumC150226pU.A1J, "question_sticker_bundle_id", AbstractC16960so.A1M(c148286ly13));
        C148286ly c148286ly14 = new C148286ly();
        c148286ly14.A0S = "text_sticker_item_id";
        A1b = new C148276lx(EnumC150226pU.A1i, "text_sticker_bundle_id", AbstractC16960so.A1M(c148286ly14));
        C148286ly c148286ly15 = new C148286ly();
        c148286ly15.A0S = "quiz_story_sticker_default";
        A1L = new C148276lx(EnumC150226pU.A1M, "quiz_sticker_bundle_id", AbstractC16960so.A1M(c148286ly15));
        C148286ly c148286ly16 = new C148286ly();
        c148286ly16.A0S = "gif_sticker_subtle";
        A0s = new C148276lx(EnumC150226pU.A0g, "gif_search_sticker_id", AbstractC16960so.A1M(c148286ly16));
        C148286ly c148286ly17 = new C148286ly();
        c148286ly17.A0S = "avatar_search_sticker_default";
        A0b = new C148276lx(EnumC150226pU.A0B, "avatar_sticker_id", AbstractC16960so.A1M(c148286ly17));
        C148286ly c148286ly18 = new C148286ly();
        c148286ly18.A0S = "gallery_browse_sticker_subtle";
        A0r = new C148276lx(EnumC150226pU.A0d, "gallery_sticker_bundle_id", AbstractC16960so.A1M(c148286ly18));
        C148286ly c148286ly19 = new C148286ly();
        c148286ly19.A0S = "internal_sticker_vibrant";
        C148286ly c148286ly20 = new C148286ly();
        c148286ly20.A0S = "internal_sticker_subtle";
        A10 = new C148276lx(EnumC150226pU.A0p, "internal_sticker_bundle_id", AbstractC16960so.A1M(c148286ly19, c148286ly20));
        C148286ly c148286ly21 = new C148286ly();
        c148286ly21.A0S = "mention_sticker_valentines";
        C148286ly c148286ly22 = new C148286ly();
        c148286ly22.A0S = "mention_sticker_gradient";
        C148286ly c148286ly23 = new C148286ly();
        c148286ly23.A0S = "mention_sticker_subtle";
        C148286ly c148286ly24 = new C148286ly();
        c148286ly24.A0S = "mention_sticker_rainbow";
        C148286ly c148286ly25 = new C148286ly();
        c148286ly25.A0S = "mention_sticker_hero";
        C148286ly c148286ly26 = new C148286ly();
        c148286ly26.A0S = "mention_sticker_anti_valentines";
        C148286ly c148286ly27 = new C148286ly();
        c148286ly27.A0S = "hidden_mention_sticker_id";
        A19 = new C148276lx(EnumC150226pU.A11, "mention_sticker_id", AbstractC16960so.A1M(c148286ly21, c148286ly22, c148286ly23, c148286ly24, c148286ly25, c148286ly26, c148286ly27));
        C148286ly c148286ly28 = new C148286ly();
        c148286ly28.A0S = "photo_cred_default";
        A1C = new C148276lx(EnumC150226pU.A18, "photo_cred_sticker_id", AbstractC16960so.A1M(c148286ly28));
        C148286ly c148286ly29 = new C148286ly();
        c148286ly29.A0S = "hashtag_sticker_gradient";
        C148286ly c148286ly30 = new C148286ly();
        c148286ly30.A0S = "hashtag_sticker_subtle";
        C148286ly c148286ly31 = new C148286ly();
        c148286ly31.A0S = "hashtag_sticker_rainbow_gradient";
        C148286ly c148286ly32 = new C148286ly();
        c148286ly32.A0S = "hashtag_sticker_hero_gradient";
        A0v = new C148276lx(EnumC150226pU.A0k, "hashtag_sticker_id", AbstractC16960so.A1M(c148286ly29, c148286ly30, c148286ly31, c148286ly32));
        C148286ly c148286ly33 = new C148286ly();
        c148286ly33.A0S = "feature_linking_sticker_id";
        A0w = new C148276lx(EnumC150226pU.A0l, "feature_linking_sticker_id", AbstractC16960so.A1M(c148286ly33));
        C148286ly c148286ly34 = new C148286ly();
        c148286ly34.A0S = "election_sticker_vibrant";
        C148286ly c148286ly35 = new C148286ly();
        c148286ly35.A0S = "election_sticker_subtle";
        A0i = new C148276lx(EnumC150226pU.A0P, "election_sticker_id", AbstractC16960so.A1M(c148286ly34, c148286ly35));
        C148286ly c148286ly36 = new C148286ly();
        c148286ly36.A0S = "memories";
        C148286ly c148286ly37 = new C148286ly();
        c148286ly37.A0S = "on_this_day";
        A18 = new C148276lx(EnumC150226pU.A10, "memories_sticker_id", AbstractC16960so.A1M(c148286ly36, c148286ly37));
        C148286ly c148286ly38 = new C148286ly();
        c148286ly38.A0S = "voter_registration_sticker_id";
        A1g = new C148276lx(EnumC150226pU.A1n, "voter_registration_sticker_id", AbstractC16960so.A1M(c148286ly38));
        A1S = AbstractC148296lz.A07(EnumC150226pU.A1Y, "smb_support_sticker_bundle_id", "smb_support_sticker_bundle_id");
        A1Q = AbstractC148296lz.A07(EnumC150226pU.A1W, "smb_delivery_sticker_bundle_id", "smb_delivery_sticker_bundle_id");
        A1R = AbstractC148296lz.A07(EnumC150226pU.A1X, "get_quote_sticker_bundle_id", "get_quote_sticker_bundle_id");
        A1Z = AbstractC148296lz.A07(EnumC150226pU.A1g, "share_professional_profile_sticker_bundle_id", "share_professional_profile_sticker_bundle_id");
        C148286ly c148286ly39 = new C148286ly();
        c148286ly39.A0S = "vibrant_whatsapp_sticker_id";
        C148286ly c148286ly40 = new C148286ly();
        c148286ly40.A0S = "subtle_whatsapp_sticker_id";
        C148286ly c148286ly41 = new C148286ly();
        c148286ly41.A0S = "vibrant_chats_on_whatsapp_sticker_id";
        C148286ly c148286ly42 = new C148286ly();
        c148286ly42.A0S = "subtle_chats_on_whatsapp_sticker_id";
        A1h = new C148276lx(EnumC150226pU.A1p, "whatsapp_sticker_bundle_id", AbstractC16960so.A1M(c148286ly39, c148286ly40, c148286ly41, c148286ly42));
        A1H = AbstractC148296lz.A07(EnumC150226pU.A1G, "profile_sticker_bundle_id", "profile_sticker_bundle_id");
        A1X = AbstractC148296lz.A07(EnumC150226pU.A1e, "amplify_black_business_sticker_bundle_id", "amplify_black_business_sticker_bundle_id");
        A1Y = AbstractC148296lz.A07(EnumC150226pU.A1f, "support_personalized_ads_sticker_id", "support_personalized_ads_sticker_id");
        A0u = AbstractC148296lz.A07(EnumC150226pU.A0i, "group_poll_sticker_id", "group_poll_sticker_id");
        A1e = AbstractC148296lz.A07(EnumC150226pU.A1l, "upcoming_event_sticker_id", "upcoming_event_sticker_id");
        A0j = AbstractC148296lz.A07(EnumC150226pU.A0Q, "event_sticker_id", "event_sticker_id");
        A1N = AbstractC148296lz.A07(EnumC150226pU.A1P, "reshare_sticker_bundle_id", "reshare_sticker_bundle_id");
        C148286ly c148286ly43 = new C148286ly();
        c148286ly43.A0S = "link_sticker_default";
        C148286ly c148286ly44 = new C148286ly();
        c148286ly44.A0S = "link_sticker_subtle";
        C148286ly c148286ly45 = new C148286ly();
        c148286ly45.A0S = "link_sticker_black_white";
        C148286ly c148286ly46 = new C148286ly();
        c148286ly46.A0S = "link_sticker_hero";
        A14 = new C148276lx(EnumC150226pU.A0u, "link_sticker_bundle_id", AbstractC16960so.A1M(c148286ly43, c148286ly44, c148286ly45, c148286ly46));
        A1f = AbstractC148296lz.A07(EnumC150226pU.A1m, "badges_supporter_thank_you_sticker_bundle_id", "badges_supporter_thank_you_sticker_bundle_id");
        A1V = AbstractC148296lz.A07(EnumC150226pU.A1c, "subscriptions_sticker_bundle_id", "subscriptions_sticker_bundle_id");
        A1P = AbstractC148296lz.A07(EnumC150226pU.A0R, "explore_shareable_grid", "explore_shareable_grid");
        A1I = AbstractC148296lz.A07(EnumC150226pU.A1I, "public_collection", "public_collection");
        C148286ly c148286ly47 = new C148286ly();
        c148286ly47.A0S = "i_take_care_dynamic_sticker_default";
        A11 = new C148276lx(EnumC150226pU.A0q, "i_take_care_dynamic_sticker_bundle_id", AbstractC16960so.A1M(c148286ly47));
        C148286ly c148286ly48 = new C148286ly();
        c148286ly48.A0S = "reels_visual_replies_sticker_light";
        C148286ly c148286ly49 = new C148286ly();
        c148286ly49.A0S = "reels_visual_replies_sticker_dark";
        C148286ly c148286ly50 = new C148286ly();
        c148286ly50.A0S = "reels_visual_replies_sticker_gradient_purple";
        C148286ly c148286ly51 = new C148286ly();
        c148286ly51.A0S = "reels_visual_replies_sticker_gradient_green";
        C148286ly c148286ly52 = new C148286ly();
        c148286ly52.A0S = "reels_visual_replies_sticker_gradient_orange";
        C148286ly c148286ly53 = new C148286ly();
        c148286ly53.A0S = "reels_visual_replies_sticker_gradient_pink";
        C148286ly c148286ly54 = new C148286ly();
        c148286ly54.A0S = "reels_visual_replies_sticker_flat_red";
        C148286ly c148286ly55 = new C148286ly();
        c148286ly55.A0S = "reels_visual_replies_sticker_flat_orange";
        C148286ly c148286ly56 = new C148286ly();
        c148286ly56.A0S = "reels_visual_replies_sticker_flat_green";
        C148286ly c148286ly57 = new C148286ly();
        c148286ly57.A0S = "reels_visual_replies_sticker_flat_blue";
        C148286ly c148286ly58 = new C148286ly();
        c148286ly58.A0S = "reels_visual_replies_sticker_flat_purple";
        A1M = new C148276lx(EnumC150226pU.A1O, "reels_visual_replies_sticker_bundle_id", AbstractC16960so.A1M(c148286ly48, c148286ly49, c148286ly50, c148286ly51, c148286ly52, c148286ly53, c148286ly54, c148286ly55, c148286ly56, c148286ly57, c148286ly58));
        C148286ly c148286ly59 = new C148286ly();
        c148286ly59.A0S = "before_and_after_story_sticker";
        A0c = new C148276lx(EnumC150226pU.A0D, "before_and_after_sticker_bundle_id", AbstractC16960so.A1M(c148286ly59));
        C148286ly c148286ly60 = new C148286ly();
        c148286ly60.A0S = "join_chat_sticker_default_id";
        A12 = new C148276lx(EnumC150226pU.A0r, "join_chat_sticker_bundle_id", AbstractC16960so.A1M(c148286ly60));
        C148286ly c148286ly61 = new C148286ly();
        c148286ly61.A0S = "subscriber_chat_sticker_default_id";
        A1U = new C148276lx(EnumC150226pU.A1b, "subscriber_chat_sticker_bundle_id", AbstractC16960so.A1M(c148286ly61));
        C148286ly c148286ly62 = new C148286ly();
        c148286ly62.A0S = "group_mention_sticker_bundle_id";
        A0t = new C148276lx(EnumC150226pU.A0h, "group_mention_sticker_bundle_id", AbstractC16960so.A1M(c148286ly62));
        C148286ly c148286ly63 = new C148286ly();
        c148286ly63.A0S = "superlative_sticker_bundle_id";
        A1W = new C148276lx(EnumC150226pU.A1d, "superlative_sticker_bundle_id", AbstractC16960so.A1M(c148286ly63));
        A0p = AbstractC148296lz.A07(EnumC150226pU.A0Z, "follower_milestone_sticker_id", "follower_milestone_sticker_id");
        A1T = AbstractC148296lz.A07(EnumC150226pU.A1Z, "stories_template_sticker_bundle_id", "stories_template_sticker_bundle_id");
        A0g = AbstractC148296lz.A07(EnumC150226pU.A0N, "cut_out_sticker_bundle_id", "cut_out_sticker_bundle_id");
        A1E = AbstractC148296lz.A07(EnumC150226pU.A1B, "polaroid_sticker_bundle_id", "polaroid_sticker_bundle_id");
        A1a = AbstractC148296lz.A07(EnumC150226pU.A1h, "swappable_gallery_sticker_bundle_id", "swappable_gallery_sticker_bundle_id");
        A1O = AbstractC148296lz.A07(EnumC150226pU.A1Q, "secret_sticker_bundle_id", "secret_sticker_bundle_id");
        C148286ly c148286ly64 = new C148286ly();
        c148286ly64.A0S = "add_yours_backdrop_sticker_default";
        A15 = new C148276lx(EnumC150226pU.A0v, "magic_mod_add_yours_backdrop_sticker_bundle_id", AbstractC16960so.A1M(c148286ly64));
        C148286ly c148286ly65 = new C148286ly();
        c148286ly65.A0S = "backdrop_sticker_default";
        C148286ly c148286ly66 = new C148286ly();
        c148286ly66.A0S = "backdrop_sticker_dominant_color";
        A16 = new C148276lx(EnumC150226pU.A0w, "magic_mod_backdrop_sticker_bundle_id", AbstractC16960so.A1M(c148286ly65, c148286ly66));
        C148286ly c148286ly67 = new C148286ly();
        c148286ly67.A0S = "restyle_sticker_default";
        C148286ly c148286ly68 = new C148286ly();
        c148286ly68.A0S = "restyle_sticker_dominant_color";
        A17 = new C148276lx(EnumC150226pU.A0x, "magic_mod_restyle_sticker_bundle_id", AbstractC16960so.A1M(c148286ly67, c148286ly68));
        A0y = AbstractC148296lz.A07(EnumC150226pU.A0n, "genai_imagine_template_sticker_bundle_id", "genai_imagine_template_sticker_bundle_id");
        A0x = AbstractC148296lz.A07(EnumC150226pU.A0m, "genai_imagine_me_sticker_bundle_id", "genai_imagine_me_sticker_bundle_id");
        A0h = AbstractC148296lz.A07(EnumC150226pU.A0O, "election_add_yours_sticker_id", "election_add_yours_sticker_id");
        A1B = AbstractC148296lz.A07(EnumC150226pU.A17, "notify_me_sticker_bundle_id", "notify_me_sticker_bundle_id");
        A0a = AbstractC148296lz.A07(EnumC150226pU.A03, "achievements_sticker_id", "achievements_sticker_id");
        A1A = AbstractC148296lz.A07(EnumC150226pU.A14, "music_pick_sticker_bundle_id", "music_pick_sticker_bundle_id");
        A0o = AbstractC148296lz.A07(EnumC150226pU.A0X, "fitness_sticker_bundle_id", "fitness_sticker_bundle_id");
        C148286ly c148286ly69 = new C148286ly();
        c148286ly69.A0S = "ig_bio_product_sticker_id";
        A0d = new C148276lx(EnumC150226pU.A0E, "ig_bio_product_sticker_bundle_id", AbstractC16960so.A1M(c148286ly69));
        A0e = AbstractC148296lz.A07(EnumC150226pU.A0H, "channel_challenge_sticker_id", "channel_challenge_sticker_id");
        A0z = AbstractC148296lz.A07(EnumC150226pU.A0o, "instapal_sticker_bundle_id", "instapal_sticker_bundle_id");
        A1i = AbstractC148296lz.A07(EnumC150226pU.A0W, "fillable_text_sticker_bundle_id", "fillable_text_sticker_bundle_id");
        A0m = AbstractC148296lz.A07(EnumC150226pU.A0U, "fillable_gallery_sticker_bundle_id", "fillable_gallery_sticker_bundle_id");
        A0n = AbstractC148296lz.A07(EnumC150226pU.A0V, "fillable_music_sticker_bundle_id", "fillable_music_sticker_bundle_id");
        A1D = AbstractC148296lz.A07(EnumC150226pU.A19, "pics_please_question_sticker_bundle_id", "pics_please_question_sticker_bundle_id");
        A1K = AbstractC148296lz.A07(EnumC150226pU.A1L, "quicksnap_recap_bundle_id", "quicksnap_recap_bundle_id");
    }

    public final EnumC150226pU A00() {
        EnumC150226pU enumC150226pU = this.A04;
        if (enumC150226pU != null) {
            return enumC150226pU;
        }
        C14360o3.A0F("stickerType");
        throw C00O.createAndThrow();
    }

    public final ArrayList A01() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.A0O.iterator();
        while (it.hasNext()) {
            String str = ((C148286ly) it.next()).A0S;
            C14360o3.A07(str);
            arrayList.add(str);
        }
        return arrayList;
    }

    public final ArrayList A02() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.A0O.iterator();
        while (it.hasNext()) {
            String str = ((C148286ly) it.next()).A0a;
            C14360o3.A07(str);
            arrayList.add(str);
        }
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:216:0x03d3. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x03e4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x03b9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x03fa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x03b9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03() {
        /*
            Method dump skipped, instructions count: 1628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C148276lx.A03():void");
    }

    public final boolean A04() {
        String str = this.A0Z;
        if (!AbstractC002300n.A0h(str, "bloks_tappable_avatar_sticker_id", false) && !AbstractC002300n.A0h(str, "bloks_tappable_animated_avatar_sticker_id", false)) {
            return false;
        }
        return true;
    }
}
