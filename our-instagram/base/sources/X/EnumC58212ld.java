package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.2ld, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC58212ld {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC58212ld[] A01;
    public static final EnumC58212ld A02;
    public static final EnumC58212ld A03;
    public static final EnumC58212ld A04;

    static {
        EnumC58212ld enumC58212ld = new EnumC58212ld("IDLE", 0);
        A03 = enumC58212ld;
        EnumC58212ld enumC58212ld2 = new EnumC58212ld("VISIBLE", 1);
        A04 = enumC58212ld2;
        EnumC58212ld enumC58212ld3 = new EnumC58212ld("HIDDEN", 2);
        A02 = enumC58212ld3;
        EnumC58212ld[] enumC58212ldArr = {enumC58212ld, enumC58212ld2, enumC58212ld3};
        A01 = enumC58212ldArr;
        A00 = AbstractC12190kN.A00(enumC58212ldArr);
    }

    public static EnumC58212ld valueOf(String str) {
        return (EnumC58212ld) Enum.valueOf(EnumC58212ld.class, str);
    }

    public static EnumC58212ld[] values() {
        return (EnumC58212ld[]) A01.clone();
    }

    public EnumC58212ld(String str, int i) {
    }
}
