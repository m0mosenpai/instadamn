package X;

/* loaded from: classes6.dex */
public abstract class F0B {
    public static final void A00(AbstractC115105If abstractC115105If, String str, String str2) {
        AbstractC167017dG.A1P(str2, abstractC115105If);
        String A0u = AnonymousClass001.A0u("[Bloks] ", str, ": ", str2);
        Throwable A01 = abstractC115105If.A01();
        if (A01 != null) {
            C0w9.A05(A0u, "request failed", 1000, A01);
        } else {
            C0w9.A04(A0u, "request failed", 1000);
        }
    }
}
