package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.C6j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC27380C6j {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC27380C6j[] A01;
    public static final EnumC27380C6j A02;
    public static final EnumC27380C6j A03;
    public static final EnumC27380C6j A04;
    public static final EnumC27380C6j A05;

    static {
        EnumC27380C6j enumC27380C6j = new EnumC27380C6j("FACTS", 0);
        A03 = enumC27380C6j;
        EnumC27380C6j enumC27380C6j2 = new EnumC27380C6j("Q_AND_A", 1);
        A05 = enumC27380C6j2;
        EnumC27380C6j enumC27380C6j3 = new EnumC27380C6j("LINKS", 2);
        A04 = enumC27380C6j3;
        EnumC27380C6j enumC27380C6j4 = new EnumC27380C6j("CONSOLIDATED_FACTS", 3);
        A02 = enumC27380C6j4;
        EnumC27380C6j[] enumC27380C6jArr = {enumC27380C6j, enumC27380C6j2, enumC27380C6j3, enumC27380C6j4};
        A01 = enumC27380C6jArr;
        A00 = AbstractC12190kN.A00(enumC27380C6jArr);
    }

    public static EnumC27380C6j valueOf(String str) {
        return (EnumC27380C6j) Enum.valueOf(EnumC27380C6j.class, str);
    }

    public static EnumC27380C6j[] values() {
        return (EnumC27380C6j[]) A01.clone();
    }

    public EnumC27380C6j(String str, int i) {
    }
}
