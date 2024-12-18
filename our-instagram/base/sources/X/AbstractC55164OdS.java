package X;

import android.content.Context;
import com.facebook.R;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.OdS, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC55164OdS {
    public static final Map A0A;
    public static final float[] A03 = {1.0f, 1.0f, 1.0f};
    public static final float[] A04 = {0.0f, 0.0f, 0.0f};
    public static final float[] A09 = {1.0f, 1.0f, 0.0f};
    public static final float[] A05 = {1.0f, 0.5f, 0.0f};
    public static final float[] A08 = {1.0f, 0.0f, 0.0f};
    public static final float[] A06 = {1.0f, 0.0f, 1.0f};
    public static final float[] A07 = {0.5f, 0.0f, 1.0f};
    public static final float[] A00 = {0.0f, 0.0f, 1.0f};
    public static final float[] A02 = {0.0f, 1.0f, 1.0f};
    public static final float[] A01 = {0.0f, 1.0f, 0.0f};

    static {
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put(Arrays.toString(A09), EnumC53258Ngw.A0B);
        A1G.put(Arrays.toString(A05), EnumC53258Ngw.A07);
        A1G.put(Arrays.toString(A08), EnumC53258Ngw.A0A);
        A1G.put(Arrays.toString(A06), EnumC53258Ngw.A08);
        A1G.put(Arrays.toString(A07), EnumC53258Ngw.A09);
        A1G.put(Arrays.toString(A00), EnumC53258Ngw.A03);
        A1G.put(Arrays.toString(A02), EnumC53258Ngw.A05);
        A1G.put(Arrays.toString(A01), EnumC53258Ngw.A04);
        A0A = A1G;
    }

    public static int A00(Context context, EnumC53258Ngw enumC53258Ngw, boolean z) {
        AbstractC53946NtJ abstractC53946NtJ = AbstractC53946NtJ.$redex_init_class;
        switch (enumC53258Ngw.ordinal()) {
            case 0:
                return AbstractC53242c7.A0F(context, R.attr.tintPickerNoneColor);
            case 1:
                if (!z) {
                    return -1645705;
                }
                return -3685842;
            case 2:
                if (!z) {
                    return -1655945;
                }
                return -3699922;
            case 3:
                if (!z) {
                    return -1673353;
                }
                return -3723730;
            case 4:
                if (!z) {
                    return -1405768;
                }
                return -3915394;
            case 5:
                if (!z) {
                    return -4818970;
                }
                return -8048953;
            case 6:
                if (!z) {
                    return -8944922;
                }
                return -13747001;
            case 7:
                if (!z) {
                    return -8924442;
                }
                return -13718585;
            case 8:
                if (!z) {
                    return -8919423;
                }
                return -13711556;
            default:
                return -1;
        }
    }

    public static EnumC53258Ngw A01(float[] fArr) {
        if (fArr != null) {
            EnumC53258Ngw enumC53258Ngw = EnumC53258Ngw.A06;
            if (!Arrays.equals(fArr, enumC53258Ngw.A01)) {
                EnumC53258Ngw enumC53258Ngw2 = (EnumC53258Ngw) A0A.get(Arrays.toString(fArr));
                if (enumC53258Ngw2 != null) {
                    return enumC53258Ngw2;
                }
                A03("TintColorUtil_getShadowTintColorFromArray()", fArr);
                return enumC53258Ngw;
            }
        }
        return EnumC53258Ngw.A06;
    }

    public static EnumC53258Ngw A02(float[] fArr) {
        if (fArr != null) {
            EnumC53258Ngw enumC53258Ngw = EnumC53258Ngw.A06;
            if (!Arrays.equals(fArr, enumC53258Ngw.A00)) {
                EnumC53258Ngw enumC53258Ngw2 = (EnumC53258Ngw) A0A.get(Arrays.toString(fArr));
                if (enumC53258Ngw2 != null) {
                    return enumC53258Ngw2;
                }
                A03("TintColorUtil_getTintColorFromArray()", fArr);
                return enumC53258Ngw;
            }
        }
        return EnumC53258Ngw.A06;
    }

    public static void A03(String str, float[] fArr) {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("No TintColor found for array {");
        A1C.append(fArr[0]);
        A1C.append(", ");
        A1C.append(fArr[1]);
        A1C.append(", ");
        A1C.append(fArr[2]);
        AbstractC12120kG.A01(str, AbstractC166997dE.A0x("}", A1C));
    }
}
