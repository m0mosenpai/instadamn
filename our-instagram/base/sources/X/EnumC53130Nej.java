package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Nej, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53130Nej {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC53130Nej[] A01;
    public static final EnumC53130Nej A02;
    public static final EnumC53130Nej A03;
    public static final EnumC53130Nej A04;

    static {
        EnumC53130Nej enumC53130Nej = new EnumC53130Nej("Idle", 0);
        A03 = enumC53130Nej;
        EnumC53130Nej enumC53130Nej2 = new EnumC53130Nej("Trimming", 1);
        A04 = enumC53130Nej2;
        EnumC53130Nej enumC53130Nej3 = new EnumC53130Nej("Dragging", 2);
        A02 = enumC53130Nej3;
        EnumC53130Nej[] enumC53130NejArr = {enumC53130Nej, enumC53130Nej2, enumC53130Nej3};
        A01 = enumC53130NejArr;
        A00 = AbstractC12190kN.A00(enumC53130NejArr);
    }

    public static EnumC53130Nej valueOf(String str) {
        return (EnumC53130Nej) Enum.valueOf(EnumC53130Nej.class, str);
    }

    public static EnumC53130Nej[] values() {
        return (EnumC53130Nej[]) A01.clone();
    }

    public EnumC53130Nej(String str, int i) {
    }
}
