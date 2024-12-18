package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.5y4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC132255y4 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC132255y4[] A01;
    public static final EnumC132255y4 A02;
    public static final EnumC132255y4 A03;
    public static final EnumC132255y4 A04;
    public static final EnumC132255y4 A05;

    static {
        EnumC132255y4 enumC132255y4 = new EnumC132255y4("None", 0);
        A05 = enumC132255y4;
        EnumC132255y4 enumC132255y42 = new EnumC132255y4("Collapsed", 1);
        A02 = enumC132255y42;
        EnumC132255y4 enumC132255y43 = new EnumC132255y4("Expanded", 2);
        A04 = enumC132255y43;
        EnumC132255y4 enumC132255y44 = new EnumC132255y4("ExpandDisabled", 3);
        A03 = enumC132255y44;
        EnumC132255y4[] enumC132255y4Arr = {enumC132255y4, enumC132255y42, enumC132255y43, enumC132255y44};
        A01 = enumC132255y4Arr;
        A00 = AbstractC12190kN.A00(enumC132255y4Arr);
    }

    public static EnumC132255y4 valueOf(String str) {
        return (EnumC132255y4) Enum.valueOf(EnumC132255y4.class, str);
    }

    public static EnumC132255y4[] values() {
        return (EnumC132255y4[]) A01.clone();
    }

    public EnumC132255y4(String str, int i) {
    }
}
