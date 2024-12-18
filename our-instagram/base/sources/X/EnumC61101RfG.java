package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.RfG, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC61101RfG {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC61101RfG[] A01;
    public static final EnumC61101RfG A02;
    public static final EnumC61101RfG A03;

    static {
        EnumC61101RfG enumC61101RfG = new EnumC61101RfG("ID_FRONT_SIDE", 0);
        A03 = enumC61101RfG;
        EnumC61101RfG enumC61101RfG2 = new EnumC61101RfG("ID_BACK_SIDE", 1);
        A02 = enumC61101RfG2;
        EnumC61101RfG[] enumC61101RfGArr = {enumC61101RfG, enumC61101RfG2};
        A01 = enumC61101RfGArr;
        A00 = AbstractC12190kN.A00(enumC61101RfGArr);
    }

    public static EnumC61101RfG valueOf(String str) {
        return (EnumC61101RfG) Enum.valueOf(EnumC61101RfG.class, str);
    }

    public static EnumC61101RfG[] values() {
        return (EnumC61101RfG[]) A01.clone();
    }

    public EnumC61101RfG(String str, int i) {
    }
}
