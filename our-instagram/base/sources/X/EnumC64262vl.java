package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.2vl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC64262vl {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC64262vl[] A02;
    public static final EnumC64262vl A03;
    public static final EnumC64262vl A04;
    public static final EnumC64262vl A05;
    public static final EnumC64262vl A06;
    public final String A00;

    static {
        EnumC64262vl enumC64262vl = new EnumC64262vl("UNKNOWN", 0, "unknown");
        A06 = enumC64262vl;
        EnumC64262vl enumC64262vl2 = new EnumC64262vl("ORGANIC", 1, "organic");
        A04 = enumC64262vl2;
        EnumC64262vl enumC64262vl3 = new EnumC64262vl("SPONSORED", 2, "sponsored");
        A05 = enumC64262vl3;
        EnumC64262vl enumC64262vl4 = new EnumC64262vl("NETEGO", 3, "netego");
        A03 = enumC64262vl4;
        EnumC64262vl[] enumC64262vlArr = {enumC64262vl, enumC64262vl2, enumC64262vl3, enumC64262vl4};
        A02 = enumC64262vlArr;
        A01 = AbstractC12190kN.A00(enumC64262vlArr);
    }

    public static EnumC64262vl valueOf(String str) {
        return (EnumC64262vl) Enum.valueOf(EnumC64262vl.class, str);
    }

    public static EnumC64262vl[] values() {
        return (EnumC64262vl[]) A02.clone();
    }

    public EnumC64262vl(String str, int i, String str2) {
        this.A00 = str2;
    }
}
