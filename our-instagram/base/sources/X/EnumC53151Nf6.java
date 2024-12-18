package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Nf6, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53151Nf6 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC53151Nf6[] A01;
    public static final EnumC53151Nf6 A02;
    public static final EnumC53151Nf6 A03;
    public static final EnumC53151Nf6 A04;
    public static final EnumC53151Nf6 A05;

    static {
        EnumC53151Nf6 enumC53151Nf6 = new EnumC53151Nf6("IDLE", 0);
        A03 = enumC53151Nf6;
        EnumC53151Nf6 enumC53151Nf62 = new EnumC53151Nf6("START", 1);
        A04 = enumC53151Nf62;
        EnumC53151Nf6 enumC53151Nf63 = new EnumC53151Nf6("SUCCESS", 2);
        A05 = enumC53151Nf63;
        EnumC53151Nf6 enumC53151Nf64 = new EnumC53151Nf6("ERROR", 3);
        A02 = enumC53151Nf64;
        EnumC53151Nf6[] enumC53151Nf6Arr = {enumC53151Nf6, enumC53151Nf62, enumC53151Nf63, enumC53151Nf64};
        A01 = enumC53151Nf6Arr;
        A00 = AbstractC12190kN.A00(enumC53151Nf6Arr);
    }

    public static EnumC53151Nf6 valueOf(String str) {
        return (EnumC53151Nf6) Enum.valueOf(EnumC53151Nf6.class, str);
    }

    public static EnumC53151Nf6[] values() {
        return (EnumC53151Nf6[]) A01.clone();
    }

    public EnumC53151Nf6(String str, int i) {
    }
}
