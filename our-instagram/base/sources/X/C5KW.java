package X;

import java.io.StringWriter;
import java.util.HashMap;

/* renamed from: X.5KW, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5KW {
    public static final HashMap A00(C0CA c0ca) {
        int i = c0ca.A00;
        HashMap hashMap = new HashMap();
        for (int i2 = 0; i2 < i; i2++) {
            String A0D = c0ca.A0D(i2);
            C14360o3.A07(A0D);
            Object A0C = c0ca.A0C(i2);
            if (A0D.equals("extra") && (A0C instanceof C0CA)) {
                StringWriter stringWriter = new StringWriter();
                C0C2.A00().A04((AbstractC04050Jw) A0C, stringWriter);
                A0C = stringWriter.toString();
            }
            hashMap.put(A0D, A0C);
        }
        return hashMap;
    }
}
