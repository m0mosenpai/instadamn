package X;

/* renamed from: X.6au, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC141776au {
    public static final C53032bk A00 = new Object();

    public static final C141796aw A00(AbstractC52922bZ abstractC52922bZ) {
        C141796aw c141796aw;
        C12W c12w;
        C14360o3.A0B(abstractC52922bZ, 0);
        synchronized (A00) {
            c141796aw = (C141796aw) abstractC52922bZ.getCloseable("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (c141796aw == null) {
                try {
                    C12T c12t = C12P.A00;
                    c12w = AnonymousClass131.A00.A06();
                } catch (C141786av | IllegalStateException unused) {
                    c12w = AnonymousClass191.A00;
                }
                c141796aw = new C141796aw(c12w.plus(new AnonymousClass197(null)));
                abstractC52922bZ.addCloseable("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", c141796aw);
            }
        }
        return c141796aw;
    }
}
