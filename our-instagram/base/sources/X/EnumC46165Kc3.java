package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Kc3, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46165Kc3 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC46165Kc3[] A01;
    public static final EnumC46165Kc3 A02;
    public static final EnumC46165Kc3 A03;
    public static final EnumC46165Kc3 A04;
    public static final EnumC46165Kc3 A05;
    public static final EnumC46165Kc3 A06;

    static {
        EnumC46165Kc3 enumC46165Kc3 = new EnumC46165Kc3("Unknown", 0);
        A06 = enumC46165Kc3;
        EnumC46165Kc3 enumC46165Kc32 = new EnumC46165Kc3("Loading", 1);
        A03 = enumC46165Kc32;
        EnumC46165Kc3 enumC46165Kc33 = new EnumC46165Kc3("FetchError", 2);
        A02 = enumC46165Kc33;
        EnumC46165Kc3 enumC46165Kc34 = new EnumC46165Kc3("OptedOut", 3);
        A05 = enumC46165Kc34;
        EnumC46165Kc3 enumC46165Kc35 = new EnumC46165Kc3("NotOptedOut", 4);
        A04 = enumC46165Kc35;
        EnumC46165Kc3[] enumC46165Kc3Arr = {enumC46165Kc3, enumC46165Kc32, enumC46165Kc33, enumC46165Kc34, enumC46165Kc35};
        A01 = enumC46165Kc3Arr;
        A00 = AbstractC12190kN.A00(enumC46165Kc3Arr);
    }

    public static EnumC46165Kc3 valueOf(String str) {
        return (EnumC46165Kc3) Enum.valueOf(EnumC46165Kc3.class, str);
    }

    public static EnumC46165Kc3[] values() {
        return (EnumC46165Kc3[]) A01.clone();
    }

    public EnumC46165Kc3(String str, int i) {
    }
}
