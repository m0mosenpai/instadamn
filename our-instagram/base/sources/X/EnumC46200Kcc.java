package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Kcc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46200Kcc {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC46200Kcc[] A03;
    public static final EnumC46200Kcc A04;
    public static final EnumC46200Kcc A05;
    public static final EnumC46200Kcc A06;
    public static final EnumC46200Kcc A07;
    public final int A00;

    static {
        EnumC46200Kcc enumC46200Kcc = new EnumC46200Kcc("DEFAULT", 0, 0);
        A04 = enumC46200Kcc;
        EnumC46200Kcc enumC46200Kcc2 = new EnumC46200Kcc("MEDIA", 1, 1);
        A06 = enumC46200Kcc2;
        EnumC46200Kcc enumC46200Kcc3 = new EnumC46200Kcc("THREAD", 2, 2);
        A07 = enumC46200Kcc3;
        EnumC46200Kcc enumC46200Kcc4 = new EnumC46200Kcc("INSTAMADILLO_STAGING", 3, 3);
        A05 = enumC46200Kcc4;
        EnumC46200Kcc[] enumC46200KccArr = {enumC46200Kcc, enumC46200Kcc2, enumC46200Kcc3, enumC46200Kcc4};
        A03 = enumC46200KccArr;
        A02 = AbstractC12190kN.A00(enumC46200KccArr);
        EnumC46200Kcc[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (EnumC46200Kcc enumC46200Kcc5 : values) {
            AbstractC25227BEk.A1O(enumC46200Kcc5, A18, enumC46200Kcc5.A00);
        }
        A01 = A18;
    }

    public static EnumC46200Kcc valueOf(String str) {
        return (EnumC46200Kcc) Enum.valueOf(EnumC46200Kcc.class, str);
    }

    public static EnumC46200Kcc[] values() {
        return (EnumC46200Kcc[]) A03.clone();
    }

    public EnumC46200Kcc(String str, int i, int i2) {
        this.A00 = i2;
    }
}
