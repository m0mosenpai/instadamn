package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.7Sm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC163277Sm {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC163277Sm[] A01;
    public static final EnumC163277Sm A02;
    public static final EnumC163277Sm A03;
    public static final EnumC163277Sm A04;

    static {
        EnumC163277Sm enumC163277Sm = new EnumC163277Sm("REACTIONS", 0);
        A04 = enumC163277Sm;
        EnumC163277Sm enumC163277Sm2 = new EnumC163277Sm("MULTIPLE_REACTIONS", 1);
        A03 = enumC163277Sm2;
        EnumC163277Sm enumC163277Sm3 = new EnumC163277Sm("COMMENTS", 2);
        A02 = enumC163277Sm3;
        EnumC163277Sm[] enumC163277SmArr = {enumC163277Sm, enumC163277Sm2, enumC163277Sm3};
        A01 = enumC163277SmArr;
        A00 = AbstractC12190kN.A00(enumC163277SmArr);
    }

    public static EnumC163277Sm valueOf(String str) {
        return (EnumC163277Sm) Enum.valueOf(EnumC163277Sm.class, str);
    }

    public static EnumC163277Sm[] values() {
        return (EnumC163277Sm[]) A01.clone();
    }

    public EnumC163277Sm(String str, int i) {
    }
}
