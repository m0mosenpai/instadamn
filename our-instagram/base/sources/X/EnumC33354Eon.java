package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Eon, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33354Eon {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC33354Eon[] A01;
    public static final EnumC33354Eon A02;
    public static final EnumC33354Eon A03;
    public static final EnumC33354Eon A04;
    public static final EnumC33354Eon A05;

    static {
        EnumC33354Eon enumC33354Eon = new EnumC33354Eon("FOLLOWED", 0);
        A03 = enumC33354Eon;
        EnumC33354Eon enumC33354Eon2 = new EnumC33354Eon("REQUESTED", 1);
        A05 = enumC33354Eon2;
        EnumC33354Eon enumC33354Eon3 = new EnumC33354Eon("FAILED", 2);
        A02 = enumC33354Eon3;
        EnumC33354Eon enumC33354Eon4 = new EnumC33354Eon("PENDING", 3);
        A04 = enumC33354Eon4;
        EnumC33354Eon[] enumC33354EonArr = {enumC33354Eon, enumC33354Eon2, enumC33354Eon3, enumC33354Eon4};
        A01 = enumC33354EonArr;
        A00 = AbstractC12190kN.A00(enumC33354EonArr);
    }

    public static EnumC33354Eon valueOf(String str) {
        return (EnumC33354Eon) Enum.valueOf(EnumC33354Eon.class, str);
    }

    public static EnumC33354Eon[] values() {
        return (EnumC33354Eon[]) A01.clone();
    }

    public EnumC33354Eon(String str, int i) {
    }
}
