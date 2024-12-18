package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.HeR, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC39617HeR {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC39617HeR[] A02;
    public static final EnumC39617HeR A03;
    public static final EnumC39617HeR A04;
    public final String A00;

    static {
        EnumC39617HeR enumC39617HeR = new EnumC39617HeR("CATALOG", "product_catalog", 0);
        A04 = enumC39617HeR;
        EnumC39617HeR enumC39617HeR2 = new EnumC39617HeR("BRAND", "merchant", 1);
        A03 = enumC39617HeR2;
        EnumC39617HeR[] enumC39617HeRArr = {enumC39617HeR, enumC39617HeR2};
        A02 = enumC39617HeRArr;
        A01 = AbstractC12190kN.A00(enumC39617HeRArr);
    }

    public static EnumC39617HeR valueOf(String str) {
        return (EnumC39617HeR) Enum.valueOf(EnumC39617HeR.class, str);
    }

    public static EnumC39617HeR[] values() {
        return (EnumC39617HeR[]) A02.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public EnumC39617HeR(String str, String str2, int i) {
        this.A00 = str2;
    }
}
