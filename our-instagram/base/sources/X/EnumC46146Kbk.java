package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Kbk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46146Kbk {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC46146Kbk[] A01;
    public static final EnumC46146Kbk A02;
    public static final EnumC46146Kbk A03;
    public static final EnumC46146Kbk A04;

    static {
        EnumC46146Kbk enumC46146Kbk = new EnumC46146Kbk("Dismissed", 0);
        A03 = enumC46146Kbk;
        EnumC46146Kbk enumC46146Kbk2 = new EnumC46146Kbk("Replaced", 1);
        A04 = enumC46146Kbk2;
        EnumC46146Kbk enumC46146Kbk3 = new EnumC46146Kbk("ActionClick", 2);
        A02 = enumC46146Kbk3;
        EnumC46146Kbk[] enumC46146KbkArr = {enumC46146Kbk, enumC46146Kbk2, enumC46146Kbk3};
        A01 = enumC46146KbkArr;
        A00 = AbstractC12190kN.A00(enumC46146KbkArr);
    }

    public static EnumC46146Kbk valueOf(String str) {
        return (EnumC46146Kbk) Enum.valueOf(EnumC46146Kbk.class, str);
    }

    public static EnumC46146Kbk[] values() {
        return (EnumC46146Kbk[]) A01.clone();
    }

    public EnumC46146Kbk(String str, int i) {
    }
}
