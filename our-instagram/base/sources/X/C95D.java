package X;

/* renamed from: X.95D, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C95D {
    public static final C95H A00;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.95G, X.95H] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.95G, X.95H] */
    static {
        C95H c95h = C95E.A0B;
        boolean z = c95h.A00;
        ?? c95g = new C95G(c95h, "privacy_permission_snapshot/");
        c95g.A00 = z;
        ?? c95g2 = new C95G(c95g, "last_lookup_time_seconds");
        c95g2.A00 = z;
        A00 = c95g2;
    }

    public final int A00() {
        try {
            return (int) (System.currentTimeMillis() / 1000);
        } catch (ClassCastException e) {
            C0K8.A0K(AbstractC111324zv.A00(641), "ClassCastException while converting Milliseconds into Seconds", e);
            return 0;
        }
    }
}
