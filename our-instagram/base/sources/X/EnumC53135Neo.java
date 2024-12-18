package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Neo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53135Neo {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC53135Neo[] A01;
    public static final EnumC53135Neo A02;
    public static final EnumC53135Neo A03;
    public static final EnumC53135Neo A04;

    static {
        EnumC53135Neo enumC53135Neo = new EnumC53135Neo("SUCCESS", 0);
        A04 = enumC53135Neo;
        EnumC53135Neo enumC53135Neo2 = new EnumC53135Neo("INITIAL_LOAD", 1);
        A02 = enumC53135Neo2;
        EnumC53135Neo enumC53135Neo3 = new EnumC53135Neo("INITIAL_LOAD_FAILED", 2);
        A03 = enumC53135Neo3;
        EnumC53135Neo[] enumC53135NeoArr = {enumC53135Neo, enumC53135Neo2, enumC53135Neo3};
        A01 = enumC53135NeoArr;
        A00 = AbstractC12190kN.A00(enumC53135NeoArr);
    }

    public static EnumC53135Neo valueOf(String str) {
        return (EnumC53135Neo) Enum.valueOf(EnumC53135Neo.class, str);
    }

    public static EnumC53135Neo[] values() {
        return (EnumC53135Neo[]) A01.clone();
    }

    public EnumC53135Neo(String str, int i) {
    }
}
