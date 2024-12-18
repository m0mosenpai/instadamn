package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Kc5, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46167Kc5 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC46167Kc5[] A01;
    public static final EnumC46167Kc5 A02;
    public static final EnumC46167Kc5 A03;
    public static final EnumC46167Kc5 A04;
    public static final EnumC46167Kc5 A05;
    public static final EnumC46167Kc5 A06;

    static {
        EnumC46167Kc5 enumC46167Kc5 = new EnumC46167Kc5("NO_BACKUP", 0);
        A06 = enumC46167Kc5;
        EnumC46167Kc5 enumC46167Kc52 = new EnumC46167Kc5("DEVICE_NOT_ON_BOARDED", 1);
        A02 = enumC46167Kc52;
        EnumC46167Kc5 enumC46167Kc53 = new EnumC46167Kc5("DEVICE_ON_BOARDED", 2);
        A03 = enumC46167Kc53;
        EnumC46167Kc5 enumC46167Kc54 = new EnumC46167Kc5("LOADING", 3);
        A05 = enumC46167Kc54;
        EnumC46167Kc5 enumC46167Kc55 = new EnumC46167Kc5("ERROR", 4);
        A04 = enumC46167Kc55;
        EnumC46167Kc5[] enumC46167Kc5Arr = {enumC46167Kc5, enumC46167Kc52, enumC46167Kc53, enumC46167Kc54, enumC46167Kc55};
        A01 = enumC46167Kc5Arr;
        A00 = AbstractC12190kN.A00(enumC46167Kc5Arr);
    }

    public static EnumC46167Kc5 valueOf(String str) {
        return (EnumC46167Kc5) Enum.valueOf(EnumC46167Kc5.class, str);
    }

    public static EnumC46167Kc5[] values() {
        return (EnumC46167Kc5[]) A01.clone();
    }

    public EnumC46167Kc5(String str, int i) {
    }
}
