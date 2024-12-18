package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.9s9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC222689s9 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC222689s9[] A01;
    public static final EnumC222689s9 A02;
    public static final EnumC222689s9 A03;
    public static final EnumC222689s9 A04;

    static {
        EnumC222689s9 enumC222689s9 = new EnumC222689s9("POST_CAPTURE", 0);
        A03 = enumC222689s9;
        EnumC222689s9 enumC222689s92 = new EnumC222689s9("MID_CAPTURE", 1);
        A02 = enumC222689s92;
        EnumC222689s9 enumC222689s93 = new EnumC222689s9("PRE_CAPTURE", 2);
        A04 = enumC222689s93;
        EnumC222689s9[] enumC222689s9Arr = {enumC222689s9, enumC222689s92, enumC222689s93};
        A01 = enumC222689s9Arr;
        A00 = AbstractC12190kN.A00(enumC222689s9Arr);
    }

    public static EnumC222689s9 valueOf(String str) {
        return (EnumC222689s9) Enum.valueOf(EnumC222689s9.class, str);
    }

    public static EnumC222689s9[] values() {
        return (EnumC222689s9[]) A01.clone();
    }

    public EnumC222689s9(String str, int i) {
    }
}
