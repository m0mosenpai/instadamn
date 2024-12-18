package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.9sP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC222849sP {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC222849sP[] A02;
    public static final EnumC222849sP A03;
    public static final EnumC222849sP A04;
    public final String A00;

    static {
        EnumC222849sP enumC222849sP = new EnumC222849sP("STORY", 0, "story");
        A04 = enumC222849sP;
        EnumC222849sP enumC222849sP2 = new EnumC222849sP("LIVE", 1, "live");
        A03 = enumC222849sP2;
        EnumC222849sP[] enumC222849sPArr = {enumC222849sP, enumC222849sP2};
        A02 = enumC222849sPArr;
        A01 = AbstractC12190kN.A00(enumC222849sPArr);
    }

    public static EnumC222849sP valueOf(String str) {
        return (EnumC222849sP) Enum.valueOf(EnumC222849sP.class, str);
    }

    public static EnumC222849sP[] values() {
        return (EnumC222849sP[]) A02.clone();
    }

    public EnumC222849sP(String str, int i, String str2) {
        this.A00 = str2;
    }
}
