package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.EoU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33335EoU {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC33335EoU[] A01;
    public static final EnumC33335EoU A02;
    public static final EnumC33335EoU A03;
    public static final EnumC33335EoU A04;

    static {
        EnumC33335EoU enumC33335EoU = new EnumC33335EoU("LOADED", 0);
        A02 = enumC33335EoU;
        EnumC33335EoU enumC33335EoU2 = new EnumC33335EoU("LOADING", 1);
        A03 = enumC33335EoU2;
        EnumC33335EoU enumC33335EoU3 = new EnumC33335EoU("PAGINATING", 2);
        A04 = enumC33335EoU3;
        EnumC33335EoU[] enumC33335EoUArr = {enumC33335EoU, enumC33335EoU2, enumC33335EoU3};
        A01 = enumC33335EoUArr;
        A00 = AbstractC12190kN.A00(enumC33335EoUArr);
    }

    public static EnumC33335EoU valueOf(String str) {
        return (EnumC33335EoU) Enum.valueOf(EnumC33335EoU.class, str);
    }

    public static EnumC33335EoU[] values() {
        return (EnumC33335EoU[]) A01.clone();
    }

    public EnumC33335EoU(String str, int i) {
    }
}
