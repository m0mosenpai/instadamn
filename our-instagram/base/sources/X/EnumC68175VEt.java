package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.VEt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class EnumC68175VEt {
    public static final /* synthetic */ EnumC68175VEt[] A01;
    public static final EnumC68175VEt A02;
    public final String A00;

    static {
        EnumC68175VEt enumC68175VEt = new EnumC68175VEt("UNSET_OR_UNRECOGNIZED_ENUM_VALUE", 0, "UNSET_OR_UNRECOGNIZED_ENUM_VALUE");
        A02 = enumC68175VEt;
        EnumC68175VEt enumC68175VEt2 = new EnumC68175VEt("AI_AGENT", 1, "AI_AGENT");
        EnumC68175VEt enumC68175VEt3 = new EnumC68175VEt("ALBUM", 2, "ALBUM");
        EnumC68175VEt enumC68175VEt4 = new EnumC68175VEt("AUDIO", 3, "AUDIO");
        EnumC68175VEt enumC68175VEt5 = new EnumC68175VEt("BROADCAST", 4, "BROADCAST");
        EnumC68175VEt enumC68175VEt6 = new EnumC68175VEt("BUNDLE", 5, "BUNDLE");
        EnumC68175VEt enumC68175VEt7 = new EnumC68175VEt("CAROUSEL_V2", 6, "CAROUSEL_V2");
        EnumC68175VEt enumC68175VEt8 = new EnumC68175VEt("COLLAGE", 7, "COLLAGE");
        EnumC68175VEt enumC68175VEt9 = new EnumC68175VEt("COLLECTION", 8, "COLLECTION");
        EnumC68175VEt enumC68175VEt10 = new EnumC68175VEt("CONTAINER", 9, "CONTAINER");
        EnumC68175VEt enumC68175VEt11 = new EnumC68175VEt("DIRECT_MESSAGE_COMMENT_FACADE", 10, "DIRECT_MESSAGE_COMMENT_FACADE");
        EnumC68175VEt enumC68175VEt12 = new EnumC68175VEt("FILE", 11, "FILE");
        EnumC68175VEt enumC68175VEt13 = new EnumC68175VEt("GUIDE_FACADE", 12, "GUIDE_FACADE");
        EnumC68175VEt enumC68175VEt14 = new EnumC68175VEt("HEADMOJI_STICKER", 13, "HEADMOJI_STICKER");
        EnumC68175VEt enumC68175VEt15 = new EnumC68175VEt("HIGHLIGHT_POST_FACADE", 14, "HIGHLIGHT_POST_FACADE");
        EnumC68175VEt enumC68175VEt16 = new EnumC68175VEt("HSCROLL_ADS", 15, "HSCROLL_ADS");
        EnumC68175VEt enumC68175VEt17 = new EnumC68175VEt("IMAGE", 16, "IMAGE");
        EnumC68175VEt enumC68175VEt18 = new EnumC68175VEt("MONTHLY_ACTIVE_CARD", 17, "MONTHLY_ACTIVE_CARD");
        EnumC68175VEt enumC68175VEt19 = new EnumC68175VEt("REPOST_FACADE", 18, "REPOST_FACADE");
        EnumC68175VEt enumC68175VEt20 = new EnumC68175VEt("SCHEDULED_BROADCAST", 19, "SCHEDULED_BROADCAST");
        EnumC68175VEt enumC68175VEt21 = new EnumC68175VEt("SHOWCASE", 20, "SHOWCASE");
        EnumC68175VEt enumC68175VEt22 = new EnumC68175VEt("SHOWREEL", 21, "SHOWREEL");
        EnumC68175VEt enumC68175VEt23 = new EnumC68175VEt("TEXT_APP_DRAFT", 22, "TEXT_APP_DRAFT");
        EnumC68175VEt enumC68175VEt24 = new EnumC68175VEt("TEXT_APP_MEDIA_REUSE", 23, "TEXT_APP_MEDIA_REUSE");
        EnumC68175VEt enumC68175VEt25 = new EnumC68175VEt("TEXT_POST", 24, "TEXT_POST");
        EnumC68175VEt enumC68175VEt26 = new EnumC68175VEt("UNKNOWN", 25, "UNKNOWN");
        EnumC68175VEt enumC68175VEt27 = new EnumC68175VEt("VIDEO", 26, "VIDEO");
        EnumC68175VEt enumC68175VEt28 = new EnumC68175VEt("WEBVIEW", 27, "WEBVIEW");
        EnumC68175VEt[] enumC68175VEtArr = new EnumC68175VEt[28];
        System.arraycopy(new EnumC68175VEt[]{enumC68175VEt, enumC68175VEt2, enumC68175VEt3, enumC68175VEt4, enumC68175VEt5, enumC68175VEt6, enumC68175VEt7, enumC68175VEt8, enumC68175VEt9, enumC68175VEt10, enumC68175VEt11, enumC68175VEt12, enumC68175VEt13, enumC68175VEt14, enumC68175VEt15, enumC68175VEt16, enumC68175VEt17, enumC68175VEt18, enumC68175VEt19, enumC68175VEt20, enumC68175VEt21, enumC68175VEt22, enumC68175VEt23, enumC68175VEt24, enumC68175VEt25, enumC68175VEt26, enumC68175VEt27}, 0, enumC68175VEtArr, 0, 27);
        System.arraycopy(new EnumC68175VEt[]{enumC68175VEt28}, 0, enumC68175VEtArr, 27, 1);
        A01 = enumC68175VEtArr;
    }

    public static EnumC68175VEt valueOf(String str) {
        return (EnumC68175VEt) Enum.valueOf(EnumC68175VEt.class, str);
    }

    public static EnumC68175VEt[] values() {
        return (EnumC68175VEt[]) A01.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public EnumC68175VEt(String str, int i, String str2) {
        this.A00 = str2;
    }
}
