package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.5qG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC127875qG {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC127875qG[] A02;
    public static final EnumC127875qG A03;
    public static final EnumC127875qG A04;
    public static final EnumC127875qG A05;
    public static final EnumC127875qG A06;
    public static final EnumC127875qG A07;
    public final int A00;

    static {
        EnumC127875qG enumC127875qG = new EnumC127875qG("HIDDEN", 0, -2);
        A03 = enumC127875qG;
        EnumC127875qG enumC127875qG2 = new EnumC127875qG("NOT_A_TOPIC", 1, -1);
        A05 = enumC127875qG2;
        EnumC127875qG enumC127875qG3 = new EnumC127875qG("NOT_INTERESTED", 2, 0);
        A06 = enumC127875qG3;
        EnumC127875qG enumC127875qG4 = new EnumC127875qG("INTERESTED", 3, 1);
        A04 = enumC127875qG4;
        EnumC127875qG enumC127875qG5 = new EnumC127875qG("SUGGESTED", 4, 2);
        A07 = enumC127875qG5;
        EnumC127875qG[] enumC127875qGArr = {enumC127875qG, enumC127875qG2, enumC127875qG3, enumC127875qG4, enumC127875qG5};
        A02 = enumC127875qGArr;
        A01 = AbstractC12190kN.A00(enumC127875qGArr);
    }

    public static EnumC127875qG valueOf(String str) {
        return (EnumC127875qG) Enum.valueOf(EnumC127875qG.class, str);
    }

    public static EnumC127875qG[] values() {
        return (EnumC127875qG[]) A02.clone();
    }

    public EnumC127875qG(String str, int i, int i2) {
        this.A00 = i2;
    }
}
