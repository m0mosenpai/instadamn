package X;

/* renamed from: X.00O, reason: invalid class name */
/* loaded from: classes.dex */
public final class C00O extends RuntimeException {
    public C00O() {
        super("Redex: Unreachable code. This should never get triggered.");
    }

    public static C00O createAndThrow() {
        throw new C00O();
    }
}
