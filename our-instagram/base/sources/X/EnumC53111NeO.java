package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.NeO, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53111NeO {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC53111NeO[] A01;
    public static final EnumC53111NeO A02;
    public static final EnumC53111NeO A03;

    static {
        EnumC53111NeO enumC53111NeO = new EnumC53111NeO("IS_UNCANCELABLE", 0);
        A03 = enumC53111NeO;
        EnumC53111NeO enumC53111NeO2 = new EnumC53111NeO("BYPASS_SURFACE_DELAY", 1);
        A02 = enumC53111NeO2;
        EnumC53111NeO[] enumC53111NeOArr = {enumC53111NeO, enumC53111NeO2, new EnumC53111NeO("UNKNOWN", 2)};
        A01 = enumC53111NeOArr;
        A00 = AbstractC12190kN.A00(enumC53111NeOArr);
    }

    public static EnumC53111NeO valueOf(String str) {
        return (EnumC53111NeO) Enum.valueOf(EnumC53111NeO.class, str);
    }

    public static EnumC53111NeO[] values() {
        return (EnumC53111NeO[]) A01.clone();
    }

    public EnumC53111NeO(String str, int i) {
    }
}
