package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.7Cz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC159397Cz {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC159397Cz[] A03;
    public static final EnumC159397Cz A04;
    public static final EnumC159397Cz A05;
    public static final EnumC159397Cz A06;
    public static final EnumC159397Cz A07;
    public final int A00;

    static {
        EnumC159397Cz enumC159397Cz = new EnumC159397Cz("OPEN_ONLY", 0, 0);
        A06 = enumC159397Cz;
        EnumC159397Cz enumC159397Cz2 = new EnumC159397Cz("ARMADILLO_EXPRESS_ONLY", 1, 1);
        A04 = enumC159397Cz2;
        EnumC159397Cz enumC159397Cz3 = new EnumC159397Cz("ARMADILLO_EXPRESS_OPEN_EB", 2, 2);
        A05 = enumC159397Cz3;
        EnumC159397Cz enumC159397Cz4 = new EnumC159397Cz("PROTON", 3, 3);
        A07 = enumC159397Cz4;
        EnumC159397Cz[] enumC159397CzArr = {enumC159397Cz, enumC159397Cz2, enumC159397Cz3, enumC159397Cz4};
        A03 = enumC159397CzArr;
        A02 = AbstractC12190kN.A00(enumC159397CzArr);
        EnumC159397Cz[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (EnumC159397Cz enumC159397Cz5 : values) {
            linkedHashMap.put(Integer.valueOf(enumC159397Cz5.A00), enumC159397Cz5);
        }
        A01 = linkedHashMap;
    }

    public static EnumC159397Cz valueOf(String str) {
        return (EnumC159397Cz) Enum.valueOf(EnumC159397Cz.class, str);
    }

    public static EnumC159397Cz[] values() {
        return (EnumC159397Cz[]) A03.clone();
    }

    public final boolean A01() {
        if (this != A04 && this != A05) {
            return false;
        }
        return true;
    }

    public EnumC159397Cz(String str, int i, int i2) {
        this.A00 = i2;
    }

    public final boolean A00() {
        if (!A01() && this != A07) {
            return false;
        }
        return true;
    }
}
