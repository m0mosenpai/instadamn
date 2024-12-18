package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.4Wy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC96884Wy {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC96884Wy[] A01;
    public static final EnumC96884Wy A02;
    public static final EnumC96884Wy A03;
    public static final EnumC96884Wy A04;
    public static final EnumC96884Wy A05;
    public static final EnumC96884Wy A06;

    static {
        EnumC96884Wy enumC96884Wy = new EnumC96884Wy("JUMP_BY_SEEKING_GENERAL_TARGET_BUFFER", 0);
        A05 = enumC96884Wy;
        EnumC96884Wy enumC96884Wy2 = new EnumC96884Wy("JUMP_BY_TRIMMING_BY_BUFFER_METER", 1);
        A06 = enumC96884Wy2;
        EnumC96884Wy enumC96884Wy3 = new EnumC96884Wy("JUMP_BY_DISCONTINUITY_LOADING", 2);
        A03 = enumC96884Wy3;
        EnumC96884Wy enumC96884Wy4 = new EnumC96884Wy("JUMP_BY_PAUSE_LOADING", 3);
        A04 = enumC96884Wy4;
        EnumC96884Wy enumC96884Wy5 = new EnumC96884Wy("INITIAL_BUFFER_TRIM", 4);
        A02 = enumC96884Wy5;
        EnumC96884Wy[] enumC96884WyArr = {enumC96884Wy, enumC96884Wy2, enumC96884Wy3, enumC96884Wy4, enumC96884Wy5};
        A01 = enumC96884WyArr;
        A00 = AbstractC12190kN.A00(enumC96884WyArr);
    }

    public static EnumC96884Wy valueOf(String str) {
        return (EnumC96884Wy) Enum.valueOf(EnumC96884Wy.class, str);
    }

    public static EnumC96884Wy[] values() {
        return (EnumC96884Wy[]) A01.clone();
    }

    public EnumC96884Wy(String str, int i) {
    }
}
