package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.7bi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC166147bi {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC166147bi[] A02;
    public static final EnumC166147bi A03;
    public static final EnumC166147bi A04;
    public static final EnumC166147bi A05;
    public final String A00;

    static {
        EnumC166147bi enumC166147bi = new EnumC166147bi("BOTTOM", 0, "bottom");
        A03 = enumC166147bi;
        EnumC166147bi enumC166147bi2 = new EnumC166147bi("TOP", 1, "top");
        A05 = enumC166147bi2;
        EnumC166147bi enumC166147bi3 = new EnumC166147bi("NOT_SET", 2, "undefined");
        A04 = enumC166147bi3;
        EnumC166147bi[] enumC166147biArr = {enumC166147bi, enumC166147bi2, enumC166147bi3};
        A02 = enumC166147biArr;
        A01 = AbstractC12190kN.A00(enumC166147biArr);
    }

    public static EnumC166147bi valueOf(String str) {
        return (EnumC166147bi) Enum.valueOf(EnumC166147bi.class, str);
    }

    public static EnumC166147bi[] values() {
        return (EnumC166147bi[]) A02.clone();
    }

    public EnumC166147bi(String str, int i, String str2) {
        this.A00 = str2;
    }
}
