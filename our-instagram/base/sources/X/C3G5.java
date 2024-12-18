package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.3G5, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3G5 {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ C3G5[] A02;
    public static final C3G5 A03;
    public static final C3G5 A04;
    public static final C3G5 A05;
    public static final C3G5 A06;
    public static final C3G5 A07;
    public static final C3G5 A08;
    public static final C3G5 A09;
    public static final C3G5 A0A;
    public static final C3G5 A0B;
    public static final C3G5 A0C;
    public static final C3G5 A0D;
    public static final C3G5 A0E;
    public static final C3G5 A0F;
    public static final C3G5 A0G;
    public static final C3G5 A0H;
    public static final C3G5 A0I;
    public static final C3G5 A0J;
    public static final C3G5 A0K;
    public final String A00;

    static {
        C3G5 c3g5 = new C3G5("FOREGROUND_PREFETCH", 0, "foreground_prefetch");
        A0B = c3g5;
        C3G5 c3g52 = new C3G5("BACKGROUND_PREFETCH", 1, "background_prefetch");
        A04 = c3g52;
        C3G5 c3g53 = new C3G5("ON_SCROLL", 2, "on_scroll");
        A0H = c3g53;
        C3G5 c3g54 = new C3G5("BUFFER_ON_SWIPE", 3, "on_swipe");
        A06 = c3g54;
        C3G5 c3g55 = new C3G5("BUFFER_ON_TAP", 4, "on_tap");
        A07 = c3g55;
        C3G5 c3g56 = new C3G5("BUFFER_IN_VIEWER", 5, "buffer_in_viewer");
        A05 = c3g56;
        C3G5 c3g57 = new C3G5("ON_VIEWER_BIND", 6, "on_viewer_bind");
        A0J = c3g57;
        C3G5 c3g58 = new C3G5("ON_TAP", 7, "on_tap");
        A0I = c3g58;
        C3G5 c3g59 = new C3G5("NOTIFICATION", 8, "notification");
        A0G = c3g59;
        C3G5 c3g510 = new C3G5("NEW_STORY_POG_NOTIFICATION", 9, "new_story_pog_notification");
        A0F = c3g510;
        C3G5 c3g511 = new C3G5("CURRENT_VISIBLE", 10, "current_visible");
        A09 = c3g511;
        C3G5 c3g512 = new C3G5("ON_VPVD_ENTER", 11, "on_vpvd_enter");
        A0K = c3g512;
        C3G5 c3g513 = new C3G5("CONTEXTUAL_RESORT", 12, "contextual_resort");
        A08 = c3g513;
        C3G5 c3g514 = new C3G5("MAIN_TRAY_RESORT", 13, "main_tray_resort");
        A0D = c3g514;
        C3G5 c3g515 = new C3G5("MAIN_TRAY_SERVER_RESPONSE", 14, "main_tray_server_response");
        A0E = c3g515;
        C3G5 c3g516 = new C3G5("DIRECT_SHARE", 15, "direct_share");
        A0A = c3g516;
        C3G5 c3g517 = new C3G5("AD", 16, "ad");
        A03 = c3g517;
        C3G5 c3g518 = new C3G5("INSPIRATION_HUB", 17, "inspiration_hub");
        A0C = c3g518;
        C3G5[] c3g5Arr = {c3g5, c3g52, c3g53, c3g54, c3g55, c3g56, c3g57, c3g58, c3g59, c3g510, c3g511, c3g512, c3g513, c3g514, c3g515, c3g516, c3g517, c3g518};
        A02 = c3g5Arr;
        A01 = AbstractC12190kN.A00(c3g5Arr);
    }

    public static C3G5 valueOf(String str) {
        return (C3G5) Enum.valueOf(C3G5.class, str);
    }

    public static C3G5[] values() {
        return (C3G5[]) A02.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public C3G5(String str, int i, String str2) {
        this.A00 = str2;
    }
}
