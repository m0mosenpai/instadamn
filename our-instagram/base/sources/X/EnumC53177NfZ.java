package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.NfZ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53177NfZ {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC53177NfZ[] A01;
    public static final EnumC53177NfZ A02;
    public static final EnumC53177NfZ A03;
    public static final EnumC53177NfZ A04;
    public static final EnumC53177NfZ A05;
    public static final EnumC53177NfZ A06;
    public static final EnumC53177NfZ A07;
    public static final EnumC53177NfZ A08;

    static {
        EnumC53177NfZ enumC53177NfZ = new EnumC53177NfZ("UNSET", 0);
        A08 = enumC53177NfZ;
        EnumC53177NfZ enumC53177NfZ2 = new EnumC53177NfZ("ACQUIRE_FAILED", 1);
        A04 = enumC53177NfZ2;
        EnumC53177NfZ enumC53177NfZ3 = new EnumC53177NfZ("ACQUIRE_DELAYED", 2);
        A03 = enumC53177NfZ3;
        EnumC53177NfZ enumC53177NfZ4 = new EnumC53177NfZ("ACQUIRED", 3);
        A02 = enumC53177NfZ4;
        EnumC53177NfZ enumC53177NfZ5 = new EnumC53177NfZ("LOST", 4);
        A05 = enumC53177NfZ5;
        EnumC53177NfZ enumC53177NfZ6 = new EnumC53177NfZ("LOST_TRANSIENT", 5);
        A06 = enumC53177NfZ6;
        EnumC53177NfZ enumC53177NfZ7 = new EnumC53177NfZ("LOST_TRANSIENT_CAN_DUCK", 6);
        A07 = enumC53177NfZ7;
        EnumC53177NfZ[] enumC53177NfZArr = {enumC53177NfZ, enumC53177NfZ2, enumC53177NfZ3, enumC53177NfZ4, enumC53177NfZ5, enumC53177NfZ6, enumC53177NfZ7};
        A01 = enumC53177NfZArr;
        A00 = AbstractC12190kN.A00(enumC53177NfZArr);
    }

    public static EnumC53177NfZ valueOf(String str) {
        return (EnumC53177NfZ) Enum.valueOf(EnumC53177NfZ.class, str);
    }

    public static EnumC53177NfZ[] values() {
        return (EnumC53177NfZ[]) A01.clone();
    }

    public EnumC53177NfZ(String str, int i) {
    }
}
