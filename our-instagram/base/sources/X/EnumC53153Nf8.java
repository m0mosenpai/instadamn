package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Nf8, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53153Nf8 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC53153Nf8[] A01;
    public static final EnumC53153Nf8 A02;
    public static final EnumC53153Nf8 A03;
    public static final EnumC53153Nf8 A04;
    public static final EnumC53153Nf8 A05;

    static {
        EnumC53153Nf8 enumC53153Nf8 = new EnumC53153Nf8("UNSET", 0);
        A05 = enumC53153Nf8;
        EnumC53153Nf8 enumC53153Nf82 = new EnumC53153Nf8("PREPARING", 1);
        A04 = enumC53153Nf82;
        EnumC53153Nf8 enumC53153Nf83 = new EnumC53153Nf8("PLAYING", 2);
        A03 = enumC53153Nf83;
        EnumC53153Nf8 enumC53153Nf84 = new EnumC53153Nf8("PAUSED", 3);
        A02 = enumC53153Nf84;
        EnumC53153Nf8[] enumC53153Nf8Arr = {enumC53153Nf8, enumC53153Nf82, enumC53153Nf83, enumC53153Nf84};
        A01 = enumC53153Nf8Arr;
        A00 = AbstractC12190kN.A00(enumC53153Nf8Arr);
    }

    public static EnumC53153Nf8 valueOf(String str) {
        return (EnumC53153Nf8) Enum.valueOf(EnumC53153Nf8.class, str);
    }

    public static EnumC53153Nf8[] values() {
        return (EnumC53153Nf8[]) A01.clone();
    }

    public EnumC53153Nf8(String str, int i) {
    }
}
