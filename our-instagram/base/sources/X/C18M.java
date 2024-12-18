package X;

/* renamed from: X.18M, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C18M {
    public abstract int A00(Object t);

    public abstract boolean A02(Object a, Object b);

    public final boolean A01(Object a, Object b) {
        if (a == b) {
            return true;
        }
        if (a != null && b != null) {
            return A02(a, b);
        }
        return false;
    }
}
