package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.9sB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC222709sB {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC222709sB[] A01;
    public static final EnumC222709sB A02;
    public static final EnumC222709sB A03;
    public static final EnumC222709sB A04;

    static {
        EnumC222709sB enumC222709sB = new EnumC222709sB("FEED", 0);
        A02 = enumC222709sB;
        EnumC222709sB enumC222709sB2 = new EnumC222709sB("STORY", 1);
        A04 = enumC222709sB2;
        EnumC222709sB enumC222709sB3 = new EnumC222709sB("REELS", 2);
        A03 = enumC222709sB3;
        EnumC222709sB[] enumC222709sBArr = {enumC222709sB, enumC222709sB2, enumC222709sB3};
        A01 = enumC222709sBArr;
        A00 = AbstractC12190kN.A00(enumC222709sBArr);
    }

    public static EnumC222709sB valueOf(String str) {
        return (EnumC222709sB) Enum.valueOf(EnumC222709sB.class, str);
    }

    public static EnumC222709sB[] values() {
        return (EnumC222709sB[]) A01.clone();
    }

    public EnumC222709sB(String str, int i) {
    }
}
