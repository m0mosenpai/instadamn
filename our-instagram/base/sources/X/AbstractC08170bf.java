package X;

import android.os.ConditionVariable;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0bf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC08170bf {
    public static final ConditionVariable A00 = new ConditionVariable(true);
    public static final Map A01 = new HashMap();

    public static void A00() {
        String str;
        ConditionVariable conditionVariable = A00;
        boolean block = conditionVariable.block(-1L);
        Object[] objArr = {Integer.valueOf(conditionVariable.hashCode())};
        if (block) {
            str = "Not blocking Provider (%s)";
        } else {
            C0K8.A0P("InitStatus", "Blocking Provider (%s)", objArr);
            conditionVariable.block();
            objArr = new Object[]{Integer.valueOf(conditionVariable.hashCode())};
            str = "Unblocked Provider (%s)";
        }
        C0K8.A0P("InitStatus", str, objArr);
    }
}
