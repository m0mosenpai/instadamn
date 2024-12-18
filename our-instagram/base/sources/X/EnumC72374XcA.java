package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.XcA, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class EnumC72374XcA {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC72374XcA[] A02;
    public static final EnumC72374XcA A03;
    public static final EnumC72374XcA A04;
    public static final EnumC72374XcA A05;
    public static final EnumC72374XcA A06;
    public static final EnumC72374XcA A07;
    public static final EnumC72374XcA A08;
    public static final EnumC72374XcA A09;
    public final int A00;

    static {
        EnumC72374XcA enumC72374XcA = new EnumC72374XcA("SUCCESS", 0, 0);
        A08 = enumC72374XcA;
        EnumC72374XcA enumC72374XcA2 = new EnumC72374XcA("STREAM_CLOSED", 1, 1);
        A07 = enumC72374XcA2;
        EnumC72374XcA enumC72374XcA3 = new EnumC72374XcA("INVALID_STREAM_ID", 2, 2);
        A06 = enumC72374XcA3;
        EnumC72374XcA enumC72374XcA4 = new EnumC72374XcA("INVALID_FRAME", 3, 3);
        A05 = enumC72374XcA4;
        EnumC72374XcA enumC72374XcA5 = new EnumC72374XcA("CIPHER_NOT_AVAILABLE", 4, 4);
        A03 = enumC72374XcA5;
        EnumC72374XcA enumC72374XcA6 = new EnumC72374XcA("FRAMING_LOST", 5, 5);
        A04 = enumC72374XcA6;
        EnumC72374XcA enumC72374XcA7 = new EnumC72374XcA("UNSUPPORTED_TYPE", 6, 6);
        A09 = enumC72374XcA7;
        EnumC72374XcA[] enumC72374XcAArr = {enumC72374XcA, enumC72374XcA2, enumC72374XcA3, enumC72374XcA4, enumC72374XcA5, enumC72374XcA6, enumC72374XcA7};
        A02 = enumC72374XcAArr;
        A01 = AbstractC12190kN.A00(enumC72374XcAArr);
    }

    public static EnumC72374XcA valueOf(String str) {
        return (EnumC72374XcA) Enum.valueOf(EnumC72374XcA.class, str);
    }

    public static EnumC72374XcA[] values() {
        return (EnumC72374XcA[]) A02.clone();
    }

    public EnumC72374XcA(String str, int i, int i2) {
        this.A00 = i2;
    }
}
