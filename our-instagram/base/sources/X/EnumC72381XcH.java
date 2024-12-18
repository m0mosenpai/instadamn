package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.XcH, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class EnumC72381XcH {
    public static final /* synthetic */ EnumC72381XcH[] A01;
    public static final EnumC72381XcH A02;
    public final String A00;

    static {
        EnumC72381XcH enumC72381XcH = new EnumC72381XcH("UNSET_OR_UNRECOGNIZED_ENUM_VALUE", 0, "UNSET_OR_UNRECOGNIZED_ENUM_VALUE");
        A02 = enumC72381XcH;
        EnumC72381XcH enumC72381XcH2 = new EnumC72381XcH("ADJUSTED_FIT_TO_HEIGHT", 1, "ADJUSTED_FIT_TO_HEIGHT");
        EnumC72381XcH enumC72381XcH3 = new EnumC72381XcH("BUTTON_COMPACT", 2, "BUTTON_COMPACT");
        EnumC72381XcH enumC72381XcH4 = new EnumC72381XcH("BUTTON_FILLED", 3, "BUTTON_FILLED");
        EnumC72381XcH enumC72381XcH5 = new EnumC72381XcH("BUTTON_OUTLINE", 4, "BUTTON_OUTLINE");
        EnumC72381XcH enumC72381XcH6 = new EnumC72381XcH("BUTTON_REGULAR", 5, "BUTTON_REGULAR");
        EnumC72381XcH enumC72381XcH7 = new EnumC72381XcH("BUTTON_ROUND", 6, "BUTTON_ROUND");
        EnumC72381XcH enumC72381XcH8 = new EnumC72381XcH("BUTTON_SHARP", 7, "BUTTON_SHARP");
        EnumC72381XcH enumC72381XcH9 = new EnumC72381XcH("CAPTION", 8, "CAPTION");
        EnumC72381XcH enumC72381XcH10 = new EnumC72381XcH("CENTER_ALIGNED", 9, "CENTER_ALIGNED");
        EnumC72381XcH enumC72381XcH11 = new EnumC72381XcH("DARK_GRADIENT", 10, "DARK_GRADIENT");
        EnumC72381XcH enumC72381XcH12 = new EnumC72381XcH("EXPANDABLE", 11, "EXPANDABLE");
        EnumC72381XcH enumC72381XcH13 = new EnumC72381XcH("EXPANDABLE_FULLSCREEN", 12, "EXPANDABLE_FULLSCREEN");
        EnumC72381XcH enumC72381XcH14 = new EnumC72381XcH("FIT_TO_HEIGHT", 13, "FIT_TO_HEIGHT");
        EnumC72381XcH enumC72381XcH15 = new EnumC72381XcH("HIDE_PRODUCT_PRICES", 14, "HIDE_PRODUCT_PRICES");
        EnumC72381XcH enumC72381XcH16 = new EnumC72381XcH("LANDSCAPE_ENABLED", 15, "LANDSCAPE_ENABLED");
        EnumC72381XcH enumC72381XcH17 = new EnumC72381XcH("LIGHT_GRADIENT", 16, "LIGHT_GRADIENT");
        EnumC72381XcH enumC72381XcH18 = new EnumC72381XcH("NON_ADJUSTED_FIT_TO_WIDTH", 17, "NON_ADJUSTED_FIT_TO_WIDTH");
        EnumC72381XcH enumC72381XcH19 = new EnumC72381XcH("OVERLAY", 18, "OVERLAY");
        EnumC72381XcH enumC72381XcH20 = new EnumC72381XcH("PHOTO_GRAY_OVERLAY", 19, "PHOTO_GRAY_OVERLAY");
        EnumC72381XcH enumC72381XcH21 = new EnumC72381XcH("ROTATION_ENABLED", 20, "ROTATION_ENABLED");
        EnumC72381XcH enumC72381XcH22 = new EnumC72381XcH("SCRUBBABLE_GIF", 21, "SCRUBBABLE_GIF");
        EnumC72381XcH enumC72381XcH23 = new EnumC72381XcH("SHOW_CAROUSEL_PEEK", 22, "SHOW_CAROUSEL_PEEK");
        EnumC72381XcH enumC72381XcH24 = new EnumC72381XcH("SHOW_INTERACTION_HINT", 23, "SHOW_INTERACTION_HINT");
        EnumC72381XcH enumC72381XcH25 = new EnumC72381XcH("TEXT_NO_CUSTOM_MEASURE", 24, "TEXT_NO_CUSTOM_MEASURE");
        EnumC72381XcH enumC72381XcH26 = new EnumC72381XcH("TILT_TO_PAN", 25, "TILT_TO_PAN");
        EnumC72381XcH enumC72381XcH27 = new EnumC72381XcH("VIDEO_MUTED", 26, "VIDEO_MUTED");
        EnumC72381XcH[] enumC72381XcHArr = new EnumC72381XcH[29];
        System.arraycopy(new EnumC72381XcH[]{new EnumC72381XcH("VIDEO_PLAY_PAUSE_DISABLED", 27, "VIDEO_PLAY_PAUSE_DISABLED"), new EnumC72381XcH("VIDEO_UNMUTED_FORCED", 28, "VIDEO_UNMUTED_FORCED")}, AbstractC31175DnJ.A1b(new EnumC72381XcH[]{enumC72381XcH, enumC72381XcH2, enumC72381XcH3, enumC72381XcH4, enumC72381XcH5, enumC72381XcH6, enumC72381XcH7, enumC72381XcH8, enumC72381XcH9, enumC72381XcH10, enumC72381XcH11, enumC72381XcH12, enumC72381XcH13, enumC72381XcH14, enumC72381XcH15, enumC72381XcH16, enumC72381XcH17, enumC72381XcH18, enumC72381XcH19, enumC72381XcH20, enumC72381XcH21, enumC72381XcH22, enumC72381XcH23, enumC72381XcH24, enumC72381XcH25, enumC72381XcH26, enumC72381XcH27}, enumC72381XcHArr) ? 1 : 0, enumC72381XcHArr, 27, 2);
        A01 = enumC72381XcHArr;
    }

    public static EnumC72381XcH valueOf(String str) {
        return (EnumC72381XcH) Enum.valueOf(EnumC72381XcH.class, str);
    }

    public static EnumC72381XcH[] values() {
        return (EnumC72381XcH[]) A01.clone();
    }

    public EnumC72381XcH(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }
}
