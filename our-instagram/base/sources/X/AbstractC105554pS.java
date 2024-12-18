package X;

import android.text.TextUtils;
import java.util.Map;
import java.util.Random;

/* renamed from: X.4pS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC105554pS {
    public final Random A00 = new Random();

    public int A00(String str) {
        C105544pR c105544pR = (C105544pR) this;
        int i = c105544pR.A00;
        if (TextUtils.isEmpty(str) || "empty".equals(str)) {
            str = "MISSING_ENDPOINT_KEY";
        }
        Map map = c105544pR.A01;
        if (map.containsKey(str)) {
            return ((Number) map.get(str)).intValue();
        }
        return i;
    }

    public boolean A01() {
        return true;
    }

    public boolean A02() {
        return true;
    }

    public boolean A03() {
        return true;
    }
}
