package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.70s, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC1564770s {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC1564770s[] A01;
    public static final EnumC1564770s A02;
    public static final EnumC1564770s A03;
    public static final EnumC1564770s A04;
    public static final EnumC1564770s A05;

    static {
        EnumC1564770s enumC1564770s = new EnumC1564770s("NOT_TRIGGERED", 0);
        A03 = enumC1564770s;
        EnumC1564770s enumC1564770s2 = new EnumC1564770s("TRIGGERED", 1);
        A05 = enumC1564770s2;
        EnumC1564770s enumC1564770s3 = new EnumC1564770s("SHOWING", 2);
        A04 = enumC1564770s3;
        EnumC1564770s enumC1564770s4 = new EnumC1564770s("DISMISSED", 3);
        A02 = enumC1564770s4;
        EnumC1564770s[] enumC1564770sArr = {enumC1564770s, enumC1564770s2, enumC1564770s3, enumC1564770s4};
        A01 = enumC1564770sArr;
        A00 = AbstractC12190kN.A00(enumC1564770sArr);
    }

    public static EnumC1564770s valueOf(String str) {
        return (EnumC1564770s) Enum.valueOf(EnumC1564770s.class, str);
    }

    public static EnumC1564770s[] values() {
        return (EnumC1564770s[]) A01.clone();
    }

    public EnumC1564770s(String str, int i) {
    }
}
