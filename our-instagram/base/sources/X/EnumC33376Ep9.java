package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Ep9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33376Ep9 {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC33376Ep9[] A02;
    public static final EnumC33376Ep9 A03;
    public static final EnumC33376Ep9 A04;
    public final int A00;

    static {
        EnumC33376Ep9 enumC33376Ep9 = new EnumC33376Ep9("NEXT", 0, 0);
        A03 = enumC33376Ep9;
        EnumC33376Ep9 enumC33376Ep92 = new EnumC33376Ep9("SKIP", 1, 1);
        A04 = enumC33376Ep92;
        EnumC33376Ep9[] enumC33376Ep9Arr = {enumC33376Ep9, enumC33376Ep92};
        A02 = enumC33376Ep9Arr;
        A01 = AbstractC12190kN.A00(enumC33376Ep9Arr);
    }

    public static EnumC33376Ep9 valueOf(String str) {
        return (EnumC33376Ep9) Enum.valueOf(EnumC33376Ep9.class, str);
    }

    public static EnumC33376Ep9[] values() {
        return (EnumC33376Ep9[]) A02.clone();
    }

    public EnumC33376Ep9(String str, int i, int i2) {
        this.A00 = i2;
    }
}
