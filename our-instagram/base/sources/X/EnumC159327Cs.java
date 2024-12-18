package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.7Cs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC159327Cs {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC159327Cs[] A01;
    public static final EnumC159327Cs A02;
    public static final EnumC159327Cs A03;
    public static final EnumC159327Cs A04;

    static {
        EnumC159327Cs enumC159327Cs = new EnumC159327Cs("SHOW_MESSAGE_COMPOSER", 0);
        A04 = enumC159327Cs;
        EnumC159327Cs enumC159327Cs2 = new EnumC159327Cs("ON_USER_TYPING", 1);
        A03 = enumC159327Cs2;
        EnumC159327Cs enumC159327Cs3 = new EnumC159327Cs("ON_SHORT_CUT_COMPOSER_BUTTON_CHANGED", 2);
        A02 = enumC159327Cs3;
        EnumC159327Cs[] enumC159327CsArr = {enumC159327Cs, enumC159327Cs2, enumC159327Cs3};
        A01 = enumC159327CsArr;
        A00 = AbstractC12190kN.A00(enumC159327CsArr);
    }

    public static EnumC159327Cs valueOf(String str) {
        return (EnumC159327Cs) Enum.valueOf(EnumC159327Cs.class, str);
    }

    public static EnumC159327Cs[] values() {
        return (EnumC159327Cs[]) A01.clone();
    }

    public EnumC159327Cs(String str, int i) {
    }
}
