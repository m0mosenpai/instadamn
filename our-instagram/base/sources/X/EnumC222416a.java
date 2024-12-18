package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.16a, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC222416a {
    public static final /* synthetic */ EnumEntries A03;
    public static final /* synthetic */ EnumC222416a[] A04;
    public static final EnumC222416a A05;
    public static final EnumC222416a A06;
    public static final EnumC222416a A07;
    public static final EnumC222416a A08;
    public final int A00;
    public final String A01;
    public final String A02;

    static {
        EnumC222416a enumC222416a = new EnumC222416a("UNKNOWN", "", "UNKNOWN", 0, 0);
        A08 = enumC222416a;
        EnumC222416a enumC222416a2 = new EnumC222416a("PERSONAL", "personal", "PERSONAL", 1, 1);
        A07 = enumC222416a2;
        EnumC222416a enumC222416a3 = new EnumC222416a("BUSINESS", "business", "BUSINESS", 2, 2);
        A05 = enumC222416a3;
        EnumC222416a enumC222416a4 = new EnumC222416a("MEDIA_CREATOR", "creator", "CREATOR", 3, 3);
        A06 = enumC222416a4;
        EnumC222416a[] enumC222416aArr = {enumC222416a, enumC222416a2, enumC222416a3, enumC222416a4};
        A04 = enumC222416aArr;
        A03 = AbstractC12190kN.A00(enumC222416aArr);
    }

    public static EnumC222416a valueOf(String str) {
        return (EnumC222416a) Enum.valueOf(EnumC222416a.class, str);
    }

    public static EnumC222416a[] values() {
        return (EnumC222416a[]) A04.clone();
    }

    public EnumC222416a(String str, String str2, String str3, int i, int i2) {
        this.A00 = i2;
        this.A01 = str2;
        this.A02 = str3;
    }
}
