package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.C6r, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC27388C6r {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC27388C6r[] A01;
    public static final EnumC27388C6r A02;
    public static final EnumC27388C6r A03;
    public static final EnumC27388C6r A04;
    public static final EnumC27388C6r A05;

    static {
        EnumC27388C6r enumC27388C6r = new EnumC27388C6r("MENU", 0);
        A04 = enumC27388C6r;
        EnumC27388C6r enumC27388C6r2 = new EnumC27388C6r("HOW_IT_WORKS", 1);
        A02 = enumC27388C6r2;
        EnumC27388C6r enumC27388C6r3 = new EnumC27388C6r("MEMBER_LIST", 2);
        A03 = enumC27388C6r3;
        EnumC27388C6r enumC27388C6r4 = new EnumC27388C6r("REEL_SUGGESTED_FOR_USERS_LIST", 3);
        A05 = enumC27388C6r4;
        EnumC27388C6r[] enumC27388C6rArr = {enumC27388C6r, enumC27388C6r2, enumC27388C6r3, enumC27388C6r4};
        A01 = enumC27388C6rArr;
        A00 = AbstractC12190kN.A00(enumC27388C6rArr);
    }

    public static EnumC27388C6r valueOf(String str) {
        return (EnumC27388C6r) Enum.valueOf(EnumC27388C6r.class, str);
    }

    public static EnumC27388C6r[] values() {
        return (EnumC27388C6r[]) A01.clone();
    }

    public EnumC27388C6r(String str, int i) {
    }
}
