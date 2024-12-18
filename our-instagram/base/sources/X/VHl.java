package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class VHl implements InterfaceC02530Ab {
    public static final /* synthetic */ VHl[] A01;
    public static final VHl A02;
    public static final VHl A03;
    public static final VHl A04;
    public static final VHl A05;
    public static final VHl A06;
    public static final VHl A07;
    public static final VHl A08;
    public static final VHl A09;
    public static final VHl A0A;
    public static final VHl A0B;
    public static final VHl A0C;
    public final String A00;

    static {
        VHl vHl = new VHl("ADD_YOURS", 0, "add_yours");
        VHl vHl2 = new VHl("AI_STICKER", 1, "ai_sticker");
        A02 = vHl2;
        VHl vHl3 = new VHl("AVATAR_ANIMATED_STICKER", 2, "avatar_animated_sticker");
        A03 = vHl3;
        VHl vHl4 = new VHl("AVATAR_STICKER", 3, "avatar_sticker");
        A04 = vHl4;
        VHl vHl5 = new VHl("BOARD_CAMERA_STICKER", 4, "board_camera_sticker");
        VHl vHl6 = new VHl("BOARD_COMMENT", 5, "board_comment");
        VHl vHl7 = new VHl("CHAT", 6, "chat");
        VHl vHl8 = new VHl("COUNTDOWN", 7, "countdown");
        VHl vHl9 = new VHl("CULTURAL_STICKER", 8, "cultural_sticker");
        VHl vHl10 = new VHl("DATE_STICKER", 9, "date_sticker");
        VHl vHl11 = new VHl("EMOJI", 10, "emoji");
        A05 = vHl11;
        VHl vHl12 = new VHl("GIF", 11, "gif");
        VHl vHl13 = new VHl("GROUP_MENTION_STICKER", 12, "group_mention_sticker");
        A06 = vHl13;
        VHl vHl14 = new VHl("HASHTAG", 13, "hashtag");
        VHl vHl15 = new VHl("LINK", 14, "link");
        VHl vHl16 = new VHl("LOCAL_IMAGE_STICKER", 15, "local_image_sticker");
        A07 = vHl16;
        VHl vHl17 = new VHl("LOCAL_VIDEO_STICKER", 16, "local_video_sticker");
        VHl vHl18 = new VHl("LOCATION", 17, "location");
        VHl vHl19 = new VHl("MAGIC_MOD_BACKDROP", 18, "magic_mod_backdrop");
        VHl vHl20 = new VHl("MAGIC_MOD_RESTYLE", 19, "magic_mod_restyle");
        VHl vHl21 = new VHl("MEDIA_STICKER", 20, "media_sticker");
        VHl vHl22 = new VHl("MEMORIES", 21, "memories");
        VHl vHl23 = new VHl("MENTION", 22, "mention");
        VHl vHl24 = new VHl("MUSIC", 23, "music");
        VHl vHl25 = new VHl("OTHERS", 24, "others");
        A08 = vHl25;
        VHl vHl26 = new VHl("POLAROID_FRAME", 25, "polaroid_frame");
        VHl vHl27 = new VHl("POLL", 26, "poll");
        VHl vHl28 = new VHl("PROMPT", 27, "prompt");
        VHl vHl29 = new VHl("QUESTION", 28, "question");
        VHl vHl30 = new VHl("QUESTION_RESHARE", 29, "question_reshare");
        VHl vHl31 = new VHl("QUIZ", 30, "quiz");
        VHl vHl32 = new VHl("REACTION_STICKER", 31, "reaction_sticker");
        A09 = vHl32;
        VHl vHl33 = new VHl("ROLLCALL_V2_MEDIA_STICKER", 32, "rollcall_v2_media_sticker");
        A0A = vHl33;
        VHl vHl34 = new VHl("ROLLCALL_V2_TIMESTAMP_STICKER", 33, "rollcall_v2_timestamp_sticker");
        A0B = vHl34;
        VHl vHl35 = new VHl("SECRET_STORIES", 34, "secret_stories");
        VHl vHl36 = new VHl("SLIDER", 35, "slider");
        VHl vHl37 = new VHl("SOUND_ON", 36, "sound_on");
        VHl vHl38 = new VHl("STORE_STICKER", 37, "store_sticker");
        VHl vHl39 = new VHl("TEXT_STICKER", 38, "text_sticker");
        A0C = vHl39;
        VHl[] vHlArr = new VHl[41];
        System.arraycopy(new VHl[]{vHl28, vHl29, vHl30, vHl31, vHl32, vHl33, vHl34, vHl35, vHl36, vHl37, vHl38, vHl39, new VHl("TIME", 39, "time"), new VHl("WEATHER", 40, "weather")}, AbstractC31175DnJ.A1b(new VHl[]{vHl, vHl2, vHl3, vHl4, vHl5, vHl6, vHl7, vHl8, vHl9, vHl10, vHl11, vHl12, vHl13, vHl14, vHl15, vHl16, vHl17, vHl18, vHl19, vHl20, vHl21, vHl22, vHl23, vHl24, vHl25, vHl26, vHl27}, vHlArr) ? 1 : 0, vHlArr, 27, 14);
        A01 = vHlArr;
    }

    public static VHl valueOf(String str) {
        return (VHl) Enum.valueOf(VHl.class, str);
    }

    public static VHl[] values() {
        return (VHl[]) A01.clone();
    }

    @Override // X.InterfaceC02530Ab
    public final /* bridge */ /* synthetic */ Object getValue() {
        return this.A00;
    }

    public VHl(String str, int i, String str2) {
        this.A00 = str2;
    }
}
