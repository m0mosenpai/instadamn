package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.8ZA, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8ZA {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C8ZA[] A01;
    public static final C8ZA A02;
    public static final C8ZA A03;
    public static final C8ZA A04;
    public static final C8ZA A05;
    public static final C8ZA A06;
    public static final C8ZA A07;
    public static final C8ZA A08;
    public static final C8ZA A09;

    static {
        C8ZA c8za = new C8ZA("IMAGINE_TEMPLATE_ADD_TEXT", 0);
        A07 = c8za;
        C8ZA c8za2 = new C8ZA("POSES_PROMOTION", 1);
        A08 = c8za2;
        C8ZA c8za3 = new C8ZA("UNLOCKED_STICKER", 2);
        A09 = c8za3;
        C8ZA c8za4 = new C8ZA("CLIPS_PRELOADED_SETTINGS_IN_CAMERA_PROMOTION", 3);
        A05 = c8za4;
        C8ZA c8za5 = new C8ZA("CLIPS_POSTCAP_AUDIO_UPSELL", 4);
        A02 = c8za5;
        C8ZA c8za6 = new C8ZA("CLIPS_POSTCAP_RECENTLY_WATCHED_AUDIO_UPSELL", 5);
        A03 = c8za6;
        C8ZA c8za7 = new C8ZA("CLIPS_POSTCAP_TOP_SUGGESTED_AUDIO_UPSELL", 6);
        A04 = c8za7;
        C8ZA c8za8 = new C8ZA("FEED_CREATION_AUDIO_UPSELL", 7);
        A06 = c8za8;
        C8ZA[] c8zaArr = {c8za, c8za2, c8za3, c8za4, c8za5, c8za6, c8za7, c8za8};
        A01 = c8zaArr;
        A00 = AbstractC12190kN.A00(c8zaArr);
    }

    public static C8ZA valueOf(String str) {
        return (C8ZA) Enum.valueOf(C8ZA.class, str);
    }

    public static C8ZA[] values() {
        return (C8ZA[]) A01.clone();
    }

    public C8ZA(String str, int i) {
    }
}
