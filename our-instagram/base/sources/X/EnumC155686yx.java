package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.6yx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC155686yx {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC155686yx[] A01;
    public static final EnumC155686yx A02;
    public static final EnumC155686yx A03;
    public static final EnumC155686yx A04;

    static {
        EnumC155686yx enumC155686yx = new EnumC155686yx("Original", 0);
        A03 = enumC155686yx;
        EnumC155686yx enumC155686yx2 = new EnumC155686yx("Translated", 1);
        A04 = enumC155686yx2;
        EnumC155686yx enumC155686yx3 = new EnumC155686yx("Loading", 2);
        A02 = enumC155686yx3;
        EnumC155686yx[] enumC155686yxArr = {enumC155686yx, enumC155686yx2, enumC155686yx3};
        A01 = enumC155686yxArr;
        A00 = AbstractC12190kN.A00(enumC155686yxArr);
    }

    public static EnumC155686yx valueOf(String str) {
        return (EnumC155686yx) Enum.valueOf(EnumC155686yx.class, str);
    }

    public static EnumC155686yx[] values() {
        return (EnumC155686yx[]) A01.clone();
    }

    public EnumC155686yx(String str, int i) {
    }
}
