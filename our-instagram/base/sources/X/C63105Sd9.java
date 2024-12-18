package X;

import java.lang.reflect.Field;

/* renamed from: X.Sd9, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63105Sd9 {
    public static final TIF A00;
    public static final Field[] A01;

    static {
        TIF tif = new TIF();
        A00 = tif;
        A01 = new Field[]{TIF.A00(tif, tif.A01), TIF.A00(tif, tif.A03), TIF.A00(tif, tif.A00), TIF.A00(tif, tif.A02)};
    }

    public static TIF A00(C64516THj c64516THj, C45T c45t) {
        if (c64516THj == null) {
            return A00;
        }
        new C64176T2f(c45t.A01.A07);
        Field[] fieldArr = A01;
        return new TIF(fieldArr[0].getName(), fieldArr[1].getName(), fieldArr[2].getName(), fieldArr[3].getName());
    }
}
