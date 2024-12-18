package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.RfO, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC61108RfO {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC61108RfO[] A01;
    public static final EnumC61108RfO A02;
    public static final EnumC61108RfO A03;
    public static final EnumC61108RfO A04;

    static {
        EnumC61108RfO enumC61108RfO = new EnumC61108RfO("One", 0);
        A02 = enumC61108RfO;
        EnumC61108RfO enumC61108RfO2 = new EnumC61108RfO("Two", 1);
        A04 = enumC61108RfO2;
        EnumC61108RfO enumC61108RfO3 = new EnumC61108RfO("Three", 2);
        A03 = enumC61108RfO3;
        EnumC61108RfO[] enumC61108RfOArr = {enumC61108RfO, enumC61108RfO2, enumC61108RfO3};
        A01 = enumC61108RfOArr;
        A00 = AbstractC12190kN.A00(enumC61108RfOArr);
    }

    public static EnumC61108RfO valueOf(String str) {
        return (EnumC61108RfO) Enum.valueOf(EnumC61108RfO.class, str);
    }

    public static EnumC61108RfO[] values() {
        return (EnumC61108RfO[]) A01.clone();
    }

    public EnumC61108RfO(String str, int i) {
    }
}
