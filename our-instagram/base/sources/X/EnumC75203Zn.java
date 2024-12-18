package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.3Zn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC75203Zn {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC75203Zn[] A01;
    public static final EnumC75203Zn A02;
    public static final EnumC75203Zn A03;
    public static final EnumC75203Zn A04;
    public static final EnumC75203Zn A05;
    public static final EnumC75203Zn A06;

    static {
        EnumC75203Zn enumC75203Zn = new EnumC75203Zn("HIDDEN", 0);
        A04 = enumC75203Zn;
        EnumC75203Zn enumC75203Zn2 = new EnumC75203Zn("ANIMATING", 1);
        A02 = enumC75203Zn2;
        EnumC75203Zn enumC75203Zn3 = new EnumC75203Zn("ONSCREEN", 2);
        A06 = enumC75203Zn3;
        EnumC75203Zn enumC75203Zn4 = new EnumC75203Zn("OFFSCREEN", 3);
        A05 = enumC75203Zn4;
        EnumC75203Zn enumC75203Zn5 = new EnumC75203Zn("DISMISSED", 4);
        A03 = enumC75203Zn5;
        EnumC75203Zn[] enumC75203ZnArr = {enumC75203Zn, enumC75203Zn2, enumC75203Zn3, enumC75203Zn4, enumC75203Zn5};
        A01 = enumC75203ZnArr;
        A00 = AbstractC12190kN.A00(enumC75203ZnArr);
    }

    public static EnumC75203Zn valueOf(String str) {
        return (EnumC75203Zn) Enum.valueOf(EnumC75203Zn.class, str);
    }

    public static EnumC75203Zn[] values() {
        return (EnumC75203Zn[]) A01.clone();
    }

    public final boolean A00() {
        if (this != A04 && this != A03) {
            return false;
        }
        return true;
    }

    public EnumC75203Zn(String str, int i) {
    }
}
