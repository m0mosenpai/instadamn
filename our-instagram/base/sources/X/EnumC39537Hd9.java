package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Hd9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC39537Hd9 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC39537Hd9[] A01;
    public static final EnumC39537Hd9 A02;
    public static final EnumC39537Hd9 A03;
    public static final EnumC39537Hd9 A04;

    static {
        EnumC39537Hd9 enumC39537Hd9 = new EnumC39537Hd9("LOCAL_PENDING", 0);
        A03 = enumC39537Hd9;
        EnumC39537Hd9 enumC39537Hd92 = new EnumC39537Hd9("NETWORK_PENDING", 1);
        A04 = enumC39537Hd92;
        EnumC39537Hd9 enumC39537Hd93 = new EnumC39537Hd9("COMMITTED", 2);
        A02 = enumC39537Hd93;
        EnumC39537Hd9[] enumC39537Hd9Arr = {enumC39537Hd9, enumC39537Hd92, enumC39537Hd93};
        A01 = enumC39537Hd9Arr;
        A00 = AbstractC12190kN.A00(enumC39537Hd9Arr);
    }

    public static EnumC39537Hd9 valueOf(String str) {
        return (EnumC39537Hd9) Enum.valueOf(EnumC39537Hd9.class, str);
    }

    public static EnumC39537Hd9[] values() {
        return (EnumC39537Hd9[]) A01.clone();
    }

    public EnumC39537Hd9(String str, int i) {
    }
}
