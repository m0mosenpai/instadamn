package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.2Ur, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC50702Ur {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC50702Ur[] A01;
    public static final EnumC50702Ur A02;
    public static final EnumC50702Ur A03;
    public static final EnumC50702Ur A04;
    public static final EnumC50702Ur A05;
    public static final EnumC50702Ur A06;

    static {
        EnumC50702Ur enumC50702Ur = new EnumC50702Ur("VERBOSE", 0);
        A05 = enumC50702Ur;
        EnumC50702Ur enumC50702Ur2 = new EnumC50702Ur("DEBUG", 1);
        A02 = enumC50702Ur2;
        EnumC50702Ur enumC50702Ur3 = new EnumC50702Ur("WARNING", 2);
        A06 = enumC50702Ur3;
        EnumC50702Ur enumC50702Ur4 = new EnumC50702Ur("ERROR", 3);
        A03 = enumC50702Ur4;
        EnumC50702Ur enumC50702Ur5 = new EnumC50702Ur("FATAL", 4);
        A04 = enumC50702Ur5;
        EnumC50702Ur[] enumC50702UrArr = {enumC50702Ur, enumC50702Ur2, enumC50702Ur3, enumC50702Ur4, enumC50702Ur5};
        A01 = enumC50702UrArr;
        A00 = AbstractC12190kN.A00(enumC50702UrArr);
    }

    public static EnumC50702Ur valueOf(String str) {
        return (EnumC50702Ur) Enum.valueOf(EnumC50702Ur.class, str);
    }

    public static EnumC50702Ur[] values() {
        return (EnumC50702Ur[]) A01.clone();
    }

    public EnumC50702Ur(String str, int i) {
    }
}
