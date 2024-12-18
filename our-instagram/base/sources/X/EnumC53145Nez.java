package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Nez, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53145Nez {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC53145Nez[] A01;
    public static final EnumC53145Nez A02;
    public static final EnumC53145Nez A03;
    public static final EnumC53145Nez A04;

    static {
        EnumC53145Nez enumC53145Nez = new EnumC53145Nez("NORMAL", 0);
        A03 = enumC53145Nez;
        EnumC53145Nez enumC53145Nez2 = new EnumC53145Nez("WEAK", 1);
        A04 = enumC53145Nez2;
        EnumC53145Nez enumC53145Nez3 = new EnumC53145Nez("CRITICAL", 2);
        A02 = enumC53145Nez3;
        EnumC53145Nez[] enumC53145NezArr = {enumC53145Nez, enumC53145Nez2, enumC53145Nez3};
        A01 = enumC53145NezArr;
        A00 = AbstractC12190kN.A00(enumC53145NezArr);
    }

    public static EnumC53145Nez valueOf(String str) {
        return (EnumC53145Nez) Enum.valueOf(EnumC53145Nez.class, str);
    }

    public static EnumC53145Nez[] values() {
        return (EnumC53145Nez[]) A01.clone();
    }

    public EnumC53145Nez(String str, int i) {
    }
}
