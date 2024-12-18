package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.NfU, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53173NfU {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC53173NfU[] A01;
    public static final EnumC53173NfU A02;
    public static final EnumC53173NfU A03;
    public static final EnumC53173NfU A04;
    public static final EnumC53173NfU A05;
    public static final EnumC53173NfU A06;
    public static final EnumC53173NfU A07;

    static {
        EnumC53173NfU enumC53173NfU = new EnumC53173NfU("UNINITIALIZED", 0);
        A07 = enumC53173NfU;
        EnumC53173NfU enumC53173NfU2 = new EnumC53173NfU("LOADING_INITIAL", 1);
        A05 = enumC53173NfU2;
        EnumC53173NfU enumC53173NfU3 = new EnumC53173NfU("LOADING_MORE", 2);
        A06 = enumC53173NfU3;
        EnumC53173NfU enumC53173NfU4 = new EnumC53173NfU("LOADED", 3);
        A04 = enumC53173NfU4;
        EnumC53173NfU enumC53173NfU5 = new EnumC53173NfU("FAILED", 4);
        A03 = enumC53173NfU5;
        EnumC53173NfU enumC53173NfU6 = new EnumC53173NfU("EMPTY", 5);
        A02 = enumC53173NfU6;
        EnumC53173NfU[] enumC53173NfUArr = {enumC53173NfU, enumC53173NfU2, enumC53173NfU3, enumC53173NfU4, enumC53173NfU5, enumC53173NfU6};
        A01 = enumC53173NfUArr;
        A00 = AbstractC12190kN.A00(enumC53173NfUArr);
    }

    public static EnumC53173NfU valueOf(String str) {
        return (EnumC53173NfU) Enum.valueOf(EnumC53173NfU.class, str);
    }

    public static EnumC53173NfU[] values() {
        return (EnumC53173NfU[]) A01.clone();
    }

    public EnumC53173NfU(String str, int i) {
    }
}
