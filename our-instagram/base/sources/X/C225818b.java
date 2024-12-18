package X;

import java.util.HashMap;

/* renamed from: X.18b, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C225818b {
    public final C18Z A00() {
        C18Z c18z = C18Z.A04;
        if (c18z == null) {
            synchronized (this) {
                c18z = C18Z.A04;
                if (c18z == null) {
                    HashMap hashMap = new HashMap();
                    String[] strArr = C18Z.A03;
                    int i = 0;
                    do {
                        String str = strArr[i];
                        hashMap.put(str, AbstractC19750y3.A01(str));
                        i++;
                    } while (i < 6);
                    c18z = new C18Z(AbstractC19750y3.A01("mobile_config_context_cache"), hashMap);
                    C18Z.A04 = c18z;
                }
            }
        }
        return c18z;
    }
}
