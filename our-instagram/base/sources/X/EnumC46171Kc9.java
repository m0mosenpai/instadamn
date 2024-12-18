package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Kc9, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46171Kc9 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC46171Kc9[] A01;
    public static final EnumC46171Kc9 A02;
    public static final EnumC46171Kc9 A03;
    public static final EnumC46171Kc9 A04;
    public static final EnumC46171Kc9 A05;
    public static final EnumC46171Kc9 A06;
    public static final EnumC46171Kc9 A07;

    static {
        EnumC46171Kc9 enumC46171Kc9 = new EnumC46171Kc9("Unknown", 0);
        A07 = enumC46171Kc9;
        EnumC46171Kc9 enumC46171Kc92 = new EnumC46171Kc9("Loading", 1);
        A04 = enumC46171Kc92;
        EnumC46171Kc9 enumC46171Kc93 = new EnumC46171Kc9("Failure", 2);
        A03 = enumC46171Kc93;
        EnumC46171Kc9 enumC46171Kc94 = new EnumC46171Kc9("NoDecisionMade", 3);
        A06 = enumC46171Kc94;
        EnumC46171Kc9 enumC46171Kc95 = new EnumC46171Kc9("BackupCreated", 4);
        A02 = enumC46171Kc95;
        EnumC46171Kc9 enumC46171Kc96 = new EnumC46171Kc9("LocalDeviceOnly", 5);
        A05 = enumC46171Kc96;
        EnumC46171Kc9[] enumC46171Kc9Arr = {enumC46171Kc9, enumC46171Kc92, enumC46171Kc93, enumC46171Kc94, enumC46171Kc95, enumC46171Kc96};
        A01 = enumC46171Kc9Arr;
        A00 = AbstractC12190kN.A00(enumC46171Kc9Arr);
    }

    public static EnumC46171Kc9 valueOf(String str) {
        return (EnumC46171Kc9) Enum.valueOf(EnumC46171Kc9.class, str);
    }

    public static EnumC46171Kc9[] values() {
        return (EnumC46171Kc9[]) A01.clone();
    }

    public EnumC46171Kc9(String str, int i) {
    }
}
