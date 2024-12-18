package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.GlF, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC37860GlF {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC37860GlF[] A01;
    public static final EnumC37860GlF A02;
    public static final EnumC37860GlF A03;
    public static final EnumC37860GlF A04;
    public static final EnumC37860GlF A05;
    public static final EnumC37860GlF A06;
    public static final EnumC37860GlF A07;
    public static final EnumC37860GlF A08;
    public static final EnumC37860GlF A09;

    static {
        EnumC37860GlF enumC37860GlF = new EnumC37860GlF("COUNTDOWN_CANCELLED", 0);
        A02 = enumC37860GlF;
        EnumC37860GlF enumC37860GlF2 = new EnumC37860GlF("ITEM_INTERACTION", 1);
        A03 = enumC37860GlF2;
        EnumC37860GlF enumC37860GlF3 = new EnumC37860GlF("ITEM_INTERACTION_NEW_PAGE", 2);
        A04 = enumC37860GlF3;
        EnumC37860GlF enumC37860GlF4 = new EnumC37860GlF("ITEM_INTERACTION_WITH_NEW_SURFACE", 3);
        A05 = enumC37860GlF4;
        EnumC37860GlF enumC37860GlF5 = new EnumC37860GlF("SCROLL_DOWN", 4);
        A07 = enumC37860GlF5;
        EnumC37860GlF enumC37860GlF6 = new EnumC37860GlF("SCROLL_UP", 5);
        A08 = enumC37860GlF6;
        EnumC37860GlF enumC37860GlF7 = new EnumC37860GlF("SCROLLBACK", 6);
        A06 = enumC37860GlF7;
        EnumC37860GlF enumC37860GlF8 = new EnumC37860GlF("SCRUBBER_INTERACTION", 7);
        A09 = enumC37860GlF8;
        EnumC37860GlF[] enumC37860GlFArr = {enumC37860GlF, enumC37860GlF2, enumC37860GlF3, enumC37860GlF4, enumC37860GlF5, enumC37860GlF6, enumC37860GlF7, enumC37860GlF8};
        A01 = enumC37860GlFArr;
        A00 = AbstractC12190kN.A00(enumC37860GlFArr);
    }

    public static EnumC37860GlF valueOf(String str) {
        return (EnumC37860GlF) Enum.valueOf(EnumC37860GlF.class, str);
    }

    public static EnumC37860GlF[] values() {
        return (EnumC37860GlF[]) A01.clone();
    }

    public EnumC37860GlF(String str, int i) {
    }
}
