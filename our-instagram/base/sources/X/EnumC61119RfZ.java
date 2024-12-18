package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.RfZ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC61119RfZ {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC61119RfZ[] A01;
    public static final EnumC61119RfZ A02;
    public static final EnumC61119RfZ A03;
    public static final EnumC61119RfZ A04;
    public static final EnumC61119RfZ A05;

    static {
        EnumC61119RfZ enumC61119RfZ = new EnumC61119RfZ("EVENT_INPUT_SHOWN", 0);
        A04 = enumC61119RfZ;
        EnumC61119RfZ enumC61119RfZ2 = new EnumC61119RfZ("EVENT_INPUT_HIDDEN", 1);
        A03 = enumC61119RfZ2;
        EnumC61119RfZ enumC61119RfZ3 = new EnumC61119RfZ("EVENT_INPUT_UNAVAILABLE", 2);
        A05 = enumC61119RfZ3;
        EnumC61119RfZ enumC61119RfZ4 = new EnumC61119RfZ("AUTOFILL", 3);
        A02 = enumC61119RfZ4;
        EnumC61119RfZ[] enumC61119RfZArr = {enumC61119RfZ, enumC61119RfZ2, enumC61119RfZ3, enumC61119RfZ4};
        A01 = enumC61119RfZArr;
        A00 = AbstractC12190kN.A00(enumC61119RfZArr);
    }

    public static EnumC61119RfZ valueOf(String str) {
        return (EnumC61119RfZ) Enum.valueOf(EnumC61119RfZ.class, str);
    }

    public static EnumC61119RfZ[] values() {
        return (EnumC61119RfZ[]) A01.clone();
    }

    public EnumC61119RfZ(String str, int i) {
    }
}
