package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.NeJ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53106NeJ {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC53106NeJ[] A01;
    public static final EnumC53106NeJ A02;

    static {
        EnumC53106NeJ enumC53106NeJ = new EnumC53106NeJ("START", 0);
        A02 = enumC53106NeJ;
        EnumC53106NeJ[] enumC53106NeJArr = {enumC53106NeJ, new EnumC53106NeJ("END", 1)};
        A01 = enumC53106NeJArr;
        A00 = AbstractC12190kN.A00(enumC53106NeJArr);
    }

    public static EnumC53106NeJ valueOf(String str) {
        return (EnumC53106NeJ) Enum.valueOf(EnumC53106NeJ.class, str);
    }

    public static EnumC53106NeJ[] values() {
        return (EnumC53106NeJ[]) A01.clone();
    }

    public EnumC53106NeJ(String str, int i) {
    }
}
