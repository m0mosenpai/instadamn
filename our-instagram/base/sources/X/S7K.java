package X;

/* loaded from: classes10.dex */
public abstract class S7K {
    public static RW5 A00;

    /* JADX WARN: Type inference failed for: r0v6, types: [X.SKl, X.RW5] */
    public static synchronized C63281Sgg A00(String str) {
        C63281Sgg c63281Sgg;
        synchronized (S7K.class) {
            C60715RNv c60715RNv = new C60715RNv(str);
            RW5 rw5 = A00;
            RW5 rw52 = rw5;
            if (rw5 == null) {
                ?? abstractC62652SKl = new AbstractC62652SKl();
                A00 = abstractC62652SKl;
                rw52 = abstractC62652SKl;
            }
            c63281Sgg = (C63281Sgg) rw52.A00(c60715RNv);
        }
        return c63281Sgg;
    }
}
