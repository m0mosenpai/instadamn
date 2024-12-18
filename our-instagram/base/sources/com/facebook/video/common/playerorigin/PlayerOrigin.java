package com.facebook.video.common.playerorigin;

import X.AbstractC31172DnG;
import X.AbstractC72048XLo;
import X.AbstractC72049XLp;
import X.C14360o3;
import X.C63473SlE;
import X.EnumC72411Xcz;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.proxygen.TraceEventType;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes12.dex */
public final class PlayerOrigin implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final String A00;
    public final String A01;
    public volatile String A02;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PlayerOrigin)) {
            return false;
        }
        PlayerOrigin playerOrigin = (PlayerOrigin) obj;
        return C14360o3.A0K(this.A00, playerOrigin.A00) && C14360o3.A0K(this.A01, playerOrigin.A01);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    static {
        EnumC72411Xcz enumC72411Xcz = EnumC72411Xcz.A1E;
        AbstractC72048XLo.A1M(enumC72411Xcz, "actor_profile_video");
        EnumC72411Xcz enumC72411Xcz2 = EnumC72411Xcz.A1J;
        AbstractC72048XLo.A1M(enumC72411Xcz2, "album_feed");
        AbstractC72048XLo.A1M(EnumC72411Xcz.A04, "audio_home");
        AbstractC72048XLo.A1M(EnumC72411Xcz.A05, "autodownload");
        AbstractC72048XLo.A1M(EnumC72411Xcz.A06, "background_play");
        AbstractC72048XLo.A1M(EnumC72411Xcz.A07, "bell_multiple");
        AbstractC72048XLo.A1M(EnumC72411Xcz.A09, "biz_disco_feed");
        AbstractC72048XLo.A1M(enumC72411Xcz, "carousel_video");
        AbstractC72048XLo.A1M(enumC72411Xcz, "channel_view");
        AbstractC72048XLo.A1M(EnumC72411Xcz.A0D, GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT);
        EnumC72411Xcz enumC72411Xcz3 = EnumC72411Xcz.A0F;
        AbstractC72048XLo.A1M(enumC72411Xcz3, "composer");
        AbstractC72048XLo.A1M(enumC72411Xcz3, "music_attachment");
        AbstractC72048XLo.A1M(enumC72411Xcz, "cultural_moments_share");
        AbstractC72048XLo.A1M(enumC72411Xcz, "cm_promotion");
        AbstractC72048XLo.A1M(EnumC72411Xcz.A0I, "unknown");
        AbstractC72048XLo.A1M(EnumC72411Xcz.A0K, "direct_inbox_production_video");
        EnumC72411Xcz enumC72411Xcz4 = EnumC72411Xcz.A0N;
        AbstractC72048XLo.A1M(enumC72411Xcz4, "feed_story");
        AbstractC72048XLo.A1M(enumC72411Xcz4, "event_chevron");
        AbstractC72048XLo.A1M(enumC72411Xcz4, "event_cover_video");
        AbstractC72048XLo.A1M(enumC72411Xcz4, "events_live_cta");
        AbstractC72048XLo.A1M(enumC72411Xcz4, "event_pay_to_access_cta");
        AbstractC72048XLo.A1M(enumC72411Xcz4, "event_tour_cover_video");
        EnumC72411Xcz enumC72411Xcz5 = EnumC72411Xcz.A1L;
        AbstractC72048XLo.A1M(enumC72411Xcz5, "events_tour_card");
        AbstractC72048XLo.A1M(enumC72411Xcz5, "EVENT_MULTI_EVENTS_CARD");
        EnumC72411Xcz enumC72411Xcz6 = EnumC72411Xcz.A0P;
        AbstractC72048XLo.A1M(enumC72411Xcz6, "huddle_live_audio");
        AbstractC72048XLo.A1M(EnumC72411Xcz.A0Q, "facebook_note");
        EnumC72411Xcz enumC72411Xcz7 = EnumC72411Xcz.A0Z;
        AbstractC72048XLo.A1M(enumC72411Xcz7, "story_tray");
        AbstractC72048XLo.A1M(enumC72411Xcz, "feed_story");
        AbstractC72048XLo.A1M(enumC72411Xcz, "fb_shorts_native_in_feed_unit");
        AbstractC72048XLo.A1M(enumC72411Xcz, "chevron");
        AbstractC72048XLo.A1M(enumC72411Xcz, "video_inline_pivot");
        AbstractC72048XLo.A1M(enumC72411Xcz, "live_ring");
        AbstractC72048XLo.A1M(enumC72411Xcz, "feed_midcard");
        AbstractC72049XLp.A0K(enumC72411Xcz, "multimedia_post", "music_attachment");
        EnumC72411Xcz enumC72411Xcz8 = EnumC72411Xcz.A1G;
        AbstractC72048XLo.A1M(enumC72411Xcz8, "notifications");
        AbstractC72048XLo.A1M(enumC72411Xcz2, "fullscreen_video_uri");
        EnumC72411Xcz enumC72411Xcz9 = EnumC72411Xcz.A1u;
        AbstractC72048XLo.A1M(enumC72411Xcz9, "global_search_warion");
        EnumC72411Xcz enumC72411Xcz10 = EnumC72411Xcz.A1e;
        AbstractC72048XLo.A1M(enumC72411Xcz10, "global_search_warion");
        AbstractC72049XLp.A0K(EnumC72411Xcz.A0k, "feed_story", "chevron");
        AbstractC72048XLo.A1M(EnumC72411Xcz.A1Q, "haptic_sound_effect");
        AbstractC72048XLo.A1M(EnumC72411Xcz.A0m, "huddle_live_audio");
        AbstractC72048XLo.A1M(enumC72411Xcz2, "inspiration_camera");
        AbstractC72048XLo.A1M(enumC72411Xcz2, "inspiration_remix");
        EnumC72411Xcz enumC72411Xcz11 = EnumC72411Xcz.A0o;
        AbstractC72048XLo.A1M(enumC72411Xcz11, "instant_articles");
        AbstractC72048XLo.A1M(enumC72411Xcz11, "shared_video_feed_story");
        AbstractC72048XLo.A1M(EnumC72411Xcz.A0p, "instant_experience");
        AbstractC72048XLo.A1M(EnumC72411Xcz.A0q, "instant_shopping");
        AbstractC72048XLo.A1M(enumC72411Xcz3, "live_video_composer");
        AbstractC72048XLo.A1M(EnumC72411Xcz.A0x, "live_video_end_screen");
        AbstractC72048XLo.A1M(enumC72411Xcz9, "live_linear_video_channel");
        AbstractC72048XLo.A1M(EnumC72411Xcz.A0y, "living_room");
        AbstractC72048XLo.A1M(EnumC72411Xcz.A10, "living_room_comments");
        EnumC72411Xcz enumC72411Xcz12 = EnumC72411Xcz.A12;
        AbstractC72048XLo.A1M(enumC72411Xcz12, "living_room_recap_fullscreen");
        AbstractC72048XLo.A1M(enumC72411Xcz12, "living_room_recap_inline");
        AbstractC72049XLp.A0K(EnumC72411Xcz.A13, "feed_story", "chevron");
        AbstractC72048XLo.A1M(EnumC72411Xcz.A0E, "marketplace_tab");
        AbstractC72048XLo.A1M(EnumC72411Xcz.A15, "media_gallery");
        AbstractC72048XLo.A1M(enumC72411Xcz2, "media_picker");
        EnumC72411Xcz enumC72411Xcz13 = EnumC72411Xcz.A16;
        AbstractC72048XLo.A1M(enumC72411Xcz13, "messenger_content_search");
        AbstractC72048XLo.A1M(enumC72411Xcz13, "gif_message");
        AbstractC72048XLo.A1M(EnumC72411Xcz.A18, "messenger_kids_threadview_inline");
        AbstractC72048XLo.A1M(enumC72411Xcz13, "media_manager");
        AbstractC72048XLo.A1M(enumC72411Xcz13, "media_tray_popup_view");
        AbstractC72048XLo.A1M(enumC72411Xcz13, "media_picker_popup_view");
        AbstractC72048XLo.A1M(enumC72411Xcz13, "direct_viewer_rvp");
        EnumC72411Xcz enumC72411Xcz14 = EnumC72411Xcz.A1A;
        AbstractC72048XLo.A1M(enumC72411Xcz14, "viewer_rvp");
        AbstractC72048XLo.A1M(enumC72411Xcz14, "stories_grid_autoplay");
        AbstractC72048XLo.A1M(enumC72411Xcz13, "multimedia_editor_preview");
        AbstractC72048XLo.A1M(EnumC72411Xcz.A19, "messenger_note");
        AbstractC72048XLo.A1M(enumC72411Xcz13, "media_share_view");
        AbstractC72048XLo.A1M(enumC72411Xcz13, "thread_video_message_view");
        AbstractC72048XLo.A1M(enumC72411Xcz13, "thread_video_message_media_viewer");
        AbstractC72048XLo.A1M(enumC72411Xcz13, "stax_thread_video_message_view");
        AbstractC72048XLo.A1M(enumC72411Xcz13, "stax_thread_video_message_view_groot");
        AbstractC72048XLo.A1M(enumC72411Xcz13, "stax_thread_video_message_media_viewer");
        AbstractC72048XLo.A1M(enumC72411Xcz13, "stax_thread_video_message_media_viewer_groot");
        AbstractC72048XLo.A1M(enumC72411Xcz13, "viewer_rvp_seg");
        AbstractC72048XLo.A1M(enumC72411Xcz14, "viewer_rvp_seg");
        AbstractC72048XLo.A1M(enumC72411Xcz13, "xma_shared_video");
        AbstractC72048XLo.A1M(enumC72411Xcz13, "messenger_discover_tab");
        AbstractC72048XLo.A1M(enumC72411Xcz13, "messenger_selfie_sticker");
        AbstractC72048XLo.A1M(EnumC72411Xcz.A1C, "fullscreen");
        AbstractC72048XLo.A1M(EnumC72411Xcz.A1D, "native_templates");
        AbstractC72048XLo.A1M(EnumC72411Xcz.A1F, "native_templates");
        AbstractC72048XLo.A1M(enumC72411Xcz5, "page_cover_video");
        AbstractC72048XLo.A1M(enumC72411Xcz5, "page_header");
        AbstractC72048XLo.A1M(enumC72411Xcz5, "page_tab_episodes");
        AbstractC72048XLo.A1M(enumC72411Xcz5, "page_tab_home");
        AbstractC72048XLo.A1M(enumC72411Xcz5, "page_tab_playlists");
        AbstractC72048XLo.A1M(enumC72411Xcz5, "page_tab_show_videos");
        AbstractC72048XLo.A1M(enumC72411Xcz5, "page_tab_live_tab");
        AbstractC72048XLo.A1M(enumC72411Xcz5, "channel_tab_videos_card");
        AbstractC72049XLp.A0K(enumC72411Xcz5, "video_page_spotlight_unit", "feed_story");
        AbstractC72049XLp.A0K(enumC72411Xcz5, "action_channel", "chevron");
        AbstractC72048XLo.A1M(enumC72411Xcz5, "page_video_list_permalink");
        EnumC72411Xcz enumC72411Xcz15 = EnumC72411Xcz.A1O;
        AbstractC72048XLo.A1M(enumC72411Xcz15, "feed_story");
        AbstractC72048XLo.A1M(enumC72411Xcz15, "faceweb_redirect");
        AbstractC72049XLp.A0K(enumC72411Xcz15, "faceweb_redirect_with_thread", "notifications");
        AbstractC72048XLo.A1M(enumC72411Xcz15, TraceEventType.Push);
        AbstractC72048XLo.A1M(EnumC72411Xcz.A1P, "multimedia_post");
        EnumC72411Xcz enumC72411Xcz16 = EnumC72411Xcz.A1r;
        AbstractC72048XLo.A1M(enumC72411Xcz16, "profile_video");
        AbstractC72048XLo.A1M(enumC72411Xcz16, "profile_cover_video");
        AbstractC72048XLo.A1M(enumC72411Xcz16, "profile_cover_video_upload_artwork_preview");
        AbstractC72048XLo.A1M(enumC72411Xcz16, "profile_cover_video_upload_header_preview");
        AbstractC72048XLo.A1M(enumC72411Xcz16, "timeline_video_hub");
        AbstractC72048XLo.A1M(enumC72411Xcz16, "profile_video_preview");
        EnumC72411Xcz enumC72411Xcz17 = EnumC72411Xcz.A1Z;
        AbstractC72048XLo.A1M(enumC72411Xcz17, "prompt_post");
        AbstractC72048XLo.A1M(enumC72411Xcz17, "prompt_post_mega_nux");
        AbstractC72048XLo.A1M(EnumC72411Xcz.A0h, "games_tab");
        AbstractC72048XLo.A1M(EnumC72411Xcz.A0g, "games_feed");
        AbstractC72048XLo.A1M(enumC72411Xcz2, "reaction_overlay");
        AbstractC72048XLo.A1M(enumC72411Xcz10, "results_page_mixed_media");
        AbstractC72048XLo.A1M(EnumC72411Xcz.A1d, "saved_dashboard");
        AbstractC72048XLo.A1M(enumC72411Xcz10, "results");
        AbstractC72048XLo.A1M(EnumC72411Xcz.A1h, "results");
        AbstractC72048XLo.A1M(EnumC72411Xcz.A1i, "sharesheet");
        AbstractC72048XLo.A1M(enumC72411Xcz3, "fb_shorts_in_stories_reshare_sticker");
        AbstractC72048XLo.A1M(EnumC72411Xcz.A1k, "simple_picker");
        AbstractC72048XLo.A1M(enumC72411Xcz8, "fb_stories_live_notification");
        AbstractC72048XLo.A1M(enumC72411Xcz8, "fb_stories_viewersheet");
        AbstractC72048XLo.A1M(enumC72411Xcz7, "fb_stories_optimistic_video");
        AbstractC72049XLp.A0K(enumC72411Xcz7, "fb_stories_tray", "fb_stories_viewersheet");
        AbstractC72048XLo.A1M(enumC72411Xcz7, "fb_stories_viewer");
        AbstractC72048XLo.A1M(EnumC72411Xcz.A1p, "unified_camera_roll");
        AbstractC72048XLo.A1M(EnumC72411Xcz.A1q, "unknown");
        AbstractC72049XLp.A0K(enumC72411Xcz16, "feed_story", "chevron");
        AbstractC72048XLo.A1M(enumC72411Xcz2, "video_album_permalink");
        AbstractC72048XLo.A1M(EnumC72411Xcz.A1t, "video_editing_gallery_preview");
        AbstractC72049XLp.A0K(enumC72411Xcz9, "notifications", TraceEventType.Push);
        AbstractC72048XLo.A1M(enumC72411Xcz9, "saved_dashboard");
        AbstractC72048XLo.A1M(enumC72411Xcz9, "watchlist");
        AbstractC72048XLo.A1M(enumC72411Xcz9, "watchlist_aggregation");
        AbstractC72048XLo.A1M(enumC72411Xcz9, "more_shows_fragment");
        AbstractC72048XLo.A1M(enumC72411Xcz9, "after_party");
        AbstractC72048XLo.A1M(enumC72411Xcz9, "discover_see_all");
        AbstractC72048XLo.A1M(enumC72411Xcz9, "discover_topic_see_all");
        AbstractC72048XLo.A1M(enumC72411Xcz9, "feed");
        AbstractC72048XLo.A1M(enumC72411Xcz9, "fb_shorts_viewer");
        AbstractC72048XLo.A1M(EnumC72411Xcz.A1Y, "fb_shorts_viewer");
        AbstractC72048XLo.A1M(enumC72411Xcz9, "topic_feed");
        AbstractC72048XLo.A1M(enumC72411Xcz9, "topic_music");
        AbstractC72048XLo.A1M(enumC72411Xcz9, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        AbstractC72048XLo.A1M(enumC72411Xcz9, "entry_point_notifications");
        AbstractC72048XLo.A1M(enumC72411Xcz9, "fb_shorts_native_watch_in_feed_unit");
        AbstractC72048XLo.A1M(enumC72411Xcz, "video_sets");
        AbstractC72048XLo.A1M(enumC72411Xcz9, enumC72411Xcz6.toString());
        AbstractC72048XLo.A1M(EnumC72411Xcz.A21, "youth_fullscreen_video");
        AbstractC72048XLo.A1M(enumC72411Xcz, "quick_promotion");
        AbstractC72048XLo.A1M(enumC72411Xcz9, "share_sheet");
        CREATOR = new C63473SlE(73);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A01});
    }

    public final String toString() {
        String str = this.A02;
        if (str == null) {
            String str2 = this.A01;
            if (str2 != null && str2.length() != 0) {
                str = StringFormatUtil.formatStrLocaleSafe("%s::%s", this.A00, str2);
                C14360o3.A07(str);
            } else {
                str = this.A00;
            }
            this.A02 = str;
        }
        return str;
    }

    public PlayerOrigin(EnumC72411Xcz enumC72411Xcz, String str) {
        String obj = enumC72411Xcz.toString();
        C14360o3.A0B(obj, 1);
        this.A00 = obj;
        this.A01 = str;
    }

    public PlayerOrigin(Parcel parcel) {
        EnumC72411Xcz enumC72411Xcz;
        String readString = parcel.readString();
        if (readString != null) {
            EnumC72411Xcz[] values = EnumC72411Xcz.values();
            int length = values.length;
            for (int i = 0; i < length; i++) {
                enumC72411Xcz = values[i];
                String obj = enumC72411Xcz.toString();
                Locale locale = Locale.getDefault();
                C14360o3.A07(locale);
                if (C14360o3.A0K(obj, AbstractC31172DnG.A16(locale, readString))) {
                    break;
                }
            }
        }
        enumC72411Xcz = EnumC72411Xcz.A1q;
        this.A00 = enumC72411Xcz.A00;
        this.A01 = parcel.readString();
    }
}
