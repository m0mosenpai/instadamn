package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.NfV, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53174NfV {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC53174NfV[] A01;
    public static final EnumC53174NfV A02;
    public static final EnumC53174NfV A03;
    public static final EnumC53174NfV A04;
    public static final EnumC53174NfV A05;
    public static final EnumC53174NfV A06;
    public static final EnumC53174NfV A07;

    static {
        EnumC53174NfV enumC53174NfV = new EnumC53174NfV("UNAVAILABLE", 0);
        A07 = enumC53174NfV;
        EnumC53174NfV enumC53174NfV2 = new EnumC53174NfV("IDLE", 1);
        A02 = enumC53174NfV2;
        EnumC53174NfV enumC53174NfV3 = new EnumC53174NfV("REQUESTING_PERMISSIONS", 2);
        A05 = enumC53174NfV3;
        EnumC53174NfV enumC53174NfV4 = new EnumC53174NfV("PERMISSION_GRANTED", 3);
        A04 = enumC53174NfV4;
        EnumC53174NfV enumC53174NfV5 = new EnumC53174NfV("PAUSED", 4);
        A03 = enumC53174NfV5;
        EnumC53174NfV enumC53174NfV6 = new EnumC53174NfV("SHARING", 5);
        A06 = enumC53174NfV6;
        EnumC53174NfV[] enumC53174NfVArr = {enumC53174NfV, enumC53174NfV2, enumC53174NfV3, enumC53174NfV4, enumC53174NfV5, enumC53174NfV6};
        A01 = enumC53174NfVArr;
        A00 = AbstractC12190kN.A00(enumC53174NfVArr);
    }

    public static EnumC53174NfV valueOf(String str) {
        return (EnumC53174NfV) Enum.valueOf(EnumC53174NfV.class, str);
    }

    public static EnumC53174NfV[] values() {
        return (EnumC53174NfV[]) A01.clone();
    }

    public EnumC53174NfV(String str, int i) {
    }
}
