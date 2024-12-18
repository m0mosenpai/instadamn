package X;

import java.io.Serializable;

/* renamed from: X.18L, reason: invalid class name */
/* loaded from: classes.dex */
public final class C18L extends C18M implements Serializable {
    public static final C18L A00 = new Object();

    @Override // X.C18M
    public final int A00(Object o) {
        return o.hashCode();
    }

    @Override // X.C18M
    public final boolean A02(Object a, Object b) {
        return a.equals(b);
    }
}
