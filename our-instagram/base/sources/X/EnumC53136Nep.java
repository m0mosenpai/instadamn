package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Nep, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53136Nep {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC53136Nep[] A01;
    public static final EnumC53136Nep A02;
    public static final EnumC53136Nep A03;
    public static final EnumC53136Nep A04;

    static {
        EnumC53136Nep enumC53136Nep = new EnumC53136Nep("SMALL", 0);
        A04 = enumC53136Nep;
        EnumC53136Nep enumC53136Nep2 = new EnumC53136Nep("MEDIUM", 1);
        A03 = enumC53136Nep2;
        EnumC53136Nep enumC53136Nep3 = new EnumC53136Nep("LARGE", 2);
        A02 = enumC53136Nep3;
        EnumC53136Nep[] enumC53136NepArr = {enumC53136Nep, enumC53136Nep2, enumC53136Nep3};
        A01 = enumC53136NepArr;
        A00 = AbstractC12190kN.A00(enumC53136NepArr);
    }

    public static EnumC53136Nep valueOf(String str) {
        return (EnumC53136Nep) Enum.valueOf(EnumC53136Nep.class, str);
    }

    public static EnumC53136Nep[] values() {
        return (EnumC53136Nep[]) A01.clone();
    }

    public EnumC53136Nep(String str, int i) {
    }
}
