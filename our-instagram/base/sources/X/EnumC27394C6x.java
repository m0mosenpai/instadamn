package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.C6x, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC27394C6x {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC27394C6x[] A01;
    public static final EnumC27394C6x A02;
    public static final EnumC27394C6x A03;
    public static final EnumC27394C6x A04;
    public static final EnumC27394C6x A05;
    public static final EnumC27394C6x A06;

    static {
        EnumC27394C6x enumC27394C6x = new EnumC27394C6x("Initial", 0);
        A04 = enumC27394C6x;
        EnumC27394C6x enumC27394C6x2 = new EnumC27394C6x("Loading", 1);
        A05 = enumC27394C6x2;
        EnumC27394C6x enumC27394C6x3 = new EnumC27394C6x("GeneratingTheme", 2);
        A03 = enumC27394C6x3;
        EnumC27394C6x enumC27394C6x4 = new EnumC27394C6x("Failed", 3);
        A02 = enumC27394C6x4;
        EnumC27394C6x enumC27394C6x5 = new EnumC27394C6x("Success", 4);
        A06 = enumC27394C6x5;
        EnumC27394C6x[] enumC27394C6xArr = {enumC27394C6x, enumC27394C6x2, enumC27394C6x3, enumC27394C6x4, enumC27394C6x5};
        A01 = enumC27394C6xArr;
        A00 = AbstractC12190kN.A00(enumC27394C6xArr);
    }

    public static EnumC27394C6x valueOf(String str) {
        return (EnumC27394C6x) Enum.valueOf(EnumC27394C6x.class, str);
    }

    public static EnumC27394C6x[] values() {
        return (EnumC27394C6x[]) A01.clone();
    }

    public EnumC27394C6x(String str, int i) {
    }
}
