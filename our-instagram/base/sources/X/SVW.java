package X;

import com.facebook.R;
import java.util.Map;

/* loaded from: classes10.dex */
public final class SVW {
    public final Map A00;

    public static int A00(SVW svw, Class cls) {
        Number number;
        int intValue;
        C3AY c3ay = (C3AY) svw.A00.get(cls);
        if (c3ay != null && (number = (Number) c3ay.A00) != null && (intValue = number.intValue()) != 0) {
            return intValue;
        }
        return R.style.FbPayAuthIG4A;
    }

    public SVW(Map map) {
        this.A00 = map;
    }
}
