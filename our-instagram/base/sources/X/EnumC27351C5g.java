package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.C5g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC27351C5g {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC27351C5g[] A01;
    public static final EnumC27351C5g A02;

    static {
        EnumC27351C5g enumC27351C5g = new EnumC27351C5g("GOOD", 0);
        A02 = enumC27351C5g;
        EnumC27351C5g[] enumC27351C5gArr = {enumC27351C5g, new EnumC27351C5g("BAD", 1)};
        A01 = enumC27351C5gArr;
        A00 = AbstractC12190kN.A00(enumC27351C5gArr);
    }

    public static EnumC27351C5g valueOf(String str) {
        return (EnumC27351C5g) Enum.valueOf(EnumC27351C5g.class, str);
    }

    public static EnumC27351C5g[] values() {
        return (EnumC27351C5g[]) A01.clone();
    }

    public EnumC27351C5g(String str, int i) {
    }
}
