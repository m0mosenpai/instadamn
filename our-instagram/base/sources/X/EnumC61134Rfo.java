package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Rfo, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC61134Rfo {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC61134Rfo[] A01;
    public static final EnumC61134Rfo A02;
    public static final EnumC61134Rfo A03;
    public static final EnumC61134Rfo A04;
    public static final EnumC61134Rfo A05;
    public static final EnumC61134Rfo A06;

    public static EnumC61134Rfo valueOf(String str) {
        return (EnumC61134Rfo) Enum.valueOf(EnumC61134Rfo.class, str);
    }

    public static EnumC61134Rfo[] values() {
        return (EnumC61134Rfo[]) A01.clone();
    }

    static {
        EnumC61134Rfo enumC61134Rfo = new EnumC61134Rfo("UNKNOWN", 0);
        A05 = enumC61134Rfo;
        EnumC61134Rfo enumC61134Rfo2 = new EnumC61134Rfo("CONNECTED", 1);
        A02 = enumC61134Rfo2;
        EnumC61134Rfo enumC61134Rfo3 = new EnumC61134Rfo("FIRST_RETRY", 2);
        A03 = enumC61134Rfo3;
        EnumC61134Rfo enumC61134Rfo4 = new EnumC61134Rfo("SECOND_RETRY", 3);
        A04 = enumC61134Rfo4;
        EnumC61134Rfo enumC61134Rfo5 = new EnumC61134Rfo("UNSUCCESSFUL", 4);
        A06 = enumC61134Rfo5;
        EnumC61134Rfo[] enumC61134RfoArr = {enumC61134Rfo, enumC61134Rfo2, enumC61134Rfo3, enumC61134Rfo4, enumC61134Rfo5};
        A01 = enumC61134RfoArr;
        A00 = AbstractC12190kN.A00(enumC61134RfoArr);
    }

    public EnumC61134Rfo(String str, int i) {
    }
}
