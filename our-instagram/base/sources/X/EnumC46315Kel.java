package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Kel, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46315Kel implements InterfaceC50411MNn {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC46315Kel[] A02;
    public static final EnumC46315Kel A03;
    public static final EnumC46315Kel A04;
    public static final EnumC46315Kel A05;
    public static final EnumC46315Kel A06;
    public static final EnumC46315Kel A07;
    public static final EnumC46315Kel A08;
    public final int A00;

    public static EnumC46315Kel valueOf(String str) {
        return (EnumC46315Kel) Enum.valueOf(EnumC46315Kel.class, str);
    }

    public static EnumC46315Kel[] values() {
        return (EnumC46315Kel[]) A02.clone();
    }

    static {
        EnumC46315Kel enumC46315Kel = new EnumC46315Kel("IGNORE_CASE", 0, 2);
        A05 = enumC46315Kel;
        EnumC46315Kel enumC46315Kel2 = new EnumC46315Kel("MULTILINE", 1, 8);
        A07 = enumC46315Kel2;
        EnumC46315Kel enumC46315Kel3 = new EnumC46315Kel("LITERAL", 2, 16);
        A06 = enumC46315Kel3;
        EnumC46315Kel enumC46315Kel4 = new EnumC46315Kel("UNIX_LINES", 3, 1);
        A08 = enumC46315Kel4;
        EnumC46315Kel enumC46315Kel5 = new EnumC46315Kel("COMMENTS", 4, 4);
        A03 = enumC46315Kel5;
        EnumC46315Kel enumC46315Kel6 = new EnumC46315Kel("DOT_MATCHES_ALL", 5, 32);
        A04 = enumC46315Kel6;
        EnumC46315Kel[] enumC46315KelArr = {enumC46315Kel, enumC46315Kel2, enumC46315Kel3, enumC46315Kel4, enumC46315Kel5, enumC46315Kel6, new EnumC46315Kel("CANON_EQ", 6, 128)};
        A02 = enumC46315KelArr;
        A01 = AbstractC12190kN.A00(enumC46315KelArr);
    }

    public EnumC46315Kel(String str, int i, int i2) {
        this.A00 = i2;
    }
}
