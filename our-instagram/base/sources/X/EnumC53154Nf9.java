package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Nf9, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53154Nf9 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC53154Nf9[] A01;
    public static final EnumC53154Nf9 A02;
    public static final EnumC53154Nf9 A03;
    public static final EnumC53154Nf9 A04;
    public static final EnumC53154Nf9 A05;

    static {
        EnumC53154Nf9 enumC53154Nf9 = new EnumC53154Nf9("UNSET", 0);
        A05 = enumC53154Nf9;
        EnumC53154Nf9 enumC53154Nf92 = new EnumC53154Nf9("OFF", 1);
        A02 = enumC53154Nf92;
        EnumC53154Nf9 enumC53154Nf93 = new EnumC53154Nf9("PENDING", 2);
        A04 = enumC53154Nf93;
        EnumC53154Nf9 enumC53154Nf94 = new EnumC53154Nf9("ON", 3);
        A03 = enumC53154Nf94;
        EnumC53154Nf9[] enumC53154Nf9Arr = {enumC53154Nf9, enumC53154Nf92, enumC53154Nf93, enumC53154Nf94};
        A01 = enumC53154Nf9Arr;
        A00 = AbstractC12190kN.A00(enumC53154Nf9Arr);
    }

    public static EnumC53154Nf9 valueOf(String str) {
        return (EnumC53154Nf9) Enum.valueOf(EnumC53154Nf9.class, str);
    }

    public static EnumC53154Nf9[] values() {
        return (EnumC53154Nf9[]) A01.clone();
    }

    public EnumC53154Nf9(String str, int i) {
    }
}
