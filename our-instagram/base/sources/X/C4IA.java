package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.4IA, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4IA {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ C4IA[] A02;
    public static final C4IA A03;
    public static final C4IA A04;
    public static final C4IA A05;
    public static final C4IA A06;
    public static final C4IA A07;
    public static final C4IA A08;
    public static final C4IA A09;
    public static final C4IA A0A;
    public static final C4IA A0B;
    public final String A00;

    static {
        C4IA c4ia = new C4IA("LOCATION_FOREGROUND", 0, "LOCATION_FOREGROUND");
        A08 = c4ia;
        C4IA c4ia2 = new C4IA("LOCATION_BACKGROUND", 1, "LOCATION_BACKGROUND");
        A07 = c4ia2;
        C4IA c4ia3 = new C4IA("PHOTO_STORAGE", 2, "PHOTO_STORAGE");
        A0B = c4ia3;
        C4IA c4ia4 = new C4IA("CAMERA", 3, "CAMERA");
        A05 = c4ia4;
        C4IA c4ia5 = new C4IA("CONTACT", 4, "CONTACT");
        A06 = c4ia5;
        C4IA c4ia6 = new C4IA("MICROPHONE", 5, "MICROPHONE");
        A09 = c4ia6;
        C4IA c4ia7 = new C4IA("ADS_TRACKING", 6, "ADS_TRACKING");
        A03 = c4ia7;
        C4IA c4ia8 = new C4IA("CALENDAR", 7, "CALENDAR");
        A04 = c4ia8;
        C4IA c4ia9 = new C4IA("NOTIFICATION", 8, "NOTIFICATION");
        A0A = c4ia9;
        C4IA[] c4iaArr = {c4ia, c4ia2, c4ia3, c4ia4, c4ia5, c4ia6, c4ia7, c4ia8, c4ia9, new C4IA("LOCAL_NETWORK", 9, "LOCAL_NETWORK")};
        A02 = c4iaArr;
        A01 = AbstractC12190kN.A00(c4iaArr);
    }

    public static C4IA valueOf(String str) {
        return (C4IA) Enum.valueOf(C4IA.class, str);
    }

    public static C4IA[] values() {
        return (C4IA[]) A02.clone();
    }

    public C4IA(String str, int i, String str2) {
        this.A00 = str2;
    }
}
