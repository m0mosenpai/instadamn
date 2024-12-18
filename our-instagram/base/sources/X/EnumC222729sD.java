package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.9sD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC222729sD {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC222729sD[] A01;
    public static final EnumC222729sD A02;
    public static final EnumC222729sD A03;
    public static final EnumC222729sD A04;
    public static final EnumC222729sD A05;

    static {
        EnumC222729sD enumC222729sD = new EnumC222729sD("AUTO_CREATED_REELS", 0);
        A02 = enumC222729sD;
        EnumC222729sD enumC222729sD2 = new EnumC222729sD("METADATA_ONLY", 1);
        A04 = enumC222729sD2;
        EnumC222729sD enumC222729sD3 = new EnumC222729sD("SMART_ALBUMS", 2);
        A05 = enumC222729sD3;
        EnumC222729sD enumC222729sD4 = new EnumC222729sD("MAGIC_MEDIA_REMIX", 3);
        A03 = enumC222729sD4;
        EnumC222729sD[] enumC222729sDArr = {enumC222729sD, enumC222729sD2, enumC222729sD3, enumC222729sD4};
        A01 = enumC222729sDArr;
        A00 = AbstractC12190kN.A00(enumC222729sDArr);
    }

    public static EnumC222729sD valueOf(String str) {
        return (EnumC222729sD) Enum.valueOf(EnumC222729sD.class, str);
    }

    public static EnumC222729sD[] values() {
        return (EnumC222729sD[]) A01.clone();
    }

    public EnumC222729sD(String str, int i) {
    }
}
