package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.TtN, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class EnumC65748TtN {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC65748TtN[] A01;
    public static final EnumC65748TtN A02;
    public static final EnumC65748TtN A03;
    public static final EnumC65748TtN A04;
    public static final EnumC65748TtN A05;
    public static final EnumC65748TtN A06;

    public static EnumC65748TtN valueOf(String str) {
        return (EnumC65748TtN) Enum.valueOf(EnumC65748TtN.class, str);
    }

    public static EnumC65748TtN[] values() {
        return (EnumC65748TtN[]) A01.clone();
    }

    static {
        EnumC65748TtN enumC65748TtN = new EnumC65748TtN("PARENT", 0);
        A03 = enumC65748TtN;
        EnumC65748TtN enumC65748TtN2 = new EnumC65748TtN("VIDEO", 1);
        A06 = enumC65748TtN2;
        EnumC65748TtN enumC65748TtN3 = new EnumC65748TtN("TEXT", 2);
        A04 = enumC65748TtN3;
        EnumC65748TtN enumC65748TtN4 = new EnumC65748TtN("HEADER", 3);
        A02 = enumC65748TtN4;
        EnumC65748TtN enumC65748TtN5 = new EnumC65748TtN("TOOLBAR", 4);
        A05 = enumC65748TtN5;
        EnumC65748TtN[] enumC65748TtNArr = {enumC65748TtN, enumC65748TtN2, enumC65748TtN3, enumC65748TtN4, enumC65748TtN5};
        A01 = enumC65748TtNArr;
        A00 = AbstractC12190kN.A00(enumC65748TtNArr);
    }

    public EnumC65748TtN(String str, int i) {
    }
}
