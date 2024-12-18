package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Eom, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33353Eom {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC33353Eom[] A01;
    public static final EnumC33353Eom A02;
    public static final EnumC33353Eom A03;
    public static final EnumC33353Eom A04;
    public static final EnumC33353Eom A05;

    static {
        EnumC33353Eom enumC33353Eom = new EnumC33353Eom("SINGLE", 0);
        A05 = enumC33353Eom;
        EnumC33353Eom enumC33353Eom2 = new EnumC33353Eom("FAMILY", 1);
        A03 = enumC33353Eom2;
        EnumC33353Eom enumC33353Eom3 = new EnumC33353Eom("ALL", 2);
        A02 = enumC33353Eom3;
        EnumC33353Eom enumC33353Eom4 = new EnumC33353Eom("LINKED_ACCOUNTS", 3);
        A04 = enumC33353Eom4;
        EnumC33353Eom[] enumC33353EomArr = {enumC33353Eom, enumC33353Eom2, enumC33353Eom3, enumC33353Eom4};
        A01 = enumC33353EomArr;
        A00 = AbstractC12190kN.A00(enumC33353EomArr);
    }

    public static EnumC33353Eom valueOf(String str) {
        return (EnumC33353Eom) Enum.valueOf(EnumC33353Eom.class, str);
    }

    public static EnumC33353Eom[] values() {
        return (EnumC33353Eom[]) A01.clone();
    }

    public EnumC33353Eom(String str, int i) {
    }
}
