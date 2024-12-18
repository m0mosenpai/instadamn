package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.9s1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC222609s1 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC222609s1[] A01;
    public static final EnumC222609s1 A02;
    public static final EnumC222609s1 A03;

    static {
        EnumC222609s1 enumC222609s1 = new EnumC222609s1("VIDEO_STICKER_AUDIO", 0);
        A03 = enumC222609s1;
        EnumC222609s1 enumC222609s12 = new EnumC222609s1("CUTOUT_STICKER_AUDIO", 1);
        A02 = enumC222609s12;
        EnumC222609s1[] enumC222609s1Arr = {enumC222609s1, enumC222609s12};
        A01 = enumC222609s1Arr;
        A00 = AbstractC12190kN.A00(enumC222609s1Arr);
    }

    public static EnumC222609s1 valueOf(String str) {
        return (EnumC222609s1) Enum.valueOf(EnumC222609s1.class, str);
    }

    public static EnumC222609s1[] values() {
        return (EnumC222609s1[]) A01.clone();
    }

    public EnumC222609s1(String str, int i) {
    }
}
