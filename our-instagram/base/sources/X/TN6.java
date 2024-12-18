package X;

/* loaded from: classes10.dex */
public final class TN6 implements Runnable {
    public final /* synthetic */ R7U A00;
    public final /* synthetic */ String A01;

    public TN6(R7U r7u, String str) {
        this.A00 = r7u;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        R7U r7u = this.A00;
        String str = this.A01;
        String A0R = AnonymousClass001.A0R("javascript: ", str);
        try {
            r7u.evaluateJavascript(str, null);
        } catch (IllegalStateException unused) {
            r7u.loadUrl(A0R);
        }
    }
}
