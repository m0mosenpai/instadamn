package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.NfG, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53161NfG {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC53161NfG[] A01;
    public static final EnumC53161NfG A02;
    public static final EnumC53161NfG A03;
    public static final EnumC53161NfG A04;
    public static final EnumC53161NfG A05;
    public static final EnumC53161NfG A06;

    static {
        EnumC53161NfG enumC53161NfG = new EnumC53161NfG("CLIP", 0);
        A02 = enumC53161NfG;
        EnumC53161NfG enumC53161NfG2 = new EnumC53161NfG("STORY_SHARE", 1);
        A05 = enumC53161NfG2;
        EnumC53161NfG enumC53161NfG3 = new EnumC53161NfG("STORY_REPLY", 2);
        A04 = enumC53161NfG3;
        EnumC53161NfG enumC53161NfG4 = new EnumC53161NfG("TEXT", 3);
        A06 = enumC53161NfG4;
        EnumC53161NfG enumC53161NfG5 = new EnumC53161NfG("PHOTO", 4);
        A03 = enumC53161NfG5;
        EnumC53161NfG[] enumC53161NfGArr = {enumC53161NfG, enumC53161NfG2, enumC53161NfG3, enumC53161NfG4, enumC53161NfG5};
        A01 = enumC53161NfGArr;
        A00 = AbstractC12190kN.A00(enumC53161NfGArr);
    }

    public static EnumC53161NfG valueOf(String str) {
        return (EnumC53161NfG) Enum.valueOf(EnumC53161NfG.class, str);
    }

    public static EnumC53161NfG[] values() {
        return (EnumC53161NfG[]) A01.clone();
    }

    public EnumC53161NfG(String str, int i) {
    }
}
