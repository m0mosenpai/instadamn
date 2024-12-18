package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.AbstractC37302Gc3;
import X.C41855Ig9;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes12.dex */
public final class RemoteBooleanSettingId implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ RemoteBooleanSettingId[] A03;
    public static final RemoteBooleanSettingId A04;
    public static final RemoteBooleanSettingId A05;
    public static final RemoteBooleanSettingId A06;
    public static final RemoteBooleanSettingId A07;
    public static final RemoteBooleanSettingId A08;
    public static final RemoteBooleanSettingId A09;
    public static final RemoteBooleanSettingId A0A;
    public static final RemoteBooleanSettingId A0B;
    public static final RemoteBooleanSettingId A0C;
    public static final RemoteBooleanSettingId A0D;
    public static final RemoteBooleanSettingId A0E;
    public static final RemoteBooleanSettingId A0F;
    public static final RemoteBooleanSettingId A0G;
    public static final RemoteBooleanSettingId A0H;
    public static final RemoteBooleanSettingId A0I;
    public static final RemoteBooleanSettingId A0J;
    public static final RemoteBooleanSettingId A0K;
    public static final RemoteBooleanSettingId A0L;
    public static final RemoteBooleanSettingId A0M;
    public static final RemoteBooleanSettingId A0N;
    public static final RemoteBooleanSettingId A0O;
    public static final RemoteBooleanSettingId A0P;
    public static final RemoteBooleanSettingId A0Q;
    public static final RemoteBooleanSettingId A0R;
    public static final RemoteBooleanSettingId A0S;
    public static final RemoteBooleanSettingId A0T;
    public static final RemoteBooleanSettingId A0U;
    public static final RemoteBooleanSettingId A0V;
    public static final RemoteBooleanSettingId A0W;
    public static final RemoteBooleanSettingId A0X;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        RemoteBooleanSettingId remoteBooleanSettingId = new RemoteBooleanSettingId("UNRECOGNIZED", 0, "RemoteBooleanSettingId_unspecified");
        A0X = remoteBooleanSettingId;
        RemoteBooleanSettingId remoteBooleanSettingId2 = new RemoteBooleanSettingId("ACCOUNT_PRIVACY_SETTING", 1, "account_privacy_setting");
        A04 = remoteBooleanSettingId2;
        RemoteBooleanSettingId remoteBooleanSettingId3 = new RemoteBooleanSettingId("ALLOW_NOTES_ON_POSTS_AND_REELS", 2, "allow_notes_on_posts_and_reels");
        A05 = remoteBooleanSettingId3;
        RemoteBooleanSettingId remoteBooleanSettingId4 = new RemoteBooleanSettingId("ALLOW_PEOPLE_TO_DOWNLOAD_YOUR_REELS", 3, "allow_people_to_download_your_reels");
        A06 = remoteBooleanSettingId4;
        RemoteBooleanSettingId remoteBooleanSettingId5 = new RemoteBooleanSettingId("ALLOW_POST_AND_REEL_SHARING_TO_STORIES", 4, "allow_post_and_reel_sharing_to_stories");
        A08 = remoteBooleanSettingId5;
        RemoteBooleanSettingId remoteBooleanSettingId6 = new RemoteBooleanSettingId("ALLOW_POSTS_TO_BE_VISIBLE_IN_COLLECTIONS_SHARED_WITH_OTHERS", 5, "allow_posts_to_be_visible_in_collections_shared_with_others");
        A07 = remoteBooleanSettingId6;
        RemoteBooleanSettingId remoteBooleanSettingId7 = new RemoteBooleanSettingId("ALLOW_PROFILE_PICTURE_EXPANSION", 6, "allow_profile_picture_expansion");
        A09 = remoteBooleanSettingId7;
        RemoteBooleanSettingId remoteBooleanSettingId8 = new RemoteBooleanSettingId("ALLOW_REQUESTS_TO_FEATURE_YOUR_POSTS_IN_SHOPS", 7, "allow_requests_to_feature_your_posts_in_shops");
        A0A = remoteBooleanSettingId8;
        RemoteBooleanSettingId remoteBooleanSettingId9 = new RemoteBooleanSettingId("ALLOW_REUSE_OF_FEED_VIDEOS", 8, "allow_reuse_of_feed_videos");
        A0B = remoteBooleanSettingId9;
        RemoteBooleanSettingId remoteBooleanSettingId10 = new RemoteBooleanSettingId("ALLOW_REUSE_OF_POSTS", 9, "allow_reuse_of_posts");
        A0C = remoteBooleanSettingId10;
        RemoteBooleanSettingId remoteBooleanSettingId11 = new RemoteBooleanSettingId("ALLOW_REUSE_OF_REELS", 10, "allow_reuse_of_reels");
        A0D = remoteBooleanSettingId11;
        RemoteBooleanSettingId remoteBooleanSettingId12 = new RemoteBooleanSettingId("ALLOW_STORY_SHARING_IN_MESSAGES", 11, "allow_story_sharing_in_messages");
        A0E = remoteBooleanSettingId12;
        RemoteBooleanSettingId remoteBooleanSettingId13 = new RemoteBooleanSettingId("ARCHIVING_SAVE_LIVE_TO_ARCHIVE", 12, "archiving_save_live_to_archive");
        A0F = remoteBooleanSettingId13;
        RemoteBooleanSettingId remoteBooleanSettingId14 = new RemoteBooleanSettingId("ARCHIVING_SAVE_STORY_TO_ARCHIVE", 13, "archiving_save_story_to_archive");
        A0G = remoteBooleanSettingId14;
        RemoteBooleanSettingId remoteBooleanSettingId15 = new RemoteBooleanSettingId("ARCHIVING_SAVE_STORY_TO_CAMERA_GALLERY", 14, "archiving_save_story_to_camera_gallery");
        A0H = remoteBooleanSettingId15;
        RemoteBooleanSettingId remoteBooleanSettingId16 = new RemoteBooleanSettingId("ARCHIVING_SAVE_STORY_TO_GALLERY", 15, "archiving_save_story_to_gallery");
        A0I = remoteBooleanSettingId16;
        RemoteBooleanSettingId remoteBooleanSettingId17 = new RemoteBooleanSettingId("CUSTOM_WORDS_HIDE_COMMENTS", 16, "custom_words_hide_comments");
        A0J = remoteBooleanSettingId17;
        RemoteBooleanSettingId remoteBooleanSettingId18 = new RemoteBooleanSettingId("CUSTOM_WORDS_HIDE_MESSAGE_REQUESTS", 17, "custom_words_hide_message_requests");
        A0K = remoteBooleanSettingId18;
        RemoteBooleanSettingId remoteBooleanSettingId19 = new RemoteBooleanSettingId("HIDDEN_WORDS_ADVANCED_COMMENT_FILTERING", 18, "hidden_words_advanced_comment_filtering");
        A0L = remoteBooleanSettingId19;
        RemoteBooleanSettingId remoteBooleanSettingId20 = new RemoteBooleanSettingId("HIDDEN_WORDS_GLOBAL_BLOCKLIST", 19, "hidden_words_global_blocklist");
        A0M = remoteBooleanSettingId20;
        RemoteBooleanSettingId remoteBooleanSettingId21 = new RemoteBooleanSettingId("HIDDEN_WORDS_HIDE_COMMENTS", 20, "hidden_words_hide_comments");
        A0N = remoteBooleanSettingId21;
        RemoteBooleanSettingId remoteBooleanSettingId22 = new RemoteBooleanSettingId("HIDDEN_WORDS_HIDE_MESSAGE_REQUESTS", 21, "hidden_words_hide_message_requests");
        A0O = remoteBooleanSettingId22;
        RemoteBooleanSettingId remoteBooleanSettingId23 = new RemoteBooleanSettingId("IS_SLEEP_MODE_ENABLED", 22, "is_sleep_mode_enabled");
        A0P = remoteBooleanSettingId23;
        RemoteBooleanSettingId remoteBooleanSettingId24 = new RemoteBooleanSettingId("MESSAGE_REACHABILITY_LINKED_PAGE_DIRECT_MESSAGE", 23, "message_reachability_linked_page_direct_message");
        A0Q = remoteBooleanSettingId24;
        RemoteBooleanSettingId remoteBooleanSettingId25 = new RemoteBooleanSettingId("RECOMMEND_ON_FACEBOOK", 24, "recommend_on_facebook");
        A0R = remoteBooleanSettingId25;
        RemoteBooleanSettingId remoteBooleanSettingId26 = new RemoteBooleanSettingId("SEO_INDEXING_OPT_OUT", 25, "seo_indexing_opt_out");
        A0S = remoteBooleanSettingId26;
        RemoteBooleanSettingId remoteBooleanSettingId27 = new RemoteBooleanSettingId("SERVER_TEST_ONLY_DO_NOT_USE", 26, "server_test_only_do_not_use");
        A0T = remoteBooleanSettingId27;
        RemoteBooleanSettingId remoteBooleanSettingId28 = new RemoteBooleanSettingId("TAGS_MENTIONS_HOW_YOU_MANAGE_BOOSTS_RESHARE_MEDIA", 27, "tags_mentions_how_you_manage_boosts_reshare_media");
        A0U = remoteBooleanSettingId28;
        RemoteBooleanSettingId remoteBooleanSettingId29 = new RemoteBooleanSettingId("TAGS_MENTIONS_WHO_CAN_BOOST", 28, "tags_mentions_who_can_boost");
        A0V = remoteBooleanSettingId29;
        RemoteBooleanSettingId remoteBooleanSettingId30 = new RemoteBooleanSettingId("TAGS_MENTIONS_WHO_CAN_TAG_ON_OTHER_APPS", 29, "tags_mentions_who_can_tag_on_other_apps");
        A0W = remoteBooleanSettingId30;
        RemoteBooleanSettingId[] remoteBooleanSettingIdArr = new RemoteBooleanSettingId[30];
        System.arraycopy(new RemoteBooleanSettingId[]{remoteBooleanSettingId, remoteBooleanSettingId2, remoteBooleanSettingId3, remoteBooleanSettingId4, remoteBooleanSettingId5, remoteBooleanSettingId6, remoteBooleanSettingId7, remoteBooleanSettingId8, remoteBooleanSettingId9, remoteBooleanSettingId10, remoteBooleanSettingId11, remoteBooleanSettingId12, remoteBooleanSettingId13, remoteBooleanSettingId14, remoteBooleanSettingId15, remoteBooleanSettingId16, remoteBooleanSettingId17, remoteBooleanSettingId18, remoteBooleanSettingId19, remoteBooleanSettingId20, remoteBooleanSettingId21, remoteBooleanSettingId22, remoteBooleanSettingId23, remoteBooleanSettingId24, remoteBooleanSettingId25, remoteBooleanSettingId26, remoteBooleanSettingId27}, 0, remoteBooleanSettingIdArr, 0, 27);
        System.arraycopy(new RemoteBooleanSettingId[]{remoteBooleanSettingId28, remoteBooleanSettingId29, remoteBooleanSettingId30}, 0, remoteBooleanSettingIdArr, 27, 3);
        A03 = remoteBooleanSettingIdArr;
        A02 = AbstractC12190kN.A00(remoteBooleanSettingIdArr);
        RemoteBooleanSettingId[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC37302Gc3.A01(values.length));
        for (RemoteBooleanSettingId remoteBooleanSettingId31 : values) {
            A18.put(remoteBooleanSettingId31.A00, remoteBooleanSettingId31);
        }
        A01 = A18;
        CREATOR = new C41855Ig9(90);
    }

    public static RemoteBooleanSettingId valueOf(String str) {
        return (RemoteBooleanSettingId) Enum.valueOf(RemoteBooleanSettingId.class, str);
    }

    public static RemoteBooleanSettingId[] values() {
        return (RemoteBooleanSettingId[]) A03.clone();
    }

    public RemoteBooleanSettingId(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
