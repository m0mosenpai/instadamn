package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.9rz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC222589rz {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC222589rz[] A01;
    public static final EnumC222589rz A02;
    public static final EnumC222589rz A03;

    static {
        EnumC222589rz enumC222589rz = new EnumC222589rz("TIME_STAMPS", 0);
        A02 = enumC222589rz;
        EnumC222589rz enumC222589rz2 = new EnumC222589rz("VIDEO_SEGMENTS_USER_DEFINED", 1);
        A03 = enumC222589rz2;
        EnumC222589rz[] enumC222589rzArr = {enumC222589rz, enumC222589rz2, new EnumC222589rz("VIDEO_SEGMENTS_AUTO", 2)};
        A01 = enumC222589rzArr;
        A00 = AbstractC12190kN.A00(enumC222589rzArr);
    }

    public static EnumC222589rz valueOf(String str) {
        return (EnumC222589rz) Enum.valueOf(EnumC222589rz.class, str);
    }

    public static EnumC222589rz[] values() {
        return (EnumC222589rz[]) A01.clone();
    }

    public EnumC222589rz(String str, int i) {
    }
}
