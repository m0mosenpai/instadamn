package X;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* renamed from: X.466, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass466 implements AnonymousClass467, Serializable {
    public static R9U A00(C912845h c912845h, RBL rbl) {
        if (rbl instanceof RBG) {
            Constructor constructor = ((RBG) rbl).A00;
            if (c912845h.A05()) {
                C914045z.A0H(constructor, c912845h.A07());
            }
            return new RAs(constructor);
        }
        Method method = ((RBK) rbl).A01;
        if (c912845h.A05()) {
            C914045z.A0H(method, c912845h.A07());
        }
        return new RAt(method);
    }
}
