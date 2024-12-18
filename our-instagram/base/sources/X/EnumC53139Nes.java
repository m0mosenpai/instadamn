package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Nes, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53139Nes {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC53139Nes[] A01;
    public static final EnumC53139Nes A02;
    public static final EnumC53139Nes A03;
    public static final EnumC53139Nes A04;

    static {
        EnumC53139Nes enumC53139Nes = new EnumC53139Nes("BROWSE", 0);
        A02 = enumC53139Nes;
        EnumC53139Nes enumC53139Nes2 = new EnumC53139Nes("SEARCH", 1);
        A04 = enumC53139Nes2;
        EnumC53139Nes enumC53139Nes3 = new EnumC53139Nes("SAVED", 2);
        A03 = enumC53139Nes3;
        EnumC53139Nes[] enumC53139NesArr = {enumC53139Nes, enumC53139Nes2, enumC53139Nes3};
        A01 = enumC53139NesArr;
        A00 = AbstractC12190kN.A00(enumC53139NesArr);
    }

    public static EnumC53139Nes valueOf(String str) {
        return (EnumC53139Nes) Enum.valueOf(EnumC53139Nes.class, str);
    }

    public static EnumC53139Nes[] values() {
        return (EnumC53139Nes[]) A01.clone();
    }

    public EnumC53139Nes(String str, int i) {
    }
}
