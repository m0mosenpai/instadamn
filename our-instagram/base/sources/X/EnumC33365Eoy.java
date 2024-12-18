package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Eoy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33365Eoy {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC33365Eoy[] A01;
    public static final EnumC33365Eoy A02;
    public static final EnumC33365Eoy A03;
    public static final EnumC33365Eoy A04;
    public static final EnumC33365Eoy A05;
    public static final EnumC33365Eoy A06;
    public static final EnumC33365Eoy A07;
    public static final EnumC33365Eoy A08;

    static {
        EnumC33365Eoy enumC33365Eoy = new EnumC33365Eoy("ARGUMENT_DEFAULT_FLOW", 0);
        A03 = enumC33365Eoy;
        EnumC33365Eoy enumC33365Eoy2 = new EnumC33365Eoy("ARGUMENT_SMS_RESET_FLOW", 1);
        A06 = enumC33365Eoy2;
        EnumC33365Eoy enumC33365Eoy3 = new EnumC33365Eoy("ARGUMENT_EDIT_PROFILE_FLOW", 2);
        A04 = enumC33365Eoy3;
        EnumC33365Eoy enumC33365Eoy4 = new EnumC33365Eoy("ARGUMENT_TWOFAC_FLOW", 3);
        A07 = enumC33365Eoy4;
        EnumC33365Eoy enumC33365Eoy5 = new EnumC33365Eoy("ARGUMENT_LOGIN_IS_VETTED_SUPPORT_FLOW", 4);
        A05 = enumC33365Eoy5;
        EnumC33365Eoy enumC33365Eoy6 = new EnumC33365Eoy("ARGUMENT_TWO_FAC_LOGIN_SUPPORT_FLOW", 5);
        A08 = enumC33365Eoy6;
        EnumC33365Eoy enumC33365Eoy7 = new EnumC33365Eoy("ARGUMENT_ADD_PHONE_NUMBER_FLOW", 6);
        A02 = enumC33365Eoy7;
        EnumC33365Eoy[] enumC33365EoyArr = {enumC33365Eoy, enumC33365Eoy2, enumC33365Eoy3, enumC33365Eoy4, enumC33365Eoy5, enumC33365Eoy6, enumC33365Eoy7};
        A01 = enumC33365EoyArr;
        A00 = AbstractC12190kN.A00(enumC33365EoyArr);
    }

    public static EnumC33365Eoy valueOf(String str) {
        return (EnumC33365Eoy) Enum.valueOf(EnumC33365Eoy.class, str);
    }

    public static EnumC33365Eoy[] values() {
        return (EnumC33365Eoy[]) A01.clone();
    }

    public EnumC33365Eoy(String str, int i) {
    }
}
