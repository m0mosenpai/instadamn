package X;

import com.instagram.common.lispy.lang.BloksScript;
import java.util.Map;

/* loaded from: classes11.dex */
public abstract class VSD {
    public static final Object A00(C6FQ c6fq, String str, Map map) {
        String str2;
        Object obj = map.get(str);
        if ((obj instanceof String) && (str2 = (String) obj) != null) {
            Object A00 = C6FY.A00(c6fq, C6FW.A01, new BloksScript(null, str2, c6fq.A0D, -1));
            if (A00 != null) {
                return A00;
            }
        }
        return null;
    }
}
