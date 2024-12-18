package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class VFL {
    public static final /* synthetic */ VFL[] A01;
    public static final VFL A02;
    public final String A00;

    static {
        VFL vfl = new VFL("UNSET_OR_UNRECOGNIZED_ENUM_VALUE", 0, "UNSET_OR_UNRECOGNIZED_ENUM_VALUE");
        A02 = vfl;
        VFL vfl2 = new VFL("AI_AGENT", 1, "AI_AGENT");
        VFL vfl3 = new VFL("ALBUM", 2, "ALBUM");
        VFL vfl4 = new VFL("AUDIO", 3, "AUDIO");
        VFL vfl5 = new VFL("BROADCAST", 4, "BROADCAST");
        VFL vfl6 = new VFL("BUNDLE", 5, "BUNDLE");
        VFL vfl7 = new VFL("CAROUSEL_V2", 6, "CAROUSEL_V2");
        VFL vfl8 = new VFL("COLLAGE", 7, "COLLAGE");
        VFL vfl9 = new VFL("COLLECTION", 8, "COLLECTION");
        VFL vfl10 = new VFL("CONTAINER", 9, "CONTAINER");
        VFL vfl11 = new VFL("DIRECT_MESSAGE_COMMENT_FACADE", 10, "DIRECT_MESSAGE_COMMENT_FACADE");
        VFL vfl12 = new VFL("FILE", 11, "FILE");
        VFL vfl13 = new VFL("GUIDE_FACADE", 12, "GUIDE_FACADE");
        VFL vfl14 = new VFL("HEADMOJI_STICKER", 13, "HEADMOJI_STICKER");
        VFL vfl15 = new VFL("HIGHLIGHT_POST_FACADE", 14, "HIGHLIGHT_POST_FACADE");
        VFL vfl16 = new VFL("HSCROLL_ADS", 15, "HSCROLL_ADS");
        VFL vfl17 = new VFL("IMAGE", 16, "IMAGE");
        VFL vfl18 = new VFL("MONTHLY_ACTIVE_CARD", 17, "MONTHLY_ACTIVE_CARD");
        VFL vfl19 = new VFL("REPOST_FACADE", 18, "REPOST_FACADE");
        VFL vfl20 = new VFL("SCHEDULED_BROADCAST", 19, "SCHEDULED_BROADCAST");
        VFL vfl21 = new VFL("SHOWCASE", 20, "SHOWCASE");
        VFL vfl22 = new VFL("SHOWREEL", 21, "SHOWREEL");
        VFL vfl23 = new VFL("TEXT_APP_DRAFT", 22, "TEXT_APP_DRAFT");
        VFL vfl24 = new VFL("TEXT_APP_MEDIA_REUSE", 23, "TEXT_APP_MEDIA_REUSE");
        VFL vfl25 = new VFL("TEXT_POST", 24, "TEXT_POST");
        VFL vfl26 = new VFL("UNKNOWN", 25, "UNKNOWN");
        VFL vfl27 = new VFL("VIDEO", 26, "VIDEO");
        VFL vfl28 = new VFL("WEBVIEW", 27, "WEBVIEW");
        VFL[] vflArr = new VFL[28];
        System.arraycopy(new VFL[]{vfl, vfl2, vfl3, vfl4, vfl5, vfl6, vfl7, vfl8, vfl9, vfl10, vfl11, vfl12, vfl13, vfl14, vfl15, vfl16, vfl17, vfl18, vfl19, vfl20, vfl21, vfl22, vfl23, vfl24, vfl25, vfl26, vfl27}, 0, vflArr, 0, 27);
        System.arraycopy(new VFL[]{vfl28}, 0, vflArr, 27, 1);
        A01 = vflArr;
    }

    public static VFL valueOf(String str) {
        return (VFL) Enum.valueOf(VFL.class, str);
    }

    public static VFL[] values() {
        return (VFL[]) A01.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public VFL(String str, int i, String str2) {
        this.A00 = str2;
    }
}
