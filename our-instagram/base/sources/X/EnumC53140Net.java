package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Net, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53140Net {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC53140Net[] A01;
    public static final EnumC53140Net A02;
    public static final EnumC53140Net A03;
    public static final EnumC53140Net A04;

    static {
        EnumC53140Net enumC53140Net = new EnumC53140Net("ALL_SETTINGS", 0);
        A02 = enumC53140Net;
        EnumC53140Net enumC53140Net2 = new EnumC53140Net("AUTO_SAVE_SETTINGS_ONLY", 1);
        A03 = enumC53140Net2;
        EnumC53140Net enumC53140Net3 = new EnumC53140Net("CAMERA_SETTINGS", 2);
        A04 = enumC53140Net3;
        EnumC53140Net[] enumC53140NetArr = {enumC53140Net, enumC53140Net2, enumC53140Net3};
        A01 = enumC53140NetArr;
        A00 = AbstractC12190kN.A00(enumC53140NetArr);
    }

    public static EnumC53140Net valueOf(String str) {
        return (EnumC53140Net) Enum.valueOf(EnumC53140Net.class, str);
    }

    public static EnumC53140Net[] values() {
        return (EnumC53140Net[]) A01.clone();
    }

    public EnumC53140Net(String str, int i) {
    }
}
