package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.9sF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC222749sF {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC222749sF[] A01;
    public static final EnumC222749sF A02;
    public static final EnumC222749sF A03;
    public static final EnumC222749sF A04;
    public static final EnumC222749sF A05;
    public static final EnumC222749sF A06;

    static {
        EnumC222749sF enumC222749sF = new EnumC222749sF("ON_DOM_LOADED", 0);
        A02 = enumC222749sF;
        EnumC222749sF enumC222749sF2 = new EnumC222749sF("ON_PAGE_INTERACTIVE", 1);
        A05 = enumC222749sF2;
        EnumC222749sF enumC222749sF3 = new EnumC222749sF("ON_PAGE_FINISHED", 2);
        A04 = enumC222749sF3;
        EnumC222749sF enumC222749sF4 = new EnumC222749sF("ON_PAUSE", 3);
        A06 = enumC222749sF4;
        EnumC222749sF enumC222749sF5 = new EnumC222749sF("ON_LARGEST_CONTENTFUL_PAINT", 4);
        A03 = enumC222749sF5;
        EnumC222749sF[] enumC222749sFArr = {enumC222749sF, enumC222749sF2, enumC222749sF3, enumC222749sF4, enumC222749sF5, new EnumC222749sF("ON_BROWSER_CLOSE", 5)};
        A01 = enumC222749sFArr;
        A00 = AbstractC12190kN.A00(enumC222749sFArr);
    }

    public static EnumC222749sF valueOf(String str) {
        return (EnumC222749sF) Enum.valueOf(EnumC222749sF.class, str);
    }

    public static EnumC222749sF[] values() {
        return (EnumC222749sF[]) A01.clone();
    }

    public EnumC222749sF(String str, int i) {
    }
}
