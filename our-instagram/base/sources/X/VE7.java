package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class VE7 {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ VE7[] A03;
    public static final VE7 A04;
    public static final VE7 A05;
    public static final VE7 A06;
    public static final VE7 A07;
    public static final VE7 A08;
    public static final VE7 A09;
    public static final VE7 A0A;
    public static final VE7 A0B;
    public static final VE7 A0C;
    public static final VE7 A0D;
    public final String A00;

    static {
        VE7 ve7 = new VE7("NO_BUTTON", 0, "no_button");
        A04 = ve7;
        VE7 ve72 = new VE7("ONE_BUTTON_PRIMARY", 1, "one_button_primary");
        A05 = ve72;
        VE7 ve73 = new VE7("ONE_BUTTON_PRIMARY_CONDENSED", 2, "one_button_primary");
        A06 = ve73;
        VE7 ve74 = new VE7("ONE_BUTTON_PRIMARY_INVERSE", 3, "one_button_primary_inverse");
        A07 = ve74;
        VE7 ve75 = new VE7("ONE_BUTTON_SECONDARY", 4, "one_button_secondary");
        A08 = ve75;
        VE7 ve76 = new VE7("TWO_BUTTON_VERTICAL_WITH_PRIMARY_INVERSE", 5, "two_button_vertical_with_primary_inverse");
        A0C = ve76;
        VE7 ve77 = new VE7("TWO_BUTTON_VERTICAL_WITH_SECONDARY", 6, "two_button_vertical_with_secondary");
        A0D = ve77;
        VE7 ve78 = new VE7("TWO_BUTTON_VERTICAL_SECONDARY_WITH_PRIMARY_INVERSE", 7, "two_button_vertical_secondary_with_primary_inverse");
        A0B = ve78;
        VE7 ve79 = new VE7("TWO_BUTTON_HORIZONTAL", 8, "two_button_horizontal");
        A09 = ve79;
        VE7 ve710 = new VE7("TWO_BUTTON_VERTICAL", 9, "two_button_vertical");
        A0A = ve710;
        VE7[] ve7Arr = {ve7, ve72, ve73, ve74, ve75, ve76, ve77, ve78, ve79, ve710, new VE7("THREE_BUTTON", 10, "three_button")};
        A03 = ve7Arr;
        A02 = AbstractC12190kN.A00(ve7Arr);
        VE7[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC167017dG.A01(values.length));
        for (VE7 ve711 : values) {
            linkedHashMap.put(ve711.A00, ve711);
        }
        A01 = linkedHashMap;
    }

    public static VE7 valueOf(String str) {
        return (VE7) Enum.valueOf(VE7.class, str);
    }

    public static VE7[] values() {
        return (VE7[]) A03.clone();
    }

    public VE7(String str, int i, String str2) {
        this.A00 = str2;
    }
}
