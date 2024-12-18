package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.NeI, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53105NeI {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC53105NeI[] A01;
    public static final EnumC53105NeI A02;

    static {
        EnumC53105NeI enumC53105NeI = new EnumC53105NeI("CLOSE_FRIENDS", 0);
        A02 = enumC53105NeI;
        EnumC53105NeI[] enumC53105NeIArr = {enumC53105NeI, new EnumC53105NeI("FOLLOWERS_ONLY", 1)};
        A01 = enumC53105NeIArr;
        A00 = AbstractC12190kN.A00(enumC53105NeIArr);
    }

    public static EnumC53105NeI valueOf(String str) {
        return (EnumC53105NeI) Enum.valueOf(EnumC53105NeI.class, str);
    }

    public static EnumC53105NeI[] values() {
        return (EnumC53105NeI[]) A01.clone();
    }

    public EnumC53105NeI(String str, int i) {
    }
}
