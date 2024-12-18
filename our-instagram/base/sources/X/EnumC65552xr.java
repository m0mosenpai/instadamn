package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.2xr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC65552xr {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC65552xr[] A01;
    public static final EnumC65552xr A02;
    public static final EnumC65552xr A03;
    public static final EnumC65552xr A04;

    static {
        EnumC65552xr enumC65552xr = new EnumC65552xr("VIDEO", 0);
        A04 = enumC65552xr;
        EnumC65552xr enumC65552xr2 = new EnumC65552xr("IMAGE", 1);
        A02 = enumC65552xr2;
        EnumC65552xr enumC65552xr3 = new EnumC65552xr("IMAGE_WITH_MUSIC", 2);
        A03 = enumC65552xr3;
        EnumC65552xr[] enumC65552xrArr = {enumC65552xr, enumC65552xr2, enumC65552xr3};
        A01 = enumC65552xrArr;
        A00 = AbstractC12190kN.A00(enumC65552xrArr);
    }

    public static EnumC65552xr valueOf(String str) {
        return (EnumC65552xr) Enum.valueOf(EnumC65552xr.class, str);
    }

    public static EnumC65552xr[] values() {
        return (EnumC65552xr[]) A01.clone();
    }

    public EnumC65552xr(String str, int i) {
    }
}
