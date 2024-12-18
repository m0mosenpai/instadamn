package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.C6v, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC27392C6v {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC27392C6v[] A01;
    public static final EnumC27392C6v A02;
    public static final EnumC27392C6v A03;
    public static final EnumC27392C6v A04;
    public static final EnumC27392C6v A05;
    public static final EnumC27392C6v A06;

    static {
        EnumC27392C6v enumC27392C6v = new EnumC27392C6v("Paragraph", 0);
        A02 = enumC27392C6v;
        EnumC27392C6v enumC27392C6v2 = new EnumC27392C6v("Span", 1);
        A03 = enumC27392C6v2;
        EnumC27392C6v enumC27392C6v3 = new EnumC27392C6v("VerbatimTts", 2);
        A06 = enumC27392C6v3;
        EnumC27392C6v enumC27392C6v4 = new EnumC27392C6v("Url", 3);
        A05 = enumC27392C6v4;
        EnumC27392C6v enumC27392C6v5 = new EnumC27392C6v("String", 4);
        A04 = enumC27392C6v5;
        EnumC27392C6v[] enumC27392C6vArr = {enumC27392C6v, enumC27392C6v2, enumC27392C6v3, enumC27392C6v4, enumC27392C6v5};
        A01 = enumC27392C6vArr;
        A00 = AbstractC12190kN.A00(enumC27392C6vArr);
    }

    public static EnumC27392C6v valueOf(String str) {
        return (EnumC27392C6v) Enum.valueOf(EnumC27392C6v.class, str);
    }

    public static EnumC27392C6v[] values() {
        return (EnumC27392C6v[]) A01.clone();
    }

    public EnumC27392C6v(String str, int i) {
    }
}
