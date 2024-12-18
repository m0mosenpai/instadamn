package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.KcW, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46194KcW {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC46194KcW[] A02;
    public static final EnumC46194KcW A03;
    public static final EnumC46194KcW A04;
    public static final EnumC46194KcW A05;
    public static final EnumC46194KcW A06;
    public final Number A00;

    static {
        EnumC46194KcW enumC46194KcW = new EnumC46194KcW(0, "MESSENGER_ENCRYPTED_BACKUP", 0);
        A06 = enumC46194KcW;
        EnumC46194KcW enumC46194KcW2 = new EnumC46194KcW(1, "FBLITE_ENCRYPTED_BACKUP", 1);
        A04 = enumC46194KcW2;
        EnumC46194KcW enumC46194KcW3 = new EnumC46194KcW(2, "FBAPP_ENCRYPTED_BACKUP", 2);
        A03 = enumC46194KcW3;
        EnumC46194KcW enumC46194KcW4 = new EnumC46194KcW(3, "IGD_ENCRYPTED_BACKUP", 3);
        A05 = enumC46194KcW4;
        EnumC46194KcW[] enumC46194KcWArr = {enumC46194KcW, enumC46194KcW2, enumC46194KcW3, enumC46194KcW4, new EnumC46194KcW(4, "AR_MESSENGER_ENCRYPTED_BACKUP", 4)};
        A02 = enumC46194KcWArr;
        A01 = AbstractC12190kN.A00(enumC46194KcWArr);
    }

    public static EnumC46194KcW valueOf(String str) {
        return (EnumC46194KcW) Enum.valueOf(EnumC46194KcW.class, str);
    }

    public static EnumC46194KcW[] values() {
        return (EnumC46194KcW[]) A02.clone();
    }

    public EnumC46194KcW(Number number, String str, int i) {
        this.A00 = number;
    }
}
