package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Kea, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46304Kea implements MPU {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC46304Kea[] A01;
    public static final EnumC46304Kea A02;

    static {
        EnumC46304Kea enumC46304Kea = new EnumC46304Kea();
        A02 = enumC46304Kea;
        EnumC46304Kea[] enumC46304KeaArr = {enumC46304Kea};
        A01 = enumC46304KeaArr;
        A00 = AbstractC12190kN.A00(enumC46304KeaArr);
    }

    public static EnumC46304Kea valueOf(String str) {
        return (EnumC46304Kea) Enum.valueOf(EnumC46304Kea.class, str);
    }

    public static EnumC46304Kea[] values() {
        return (EnumC46304Kea[]) A01.clone();
    }

    @Override // X.MPU
    public final Integer AfB() {
        return C05F.A00;
    }

    @Override // X.MPU
    public final String getId() {
        return name();
    }
}
