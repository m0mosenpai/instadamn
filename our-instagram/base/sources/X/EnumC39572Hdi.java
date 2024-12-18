package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Hdi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC39572Hdi {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC39572Hdi[] A03;
    public static final EnumC39572Hdi A04;
    public static final EnumC39572Hdi A05;
    public static final EnumC39572Hdi A06;
    public static final EnumC39572Hdi A07;
    public final int A00;

    static {
        EnumC39572Hdi enumC39572Hdi = new EnumC39572Hdi("PRODUCT_DETAILS_PAGE", 0, 0);
        A06 = enumC39572Hdi;
        EnumC39572Hdi enumC39572Hdi2 = new EnumC39572Hdi("ADS_PRODUCT_PAGE", 1, 1);
        A04 = enumC39572Hdi2;
        EnumC39572Hdi enumC39572Hdi3 = new EnumC39572Hdi("IN_APP_BROWSER", 2, 2);
        A05 = enumC39572Hdi3;
        EnumC39572Hdi enumC39572Hdi4 = new EnumC39572Hdi("SHOPLESS_IN_APP_BROWSER", 3, 3);
        A07 = enumC39572Hdi4;
        EnumC39572Hdi[] enumC39572HdiArr = {enumC39572Hdi, enumC39572Hdi2, enumC39572Hdi3, enumC39572Hdi4};
        A03 = enumC39572HdiArr;
        A02 = AbstractC12190kN.A00(enumC39572HdiArr);
        EnumC39572Hdi[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (EnumC39572Hdi enumC39572Hdi5 : values) {
            AbstractC25227BEk.A1O(enumC39572Hdi5, A18, enumC39572Hdi5.A00);
        }
        A01 = A18;
    }

    public static EnumC39572Hdi valueOf(String str) {
        return (EnumC39572Hdi) Enum.valueOf(EnumC39572Hdi.class, str);
    }

    public static EnumC39572Hdi[] values() {
        return (EnumC39572Hdi[]) A03.clone();
    }

    public EnumC39572Hdi(String str, int i, int i2) {
        this.A00 = i2;
    }
}
