package X;

import java.util.Collections;

/* renamed from: X.0cg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C08780cg {
    public final java.util.Set A00(C0B5 c0b5) {
        C14360o3.A0B(c0b5, 0);
        java.util.Set set = (java.util.Set) C0B8.A0d.get(c0b5);
        if (set == null) {
            java.util.Set singleton = Collections.singleton(C0B8.A01);
            C14360o3.A07(singleton);
            return singleton;
        }
        return set;
    }
}
