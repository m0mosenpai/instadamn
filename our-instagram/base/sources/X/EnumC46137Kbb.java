package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Kbb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46137Kbb {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC46137Kbb[] A01;
    public static final EnumC46137Kbb A02;
    public static final EnumC46137Kbb A03;

    static {
        EnumC46137Kbb enumC46137Kbb = new EnumC46137Kbb("DEFAULT", 0);
        A03 = enumC46137Kbb;
        EnumC46137Kbb enumC46137Kbb2 = new EnumC46137Kbb("AVATAR", 1);
        A02 = enumC46137Kbb2;
        EnumC46137Kbb[] enumC46137KbbArr = {enumC46137Kbb, enumC46137Kbb2};
        A01 = enumC46137KbbArr;
        A00 = AbstractC12190kN.A00(enumC46137KbbArr);
    }

    public static EnumC46137Kbb valueOf(String str) {
        return (EnumC46137Kbb) Enum.valueOf(EnumC46137Kbb.class, str);
    }

    public static EnumC46137Kbb[] values() {
        return (EnumC46137Kbb[]) A01.clone();
    }

    public EnumC46137Kbb(String str, int i) {
    }
}
