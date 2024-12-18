package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.KcB, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46173KcB {
    public static final Map A00;
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC46173KcB[] A02;
    public static final EnumC46173KcB A03;
    public static final EnumC46173KcB A04;
    public static final EnumC46173KcB A05;
    public static final EnumC46173KcB A06;
    public static final EnumC46173KcB A07;

    static {
        EnumC46173KcB enumC46173KcB = new EnumC46173KcB("GIPHY", 0);
        A05 = enumC46173KcB;
        EnumC46173KcB enumC46173KcB2 = new EnumC46173KcB("AI", 1);
        A03 = enumC46173KcB2;
        EnumC46173KcB enumC46173KcB3 = new EnumC46173KcB("CUTOUT", 2);
        A04 = enumC46173KcB3;
        EnumC46173KcB enumC46173KcB4 = new EnumC46173KcB("STORE", 3);
        A06 = enumC46173KcB4;
        EnumC46173KcB enumC46173KcB5 = new EnumC46173KcB("UNKNOWN", 4);
        A07 = enumC46173KcB5;
        EnumC46173KcB[] enumC46173KcBArr = {enumC46173KcB, enumC46173KcB2, enumC46173KcB3, enumC46173KcB4, enumC46173KcB5};
        A02 = enumC46173KcBArr;
        C020508b A002 = AbstractC12190kN.A00(enumC46173KcBArr);
        A01 = A002;
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(AbstractC06950Ym.A1E(A002, 10)));
        for (Object obj : A002) {
            A18.put(((EnumC46173KcB) obj).name(), obj);
        }
        A00 = A18;
    }

    public static EnumC46173KcB valueOf(String str) {
        return (EnumC46173KcB) Enum.valueOf(EnumC46173KcB.class, str);
    }

    public static EnumC46173KcB[] values() {
        return (EnumC46173KcB[]) A02.clone();
    }

    public EnumC46173KcB(String str, int i) {
    }
}
