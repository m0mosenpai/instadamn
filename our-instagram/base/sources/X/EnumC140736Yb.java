package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.6Yb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC140736Yb {
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC140736Yb[] A03;
    public static final EnumC140736Yb A04;
    public static final EnumC140736Yb A05;
    public static final EnumC140736Yb A06;
    public static final EnumC140736Yb A07;
    public final String A00;
    public final String A01;

    static {
        EnumC140736Yb enumC140736Yb = new EnumC140736Yb("FEED_SINGLE_MEDIA_FORMAT", "IG_FEED", "sn_integration_feed", 0);
        A04 = enumC140736Yb;
        EnumC140736Yb enumC140736Yb2 = new EnumC140736Yb("STORIES_SINGLE_MEDIA_FORMAT", "IG_STORIES", "sn_integration_reels", 1);
        A07 = enumC140736Yb2;
        EnumC140736Yb enumC140736Yb3 = new EnumC140736Yb("STORIES_CAROUSEL_FORMAT", "IG_STORIES", "sn_integration_reels", 2);
        A06 = enumC140736Yb3;
        EnumC140736Yb enumC140736Yb4 = new EnumC140736Yb("REELS_CAROUSEL_TO_VIDEO_FORMAT", "IG_REELS", "sn_integration_clips", 3);
        A05 = enumC140736Yb4;
        EnumC140736Yb[] enumC140736YbArr = {enumC140736Yb, enumC140736Yb2, enumC140736Yb3, enumC140736Yb4};
        A03 = enumC140736YbArr;
        A02 = AbstractC12190kN.A00(enumC140736YbArr);
    }

    public static EnumC140736Yb valueOf(String str) {
        return (EnumC140736Yb) Enum.valueOf(EnumC140736Yb.class, str);
    }

    public static EnumC140736Yb[] values() {
        return (EnumC140736Yb[]) A03.clone();
    }

    public EnumC140736Yb(String str, String str2, String str3, int i) {
        this.A01 = str2;
        this.A00 = str3;
    }
}
