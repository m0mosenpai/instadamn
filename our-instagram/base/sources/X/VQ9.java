package X;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public abstract class VQ9 {
    public static Object A00(C6FQ c6fq, C6FW c6fw) {
        String str;
        C102884kP c102884kP = (C102884kP) c6fw.A01();
        HashMap A0H = C6BQ.A0H((Map) c6fw.A02());
        if (U5E.A0C(c102884kP)) {
            str = U5E.A07(c102884kP);
        } else {
            str = null;
        }
        Context context = C1LZ.A00().A00;
        if (str != null) {
            AbstractC191798eb.A01(context, new C191778eZ(C6BQ.A0B(c6fq)), str, null, A0H);
        }
        return null;
    }
}
