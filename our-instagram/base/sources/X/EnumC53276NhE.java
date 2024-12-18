package X;

import com.facebook.R;
import com.instagram.api.schemas.ApiAdFormats;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.NhE, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53276NhE {
    public static final /* synthetic */ EnumEntries A04;
    public static final /* synthetic */ EnumC53276NhE[] A05;
    public static final EnumC53276NhE A06;
    public static final EnumC53276NhE A07;
    public static final EnumC53276NhE A08;
    public static final EnumC53276NhE A09;
    public static final EnumC53276NhE A0A;
    public final int A00;
    public final int A01;
    public final ApiAdFormats A02;
    public final String A03;

    public static EnumC53276NhE valueOf(String str) {
        return (EnumC53276NhE) Enum.valueOf(EnumC53276NhE.class, str);
    }

    public static EnumC53276NhE[] values() {
        return (EnumC53276NhE[]) A05.clone();
    }

    static {
        EnumC53276NhE enumC53276NhE = new EnumC53276NhE(ApiAdFormats.A0u, "FEED", "facebook_feed_preview_url_fetch", 0, 2131970858, R.drawable.instagram_photo_list_pano_outline_24);
        A06 = enumC53276NhE;
        EnumC53276NhE enumC53276NhE2 = new EnumC53276NhE(ApiAdFormats.A0L, "STORIES", "facebook_story_preview_url_fetch", 1, 2131970867, R.drawable.instagram_story_pano_outline_24);
        A09 = enumC53276NhE2;
        EnumC53276NhE enumC53276NhE3 = new EnumC53276NhE(ApiAdFormats.A0f, "IN_STREAM_VIDEOS", "facebook_in_stream_videos_preview_url_fetch", 2, 2131970859, R.drawable.instagram_play_pano_outline_24);
        A07 = enumC53276NhE3;
        EnumC53276NhE enumC53276NhE4 = new EnumC53276NhE(ApiAdFormats.A1D, "VIDEO_FEED", "facebook_video_feeds_preview_url_fetch", 3, 2131970873, R.drawable.instagram_media_pano_outline_24);
        A0A = enumC53276NhE4;
        EnumC53276NhE enumC53276NhE5 = new EnumC53276NhE(ApiAdFormats.A0k, "MARKETPLACE", "facebook_marketplace_preview_url_fetch", 4, 2131970861, R.drawable.instagram_business_pano_outline_24);
        A08 = enumC53276NhE5;
        EnumC53276NhE[] enumC53276NhEArr = {enumC53276NhE, enumC53276NhE2, enumC53276NhE3, enumC53276NhE4, enumC53276NhE5};
        A05 = enumC53276NhEArr;
        A04 = AbstractC12190kN.A00(enumC53276NhEArr);
    }

    public EnumC53276NhE(ApiAdFormats apiAdFormats, String str, String str2, int i, int i2, int i3) {
        this.A01 = i2;
        this.A00 = i3;
        this.A02 = apiAdFormats;
        this.A03 = str2;
    }
}
