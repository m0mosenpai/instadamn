package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.EoW, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33337EoW {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC33337EoW[] A01;
    public static final EnumC33337EoW A02;
    public static final EnumC33337EoW A03;
    public static final EnumC33337EoW A04;

    static {
        EnumC33337EoW enumC33337EoW = new EnumC33337EoW("DEFAULT", 0);
        A02 = enumC33337EoW;
        EnumC33337EoW enumC33337EoW2 = new EnumC33337EoW("EMPHASIZED", 1);
        A04 = enumC33337EoW2;
        EnumC33337EoW enumC33337EoW3 = new EnumC33337EoW("DESTRUCTIVE", 2);
        A03 = enumC33337EoW3;
        EnumC33337EoW[] enumC33337EoWArr = {enumC33337EoW, enumC33337EoW2, enumC33337EoW3};
        A01 = enumC33337EoWArr;
        A00 = AbstractC12190kN.A00(enumC33337EoWArr);
    }

    public static EnumC33337EoW valueOf(String str) {
        return (EnumC33337EoW) Enum.valueOf(EnumC33337EoW.class, str);
    }

    public static EnumC33337EoW[] values() {
        return (EnumC33337EoW[]) A01.clone();
    }

    public EnumC33337EoW(String str, int i) {
    }
}
