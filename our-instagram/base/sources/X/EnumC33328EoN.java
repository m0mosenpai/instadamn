package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.EoN, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33328EoN {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC33328EoN[] A01;
    public static final EnumC33328EoN A02;
    public static final EnumC33328EoN A03;

    static {
        EnumC33328EoN enumC33328EoN = new EnumC33328EoN("IDLE", 0);
        A02 = enumC33328EoN;
        EnumC33328EoN enumC33328EoN2 = new EnumC33328EoN("IN_PROGRESS", 1);
        A03 = enumC33328EoN2;
        EnumC33328EoN[] enumC33328EoNArr = {enumC33328EoN, enumC33328EoN2};
        A01 = enumC33328EoNArr;
        A00 = AbstractC12190kN.A00(enumC33328EoNArr);
    }

    public static EnumC33328EoN valueOf(String str) {
        return (EnumC33328EoN) Enum.valueOf(EnumC33328EoN.class, str);
    }

    public static EnumC33328EoN[] values() {
        return (EnumC33328EoN[]) A01.clone();
    }

    public EnumC33328EoN(String str, int i) {
    }
}
