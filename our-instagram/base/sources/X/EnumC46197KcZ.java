package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.KcZ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46197KcZ {
    public static final EnumC46197KcZ[] A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC46197KcZ[] A03;
    public static final EnumC46197KcZ A04;
    public static final EnumC46197KcZ A05;
    public static final EnumC46197KcZ A06;
    public static final EnumC46197KcZ A07;
    public final int A00;

    static {
        EnumC46197KcZ enumC46197KcZ = new EnumC46197KcZ("NO_BACKUPS_PRESENT", 0, 2);
        A07 = enumC46197KcZ;
        EnumC46197KcZ enumC46197KcZ2 = new EnumC46197KcZ("DEVICE_ONBOARDED", 1, 3);
        A05 = enumC46197KcZ2;
        EnumC46197KcZ enumC46197KcZ3 = new EnumC46197KcZ("DEVICE_NOT_ONBOARDED", 2, 4);
        A04 = enumC46197KcZ3;
        EnumC46197KcZ enumC46197KcZ4 = new EnumC46197KcZ("FETCH_BACKUP_STATUS_ERROR", 3, -1);
        A06 = enumC46197KcZ4;
        EnumC46197KcZ[] enumC46197KcZArr = {enumC46197KcZ, enumC46197KcZ2, enumC46197KcZ3, enumC46197KcZ4};
        A03 = enumC46197KcZArr;
        A02 = AbstractC12190kN.A00(enumC46197KcZArr);
        A01 = values();
    }

    public static EnumC46197KcZ valueOf(String str) {
        return (EnumC46197KcZ) Enum.valueOf(EnumC46197KcZ.class, str);
    }

    public static EnumC46197KcZ[] values() {
        return (EnumC46197KcZ[]) A03.clone();
    }

    public EnumC46197KcZ(String str, int i, int i2) {
        this.A00 = i2;
    }
}
