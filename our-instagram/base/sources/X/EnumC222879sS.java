package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.9sS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC222879sS {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC222879sS[] A02;
    public static final EnumC222879sS A03;
    public static final EnumC222879sS A04;
    public static final EnumC222879sS A05;
    public static final EnumC222879sS A06;
    public final char A00;

    static {
        EnumC222879sS enumC222879sS = new EnumC222879sS("ROTATE", 'r', 0);
        A05 = enumC222879sS;
        EnumC222879sS enumC222879sS2 = new EnumC222879sS("ROTATE_BY", 'b', 1);
        A06 = enumC222879sS2;
        EnumC222879sS enumC222879sS3 = new EnumC222879sS("CROP", 'c', 2);
        A04 = enumC222879sS3;
        EnumC222879sS enumC222879sS4 = new EnumC222879sS("ALIGN", 'a', 3);
        A03 = enumC222879sS4;
        EnumC222879sS[] enumC222879sSArr = {enumC222879sS, enumC222879sS2, enumC222879sS3, enumC222879sS4, new EnumC222879sS("FILL", 'f', 4)};
        A02 = enumC222879sSArr;
        A01 = AbstractC12190kN.A00(enumC222879sSArr);
    }

    public static EnumC222879sS valueOf(String str) {
        return (EnumC222879sS) Enum.valueOf(EnumC222879sS.class, str);
    }

    public static EnumC222879sS[] values() {
        return (EnumC222879sS[]) A02.clone();
    }

    public EnumC222879sS(String str, char c, int i) {
        this.A00 = c;
    }
}
