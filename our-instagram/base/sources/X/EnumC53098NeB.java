package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.NeB, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class EnumC53098NeB {
    public static final EnumC53098NeB[] A00;
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC53098NeB[] A02;
    public static final EnumC53098NeB A03;
    public static final EnumC53098NeB A04;

    public static EnumC53098NeB[] values() {
        return (EnumC53098NeB[]) A02.clone();
    }

    static {
        EnumC53098NeB enumC53098NeB = new EnumC53098NeB() { // from class: X.NIg
        };
        A03 = enumC53098NeB;
        C52437NIh c52437NIh = new C52437NIh();
        A04 = c52437NIh;
        EnumC53098NeB[] enumC53098NeBArr = {enumC53098NeB, c52437NIh};
        A02 = enumC53098NeBArr;
        A01 = AbstractC12190kN.A00(enumC53098NeBArr);
        A00 = values();
    }

    public EnumC53098NeB(String str, int i) {
    }
}
