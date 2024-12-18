package X;

import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.RgN, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC61162RgN {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC61162RgN[] A03;
    public static final EnumC61162RgN A04;
    public static final EnumC61162RgN A05;
    public static final EnumC61162RgN A06;
    public static final EnumC61162RgN A07;
    public static final EnumC61162RgN A08;
    public final String A00;

    static {
        EnumC61162RgN enumC61162RgN = new EnumC61162RgN("UNSET_OR_UNRECOGNIZED_ENUM_VALUE", 0, "UNSET_OR_UNRECOGNIZED_ENUM_VALUE");
        A08 = enumC61162RgN;
        EnumC61162RgN enumC61162RgN2 = new EnumC61162RgN("ASPECT_FIT", 1, "ASPECT_FIT");
        A05 = enumC61162RgN2;
        EnumC61162RgN enumC61162RgN3 = new EnumC61162RgN("FULL_SCREEN", 2, "FULL_SCREEN");
        A07 = enumC61162RgN3;
        EnumC61162RgN enumC61162RgN4 = new EnumC61162RgN("ASPECT_FILL", 3, "ASPECT_FILL");
        A04 = enumC61162RgN4;
        EnumC61162RgN enumC61162RgN5 = new EnumC61162RgN("ASPECT_FIT_ONLY", 4, "ASPECT_FIT_ONLY");
        A06 = enumC61162RgN5;
        EnumC61162RgN[] enumC61162RgNArr = {enumC61162RgN, enumC61162RgN2, enumC61162RgN3, enumC61162RgN4, enumC61162RgN5, new EnumC61162RgN("NON_INTERACTIVE", 5, "NON_INTERACTIVE")};
        A03 = enumC61162RgNArr;
        A02 = AbstractC12190kN.A00(enumC61162RgNArr);
        A01 = AbstractC166987dD.A1G();
        for (EnumC61162RgN enumC61162RgN6 : values()) {
            A01.put(enumC61162RgN6.A00, enumC61162RgN6);
        }
    }

    public static EnumC61162RgN valueOf(String str) {
        return (EnumC61162RgN) Enum.valueOf(EnumC61162RgN.class, str);
    }

    public static EnumC61162RgN[] values() {
        return (EnumC61162RgN[]) A03.clone();
    }

    public EnumC61162RgN(String str, int i, String str2) {
        this.A00 = str2;
    }
}
