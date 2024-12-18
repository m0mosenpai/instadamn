package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Eok, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33351Eok {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC33351Eok[] A01;
    public static final EnumC33351Eok A02;
    public static final EnumC33351Eok A03;
    public static final EnumC33351Eok A04;
    public static final EnumC33351Eok A05;

    static {
        EnumC33351Eok enumC33351Eok = new EnumC33351Eok("Error", 0);
        A02 = enumC33351Eok;
        EnumC33351Eok enumC33351Eok2 = new EnumC33351Eok("Loading", 1);
        A04 = enumC33351Eok2;
        EnumC33351Eok enumC33351Eok3 = new EnumC33351Eok("Success", 2);
        A05 = enumC33351Eok3;
        EnumC33351Eok enumC33351Eok4 = new EnumC33351Eok("Idle", 3);
        A03 = enumC33351Eok4;
        EnumC33351Eok[] enumC33351EokArr = {enumC33351Eok, enumC33351Eok2, enumC33351Eok3, enumC33351Eok4};
        A01 = enumC33351EokArr;
        A00 = AbstractC12190kN.A00(enumC33351EokArr);
    }

    public static EnumC33351Eok valueOf(String str) {
        return (EnumC33351Eok) Enum.valueOf(EnumC33351Eok.class, str);
    }

    public static EnumC33351Eok[] values() {
        return (EnumC33351Eok[]) A01.clone();
    }

    public EnumC33351Eok(String str, int i) {
    }
}
