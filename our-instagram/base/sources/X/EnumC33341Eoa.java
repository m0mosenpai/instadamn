package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Eoa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33341Eoa {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC33341Eoa[] A01;
    public static final EnumC33341Eoa A02;
    public static final EnumC33341Eoa A03;
    public static final EnumC33341Eoa A04;

    static {
        EnumC33341Eoa enumC33341Eoa = new EnumC33341Eoa("TAGGED", 0);
        A04 = enumC33341Eoa;
        EnumC33341Eoa enumC33341Eoa2 = new EnumC33341Eoa("PENDING", 1);
        A02 = enumC33341Eoa2;
        EnumC33341Eoa enumC33341Eoa3 = new EnumC33341Eoa("SPAM", 2);
        A03 = enumC33341Eoa3;
        EnumC33341Eoa[] enumC33341EoaArr = {enumC33341Eoa, enumC33341Eoa2, enumC33341Eoa3};
        A01 = enumC33341EoaArr;
        A00 = AbstractC12190kN.A00(enumC33341EoaArr);
    }

    public static EnumC33341Eoa valueOf(String str) {
        return (EnumC33341Eoa) Enum.valueOf(EnumC33341Eoa.class, str);
    }

    public static EnumC33341Eoa[] values() {
        return (EnumC33341Eoa[]) A01.clone();
    }

    public EnumC33341Eoa(String str, int i) {
    }
}
