package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.5Gh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC114765Gh {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC114765Gh[] A02;
    public static final EnumC114765Gh A03;
    public static final EnumC114765Gh A04;
    public static final EnumC114765Gh A05;
    public static final EnumC114765Gh A06;
    public final String A00;

    static {
        EnumC114765Gh enumC114765Gh = new EnumC114765Gh("LIKES", 0, "likes_native");
        A06 = enumC114765Gh;
        EnumC114765Gh enumC114765Gh2 = new EnumC114765Gh("FEED_MEDIA", 1, "feed_media_native");
        A04 = enumC114765Gh2;
        EnumC114765Gh enumC114765Gh3 = new EnumC114765Gh("CLIPS_MEDIA", 2, "reels_media_native");
        A03 = enumC114765Gh3;
        EnumC114765Gh enumC114765Gh4 = new EnumC114765Gh("IGTV_MEDIA", 3, "igtv_media_native");
        A05 = enumC114765Gh4;
        EnumC114765Gh[] enumC114765GhArr = {enumC114765Gh, enumC114765Gh2, enumC114765Gh3, enumC114765Gh4, new EnumC114765Gh("NOT_AN_AC_SCREEN", 4, "not_an_ac_screen")};
        A02 = enumC114765GhArr;
        A01 = AbstractC12190kN.A00(enumC114765GhArr);
    }

    public static EnumC114765Gh valueOf(String str) {
        return (EnumC114765Gh) Enum.valueOf(EnumC114765Gh.class, str);
    }

    public static EnumC114765Gh[] values() {
        return (EnumC114765Gh[]) A02.clone();
    }

    public EnumC114765Gh(String str, int i, String str2) {
        this.A00 = str2;
    }
}
