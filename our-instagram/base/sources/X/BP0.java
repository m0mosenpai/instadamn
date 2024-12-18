package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class BP0 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ BP0[] A01;
    public static final BP0 A02;
    public static final BP0 A03;
    public static final BP0 A04;
    public static final BP0 A05;

    static {
        BP0 bp0 = new BP0("MUSIC_ICON", 0);
        A03 = bp0;
        BP0 bp02 = new BP0("MUSIC_ICON_V2", 1);
        A04 = bp02;
        BP0 bp03 = new BP0("MUSIC_ICON_V3", 2);
        A05 = bp03;
        BP0 bp04 = new BP0("AUDIO_FILTER", 3);
        A02 = bp04;
        BP0[] bp0Arr = {bp0, bp02, bp03, bp04};
        A01 = bp0Arr;
        A00 = AbstractC12190kN.A00(bp0Arr);
    }

    public static BP0 valueOf(String str) {
        return (BP0) Enum.valueOf(BP0.class, str);
    }

    public static BP0[] values() {
        return (BP0[]) A01.clone();
    }

    public BP0(String str, int i) {
    }
}
