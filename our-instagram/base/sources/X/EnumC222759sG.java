package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.9sG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC222759sG {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC222759sG[] A01;
    public static final EnumC222759sG A02;
    public static final EnumC222759sG A03;
    public static final EnumC222759sG A04;
    public static final EnumC222759sG A05;
    public static final EnumC222759sG A06;
    public static final EnumC222759sG A07;

    static {
        EnumC222759sG enumC222759sG = new EnumC222759sG("VOICEOVER", 0);
        A06 = enumC222759sG;
        EnumC222759sG enumC222759sG2 = new EnumC222759sG("VOLUME", 1);
        A07 = enumC222759sG2;
        EnumC222759sG enumC222759sG3 = new EnumC222759sG("CUTOUT", 2);
        A04 = enumC222759sG3;
        EnumC222759sG enumC222759sG4 = new EnumC222759sG("REORDER", 3);
        A05 = enumC222759sG4;
        EnumC222759sG enumC222759sG5 = new EnumC222759sG("COLOR_FILTER", 4);
        A03 = enumC222759sG5;
        EnumC222759sG enumC222759sG6 = new EnumC222759sG("CLIP_LEVEL_EDIT", 5);
        A02 = enumC222759sG6;
        EnumC222759sG[] enumC222759sGArr = {enumC222759sG, enumC222759sG2, enumC222759sG3, enumC222759sG4, enumC222759sG5, enumC222759sG6};
        A01 = enumC222759sGArr;
        A00 = AbstractC12190kN.A00(enumC222759sGArr);
    }

    public static EnumC222759sG valueOf(String str) {
        return (EnumC222759sG) Enum.valueOf(EnumC222759sG.class, str);
    }

    public static EnumC222759sG[] values() {
        return (EnumC222759sG[]) A01.clone();
    }

    public EnumC222759sG(String str, int i) {
    }
}
