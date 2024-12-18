package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class VFX {
    public static final /* synthetic */ VFX[] A01;
    public static final VFX A02;
    public static final VFX A03;
    public final String A00;

    static {
        VFX vfx = new VFX("UNSET_OR_UNRECOGNIZED_ENUM_VALUE", 0, "UNSET_OR_UNRECOGNIZED_ENUM_VALUE");
        A02 = vfx;
        VFX vfx2 = new VFX("AI_AGENT", 1, "AI_AGENT");
        VFX vfx3 = new VFX("ALBUM", 2, "ALBUM");
        VFX vfx4 = new VFX("AUDIO", 3, "AUDIO");
        VFX vfx5 = new VFX("BROADCAST", 4, "BROADCAST");
        VFX vfx6 = new VFX("BUNDLE", 5, "BUNDLE");
        VFX vfx7 = new VFX("CAROUSEL_V2", 6, "CAROUSEL_V2");
        VFX vfx8 = new VFX("COLLAGE", 7, "COLLAGE");
        VFX vfx9 = new VFX("COLLECTION", 8, "COLLECTION");
        VFX vfx10 = new VFX("CONTAINER", 9, "CONTAINER");
        VFX vfx11 = new VFX("DIRECT_MESSAGE_COMMENT_FACADE", 10, "DIRECT_MESSAGE_COMMENT_FACADE");
        VFX vfx12 = new VFX("FILE", 11, "FILE");
        VFX vfx13 = new VFX("GUIDE_FACADE", 12, "GUIDE_FACADE");
        VFX vfx14 = new VFX("HEADMOJI_STICKER", 13, "HEADMOJI_STICKER");
        VFX vfx15 = new VFX("HIGHLIGHT_POST_FACADE", 14, "HIGHLIGHT_POST_FACADE");
        VFX vfx16 = new VFX("HSCROLL_ADS", 15, "HSCROLL_ADS");
        VFX vfx17 = new VFX("IMAGE", 16, "IMAGE");
        VFX vfx18 = new VFX("MONTHLY_ACTIVE_CARD", 17, "MONTHLY_ACTIVE_CARD");
        VFX vfx19 = new VFX("REPOST_FACADE", 18, "REPOST_FACADE");
        VFX vfx20 = new VFX("SCHEDULED_BROADCAST", 19, "SCHEDULED_BROADCAST");
        VFX vfx21 = new VFX("SHOWCASE", 20, "SHOWCASE");
        VFX vfx22 = new VFX("SHOWREEL", 21, "SHOWREEL");
        VFX vfx23 = new VFX("TEXT_APP_DRAFT", 22, "TEXT_APP_DRAFT");
        VFX vfx24 = new VFX("TEXT_APP_MEDIA_REUSE", 23, "TEXT_APP_MEDIA_REUSE");
        VFX vfx25 = new VFX("TEXT_POST", 24, "TEXT_POST");
        VFX vfx26 = new VFX("UNKNOWN", 25, "UNKNOWN");
        VFX vfx27 = new VFX("VIDEO", 26, "VIDEO");
        A03 = vfx27;
        VFX vfx28 = new VFX("WEBVIEW", 27, "WEBVIEW");
        VFX[] vfxArr = new VFX[28];
        System.arraycopy(new VFX[]{vfx, vfx2, vfx3, vfx4, vfx5, vfx6, vfx7, vfx8, vfx9, vfx10, vfx11, vfx12, vfx13, vfx14, vfx15, vfx16, vfx17, vfx18, vfx19, vfx20, vfx21, vfx22, vfx23, vfx24, vfx25, vfx26, vfx27}, 0, vfxArr, 0, 27);
        System.arraycopy(new VFX[]{vfx28}, 0, vfxArr, 27, 1);
        A01 = vfxArr;
    }

    public static VFX valueOf(String str) {
        return (VFX) Enum.valueOf(VFX.class, str);
    }

    public static VFX[] values() {
        return (VFX[]) A01.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public VFX(String str, int i, String str2) {
        this.A00 = str2;
    }
}
