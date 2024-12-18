package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Eou, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33361Eou {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC33361Eou[] A01;
    public static final EnumC33361Eou A02;
    public static final EnumC33361Eou A03;
    public static final EnumC33361Eou A04;
    public static final EnumC33361Eou A05;
    public static final EnumC33361Eou A06;

    static {
        EnumC33361Eou enumC33361Eou = new EnumC33361Eou("LOGIN", 0);
        A04 = enumC33361Eou;
        EnumC33361Eou enumC33361Eou2 = new EnumC33361Eou("REGISTRATION", 1);
        A05 = enumC33361Eou2;
        EnumC33361Eou enumC33361Eou3 = new EnumC33361Eou("CONFIRMATION", 2);
        A02 = enumC33361Eou3;
        EnumC33361Eou enumC33361Eou4 = new EnumC33361Eou("EXISTING_SESSION_LOGIN", 3);
        A03 = enumC33361Eou4;
        EnumC33361Eou enumC33361Eou5 = new EnumC33361Eou("RESURRECTION", 4);
        A06 = enumC33361Eou5;
        EnumC33361Eou[] enumC33361EouArr = {enumC33361Eou, enumC33361Eou2, enumC33361Eou3, enumC33361Eou4, enumC33361Eou5};
        A01 = enumC33361EouArr;
        A00 = AbstractC12190kN.A00(enumC33361EouArr);
    }

    public static EnumC33361Eou valueOf(String str) {
        return (EnumC33361Eou) Enum.valueOf(EnumC33361Eou.class, str);
    }

    public static EnumC33361Eou[] values() {
        return (EnumC33361Eou[]) A01.clone();
    }

    public EnumC33361Eou(String str, int i) {
    }
}
