package X;

import android.content.Context;
import java.util.HashMap;

/* loaded from: classes11.dex */
public abstract class VQA {
    public static Object A00(C6FQ c6fq, C6FW c6fw) {
        String str;
        String str2;
        C102884kP c102884kP = (C102884kP) c6fw.A01();
        HashMap A0H = C6BQ.A0H((HashMap) c6fw.A02());
        if (U5E.A0C(c102884kP)) {
            str = U5E.A07(c102884kP);
        } else {
            str = null;
        }
        Context context = C1LZ.A00().A00;
        if (str != null) {
            if (AbstractC167007dF.A1P(c102884kP.A05, 13784)) {
                str2 = c102884kP.A0L(55);
            } else {
                str2 = null;
            }
            AbstractC191798eb.A01(context, new C191778eZ(C6BQ.A0B(c6fq)), str, str2, A0H);
        }
        return null;
    }
}
