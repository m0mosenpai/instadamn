package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.KdI, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46242KdI {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC46242KdI[] A03;
    public static final EnumC46242KdI A04;
    public static final EnumC46242KdI A05;
    public static final EnumC46242KdI A06;
    public final String A00;

    static {
        EnumC46242KdI enumC46242KdI = new EnumC46242KdI("SHH_MODE", 0, "SHH_MODE");
        A05 = enumC46242KdI;
        EnumC46242KdI enumC46242KdI2 = new EnumC46242KdI("DISAPPEARING_MESSAGE", 1, "DISAPPEARING_MESSAGE");
        A04 = enumC46242KdI2;
        EnumC46242KdI enumC46242KdI3 = new EnumC46242KdI("UNRECOGNIZED", 2, "UNSET_OR_UNRECOGNIZED_ENUM_VALUE");
        A06 = enumC46242KdI3;
        EnumC46242KdI[] enumC46242KdIArr = {enumC46242KdI, enumC46242KdI2, enumC46242KdI3};
        A03 = enumC46242KdIArr;
        A02 = AbstractC12190kN.A00(enumC46242KdIArr);
        EnumC46242KdI[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (EnumC46242KdI enumC46242KdI4 : values) {
            A18.put(enumC46242KdI4.A00, enumC46242KdI4);
        }
        A01 = A18;
    }

    public static EnumC46242KdI valueOf(String str) {
        return (EnumC46242KdI) Enum.valueOf(EnumC46242KdI.class, str);
    }

    public static EnumC46242KdI[] values() {
        return (EnumC46242KdI[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public EnumC46242KdI(String str, int i, String str2) {
        this.A00 = str2;
    }
}
