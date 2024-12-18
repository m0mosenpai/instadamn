package X;

/* renamed from: X.62O, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C62O {
    /* JADX WARN: Type inference failed for: r2v0, types: [X.62P, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.62P, java.lang.Object] */
    public static final C62P A00(double d) {
        if (d < 0.0d) {
            double sqrt = Math.sqrt(Math.abs(d));
            ?? obj = new Object();
            obj.A01 = 0.0d;
            obj.A00 = sqrt;
            return obj;
        }
        double sqrt2 = Math.sqrt(d);
        ?? obj2 = new Object();
        obj2.A01 = sqrt2;
        obj2.A00 = 0.0d;
        return obj2;
    }
}
