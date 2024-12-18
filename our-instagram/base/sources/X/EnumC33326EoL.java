package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.EoL, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33326EoL {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC33326EoL[] A01;
    public static final EnumC33326EoL A02;
    public static final EnumC33326EoL A03;

    static {
        EnumC33326EoL enumC33326EoL = new EnumC33326EoL("LOGIN", 0);
        A03 = enumC33326EoL;
        EnumC33326EoL enumC33326EoL2 = new EnumC33326EoL("CONTACT", 1);
        A02 = enumC33326EoL2;
        EnumC33326EoL[] enumC33326EoLArr = {enumC33326EoL, enumC33326EoL2, new EnumC33326EoL("PAYMENT", 2)};
        A01 = enumC33326EoLArr;
        A00 = AbstractC12190kN.A00(enumC33326EoLArr);
    }

    public static EnumC33326EoL valueOf(String str) {
        return (EnumC33326EoL) Enum.valueOf(EnumC33326EoL.class, str);
    }

    public static EnumC33326EoL[] values() {
        return (EnumC33326EoL[]) A01.clone();
    }

    public EnumC33326EoL(String str, int i) {
    }
}
