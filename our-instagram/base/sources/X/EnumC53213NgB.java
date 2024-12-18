package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.NgB, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53213NgB {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC53213NgB[] A03;
    public static final EnumC53213NgB A04;
    public static final EnumC53213NgB A05;
    public final int A00;

    static {
        EnumC53213NgB enumC53213NgB = new EnumC53213NgB("FILTER", 0, 0);
        A04 = enumC53213NgB;
        EnumC53213NgB enumC53213NgB2 = new EnumC53213NgB("TRIM", 1, 1);
        A05 = enumC53213NgB2;
        EnumC53213NgB[] enumC53213NgBArr = {enumC53213NgB, enumC53213NgB2};
        A03 = enumC53213NgBArr;
        A02 = AbstractC12190kN.A00(enumC53213NgBArr);
        EnumC53213NgB[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (EnumC53213NgB enumC53213NgB3 : values) {
            AbstractC25227BEk.A1O(enumC53213NgB3, A18, enumC53213NgB3.A00);
        }
        A01 = A18;
    }

    public static EnumC53213NgB valueOf(String str) {
        return (EnumC53213NgB) Enum.valueOf(EnumC53213NgB.class, str);
    }

    public static EnumC53213NgB[] values() {
        return (EnumC53213NgB[]) A03.clone();
    }

    public EnumC53213NgB(String str, int i, int i2) {
        this.A00 = i2;
    }
}
