package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Rfa, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC61120Rfa {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC61120Rfa[] A01;
    public static final EnumC61120Rfa A02;
    public static final EnumC61120Rfa A03;
    public static final EnumC61120Rfa A04;
    public static final EnumC61120Rfa A05;

    static {
        EnumC61120Rfa enumC61120Rfa = new EnumC61120Rfa("InvalidInput", 0);
        A03 = enumC61120Rfa;
        EnumC61120Rfa enumC61120Rfa2 = new EnumC61120Rfa("ValidInput", 1);
        A05 = enumC61120Rfa2;
        EnumC61120Rfa enumC61120Rfa3 = new EnumC61120Rfa("OperationInProgress", 2);
        A04 = enumC61120Rfa3;
        EnumC61120Rfa enumC61120Rfa4 = new EnumC61120Rfa("Error", 3);
        A02 = enumC61120Rfa4;
        EnumC61120Rfa[] enumC61120RfaArr = {enumC61120Rfa, enumC61120Rfa2, enumC61120Rfa3, enumC61120Rfa4};
        A01 = enumC61120RfaArr;
        A00 = AbstractC12190kN.A00(enumC61120RfaArr);
    }

    public static EnumC61120Rfa valueOf(String str) {
        return (EnumC61120Rfa) Enum.valueOf(EnumC61120Rfa.class, str);
    }

    public static EnumC61120Rfa[] values() {
        return (EnumC61120Rfa[]) A01.clone();
    }

    public EnumC61120Rfa(String str, int i) {
    }
}
