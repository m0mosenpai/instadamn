package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Kbr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46153Kbr {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC46153Kbr[] A01;
    public static final EnumC46153Kbr A02;
    public static final EnumC46153Kbr A03;
    public static final EnumC46153Kbr A04;

    static {
        EnumC46153Kbr enumC46153Kbr = new EnumC46153Kbr("Emoji", 0);
        A02 = enumC46153Kbr;
        EnumC46153Kbr enumC46153Kbr2 = new EnumC46153Kbr("Sticker", 1);
        A04 = enumC46153Kbr2;
        EnumC46153Kbr enumC46153Kbr3 = new EnumC46153Kbr("FewEmoji", 2);
        A03 = enumC46153Kbr3;
        EnumC46153Kbr[] enumC46153KbrArr = {enumC46153Kbr, enumC46153Kbr2, enumC46153Kbr3};
        A01 = enumC46153KbrArr;
        A00 = AbstractC12190kN.A00(enumC46153KbrArr);
    }

    public static EnumC46153Kbr valueOf(String str) {
        return (EnumC46153Kbr) Enum.valueOf(EnumC46153Kbr.class, str);
    }

    public static EnumC46153Kbr[] values() {
        return (EnumC46153Kbr[]) A01.clone();
    }

    public EnumC46153Kbr(String str, int i) {
    }
}
