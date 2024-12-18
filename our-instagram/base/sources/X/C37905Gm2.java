package X;

import java.util.AbstractMap;

/* renamed from: X.Gm2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37905Gm2 {
    public final float A04;
    public final float A05;
    public final int A06;
    public final int A07;
    public Float A01 = null;
    public Float A02 = null;
    public Float A03 = null;
    public Float A00 = null;

    public C37905Gm2(int i, int i2, float f, float f2) {
        this.A06 = i;
        this.A07 = i2;
        this.A04 = f;
        this.A05 = f2;
        if (i > 0 && i2 > 0) {
        } else {
            throw AbstractC166987dD.A12("Dimensions should be greater than 0");
        }
    }

    public static void A00(C37905Gm2 c37905Gm2, Object obj, AbstractMap abstractMap) {
        abstractMap.put("source_of_like", obj);
        float f = c37905Gm2.A04;
        int i = c37905Gm2.A06;
        abstractMap.put("normalized_position_x", String.valueOf(f / i));
        float f2 = c37905Gm2.A05;
        int i2 = c37905Gm2.A07;
        abstractMap.put("normalized_position_y", String.valueOf(f2 / i2));
        abstractMap.put("content_area_dimension_x", String.valueOf(i));
        abstractMap.put("content_area_dimension_y", String.valueOf(i2));
    }
}
