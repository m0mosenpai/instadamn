package X;

import java.util.Arrays;

/* renamed from: X.Rql, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61621Rql {
    public static final String A00(Object obj) {
        String simpleName;
        Class<?> cls = obj.getClass();
        if (cls.isAnonymousClass()) {
            simpleName = cls.getName();
        } else {
            simpleName = cls.getSimpleName();
        }
        return AnonymousClass001.A0T(simpleName, AbstractC166997dE.A0z("%07x", Arrays.copyOf(AbstractC25228BEl.A1Y(System.identityHashCode(obj)), 1)), '@');
    }
}
