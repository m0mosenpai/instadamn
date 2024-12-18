package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Ned, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53125Ned {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC53125Ned[] A01;
    public static final EnumC53125Ned A02;
    public static final EnumC53125Ned A03;

    static {
        EnumC53125Ned enumC53125Ned = new EnumC53125Ned("BASIC", 0);
        A02 = enumC53125Ned;
        EnumC53125Ned enumC53125Ned2 = new EnumC53125Ned("NORMAL", 1);
        A03 = enumC53125Ned2;
        EnumC53125Ned[] enumC53125NedArr = {enumC53125Ned, enumC53125Ned2};
        A01 = enumC53125NedArr;
        A00 = AbstractC12190kN.A00(enumC53125NedArr);
    }

    public static EnumC53125Ned valueOf(String str) {
        return (EnumC53125Ned) Enum.valueOf(EnumC53125Ned.class, str);
    }

    public static EnumC53125Ned[] values() {
        return (EnumC53125Ned[]) A01.clone();
    }

    public EnumC53125Ned(String str, int i) {
    }
}
