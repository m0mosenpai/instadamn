package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.9sC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC222719sC {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC222719sC[] A01;
    public static final EnumC222719sC A02;
    public static final EnumC222719sC A03;
    public static final EnumC222719sC A04;

    static {
        EnumC222719sC enumC222719sC = new EnumC222719sC("ADD", 0);
        A02 = enumC222719sC;
        EnumC222719sC enumC222719sC2 = new EnumC222719sC("REMOVE", 1);
        A04 = enumC222719sC2;
        EnumC222719sC enumC222719sC3 = new EnumC222719sC("ADD_REMOVE", 2);
        A03 = enumC222719sC3;
        EnumC222719sC[] enumC222719sCArr = {enumC222719sC, enumC222719sC2, enumC222719sC3};
        A01 = enumC222719sCArr;
        A00 = AbstractC12190kN.A00(enumC222719sCArr);
    }

    public static EnumC222719sC valueOf(String str) {
        return (EnumC222719sC) Enum.valueOf(EnumC222719sC.class, str);
    }

    public static EnumC222719sC[] values() {
        return (EnumC222719sC[]) A01.clone();
    }

    public EnumC222719sC(String str, int i) {
    }
}
