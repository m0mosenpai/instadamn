package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.HeO, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC39614HeO {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC39614HeO[] A02;
    public static final EnumC39614HeO A03;
    public static final EnumC39614HeO A04;
    public final String A00;

    static {
        EnumC39614HeO enumC39614HeO = new EnumC39614HeO("ORGANIC", 0, "organic");
        A03 = enumC39614HeO;
        EnumC39614HeO enumC39614HeO2 = new EnumC39614HeO("PROMOTION", 1, "promotion");
        A04 = enumC39614HeO2;
        EnumC39614HeO[] enumC39614HeOArr = {enumC39614HeO, enumC39614HeO2};
        A02 = enumC39614HeOArr;
        A01 = AbstractC12190kN.A00(enumC39614HeOArr);
    }

    public static EnumC39614HeO valueOf(String str) {
        return (EnumC39614HeO) Enum.valueOf(EnumC39614HeO.class, str);
    }

    public static EnumC39614HeO[] values() {
        return (EnumC39614HeO[]) A02.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public EnumC39614HeO(String str, int i, String str2) {
        this.A00 = str2;
    }
}
