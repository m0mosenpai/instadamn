package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Rf4, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC61090Rf4 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC61090Rf4[] A01;
    public static final EnumC61090Rf4 A02;

    static {
        EnumC61090Rf4 enumC61090Rf4 = new EnumC61090Rf4("FACEBOOK", 0);
        A02 = enumC61090Rf4;
        EnumC61090Rf4[] enumC61090Rf4Arr = {enumC61090Rf4, new EnumC61090Rf4("INSTAGRAM", 1)};
        A01 = enumC61090Rf4Arr;
        A00 = AbstractC12190kN.A00(enumC61090Rf4Arr);
    }

    public static EnumC61090Rf4 valueOf(String str) {
        return (EnumC61090Rf4) Enum.valueOf(EnumC61090Rf4.class, str);
    }

    public static EnumC61090Rf4[] values() {
        return (EnumC61090Rf4[]) A01.clone();
    }

    public EnumC61090Rf4(String str, int i) {
    }
}
