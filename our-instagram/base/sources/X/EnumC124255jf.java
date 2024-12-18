package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.5jf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC124255jf {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC124255jf[] A02;
    public static final EnumC124255jf A03;
    public static final EnumC124255jf A04;
    public final String A00;

    static {
        EnumC124255jf enumC124255jf = new EnumC124255jf("FLASH_CACHE", 0, "FlashCache");
        A03 = enumC124255jf;
        EnumC124255jf enumC124255jf2 = new EnumC124255jf("PREFETCH_CACHE", 1, "PrefetchCache");
        A04 = enumC124255jf2;
        EnumC124255jf[] enumC124255jfArr = {enumC124255jf, enumC124255jf2};
        A02 = enumC124255jfArr;
        A01 = AbstractC12190kN.A00(enumC124255jfArr);
    }

    public static EnumC124255jf valueOf(String str) {
        return (EnumC124255jf) Enum.valueOf(EnumC124255jf.class, str);
    }

    public static EnumC124255jf[] values() {
        return (EnumC124255jf[]) A02.clone();
    }

    public EnumC124255jf(String str, int i, String str2) {
        this.A00 = str2;
    }
}
