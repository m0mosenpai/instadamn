package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Kc6, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46168Kc6 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC46168Kc6[] A01;
    public static final EnumC46168Kc6 A02;
    public static final EnumC46168Kc6 A03;
    public static final EnumC46168Kc6 A04;
    public static final EnumC46168Kc6 A05;
    public static final EnumC46168Kc6 A06;

    static {
        EnumC46168Kc6 enumC46168Kc6 = new EnumC46168Kc6("UNKNOWN", 0);
        A06 = enumC46168Kc6;
        EnumC46168Kc6 enumC46168Kc62 = new EnumC46168Kc6("TEAR_DOWN_START", 1);
        A05 = enumC46168Kc62;
        EnumC46168Kc6 enumC46168Kc63 = new EnumC46168Kc6("TEAR_DOWN_END", 2);
        A04 = enumC46168Kc63;
        EnumC46168Kc6 enumC46168Kc64 = new EnumC46168Kc6("BOOTSTRAP_START", 3);
        A03 = enumC46168Kc64;
        EnumC46168Kc6 enumC46168Kc65 = new EnumC46168Kc6("BOOTSTRAP_END", 4);
        A02 = enumC46168Kc65;
        EnumC46168Kc6[] enumC46168Kc6Arr = {enumC46168Kc6, enumC46168Kc62, enumC46168Kc63, enumC46168Kc64, enumC46168Kc65};
        A01 = enumC46168Kc6Arr;
        A00 = AbstractC12190kN.A00(enumC46168Kc6Arr);
    }

    public static EnumC46168Kc6 valueOf(String str) {
        return (EnumC46168Kc6) Enum.valueOf(EnumC46168Kc6.class, str);
    }

    public static EnumC46168Kc6[] values() {
        return (EnumC46168Kc6[]) A01.clone();
    }

    public EnumC46168Kc6(String str, int i) {
    }
}
