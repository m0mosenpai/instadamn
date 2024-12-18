package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Nf7, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53152Nf7 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC53152Nf7[] A01;
    public static final EnumC53152Nf7 A02;
    public static final EnumC53152Nf7 A03;
    public static final EnumC53152Nf7 A04;
    public static final EnumC53152Nf7 A05;

    static {
        EnumC53152Nf7 enumC53152Nf7 = new EnumC53152Nf7("ACTIVITY_IN_HOME_HEADER", 0);
        A02 = enumC53152Nf7;
        EnumC53152Nf7 enumC53152Nf72 = new EnumC53152Nf7("ACTIVITY_IN_PROFILE", 1);
        A03 = enumC53152Nf72;
        EnumC53152Nf7 enumC53152Nf73 = new EnumC53152Nf7("SEARCH_IN_HOME_HEADER", 2);
        A05 = enumC53152Nf73;
        EnumC53152Nf7 enumC53152Nf74 = new EnumC53152Nf7("CREATION_IN_HOME_HEADER", 3);
        A04 = enumC53152Nf74;
        EnumC53152Nf7[] enumC53152Nf7Arr = {enumC53152Nf7, enumC53152Nf72, enumC53152Nf73, enumC53152Nf74};
        A01 = enumC53152Nf7Arr;
        A00 = AbstractC12190kN.A00(enumC53152Nf7Arr);
    }

    public static EnumC53152Nf7 valueOf(String str) {
        return (EnumC53152Nf7) Enum.valueOf(EnumC53152Nf7.class, str);
    }

    public static EnumC53152Nf7[] values() {
        return (EnumC53152Nf7[]) A01.clone();
    }

    public EnumC53152Nf7(String str, int i) {
    }
}
