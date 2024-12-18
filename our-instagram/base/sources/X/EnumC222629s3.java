package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.9s3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC222629s3 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC222629s3[] A01;
    public static final EnumC222629s3 A02;
    public static final EnumC222629s3 A03;

    static {
        EnumC222629s3 enumC222629s3 = new EnumC222629s3("KEEP_TOP_IN_VIEWPORT", 0);
        A03 = enumC222629s3;
        EnumC222629s3 enumC222629s32 = new EnumC222629s3("CONDITIONALLY_SCROLL_BOTTOM_INTO_VIEWPORT", 1);
        A02 = enumC222629s32;
        EnumC222629s3[] enumC222629s3Arr = {enumC222629s3, enumC222629s32};
        A01 = enumC222629s3Arr;
        A00 = AbstractC12190kN.A00(enumC222629s3Arr);
    }

    public static EnumC222629s3 valueOf(String str) {
        return (EnumC222629s3) Enum.valueOf(EnumC222629s3.class, str);
    }

    public static EnumC222629s3[] values() {
        return (EnumC222629s3[]) A01.clone();
    }

    public EnumC222629s3(String str, int i) {
    }
}
