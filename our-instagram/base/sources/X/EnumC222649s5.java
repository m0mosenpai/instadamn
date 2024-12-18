package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.9s5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC222649s5 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC222649s5[] A01;
    public static final EnumC222649s5 A02;
    public static final EnumC222649s5 A03;

    static {
        EnumC222649s5 enumC222649s5 = new EnumC222649s5("CAPTION", 0);
        A02 = enumC222649s5;
        EnumC222649s5 enumC222649s52 = new EnumC222649s5("COMMENT", 1);
        A03 = enumC222649s52;
        EnumC222649s5[] enumC222649s5Arr = {enumC222649s5, enumC222649s52};
        A01 = enumC222649s5Arr;
        A00 = AbstractC12190kN.A00(enumC222649s5Arr);
    }

    public static EnumC222649s5 valueOf(String str) {
        return (EnumC222649s5) Enum.valueOf(EnumC222649s5.class, str);
    }

    public static EnumC222649s5[] values() {
        return (EnumC222649s5[]) A01.clone();
    }

    public EnumC222649s5(String str, int i) {
    }
}
