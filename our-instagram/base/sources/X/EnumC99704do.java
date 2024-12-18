package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.4do, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC99704do {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC99704do[] A01;
    public static final EnumC99704do A02;
    public static final EnumC99704do A03;
    public static final EnumC99704do A04;
    public static final EnumC99704do A05;
    public static final EnumC99704do A06;
    public static final EnumC99704do A07;
    public static final EnumC99704do A08;

    static {
        EnumC99704do enumC99704do = new EnumC99704do("PRIMARY", 0);
        A03 = enumC99704do;
        EnumC99704do enumC99704do2 = new EnumC99704do("SECONDARY", 1);
        A06 = enumC99704do2;
        EnumC99704do enumC99704do3 = new EnumC99704do("PRIMARY_LINK", 2);
        A04 = enumC99704do3;
        EnumC99704do enumC99704do4 = new EnumC99704do("SECONDARY_LINK", 3);
        A07 = enumC99704do4;
        EnumC99704do enumC99704do5 = new EnumC99704do("PRIMARY_ON_COLOR", 4);
        A05 = enumC99704do5;
        EnumC99704do enumC99704do6 = new EnumC99704do("LABEL_INVERTED_ON_MEDIA", 5);
        A02 = enumC99704do6;
        EnumC99704do enumC99704do7 = new EnumC99704do("UNKNOWN", 6);
        A08 = enumC99704do7;
        EnumC99704do[] enumC99704doArr = {enumC99704do, enumC99704do2, enumC99704do3, enumC99704do4, enumC99704do5, enumC99704do6, enumC99704do7};
        A01 = enumC99704doArr;
        A00 = AbstractC12190kN.A00(enumC99704doArr);
    }

    public static EnumC99704do valueOf(String str) {
        return (EnumC99704do) Enum.valueOf(EnumC99704do.class, str);
    }

    public static EnumC99704do[] values() {
        return (EnumC99704do[]) A01.clone();
    }

    public EnumC99704do(String str, int i) {
    }
}
