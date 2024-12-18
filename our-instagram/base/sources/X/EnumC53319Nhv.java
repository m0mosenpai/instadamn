package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Nhv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53319Nhv {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC53319Nhv[] A02;
    public static final EnumC53319Nhv A03;
    public static final EnumC53319Nhv A04;
    public static final EnumC53319Nhv A05;
    public static final EnumC53319Nhv A06;
    public static final EnumC53319Nhv A07;
    public static final EnumC53319Nhv A08;
    public static final EnumC53319Nhv A09;
    public final String A00;

    static {
        EnumC53319Nhv enumC53319Nhv = new EnumC53319Nhv("BARCELONA_SHARE", 0, "barcelona");
        A04 = enumC53319Nhv;
        EnumC53319Nhv enumC53319Nhv2 = new EnumC53319Nhv("PEOPLE", 1, "people");
        A07 = enumC53319Nhv2;
        EnumC53319Nhv enumC53319Nhv3 = new EnumC53319Nhv("PRODUCT", 2, "product");
        A08 = enumC53319Nhv3;
        EnumC53319Nhv enumC53319Nhv4 = new EnumC53319Nhv("FUNDRAISER", 3, "fundraiser");
        A06 = enumC53319Nhv4;
        EnumC53319Nhv enumC53319Nhv5 = new EnumC53319Nhv("SUGGESTED_PRODUCT", 4, "suggested_product");
        A09 = enumC53319Nhv5;
        EnumC53319Nhv enumC53319Nhv6 = new EnumC53319Nhv("AD", 5, "ad");
        A03 = enumC53319Nhv6;
        EnumC53319Nhv enumC53319Nhv7 = new EnumC53319Nhv("FB_USER_TAG", 6, "fb_user_tag");
        A05 = enumC53319Nhv7;
        EnumC53319Nhv[] enumC53319NhvArr = {enumC53319Nhv, enumC53319Nhv2, enumC53319Nhv3, enumC53319Nhv4, enumC53319Nhv5, enumC53319Nhv6, enumC53319Nhv7};
        A02 = enumC53319NhvArr;
        A01 = AbstractC12190kN.A00(enumC53319NhvArr);
    }

    public static EnumC53319Nhv valueOf(String str) {
        return (EnumC53319Nhv) Enum.valueOf(EnumC53319Nhv.class, str);
    }

    public static EnumC53319Nhv[] values() {
        return (EnumC53319Nhv[]) A02.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public EnumC53319Nhv(String str, int i, String str2) {
        this.A00 = str2;
    }
}
