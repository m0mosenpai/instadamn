package X;

import com.instagram.common.lispy.lang.BloksScript;
import java.util.Map;

/* renamed from: X.6DS, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6DS {
    public static Object A00(C6FQ c6fq, Map map) {
        if (map.containsKey("initial_lispy")) {
            try {
                return C6FY.A00(c6fq, C6FW.A01, new BloksScript(null, (String) map.get("initial_lispy"), c6fq.A0D, -1));
            } catch (C1338562t e) {
                AbstractC25241Le.A00(null, "StateModule", "Exception gettin initial_lispy value", e);
                return null;
            }
        }
        return map.get("initial");
    }
}
