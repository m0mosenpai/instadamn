package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Nec, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53124Nec {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC53124Nec[] A01;
    public static final EnumC53124Nec A02;
    public static final EnumC53124Nec A03;

    static {
        EnumC53124Nec enumC53124Nec = new EnumC53124Nec("OFF", 0);
        A02 = enumC53124Nec;
        EnumC53124Nec enumC53124Nec2 = new EnumC53124Nec("ON", 1);
        A03 = enumC53124Nec2;
        EnumC53124Nec[] enumC53124NecArr = {enumC53124Nec, enumC53124Nec2};
        A01 = enumC53124NecArr;
        A00 = AbstractC12190kN.A00(enumC53124NecArr);
    }

    public static EnumC53124Nec valueOf(String str) {
        return (EnumC53124Nec) Enum.valueOf(EnumC53124Nec.class, str);
    }

    public static EnumC53124Nec[] values() {
        return (EnumC53124Nec[]) A01.clone();
    }

    public EnumC53124Nec(String str, int i) {
    }
}
