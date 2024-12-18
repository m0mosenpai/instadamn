package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class Hd8 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ Hd8[] A01;
    public static final Hd8 A02;
    public static final Hd8 A03;
    public static final Hd8 A04;

    static {
        Hd8 hd8 = new Hd8("GENERIC_FEED", 0);
        A04 = hd8;
        Hd8 hd82 = new Hd8("FAVORITES_FEED", 1);
        A03 = hd82;
        Hd8 hd83 = new Hd8("FAN_CLUB_FEED", 2);
        A02 = hd83;
        Hd8[] hd8Arr = {hd8, hd82, hd83};
        A01 = hd8Arr;
        A00 = AbstractC12190kN.A00(hd8Arr);
    }

    public static Hd8 valueOf(String str) {
        return (Hd8) Enum.valueOf(Hd8.class, str);
    }

    public static Hd8[] values() {
        return (Hd8[]) A01.clone();
    }

    public Hd8(String str, int i) {
    }
}
