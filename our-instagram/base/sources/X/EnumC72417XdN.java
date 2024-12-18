package X;

import org.webrtc.MediaStreamTrack;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.XdN, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class EnumC72417XdN implements InterfaceC02530Ab {
    public static final /* synthetic */ EnumC72417XdN[] A01;
    public static final EnumC72417XdN A02;
    public final String A00;

    static {
        EnumC72417XdN enumC72417XdN = new EnumC72417XdN("ACHIEVEMENTS", 0, "achievements");
        EnumC72417XdN enumC72417XdN2 = new EnumC72417XdN("ACR_MIDCARD", 1, "acr_midcard");
        EnumC72417XdN enumC72417XdN3 = new EnumC72417XdN("AUDIO", 2, MediaStreamTrack.AUDIO_TRACK_KIND);
        EnumC72417XdN enumC72417XdN4 = new EnumC72417XdN("BLEND", 3, "blend");
        EnumC72417XdN enumC72417XdN5 = new EnumC72417XdN("CAMERA_ROLL", 4, "camera_roll");
        EnumC72417XdN enumC72417XdN6 = new EnumC72417XdN("CREATION_INSPIRATION", 5, "creation_inspiration");
        EnumC72417XdN enumC72417XdN7 = new EnumC72417XdN("CREATION_TOOL", 6, "creation_tool");
        EnumC72417XdN enumC72417XdN8 = new EnumC72417XdN("DRAFT", 7, "draft");
        EnumC72417XdN enumC72417XdN9 = new EnumC72417XdN("GROWTH_BEST_PRACTICES", 8, "growth_best_practices");
        EnumC72417XdN enumC72417XdN10 = new EnumC72417XdN("HORIZON_WORLDS", 9, "horizon_worlds");
        EnumC72417XdN enumC72417XdN11 = new EnumC72417XdN("INSPIRATION_HUB", 10, "inspiration_hub");
        EnumC72417XdN enumC72417XdN12 = new EnumC72417XdN("META_GALLERY", 11, "meta_gallery");
        EnumC72417XdN enumC72417XdN13 = new EnumC72417XdN("MUSIC_RECOMMENDATION", 12, "music_recommendation");
        EnumC72417XdN enumC72417XdN14 = new EnumC72417XdN("NME_LINKS_IN_REELS", 13, "nme_links_in_reels");
        EnumC72417XdN enumC72417XdN15 = new EnumC72417XdN("POPULAR_AUDIO", 14, "popular_audio");
        EnumC72417XdN enumC72417XdN16 = new EnumC72417XdN("POPULAR_COLLAB_REELS", 15, "popular_collab_reels");
        EnumC72417XdN enumC72417XdN17 = new EnumC72417XdN("POPULAR_REELS", 16, "popular_reels");
        EnumC72417XdN enumC72417XdN18 = new EnumC72417XdN("PRODUCER_FEEDBACK", 17, "producer_feedback");
        EnumC72417XdN enumC72417XdN19 = new EnumC72417XdN("RECENTLY_SAVED_AUDIO", 18, "recently_saved_audio");
        EnumC72417XdN enumC72417XdN20 = new EnumC72417XdN("RECENTLY_SAVED_AUDIO_TEMPLATE", 19, "recently_saved_audio_template");
        EnumC72417XdN enumC72417XdN21 = new EnumC72417XdN("REELS_INSIGHTS", 20, "reels_insights");
        EnumC72417XdN enumC72417XdN22 = new EnumC72417XdN("STORIES_IN_REELS", 21, "stories_in_reels");
        EnumC72417XdN enumC72417XdN23 = new EnumC72417XdN("STORY_TO_REEL", 22, "story_to_reel");
        EnumC72417XdN enumC72417XdN24 = new EnumC72417XdN("SURVEY", 23, "survey");
        EnumC72417XdN enumC72417XdN25 = new EnumC72417XdN("TEMPLATE", 24, "template");
        A02 = enumC72417XdN25;
        EnumC72417XdN enumC72417XdN26 = new EnumC72417XdN("TOP_IN_CREATOR_VERTICAL", 25, "top_in_creator_vertical");
        EnumC72417XdN enumC72417XdN27 = new EnumC72417XdN("TREND", 26, "trend");
        EnumC72417XdN[] enumC72417XdNArr = new EnumC72417XdN[29];
        System.arraycopy(new EnumC72417XdN[]{new EnumC72417XdN("TRENDING_TRACK_WITH_SIMILAR_ACCOUNTS", 27, "trending_track_with_similar_accounts"), new EnumC72417XdN("UNKNOWN", 28, "unknown")}, AbstractC31175DnJ.A1b(new EnumC72417XdN[]{enumC72417XdN, enumC72417XdN2, enumC72417XdN3, enumC72417XdN4, enumC72417XdN5, enumC72417XdN6, enumC72417XdN7, enumC72417XdN8, enumC72417XdN9, enumC72417XdN10, enumC72417XdN11, enumC72417XdN12, enumC72417XdN13, enumC72417XdN14, enumC72417XdN15, enumC72417XdN16, enumC72417XdN17, enumC72417XdN18, enumC72417XdN19, enumC72417XdN20, enumC72417XdN21, enumC72417XdN22, enumC72417XdN23, enumC72417XdN24, enumC72417XdN25, enumC72417XdN26, enumC72417XdN27}, enumC72417XdNArr) ? 1 : 0, enumC72417XdNArr, 27, 2);
        A01 = enumC72417XdNArr;
    }

    public static EnumC72417XdN valueOf(String str) {
        return (EnumC72417XdN) Enum.valueOf(EnumC72417XdN.class, str);
    }

    public static EnumC72417XdN[] values() {
        return (EnumC72417XdN[]) A01.clone();
    }

    public EnumC72417XdN(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // X.InterfaceC02530Ab
    public final /* bridge */ /* synthetic */ Object getValue() {
        return this.A00;
    }
}
