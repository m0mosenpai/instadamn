package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Eoi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33349Eoi {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC33349Eoi[] A01;
    public static final EnumC33349Eoi A02;
    public static final EnumC33349Eoi A03;
    public static final EnumC33349Eoi A04;
    public static final EnumC33349Eoi A05;

    static {
        EnumC33349Eoi enumC33349Eoi = new EnumC33349Eoi("INITIAL_FETCH", 0);
        A04 = enumC33349Eoi;
        EnumC33349Eoi enumC33349Eoi2 = new EnumC33349Eoi("IN_PROGRESS", 1);
        A05 = enumC33349Eoi2;
        EnumC33349Eoi enumC33349Eoi3 = new EnumC33349Eoi("IDLE", 2);
        A03 = enumC33349Eoi3;
        EnumC33349Eoi enumC33349Eoi4 = new EnumC33349Eoi("ERROR", 3);
        A02 = enumC33349Eoi4;
        EnumC33349Eoi[] enumC33349EoiArr = {enumC33349Eoi, enumC33349Eoi2, enumC33349Eoi3, enumC33349Eoi4};
        A01 = enumC33349EoiArr;
        A00 = AbstractC12190kN.A00(enumC33349EoiArr);
    }

    public static EnumC33349Eoi valueOf(String str) {
        return (EnumC33349Eoi) Enum.valueOf(EnumC33349Eoi.class, str);
    }

    public static EnumC33349Eoi[] values() {
        return (EnumC33349Eoi[]) A01.clone();
    }

    public EnumC33349Eoi(String str, int i) {
    }
}
