package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.6tV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC152426tV {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC152426tV[] A01;
    public static final EnumC152426tV A02;
    public static final EnumC152426tV A03;

    static {
        EnumC152426tV enumC152426tV = new EnumC152426tV("PROFILE_PICTURE", 0);
        A03 = enumC152426tV;
        EnumC152426tV enumC152426tV2 = new EnumC152426tV("AVATAR", 1);
        A02 = enumC152426tV2;
        EnumC152426tV[] enumC152426tVArr = {enumC152426tV, enumC152426tV2};
        A01 = enumC152426tVArr;
        A00 = AbstractC12190kN.A00(enumC152426tVArr);
    }

    public static EnumC152426tV valueOf(String str) {
        return (EnumC152426tV) Enum.valueOf(EnumC152426tV.class, str);
    }

    public static EnumC152426tV[] values() {
        return (EnumC152426tV[]) A01.clone();
    }

    public EnumC152426tV(String str, int i) {
    }
}
