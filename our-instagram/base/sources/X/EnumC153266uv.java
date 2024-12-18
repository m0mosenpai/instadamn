package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.6uv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC153266uv {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC153266uv[] A02;
    public static final EnumC153266uv A03;
    public static final EnumC153266uv A04;
    public static final EnumC153266uv A05;
    public final int A00;

    static {
        EnumC153266uv enumC153266uv = new EnumC153266uv("DEFAULT", 0, 0);
        A03 = enumC153266uv;
        EnumC153266uv enumC153266uv2 = new EnumC153266uv("ON_MEDIA", 1, 1);
        A04 = enumC153266uv2;
        EnumC153266uv enumC153266uv3 = new EnumC153266uv("PROMO_TYPE", 2, 2);
        A05 = enumC153266uv3;
        EnumC153266uv[] enumC153266uvArr = {enumC153266uv, enumC153266uv2, enumC153266uv3};
        A02 = enumC153266uvArr;
        A01 = AbstractC12190kN.A00(enumC153266uvArr);
    }

    public static EnumC153266uv valueOf(String str) {
        return (EnumC153266uv) Enum.valueOf(EnumC153266uv.class, str);
    }

    public static EnumC153266uv[] values() {
        return (EnumC153266uv[]) A02.clone();
    }

    public EnumC153266uv(String str, int i, int i2) {
        this.A00 = i2;
    }
}
