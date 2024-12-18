package X;

/* renamed from: X.0SX, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0SX {
    public static volatile C0SW A00;

    /* JADX WARN: Type inference failed for: r1v2, types: [X.0SU, X.0b1, java.lang.Runnable] */
    public static Runnable A00(Runnable runnable, String str, int i) {
        Integer num;
        C0SW c0sw = A00;
        if (c0sw == null || (num = c0sw.CAQ()) == null) {
            num = C05F.A0C;
        }
        if (num != C05F.A0C && runnable != null && !(runnable instanceof C0SU)) {
            ?? c0su = new C0SU(runnable);
            C06600Wq.A03(str);
            C0SJ A02 = C06600Wq.A02(str, i);
            A02.close();
            c0su.A00 = A02;
            return c0su;
        }
        return runnable;
    }
}
