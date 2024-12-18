package X;

import java.io.Serializable;
import java.lang.reflect.Field;

/* loaded from: classes10.dex */
public final class TIF implements Serializable {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public TIF(String str, String str2, String str3, String str4) {
        this.A01 = str;
        this.A03 = str2;
        this.A00 = str3;
        this.A02 = str4;
    }

    public static Field A00(TIF tif, String str) {
        try {
            return tif.getClass().getField(str);
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    public TIF() {
        this("lowerEndpoint", "upperEndpoint", "lowerBoundType", "upperBoundType");
    }
}
