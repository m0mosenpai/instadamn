package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.39B, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C39B {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C39B[] A01;
    public static final C39B A02;
    public static final C39B A03;
    public static final C39B A04;
    public static final C39B A05;
    public static final C39B A06;
    public static final C39B A07;
    public static final C39B A08;
    public static final C39B A09;
    public static final C39B A0A;
    public static final C39B A0B;
    public static final C39B A0C;
    public static final C39B A0D;
    public static final C39B A0E;
    public static final C39B A0F;
    public static final C39B A0G;
    public static final C39B A0H;

    static {
        C39B c39b = new C39B("FEED_REEL_VIEWER_TALL_VIDEO", 0);
        A0E = c39b;
        C39B c39b2 = new C39B("FEED_REEL_VIEWER_OTHER_RESOLUTION", 1);
        A0D = c39b2;
        C39B c39b3 = new C39B("FEED_WATCH_AND_BROWSE", 2);
        A0G = c39b3;
        C39B c39b4 = new C39B("CLIPS_FEED_WATCH_AND_BROWSE", 3);
        A03 = c39b4;
        C39B c39b5 = new C39B("CLIPS_FEED_WATCH_AND_BROWSE_WITH_CHAINING", 4);
        A05 = c39b5;
        C39B c39b6 = new C39B("CLIPS_FEED_TALL_VIDEO_WATCH_AND_BROWSE_WITH_CHAINING", 5);
        A02 = c39b6;
        C39B c39b7 = new C39B("CLIPS_FEED_WATCH_AND_BROWSE_LEADGEN", 6);
        A04 = c39b7;
        C39B c39b8 = new C39B("EXPLORE_FEED_WATCH_AND_BROWSE", 7);
        A09 = c39b8;
        C39B c39b9 = new C39B("EXPLORE_GRID_WATCH_AND_BROWSE", 8);
        A0A = c39b9;
        C39B c39b10 = new C39B("EXPLORE_FEED_SEED_AD", 9);
        A08 = c39b10;
        C39B c39b11 = new C39B("CLIPS_MULTI_ADS_WATCH_AND_BROWSE", 10);
        A06 = c39b11;
        C39B c39b12 = new C39B("CLIPS_OVERLAY_WATCH_MORE_REELS", 11);
        A07 = c39b12;
        C39B c39b13 = new C39B("FEED_OF_ADS", 12);
        A0B = c39b13;
        C39B c39b14 = new C39B("SEED_AD", 13);
        A0H = c39b14;
        C39B c39b15 = new C39B("FEED_PAE_MULTI_ADS_WATCH_AND_BROWSE", 14);
        A0C = c39b15;
        C39B c39b16 = new C39B("FEED_SA_MULTI_ADS_WATCH_AND_BROWSE", 15);
        A0F = c39b16;
        C39B[] c39bArr = {c39b, c39b2, c39b3, c39b4, c39b5, c39b6, c39b7, c39b8, c39b9, c39b10, c39b11, c39b12, c39b13, c39b14, c39b15, c39b16};
        A01 = c39bArr;
        A00 = AbstractC12190kN.A00(c39bArr);
    }

    public static C39B valueOf(String str) {
        return (C39B) Enum.valueOf(C39B.class, str);
    }

    public static C39B[] values() {
        return (C39B[]) A01.clone();
    }

    public C39B(String str, int i) {
    }
}
