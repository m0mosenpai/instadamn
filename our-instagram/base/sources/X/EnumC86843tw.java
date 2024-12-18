package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.3tw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC86843tw {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC86843tw[] A01;
    public static final EnumC86843tw A02;
    public static final EnumC86843tw A03;
    public static final EnumC86843tw A04;
    public static final EnumC86843tw A05;
    public static final EnumC86843tw A06;
    public static final EnumC86843tw A07;
    public static final EnumC86843tw A08;
    public static final EnumC86843tw A09;
    public static final EnumC86843tw A0A;
    public static final EnumC86843tw A0B;

    static {
        EnumC86843tw enumC86843tw = new EnumC86843tw("TAP_TO_SOUND", 0);
        A05 = enumC86843tw;
        EnumC86843tw enumC86843tw2 = new EnumC86843tw("TAP_TO_REELS", 1);
        A03 = enumC86843tw2;
        EnumC86843tw enumC86843tw3 = new EnumC86843tw("TAP_TO_WATCH_AND_BROWSE", 2);
        A06 = enumC86843tw3;
        EnumC86843tw enumC86843tw4 = new EnumC86843tw("TAP_TO_FEED_OF_ADS", 3);
        A02 = enumC86843tw4;
        EnumC86843tw enumC86843tw5 = new EnumC86843tw("TAP_TO_REELS_CHAIN", 4);
        A04 = enumC86843tw5;
        EnumC86843tw enumC86843tw6 = new EnumC86843tw("TAP_TO_WATCH_AND_BROWSE_REELS_VIEWER", 5);
        A09 = enumC86843tw6;
        EnumC86843tw enumC86843tw7 = new EnumC86843tw("TAP_TO_WATCH_AND_BROWSE_ON_REELS_VIEWER_WITH_CHAINING", 6);
        A08 = enumC86843tw7;
        EnumC86843tw enumC86843tw8 = new EnumC86843tw("TAP_TO_WATCH_AND_BROWSE_LEADGEN_ON_REELS_VIEWER", 7);
        A07 = enumC86843tw8;
        EnumC86843tw enumC86843tw9 = new EnumC86843tw("TAP_TO_WATCH_AND_BROWSE_TALL_VIDEO_ON_REELS_VIEWER_WITH_CHAINING", 8);
        A0A = enumC86843tw9;
        EnumC86843tw enumC86843tw10 = new EnumC86843tw("UNDEFINED", 9);
        A0B = enumC86843tw10;
        EnumC86843tw[] enumC86843twArr = {enumC86843tw, enumC86843tw2, enumC86843tw3, enumC86843tw4, enumC86843tw5, enumC86843tw6, enumC86843tw7, enumC86843tw8, enumC86843tw9, enumC86843tw10};
        A01 = enumC86843twArr;
        A00 = AbstractC12190kN.A00(enumC86843twArr);
    }

    public static EnumC86843tw valueOf(String str) {
        return (EnumC86843tw) Enum.valueOf(EnumC86843tw.class, str);
    }

    public static EnumC86843tw[] values() {
        return (EnumC86843tw[]) A01.clone();
    }

    public EnumC86843tw(String str, int i) {
    }
}
