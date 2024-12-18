package X;

import com.facebookpay.offsite.models.message.PriceTableAnnotation$Companion;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class VE5 {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ VE5[] A03;
    public static final VE5 A04;
    public static final VE5 A05;
    public static final VE5 A06;
    public static final VE5 A07;
    public static final VE5 A08;
    public static final VE5 A09;
    public static final VE5 A0A;
    public static final VE5 A0B;
    public final String A00;

    static {
        VE5 ve5 = new VE5(PriceTableAnnotation$Companion.SUBTOTAL, 0, PriceTableAnnotation$Companion.SUBTOTAL);
        A09 = ve5;
        VE5 ve52 = new VE5("TAX", 1, PriceTableAnnotation$Companion.ESTIMATED_TAX);
        A0A = ve52;
        VE5 ve53 = new VE5("SHIPPING", 2, "SHIPPING");
        A08 = ve53;
        VE5 ve54 = new VE5("DISCOUNT", 3, PriceTableAnnotation$Companion.OFFER);
        A04 = ve54;
        VE5 ve55 = new VE5("PRE_TAX_DISCOUNT", 4, "PRE_TAX_DISCOUNT");
        A07 = ve55;
        VE5 ve56 = new VE5(PriceTableAnnotation$Companion.FEE, 5, PriceTableAnnotation$Companion.FEE);
        A05 = ve56;
        VE5 ve57 = new VE5(PriceTableAnnotation$Companion.TOTAL, 6, PriceTableAnnotation$Companion.TOTAL);
        A0B = ve57;
        VE5 ve58 = new VE5(PriceTableAnnotation$Companion.FULFILLMENT, 7, PriceTableAnnotation$Companion.FULFILLMENT);
        A06 = ve58;
        VE5[] ve5Arr = {ve5, ve52, ve53, ve54, ve55, ve56, ve57, ve58};
        A03 = ve5Arr;
        A02 = AbstractC12190kN.A00(ve5Arr);
        VE5[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC167017dG.A01(values.length));
        for (VE5 ve59 : values) {
            linkedHashMap.put(ve59.A00, ve59);
        }
        A01 = linkedHashMap;
    }

    public static VE5 valueOf(String str) {
        return (VE5) Enum.valueOf(VE5.class, str);
    }

    public static VE5[] values() {
        return (VE5[]) A03.clone();
    }

    public VE5(String str, int i, String str2) {
        this.A00 = str2;
    }
}
